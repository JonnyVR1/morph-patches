package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumPickerView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumRenderView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumResultView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumTemplatesView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ef0 {
    /* JADX INFO: renamed from: a */
    public static void m116016a(df0 df0Var, View view) {
        df0Var.f85872a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        df0Var.f85873b = viewGroup.getChildAt(0);
        df0Var.f85874c = (VFrame) viewGroup.getChildAt(1);
        df0Var.f85875d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        df0Var.f85876e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        df0Var.f85877f = (AiAlbumTemplatesView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        df0Var.f85878g = (AiAlbumPickerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        df0Var.f85879h = (AiAlbumRenderView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        df0Var.f85880i = (AiAlbumResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m116017b(df0 df0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96038v, viewGroup, false);
        m116016a(df0Var, viewInflate);
        return viewInflate;
    }
}
