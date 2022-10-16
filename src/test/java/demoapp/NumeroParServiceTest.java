package demoapp;

import demoapp.service.NumeroParService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class NumeroParServiceTest {

    @Autowired
    NumeroParService numeroParService;

    @Test
    public void ComprobarNumero() throws Exception{
        assertThat(numeroParService.esPar(10)).isTrue();
        assertThat(numeroParService.esPar(55)).isFalse();
    }

    @Test
    public void serviceNumeroPar() throws Exception{
        assertThat(numeroParService.esPar(8)).isTrue();
    }
}
