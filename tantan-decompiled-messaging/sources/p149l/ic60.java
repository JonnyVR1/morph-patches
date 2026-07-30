package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ic60 {
    /* JADX INFO: renamed from: a */
    public static void m135348a(hc60 hc60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hc60Var._title = (VText) viewGroup.getChildAt(0);
        hc60Var._desc = (VText) viewGroup.getChildAt(3);
        hc60Var._price = (VText) viewGroup.getChildAt(4);
        hc60Var._bill = (VRelative) viewGroup.getChildAt(5);
        hc60Var._bill_category = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        hc60Var._bill_pending = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        hc60Var._bill_bill_bt = (VButton) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        hc60Var._qr = (VRelative) viewGroup.getChildAt(6);
        hc60Var._qr_qr_category = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        hc60Var._qr_qr_pending = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        hc60Var._qr_qr_icon = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        hc60Var._qr_qr_bt = (VButton) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        hc60Var._close = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m135349b(hc60 hc60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131665y, viewGroup, false);
        m135348a(hc60Var, viewInflate);
        return viewInflate;
    }
}
