package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nat {
    /* JADX INFO: renamed from: a */
    public static void m158713a(LivePlayerView livePlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePlayerView.f47850a = (FrameLayout) viewGroup.getChildAt(0);
        livePlayerView.f47851b = (ViewStub) viewGroup.getChildAt(1);
        livePlayerView.f47852c = (VText) viewGroup.getChildAt(2);
        livePlayerView.f47853d = (RelativeLayout) viewGroup.getChildAt(3);
        livePlayerView.f47854e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        livePlayerView.f47855f = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        livePlayerView.f47856g = (ViewStub) viewGroup.getChildAt(4);
    }
}
