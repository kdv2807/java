package pkgenum;
enum Restaurants 
{dominos, kfc, pizzahut, paninos, burgerking};
public class restaurants {
Restaurants r;

r = Restaurants.paninos;

switch(r) { 

    type name i.e only r, not Restaurants.r

case dominos: 
System.out.println("I AM " + r.dominos);
break;
case kfc:
System.out.println("I AM " + r.kfc);
break;
case pizzahut:
System.out.println("I AM " + r.pizzahut);
break;
case paninos:
System.out.println("I AM " + r.paninos);
break;
case burgerking:
System.out.println("I AM " + r.burgerking);
break;
}
