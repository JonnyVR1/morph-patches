package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cg0 {
    /* JADX INFO: renamed from: a */
    public static void m109661a(AiAlbumPickerView aiAlbumPickerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumPickerView.f29242c = (VText) viewGroup.getChildAt(0);
        aiAlbumPickerView.f29243d = (VText) viewGroup.getChildAt(1);
        aiAlbumPickerView.f29244e = (VRecyclerView) viewGroup.getChildAt(2);
        aiAlbumPickerView.f29245f = (VText) viewGroup.getChildAt(3);
        aiAlbumPickerView.f29246g = (VText) viewGroup.getChildAt(4);
    }
}
