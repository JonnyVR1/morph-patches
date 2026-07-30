package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.suggest.LiveBubbleGuideView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class e1s {
    /* JADX INFO: renamed from: a */
    public static void m119024a(LiveBubbleGuideView liveBubbleGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBubbleGuideView._image = (VDraweeView) viewGroup.getChildAt(0);
        liveBubbleGuideView._content = (TextView) viewGroup.getChildAt(1);
    }
}
