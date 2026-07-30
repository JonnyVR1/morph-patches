package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ag0 {
    /* JADX INFO: renamed from: a */
    public static void m97575a(AiAlbumPickerItemView aiAlbumPickerItemView, View view) {
        aiAlbumPickerItemView.f29238d = (AiAlbumPickerItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumPickerItemView.f29239e = (VDraweeView) viewGroup.getChildAt(0);
        aiAlbumPickerItemView.f29240f = (ImageView) viewGroup.getChildAt(1);
        aiAlbumPickerItemView.f29241g = (ImageView) viewGroup.getChildAt(2);
    }
}
