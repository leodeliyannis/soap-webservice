/*
WebService exemplo implementado seguindo o tutorial em: 
https://www.devmedia.com.br/desenvolvendo-e-usando-web-services-em-java/37261

### GLOSSÁRIO ###

SEI: 
    Service Endpoint Interface

@WebService: 
    Anotação que avisa ao compilador Java que o arquivo 
    atual corresponde à definição SEI de um serviço Web.
    
@WebMethod:
   Indica que um determinado método corresponde a uma 
   operação de serviço e assim pode ser invocado por um
   cliente.

@SOAPBinding:
    Indica que o serviço utilizará a abordagem SOAP, e 
    não REST, que é a outra abordagem suportada.
*/

package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer{
    @WebMethod float soma(float num1, float num2);
    @WebMethod float subtracao(float num1, float num2);
    @WebMethod float multiplicacao(float num1, float num2);
    @WebMethod float divisao(float num1, float num2);
}
