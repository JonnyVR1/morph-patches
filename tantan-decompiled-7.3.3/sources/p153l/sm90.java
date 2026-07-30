package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class sm90 {
    /* JADX INFO: renamed from: a */
    public static void m186781a(rm90 rm90Var, View view) {
        rm90Var.f163835u = (FrameLayout) view;
        rm90Var.f163836v = (FrameLayout) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m186782b(rm90 rm90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126034r9, viewGroup, false);
        m186781a(rm90Var, viewInflate);
        return viewInflate;
    }
}
