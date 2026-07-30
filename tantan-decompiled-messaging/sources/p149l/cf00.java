package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public class cf00 {
    /* JADX INFO: renamed from: a */
    public static void m106474a(ze00 ze00Var, View view) {
        ze00Var.f202757a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m106475b(ze00 ze00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142228k5, viewGroup, false);
        m106474a(ze00Var, viewInflate);
        return viewInflate;
    }
}
