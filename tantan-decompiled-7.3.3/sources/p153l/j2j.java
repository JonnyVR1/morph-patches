package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class j2j {
    /* JADX INFO: renamed from: a */
    public static void m143216a(i2j i2jVar, View view) {
        i2jVar.f112624a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        i2jVar.f112625b = (CoordinatorLayout) viewGroup.getChildAt(0);
        i2jVar.f112626c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        i2jVar.f112627d = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        i2jVar.f112628e = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        i2jVar.f112629f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        i2jVar.f112630g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m143217b(i2j i2jVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173486D2, viewGroup, false);
        m143216a(i2jVar, viewInflate);
        return viewInflate;
    }
}
