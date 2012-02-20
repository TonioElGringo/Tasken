/**
 * 
 */
package org.tasken;

import java.util.Set;

/**
 * Represents a list of {@link Task}.
 *
 * @param T Type of tasks to list.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public interface TaskList<T extends Task> extends Set<T> {
	
}
