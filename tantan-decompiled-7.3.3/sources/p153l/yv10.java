package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class yv10 {
    /* JADX INFO: renamed from: a */
    public static void m217482a(MusicAggregateHeader musicAggregateHeader, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateHeader.f40191a = (ImageView) viewGroup.getChildAt(0);
        musicAggregateHeader.f40192b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateHeader.f40193c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicAggregateHeader.f40194d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateHeader.f40195e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateHeader.f40196f = (TextView) viewGroup.getChildAt(3);
    }
}
