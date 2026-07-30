package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hnq0 {
    /* JADX INFO: renamed from: a */
    public static void m136270a(gnq0 gnq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gnq0Var.f105131a = (SimpleDraweeView) viewGroup.getChildAt(0);
        gnq0Var.f105132b = (VText) viewGroup.getChildAt(2);
        gnq0Var.f105133c = (VText_Default_Bold) viewGroup.getChildAt(4);
        gnq0Var.f105134d = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m136271b(gnq0 gnq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125801dd, viewGroup, false);
        m136270a(gnq0Var, viewInflate);
        return viewInflate;
    }
}
