package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePaymentView;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w990 {
    /* JADX INFO: renamed from: a */
    public static void m205568a(PrivilegeEntrancePaymentView privilegeEntrancePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePaymentView._pay_way = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeEntrancePaymentView._pay_way_txt = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeEntrancePaymentView._prom_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeEntrancePaymentView._origin_proto = (LinearLayout) viewGroup.getChildAt(1);
        privilegeEntrancePaymentView._check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeEntrancePaymentView._member_protocol = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
