package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class qe90 {
    /* JADX INFO: renamed from: a */
    public static void m176232a(PrivilegePaymentView privilegePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePaymentView._divider = viewGroup.getChildAt(0);
        privilegePaymentView._payment = (FrameLayout) viewGroup.getChildAt(1);
        privilegePaymentView._agreement = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m176233b(PrivilegePaymentView privilegePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125966n9, viewGroup, true);
        m176232a(privilegePaymentView, viewInflate);
        return viewInflate;
    }
}
