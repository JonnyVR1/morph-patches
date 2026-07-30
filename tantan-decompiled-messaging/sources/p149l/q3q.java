package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q3q {
    /* JADX INFO: renamed from: a */
    public static void m172890a(ItemFinishedChallengeView itemFinishedChallengeView, View view) {
        itemFinishedChallengeView.f25789a = (ItemFinishedChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFinishedChallengeView.f25790b = (RelativeLayout) viewGroup.getChildAt(0);
        itemFinishedChallengeView.f25791c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemFinishedChallengeView.f25792d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemFinishedChallengeView.f25793e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemFinishedChallengeView.f25794f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
