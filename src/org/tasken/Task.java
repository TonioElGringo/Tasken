/**
 * 
 */
package org.tasken;

/**
 * Simple task. A task can be affected to an {@link Executor}.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public abstract class Task {
	
	protected Executor<? extends Task> executor; 
	
	/**
	 * Complete the task.
	 */
	public abstract void complete();
	
	/**
	 * Assign an {@link Executor} to the task.
	 * @param executor The {@link Executor} to assign.
	 */
	public void assign(Executor<? extends Task> executor) {
		this.executor = executor;
	}
	
	/**
	 * Check if the task is already assigned.
	 * @return <code>true</code> if the task is assigned, <code>false</code> if it is unassigned.
	 */
	public boolean isAssigned() {
		return (this.executor != null);
	}
}
