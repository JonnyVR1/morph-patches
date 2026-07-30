package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class aor {
    /* JADX INFO: renamed from: a */
    public static void m99221a(ynr ynrVar, View view) {
        ynrVar.f200910a = (LinearLayout) view;
        ynrVar.f200911b = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99222b(ynr ynrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173494E4, viewGroup, false);
        m99221a(ynrVar, viewInflate);
        return viewInflate;
    }
}
