package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.core.p053ui.FloatShadowButton;
import com.p046p1.mobile.putong.core.p053ui.GradientBgWithShadowButton;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendContainerView;
import p147v.VButton;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class l9a0 {
    /* JADX INFO: renamed from: a */
    public static void m149003a(ProfileListFrag profileListFrag, View view) {
        profileListFrag.f33845z = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListFrag.f33611A = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileListFrag.f33616B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileListFrag.f33621C = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        profileListFrag.f33626D = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        profileListFrag.f33631E = (VProgressBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileListFrag.f33637F = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        profileListFrag.f33643G = (VProgressBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileListFrag.f33648H = (ParallaxView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        profileListFrag.f33653I = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2);
        profileListFrag.f33658J = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        profileListFrag.f33663K = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33668L = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f33673M = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFrag.f33678N = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33683O = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f33688P = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFrag.f33693Q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFrag.f33698R = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        profileListFrag.f33703S = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        profileListFrag.f33708T = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFrag.f33713U = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        profileListFrag.f33718V = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        profileListFrag.f33723W = (FloatShadowButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(3);
        profileListFrag.f33728X = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(4);
        profileListFrag.f33733Y = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5);
        profileListFrag.f33738Z = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(0);
        profileListFrag.f33783k0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33804p0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(1);
        profileListFrag.f33632E0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2);
        profileListFrag.f33638F0 = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        profileListFrag.f33644G0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33649H0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f33654I0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3);
        profileListFrag.f33659J0 = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(1);
        profileListFrag.f33664K0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        profileListFrag.f33669L0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(3);
        profileListFrag.f33674M0 = (GradientBgWithShadowButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        profileListFrag.f33679N0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(4);
        profileListFrag.f33684O0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(5);
        profileListFrag.f33689P0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(5)).getChildAt(0);
        profileListFrag.f33694Q0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(6);
        profileListFrag.f33699R0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7);
        profileListFrag.f33704S0 = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        profileListFrag.f33709T0 = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7)).getChildAt(1);
        profileListFrag.f33714U0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(8);
        profileListFrag.f33719V0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9);
        profileListFrag.f33724W0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(0);
        profileListFrag.f33729X0 = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33734Y0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        profileListFrag.f33739Z0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10);
        profileListFrag.f33743a1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10)).getChildAt(0);
        profileListFrag.f33747b1 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10)).getChildAt(1);
        profileListFrag.f33751c1 = (ProfileSendContainerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(11);
        profileListFrag.f33755d1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(12);
        profileListFrag.f33759e1 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(12)).getChildAt(0);
        profileListFrag.f33763f1 = (SuperLikeComboAnimView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(13);
        profileListFrag.f33767g1 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(14);
        profileListFrag.f33771h1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15);
        profileListFrag.f33775i1 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15)).getChildAt(0);
        profileListFrag.f33779j1 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33784k1 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16);
        profileListFrag.f33788l1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16)).getChildAt(1);
        profileListFrag.f33792m1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16)).getChildAt(2);
        profileListFrag.f33796n1 = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        profileListFrag.f33800o1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        profileListFrag.f33805p1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        profileListFrag.f33809q1 = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        profileListFrag.f33813r1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(1);
        profileListFrag.f33817s1 = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(5);
        profileListFrag.f33821t1 = (LinearLayout) viewGroup.getChildAt(1);
        profileListFrag.f33825u1 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149004b(ProfileListFrag profileListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95484N9, viewGroup, false);
        m149003a(profileListFrag, viewInflate);
        return viewInflate;
    }
}
