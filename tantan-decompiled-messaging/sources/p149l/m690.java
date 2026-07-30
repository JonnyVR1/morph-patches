package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class m690 {
    /* JADX INFO: renamed from: a */
    public static void m153186a(PrivilegePaymentView privilegePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePaymentView._divider = viewGroup.getChildAt(0);
        privilegePaymentView._payment = (FrameLayout) viewGroup.getChildAt(1);
        privilegePaymentView._agreement = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m153187b(PrivilegePaymentView privilegePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95794g9, viewGroup, true);
        m153186a(privilegePaymentView, viewInflate);
        return viewInflate;
    }
}
