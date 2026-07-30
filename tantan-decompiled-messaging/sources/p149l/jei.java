package p149l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
class jei {

    /* JADX INFO: renamed from: a */
    private volatile boolean f117576a = false;

    /* JADX INFO: renamed from: b */
    private Set<String> f117577b = new HashSet();

    /* JADX INFO: renamed from: c */
    private Set<String> f117578c = new HashSet();

    /* JADX INFO: renamed from: d */
    private boolean m141132d(Set<String> set, String str) {
        if (set != null) {
            if ("".equalsIgnoreCase(str)) {
                str = WeJson.EMPTY_ARR;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        set.add(jSONArray.optString(i));
                    }
                    return true;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m141133a() {
        if (this.f117576a) {
            return;
        }
        String strM154209o = mei.m154209o();
        String strM154208n = mei.m154208n();
        MDLog.m7389d("FepPublishManager", "black hosts: " + strM154209o + " black bids:" + strM154208n);
        this.f117576a = m141132d(this.f117577b, strM154209o) && m141132d(this.f117578c, strM154208n);
    }

    /* JADX INFO: renamed from: b */
    public boolean m141134b(String str) {
        m141133a();
        return this.f117578c.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m141135c(String str) {
        m141133a();
        return this.f117577b.contains(str);
    }
}
