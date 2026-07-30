package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yf20 {
    /* JADX INFO: renamed from: a */
    public static void m17129a(NewAlbumMediaItemView newAlbumMediaItemView, View view) {
        newAlbumMediaItemView.a = (NewAlbumMediaItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newAlbumMediaItemView.b = viewGroup.getChildAt(0);
        newAlbumMediaItemView.c = (ImageView) viewGroup.getChildAt(1);
        newAlbumMediaItemView.d = viewGroup.getChildAt(2);
        newAlbumMediaItemView.e = viewGroup.getChildAt(3);
        newAlbumMediaItemView.f = (FrameLayout) viewGroup.getChildAt(4);
        newAlbumMediaItemView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        newAlbumMediaItemView.h = viewGroup.getChildAt(5);
        newAlbumMediaItemView.i = viewGroup.getChildAt(6);
    }
}
