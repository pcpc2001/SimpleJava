### Make file to create jar file
BIN=./bin
CLASSES=./classes
JAVA_SRC_DIR=./src
JAVA_SRC=$(shell find $(JAVA_SRC_DIR) -name '*.java')
JAR=SimpleJava.jar

all:
	mkdir -p $(BIN)
	mkdir -p $(CLASSES)
	javac -d $(CLASSES) -sourcepath $(JAVA_SRC_DIR) $(JAVA_SRC)
	jar cfm $(BIN)/$(JAR) Manifest.txt -C $(CLASSES) .

clean:
	rm -rf $(BIN)/*
	rm -rf $(CLASSES)/*