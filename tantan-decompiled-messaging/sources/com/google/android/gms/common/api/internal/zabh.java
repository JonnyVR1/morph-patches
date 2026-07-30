package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p149l.hzq0;

/* JADX INFO: loaded from: classes6.dex */
final class zabh extends hzq0 {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabg) message.obj).zab(this.zaa);
        } else if (i == 2) {
            throw ((RuntimeException) message.obj);
        }
    }
}
