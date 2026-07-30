package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.discovery.DiscoveryFrag;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p3e {
    /* JADX INFO: renamed from: a */
    public static void m170489a(DiscoveryFrag discoveryFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryFrag.f22086B = (FrameLayout) viewGroup.getChildAt(0);
        discoveryFrag.f22087C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryFrag.f22088D = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        discoveryFrag.f22089E = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        discoveryFrag.f22090F = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        discoveryFrag.f22091G = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        discoveryFrag.f22092H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        discoveryFrag.f22093I = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        discoveryFrag.f22094J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m170490b(DiscoveryFrag discoveryFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125852gd, viewGroup, false);
        m170489a(discoveryFrag, viewInflate);
        return viewInflate;
    }
}
