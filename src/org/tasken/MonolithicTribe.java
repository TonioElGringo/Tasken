/**
 * 
 */
package org.tasken;

import java.util.HashSet;

/**
 * A monolithic tribe is a simple communist implementation of {@link Tribe} where each {@link Executor} is equal (in law) to
 * each other.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public class MonolithicTribe<T extends Task> extends HashSet<Executor<T>> implements Tribe<T> {

	private static final long serialVersionUID = 1L;

	private TaskList<? extends T> commonTasks;
	
	public MonolithicTribe(TaskList<? extends T> list) {
		this.commonTasks = list;
	}
	
	@Override
	public boolean add(Executor<T> executor) {
		executor.setTasks(commonTasks);
		return super.add(executor);
	}
}
