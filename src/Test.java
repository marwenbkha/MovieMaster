import moviemaster.Film;
import jess.*;


public class Test {
   
    public static void main(String[] args) throws JessException{
        
            Film f= new Film();
            f.setActeur("a");
            f.setAnnee("a");
            f.setContenu("a");
            f.setGenre("a");
            f.setPays("a");
            f.setProducteur("a");
                       
            Rete engine = new Rete();
            engine.batch("movie.clp");
            engine.add(f);
            engine.run();
    }
}
