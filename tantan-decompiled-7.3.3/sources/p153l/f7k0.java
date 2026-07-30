package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardContributionView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f7k0 {
    /* JADX INFO: renamed from: a */
    public static void m124475a(UserCardContributionView userCardContributionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardContributionView.f50253a = (FrameLayout) viewGroup.getChildAt(1);
        userCardContributionView.f50254b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardContributionView.f50255c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardContributionView.f50256d = (FrameLayout) viewGroup.getChildAt(2);
        userCardContributionView.f50257e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        userCardContributionView.f50258f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        userCardContributionView.f50259g = (FrameLayout) viewGroup.getChildAt(3);
        userCardContributionView.f50260h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        userCardContributionView.f50261i = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
