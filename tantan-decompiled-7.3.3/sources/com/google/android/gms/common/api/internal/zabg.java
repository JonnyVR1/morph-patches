package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
abstract class zabg {
    private final zabf zaa;

    public zabg(zabf zabfVar) {
        this.zaa = zabfVar;
    }

    public abstract void zaa();

    public final void zab(zabi zabiVar) {
        zabiVar.zai.lock();
        try {
            if (zabiVar.zan == this.zaa) {
                zaa();
            }
        } finally {
            zabiVar.zai.unlock();
        }
    }
}
