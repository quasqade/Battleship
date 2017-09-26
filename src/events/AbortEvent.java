package events;

import java.util.EventObject;

/**
 * Created by user on 26-Sep-17.
 */
public class AbortEvent extends EventObject
{
/**
 * Constructs a prototypical Event.
 *
 * @param source The object on which the Event initially occurred.
 * @throws IllegalArgumentException if source is null.
 */
public AbortEvent(Object source)
{
	super(source);
}

}
