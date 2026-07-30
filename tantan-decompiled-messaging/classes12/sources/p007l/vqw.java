package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeupDownloadItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vqw {
    /* JADX INFO: renamed from: a */
    public static void m15555a(MakeupDownloadItemView makeupDownloadItemView, View view) {
        makeupDownloadItemView.f1225a = (MakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        makeupDownloadItemView.f1226b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        makeupDownloadItemView.f1227c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        makeupDownloadItemView.f1228d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        makeupDownloadItemView.f1229e = viewGroup.getChildAt(1);
        makeupDownloadItemView.f1230f = viewGroup.getChildAt(2);
    }
}
