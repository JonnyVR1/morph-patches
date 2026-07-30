package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sf50 {
    /* JADX INFO: renamed from: a */
    public static void m185581a(OfficialShowPusherView officialShowPusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPusherView.f51959a = (FrameLayout) viewGroup.getChildAt(0);
        officialShowPusherView.f51960b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowPusherView.f51961c = (FrameLayout) viewGroup.getChildAt(1);
        officialShowPusherView.f51962d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        officialShowPusherView.f51963e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        officialShowPusherView.f51964f = (RelativeLayout) viewGroup.getChildAt(2);
        officialShowPusherView.f51965g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        officialShowPusherView.f51966h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        officialShowPusherView.f51967i = (ViewStub) viewGroup.getChildAt(3);
        officialShowPusherView.f51968j = (ViewStub) viewGroup.getChildAt(4);
    }
}
