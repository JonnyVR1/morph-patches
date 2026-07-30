package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.aialbum.view.AiAlbumPickerItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class eg0 {
    /* JADX INFO: renamed from: a */
    public static void m6294a(AiAlbumPickerItemView aiAlbumPickerItemView, View view) {
        aiAlbumPickerItemView.d = (AiAlbumPickerItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumPickerItemView.e = viewGroup.getChildAt(0);
        aiAlbumPickerItemView.f = (ImageView) viewGroup.getChildAt(1);
        aiAlbumPickerItemView.g = (ImageView) viewGroup.getChildAt(2);
    }
}
