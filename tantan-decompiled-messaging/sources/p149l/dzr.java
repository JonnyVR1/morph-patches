package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.suggest.LiveBubbleGuideView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class dzr {
    /* JADX INFO: renamed from: a */
    public static void m114133a(LiveBubbleGuideView liveBubbleGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBubbleGuideView._image = (VDraweeView) viewGroup.getChildAt(0);
        liveBubbleGuideView._content = (TextView) viewGroup.getChildAt(1);
    }
}
