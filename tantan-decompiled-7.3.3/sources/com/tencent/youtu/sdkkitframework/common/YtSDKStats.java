package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class YtSDKStats extends YtFSMBaseState {

    /* JADX INFO: renamed from: g */
    public static YtSDKStats f61413g;

    /* JADX INFO: renamed from: a */
    public HashMap<String, Object> f61414a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public String f61415b;

    /* JADX INFO: renamed from: c */
    public String f61416c;

    /* JADX INFO: renamed from: d */
    public String f61417d;

    /* JADX INFO: renamed from: e */
    public String f61418e;

    /* JADX INFO: renamed from: f */
    public long f61419f;

    public static synchronized void clearInstance() {
        if (f61413g != null) {
            f61413g = null;
        }
    }

    public static synchronized YtSDKStats getInstance() {
        YtSDKStats ytSDKStats = f61413g;
        if (ytSDKStats != null) {
            return ytSDKStats;
        }
        YtSDKStats ytSDKStats2 = new YtSDKStats();
        f61413g = ytSDKStats2;
        return ytSDKStats2;
    }

    public static String getNowTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final void m85814a(String str, String str2, HashMap<String, Object> map, String str3, String str4) {
        HashMap<String, Object> map2 = new HashMap<>();
        HashMap map3 = new HashMap();
        map3.put("state_id", str);
        map3.put("state_action", str2);
        if (map != null) {
            map3.put("state_error", map);
        }
        if (str3 != null) {
            map3.put("state_cost", str3);
        }
        if (str4 != null) {
            map3.put("state_info", str4);
        }
        map2.put(StateEvent.Name.STATE_STATS, map3);
        YtFSM.getInstance().sendFSMEvent(map2);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public void enterState(String str) {
        YtSDKStats ytSDKStats;
        String str2;
        Object obj = this.f61414a.get(str);
        if (obj == null) {
            return;
        }
        this.f61416c = "enter";
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 0) {
            exitState();
            if (this.f61416c != null) {
                this.f61419f = System.currentTimeMillis();
                this.f61415b = str;
                ytSDKStats = this;
                str2 = str;
                ytSDKStats.m85814a(str2, this.f61416c, null, null, null);
            } else {
                ytSDKStats = this;
                str2 = str;
            }
        } else {
            ytSDKStats = this;
            str2 = str;
        }
        ytSDKStats.f61414a.put(str2, Integer.valueOf(iIntValue + 1));
    }

    public void exitState() {
        if (this.f61415b != null) {
            m85814a(this.f61415b, "exit", null, Long.toString(System.currentTimeMillis() - this.f61419f), null);
        }
    }

    public void registerStateName(String str) {
        this.f61414a.put(str, 0);
    }

    public void reportError(int i, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        map.put("error_msg", str);
        m85814a(this.f61415b, this.f61416c, map, null, null);
    }

    public void reportEvent(int i) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap map2 = new HashMap();
        map2.put("action_type", Integer.valueOf(i));
        map.put(StateEvent.Name.STATE_STATS, map2);
        YtFSM.getInstance().sendFSMEvent(map);
    }

    public void reportInfo(String str) {
        String str2 = this.f61418e;
        if (str2 == null || !str2.equals(str)) {
            this.f61418e = str;
        }
        m85814a(this.f61415b, this.f61416c, null, null, str);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        Iterator<String> it = this.f61414a.keySet().iterator();
        while (it.hasNext()) {
            this.f61414a.put(it.next(), 0);
        }
        this.f61415b = null;
        this.f61417d = null;
        this.f61418e = null;
    }

    public void updateState(String str) {
        this.f61416c = "update";
        String str2 = this.f61417d;
        if (str2 == null || !str2.equals(this.f61415b)) {
            String str3 = this.f61415b;
            this.f61417d = str3;
            m85814a(str3, this.f61416c, null, null, null);
        }
    }
}
