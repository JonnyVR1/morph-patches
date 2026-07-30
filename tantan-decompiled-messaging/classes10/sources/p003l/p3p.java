package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p3p {
    /* JADX INFO: renamed from: a */
    public static void m8687a(IntlPrivilegeUnlockBenefitsView intlPrivilegeUnlockBenefitsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeUnlockBenefitsView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlPrivilegeUnlockBenefitsView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPrivilegeUnlockBenefitsView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPrivilegeUnlockBenefitsView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
