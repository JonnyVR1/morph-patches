package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wcn {
    /* JADX INFO: renamed from: a */
    public static void m24501a(vcn vcnVar, View view) {
        vcnVar.f21070L = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m24502b(vcn vcnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19990r1, viewGroup, false);
        m24501a(vcnVar, viewInflate);
        return viewInflate;
    }
}
