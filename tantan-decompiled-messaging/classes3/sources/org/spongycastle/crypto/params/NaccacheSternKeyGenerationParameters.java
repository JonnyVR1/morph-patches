package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import l.ig3;
import org.spongycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
        super(secureRandom, i);
        this.debug = false;
        this.certainty = i2;
        if (i3 % 2 == 1) {
            ig3.a("cntSmallPrimes must be a multiple of 2");
            throw null;
        }
        if (i3 < 30) {
            ig3.a("cntSmallPrimes must be >= 30 for security reasons");
            throw null;
        }
        this.cntSmallPrimes = i3;
        this.debug = z;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getCntSmallPrimes() {
        return this.cntSmallPrimes;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i, int i2, int i3) {
        this(secureRandom, i, i2, i3, false);
    }
}
