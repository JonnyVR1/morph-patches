package p009l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import l.e51;
import l.hpd0;
import l.hyx;
import l.k850;
import l.qib0;
import l.stc0;
import l.t95;
import l.utc0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bse0 {

    /* JADX INFO: renamed from: f */
    public static Resources f10280f;

    /* JADX INFO: renamed from: g */
    public static Configuration f10281g;

    /* JADX INFO: renamed from: a */
    public static hpd0 f10275a = new hpd0("debug_shadow_test", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public static HashMap<Integer, String> f10276b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static List<C0791b> f10277c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final hyx f10278d = hyx.d("application/json; charset=utf-8");

    /* JADX INFO: renamed from: e */
    public static List<Locale> f10279e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static Paint f10282h = new Paint();

    /* JADX INFO: renamed from: i */
    public static final Class<?>[] f10283i = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: l.bse0$a */
    public static class C0790a {

        /* JADX INFO: renamed from: a */
        public String f10284a;

        /* JADX INFO: renamed from: b */
        public String f10285b = "Android";

        /* JADX INFO: renamed from: c */
        public String f10286c = "tantan";

        /* JADX INFO: renamed from: d */
        public List<C0791b> f10287d;

        /* JADX INFO: renamed from: a */
        public static C0790a m12228a(List<C0791b> list) {
            C0790a c0790a = new C0790a();
            c0790a.f10287d = list;
            c0790a.f10284a = qib0.c0.userId();
            return c0790a;
        }

        /* JADX INFO: renamed from: b */
        public String m12229b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userID", this.f10284a);
                jSONObject.put(ShareEventActivity.PLATFORM, this.f10285b);
                jSONObject.put("app", this.f10286c);
                JSONArray jSONArray = new JSONArray();
                for (C0791b c0791b : this.f10287d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c0791b.f10288a);
                    jSONObject2.put("key", c0791b.f10289b);
                    jSONObject2.put("value", c0791b.f10290c);
                    jSONObject2.put("maxFrom", c0791b.f10291d);
                    jSONObject2.put("maxValue", c0791b.f10292e);
                    jSONObject2.put("maxLength", c0791b.f10293f);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.c(e);
                e.printStackTrace();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: l.bse0$b */
    public static class C0791b {

        /* JADX INFO: renamed from: a */
        public String f10288a;

        /* JADX INFO: renamed from: b */
        public String f10289b;

        /* JADX INFO: renamed from: c */
        public String f10290c;

        /* JADX INFO: renamed from: d */
        public String f10291d;

        /* JADX INFO: renamed from: e */
        public String f10292e;

        /* JADX INFO: renamed from: f */
        public float f10293f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12224a(k850 k850Var, stc0 stc0Var) {
        try {
            try {
                t95.b(k850Var.a(stc0Var).execute());
            } catch (Exception e) {
                CrashHelper.c(e);
                t95.b((Closeable) null);
            }
        } catch (Throwable th) {
            t95.b((Closeable) null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12225b() {
        f10275a.put(Boolean.FALSE);
        Configuration configuration = f10281g;
        if (configuration != null) {
            Resources resources = f10280f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12226c() {
        f10275a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public static void m12227d() {
        final k850 k850Var = qib0.D;
        final stc0 stc0VarB = new stc0.a().q("https://ones-api.tantanapp.com/ci-proxy/lokalise/save-shadow-key").l(utc0.create(f10278d, C0790a.m12228a(f10277c).m12229b())).b();
        e51.y(new Runnable() { // from class: l.ase0
            @Override // java.lang.Runnable
            public final void run() {
                bse0.m12224a(k850Var, stc0VarB);
            }
        });
    }
}
