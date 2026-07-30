package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oys {
    /* JADX INFO: renamed from: a */
    public static void m166694a(LiveInternalCardStylePushView liveInternalCardStylePushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalCardStylePushView.f22209c = (FrameLayout) viewGroup.getChildAt(0);
        liveInternalCardStylePushView.f22210d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalCardStylePushView.f22211e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        liveInternalCardStylePushView.f22212f = (LiveHaloAvatar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        liveInternalCardStylePushView.f22213g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        liveInternalCardStylePushView.f22214h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        liveInternalCardStylePushView.f22215i = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
