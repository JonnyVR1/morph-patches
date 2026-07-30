package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class wts {
    /* JADX INFO: renamed from: a */
    public static void m207907a(LiveGuardPrivilegeRightList liveGuardPrivilegeRightList, View view) {
        liveGuardPrivilegeRightList.f51349d = (LiveGuardPrivilegeRightList) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeRightList.f51350e = (VRecyclerView) viewGroup.getChildAt(0);
        liveGuardPrivilegeRightList.f51351f = (LiveGuardPrivilegeActiveButton) viewGroup.getChildAt(1);
    }
}
