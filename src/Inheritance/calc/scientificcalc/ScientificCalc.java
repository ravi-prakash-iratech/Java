package calc.scientificcalc;
import calc.advcalc.AdvCalc;

public class ScientificCalc extends AdvCalc {
    public double random(){                   //Random
        return Math.random()*10;
    }

    public double floor(double x){            //Floor value
        return Math.floor(x);
    }

    public double ceiling(double x){          //Floor value
        return Math.ceil(x);
    }


    public double power(int x,int y){          //Power
        return Math.pow(x, y);
    }
}