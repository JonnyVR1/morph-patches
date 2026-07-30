package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bof {
    /* JADX INFO: renamed from: a */
    public static void m102943a(ExploreCardItemView exploreCardItemView, View view) {
        exploreCardItemView.f21399d = (ExploreCardItemView) view;
        exploreCardItemView.f21400e = (RelativeLayout) ((ViewGroup) view).getChildAt(0);
        exploreCardItemView.f21401f = (VDraweeView) view.findViewById(u4c0.f174075V3);
        ViewGroup viewGroup = (ViewGroup) view;
        exploreCardItemView.f21402g = (SwipeLikeButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        exploreCardItemView.f21403h = (SwipeLikeButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        exploreCardItemView.f21404i = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        exploreCardItemView.f21405j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        exploreCardItemView.f21406k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        exploreCardItemView.f21407l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        exploreCardItemView.f21408m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        exploreCardItemView.f21409n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        exploreCardItemView.f21410o = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        exploreCardItemView.f21411p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        exploreCardItemView.f21412q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        exploreCardItemView.f21413r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        exploreCardItemView.f21414s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        exploreCardItemView.f21415t = (FlowTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(4);
        exploreCardItemView.f21416u = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5);
        exploreCardItemView.f21417v = (VDraweeView) view.findViewById(u4c0.f174139Z3);
        exploreCardItemView.f21418w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5)).getChildAt(1);
        exploreCardItemView.f21419x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(6);
    }
}
