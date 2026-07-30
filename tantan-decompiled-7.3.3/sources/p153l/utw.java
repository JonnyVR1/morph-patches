package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeupDownloadItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class utw {
    /* JADX INFO: renamed from: a */
    public static void m198110a(MakeupDownloadItemView makeupDownloadItemView, View view) {
        makeupDownloadItemView.f40612a = (MakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        makeupDownloadItemView.f40613b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        makeupDownloadItemView.f40614c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        makeupDownloadItemView.f40615d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        makeupDownloadItemView.f40616e = (VText) viewGroup.getChildAt(1);
        makeupDownloadItemView.f40617f = (VText) viewGroup.getChildAt(2);
    }
}
