package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p149l.hzq0;

/* JADX INFO: loaded from: classes6.dex */
final class zabc extends hzq0 {
    final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zabe.zaj(this.zaa);
        } else {
            if (i != 2) {
                return;
            }
            zabe.zai(this.zaa);
        }
    }
}
