cd parser;
rm *.class *.java;

javacc langX++.jj;

cd ..;
javac parser/langX.java;

echo "build finalizado";
