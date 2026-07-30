package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ole {
    /* JADX INFO: renamed from: a */
    public static void m168102a(nle nleVar, View view) {
        nleVar.f142533u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nleVar.f142534v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nleVar.f142535w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nleVar.f142536x = (LinearLayout) viewGroup.getChildAt(1);
        nleVar.f142537y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nleVar.f142538z = (CommonLabelShowView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m168103b(nle nleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125586Q9, viewGroup, false);
        m168102a(nleVar, viewInflate);
        return viewInflate;
    }
}
