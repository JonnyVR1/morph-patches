package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageMomentNewView;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateFourView;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateNewView;
import com.p051p1.mobile.putong.core.p058ui.greet.head.UserGreetHeadView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oek0 {
    /* JADX INFO: renamed from: a */
    public static void m167369a(UserGreetHeadView userGreetHeadView, View view) {
        userGreetHeadView.f30321c = (UserGreetHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        userGreetHeadView.f30322d = (VFrame) viewGroup.getChildAt(0);
        userGreetHeadView.f30323e = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userGreetHeadView.f30324f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userGreetHeadView.f30325g = (VText) viewGroup.getChildAt(1);
        userGreetHeadView.f30326h = (VLinear) viewGroup.getChildAt(2);
        userGreetHeadView.f30327i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        userGreetHeadView.f30328j = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        userGreetHeadView.f30329k = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        userGreetHeadView.f30330l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        userGreetHeadView.f30331m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        userGreetHeadView.f30332n = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        userGreetHeadView.f30333o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        userGreetHeadView.f30334p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        userGreetHeadView.f30335q = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        userGreetHeadView.f30336r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        userGreetHeadView.f30337s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        userGreetHeadView.f30338t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(2);
        userGreetHeadView.f30339u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        userGreetHeadView.f30340v = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        userGreetHeadView.f30341w = (GreetMessageMomentNewView) viewGroup.getChildAt(3);
        userGreetHeadView.f30342x = (GreetMessageStateFourView) viewGroup.getChildAt(4);
        userGreetHeadView.f30343y = (GreetMessageStateNewView) viewGroup.getChildAt(5);
    }
}
