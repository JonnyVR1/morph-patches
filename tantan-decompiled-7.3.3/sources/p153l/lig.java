package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class lig {
    /* JADX INFO: renamed from: a */
    public static void m154371a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        i4g0.m138521s("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: b */
    public static void m154372b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        i4g0.m138527y("e_live_fanbase_recall_message_send", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: c */
    public static void m154373c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        i4g0.m138527y("e_live_fanbase_panel", "p_anchor_live_room", map);
    }

    /* JADX INFO: renamed from: d */
    public static void m154374d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("liveId", str2);
        map.put("recall_type", str3);
        i4g0.m138521s("e_live_fanbase_recall", "p_anchor_live_room", map);
    }
}
