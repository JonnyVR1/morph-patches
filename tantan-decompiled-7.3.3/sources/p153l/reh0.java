package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class reh0 {
    /* JADX INFO: renamed from: a */
    public static void m181030a(qeh0 qeh0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qeh0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qeh0Var._sub_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        qeh0Var._btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m181031b(qeh0 qeh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162549f2, viewGroup, false);
        m181030a(qeh0Var, viewInflate);
        return viewInflate;
    }
}
