package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class s7h {
    /* JADX INFO: renamed from: a */
    public static void m182485a(r7h r7hVar, View view) {
        r7hVar.f158028a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r7hVar.f158029b = (VNavigationBar) viewGroup.getChildAt(0);
        r7hVar.f158030c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182486b(r7h r7hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142075N0, viewGroup, false);
        m182485a(r7hVar, viewInflate);
        return viewInflate;
    }
}
