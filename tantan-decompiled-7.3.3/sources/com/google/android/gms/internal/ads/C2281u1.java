package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import p153l.jj5;
import p153l.pgw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2281u1 {

    /* JADX INFO: renamed from: a */
    public static int f10108a = 2;

    /* JADX INFO: renamed from: a */
    public static void m13390a(@NonNull Context context) {
        jj5.m145018l(context, new zzfpq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    /* JADX INFO: renamed from: b */
    public static int m13391b() {
        if (pgw0.m172282a() != zzfoj.CTV) {
            return 2;
        }
        return f10108a;
    }
}
