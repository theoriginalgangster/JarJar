mv Manifest.mf lib src
cd src
javac -cp .:lib/commons-io-2.4.jar:lib/commons-lang3-3.0.1.jar -d ../build com/fail/Main.java
mv Manifest.mf lib ../build
cd ../build
jar cvfm service.jar Manifest.mf com lib
mv Manifest.mf lib service.jar ..
cd ..
