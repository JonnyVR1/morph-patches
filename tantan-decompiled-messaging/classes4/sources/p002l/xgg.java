package p002l;

import java.util.HashMap;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xgg {
    /* JADX INFO: renamed from: a */
    public static void m25926a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.s("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: b */
    public static void m25927b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.y("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: c */
    public static void m25928c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.y("e_live_fanbase_panel", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: d */
    public static void m25929d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        map.put("recall_type", str3);
        zvf0.s("e_live_fanbase_recall", "p_anchor_live_room", map);
    }
}
