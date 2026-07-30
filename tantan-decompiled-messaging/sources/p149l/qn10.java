package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class qn10 {
    /* JADX INFO: renamed from: a */
    public static void m175583a(MusicAggregateHeader musicAggregateHeader, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicAggregateHeader.f39343a = (ImageView) viewGroup.getChildAt(0);
        musicAggregateHeader.f39344b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicAggregateHeader.f39345c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicAggregateHeader.f39346d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicAggregateHeader.f39347e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicAggregateHeader.f39348f = (TextView) viewGroup.getChildAt(3);
    }
}
