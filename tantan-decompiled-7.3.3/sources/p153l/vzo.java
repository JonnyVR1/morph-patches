package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vzo {
    /* JADX INFO: renamed from: a */
    public static void m204115a(IntlPrivilegeDescListItem intlPrivilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListItem.f38753a = (VIcon) viewGroup.getChildAt(0);
        intlPrivilegeDescListItem.f38754b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListItem.f38755c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlPrivilegeDescListItem.f38756d = viewGroup.getChildAt(2);
    }
}
