package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.j760;
import l.vdt;
import l.vwb;
import l.ypv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mu50 {
    /* JADX INFO: renamed from: a */
    public static String m18183a(BLiveOperationPopupType bLiveOperationPopupType) {
        return TEnum.equals(bLiveOperationPopupType, "TextDrawer") ? "word_drawer" : "common_drawer";
    }

    /* JADX INFO: renamed from: b */
    public static void m18184b(Map<String, Object> map, BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer;
        map.put("campaign_type", bLiveOperationItem.type);
        if (NullChecker.a(bLiveOperationItem.popup)) {
            String string = bLiveOperationItem.popup.popupType.toString();
            string.getClass();
            String str = "";
            if (string.equals("H5Drawer")) {
                BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer2 = bLiveOperationItem.popup.h5Drawer;
                if (bLiveOperationItemPopUpDrawer2 != null) {
                    str = bLiveOperationItemPopUpDrawer2.jumpScheme;
                }
            } else if (string.equals("H5PopUp") && (bLiveOperationItemPopUpDrawer = bLiveOperationItem.popup.h5PopUp) != null) {
                str = bLiveOperationItemPopUpDrawer.jumpScheme;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            map.put("offline", ypv.a.r(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18185c(boolean z, ho2 ho2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        zvf0.u("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("anchorId", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("roomId", ho2Var.m17234j().room.id), vwb.Y("live_id", ho2Var.m17234j().id), vwb.Y("drawer_type", m18183a(bLiveOperationPopupType)), vwb.Y("active_id", str)});
    }

    /* JADX INFO: renamed from: d */
    public static void m18186d(boolean z, ho2 ho2Var, String str, BLiveOperationPopupType bLiveOperationPopupType) {
        zvf0.A("e_live_drawer", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("anchorId", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("roomId", ho2Var.m17234j().room.id), vwb.Y("live_id", ho2Var.m17234j().id), vwb.Y("drawer_type", m18183a(bLiveOperationPopupType)), vwb.Y("active_id", str)});
    }

    /* JADX INFO: renamed from: e */
    public static void m18187e(boolean z, ho2 ho2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", ((DbObject) ho2Var.m14582l0()).id);
        map.put("roomId", ho2Var.m17234j().room.id);
        map.put("live_id", ho2Var.m17234j().id);
        map.put("active_id", bLiveOperationItem.type);
        if (!vdt.b(2)) {
            m18184b(map, bLiveOperationItem);
        }
        zvf0.s("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: f */
    public static void m18188f(boolean z, ho2 ho2Var, BLiveOperationItem bLiveOperationItem) {
        HashMap map = new HashMap();
        map.put("anchorId", ((DbObject) ho2Var.m14582l0()).id);
        map.put("roomId", ho2Var.m17234j().room.id);
        map.put("live_id", ho2Var.m17234j().id);
        map.put("active_id", bLiveOperationItem.type);
        zvf0.y("e_live_active", z ? "p_anchor_live_room" : "p_user_live_room", map);
    }
}
