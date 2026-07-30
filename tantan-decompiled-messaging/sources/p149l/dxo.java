package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.IntlPrivilegeCard;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dxo {
    /* JADX INFO: renamed from: a */
    public static void m114016a(IntlPrivilegeCard intlPrivilegeCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeCard.f37847a = (LinearLayout) viewGroup.getChildAt(0);
        intlPrivilegeCard.f37848b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeCard.f37849c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeCard.f37850d = (VLinear) viewGroup.getChildAt(1);
        intlPrivilegeCard.f37851e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeCard.f37852f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
