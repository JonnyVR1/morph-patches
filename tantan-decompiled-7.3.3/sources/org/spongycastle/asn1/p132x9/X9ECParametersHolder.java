package org.spongycastle.asn1.p132x9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    public abstract X9ECParameters createParameters();

    public synchronized X9ECParameters getParameters() {
        try {
            if (this.params == null) {
                this.params = createParameters();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.params;
    }
}
