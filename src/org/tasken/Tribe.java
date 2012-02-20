/**
 * 
 */
package org.tasken;

import java.util.Set;

/**
 * Represents a set of {@link Executor}s sharing the same {@link TaskList}.
 *
 * @author <a href="mailto:antoine.brunet@supaero.fr">Antoine Brunet</a>
 *
 */
public interface Tribe<T extends Task> extends Set<Executor<T>> {

}
