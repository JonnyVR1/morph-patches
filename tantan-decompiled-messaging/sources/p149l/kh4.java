package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kh4 {
    /* JADX INFO: renamed from: a */
    public static void m145952a(CardBottomLetterLayout cardBottomLetterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLetterLayout.f23510c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomLetterLayout.f23511d = (VLinear) viewGroup.getChildAt(1);
        cardBottomLetterLayout.f23512e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLetterLayout.f23513f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLetterLayout.f23514g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
