package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemTestChallengeView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ehq {
    /* JADX INFO: renamed from: a */
    public static void m120852a(ItemTestChallengeView itemTestChallengeView, View view) {
        itemTestChallengeView.f26544a = (ItemTestChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTestChallengeView.f26545b = (VLinear) viewGroup.getChildAt(0);
        itemTestChallengeView.f26546c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemTestChallengeView.f26547d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemTestChallengeView.f26548e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemTestChallengeView.f26549f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
