package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeupDownloadItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class vqw {
    /* JADX INFO: renamed from: a */
    public static void m199604a(MakeupDownloadItemView makeupDownloadItemView, View view) {
        makeupDownloadItemView.f39764a = (MakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        makeupDownloadItemView.f39765b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        makeupDownloadItemView.f39766c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        makeupDownloadItemView.f39767d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        makeupDownloadItemView.f39768e = (VText) viewGroup.getChildAt(1);
        makeupDownloadItemView.f39769f = (VText) viewGroup.getChildAt(2);
    }
}
