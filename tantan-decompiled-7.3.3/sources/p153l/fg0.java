package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumRenderView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fg0 {
    /* JADX INFO: renamed from: a */
    public static void m125471a(AiAlbumRenderView aiAlbumRenderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumRenderView.f29253c = (VText) viewGroup.getChildAt(0);
        aiAlbumRenderView.f29254d = (VText) viewGroup.getChildAt(1);
        aiAlbumRenderView.f29255e = (VRecyclerView) viewGroup.getChildAt(2);
        aiAlbumRenderView.f29256f = (VText) viewGroup.getChildAt(3);
    }
}
