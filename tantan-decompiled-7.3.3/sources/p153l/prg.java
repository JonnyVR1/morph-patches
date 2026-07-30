package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class prg {
    /* JADX INFO: renamed from: a */
    public static void m173483a(FeedBottomAttitudeView feedBottomAttitudeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedBottomAttitudeView.f42627a = (VLinear) viewGroup.getChildAt(0);
        feedBottomAttitudeView.f42628b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedBottomAttitudeView.f42629c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
