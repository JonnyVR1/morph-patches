package com.p000p1.mobile.putong.core.api;

import android.net.Uri;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0165f0 {

    /* JADX INFO: renamed from: a */
    public int f3803a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f3804b = false;

    /* JADX INFO: renamed from: c */
    public boolean f3805c = false;

    /* JADX INFO: renamed from: d */
    public a[] f3806d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f3807a = 100;

        /* JADX INFO: renamed from: b */
        public b[] f3808b;

        /* JADX INFO: renamed from: c */
        public C1547a f3809c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$a, reason: collision with other inner class name */
        public static class C1547a {

            /* JADX INFO: renamed from: a */
            public String f3810a = "basic";

            /* JADX INFO: renamed from: b */
            public C1547a[] f3811b;

            /* JADX INFO: renamed from: c */
            public String f3812c;

            /* JADX INFO: renamed from: d */
            public String f3813d;

            /* JADX INFO: renamed from: e */
            public String f3814e;

            /* JADX INFO: renamed from: b */
            public static C1547a m3912b() {
                C1547a c1547a = new C1547a();
                c1547a.f3812c = "Age";
                return c1547a;
            }

            /* JADX INFO: renamed from: c */
            public static C1547a m3913c(C1547a... c1547aArr) {
                C1547a c1547a = new C1547a();
                c1547a.f3810a = "and";
                c1547a.f3811b = c1547aArr;
                return c1547a;
            }

            /* JADX INFO: renamed from: d */
            public static C1547a m3914d() {
                C1547a c1547a = new C1547a();
                c1547a.f3812c = "Distance";
                return c1547a;
            }

            /* JADX INFO: renamed from: e */
            public C1547a m3915e(String str) {
                this.f3813d = "<=";
                this.f3814e = str;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public JSONObject m3916f() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f3810a);
                if (!"and".equals(this.f3810a)) {
                    jSONObject.put("field", this.f3812c);
                    jSONObject.put("op", this.f3813d);
                    jSONObject.put("val", this.f3814e);
                    return jSONObject;
                }
                if (this.f3811b != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C1547a c1547a : this.f3811b) {
                        jSONArray.put(c1547a.m3916f());
                    }
                    jSONObject.put("exps", jSONArray);
                }
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public String f3815a = "basic";

            /* JADX INFO: renamed from: b */
            public String f3816b;

            /* JADX INFO: renamed from: c */
            public String f3817c;

            /* JADX INFO: renamed from: c */
            public static b m3917c() {
                b bVar = new b();
                bVar.f3816b = "Distance";
                return bVar;
            }

            /* JADX INFO: renamed from: d */
            public static b m3918d() {
                b bVar = new b();
                bVar.f3816b = "LikedTime";
                return bVar;
            }

            /* JADX INFO: renamed from: a */
            public b m3919a() {
                this.f3817c = "asc";
                return this;
            }

            /* JADX INFO: renamed from: b */
            public b m3920b() {
                this.f3817c = "desc";
                return this;
            }

            /* JADX INFO: renamed from: e */
            public JSONObject m3921e() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f3815a);
                jSONObject.put("field", this.f3816b);
                jSONObject.put("modifier", this.f3817c);
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: a */
        public a m3907a(int i) {
            this.f3807a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m3908b(C1547a... c1547aArr) {
            this.f3809c = C1547a.m3913c(c1547aArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m3909c(b... bVarArr) {
            this.f3808b = bVarArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public JSONObject m3910d() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidateCount", this.f3807a);
            if (this.f3808b != null) {
                JSONArray jSONArray = new JSONArray();
                for (b bVar : this.f3808b) {
                    if (bVar != null) {
                        jSONArray.put(bVar.m3921e());
                    }
                }
                jSONObject.put("orderby", jSONArray);
            }
            C1547a c1547a = this.f3809c;
            if (c1547a != null) {
                jSONObject.put("filter", c1547a.m3916f());
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0165f0 m3903a(a... aVarArr) {
        this.f3806d = aVarArr;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0165f0 m3904b() {
        this.f3804b = true;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m3905c() {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("limit", String.valueOf(this.f3803a));
        if (this.f3804b) {
            builder.appendQueryParameter("query", "count");
        }
        if (this.f3805c) {
            builder.appendQueryParameter("verified", "true");
        }
        if (this.f3806d != null) {
            JSONArray jSONArray = new JSONArray();
            for (a aVar : this.f3806d) {
                if (aVar != null) {
                    try {
                        jSONArray.put(aVar.m3910d());
                    } catch (JSONException e) {
                        CrashHelper.c(e);
                    }
                }
            }
            builder.appendQueryParameter("condition", jSONArray.toString());
        }
        return C0154a.m3107A0(builder.build().getQuery());
    }

    /* JADX INFO: renamed from: d */
    public C0165f0 m3906d() {
        this.f3805c = true;
        return this;
    }
}
