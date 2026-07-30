package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.C8759a;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mel {
    /* JADX INFO: renamed from: a */
    public static void m154253a(C8759a c8759a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8759a._agreement_container = (LinearLayout) viewGroup.getChildAt(0);
        c8759a._agreement_container_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8759a._agreement_container_agreement = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154254b(C8759a c8759a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131656v2, viewGroup, false);
        m154253a(c8759a, viewInflate);
        return viewInflate;
    }
}
