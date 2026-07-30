package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class hth {
    /* JADX INFO: renamed from: a */
    public static void m132865a(FeedPostGuideView feedPostGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideView.f42450d = (VRelative) viewGroup.getChildAt(0);
        feedPostGuideView.f42451e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostGuideView.f42452f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostGuideView.f42453g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostGuideView.f42454h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPostGuideView.f42455i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
