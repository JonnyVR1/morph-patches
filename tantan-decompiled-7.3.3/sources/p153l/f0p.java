package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f0p {
    /* JADX INFO: renamed from: a */
    public static void m123502a(IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeExclusivePrivilegeView.f38024a = (FrameLayout) viewGroup.getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.f38025b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.f38026c = (VText) viewGroup.getChildAt(1);
    }
}
