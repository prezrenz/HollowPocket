set shell := ["powershell.exe", "-c"]

all: compile run

compile:
    mvn package

run:
    ./run.bat
