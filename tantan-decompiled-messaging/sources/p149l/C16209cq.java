package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.cq */
/* JADX INFO: loaded from: classes10.dex */
public class C16209cq {
    /* JADX INFO: renamed from: a */
    public static void m108208a(C15940bq c15940bq, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c15940bq.f76736a = (VNavigationBar) viewGroup.getChildAt(0);
        c15940bq.f76737b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c15940bq.f76738c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c15940bq.f76739d = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        c15940bq.f76740e = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m108209b(C15940bq c15940bq, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137348e, viewGroup, false);
        m108208a(c15940bq, viewInflate);
        return viewInflate;
    }
}
