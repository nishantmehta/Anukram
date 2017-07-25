package com.nishant.anukram.supplier;

import com.nishant.anukram.Id;
import sun.security.provider.SHA;

/**
 * Created by nishant on 7/25/17.
 */
public class FixedIdSupplier implements IdSupplier {

    @Override
    public Id getNextId() {
        return new Id("067e6162-3b6f-4ae2-a171-2470b63dff00");
    }
}
