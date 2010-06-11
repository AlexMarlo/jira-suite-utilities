package com.googlecode.jsu.helpers.checkers;

/**
 * @author <A href="mailto:abashev at gmail dot com">Alexey Abashev</A>
 * @version $Id$
 */
public class CheckerNumberE extends AbstractNumberChecker {
	/* (non-Javadoc)
	 * @see com.googlecode.jsu.helpers.checkers.AbstractNumberChecker#checkNumbers()
	 */
	@Override
	protected boolean checkNumbers(Double double1, Double double2) {
		if (double1 == null) {
			return (double2 == null);
		}
		
		return (double1.compareTo(double2) == 0);
	}
}
