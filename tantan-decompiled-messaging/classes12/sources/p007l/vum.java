package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaMediaItemView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.MarkView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vum {
    /* JADX INFO: renamed from: a */
    public static void m15585a(InstaMediaItemView instaMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaMediaItemView.f1813a = viewGroup.getChildAt(0);
        instaMediaItemView.f1814b = (ImageView) viewGroup.getChildAt(1);
        instaMediaItemView.f1815c = viewGroup.getChildAt(2);
        instaMediaItemView.f1816d = viewGroup.getChildAt(3);
        instaMediaItemView.f1817e = (MarkView) viewGroup.getChildAt(4);
    }
}
