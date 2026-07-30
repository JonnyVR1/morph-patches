package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vrs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m24110a(LiveGuardPrivilegeRightList liveGuardPrivilegeRightList, View view) {
        liveGuardPrivilegeRightList.f6543d = (LiveGuardPrivilegeRightList) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeRightList.f6544e = viewGroup.getChildAt(0);
        liveGuardPrivilegeRightList.f6545f = (LiveGuardPrivilegeActiveButton) viewGroup.getChildAt(1);
    }
}
