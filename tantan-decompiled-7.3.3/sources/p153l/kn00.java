package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VEditText;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kn00 {
    /* JADX INFO: renamed from: a */
    public static void m150498a(jn00 jn00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jn00Var.f121723a = (VList) viewGroup.getChildAt(0);
        jn00Var.f121724b = (LinearLayout) viewGroup.getChildAt(1);
        jn00Var.f121725c = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        jn00Var.f121726d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        jn00Var.f121727e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m150499b(jn00 jn00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173738q4, viewGroup, false);
        m150498a(jn00Var, viewInflate);
        return viewInflate;
    }
}
