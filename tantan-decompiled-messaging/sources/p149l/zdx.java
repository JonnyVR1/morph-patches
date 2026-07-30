package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchSuccessPopView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zdx {
    /* JADX INFO: renamed from: a */
    public static void m218243a(MatchSuccessPopView matchSuccessPopView, View view) {
        matchSuccessPopView.f30552d = (MatchSuccessPopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matchSuccessPopView.f30553e = (ConstraintLayout) viewGroup.getChildAt(0);
        matchSuccessPopView.f30554f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        matchSuccessPopView.f30555g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        matchSuccessPopView.f30556h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        matchSuccessPopView.f30557i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        matchSuccessPopView.f30558j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        matchSuccessPopView.f30559k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        matchSuccessPopView.f30560l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        matchSuccessPopView.f30561m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
        matchSuccessPopView.f30562n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        matchSuccessPopView.f30563o = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(2);
        matchSuccessPopView.f30564p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        matchSuccessPopView.f30565q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(3);
        matchSuccessPopView.f30566r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(3)).getChildAt(1);
        matchSuccessPopView.f30567s = (Guideline) viewGroup.getChildAt(1);
        matchSuccessPopView.f30568t = (VDraweeView) viewGroup.getChildAt(2);
        matchSuccessPopView.f30569u = (VDraweeView) viewGroup.getChildAt(3);
        matchSuccessPopView.f30570v = (VDraweeView) viewGroup.getChildAt(4);
        matchSuccessPopView.f30571w = viewGroup.getChildAt(5);
        matchSuccessPopView.f30572x = (VFrame) viewGroup.getChildAt(6);
        matchSuccessPopView.f30573y = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        matchSuccessPopView.f30574z = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        matchSuccessPopView.f30550A = (SVGAnimationView) viewGroup.getChildAt(7);
    }
}
