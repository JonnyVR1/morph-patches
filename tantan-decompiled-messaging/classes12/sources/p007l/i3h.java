package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i3h {
    /* JADX INFO: renamed from: a */
    public static void m10773a(FeedFolderItemView feedFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFolderItemView.f2067a = viewGroup.getChildAt(0);
        feedFolderItemView.f2068b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFolderItemView.f2069c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFolderItemView.f2070d = (ImageView) viewGroup.getChildAt(2);
    }
}
