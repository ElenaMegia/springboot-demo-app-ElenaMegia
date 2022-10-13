package demoapp;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class EsParControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnPar() throws Exception{
        this.mockMvc.perform(post("/esPar")
            .param("numero", "62"))
            .andExpect(status().isOk())
            .andExpect(content().string(allOf(containsString("62"))));

    }

    public void shouldReturnImPar() throws Exception{
        this.mockMvc.perform(post("/esPar")
                .param("numero", "13"))
                .andExpect(status().isOk())
                .andExpect(content().string(allOf(containsString("13"))));

    }
}
