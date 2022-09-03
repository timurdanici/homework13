public class Animal {
    String type;

    Animal(String type){
        if (type == "Predator" || type == "NotPredator"){
            this.type = type;
        }
    }
}
