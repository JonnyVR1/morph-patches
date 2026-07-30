package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class xgg {
    /* JADX INFO: renamed from: a */
    public static void m208673a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.m220397s("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: b */
    public static void m208674b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.m220403y("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: c */
    public static void m208675c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        zvf0.m220403y("e_live_fanbase_panel", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: d */
    public static void m208676d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        map.put("recall_type", str3);
        zvf0.m220397s("e_live_fanbase_recall", "p_anchor_live_room", map);
    }
}
