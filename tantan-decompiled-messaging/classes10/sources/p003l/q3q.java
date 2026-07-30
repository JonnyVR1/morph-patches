package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q3q {
    /* JADX INFO: renamed from: a */
    public static void m8912a(ItemFinishedChallengeView itemFinishedChallengeView, View view) {
        itemFinishedChallengeView.a = (ItemFinishedChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFinishedChallengeView.b = (RelativeLayout) viewGroup.getChildAt(0);
        itemFinishedChallengeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemFinishedChallengeView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemFinishedChallengeView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemFinishedChallengeView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
