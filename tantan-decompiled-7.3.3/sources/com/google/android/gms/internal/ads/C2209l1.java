package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p153l.bqs0;
import p153l.dct0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2209l1 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzckf f10004a;

    public C2209l1(zzckf zzckfVar) {
        this.f10004a = zzckfVar;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.f10004a) {
                    try {
                        zzckf zzckfVar = this.f10004a;
                        if (zzckfVar.f10218G != i) {
                            zzckfVar.f10218G = i;
                            this.f10004a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                dct0.m115299h("Exception occurred while getting webview content height", e);
            }
        }
    }
}
