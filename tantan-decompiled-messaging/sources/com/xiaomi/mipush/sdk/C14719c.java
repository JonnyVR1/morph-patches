package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import com.xiaomi.push.C14739g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p149l.ilq0;
import p149l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14719c {

    /* JADX INFO: renamed from: e */
    private static volatile C14719c f61568e;

    /* JADX INFO: renamed from: a */
    private Context f61569a;

    /* JADX INFO: renamed from: b */
    private a f61570b;

    /* JADX INFO: renamed from: c */
    private Map<String, a> f61571c;

    /* JADX INFO: renamed from: d */
    String f61572d;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f61573a;

        /* JADX INFO: renamed from: b */
        public String f61574b;

        /* JADX INFO: renamed from: c */
        public String f61575c;

        /* JADX INFO: renamed from: d */
        public String f61576d;

        /* JADX INFO: renamed from: e */
        public String f61577e;

        /* JADX INFO: renamed from: f */
        public String f61578f;

        /* JADX INFO: renamed from: g */
        public String f61579g;

        /* JADX INFO: renamed from: h */
        public String f61580h;

        /* JADX INFO: renamed from: i */
        public boolean f61581i = true;

        /* JADX INFO: renamed from: j */
        public boolean f61582j = false;

        /* JADX INFO: renamed from: k */
        public int f61583k = 1;

        /* JADX INFO: renamed from: l */
        private Context f61584l;

        public a(Context context) {
            this.f61584l = context;
        }

        /* JADX INFO: renamed from: a */
        private String m85352a() {
            Context context = this.f61584l;
            return C14739g.m85588h(context, context.getPackageName());
        }

        /* JADX INFO: renamed from: b */
        public static String m85353b(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, aVar.f61573a);
                jSONObject.put("appToken", aVar.f61574b);
                jSONObject.put("regId", aVar.f61575c);
                jSONObject.put("regSec", aVar.f61576d);
                jSONObject.put("devId", aVar.f61578f);
                jSONObject.put("vName", aVar.f61577e);
                jSONObject.put(BLiveRightItem.PERIOD_VALID, aVar.f61581i);
                jSONObject.put("paused", aVar.f61582j);
                jSONObject.put("envType", aVar.f61583k);
                jSONObject.put("regResource", aVar.f61579g);
                return jSONObject.toString();
            } catch (Throwable th) {
                ilq0.m137044q(th);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m85354c() {
            C14719c.m85327b(this.f61584l).edit().clear().commit();
            this.f61573a = null;
            this.f61574b = null;
            this.f61575c = null;
            this.f61576d = null;
            this.f61578f = null;
            this.f61577e = null;
            this.f61581i = false;
            this.f61582j = false;
            this.f61580h = null;
            this.f61583k = 1;
        }

        /* JADX INFO: renamed from: d */
        public void m85355d(int i) {
            this.f61583k = i;
        }

        /* JADX INFO: renamed from: e */
        public void m85356e(String str, String str2) {
            this.f61575c = str;
            this.f61576d = str2;
            this.f61578f = ouq0.m166087A(this.f61584l);
            this.f61577e = m85352a();
            this.f61581i = true;
        }

        /* JADX INFO: renamed from: f */
        public void m85357f(String str, String str2, String str3) {
            this.f61573a = str;
            this.f61574b = str2;
            this.f61579g = str3;
            SharedPreferences.Editor editorEdit = C14719c.m85327b(this.f61584l).edit();
            editorEdit.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f61573a);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        /* JADX INFO: renamed from: g */
        public void m85358g(boolean z) {
            this.f61582j = z;
        }

        /* JADX INFO: renamed from: h */
        public boolean m85359h() {
            return m85360i(this.f61573a, this.f61574b);
        }

        /* JADX INFO: renamed from: i */
        public boolean m85360i(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f61573a, str);
            boolean zEquals2 = TextUtils.equals(this.f61574b, str2);
            boolean zIsEmpty = TextUtils.isEmpty(this.f61575c);
            boolean z = !zIsEmpty;
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f61576d);
            boolean z2 = !zIsEmpty2;
            boolean z3 = false;
            boolean z4 = TextUtils.isEmpty(ouq0.m166107p(this.f61584l)) || TextUtils.equals(this.f61578f, ouq0.m166087A(this.f61584l)) || TextUtils.equals(this.f61578f, ouq0.m166117z(this.f61584l));
            if (zEquals && zEquals2 && !zIsEmpty && !zIsEmpty2 && z4) {
                z3 = true;
            }
            if (!z3) {
                ilq0.m137027D(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z4)));
            }
            return z3;
        }

        /* JADX INFO: renamed from: j */
        public void m85361j() {
            this.f61581i = false;
            C14719c.m85327b(this.f61584l).edit().putBoolean(BLiveRightItem.PERIOD_VALID, this.f61581i).commit();
        }

        /* JADX INFO: renamed from: k */
        public void m85362k(String str, String str2, String str3) {
            this.f61575c = str;
            this.f61576d = str2;
            this.f61578f = ouq0.m166087A(this.f61584l);
            this.f61577e = m85352a();
            this.f61581i = true;
            this.f61580h = str3;
            SharedPreferences.Editor editorEdit = C14719c.m85327b(this.f61584l).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString("devId", this.f61578f);
            editorEdit.putString("vName", m85352a());
            editorEdit.putBoolean(BLiveRightItem.PERIOD_VALID, true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }
    }

    private C14719c(Context context) {
        this.f61569a = context;
        m85329r();
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m85327b(Context context) {
        return context.getSharedPreferences(MiPushReceiver.PUSH_NAME, 0);
    }

    /* JADX INFO: renamed from: c */
    public static C14719c m85328c(Context context) {
        if (f61568e == null) {
            synchronized (C14719c.class) {
                try {
                    if (f61568e == null) {
                        f61568e = new C14719c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f61568e;
    }

    /* JADX INFO: renamed from: r */
    private void m85329r() {
        this.f61570b = new a(this.f61569a);
        this.f61571c = new HashMap();
        SharedPreferences sharedPreferencesM85327b = m85327b(this.f61569a);
        this.f61570b.f61573a = sharedPreferencesM85327b.getString(RemoteConfigConstants.RequestFieldKey.APP_ID, null);
        this.f61570b.f61574b = sharedPreferencesM85327b.getString("appToken", null);
        this.f61570b.f61575c = sharedPreferencesM85327b.getString("regId", null);
        this.f61570b.f61576d = sharedPreferencesM85327b.getString("regSec", null);
        this.f61570b.f61578f = sharedPreferencesM85327b.getString("devId", null);
        if (!TextUtils.isEmpty(this.f61570b.f61578f) && ouq0.m166104m(this.f61570b.f61578f)) {
            this.f61570b.f61578f = ouq0.m166087A(this.f61569a);
            sharedPreferencesM85327b.edit().putString("devId", this.f61570b.f61578f).commit();
        }
        this.f61570b.f61577e = sharedPreferencesM85327b.getString("vName", null);
        this.f61570b.f61581i = sharedPreferencesM85327b.getBoolean(BLiveRightItem.PERIOD_VALID, true);
        this.f61570b.f61582j = sharedPreferencesM85327b.getBoolean("paused", false);
        this.f61570b.f61583k = sharedPreferencesM85327b.getInt("envType", 1);
        this.f61570b.f61579g = sharedPreferencesM85327b.getString("regResource", null);
        this.f61570b.f61580h = sharedPreferencesM85327b.getString("appRegion", null);
    }

    /* JADX INFO: renamed from: a */
    public int m85330a() {
        return this.f61570b.f61583k;
    }

    /* JADX INFO: renamed from: d */
    public String m85331d() {
        return this.f61570b.f61573a;
    }

    /* JADX INFO: renamed from: e */
    public void m85332e() {
        this.f61570b.m85354c();
    }

    /* JADX INFO: renamed from: f */
    public void m85333f(int i) {
        this.f61570b.m85355d(i);
        m85327b(this.f61569a).edit().putInt("envType", i).commit();
    }

    /* JADX INFO: renamed from: g */
    public void m85334g(String str) {
        SharedPreferences.Editor editorEdit = m85327b(this.f61569a).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.f61570b.f61577e = str;
    }

    /* JADX INFO: renamed from: h */
    public void m85335h(String str, a aVar) {
        this.f61571c.put(str, aVar);
        m85327b(this.f61569a).edit().putString("hybrid_app_info_" + str, a.m85353b(aVar)).commit();
    }

    /* JADX INFO: renamed from: i */
    public void m85336i(String str, String str2, String str3) {
        this.f61570b.m85357f(str, str2, str3);
    }

    /* JADX INFO: renamed from: j */
    public void m85337j(boolean z) {
        this.f61570b.m85358g(z);
        m85327b(this.f61569a).edit().putBoolean("paused", z).commit();
    }

    /* JADX INFO: renamed from: k */
    public boolean m85338k() {
        Context context = this.f61569a;
        return !TextUtils.equals(C14739g.m85588h(context, context.getPackageName()), this.f61570b.f61577e);
    }

    /* JADX INFO: renamed from: l */
    public boolean m85339l(String str, String str2) {
        return this.f61570b.m85360i(str, str2);
    }

    /* JADX INFO: renamed from: m */
    public String m85340m() {
        return this.f61570b.f61574b;
    }

    /* JADX INFO: renamed from: n */
    public void m85341n() {
        this.f61570b.m85361j();
    }

    /* JADX INFO: renamed from: o */
    public void m85342o(String str, String str2, String str3) {
        this.f61570b.m85362k(str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m85343p() {
        if (this.f61570b.m85359h()) {
            return true;
        }
        ilq0.m137040m("Don't send message before initialization succeeded!");
        return false;
    }

    /* JADX INFO: renamed from: q */
    public String m85344q() {
        return this.f61570b.f61575c;
    }

    /* JADX INFO: renamed from: s */
    public boolean m85345s() {
        return this.f61570b.m85359h();
    }

    /* JADX INFO: renamed from: t */
    public String m85346t() {
        return this.f61570b.f61576d;
    }

    /* JADX INFO: renamed from: u */
    public boolean m85347u() {
        return (TextUtils.isEmpty(this.f61570b.f61573a) || TextUtils.isEmpty(this.f61570b.f61574b) || TextUtils.isEmpty(this.f61570b.f61575c) || TextUtils.isEmpty(this.f61570b.f61576d)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public String m85348v() {
        return this.f61570b.f61579g;
    }

    /* JADX INFO: renamed from: w */
    public boolean m85349w() {
        return this.f61570b.f61582j;
    }

    /* JADX INFO: renamed from: x */
    public String m85350x() {
        return this.f61570b.f61580h;
    }

    /* JADX INFO: renamed from: y */
    public boolean m85351y() {
        return !this.f61570b.f61581i;
    }
}
