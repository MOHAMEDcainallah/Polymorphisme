package ma.education.tp1.heritageMaths;

public class Form {

    double surface;

    public static double afficherSurface(Form f){
        if(f instanceof Triangle){
            Triangle t = (Triangle) f;
            return t.hauteur*t.base/2;
        } else if (f instanceof Cercle) {
            Cercle c = (Cercle) f;
            return c.rayon*c.rayon*Math.PI;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.hauteur = 2.4;
        t1.base = 3.4;
        System.out.println(afficherSurface(t1));
        Cercle c1 = new Cercle();
        c1.rayon = 4;
        System.out.println(afficherSurface(c1));

    }
}
