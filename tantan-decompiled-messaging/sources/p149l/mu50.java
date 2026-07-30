package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class mu50 {
    /* JADX INFO: renamed from: a */
    public static String m156381a(BLiveOperationPopupType bLiveOperationPopupType) {
        return TEnum.equals(bLiveOperationPopupType, BLiveOperationPopupType.TextDrawer) ? "word_drawer" : "common_drawer";
    }

    /* JADX INFO: renamed from: b */
    public static void m156382b(Map<String, Object> map, BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer;
        map.put("campaign_type", bLiveOperationItem.type);
        if (NullChecker.m81303a(bLiveOperationItem.popup)) {
            String string = bLiveOperationItem.popup.popupType.toString();
            string.getClass();
            String str = "";
            if (string.equals(BLiveOperationPopupType.H5Drawer)) {
                BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer2 = bLiveOperationItem.popup.h5Drawer;
                if (bLiveOperationItemPopUpDrawer2 != null) {
                    str = bLiveOperationItemPopUpDrawer2.jumpScheme;
                }
            } else if (string.equals(BLiveOperationPopupType.H5PopUp) && (bLiveOperationItemPopUpDrawer = bLiveOperationItem.popup.h5PopUp) != null) {
                str = bLiveOperationItemPopUpDrawer.jumpScheme;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            map.put(UserBanAppealSwitch.offline, ypv.f199493a.m199368r(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m156383c(boolean z, ho2 ho2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        zvf0.m220399u("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("anchorId", ho2Var.m132146l0().f56011id), vwb.m200311Y("roomId", ho2Var.mo149813j().room.f44419id), vwb.m200311Y("live_id", ho2Var.mo149813j().f44323id), vwb.m200311Y("drawer_type", m156381a(bLiveOperationPopupType)), vwb.m200311Y("active_id", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m156384d(boolean z, ho2 ho2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        zvf0.m220368A("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("anchorId", ho2Var.m132146l0().f56011id), vwb.m200311Y("roomId", ho2Var.mo149813j().room.f44419id), vwb.m200311Y("live_id", ho2Var.mo149813j().f44323id), vwb.m200311Y("drawer_type", m156381a(bLiveOperationPopupType)), vwb.m200311Y("active_id", str));
    }

    /* JADX INFO: renamed from: e */
    public static void m156385e(boolean z, ho2 ho2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", ho2Var.m132146l0().f56011id);
        map.put("roomId", ho2Var.mo149813j().room.f44419id);
        map.put("live_id", ho2Var.mo149813j().f44323id);
        map.put("active_id", bLiveOperationItem.type);
        if (!vdt.m198092b(2)) {
            m156382b(map, bLiveOperationItem);
        }
        zvf0.m220397s("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: f */
    public static void m156386f(boolean z, ho2 ho2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", ho2Var.m132146l0().f56011id);
        map.put("roomId", ho2Var.mo149813j().room.f44419id);
        map.put("live_id", ho2Var.mo149813j().f44323id);
        map.put("active_id", bLiveOperationItem.type);
        zvf0.m220403y("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }
}
