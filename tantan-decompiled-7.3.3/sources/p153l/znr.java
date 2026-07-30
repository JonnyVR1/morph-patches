package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VList;

/* JADX INFO: loaded from: classes13.dex */
public class znr {
    /* JADX INFO: renamed from: a */
    public static void m220610a(ynr ynrVar, View view) {
        ynrVar.f200912c = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m220611b(ynr ynrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173488D4, viewGroup, false);
        m220610a(ynrVar, viewInflate);
        return viewInflate;
    }
}
