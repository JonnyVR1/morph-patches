package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qn10 {
    /* JADX INFO: renamed from: a */
    public static void m13589a(MusicAggregateHeader musicAggregateHeader, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateHeader.f804a = (ImageView) viewGroup.getChildAt(0);
        musicAggregateHeader.f805b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateHeader.f806c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicAggregateHeader.f807d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateHeader.f808e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateHeader.f809f = (TextView) viewGroup.getChildAt(3);
    }
}
