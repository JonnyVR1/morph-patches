package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e4b0 {
    /* JADX INFO: renamed from: a */
    public static void m119392a(d4b0 d4b0Var, View view) {
        d4b0Var.f85022v = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d4b0Var.f85023w = (VImage) viewGroup.getChildAt(0);
        d4b0Var.f85024x = (VText) viewGroup.getChildAt(1);
        d4b0Var.f85025y = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m119393b(d4b0 d4b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125832fa, viewGroup, false);
        m119392a(d4b0Var, viewInflate);
        return viewInflate;
    }
}
