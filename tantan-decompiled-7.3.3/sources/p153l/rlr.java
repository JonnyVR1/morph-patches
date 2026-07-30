package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersNewLikeBubble;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class rlr {
    /* JADX INFO: renamed from: a */
    public static void m182023a(LikersNewLikeBubble likersNewLikeBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersNewLikeBubble.f38165a = (RelativeLayout) viewGroup.getChildAt(0);
        likersNewLikeBubble.f38166b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersNewLikeBubble.f38167c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersNewLikeBubble.f38168d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
