package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.bv */
/* JADX INFO: loaded from: classes10.dex */
public class C15978bv {
    /* JADX INFO: renamed from: a */
    public static void m104006a(C15732av c15732av, View view) {
        c15732av.f71875a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c15732av.f71876b = (VNavigationBar) viewGroup.getChildAt(0);
        c15732av.f71877c = (VText) viewGroup.getChildAt(1);
        c15732av.f71878d = (VRecyclerView) viewGroup.getChildAt(2);
        c15732av.f71879e = (VLinear) viewGroup.getChildAt(3);
        c15732av.f71880f = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        c15732av.f71881g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c15732av.f71882h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        c15732av.f71883i = (VButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        c15732av.f71884j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m104007b(C15732av c15732av, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137360k, viewGroup, false);
        m104006a(c15732av, viewInflate);
        return viewInflate;
    }
}
