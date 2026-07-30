package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class nfh0 {
    /* JADX INFO: renamed from: a */
    public static void m162927a(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, View view) {
        swapAnswerBottomSheetAct.f29487d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        swapAnswerBottomSheetAct.f29488e = viewGroup.getChildAt(0);
        swapAnswerBottomSheetAct.f29489f = (VLinear) viewGroup.getChildAt(1);
        swapAnswerBottomSheetAct.f29490g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        swapAnswerBottomSheetAct.f29491h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        swapAnswerBottomSheetAct.f29492i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        swapAnswerBottomSheetAct.f29493j = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        swapAnswerBottomSheetAct.f29494k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        swapAnswerBottomSheetAct.f29495l = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        swapAnswerBottomSheetAct.f29496m = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        swapAnswerBottomSheetAct.f29497n = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m162928b(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156928Q4, viewGroup, false);
        m162927a(swapAnswerBottomSheetAct, viewInflate);
        return viewInflate;
    }
}
