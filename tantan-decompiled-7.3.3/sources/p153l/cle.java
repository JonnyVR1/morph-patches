package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class cle {
    /* JADX INFO: renamed from: a */
    public static void m110588a(ble bleVar, View view) {
        bleVar.f77186u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bleVar.f77187v = (VLinear) viewGroup.getChildAt(0);
        bleVar.f77188w = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bleVar.f77189x = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bleVar.f77190y = (VRecyclerView) viewGroup.getChildAt(1);
        bleVar.f77191z = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m110589b(ble bleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126010q2, viewGroup, false);
        m110588a(bleVar, viewInflate);
        return viewInflate;
    }
}
