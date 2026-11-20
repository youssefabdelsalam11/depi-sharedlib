package edu.depi;

def MavenCommand(COMMAND_OPT){
    sh "mvn ${COMMAND_OPT}"
}