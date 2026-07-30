package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePaymentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s190 {
    /* JADX INFO: renamed from: a */
    public static void m9203a(PrivilegeEntrancePaymentView privilegeEntrancePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePaymentView._pay_way = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeEntrancePaymentView._pay_way_txt = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeEntrancePaymentView._prom_text = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeEntrancePaymentView._origin_proto = (LinearLayout) viewGroup.getChildAt(1);
        privilegeEntrancePaymentView._check = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeEntrancePaymentView._member_protocol = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
