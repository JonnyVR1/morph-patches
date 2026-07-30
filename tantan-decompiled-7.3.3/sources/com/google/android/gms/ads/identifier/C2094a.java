package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
import p153l.g6t0;

/* JADX INFO: renamed from: com.google.android.gms.ads.identifier.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2094a extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f9692a;

    public C2094a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f9692a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f9692a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        g6t0.m129268a(builderBuildUpon.build().toString());
    }
}
