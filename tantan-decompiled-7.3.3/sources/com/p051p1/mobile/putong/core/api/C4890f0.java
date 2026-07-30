package com.p051p1.mobile.putong.core.api;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Condition;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4890f0 {

    /* JADX INFO: renamed from: a */
    public int f20556a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f20557b = false;

    /* JADX INFO: renamed from: c */
    public boolean f20558c = false;

    /* JADX INFO: renamed from: d */
    public a[] f20559d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f20560a = 100;

        /* JADX INFO: renamed from: b */
        public b[] f20561b;

        /* JADX INFO: renamed from: c */
        public C22813a f20562c;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$a, reason: collision with other inner class name */
        public static class C22813a {

            /* JADX INFO: renamed from: a */
            public String f20563a = "basic";

            /* JADX INFO: renamed from: b */
            public C22813a[] f20564b;

            /* JADX INFO: renamed from: c */
            public String f20565c;

            /* JADX INFO: renamed from: d */
            public String f20566d;

            /* JADX INFO: renamed from: e */
            public String f20567e;

            /* JADX INFO: renamed from: b */
            public static C22813a m32985b() {
                C22813a c22813a = new C22813a();
                c22813a.f20565c = HttpHeaders.AGE;
                return c22813a;
            }

            /* JADX INFO: renamed from: c */
            public static C22813a m32986c(C22813a... c22813aArr) {
                C22813a c22813a = new C22813a();
                c22813a.f20563a = "and";
                c22813a.f20564b = c22813aArr;
                return c22813a;
            }

            /* JADX INFO: renamed from: d */
            public static C22813a m32987d() {
                C22813a c22813a = new C22813a();
                c22813a.f20565c = "Distance";
                return c22813a;
            }

            /* JADX INFO: renamed from: e */
            public C22813a m32988e(String str) {
                this.f20566d = "<=";
                this.f20567e = str;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public JSONObject m32989f() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f20563a);
                if (!"and".equals(this.f20563a)) {
                    jSONObject.put("field", this.f20565c);
                    jSONObject.put("op", this.f20566d);
                    jSONObject.put("val", this.f20567e);
                    return jSONObject;
                }
                if (this.f20564b != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C22813a c22813a : this.f20564b) {
                        jSONArray.put(c22813a.m32989f());
                    }
                    jSONObject.put("exps", jSONArray);
                }
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f0$a$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public String f20568a = "basic";

            /* JADX INFO: renamed from: b */
            public String f20569b;

            /* JADX INFO: renamed from: c */
            public String f20570c;

            /* JADX INFO: renamed from: c */
            public static b m32990c() {
                b bVar = new b();
                bVar.f20569b = "Distance";
                return bVar;
            }

            /* JADX INFO: renamed from: d */
            public static b m32991d() {
                b bVar = new b();
                bVar.f20569b = "LikedTime";
                return bVar;
            }

            /* JADX INFO: renamed from: a */
            public b m32992a() {
                this.f20570c = "asc";
                return this;
            }

            /* JADX INFO: renamed from: b */
            public b m32993b() {
                this.f20570c = SocialConstants.PARAM_APP_DESC;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public JSONObject m32994e() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f20568a);
                jSONObject.put("field", this.f20569b);
                jSONObject.put("modifier", this.f20570c);
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: a */
        public a m32980a(int i) {
            this.f20560a = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m32981b(C22813a... c22813aArr) {
            this.f20562c = C22813a.m32986c(c22813aArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m32982c(b... bVarArr) {
            this.f20561b = bVarArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public JSONObject m32983d() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidateCount", this.f20560a);
            if (this.f20561b != null) {
                JSONArray jSONArray = new JSONArray();
                for (b bVar : this.f20561b) {
                    if (bVar != null) {
                        jSONArray.put(bVar.m32994e());
                    }
                }
                jSONObject.put("orderby", jSONArray);
            }
            C22813a c22813a = this.f20562c;
            if (c22813a != null) {
                jSONObject.put("filter", c22813a.m32989f());
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public C4890f0 m32976a(a... aVarArr) {
        this.f20559d = aVarArr;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C4890f0 m32977b() {
        this.f20557b = true;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m32978c() {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(Constants.KEY_LIMIT, String.valueOf(this.f20556a));
        if (this.f20557b) {
            builder.appendQueryParameter(BLivePkInviteSource.query, "count");
        }
        if (this.f20558c) {
            builder.appendQueryParameter("verified", "true");
        }
        if (this.f20559d != null) {
            JSONArray jSONArray = new JSONArray();
            for (a aVar : this.f20559d) {
                if (aVar != null) {
                    try {
                        jSONArray.put(aVar.m32983d());
                    } catch (JSONException e) {
                        CrashHelper.m82479c(e);
                    }
                }
            }
            builder.appendQueryParameter(Condition.TYPE, jSONArray.toString());
        }
        return C4879a.m32180A0(builder.build().getQuery());
    }

    /* JADX INFO: renamed from: d */
    public C4890f0 m32979d() {
        this.f20558c = true;
        return this;
    }
}
