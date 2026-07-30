package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class f7h0 {
    /* JADX INFO: renamed from: a */
    public static void m119806a(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, View view) {
        swapAnswerBottomSheetAct.f28639d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        swapAnswerBottomSheetAct.f28640e = viewGroup.getChildAt(0);
        swapAnswerBottomSheetAct.f28641f = (VLinear) viewGroup.getChildAt(1);
        swapAnswerBottomSheetAct.f28642g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        swapAnswerBottomSheetAct.f28643h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        swapAnswerBottomSheetAct.f28644i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        swapAnswerBottomSheetAct.f28645j = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        swapAnswerBottomSheetAct.f28646k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        swapAnswerBottomSheetAct.f28647l = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        swapAnswerBottomSheetAct.f28648m = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        swapAnswerBottomSheetAct.f28649n = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119807b(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126372Q4, viewGroup, false);
        m119806a(swapAnswerBottomSheetAct, viewInflate);
        return viewInflate;
    }
}
