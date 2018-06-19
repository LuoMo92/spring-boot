package com.luomo;

import com.luomo.web.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception{
		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Test
	public void test() throws Exception{
		RequestBuilder requestBuilder;

		//1.get查一下用户列表
		requestBuilder = get("/user/");
		mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
		//2.post提交一个user
		requestBuilder = post("/user/").param("id","1").param("name","测试").param("age","20");
		mvc.perform(requestBuilder).andExpect(content().string(equalTo("success")));
		//3.get获取user列表
		requestBuilder = get("/user/");
		mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试\",\"age\":20}]")));
		// 4.put修改id为1的user
		requestBuilder = put("/user/1").param("name","管理员").param("age","30");
		mvc.perform(requestBuilder).andExpect(content().string(equalTo("success")));
		//5.get一个id为1的用户
		requestBuilder = get("/user/1");
		mvc.perform(requestBuilder).andExpect(content().string(equalTo("{\"id\":1,\"name\":\"管理员\",\"age\":30}")));
		// 6.del删除id为1的user
		requestBuilder = delete("/user/1");
		mvc.perform(requestBuilder).andExpect(content().string(equalTo("success")));
		//7.get用户列表
		requestBuilder = get("/user/");
		mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
	}

}
