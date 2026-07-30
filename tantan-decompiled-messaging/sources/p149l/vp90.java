package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.view.LiveLightView;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ClipRectFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vp90 {
    /* JADX INFO: renamed from: a */
    public static void m199223a(ProfileImagesItemHolder profileImagesItemHolder, View view) {
        profileImagesItemHolder.f34059u = (ParallaxView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileImagesItemHolder.f34060v = (FrameLayout) viewGroup.getChildAt(0);
        profileImagesItemHolder.f34061w = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34062x = (VPager_SquaredRefactor) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34063y = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34064z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f33999A = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34000B = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34001C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        profileImagesItemHolder.f34002D = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        profileImagesItemHolder.f34003E = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        profileImagesItemHolder.f34005F = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        profileImagesItemHolder.f34007G = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        profileImagesItemHolder.f34009H = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        profileImagesItemHolder.f34011I = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        profileImagesItemHolder.f34013J = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        profileImagesItemHolder.f34015K = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        profileImagesItemHolder.f34017L = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        profileImagesItemHolder.f34019M = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(0);
        profileImagesItemHolder.f34021N = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(11);
        profileImagesItemHolder.f34023O = (LiveLightView) view.findViewById(u4c0.f174345l7);
        profileImagesItemHolder.f34025P = (VText) view.findViewById(u4c0.f174430q7);
        profileImagesItemHolder.f34027Q = (VImage) view.findViewById(u4c0.f174328k7);
        profileImagesItemHolder.f34029R = (TextView) view.findViewById(u4c0.f174396o7);
        ViewGroup viewGroup2 = (ViewGroup) view;
        profileImagesItemHolder.f34031S = (FrameLayout) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12);
        profileImagesItemHolder.f34033T = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34035U = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34037V = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34039W = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileImagesItemHolder.f34041X = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34043Y = (SuperLikeComboAnimView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileImagesItemHolder.f34045Z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        profileImagesItemHolder.f34057k0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        profileImagesItemHolder.f34058p0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34004E0 = (VFrame) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13);
        profileImagesItemHolder.f34006F0 = (ClipRectFrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0);
        profileImagesItemHolder.f34008G0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34010H0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34012I0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34014J0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(3);
        profileImagesItemHolder.f34016K0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(4);
        profileImagesItemHolder.f34018L0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(5);
        profileImagesItemHolder.f34020M0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(6);
        profileImagesItemHolder.f34022N0 = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(14);
        profileImagesItemHolder.f34024O0 = (VFrame) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(15);
    }
}
