
/**
 * Write a description of class UnitPriceConverter here.
 *
 * @author (Sebastian Mier Llanos)
 * @version (9/21/2015)
 */
public class UnitPriceConverter
{
  // these are the fields of the program (local variables)
  double priceOfItem;
  double weightInPounds;
  double pricePerpound;
  double pricePerOunce;
  final double ouncesPerPound = 16; // this is the constant  field which never changes value

  public UnitPriceConverter() {

  priceOfItem = weightInPounds = pricePerpound =  pricePerOunce = 0;


}

public UnitPriceConverter( double itemPrice, double itemWpounds)
       {




        weightInPounds = itemWpounds;
        priceOfItem = itemPrice;
        pricePerpound = priceOfItem / weightInPounds;
        pricePerOunce = (priceOfItem / weightInPounds)/ouncesPerPound;

        }// end of constructor method

    public void setPriceOfItem(double itemPrice)
    {

        priceOfItem = itemPrice;
        pricePerpound = priceOfItem / weightInPounds;
        pricePerOunce = (priceOfItem / weightInPounds)/ouncesPerPound;

         }

     public void setWeightInPounds(double itemWpounds)
    {
        weightInPounds = itemWpounds;
        pricePerpound = priceOfItem / weightInPounds;
        pricePerOunce = (priceOfItem / weightInPounds)/ouncesPerPound;

         }

     public double getPriceOfItem()
     {

     return priceOfItem;

    }

      public double getWeightInPounds()
     {

     return weightInPounds;

    }

    public double getpricePerpound()
     {

     return pricePerpound;

    }

    public double getpricePerOunce()
     {

     return pricePerOunce;

    }

}
