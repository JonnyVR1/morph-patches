package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class io20 {
    /* JADX INFO: renamed from: a */
    public static void m141244a(NewAlbumMediaItemView newAlbumMediaItemView, View view) {
        newAlbumMediaItemView.f54885a = (NewAlbumMediaItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumMediaItemView.f54886b = (VDraweeView) viewGroup.getChildAt(0);
        newAlbumMediaItemView.f54887c = (ImageView) viewGroup.getChildAt(1);
        newAlbumMediaItemView.f54888d = (VText) viewGroup.getChildAt(2);
        newAlbumMediaItemView.f54889e = (VImage) viewGroup.getChildAt(3);
        newAlbumMediaItemView.f54890f = (FrameLayout) viewGroup.getChildAt(4);
        newAlbumMediaItemView.f54891g = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumMediaItemView.f54892h = viewGroup.getChildAt(5);
        newAlbumMediaItemView.f54893i = (VText) viewGroup.getChildAt(6);
    }
}
