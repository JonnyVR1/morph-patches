package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class d570 {
    /* JADX INFO: renamed from: a */
    public static void m110020a(PhotoAlbumFansView photoAlbumFansView, View view) {
        photoAlbumFansView.f41221a = (PhotoAlbumFansView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFansView.f41222b = (VButton) viewGroup.getChildAt(0);
        photoAlbumFansView.f41223c = (RelativeLayout) viewGroup.getChildAt(1);
        photoAlbumFansView.f41224d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFansView.f41225e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f41226f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f41227g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f41228h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        photoAlbumFansView.f41229i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f41230j = (VDraweeView) viewGroup.getChildAt(2);
        photoAlbumFansView.f41231k = viewGroup.getChildAt(3);
        photoAlbumFansView.f41232l = (VImage) viewGroup.getChildAt(4);
    }
}
