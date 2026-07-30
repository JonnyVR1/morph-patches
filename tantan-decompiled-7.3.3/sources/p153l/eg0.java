package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumRenderItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class eg0 {
    /* JADX INFO: renamed from: a */
    public static void m120750a(AiAlbumRenderItemView aiAlbumRenderItemView, View view) {
        aiAlbumRenderItemView.f29250d = (AiAlbumRenderItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aiAlbumRenderItemView.f29251e = (VDraweeView) viewGroup.getChildAt(0);
        aiAlbumRenderItemView.f29252f = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
