package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VCheckCircle;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class c3y {
    /* JADX INFO: renamed from: a */
    public static void m107813a(b3y b3yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b3yVar.f74828a = (VPager) viewGroup.getChildAt(0);
        b3yVar.f74829b = (VCheckCircle) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107814b(b3y b3yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125802de, viewGroup, false);
        m107813a(b3yVar, viewInflate);
        return viewInflate;
    }
}
