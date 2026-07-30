package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class s260 {
    /* JADX INFO: renamed from: a */
    public static String m184109a(BLiveOperationPopupType bLiveOperationPopupType) {
        return TEnum.equals(bLiveOperationPopupType, BLiveOperationPopupType.TextDrawer) ? "word_drawer" : "common_drawer";
    }

    /* JADX INFO: renamed from: b */
    public static void m184110b(Map<String, Object> map, BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer;
        map.put("campaign_type", bLiveOperationItem.type);
        if (NullChecker.m82486a(bLiveOperationItem.popup)) {
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
            map.put(UserBanAppealSwitch.offline, zrv.f205799a.m207690r(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m184111c(boolean z, oo2 oo2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        i4g0.m138523u("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("anchorId", oo2Var.m168532l0().f56859id), jyb.m147494Y("roomId", oo2Var.mo183435j().room.f45267id), jyb.m147494Y("live_id", oo2Var.mo183435j().f45171id), jyb.m147494Y("drawer_type", m184109a(bLiveOperationPopupType)), jyb.m147494Y("active_id", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m184112d(boolean z, oo2 oo2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        i4g0.m138492A("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("anchorId", oo2Var.m168532l0().f56859id), jyb.m147494Y("roomId", oo2Var.mo183435j().room.f45267id), jyb.m147494Y("live_id", oo2Var.mo183435j().f45171id), jyb.m147494Y("drawer_type", m184109a(bLiveOperationPopupType)), jyb.m147494Y("active_id", str));
    }

    /* JADX INFO: renamed from: e */
    public static void m184113e(boolean z, oo2 oo2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", oo2Var.m168532l0().f56859id);
        map.put("roomId", oo2Var.mo183435j().room.f45267id);
        map.put("live_id", oo2Var.mo183435j().f45171id);
        map.put("active_id", bLiveOperationItem.type);
        if (!wft.m206159b(2)) {
            m184110b(map, bLiveOperationItem);
        }
        i4g0.m138521s("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: f */
    public static void m184114f(boolean z, oo2 oo2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", oo2Var.m168532l0().f56859id);
        map.put("roomId", oo2Var.mo183435j().room.f45267id);
        map.put("live_id", oo2Var.mo183435j().f45171id);
        map.put("active_id", bLiveOperationItem.type);
        i4g0.m138527y("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }
}
