package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.d9f;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e9f {
    /* JADX INFO: renamed from: a */
    public static void m6257a(d9f d9fVar, View view) {
        d9fVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d9fVar.v = viewGroup.getChildAt(0);
        d9fVar.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6258b(d9f d9fVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.r2, viewGroup, false);
        m6257a(d9fVar, viewInflate);
        return viewInflate;
    }
}
