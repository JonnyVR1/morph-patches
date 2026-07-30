package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p149l.vgs0;
import p149l.x2t0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2186l1 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzckf f9967a;

    public C2186l1(zzckf zzckfVar) {
        this.f9967a = zzckfVar;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.f9967a) {
                    try {
                        zzckf zzckfVar = this.f9967a;
                        if (zzckfVar.f10181G != i) {
                            zzckfVar.f10181G = i;
                            this.f9967a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                x2t0.m206870h("Exception occurred while getting webview content height", e);
            }
        }
    }
}
