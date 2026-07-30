package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class li40 {
    /* JADX INFO: renamed from: a */
    public static void m154295a(ki40 ki40Var, View view) {
        ki40Var.f126961a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ki40Var.f126962b = (VEditText) viewGroup.getChildAt(0);
        ki40Var.f126963c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m154296b(ki40 ki40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157074m2, viewGroup, false);
        m154295a(ki40Var, viewInflate);
        return viewInflate;
    }
}
