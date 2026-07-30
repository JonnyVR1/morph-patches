package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateFourView;
import com.p046p1.mobile.putong.core.p053ui.view.ImFlowView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t9k {
    /* JADX INFO: renamed from: a */
    public static void m187634a(GreetMessageStateFourView greetMessageStateFourView, View view) {
        greetMessageStateFourView.f29372a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateFourView.f29373b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f29374c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f29375d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateFourView.f29376e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageStateFourView.f29377f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageStateFourView.f29378g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        greetMessageStateFourView.f29379h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        greetMessageStateFourView.f29380i = (VLinear) viewGroup.getChildAt(1);
        greetMessageStateFourView.f29381j = (ImFlowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f29382k = (VLinear) viewGroup.getChildAt(2);
        greetMessageStateFourView.f29383l = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f29384m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f29385n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f29386o = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f29387p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f29388q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        greetMessageStateFourView.f29389r = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f29390s = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f29391t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f29392u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f29393v = (VLinear) viewGroup.getChildAt(3);
        greetMessageStateFourView.f29394w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        greetMessageStateFourView.f29395x = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m187635b(GreetMessageStateFourView greetMessageStateFourView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126413X, viewGroup, false);
        m187634a(greetMessageStateFourView, viewInflate);
        return viewInflate;
    }
}
