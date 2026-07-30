package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yzo {
    /* JADX INFO: renamed from: a */
    public static void m218025a(IntlPrivilegeDescListSeeItem intlPrivilegeDescListSeeItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListSeeItem.f38765a = (VIcon) viewGroup.getChildAt(0);
        intlPrivilegeDescListSeeItem.f38766b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListSeeItem.f38767c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
