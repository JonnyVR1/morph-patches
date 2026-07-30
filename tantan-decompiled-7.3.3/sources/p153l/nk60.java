package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nk60 {
    /* JADX INFO: renamed from: a */
    public static void m163589a(mk60 mk60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mk60Var._title = (VText) viewGroup.getChildAt(0);
        mk60Var._desc = (VText) viewGroup.getChildAt(3);
        mk60Var._price = (VText) viewGroup.getChildAt(4);
        mk60Var._bill = (VRelative) viewGroup.getChildAt(5);
        mk60Var._bill_category = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mk60Var._bill_pending = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        mk60Var._bill_bill_bt = (VButton) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        mk60Var._qr = (VRelative) viewGroup.getChildAt(6);
        mk60Var._qr_qr_category = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        mk60Var._qr_qr_pending = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        mk60Var._qr_qr_icon = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        mk60Var._qr_qr_bt = (VButton) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        mk60Var._close = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m163590b(mk60 mk60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162625y, viewGroup, false);
        m163589a(mk60Var, viewInflate);
        return viewInflate;
    }
}
