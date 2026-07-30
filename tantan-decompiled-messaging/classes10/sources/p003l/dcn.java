package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dcn {
    /* JADX INFO: renamed from: a */
    public static void m6103a(ccn ccnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ccnVar._title = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ccnVar._subtitle = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ccnVar._verify = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ccnVar._verify_ccode = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ccnVar._verify_phone_num = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        ccnVar._verify_code = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        ccnVar._verify_get_code = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        ccnVar._verify_error_code = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        ccnVar._positive_primary = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ccnVar._nega = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6104b(ccn ccnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.D4, viewGroup, false);
        m6103a(ccnVar, viewInflate);
        return viewInflate;
    }
}
