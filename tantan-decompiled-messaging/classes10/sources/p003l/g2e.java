package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g2e {
    /* JADX INFO: renamed from: a */
    public static void m6537a(DiscoveryHomeFrag discoveryHomeFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryHomeFrag.B = viewGroup.getChildAt(0);
        discoveryHomeFrag.C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryHomeFrag.D = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6538b(DiscoveryHomeFrag discoveryHomeFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ad, viewGroup, false);
        m6537a(discoveryHomeFrag, viewInflate);
        return viewInflate;
    }
}
