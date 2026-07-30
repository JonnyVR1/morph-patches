package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.digests.SkeinEngine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.SkeinParameters;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SkeinMac implements Mac {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private SkeinEngine engine;

    public SkeinMac(SkeinMac skeinMac) {
        this.engine = new SkeinEngine(skeinMac.engine);
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return this.engine.doFinal(bArr, i);
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.engine.getBlockSize() * 8) + "-" + (this.engine.getOutputSize() * 8);
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.engine.getOutputSize();
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        SkeinParameters skeinParametersBuild;
        if (cipherParameters instanceof SkeinParameters) {
            skeinParametersBuild = (SkeinParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                ig3.m135964a("Invalid parameter passed to Skein MAC init - ".concat(cipherParameters.getClass().getName()));
                return;
            }
            skeinParametersBuild = new SkeinParameters.Builder().setKey(((KeyParameter) cipherParameters).getKey()).build();
        }
        if (skeinParametersBuild.getKey() != null) {
            this.engine.init(skeinParametersBuild);
        } else {
            ig3.m135964a("Skein MAC requires a key parameter.");
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.engine.reset();
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) {
        this.engine.update(b);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.engine.update(bArr, i, i2);
    }

    public SkeinMac(int i, int i2) {
        this.engine = new SkeinEngine(i, i2);
    }
}
