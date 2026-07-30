package com.p046p1.mobile.putong.core.api;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Condition;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4739f0 {

    /* JADX INFO: renamed from: a */
    public int f19814a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f19815b = false;

    /* JADX INFO: renamed from: c */
    public boolean f19816c = false;

    /* JADX INFO: renamed from: d */
    public a[] f19817d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f19818a = 100;

        /* JADX INFO: renamed from: b */
        public b[] f19819b;

        /* JADX INFO: renamed from: c */
        public C22697a f19820c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$a, reason: collision with other inner class name */
        public static class C22697a {

            /* JADX INFO: renamed from: a */
            public String f19821a = "basic";

            /* JADX INFO: renamed from: b */
            public C22697a[] f19822b;

            /* JADX INFO: renamed from: c */
            public String f19823c;

            /* JADX INFO: renamed from: d */
            public String f19824d;

            /* JADX INFO: renamed from: e */
            public String f19825e;

            /* JADX INFO: renamed from: b */
            public static C22697a m31982b() {
                C22697a c22697a = new C22697a();
                c22697a.f19823c = HttpHeaders.AGE;
                return c22697a;
            }

            /* JADX INFO: renamed from: c */
            public static C22697a m31983c(C22697a... c22697aArr) {
                C22697a c22697a = new C22697a();
                c22697a.f19821a = "and";
                c22697a.f19822b = c22697aArr;
                return c22697a;
            }

            /* JADX INFO: renamed from: d */
            public static C22697a m31984d() {
                C22697a c22697a = new C22697a();
                c22697a.f19823c = "Distance";
                return c22697a;
            }

            /* JADX INFO: renamed from: e */
            public C22697a m31985e(String str) {
                this.f19824d = "<=";
                this.f19825e = str;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public JSONObject m31986f() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f19821a);
                if (!"and".equals(this.f19821a)) {
                    jSONObject.put("field", this.f19823c);
                    jSONObject.put("op", this.f19824d);
                    jSONObject.put("val", this.f19825e);
                    return jSONObject;
                }
                if (this.f19822b != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C22697a c22697a : this.f19822b) {
                        jSONArray.put(c22697a.m31986f());
                    }
                    jSONObject.put("exps", jSONArray);
                }
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public String f19826a = "basic";

            /* JADX INFO: renamed from: b */
            public String f19827b;

            /* JADX INFO: renamed from: c */
            public String f19828c;

            /* JADX INFO: renamed from: c */
            public static b m31987c() {
                b bVar = new b();
                bVar.f19827b = "Distance";
                return bVar;
            }

            /* JADX INFO: renamed from: d */
            public static b m31988d() {
                b bVar = new b();
                bVar.f19827b = "LikedTime";
                return bVar;
            }

            /* JADX INFO: renamed from: a */
            public b m31989a() {
                this.f19828c = "asc";
                return this;
            }

            /* JADX INFO: renamed from: b */
            public b m31990b() {
                this.f19828c = SocialConstants.PARAM_APP_DESC;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public JSONObject m31991e() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f19826a);
                jSONObject.put("field", this.f19827b);
                jSONObject.put("modifier", this.f19828c);
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: a */
        public a m31977a(int i) {
            this.f19818a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m31978b(C22697a... c22697aArr) {
            this.f19820c = C22697a.m31983c(c22697aArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m31979c(b... bVarArr) {
            this.f19819b = bVarArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public JSONObject m31980d() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidateCount", this.f19818a);
            if (this.f19819b != null) {
                JSONArray jSONArray = new JSONArray();
                for (b bVar : this.f19819b) {
                    if (bVar != null) {
                        jSONArray.put(bVar.m31991e());
                    }
                }
                jSONObject.put("orderby", jSONArray);
            }
            C22697a c22697a = this.f19820c;
            if (c22697a != null) {
                jSONObject.put("filter", c22697a.m31986f());
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public C4739f0 m31973a(a... aVarArr) {
        this.f19817d = aVarArr;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C4739f0 m31974b() {
        this.f19815b = true;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m31975c() {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(Constants.KEY_LIMIT, String.valueOf(this.f19814a));
        if (this.f19815b) {
            builder.appendQueryParameter(BLivePkInviteSource.query, "count");
        }
        if (this.f19816c) {
            builder.appendQueryParameter("verified", "true");
        }
        if (this.f19817d != null) {
            JSONArray jSONArray = new JSONArray();
            for (a aVar : this.f19817d) {
                if (aVar != null) {
                    try {
                        jSONArray.put(aVar.m31980d());
                    } catch (JSONException e) {
                        CrashHelper.m81296c(e);
                    }
                }
            }
            builder.appendQueryParameter(Condition.TYPE, jSONArray.toString());
        }
        return C4728a.m31177A0(builder.build().getQuery());
    }

    /* JADX INFO: renamed from: d */
    public C4739f0 m31976d() {
        this.f19816c = true;
        return this;
    }
}
