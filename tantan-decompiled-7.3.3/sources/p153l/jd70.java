package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jd70 {
    /* JADX INFO: renamed from: a */
    public static void m144404a(PhotoAlbumFansView photoAlbumFansView, View view) {
        photoAlbumFansView.f42069a = (PhotoAlbumFansView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFansView.f42070b = (VButton) viewGroup.getChildAt(0);
        photoAlbumFansView.f42071c = (RelativeLayout) viewGroup.getChildAt(1);
        photoAlbumFansView.f42072d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFansView.f42073e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f42074f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f42075g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f42076h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        photoAlbumFansView.f42077i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f42078j = (VDraweeView) viewGroup.getChildAt(2);
        photoAlbumFansView.f42079k = viewGroup.getChildAt(3);
        photoAlbumFansView.f42080l = (VImage) viewGroup.getChildAt(4);
    }
}
