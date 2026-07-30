package com.p000p1.mobile.putong.remote_config;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0500a {

    /* JADX INFO: renamed from: d */
    public static final Date f7863d = new Date(0);

    /* JADX INFO: renamed from: a */
    public JSONObject f7864a;

    /* JADX INFO: renamed from: b */
    public JSONObject f7865b;

    /* JADX INFO: renamed from: c */
    public Date f7866c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public JSONObject f7867a;

        /* JADX INFO: renamed from: b */
        public Date f7868b;

        public a() {
            this.f7867a = new JSONObject();
            this.f7868b = C0500a.f7863d;
        }

        /* JADX INFO: renamed from: a */
        public C0500a m9666a() throws JSONException {
            return new C0500a(this.f7867a, this.f7868b);
        }

        /* JADX INFO: renamed from: b */
        public a m9667b(JSONObject jSONObject) {
            try {
                this.f7867a = new JSONObject(jSONObject.toString());
                return this;
            } catch (JSONException e) {
                CrashHelper.c(e);
                return this;
            }
        }

        /* JADX INFO: renamed from: c */
        public a m9668c(Date date) {
            this.f7868b = date;
            return this;
        }
    }

    public C0500a(JSONObject jSONObject, Date date) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("configs_key", jSONObject);
        this.f7865b = jSONObject;
        this.f7866c = date;
        this.f7864a = jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static C0500a m9661b(JSONObject jSONObject) throws JSONException {
        return new C0500a(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")));
    }

    /* JADX INFO: renamed from: f */
    public static a m9662f() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m9663c() {
        HashMap map = new HashMap();
        JSONObject jSONObject = this.f7865b;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, this.f7865b.getString(next));
                }
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m9664d() {
        return this.f7865b;
    }

    /* JADX INFO: renamed from: e */
    public Date m9665e() {
        return this.f7866c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0500a) {
            return this.f7864a.toString().equals(((C0500a) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f7864a.hashCode();
    }

    public String toString() {
        return this.f7864a.toString();
    }
}
