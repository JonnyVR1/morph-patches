package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class den {
    /* JADX INFO: renamed from: a */
    public static void m115444a(cen cenVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cenVar._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cenVar._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cenVar._verify = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cenVar._verify_ccode = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        cenVar._verify_phone_num = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        cenVar._verify_code = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        cenVar._verify_get_code = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        cenVar._verify_error_code = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        cenVar._positive_primary = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cenVar._nega = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m115445b(cen cenVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125371D4, viewGroup, false);
        m115444a(cenVar, viewInflate);
        return viewInflate;
    }
}
