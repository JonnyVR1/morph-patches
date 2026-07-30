package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bk4 {
    /* JADX INFO: renamed from: a */
    public static void m104793a(ak4 ak4Var, View view) {
        ak4Var.f71959f = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ak4Var.f71960g = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ak4Var.f71961h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ak4Var.f71962i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ak4Var.f71963j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ak4Var.f71964k = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ak4Var.f71965l = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m104794b(ak4 ak4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125350C0, viewGroup, false);
        m104793a(ak4Var, viewInflate);
        return viewInflate;
    }
}
