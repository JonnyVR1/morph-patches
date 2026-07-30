package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d750 {
    /* JADX INFO: renamed from: a */
    public static void m11613a(OfficialShowPusherView officialShowPusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPusherView.f7153a = (FrameLayout) viewGroup.getChildAt(0);
        officialShowPusherView.f7154b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowPusherView.f7155c = (FrameLayout) viewGroup.getChildAt(1);
        officialShowPusherView.f7156d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        officialShowPusherView.f7157e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        officialShowPusherView.f7158f = (RelativeLayout) viewGroup.getChildAt(2);
        officialShowPusherView.f7159g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        officialShowPusherView.f7160h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        officialShowPusherView.f7161i = (ViewStub) viewGroup.getChildAt(3);
        officialShowPusherView.f7162j = (ViewStub) viewGroup.getChildAt(4);
    }
}
