read -p "Enter Your Docker Name: " dockerContainer
winpty docker exec --user root -it $dockerContainer //bin//bash
