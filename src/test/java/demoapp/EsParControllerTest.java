package demoapp;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
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
            .param("numero", "10"))
            .andExpect(status().isOk())
            .andExpect(content().string(allOf(containsString("10"),containsString("green"))));

    }

    @Test
    public void shouldReturnImPar() throws Exception{
        this.mockMvc.perform(post("/esPar")
                .param("numero", "55"))
                .andExpect(status().isOk())
                .andExpect(content().string(allOf(containsString("55"),containsString("red"))));

    }
}
