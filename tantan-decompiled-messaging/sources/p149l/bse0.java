package p149l;

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

/* JADX INFO: loaded from: classes11.dex */
public class bse0 {

    /* JADX INFO: renamed from: f */
    public static Resources f77068f;

    /* JADX INFO: renamed from: g */
    public static Configuration f77069g;

    /* JADX INFO: renamed from: a */
    public static hpd0 f77063a = new hpd0("debug_shadow_test", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public static HashMap<Integer, String> f77064b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static List<C15955b> f77065c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final hyx f77066d = hyx.m133628d("application/json; charset=utf-8");

    /* JADX INFO: renamed from: e */
    public static List<Locale> f77067e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static Paint f77070h = new Paint();

    /* JADX INFO: renamed from: i */
    public static final Class<?>[] f77071i = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: l.bse0$a */
    public static class C15954a {

        /* JADX INFO: renamed from: a */
        public String f77072a;

        /* JADX INFO: renamed from: b */
        public String f77073b = "Android";

        /* JADX INFO: renamed from: c */
        public String f77074c = "tantan";

        /* JADX INFO: renamed from: d */
        public List<C15955b> f77075d;

        /* JADX INFO: renamed from: a */
        public static C15954a m103702a(List<C15955b> list) {
            C15954a c15954a = new C15954a();
            c15954a.f77075d = list;
            c15954a.f77072a = qib0.f154714c0.userId();
            return c15954a;
        }

        /* JADX INFO: renamed from: b */
        public String m103703b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userID", this.f77072a);
                jSONObject.put("platform", this.f77073b);
                jSONObject.put("app", this.f77074c);
                JSONArray jSONArray = new JSONArray();
                for (C15955b c15955b : this.f77075d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c15955b.f77076a);
                    jSONObject2.put(Constants.KEY_KEY, c15955b.f77077b);
                    jSONObject2.put("value", c15955b.f77078c);
                    jSONObject2.put("maxFrom", c15955b.f77079d);
                    jSONObject2.put("maxValue", c15955b.f77080e);
                    jSONObject2.put("maxLength", c15955b.f77081f);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("data", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                e.printStackTrace();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: l.bse0$b */
    public static class C15955b {

        /* JADX INFO: renamed from: a */
        public String f77076a;

        /* JADX INFO: renamed from: b */
        public String f77077b;

        /* JADX INFO: renamed from: c */
        public String f77078c;

        /* JADX INFO: renamed from: d */
        public String f77079d;

        /* JADX INFO: renamed from: e */
        public String f77080e;

        /* JADX INFO: renamed from: f */
        public float f77081f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103698a(k850 k850Var, stc0 stc0Var) {
        try {
            try {
                t95.m187604b(k850Var.mo144849a(stc0Var).execute());
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                t95.m187604b(null);
            }
        } catch (Throwable th) {
            t95.m187604b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m103699b() {
        f77063a.put(Boolean.FALSE);
        Configuration configuration = f77069g;
        if (configuration != null) {
            Resources resources = f77068f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m103700c() {
        f77063a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static void m103701d() {
        final k850 k850Var = qib0.f154685D;
        final stc0 stc0VarM185883b = new stc0.C20027a().m185898q("https://ones-api.tantanapp.com/ci-proxy/lokalise/save-shadow-key").m185893l(utc0.create(f77066d, C15954a.m103702a(f77065c).m103703b())).m185883b();
        e51.m114774y(new Runnable() { // from class: l.ase0
            @Override // java.lang.Runnable
            public final void run() {
                bse0.m103698a(k850Var, stc0VarM185883b);
            }
        });
    }
}
