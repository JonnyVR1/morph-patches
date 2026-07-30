package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class x4h {
    /* JADX INFO: renamed from: a */
    public static void m209342a(FeedFolderItemView feedFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFolderItemView.f41454a = (VDraweeView) viewGroup.getChildAt(0);
        feedFolderItemView.f41455b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFolderItemView.f41456c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFolderItemView.f41457d = (ImageView) viewGroup.getChildAt(2);
    }
}
