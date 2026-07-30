package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class q14 {
    /* JADX INFO: renamed from: a */
    public static void m172370a(p14 p14Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p14Var.f146644a = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p14Var.f146645b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        p14Var.f146646c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m172371b(p14 p14Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168103M, viewGroup, false);
        m172370a(p14Var, viewInflate);
        return viewInflate;
    }
}
