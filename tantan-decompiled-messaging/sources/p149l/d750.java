package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d750 {
    /* JADX INFO: renamed from: a */
    public static void m110224a(OfficialShowPusherView officialShowPusherView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPusherView.f51111a = (FrameLayout) viewGroup.getChildAt(0);
        officialShowPusherView.f51112b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowPusherView.f51113c = (FrameLayout) viewGroup.getChildAt(1);
        officialShowPusherView.f51114d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        officialShowPusherView.f51115e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        officialShowPusherView.f51116f = (RelativeLayout) viewGroup.getChildAt(2);
        officialShowPusherView.f51117g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        officialShowPusherView.f51118h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        officialShowPusherView.f51119i = (ViewStub) viewGroup.getChildAt(3);
        officialShowPusherView.f51120j = (ViewStub) viewGroup.getChildAt(4);
    }
}
