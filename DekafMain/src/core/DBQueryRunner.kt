package org.jetbrains.dekaf.core


/**
 * @author Leonid Bushuev
 */
interface DBQueryRunner<S> : ImplementationAccessibleService {

    /**
     * Assigns query parameters.
     * @param params parameters, one for each '?' sign in the query.
     * *
     * @return itself.
     */
    fun withParams(vararg params: Any): DBQueryRunner<S>

    /**
     * Switches to pack mode.
     * In this mode, call to the [.run] methods returns the first pack only.
     * @param rowsPerPack rows per pack.
     * *
     * @return itself.
     * *
     * @see .run
     * @see .nextPack
     */
    fun packBy(rowsPerPack: Int): DBQueryRunner<S>

    /**
     * Performs the query and fetches the resulting cursor and returns the fetched result.
     * @return fetch result.
     */
    fun run(): S

    /**
     * Fetches and returns the next pack if is in the pack mode.
     * @return next pack of the data, or null if all data already fetched.
     * *
     * @see .packBy
     */
    fun nextPack(): S

}