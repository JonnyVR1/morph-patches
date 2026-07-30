package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.y0 */
/* JADX INFO: loaded from: classes10.dex */
public class C21269y0 {
    /* JADX INFO: renamed from: a */
    public static void m212022a(C21010x0 c21010x0, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c21010x0._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        c21010x0._al_translate = (VLinear) viewGroup.getChildAt(1);
        c21010x0._al_translate_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m212023b(C21010x0 c21010x0, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95298C, viewGroup, false);
        m212022a(c21010x0, viewInflate);
        return viewInflate;
    }
}
