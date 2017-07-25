package com.nishant.anukram;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * Created by nishant on 7/25/17.
 */
@Immutable
public class Id {

    private final String id;

    public Id(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Id id1 = (Id) o;

        return id != null ? id.equals(id1.id) : id1.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
