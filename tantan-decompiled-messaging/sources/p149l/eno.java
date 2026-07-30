package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.greet.p052ui.ImDiscoveryPager;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class eno {
    /* JADX INFO: renamed from: a */
    public static void m117285a(cno cnoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cnoVar.f81671d = (VNavigationBar) viewGroup.getChildAt(0);
        cnoVar.f81672e = (TabLayout) viewGroup.getChildAt(1);
        cnoVar.f81673f = (ImDiscoveryPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117286b(cno cnoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126408W0, viewGroup, false);
        m117285a(cnoVar, viewInflate);
        return viewInflate;
    }
}
