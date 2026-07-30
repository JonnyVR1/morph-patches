package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class yf20 {
    /* JADX INFO: renamed from: a */
    public static void m214465a(NewAlbumMediaItemView newAlbumMediaItemView, View view) {
        newAlbumMediaItemView.f54037a = (NewAlbumMediaItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumMediaItemView.f54038b = (VDraweeView) viewGroup.getChildAt(0);
        newAlbumMediaItemView.f54039c = (ImageView) viewGroup.getChildAt(1);
        newAlbumMediaItemView.f54040d = (VText) viewGroup.getChildAt(2);
        newAlbumMediaItemView.f54041e = (VImage) viewGroup.getChildAt(3);
        newAlbumMediaItemView.f54042f = (FrameLayout) viewGroup.getChildAt(4);
        newAlbumMediaItemView.f54043g = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumMediaItemView.f54044h = viewGroup.getChildAt(5);
        newAlbumMediaItemView.f54045i = (VText) viewGroup.getChildAt(6);
    }
}
