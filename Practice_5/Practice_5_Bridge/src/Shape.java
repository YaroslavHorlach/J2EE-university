public abstract class Shape {
    protected DrawingAPI drawingAPI;
    public abstract void draw();
    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }
}
