package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class v8e {
    /* JADX INFO: renamed from: a */
    public static void m200298a(u8e u8eVar, View view) {
        u8eVar.f178025a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u8eVar.f178026b = (VDraweeView) viewGroup.getChildAt(0);
        u8eVar.f178027c = (VDraweeView) viewGroup.getChildAt(1);
        u8eVar.f178028d = (VDraweeView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m200299b(u8e u8eVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199316y0, viewGroup, false);
        m200298a(u8eVar, viewInflate);
        return viewInflate;
    }
}
