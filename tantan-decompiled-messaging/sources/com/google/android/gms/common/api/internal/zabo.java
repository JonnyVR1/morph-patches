package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zabo implements Runnable {
    final /* synthetic */ zabp zaa;

    public zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq zabqVar = this.zaa.zaa;
        zabqVar.zac.disconnect(zabqVar.zac.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
