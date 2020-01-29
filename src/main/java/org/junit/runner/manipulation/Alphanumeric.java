package org.junit.runner.manipulation;

import java.util.Comparator;

import org.junit.runner.Description;

/**
 * A sorter that orders tests alphanumerically by test name.
 *
 * @since 4.13
 */
public final class Alphanumeric extends Sorter implements Ordering.Factory {

    public Alphanumeric() {
        super(COMPARATOR);
    }

    public Ordering create(Context context) {
        return this;
    }

    private static final Comparator<Description> COMPARATOR = (o1, o2) -> o1.getDisplayName().compareTo(o2.getDisplayName());
}
