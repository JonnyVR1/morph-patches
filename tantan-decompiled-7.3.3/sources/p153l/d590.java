package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import p151v.VIcon;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class d590 {
    /* JADX INFO: renamed from: a */
    public static void m114292a(PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListShowcaseItem.f38537a = (LinearLayout) viewGroup.getChildAt(0);
        privilegeDescListShowcaseItem.f38538b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListShowcaseItem.f38539c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListShowcaseItem.f38540d = (FrameLayout) viewGroup.getChildAt(1);
    }
}
