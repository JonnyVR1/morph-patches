package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class rfw {
    /* JADX INFO: renamed from: a */
    public static void m181307a(qfw qfwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qfwVar.f157343a = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qfwVar.f157344b = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        qfwVar.f157345c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        qfwVar.f157346d = (VText_Bold) viewGroup.getChildAt(1);
        qfwVar.f157347e = (VProgressBar) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m181308b(qfw qfwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125407F6, viewGroup, false);
        m181307a(qfwVar, viewInflate);
        return viewInflate;
    }
}
