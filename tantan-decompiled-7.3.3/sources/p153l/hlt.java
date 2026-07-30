package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.external.square.search.widgets.LiveSearchAnchorItemView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hlt {
    /* JADX INFO: renamed from: a */
    public static void m135775a(LiveSearchAnchorItemView liveSearchAnchorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSearchAnchorItemView.f47083a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSearchAnchorItemView.f47084b = (LivingNewTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSearchAnchorItemView.f47085c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSearchAnchorItemView.f47086d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSearchAnchorItemView.f47087e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveSearchAnchorItemView.f47088f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveSearchAnchorItemView.f47089g = (LinearLayout) viewGroup.getChildAt(2);
        liveSearchAnchorItemView.f47090h = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveSearchAnchorItemView.f47091i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveSearchAnchorItemView.f47092j = (VButton) viewGroup.getChildAt(3);
    }
}
