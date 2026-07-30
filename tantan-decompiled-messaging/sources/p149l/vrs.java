package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class vrs {
    /* JADX INFO: renamed from: a */
    public static void m199750a(LiveGuardPrivilegeRightList liveGuardPrivilegeRightList, View view) {
        liveGuardPrivilegeRightList.f50501d = (LiveGuardPrivilegeRightList) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeRightList.f50502e = (VRecyclerView) viewGroup.getChildAt(0);
        liveGuardPrivilegeRightList.f50503f = (LiveGuardPrivilegeActiveButton) viewGroup.getChildAt(1);
    }
}
