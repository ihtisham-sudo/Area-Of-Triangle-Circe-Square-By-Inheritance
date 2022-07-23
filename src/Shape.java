class Shape {
    // Defining Attributes for Class
    double height;
    float radius;
    int side;

    public Shape(double height) // Constructor for child class Triangle
    {
        this.height = height;

    }
    public Shape(float radius) // Constructor for child class Circle
    {
        this.radius = radius;

    }
    public Shape(int side) // Constructor for child class Square
    {
        this.side = side;

    }

    public String toString() // Using String for getting Output results
    {
        return ("Height is = " + height + "\n"); // returning height as Super string
    }
}
class Triangle extends Shape //Extended Child Class Triangle
{
    double base;  // Defining base attribute as child's attribute
    public Triangle(double height, double base) //Child class triangle has one more constructor(base)
    {
        super(height); //using height attribute from Super Class (Shape)
        this.base = base;
    }

    @Override
    public String toString() //Overriding Super String to add child class' triangle string
    {
        return (super.toString() + "Base is = " + base + "\n" + "Area of Triangle is = " + (base * height)/2);
    }
}
class Circle extends Shape // Extended Child Class Named Circle
{
    double pi; // Defining Child Class own attribute (pi)
    public Circle(float radius, double pi)  //Child class circle has one Constructor
    {
        super(radius); // Getting radius from super class (Shape)
        this.pi = pi;
    }

    @Override
    public String toString() //Overriding Super String to add child class' Circle string
    {
        return ("Radius is = " + radius + "\n" + "PI is = " + pi + "\n" + "Area of Circle is = " + pi * radius * radius);
    }
}
class Square extends Shape //Extended Child Class Named Square
{

    public Square(int side) //Constructor using from super class (side)
    {
        super(side);
    }

    @Override
    public String toString() //Overriding Super String to add child class' Square string
    {
        return ("Side is = " + side + "\n" + "Area of Square is = " + side * side);
    }
}