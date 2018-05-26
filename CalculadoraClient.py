# -*- coding: utf-8 -*-
# Cliente simples em Python 3 usando Zeep para consumir o webservice

from zeep import Client

def main():
    client = Client('http://127.0.0.1:9876/calc?wsdl')
    print("Soma (5+1):", client.service.soma(5, 1))
    print("Subtracao (5+1):", client.service.subtracao(5, 1))
    print("Multiplicacao (5+1):", client.service.multiplicacao(5, 1))
    print("Divisao (5+1):", client.service.divisao(5, 1))
    
if __name__ == '__main__':
    main()
