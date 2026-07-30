package com.tencent.open.log;

import android.util.Log;

/* JADX INFO: renamed from: com.tencent.open.log.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14541e extends Tracer {

    /* JADX INFO: renamed from: a */
    public static final C14541e f61148a = new C14541e();

    @Override // com.tencent.open.log.Tracer
    public void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (i == 16) {
            Log.e(str, str2, th);
        } else {
            if (i != 32) {
                return;
            }
            Log.e(str, str2, th);
        }
    }
}
