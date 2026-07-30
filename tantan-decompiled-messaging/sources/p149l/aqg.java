package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class aqg {
    /* JADX INFO: renamed from: a */
    public static void m98289a(FeedBottomAttitudeView feedBottomAttitudeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedBottomAttitudeView.f41779a = (VLinear) viewGroup.getChildAt(0);
        feedBottomAttitudeView.f41780b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedBottomAttitudeView.f41781c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
