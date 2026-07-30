package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hwp {
    /* JADX INFO: renamed from: a */
    public static void m133260a(gwp gwpVar, View view) {
        gwpVar.f104755f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gwpVar.f104756g = (VImage) viewGroup.getChildAt(0);
        gwpVar.f104757h = (VImage) viewGroup.getChildAt(1);
        gwpVar.f104758i = (VText_Bold) viewGroup.getChildAt(2);
        gwpVar.f104759j = (VText) viewGroup.getChildAt(4);
        gwpVar.f104760k = (VText_Bold) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m133261b(gwp gwpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95706b6, viewGroup, false);
        m133260a(gwpVar, viewInflate);
        return viewInflate;
    }
}
