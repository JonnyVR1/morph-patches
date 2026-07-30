package com.tencent.youtu.sdkkitframework.common;

import com.immomo.momomediaext.sei.BaseSei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OperateInfoManager {

    /* JADX INFO: renamed from: c */
    public static OperateInfoManager f61402c = new OperateInfoManager();

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f61403a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<Long> f61404b = new ArrayList();

    public static OperateInfoManager getInstance() {
        return f61402c;
    }

    public void clear() {
        Map<String, Object> map = this.f61403a;
        if (map != null) {
            map.clear();
        }
        List<Long> list = this.f61404b;
        if (list != null) {
            list.clear();
        }
    }

    public String conservationVideoErrorData(String str, Integer num) {
        HashMap map = new HashMap();
        map.put("event_id", "conservation_video_message");
        map.put(BaseSei.INFO, str);
        map.put("value", Integer.valueOf(num.intValue() == 400104 ? 1 : 0));
        map.put("Done", 1);
        return new JSONObject(map).toString();
    }

    public String makeCatchErrorData() {
        if (this.f61403a == null) {
            this.f61403a = new HashMap();
        }
        ArrayList arrayList = this.f61403a.containsKey(BaseSei.INFO) ? (ArrayList) this.f61403a.get(BaseSei.INFO) : new ArrayList();
        this.f61403a.put(BaseSei.INFO, arrayList.toString());
        this.f61403a.put("value", Integer.valueOf(arrayList.size() == 0 ? 0 : 1));
        this.f61403a.put("event_id", "YTCatchError");
        this.f61403a.put("Done", 1);
        JSONObject jSONObject = new JSONObject(this.f61403a);
        this.f61403a.clear();
        return jSONObject.toString();
    }

    public String makePackUseTime() {
        long jLongValue;
        HashMap map = new HashMap();
        map.put("event_id", "MakePackUseTime");
        map.put("Done", 1);
        map.put(BaseSei.INFO, "");
        List<Long> list = this.f61404b;
        if (list != null) {
            Iterator<Long> it = list.iterator();
            jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            this.f61404b.clear();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            return null;
        }
        map.put("value", Long.valueOf(jLongValue));
        return new JSONObject(map).toString();
    }

    public void setCatchErrorData(String str) {
        if (!this.f61403a.containsKey(BaseSei.INFO)) {
            this.f61403a.put(BaseSei.INFO, new ArrayList());
        }
        ((ArrayList) this.f61403a.get(BaseSei.INFO)).add(str);
    }

    public void setPackUseTime(long j) {
        this.f61404b.add(Long.valueOf(j));
    }
}
