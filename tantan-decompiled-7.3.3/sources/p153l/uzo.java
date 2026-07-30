package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uzo {
    /* JADX INFO: renamed from: a */
    public static void m198844a(IntlPrivilegeDescListItem intlPrivilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListItem.f37999a = (VIcon) viewGroup.getChildAt(0);
        intlPrivilegeDescListItem.f38000b = (VLinear) viewGroup.getChildAt(1);
        intlPrivilegeDescListItem.f38001c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListItem.f38002d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
