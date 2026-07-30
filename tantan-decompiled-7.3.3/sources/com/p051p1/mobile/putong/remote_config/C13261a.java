package com.p051p1.mobile.putong.remote_config;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a */
/* JADX INFO: loaded from: classes10.dex */
public class C13261a {

    /* JADX INFO: renamed from: d */
    public static final Date f55105d = new Date(0);

    /* JADX INFO: renamed from: a */
    public JSONObject f55106a;

    /* JADX INFO: renamed from: b */
    public JSONObject f55107b;

    /* JADX INFO: renamed from: c */
    public Date f55108c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public JSONObject f55109a;

        /* JADX INFO: renamed from: b */
        public Date f55110b;

        public a() {
            this.f55109a = new JSONObject();
            this.f55110b = C13261a.f55105d;
        }

        /* JADX INFO: renamed from: a */
        public C13261a m80528a() throws JSONException {
            return new C13261a(this.f55109a, this.f55110b);
        }

        /* JADX INFO: renamed from: b */
        public a m80529b(JSONObject jSONObject) {
            try {
                this.f55109a = new JSONObject(jSONObject.toString());
                return this;
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                return this;
            }
        }

        /* JADX INFO: renamed from: c */
        public a m80530c(Date date) {
            this.f55110b = date;
            return this;
        }
    }

    public C13261a(JSONObject jSONObject, Date date) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("configs_key", jSONObject);
        this.f55107b = jSONObject;
        this.f55108c = date;
        this.f55106a = jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static C13261a m80523b(JSONObject jSONObject) throws JSONException {
        return new C13261a(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")));
    }

    /* JADX INFO: renamed from: f */
    public static a m80524f() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m80525c() {
        HashMap map = new HashMap();
        JSONObject jSONObject = this.f55107b;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, this.f55107b.getString(next));
                }
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m80526d() {
        return this.f55107b;
    }

    /* JADX INFO: renamed from: e */
    public Date m80527e() {
        return this.f55108c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13261a) {
            return this.f55106a.toString().equals(((C13261a) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f55106a.hashCode();
    }

    public String toString() {
        return this.f55106a.toString();
    }
}
