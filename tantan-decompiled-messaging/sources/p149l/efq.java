package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemTestChallengeView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class efq {
    /* JADX INFO: renamed from: a */
    public static void m116089a(ItemTestChallengeView itemTestChallengeView, View view) {
        itemTestChallengeView.f25802a = (ItemTestChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTestChallengeView.f25803b = (VLinear) viewGroup.getChildAt(0);
        itemTestChallengeView.f25804c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemTestChallengeView.f25805d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemTestChallengeView.f25806e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemTestChallengeView.f25807f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
