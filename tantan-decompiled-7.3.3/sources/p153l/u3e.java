package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag;
import p151v.VFrame;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class u3e {
    /* JADX INFO: renamed from: a */
    public static void m194360a(DiscoveryHomeFrag discoveryHomeFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryHomeFrag.f22096B = (VFrame) viewGroup.getChildAt(0);
        discoveryHomeFrag.f22097C = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryHomeFrag.f22098D = (VPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194361b(DiscoveryHomeFrag discoveryHomeFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125869hd, viewGroup, false);
        m194360a(discoveryHomeFrag, viewInflate);
        return viewInflate;
    }
}
