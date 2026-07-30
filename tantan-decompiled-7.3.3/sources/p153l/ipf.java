package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ipf {
    /* JADX INFO: renamed from: a */
    public static void m141453a(ExploreCardItemView exploreCardItemView, View view) {
        exploreCardItemView.f22141d = (ExploreCardItemView) view;
        exploreCardItemView.f22142e = (RelativeLayout) ((ViewGroup) view).getChildAt(0);
        exploreCardItemView.f22143f = (VDraweeView) view.findViewById(adc0.f70198X3);
        ViewGroup viewGroup = (ViewGroup) view;
        exploreCardItemView.f22144g = (SwipeLikeButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        exploreCardItemView.f22145h = (SwipeLikeButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        exploreCardItemView.f22146i = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        exploreCardItemView.f22147j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        exploreCardItemView.f22148k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        exploreCardItemView.f22149l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        exploreCardItemView.f22150m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        exploreCardItemView.f22151n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        exploreCardItemView.f22152o = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        exploreCardItemView.f22153p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        exploreCardItemView.f22154q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        exploreCardItemView.f22155r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        exploreCardItemView.f22156s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        exploreCardItemView.f22157t = (FlowTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(4);
        exploreCardItemView.f22158u = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5);
        exploreCardItemView.f22159v = (VDraweeView) view.findViewById(adc0.f70264b4);
        exploreCardItemView.f22160w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5)).getChildAt(1);
        exploreCardItemView.f22161x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(6);
    }
}
