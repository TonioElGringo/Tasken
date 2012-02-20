/**
 * 
 */
package org.tasken;

/**
 * Choose between multiple {@link Task}s the next one to be executed.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public abstract class PickStrategy<T extends Task> {
	
	/**
	 * Pick a {@link Task} from a {@link TaskList}.
	 * @param list The {@link TaskList} representing available tasks.
	 * @return The chosen {@link Task}.
	 */
	public abstract Task pick(TaskList<? extends T> list);
	
}
