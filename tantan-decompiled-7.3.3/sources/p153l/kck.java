package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateFourView;
import com.p051p1.mobile.putong.core.p058ui.view.ImFlowView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kck {
    /* JADX INFO: renamed from: a */
    public static void m149114a(GreetMessageStateFourView greetMessageStateFourView, View view) {
        greetMessageStateFourView.f30220a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateFourView.f30221b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f30222c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f30223d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateFourView.f30224e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageStateFourView.f30225f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageStateFourView.f30226g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        greetMessageStateFourView.f30227h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        greetMessageStateFourView.f30228i = (VLinear) viewGroup.getChildAt(1);
        greetMessageStateFourView.f30229j = (ImFlowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f30230k = (VLinear) viewGroup.getChildAt(2);
        greetMessageStateFourView.f30231l = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f30232m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f30233n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f30234o = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f30235p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f30236q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        greetMessageStateFourView.f30237r = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f30238s = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f30239t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f30240u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f30241v = (VLinear) viewGroup.getChildAt(3);
        greetMessageStateFourView.f30242w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        greetMessageStateFourView.f30243x = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149115b(GreetMessageStateFourView greetMessageStateFourView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156969X, viewGroup, false);
        m149114a(greetMessageStateFourView, viewInflate);
        return viewInflate;
    }
}
