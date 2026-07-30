package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class w80 {
    /* JADX INFO: renamed from: a */
    public static void m202085a(v80 v80Var, View view) {
        v80Var.f180436a = (RecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m202086b(v80 v80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96086xd, viewGroup, false);
        m202085a(v80Var, viewInflate);
        return viewInflate;
    }
}
