package org.spongycastle.crypto.params;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* JADX INFO: renamed from: l */
    private final int f10326l;

    /* JADX INFO: renamed from: n */
    private final int f10327n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i, int i2, int i3, SecureRandom secureRandom, int i4) {
        this.f10326l = i;
        this.f10327n = i2;
        this.certainty = i3;
        this.usageIndex = i4;
        this.random = secureRandom;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f10326l;
    }

    public int getN() {
        return this.f10327n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }
}
