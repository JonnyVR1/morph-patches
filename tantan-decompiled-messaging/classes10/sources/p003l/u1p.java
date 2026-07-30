package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u1p {
    /* JADX INFO: renamed from: a */
    public static void m9641a(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeShowcaseWrapper.a = (RelativeLayout) viewGroup.getChildAt(0);
        intlPrivilegeShowcaseWrapper.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeShowcaseWrapper.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
