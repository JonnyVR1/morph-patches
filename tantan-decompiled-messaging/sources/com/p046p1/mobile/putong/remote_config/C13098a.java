package com.p046p1.mobile.putong.remote_config;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13098a {

    /* JADX INFO: renamed from: d */
    public static final Date f54257d = new Date(0);

    /* JADX INFO: renamed from: a */
    public JSONObject f54258a;

    /* JADX INFO: renamed from: b */
    public JSONObject f54259b;

    /* JADX INFO: renamed from: c */
    public Date f54260c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public JSONObject f54261a;

        /* JADX INFO: renamed from: b */
        public Date f54262b;

        public a() {
            this.f54261a = new JSONObject();
            this.f54262b = C13098a.f54257d;
        }

        /* JADX INFO: renamed from: a */
        public C13098a m79345a() throws JSONException {
            return new C13098a(this.f54261a, this.f54262b);
        }

        /* JADX INFO: renamed from: b */
        public a m79346b(JSONObject jSONObject) {
            try {
                this.f54261a = new JSONObject(jSONObject.toString());
                return this;
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                return this;
            }
        }

        /* JADX INFO: renamed from: c */
        public a m79347c(Date date) {
            this.f54262b = date;
            return this;
        }
    }

    public C13098a(JSONObject jSONObject, Date date) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("configs_key", jSONObject);
        this.f54259b = jSONObject;
        this.f54260c = date;
        this.f54258a = jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static C13098a m79340b(JSONObject jSONObject) throws JSONException {
        return new C13098a(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")));
    }

    /* JADX INFO: renamed from: f */
    public static a m79341f() {
        return new a();
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m79342c() {
        HashMap map = new HashMap();
        JSONObject jSONObject = this.f54259b;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, this.f54259b.getString(next));
                }
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m79343d() {
        return this.f54259b;
    }

    /* JADX INFO: renamed from: e */
    public Date m79344e() {
        return this.f54260c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13098a) {
            return this.f54258a.toString().equals(((C13098a) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.f54258a.hashCode();
    }

    public String toString() {
        return this.f54258a.toString();
    }
}
