package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dcn {
    /* JADX INFO: renamed from: a */
    public static void m110862a(ccn ccnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ccnVar._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ccnVar._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ccnVar._verify = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ccnVar._verify_ccode = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ccnVar._verify_phone_num = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        ccnVar._verify_code = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        ccnVar._verify_get_code = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        ccnVar._verify_error_code = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        ccnVar._positive_primary = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ccnVar._nega = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m110863b(ccn ccnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95319D4, viewGroup, false);
        m110862a(ccnVar, viewInflate);
        return viewInflate;
    }
}
