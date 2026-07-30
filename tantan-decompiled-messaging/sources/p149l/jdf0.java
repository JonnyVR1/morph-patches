package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
public class jdf0 {
    /* JADX INFO: renamed from: a */
    public static void m141026a(idf0 idf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        idf0Var._list = (VRecyclerView) viewGroup.getChildAt(1);
        idf0Var._btn = (VText_NoTopPadding) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m141027b(idf0 idf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79525w, viewGroup, false);
        m141026a(idf0Var, viewInflate);
        return viewInflate;
    }
}
