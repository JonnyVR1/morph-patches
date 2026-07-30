package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import p149l.ii5;
import p149l.j7w0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2258u1 {

    /* JADX INFO: renamed from: a */
    public static int f10071a = 2;

    /* JADX INFO: renamed from: a */
    public static void m13336a(@NonNull Context context) {
        ii5.m136342l(context, new zzfpq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    /* JADX INFO: renamed from: b */
    public static int m13337b() {
        if (j7w0.m140120a() != zzfoj.CTV) {
            return 2;
        }
        return f10071a;
    }
}
