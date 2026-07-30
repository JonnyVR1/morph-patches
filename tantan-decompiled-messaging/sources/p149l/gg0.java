package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumPickerView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gg0 {
    /* JADX INFO: renamed from: a */
    public static void m125936a(AiAlbumPickerView aiAlbumPickerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumPickerView.f28394c = (VText) viewGroup.getChildAt(0);
        aiAlbumPickerView.f28395d = (VText) viewGroup.getChildAt(1);
        aiAlbumPickerView.f28396e = (VRecyclerView) viewGroup.getChildAt(2);
        aiAlbumPickerView.f28397f = (VText) viewGroup.getChildAt(3);
        aiAlbumPickerView.f28398g = (VText) viewGroup.getChildAt(4);
    }
}
