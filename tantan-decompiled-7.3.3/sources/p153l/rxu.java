package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class rxu {
    /* JADX INFO: renamed from: a */
    public static void m183566a(LiveVideoChatPushView liveVideoChatPushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVideoChatPushView.f46302a = (VFrame) viewGroup.getChildAt(0);
        liveVideoChatPushView.f46303b = (VFrame) viewGroup.getChildAt(1);
        liveVideoChatPushView.f46304c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVideoChatPushView.f46305d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVideoChatPushView.f46306e = (VFrame) viewGroup.getChildAt(2);
        liveVideoChatPushView.f46307f = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveVideoChatPushView.f46308g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
