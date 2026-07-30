package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchSuccessPopView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ygx {
    /* JADX INFO: renamed from: a */
    public static void m215882a(MatchSuccessPopView matchSuccessPopView, View view) {
        matchSuccessPopView.f31400d = (MatchSuccessPopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matchSuccessPopView.f31401e = (ConstraintLayout) viewGroup.getChildAt(0);
        matchSuccessPopView.f31402f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        matchSuccessPopView.f31403g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        matchSuccessPopView.f31404h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        matchSuccessPopView.f31405i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        matchSuccessPopView.f31406j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        matchSuccessPopView.f31407k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        matchSuccessPopView.f31408l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        matchSuccessPopView.f31409m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
        matchSuccessPopView.f31410n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        matchSuccessPopView.f31411o = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(2);
        matchSuccessPopView.f31412p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        matchSuccessPopView.f31413q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(3);
        matchSuccessPopView.f31414r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(3)).getChildAt(1);
        matchSuccessPopView.f31415s = (Guideline) viewGroup.getChildAt(1);
        matchSuccessPopView.f31416t = (VDraweeView) viewGroup.getChildAt(2);
        matchSuccessPopView.f31417u = (VDraweeView) viewGroup.getChildAt(3);
        matchSuccessPopView.f31418v = (VDraweeView) viewGroup.getChildAt(4);
        matchSuccessPopView.f31419w = viewGroup.getChildAt(5);
        matchSuccessPopView.f31420x = (VFrame) viewGroup.getChildAt(6);
        matchSuccessPopView.f31421y = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        matchSuccessPopView.f31422z = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        matchSuccessPopView.f31398A = (SVGAnimationView) viewGroup.getChildAt(7);
    }
}
