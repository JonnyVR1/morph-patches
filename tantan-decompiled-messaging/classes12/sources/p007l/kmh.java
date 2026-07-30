package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kmh {
    /* JADX INFO: renamed from: a */
    public static void m11504a(jmh jmhVar, View view) {
        jmhVar.f9398J = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jmhVar.f9400K = viewGroup.getChildAt(0);
        jmhVar.f9402L = (LinearLayout) viewGroup.getChildAt(1);
        jmhVar.f9404M = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jmhVar.f9406N = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jmhVar.f9408O = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        jmhVar.f9410P = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        jmhVar.f9412Q = viewGroup.getChildAt(2);
        jmhVar.f9414R = viewGroup.getChildAt(3);
        jmhVar.f9416S = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        jmhVar.f9418T = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        jmhVar.f9420U = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        jmhVar.f9422V = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        jmhVar.f9424W = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        jmhVar.f9426X = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        jmhVar.f9428Y = (FeedWriterLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(2);
        jmhVar.f9430Z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        jmhVar.f9441k0 = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        jmhVar.f9442p0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        jmhVar.f9393E0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(2);
        jmhVar.f9394F0 = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        jmhVar.f9395G0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(0);
        jmhVar.f9396H0 = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(1);
        jmhVar.f9397I0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        jmhVar.f9399J0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(6);
        jmhVar.f9401K0 = (FeedInteractiveView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(7);
        jmhVar.f9403L0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8);
        jmhVar.f9405M0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8)).getChildAt(0);
        jmhVar.f9407N0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8)).getChildAt(1);
        jmhVar.f9409O0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9);
        jmhVar.f9411P0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9)).getChildAt(0);
        jmhVar.f9413Q0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9)).getChildAt(1);
        jmhVar.f9415R0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10);
        jmhVar.f9417S0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10)).getChildAt(0);
        jmhVar.f9419T0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10)).getChildAt(1);
        jmhVar.f9421U0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(11);
        jmhVar.f9423V0 = (LinearLayout) viewGroup.getChildAt(4);
        jmhVar.f9425W0 = (LinearLayout) viewGroup.getChildAt(4);
        jmhVar.f9427X0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        jmhVar.f9429Y0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        jmhVar.f9431Z0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        jmhVar.f9432a1 = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        jmhVar.f9433b1 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11505b(jmh jmhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11096N2, viewGroup, false);
        m11504a(jmhVar, viewInflate);
        return viewInflate;
    }
}
