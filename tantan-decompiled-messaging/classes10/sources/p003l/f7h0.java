package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.breaking.SwapAnswerBottomSheetAct;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f7h0 {
    /* JADX INFO: renamed from: a */
    public static void m6456a(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, View view) {
        swapAnswerBottomSheetAct.f1033d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        swapAnswerBottomSheetAct.f1034e = viewGroup.getChildAt(0);
        swapAnswerBottomSheetAct.f1035f = viewGroup.getChildAt(1);
        swapAnswerBottomSheetAct.f1036g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        swapAnswerBottomSheetAct.f1037h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        swapAnswerBottomSheetAct.f1038i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        swapAnswerBottomSheetAct.f1039j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        swapAnswerBottomSheetAct.f1040k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        swapAnswerBottomSheetAct.f1041l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        swapAnswerBottomSheetAct.f1042m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        swapAnswerBottomSheetAct.f1043n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6457b(SwapAnswerBottomSheetAct swapAnswerBottomSheetAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5881Q4, viewGroup, false);
        m6456a(swapAnswerBottomSheetAct, viewInflate);
        return viewInflate;
    }
}
