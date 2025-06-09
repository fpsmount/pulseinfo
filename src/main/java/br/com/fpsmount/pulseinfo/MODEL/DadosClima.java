package br.com.fpsmount.pulseinfo.MODEL;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosClima(@JsonAlias("lon") String longitude,
                         @JsonAlias("lat") String latitudo){
}
