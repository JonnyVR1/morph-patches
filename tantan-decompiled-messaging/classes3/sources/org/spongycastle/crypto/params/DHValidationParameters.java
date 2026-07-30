package org.spongycastle.crypto.params;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHValidationParameters {
    private int counter;
    private byte[] seed;

    public DHValidationParameters(byte[] bArr, int i) {
        this.seed = bArr;
        this.counter = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHValidationParameters)) {
            return false;
        }
        DHValidationParameters dHValidationParameters = (DHValidationParameters) obj;
        if (dHValidationParameters.counter != this.counter) {
            return false;
        }
        return Arrays.areEqual(this.seed, dHValidationParameters.seed);
    }

    public int getCounter() {
        return this.counter;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return Arrays.hashCode(this.seed) ^ this.counter;
    }
}
