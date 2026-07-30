package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.view.CommonLabelShowView;
import l.f6c0;
import l.jke;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kke {
    /* JADX INFO: renamed from: a */
    public static void m7605a(jke jkeVar, View view) {
        jkeVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jkeVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jkeVar.w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jkeVar.x = (LinearLayout) viewGroup.getChildAt(1);
        jkeVar.y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jkeVar.z = (CommonLabelShowView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7606b(jke jkeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J9, viewGroup, false);
        m7605a(jkeVar, viewInflate);
        return viewInflate;
    }
}
