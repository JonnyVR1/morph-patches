package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nat {
    /* JADX INFO: renamed from: a */
    public static void m18638a(LivePlayerView livePlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePlayerView.f3892a = (FrameLayout) viewGroup.getChildAt(0);
        livePlayerView.f3893b = (ViewStub) viewGroup.getChildAt(1);
        livePlayerView.f3894c = viewGroup.getChildAt(2);
        livePlayerView.f3895d = (RelativeLayout) viewGroup.getChildAt(3);
        livePlayerView.f3896e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        livePlayerView.f3897f = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        livePlayerView.f3898g = (ViewStub) viewGroup.getChildAt(4);
    }
}
