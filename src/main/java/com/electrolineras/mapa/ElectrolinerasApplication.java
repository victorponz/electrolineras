package com.electrolineras.mapa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectrolinerasApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ElectrolinerasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*        Iterable<Pokemon> a = this.pokemonRepository.findAll();
        for( Pokemon p : a){
            for (Tipo t : p.getTypes()){
                System.out.println(t.getName());
            }
        }*/
    }
}
