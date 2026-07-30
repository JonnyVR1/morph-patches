package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.view.LiveLightView;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ClipRectFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zx90 {
    /* JADX INFO: renamed from: a */
    public static void m221978a(ProfileImagesItemHolder profileImagesItemHolder, View view) {
        profileImagesItemHolder.f34907u = (ParallaxView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileImagesItemHolder.f34908v = (FrameLayout) viewGroup.getChildAt(0);
        profileImagesItemHolder.f34909w = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34910x = (VPager_SquaredRefactor) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34911y = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34912z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34847A = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34848B = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34849C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        profileImagesItemHolder.f34850D = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        profileImagesItemHolder.f34851E = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        profileImagesItemHolder.f34853F = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        profileImagesItemHolder.f34855G = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        profileImagesItemHolder.f34857H = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        profileImagesItemHolder.f34859I = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        profileImagesItemHolder.f34861J = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        profileImagesItemHolder.f34863K = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        profileImagesItemHolder.f34865L = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        profileImagesItemHolder.f34867M = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(0);
        profileImagesItemHolder.f34869N = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(11);
        profileImagesItemHolder.f34871O = (LiveLightView) view.findViewById(adc0.f70470n7);
        profileImagesItemHolder.f34873P = (VText) view.findViewById(adc0.f70555s7);
        profileImagesItemHolder.f34875Q = (VImage) view.findViewById(adc0.f70453m7);
        profileImagesItemHolder.f34877R = (TextView) view.findViewById(adc0.f70521q7);
        ViewGroup viewGroup2 = (ViewGroup) view;
        profileImagesItemHolder.f34879S = (FrameLayout) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12);
        profileImagesItemHolder.f34881T = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34883U = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34885V = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34887W = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileImagesItemHolder.f34889X = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34891Y = (SuperLikeComboAnimView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        profileImagesItemHolder.f34893Z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        profileImagesItemHolder.f34905k0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        profileImagesItemHolder.f34906p0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34852E0 = (VFrame) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13);
        profileImagesItemHolder.f34854F0 = (ClipRectFrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0);
        profileImagesItemHolder.f34856G0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(0);
        profileImagesItemHolder.f34858H0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(1);
        profileImagesItemHolder.f34860I0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(2);
        profileImagesItemHolder.f34862J0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(3);
        profileImagesItemHolder.f34864K0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(4);
        profileImagesItemHolder.f34866L0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(5);
        profileImagesItemHolder.f34868M0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(13)).getChildAt(0)).getChildAt(6);
        profileImagesItemHolder.f34870N0 = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(14);
        profileImagesItemHolder.f34872O0 = (VFrame) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(15);
    }
}
