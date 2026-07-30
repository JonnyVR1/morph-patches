package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.tantanapp.push.xiaomi.MiPushReceiver;
import com.xiaomi.push.C14887g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p153l.ouq0;
import p153l.u3r0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14867c {

    /* JADX INFO: renamed from: e */
    private static volatile C14867c f62415e;

    /* JADX INFO: renamed from: a */
    private Context f62416a;

    /* JADX INFO: renamed from: b */
    private a f62417b;

    /* JADX INFO: renamed from: c */
    private Map<String, a> f62418c;

    /* JADX INFO: renamed from: d */
    String f62419d;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f62420a;

        /* JADX INFO: renamed from: b */
        public String f62421b;

        /* JADX INFO: renamed from: c */
        public String f62422c;

        /* JADX INFO: renamed from: d */
        public String f62423d;

        /* JADX INFO: renamed from: e */
        public String f62424e;

        /* JADX INFO: renamed from: f */
        public String f62425f;

        /* JADX INFO: renamed from: g */
        public String f62426g;

        /* JADX INFO: renamed from: h */
        public String f62427h;

        /* JADX INFO: renamed from: i */
        public boolean f62428i = true;

        /* JADX INFO: renamed from: j */
        public boolean f62429j = false;

        /* JADX INFO: renamed from: k */
        public int f62430k = 1;

        /* JADX INFO: renamed from: l */
        private Context f62431l;

        public a(Context context) {
            this.f62431l = context;
        }

        /* JADX INFO: renamed from: a */
        private String m86523a() {
            Context context = this.f62431l;
            return C14887g.m86759h(context, context.getPackageName());
        }

        /* JADX INFO: renamed from: b */
        public static String m86524b(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, aVar.f62420a);
                jSONObject.put("appToken", aVar.f62421b);
                jSONObject.put("regId", aVar.f62422c);
                jSONObject.put("regSec", aVar.f62423d);
                jSONObject.put("devId", aVar.f62425f);
                jSONObject.put("vName", aVar.f62424e);
                jSONObject.put(BLiveRightItem.PERIOD_VALID, aVar.f62428i);
                jSONObject.put("paused", aVar.f62429j);
                jSONObject.put("envType", aVar.f62430k);
                jSONObject.put("regResource", aVar.f62426g);
                return jSONObject.toString();
            } catch (Throwable th) {
                ouq0.m169397q(th);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m86525c() {
            C14867c.m86498b(this.f62431l).edit().clear().commit();
            this.f62420a = null;
            this.f62421b = null;
            this.f62422c = null;
            this.f62423d = null;
            this.f62425f = null;
            this.f62424e = null;
            this.f62428i = false;
            this.f62429j = false;
            this.f62427h = null;
            this.f62430k = 1;
        }

        /* JADX INFO: renamed from: d */
        public void m86526d(int i) {
            this.f62430k = i;
        }

        /* JADX INFO: renamed from: e */
        public void m86527e(String str, String str2) {
            this.f62422c = str;
            this.f62423d = str2;
            this.f62425f = u3r0.m194388A(this.f62431l);
            this.f62424e = m86523a();
            this.f62428i = true;
        }

        /* JADX INFO: renamed from: f */
        public void m86528f(String str, String str2, String str3) {
            this.f62420a = str;
            this.f62421b = str2;
            this.f62426g = str3;
            SharedPreferences.Editor editorEdit = C14867c.m86498b(this.f62431l).edit();
            editorEdit.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f62420a);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        /* JADX INFO: renamed from: g */
        public void m86529g(boolean z) {
            this.f62429j = z;
        }

        /* JADX INFO: renamed from: h */
        public boolean m86530h() {
            return m86531i(this.f62420a, this.f62421b);
        }

        /* JADX INFO: renamed from: i */
        public boolean m86531i(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f62420a, str);
            boolean zEquals2 = TextUtils.equals(this.f62421b, str2);
            boolean zIsEmpty = TextUtils.isEmpty(this.f62422c);
            boolean z = !zIsEmpty;
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f62423d);
            boolean z2 = !zIsEmpty2;
            boolean z3 = false;
            boolean z4 = TextUtils.isEmpty(u3r0.m194408p(this.f62431l)) || TextUtils.equals(this.f62425f, u3r0.m194388A(this.f62431l)) || TextUtils.equals(this.f62425f, u3r0.m194418z(this.f62431l));
            if (zEquals && zEquals2 && !zIsEmpty && !zIsEmpty2 && z4) {
                z3 = true;
            }
            if (!z3) {
                ouq0.m169380D(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z4)));
            }
            return z3;
        }

        /* JADX INFO: renamed from: j */
        public void m86532j() {
            this.f62428i = false;
            C14867c.m86498b(this.f62431l).edit().putBoolean(BLiveRightItem.PERIOD_VALID, this.f62428i).commit();
        }

        /* JADX INFO: renamed from: k */
        public void m86533k(String str, String str2, String str3) {
            this.f62422c = str;
            this.f62423d = str2;
            this.f62425f = u3r0.m194388A(this.f62431l);
            this.f62424e = m86523a();
            this.f62428i = true;
            this.f62427h = str3;
            SharedPreferences.Editor editorEdit = C14867c.m86498b(this.f62431l).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString("devId", this.f62425f);
            editorEdit.putString("vName", m86523a());
            editorEdit.putBoolean(BLiveRightItem.PERIOD_VALID, true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }
    }

    private C14867c(Context context) {
        this.f62416a = context;
        m86500r();
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m86498b(Context context) {
        return context.getSharedPreferences(MiPushReceiver.PUSH_NAME, 0);
    }

    /* JADX INFO: renamed from: c */
    public static C14867c m86499c(Context context) {
        if (f62415e == null) {
            synchronized (C14867c.class) {
                try {
                    if (f62415e == null) {
                        f62415e = new C14867c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f62415e;
    }

    /* JADX INFO: renamed from: r */
    private void m86500r() {
        this.f62417b = new a(this.f62416a);
        this.f62418c = new HashMap();
        SharedPreferences sharedPreferencesM86498b = m86498b(this.f62416a);
        this.f62417b.f62420a = sharedPreferencesM86498b.getString(RemoteConfigConstants.RequestFieldKey.APP_ID, null);
        this.f62417b.f62421b = sharedPreferencesM86498b.getString("appToken", null);
        this.f62417b.f62422c = sharedPreferencesM86498b.getString("regId", null);
        this.f62417b.f62423d = sharedPreferencesM86498b.getString("regSec", null);
        this.f62417b.f62425f = sharedPreferencesM86498b.getString("devId", null);
        if (!TextUtils.isEmpty(this.f62417b.f62425f) && u3r0.m194405m(this.f62417b.f62425f)) {
            this.f62417b.f62425f = u3r0.m194388A(this.f62416a);
            sharedPreferencesM86498b.edit().putString("devId", this.f62417b.f62425f).commit();
        }
        this.f62417b.f62424e = sharedPreferencesM86498b.getString("vName", null);
        this.f62417b.f62428i = sharedPreferencesM86498b.getBoolean(BLiveRightItem.PERIOD_VALID, true);
        this.f62417b.f62429j = sharedPreferencesM86498b.getBoolean("paused", false);
        this.f62417b.f62430k = sharedPreferencesM86498b.getInt("envType", 1);
        this.f62417b.f62426g = sharedPreferencesM86498b.getString("regResource", null);
        this.f62417b.f62427h = sharedPreferencesM86498b.getString("appRegion", null);
    }

    /* JADX INFO: renamed from: a */
    public int m86501a() {
        return this.f62417b.f62430k;
    }

    /* JADX INFO: renamed from: d */
    public String m86502d() {
        return this.f62417b.f62420a;
    }

    /* JADX INFO: renamed from: e */
    public void m86503e() {
        this.f62417b.m86525c();
    }

    /* JADX INFO: renamed from: f */
    public void m86504f(int i) {
        this.f62417b.m86526d(i);
        m86498b(this.f62416a).edit().putInt("envType", i).commit();
    }

    /* JADX INFO: renamed from: g */
    public void m86505g(String str) {
        SharedPreferences.Editor editorEdit = m86498b(this.f62416a).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.f62417b.f62424e = str;
    }

    /* JADX INFO: renamed from: h */
    public void m86506h(String str, a aVar) {
        this.f62418c.put(str, aVar);
        m86498b(this.f62416a).edit().putString("hybrid_app_info_" + str, a.m86524b(aVar)).commit();
    }

    /* JADX INFO: renamed from: i */
    public void m86507i(String str, String str2, String str3) {
        this.f62417b.m86528f(str, str2, str3);
    }

    /* JADX INFO: renamed from: j */
    public void m86508j(boolean z) {
        this.f62417b.m86529g(z);
        m86498b(this.f62416a).edit().putBoolean("paused", z).commit();
    }

    /* JADX INFO: renamed from: k */
    public boolean m86509k() {
        Context context = this.f62416a;
        return !TextUtils.equals(C14887g.m86759h(context, context.getPackageName()), this.f62417b.f62424e);
    }

    /* JADX INFO: renamed from: l */
    public boolean m86510l(String str, String str2) {
        return this.f62417b.m86531i(str, str2);
    }

    /* JADX INFO: renamed from: m */
    public String m86511m() {
        return this.f62417b.f62421b;
    }

    /* JADX INFO: renamed from: n */
    public void m86512n() {
        this.f62417b.m86532j();
    }

    /* JADX INFO: renamed from: o */
    public void m86513o(String str, String str2, String str3) {
        this.f62417b.m86533k(str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m86514p() {
        if (this.f62417b.m86530h()) {
            return true;
        }
        ouq0.m169393m("Don't send message before initialization succeeded!");
        return false;
    }

    /* JADX INFO: renamed from: q */
    public String m86515q() {
        return this.f62417b.f62422c;
    }

    /* JADX INFO: renamed from: s */
    public boolean m86516s() {
        return this.f62417b.m86530h();
    }

    /* JADX INFO: renamed from: t */
    public String m86517t() {
        return this.f62417b.f62423d;
    }

    /* JADX INFO: renamed from: u */
    public boolean m86518u() {
        return (TextUtils.isEmpty(this.f62417b.f62420a) || TextUtils.isEmpty(this.f62417b.f62421b) || TextUtils.isEmpty(this.f62417b.f62422c) || TextUtils.isEmpty(this.f62417b.f62423d)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public String m86519v() {
        return this.f62417b.f62426g;
    }

    /* JADX INFO: renamed from: w */
    public boolean m86520w() {
        return this.f62417b.f62429j;
    }

    /* JADX INFO: renamed from: x */
    public String m86521x() {
        return this.f62417b.f62427h;
    }

    /* JADX INFO: renamed from: y */
    public boolean m86522y() {
        return !this.f62417b.f62428i;
    }
}
