package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oct {
    /* JADX INFO: renamed from: a */
    public static void m167234a(LivePlayerView livePlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePlayerView.f48698a = (FrameLayout) viewGroup.getChildAt(0);
        livePlayerView.f48699b = (ViewStub) viewGroup.getChildAt(1);
        livePlayerView.f48700c = (VText) viewGroup.getChildAt(2);
        livePlayerView.f48701d = (RelativeLayout) viewGroup.getChildAt(3);
        livePlayerView.f48702e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        livePlayerView.f48703f = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        livePlayerView.f48704g = (ViewStub) viewGroup.getChildAt(4);
    }
}
