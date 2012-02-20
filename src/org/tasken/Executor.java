/**
 * 
 */
package org.tasken;

/**
 * Simple task executor. Can pick a {@link Task} to execute from a list using a {@link PickStrategy}.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public class Executor<T extends Task> {

	private TaskList<? extends T> tasks;
	private PickStrategy<T> strategy;
	
	/**
	 * Creates an executer with the designated {@link TaskList} and {@link PickStrategy}.
	 * @param tasks The TaskList to use.
	 * @param strategy The PickStrategy to use.
	 */
	public Executor(TaskList<? extends T> tasks, PickStrategy<T> strategy) {
		this.tasks = tasks;
		this.strategy = strategy;
	}
	
	/**
	 * Creates an executer with no {@link TaskList} associated and a given {@link PickStrategy}.
	 * @param strategy The PickStrategy to use.
	 */
	public Executor(PickStrategy<T> strategy) {
		this.tasks = null;
		this.strategy = strategy;
	}
	
	/**
	 * Change the followed {@link TaskList}.
	 * @param tasks The new associated {@link TaskList}.
	 */
	public void setTasks(TaskList<? extends T> tasks) {
		this.tasks = tasks;
	}
	
	/**
	 * Pick a {@link Task} using the current strategy, and assign it to the current executer.
	 * @return The Task picked, or <code>null</code> if the task list is empty.
	 */
	public Task pickTask() {
		if(tasks != null) {
			return this.strategy.pick(tasks);
		}
		return null;
	}
}
