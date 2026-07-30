package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fdt {
    /* JADX INFO: renamed from: a */
    public static void m121005a(LivePusherView livePusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePusherView.f47870a = (FrameLayout) viewGroup.getChildAt(0);
        livePusherView.f47871b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePusherView.f47872c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePusherView.f47873d = (RelativeLayout) viewGroup.getChildAt(1);
        livePusherView.f47874e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePusherView.f47875f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        livePusherView.f47876g = (ViewStub) viewGroup.getChildAt(2);
        livePusherView.f47877h = (ViewStub) viewGroup.getChildAt(3);
    }
}
