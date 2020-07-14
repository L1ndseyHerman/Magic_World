/**
 * Not sure if this Decorator from the Decorator Design Pattern is needed or can be combined with ItemDecorator. Right now, there are 
 * no differences between the two, but eventually there might be.
 * @author linds
 *
 */
public abstract class StatusDecorator extends Person 
{
	  protected Person component;
}
