package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.C8922a;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class chl {
    /* JADX INFO: renamed from: a */
    public static void m109837a(C8922a c8922a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8922a._agreement_container = (LinearLayout) viewGroup.getChildAt(0);
        c8922a._agreement_container_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8922a._agreement_container_agreement = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109838b(C8922a c8922a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162616v2, viewGroup, false);
        m109837a(c8922a, viewInflate);
        return viewInflate;
    }
}
