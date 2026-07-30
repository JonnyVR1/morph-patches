package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class qvu {
    /* JADX INFO: renamed from: a */
    public static void m176710a(LiveVideoChatPushView liveVideoChatPushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVideoChatPushView.f45454a = (VFrame) viewGroup.getChildAt(0);
        liveVideoChatPushView.f45455b = (VFrame) viewGroup.getChildAt(1);
        liveVideoChatPushView.f45456c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVideoChatPushView.f45457d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVideoChatPushView.f45458e = (VFrame) viewGroup.getChildAt(2);
        liveVideoChatPushView.f45459f = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveVideoChatPushView.f45460g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
