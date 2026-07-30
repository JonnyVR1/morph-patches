package org.spongycastle.math.field;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface FiniteField {
    BigInteger getCharacteristic();

    int getDimension();
}
