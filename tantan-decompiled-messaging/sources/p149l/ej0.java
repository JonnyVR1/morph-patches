package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class ej0 {
    /* JADX INFO: renamed from: a */
    public static void m116748a(dj0 dj0Var, View view) {
        dj0Var.f86458a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dj0Var.f86459b = (VNavigationBar) viewGroup.getChildAt(0);
        dj0Var.f86460c = (TabLayout) viewGroup.getChildAt(1);
        dj0Var.f86461d = (DiscoveryPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m116749b(dj0 dj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142008C, viewGroup, false);
        m116748a(dj0Var, viewInflate);
        return viewInflate;
    }
}
