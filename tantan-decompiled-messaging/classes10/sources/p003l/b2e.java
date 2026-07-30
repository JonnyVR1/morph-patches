package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.discovery.DiscoveryFrag;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b2e {
    /* JADX INFO: renamed from: a */
    public static void m5677a(DiscoveryFrag discoveryFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryFrag.B = (FrameLayout) viewGroup.getChildAt(0);
        discoveryFrag.C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryFrag.D = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        discoveryFrag.E = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        discoveryFrag.F = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        discoveryFrag.G = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        discoveryFrag.H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        discoveryFrag.I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        discoveryFrag.J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5678b(DiscoveryFrag discoveryFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Zc, viewGroup, false);
        m5677a(discoveryFrag, viewInflate);
        return viewInflate;
    }
}
