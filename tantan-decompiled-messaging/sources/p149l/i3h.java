package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class i3h {
    /* JADX INFO: renamed from: a */
    public static void m134211a(FeedFolderItemView feedFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFolderItemView.f40606a = (VDraweeView) viewGroup.getChildAt(0);
        feedFolderItemView.f40607b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFolderItemView.f40608c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFolderItemView.f40609d = (ImageView) viewGroup.getChildAt(2);
    }
}
