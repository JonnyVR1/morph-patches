package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumRenderItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ig0 {
    /* JADX INFO: renamed from: a */
    public static void m135963a(AiAlbumRenderItemView aiAlbumRenderItemView, View view) {
        aiAlbumRenderItemView.f28402d = (AiAlbumRenderItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumRenderItemView.f28403e = (VDraweeView) viewGroup.getChildAt(0);
        aiAlbumRenderItemView.f28404f = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
