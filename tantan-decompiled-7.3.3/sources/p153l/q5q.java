package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q5q {
    /* JADX INFO: renamed from: a */
    public static void m175510a(ItemFinishedChallengeView itemFinishedChallengeView, View view) {
        itemFinishedChallengeView.f26531a = (ItemFinishedChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFinishedChallengeView.f26532b = (RelativeLayout) viewGroup.getChildAt(0);
        itemFinishedChallengeView.f26533c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemFinishedChallengeView.f26534d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemFinishedChallengeView.f26535e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemFinishedChallengeView.f26536f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
