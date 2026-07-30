package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.cke;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dke {
    /* JADX INFO: renamed from: a */
    public static void m6168a(cke ckeVar, View view) {
        ckeVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ckeVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ckeVar.w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ckeVar.x = (LinearLayout) viewGroup.getChildAt(1);
        ckeVar.y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ckeVar.z = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6169b(cke ckeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ia, viewGroup, false);
        m6168a(ckeVar, viewInflate);
        return viewInflate;
    }
}
