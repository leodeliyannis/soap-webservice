/*
Implementação da interface CalculadoraServer seguindo o tutorial em
https://www.devmedia.com.br/desenvolvendo-e-usando-web-services-em-java/37261

### GLOSSÁRIO ###

SIB:
    Service Implementation Bean

endpointInterface:
    Faz com que a classe atual, a SIB, ligue-se com a SEI
    especificada anteriormente (calc.CalculadoraServer).

*/

package calc;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {
    public float soma(float num1, float num2){
        return num1 + num2;
    }
    public float subtracao(float num1, float num2){
        return num1 - num2;
    }
    public float multiplicacao(float num1, float num2){
        return num1 * num2;
    }
    public float divisao(float num1, float num2){
        return num1 / num2;
    }
}
