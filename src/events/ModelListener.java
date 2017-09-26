package events;

import java.util.EventListener;
import java.util.EventObject;

/**
 * Created by user on 26-Sep-17.
 */
public interface ModelListener extends EventListener
{
	public void eventFired(EventObject ev);
}
