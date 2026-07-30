package p153l;

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
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.core.p058ui.FloatShadowButton;
import com.p051p1.mobile.putong.core.p058ui.GradientBgWithShadowButton;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.core.p058ui.vip.greet.ProfileSendContainerView;
import p151v.VButton;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class pha0 {
    /* JADX INFO: renamed from: a */
    public static void m172321a(ProfileListFrag profileListFrag, View view) {
        profileListFrag.f34693z = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListFrag.f34459A = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileListFrag.f34464B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileListFrag.f34469C = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        profileListFrag.f34474D = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        profileListFrag.f34479E = (VProgressBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileListFrag.f34485F = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        profileListFrag.f34491G = (VProgressBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileListFrag.f34496H = (ParallaxView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        profileListFrag.f34501I = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2);
        profileListFrag.f34506J = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        profileListFrag.f34511K = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34516L = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f34521M = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFrag.f34526N = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34531O = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f34536P = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFrag.f34541Q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFrag.f34546R = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        profileListFrag.f34551S = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        profileListFrag.f34556T = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFrag.f34561U = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        profileListFrag.f34566V = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        profileListFrag.f34571W = (FloatShadowButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(3);
        profileListFrag.f34576X = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(4);
        profileListFrag.f34581Y = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5);
        profileListFrag.f34586Z = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(0);
        profileListFrag.f34631k0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34652p0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(1);
        profileListFrag.f34480E0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2);
        profileListFrag.f34486F0 = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        profileListFrag.f34492G0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34497H0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFrag.f34502I0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3);
        profileListFrag.f34507J0 = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(1);
        profileListFrag.f34512K0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        profileListFrag.f34517L0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(3);
        profileListFrag.f34522M0 = (GradientBgWithShadowButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        profileListFrag.f34527N0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(4);
        profileListFrag.f34532O0 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(5);
        profileListFrag.f34537P0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(5)).getChildAt(5)).getChildAt(0);
        profileListFrag.f34542Q0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(6);
        profileListFrag.f34547R0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7);
        profileListFrag.f34552S0 = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        profileListFrag.f34557T0 = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(7)).getChildAt(1);
        profileListFrag.f34562U0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(8);
        profileListFrag.f34567V0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9);
        profileListFrag.f34572W0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(0);
        profileListFrag.f34577X0 = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34582Y0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(9)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        profileListFrag.f34587Z0 = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10);
        profileListFrag.f34591a1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10)).getChildAt(0);
        profileListFrag.f34595b1 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(10)).getChildAt(1);
        profileListFrag.f34599c1 = (ProfileSendContainerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(11);
        profileListFrag.f34603d1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(12);
        profileListFrag.f34607e1 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(12)).getChildAt(0);
        profileListFrag.f34611f1 = (SuperLikeComboAnimView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(13);
        profileListFrag.f34615g1 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(14);
        profileListFrag.f34619h1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15);
        profileListFrag.f34623i1 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15)).getChildAt(0);
        profileListFrag.f34627j1 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(15)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34632k1 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16);
        profileListFrag.f34636l1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16)).getChildAt(1);
        profileListFrag.f34640m1 = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(16)).getChildAt(2);
        profileListFrag.f34644n1 = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        profileListFrag.f34648o1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        profileListFrag.f34653p1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        profileListFrag.f34657q1 = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        profileListFrag.f34661r1 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(1);
        profileListFrag.f34665s1 = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(5);
        profileListFrag.f34669t1 = (LinearLayout) viewGroup.getChildAt(1);
        profileListFrag.f34673u1 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m172322b(ProfileListFrag profileListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125650U9, viewGroup, false);
        m172321a(profileListFrag, viewInflate);
        return viewInflate;
    }
}
