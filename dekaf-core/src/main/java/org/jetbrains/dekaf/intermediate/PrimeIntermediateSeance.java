package org.jetbrains.dekaf.intermediate;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.dekaf.core.ResultLayout;



/**
 * Portable intermediate DB seance.
 *
 * @author Leonid Bushuev from JetBrains
 */
public interface PrimeIntermediateSeance {


  void setInParameters(@NotNull Object[] parameters);

  void execute();

  int getAffectedRowsCount();


  @NotNull
  <R> PrimeIntermediateCursor<R> openCursor(int parameterPosition, @NotNull ResultLayout<R> layout);


  //// CLOSE \\\\

  void close();



}