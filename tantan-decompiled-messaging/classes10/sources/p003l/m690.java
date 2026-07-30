package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.PrivilegePaymentView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m690 {
    /* JADX INFO: renamed from: a */
    public static void m7982a(PrivilegePaymentView privilegePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePaymentView.a = viewGroup.getChildAt(0);
        privilegePaymentView.b = (FrameLayout) viewGroup.getChildAt(1);
        privilegePaymentView.c = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7983b(PrivilegePaymentView privilegePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.g9, viewGroup, true);
        m7982a(privilegePaymentView, viewInflate);
        return viewInflate;
    }
}
