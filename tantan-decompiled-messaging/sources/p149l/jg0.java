package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumRenderView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jg0 {
    /* JADX INFO: renamed from: a */
    public static void m141217a(AiAlbumRenderView aiAlbumRenderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumRenderView.f28405c = (VText) viewGroup.getChildAt(0);
        aiAlbumRenderView.f28406d = (VText) viewGroup.getChildAt(1);
        aiAlbumRenderView.f28407e = (VRecyclerView) viewGroup.getChildAt(2);
        aiAlbumRenderView.f28408f = (VText) viewGroup.getChildAt(3);
    }
}
