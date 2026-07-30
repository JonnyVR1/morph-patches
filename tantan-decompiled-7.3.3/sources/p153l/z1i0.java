package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class z1i0 {
    /* JADX INFO: renamed from: a */
    public static void m218346a(y1i0 y1i0Var, View view) {
        y1i0Var.f197103f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y1i0Var.f197104g = (VImage) viewGroup.getChildAt(0);
        y1i0Var.f197105h = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m218347b(y1i0 y1i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125379Dc, viewGroup, false);
        m218346a(y1i0Var, viewInflate);
        return viewInflate;
    }
}
