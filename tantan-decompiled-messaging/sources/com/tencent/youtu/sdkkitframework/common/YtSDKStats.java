package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class YtSDKStats extends YtFSMBaseState {

    /* JADX INFO: renamed from: g */
    public static YtSDKStats f60566g;

    /* JADX INFO: renamed from: a */
    public HashMap<String, Object> f60567a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public String f60568b;

    /* JADX INFO: renamed from: c */
    public String f60569c;

    /* JADX INFO: renamed from: d */
    public String f60570d;

    /* JADX INFO: renamed from: e */
    public String f60571e;

    /* JADX INFO: renamed from: f */
    public long f60572f;

    public static synchronized void clearInstance() {
        if (f60566g != null) {
            f60566g = null;
        }
    }

    public static synchronized YtSDKStats getInstance() {
        YtSDKStats ytSDKStats = f60566g;
        if (ytSDKStats != null) {
            return ytSDKStats;
        }
        YtSDKStats ytSDKStats2 = new YtSDKStats();
        f60566g = ytSDKStats2;
        return ytSDKStats2;
    }

    public static String getNowTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final void m84643a(String str, String str2, HashMap<String, Object> map, String str3, String str4) {
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
        Object obj = this.f60567a.get(str);
        if (obj == null) {
            return;
        }
        this.f60569c = "enter";
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 0) {
            exitState();
            if (this.f60569c != null) {
                this.f60572f = System.currentTimeMillis();
                this.f60568b = str;
                ytSDKStats = this;
                str2 = str;
                ytSDKStats.m84643a(str2, this.f60569c, null, null, null);
            } else {
                ytSDKStats = this;
                str2 = str;
            }
        } else {
            ytSDKStats = this;
            str2 = str;
        }
        ytSDKStats.f60567a.put(str2, Integer.valueOf(iIntValue + 1));
    }

    public void exitState() {
        if (this.f60568b != null) {
            m84643a(this.f60568b, "exit", null, Long.toString(System.currentTimeMillis() - this.f60572f), null);
        }
    }

    public void registerStateName(String str) {
        this.f60567a.put(str, 0);
    }

    public void reportError(int i, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        map.put("error_msg", str);
        m84643a(this.f60568b, this.f60569c, map, null, null);
    }

    public void reportEvent(int i) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap map2 = new HashMap();
        map2.put("action_type", Integer.valueOf(i));
        map.put(StateEvent.Name.STATE_STATS, map2);
        YtFSM.getInstance().sendFSMEvent(map);
    }

    public void reportInfo(String str) {
        String str2 = this.f60571e;
        if (str2 == null || !str2.equals(str)) {
            this.f60571e = str;
        }
        m84643a(this.f60568b, this.f60569c, null, null, str);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        Iterator<String> it = this.f60567a.keySet().iterator();
        while (it.hasNext()) {
            this.f60567a.put(it.next(), 0);
        }
        this.f60568b = null;
        this.f60570d = null;
        this.f60571e = null;
    }

    public void updateState(String str) {
        this.f60569c = "update";
        String str2 = this.f60570d;
        if (str2 == null || !str2.equals(this.f60568b)) {
            String str3 = this.f60568b;
            this.f60570d = str3;
            m84643a(str3, this.f60569c, null, null, null);
        }
    }
}
