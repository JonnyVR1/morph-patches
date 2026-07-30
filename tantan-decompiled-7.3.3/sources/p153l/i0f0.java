package p153l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class i0f0 {

    /* JADX INFO: renamed from: f */
    public static Resources f112353f;

    /* JADX INFO: renamed from: g */
    public static Configuration f112354g;

    /* JADX INFO: renamed from: a */
    public static jxd0 f112348a = new jxd0("debug_shadow_test", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public static HashMap<Integer, String> f112349b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static List<C17609b> f112350c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final e7y f112351d = e7y.m119773d("application/json; charset=utf-8");

    /* JADX INFO: renamed from: e */
    public static List<Locale> f112352e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static Paint f112355h = new Paint();

    /* JADX INFO: renamed from: i */
    public static final Class<?>[] f112356i = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: l.i0f0$a */
    public static class C17608a {

        /* JADX INFO: renamed from: a */
        public String f112357a;

        /* JADX INFO: renamed from: b */
        public String f112358b = "Android";

        /* JADX INFO: renamed from: c */
        public String f112359c = "tantan";

        /* JADX INFO: renamed from: d */
        public List<C17609b> f112360d;

        /* JADX INFO: renamed from: a */
        public static C17608a m137963a(List<C17609b> list) {
            C17608a c17608a = new C17608a();
            c17608a.f112360d = list;
            c17608a.f112357a = uqb0.f180397c0.userId();
            return c17608a;
        }

        /* JADX INFO: renamed from: b */
        public String m137964b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userID", this.f112357a);
                jSONObject.put("platform", this.f112358b);
                jSONObject.put("app", this.f112359c);
                JSONArray jSONArray = new JSONArray();
                for (C17609b c17609b : this.f112360d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c17609b.f112361a);
                    jSONObject2.put(Constants.KEY_KEY, c17609b.f112362b);
                    jSONObject2.put("value", c17609b.f112363c);
                    jSONObject2.put("maxFrom", c17609b.f112364d);
                    jSONObject2.put("maxValue", c17609b.f112365e);
                    jSONObject2.put("maxLength", c17609b.f112366f);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("data", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                e.printStackTrace();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: l.i0f0$b */
    public static class C17609b {

        /* JADX INFO: renamed from: a */
        public String f112361a;

        /* JADX INFO: renamed from: b */
        public String f112362b;

        /* JADX INFO: renamed from: c */
        public String f112363c;

        /* JADX INFO: renamed from: d */
        public String f112364d;

        /* JADX INFO: renamed from: e */
        public String f112365e;

        /* JADX INFO: renamed from: f */
        public float f112366f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m137959a(rg50 rg50Var, x1d0 x1d0Var) {
        try {
            try {
                ua5.m195158b(rg50Var.mo181341a(x1d0Var).execute());
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                ua5.m195158b(null);
            }
        } catch (Throwable th) {
            ua5.m195158b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m137960b() {
        f112348a.put(Boolean.FALSE);
        Configuration configuration = f112354g;
        if (configuration != null) {
            Resources resources = f112353f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m137961c() {
        f112348a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static void m137962d() {
        final rg50 rg50Var = uqb0.f180368D;
        final x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q("https://ones-api.tantanapp.com/ci-proxy/lokalise/save-shadow-key").m209038l(z1d0.create(f112351d, C17608a.m137963a(f112350c).m137964b())).m209028b();
        l51.m152919y(new Runnable() { // from class: l.h0f0
            @Override // java.lang.Runnable
            public final void run() {
                i0f0.m137959a(rg50Var, x1d0VarM209028b);
            }
        });
    }
}
