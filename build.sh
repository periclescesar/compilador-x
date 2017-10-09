cd parser;
rm *.class *.java;

javacc -debug_parser langX++.jj;

cd ..;
javac parser/langX.java;

echo "build finalizado";
