/**
 * 
 */
package org.tasken;

/**
 * Represents an Executor with its skills.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public class SkilledExecutor<T extends Task> extends Executor<T> {

	public SkilledExecutor(TaskList<? extends T> tasks, PickStrategy<T> strategy) {
		super(tasks, strategy);
	}
	
	public SkilledExecutor(PickStrategy<T> strategy) {
		super(strategy);
	}

}
