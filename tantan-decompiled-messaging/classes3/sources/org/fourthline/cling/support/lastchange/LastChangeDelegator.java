package org.fourthline.cling.support.lastchange;

import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface LastChangeDelegator {
    void appendCurrentState(LastChange lastChange, UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws Exception;

    UnsignedIntegerFourBytes[] getCurrentInstanceIds();

    LastChange getLastChange();
}
