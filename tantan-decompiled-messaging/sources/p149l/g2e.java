package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag;
import p147v.VFrame;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class g2e {
    /* JADX INFO: renamed from: a */
    public static void m124150a(DiscoveryHomeFrag discoveryHomeFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryHomeFrag.f21354B = (VFrame) viewGroup.getChildAt(0);
        discoveryHomeFrag.f21355C = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryHomeFrag.f21356D = (VPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124151b(DiscoveryHomeFrag discoveryHomeFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95696ad, viewGroup, false);
        m124150a(discoveryHomeFrag, viewInflate);
        return viewInflate;
    }
}
