package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fdt {
    /* JADX INFO: renamed from: a */
    public static void m13133a(LivePusherView livePusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePusherView.f3912a = (FrameLayout) viewGroup.getChildAt(0);
        livePusherView.f3913b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePusherView.f3914c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePusherView.f3915d = (RelativeLayout) viewGroup.getChildAt(1);
        livePusherView.f3916e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePusherView.f3917f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        livePusherView.f3918g = (ViewStub) viewGroup.getChildAt(2);
        livePusherView.f3919h = (ViewStub) viewGroup.getChildAt(3);
    }
}
