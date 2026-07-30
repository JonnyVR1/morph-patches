package p002l;

import com.tantanapp.common.data.DbObject;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k6e {
    /* JADX INFO: renamed from: a */
    public static void m16501a(String str, ho2 ho2Var, String str2) {
        zvf0.u("e_user_live_room_bubble", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_bubble_type", str2), vwb.Y("live_id", ho2Var.m17235k())});
    }

    /* JADX INFO: renamed from: b */
    public static void m16502b(String str, ho2 ho2Var, String str2) {
        zvf0.A("e_user_live_room_bubble", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_bubble_type", str2), vwb.Y("live_id", ho2Var.m17235k())});
    }

    /* JADX INFO: renamed from: c */
    public static void m16503c(String str, ho2 ho2Var) {
        zvf0.u("e_live_treasure_box_bullet_pop", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k())});
    }

    /* JADX INFO: renamed from: d */
    public static void m16504d(String str, ho2 ho2Var) {
        zvf0.A("e_live_treasure_box_bullet_pop", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k())});
    }

    /* JADX INFO: renamed from: e */
    public static void m16505e(String str, ho2 ho2Var, String str2) {
        zvf0.u("e_live_treasure_box_gift_send_pop", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k()), vwb.Y("giftId", str2)});
    }

    /* JADX INFO: renamed from: f */
    public static void m16506f(String str, ho2 ho2Var, String str2) {
        zvf0.A("e_live_treasure_box_gift_send_pop", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k()), vwb.Y("giftId", str2)});
    }
}
