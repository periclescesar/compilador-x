echo "Declarar uma classe que já existe  dentro do mesmo escopo de classes aninhadas"
java parser.langX -print_tree exemplos/exemplo-com-erros.x

echo
echo "--"

echo "Declarar uma subclasse de uma classe que não existe"
java parser.langX -print_tree exemplos/exemplo-com-erros2.x

echo
echo "--"

echo "Declaração circular de classes e subclasses"
java parser.langX -print_tree exemplos/exemplo-com-erros3.x

echo
echo "--"

echo "Declaração de variáveis e métodos já existentes no mesmo escopo e em escopos diferentes"
java parser.langX -print_tree exemplos/exemplo-com-erros4.x

java parser.langX -print_tree exemplos/exemplo-com-erros4.1.x

echo
echo "--"

echo "Verificação de uso de variáveis. métodos e classes não declaradas"
java parser.langX -print_tree exemplos/exemplo-com-erros5.x

