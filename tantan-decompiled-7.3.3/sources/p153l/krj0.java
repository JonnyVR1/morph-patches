package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class krj0 {
    /* JADX INFO: renamed from: a */
    public static void m151093a(jrj0 jrj0Var, View view) {
        jrj0Var.f122367f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jrj0Var.f122368g = (VImage) viewGroup.getChildAt(0);
        jrj0Var.f122369h = (VDraweeView) viewGroup.getChildAt(1);
        jrj0Var.f122370i = (VText_Bold) viewGroup.getChildAt(2);
        jrj0Var.f122371j = (VText) viewGroup.getChildAt(3);
        jrj0Var.f122372k = (VLinear) viewGroup.getChildAt(4);
        jrj0Var.f122373l = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        jrj0Var.f122374m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        jrj0Var.f122375n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        jrj0Var.f122376o = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        jrj0Var.f122377p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        jrj0Var.f122378q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1);
        jrj0Var.f122379r = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        jrj0Var.f122380s = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(0);
        jrj0Var.f122381t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(1);
        jrj0Var.f122382u = (VLinear) viewGroup.getChildAt(5);
        jrj0Var.f122383v = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        jrj0Var.f122384w = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        jrj0Var.f122385x = (VText_Bold) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m151094b(jrj0 jrj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125621Sc, viewGroup, false);
        m151093a(jrj0Var, viewInflate);
        return viewInflate;
    }
}
