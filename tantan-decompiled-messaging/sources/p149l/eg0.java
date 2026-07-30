package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumPickerItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class eg0 {
    /* JADX INFO: renamed from: a */
    public static void m116114a(AiAlbumPickerItemView aiAlbumPickerItemView, View view) {
        aiAlbumPickerItemView.f28390d = (AiAlbumPickerItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumPickerItemView.f28391e = (VDraweeView) viewGroup.getChildAt(0);
        aiAlbumPickerItemView.f28392f = (ImageView) viewGroup.getChildAt(1);
        aiAlbumPickerItemView.f28393g = (ImageView) viewGroup.getChildAt(2);
    }
}
