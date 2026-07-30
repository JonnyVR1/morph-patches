package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cyo {
    /* JADX INFO: renamed from: a */
    public static void m6020a(IntlPrivilegeDescListTitle intlPrivilegeDescListTitle, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListTitle.a = (TextView) viewGroup.getChildAt(0);
        intlPrivilegeDescListTitle.b = viewGroup.getChildAt(1);
        intlPrivilegeDescListTitle.c = (TextView) viewGroup.getChildAt(2);
    }
}
