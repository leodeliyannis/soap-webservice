/*
Classe que publica o webservice CalculadoraServer conforme tutorial em
https://www.devmedia.com.br/desenvolvendo-e-usando-web-services-em-java/37261

### GLOSSÁRIO ###

Endpoint:
    Classe que está disponível na linguagem Java e que nos 
    permite publicar um serviço em um servidor.
    
    Para que possamos usá-la, deve-se passar como parâmetro
    o endereço do servidor e a instância do SIB do serviço
    a ser publicado. Notamos que o serviço, neste caso, é 
    publicado na porta 9876.
*/

package calc;

import javax.xml.ws.Endpoint;

public class CalculadoraServerPublisher{
    public static void main(String args[]){
        Endpoint.publish("http://127.0.0.1:9876/calc",
            new CalculadoraServerImpl());
    }
}
