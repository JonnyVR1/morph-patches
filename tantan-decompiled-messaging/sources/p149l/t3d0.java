package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class t3d0 {
    /* JADX INFO: renamed from: a */
    public static void m187111a(s3d0 s3d0Var, View view) {
        s3d0Var.f162106a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s3d0Var.f162107b = (VNavigationBar) viewGroup.getChildAt(0);
        s3d0Var.f162108c = (RecyclerView) viewGroup.getChildAt(1);
        s3d0Var.f162109d = viewGroup.getChildAt(2);
        s3d0Var.f162110e = viewGroup.getChildAt(3);
        s3d0Var.f162111f = (VButton) viewGroup.getChildAt(4);
        s3d0Var.f162112g = (Group) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m187112b(s3d0 s3d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162779n1, viewGroup, false);
        m187111a(s3d0Var, viewInflate);
        return viewInflate;
    }
}
