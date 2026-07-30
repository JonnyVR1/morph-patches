package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gft {
    /* JADX INFO: renamed from: a */
    public static void m130119a(LivePusherView livePusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePusherView.f48718a = (FrameLayout) viewGroup.getChildAt(0);
        livePusherView.f48719b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePusherView.f48720c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePusherView.f48721d = (RelativeLayout) viewGroup.getChildAt(1);
        livePusherView.f48722e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePusherView.f48723f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        livePusherView.f48724g = (ViewStub) viewGroup.getChildAt(2);
        livePusherView.f48725h = (ViewStub) viewGroup.getChildAt(3);
    }
}
