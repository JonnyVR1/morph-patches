package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageMomentNewView;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateFourView;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateNewView;
import com.p046p1.mobile.putong.core.p053ui.greet.head.UserGreetHeadView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i5k0 {
    /* JADX INFO: renamed from: a */
    public static void m134487a(UserGreetHeadView userGreetHeadView, View view) {
        userGreetHeadView.f29473c = (UserGreetHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        userGreetHeadView.f29474d = (VFrame) viewGroup.getChildAt(0);
        userGreetHeadView.f29475e = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userGreetHeadView.f29476f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userGreetHeadView.f29477g = (VText) viewGroup.getChildAt(1);
        userGreetHeadView.f29478h = (VLinear) viewGroup.getChildAt(2);
        userGreetHeadView.f29479i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        userGreetHeadView.f29480j = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        userGreetHeadView.f29481k = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        userGreetHeadView.f29482l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        userGreetHeadView.f29483m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        userGreetHeadView.f29484n = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        userGreetHeadView.f29485o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        userGreetHeadView.f29486p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        userGreetHeadView.f29487q = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        userGreetHeadView.f29488r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        userGreetHeadView.f29489s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        userGreetHeadView.f29490t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(2);
        userGreetHeadView.f29491u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        userGreetHeadView.f29492v = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        userGreetHeadView.f29493w = (GreetMessageMomentNewView) viewGroup.getChildAt(3);
        userGreetHeadView.f29494x = (GreetMessageStateFourView) viewGroup.getChildAt(4);
        userGreetHeadView.f29495y = (GreetMessageStateNewView) viewGroup.getChildAt(5);
    }
}
