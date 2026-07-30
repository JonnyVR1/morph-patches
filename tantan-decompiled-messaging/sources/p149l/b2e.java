package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.discovery.DiscoveryFrag;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b2e {
    /* JADX INFO: renamed from: a */
    public static void m99961a(DiscoveryFrag discoveryFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        discoveryFrag.f21344B = (FrameLayout) viewGroup.getChildAt(0);
        discoveryFrag.f21345C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        discoveryFrag.f21346D = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        discoveryFrag.f21347E = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        discoveryFrag.f21348F = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        discoveryFrag.f21349G = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        discoveryFrag.f21350H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        discoveryFrag.f21351I = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        discoveryFrag.f21352J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99962b(DiscoveryFrag discoveryFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95679Zc, viewGroup, false);
        m99961a(discoveryFrag, viewInflate);
        return viewInflate;
    }
}
