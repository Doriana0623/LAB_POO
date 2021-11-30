public class box {

    int height;
    int width;
    int depth;

    public box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    public box(int value){
        height = value;
        width = value;
        depth = value;
    }

    public box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double aria(){
        return (2*depth*width + 2*depth*height + 2*height*width);
    }

    double volum(){
        return (height*width*depth);
    }

    public String showResult() {
        return ("\nInaltimea: " + height+"\nLatime: " + width + "\nAdancime: " + depth);
    }

}

