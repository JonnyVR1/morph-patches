package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import p151v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class s390 {
    /* JADX INFO: renamed from: a */
    public static void m184231a(PrivilegeDescListNoSVipItem privilegeDescListNoSVipItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNoSVipItem.f38470a = viewGroup.getChildAt(0);
        privilegeDescListNoSVipItem.f38471b = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNoSVipItem.f38472c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListNoSVipItem.f38473d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListNoSVipItem.f38474e = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
    }
}
