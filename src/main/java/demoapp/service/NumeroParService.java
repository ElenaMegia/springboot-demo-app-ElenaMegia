package demoapp.service;


import org.springframework.stereotype.Service;

@Service
public class NumeroParService {

    public boolean esPar(int numero) {
        boolean par;
        if (numero % 2 == 0){ par=true;
         }else{ par=false;        }

        return par;
    }
}
