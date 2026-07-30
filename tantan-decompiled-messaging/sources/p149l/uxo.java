package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uxo {
    /* JADX INFO: renamed from: a */
    public static void m196185a(IntlPrivilegeDescListItem intlPrivilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListItem.f37151a = (VIcon) viewGroup.getChildAt(0);
        intlPrivilegeDescListItem.f37152b = (VLinear) viewGroup.getChildAt(1);
        intlPrivilegeDescListItem.f37153c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListItem.f37154d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
