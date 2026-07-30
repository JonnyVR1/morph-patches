package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class ry90 {
    /* JADX INFO: renamed from: a */
    public static void m183598a(qy90 qy90Var, View view) {
        qy90Var.f160098a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qy90Var.f160099b = (VText) viewGroup.getChildAt(0);
        qy90Var.f160100c = (VLinear) viewGroup.getChildAt(1);
        qy90Var.f160101d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qy90Var.f160102e = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qy90Var.f160103f = (FlowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qy90Var.f160104g = (VLinear) viewGroup.getChildAt(2);
        qy90Var.f160105h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qy90Var.f160106i = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        qy90Var.f160107j = (FlowView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qy90Var.f160108k = (VLinear) viewGroup.getChildAt(3);
        qy90Var.f160109l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        qy90Var.f160110m = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        qy90Var.f160111n = (FlowView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        qy90Var.f160112o = (VLinear) viewGroup.getChildAt(4);
        qy90Var.f160113p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        qy90Var.f160114q = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        qy90Var.f160115r = (FlowView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        qy90Var.f160116s = (VLinear) viewGroup.getChildAt(5);
        qy90Var.f160117t = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        qy90Var.f160118u = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        qy90Var.f160119v = (FlowView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        qy90Var.f160120w = (VLinear) viewGroup.getChildAt(6);
        qy90Var.f160121x = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        qy90Var.f160122y = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        qy90Var.f160123z = (FlowView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m183599b(qy90 qy90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125443Ha, viewGroup, false);
        m183598a(qy90Var, viewInflate);
        return viewInflate;
    }
}
