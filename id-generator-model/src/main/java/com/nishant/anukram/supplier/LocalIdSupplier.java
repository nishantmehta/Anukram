package com.nishant.anukram.supplier;

import com.nishant.anukram.Id;

import java.util.UUID;

/**
 * Created by nishant on 7/25/17.
 */
public class LocalIdSupplier implements IdSupplier {
    @Override
    public Id getNextId() {
        UUID uuid = UUID.randomUUID();
        return new Id(uuid.toString());
    }
}
