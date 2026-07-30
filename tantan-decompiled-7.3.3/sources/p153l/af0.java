package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumRenderView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumResultView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumTemplatesView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class af0 {
    /* JADX INFO: renamed from: a */
    public static void m97264a(ze0 ze0Var, View view) {
        ze0Var.f203956a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ze0Var.f203957b = viewGroup.getChildAt(0);
        ze0Var.f203958c = (VFrame) viewGroup.getChildAt(1);
        ze0Var.f203959d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ze0Var.f203960e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ze0Var.f203961f = (AiAlbumTemplatesView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ze0Var.f203962g = (AiAlbumPickerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ze0Var.f203963h = (AiAlbumRenderView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ze0Var.f203964i = (AiAlbumResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m97265b(ze0 ze0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126092v, viewGroup, false);
        m97264a(ze0Var, viewInflate);
        return viewInflate;
    }
}
