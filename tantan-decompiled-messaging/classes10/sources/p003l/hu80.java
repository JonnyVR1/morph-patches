package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hu80 {
    /* JADX INFO: renamed from: a */
    public static void m7078a(PrivilegeContentDlgItemView privilegeContentDlgItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeContentDlgItemView.c = (FrameLayout) viewGroup.getChildAt(0);
        privilegeContentDlgItemView.d = viewGroup.getChildAt(1);
        privilegeContentDlgItemView.e = (TextView) viewGroup.getChildAt(2);
        privilegeContentDlgItemView.f = (TextView) viewGroup.getChildAt(3);
    }
}
