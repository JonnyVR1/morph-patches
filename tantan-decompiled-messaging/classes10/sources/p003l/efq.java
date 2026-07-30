package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemTestChallengeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class efq {
    /* JADX INFO: renamed from: a */
    public static void m6293a(ItemTestChallengeView itemTestChallengeView, View view) {
        itemTestChallengeView.a = (ItemTestChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTestChallengeView.b = viewGroup.getChildAt(0);
        itemTestChallengeView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemTestChallengeView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemTestChallengeView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemTestChallengeView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
