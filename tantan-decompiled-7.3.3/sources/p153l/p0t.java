package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p0t {
    /* JADX INFO: renamed from: a */
    public static void m170180a(LiveInternalCardStylePushView liveInternalCardStylePushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalCardStylePushView.f22951c = (FrameLayout) viewGroup.getChildAt(0);
        liveInternalCardStylePushView.f22952d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalCardStylePushView.f22953e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        liveInternalCardStylePushView.f22954f = (LiveHaloAvatar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        liveInternalCardStylePushView.f22955g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        liveInternalCardStylePushView.f22956h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        liveInternalCardStylePushView.f22957i = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
