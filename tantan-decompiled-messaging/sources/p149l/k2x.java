package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class k2x {
    /* JADX INFO: renamed from: a */
    public static void m144353a(j2x j2xVar, View view) {
        j2xVar.f115977f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        j2xVar.f115978g = (VImage) viewGroup.getChildAt(0);
        j2xVar.f115979h = (VText_Bold) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m144354b(j2x j2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95707b7, viewGroup, false);
        m144353a(j2xVar, viewInflate);
        return viewInflate;
    }
}
