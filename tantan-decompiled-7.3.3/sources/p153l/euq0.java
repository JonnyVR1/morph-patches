package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class euq0 {

    /* JADX INFO: renamed from: A */
    private static long f95915A = -1;

    /* JADX INFO: renamed from: B */
    private static volatile euq0 f95916B = null;

    /* JADX INFO: renamed from: v */
    private static boolean f95917v = true;

    /* JADX INFO: renamed from: w */
    private static boolean f95918w = false;

    /* JADX INFO: renamed from: x */
    private static boolean f95919x = false;

    /* JADX INFO: renamed from: y */
    private static int f95920y = 1;

    /* JADX INFO: renamed from: z */
    private static boolean f95921z = false;

    /* JADX INFO: renamed from: a */
    private Application f95922a;

    /* JADX INFO: renamed from: b */
    private Context f95923b;

    /* JADX INFO: renamed from: h */
    private String f95929h;

    /* JADX INFO: renamed from: i */
    private long f95930i;

    /* JADX INFO: renamed from: j */
    private String f95931j;

    /* JADX INFO: renamed from: k */
    private long f95932k;

    /* JADX INFO: renamed from: l */
    private String f95933l;

    /* JADX INFO: renamed from: m */
    private long f95934m;

    /* JADX INFO: renamed from: n */
    private String f95935n;

    /* JADX INFO: renamed from: o */
    private long f95936o;

    /* JADX INFO: renamed from: p */
    private String f95937p;

    /* JADX INFO: renamed from: q */
    private long f95938q;

    /* JADX INFO: renamed from: u */
    private int f95942u;

    /* JADX INFO: renamed from: c */
    private List<String> f95924c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private List<Long> f95925d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private List<String> f95926e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private List<Long> f95927f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private LinkedList<C16841b> f95928g = new LinkedList<>();

    /* JADX INFO: renamed from: r */
    private boolean f95939r = false;

    /* JADX INFO: renamed from: s */
    private long f95940s = -1;

    /* JADX INFO: renamed from: t */
    private int f95941t = 50;

    /* JADX INFO: renamed from: l.euq0$b */
    public static class C16841b {

        /* JADX INFO: renamed from: a */
        String f95944a;

        /* JADX INFO: renamed from: b */
        String f95945b;

        /* JADX INFO: renamed from: c */
        long f95946c;

        public C16841b(String str, String str2, long j) {
            this.f95945b = str2;
            this.f95946c = j;
            this.f95944a = str;
        }

        public String toString() {
            return iuq0.m142233a().format(new Date(this.f95946c)) + " : " + this.f95944a + ' ' + this.f95945b;
        }
    }

    private euq0(Application application) {
        this.f95923b = application;
        this.f95922a = application;
        try {
            m122697V();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static euq0 m122681A() {
        if (f95916B == null) {
            synchronized (euq0.class) {
                try {
                    if (f95916B == null) {
                        f95916B = new euq0(n0r0.m161023j());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95916B;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m122687I(euq0 euq0Var) {
        int i = euq0Var.f95942u;
        euq0Var.f95942u = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ int m122694S(euq0 euq0Var) {
        int i = euq0Var.f95942u;
        euq0Var.f95942u = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: V */
    private void m122697V() {
        if (this.f95922a != null) {
            this.f95922a.registerActivityLifecycleCallbacks(new C16840a());
        }
    }

    /* JADX INFO: renamed from: X */
    private JSONArray m122699X() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f95924c;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f95924c.size(); i++) {
                try {
                    jSONArray.put(m122712h(this.f95924c.get(i), this.f95925d.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: Z */
    private JSONArray m122701Z() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f95926e;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f95926e.size(); i++) {
                try {
                    jSONArray.put(m122712h(this.f95926e.get(i), this.f95927f.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    private C16841b m122711g(String str, String str2, long j) {
        C16841b c16841bPoll;
        if (this.f95928g.size() >= this.f95941t) {
            c16841bPoll = this.f95928g.poll();
            if (c16841bPoll != null) {
                this.f95928g.add(c16841bPoll);
            }
        } else {
            c16841bPoll = null;
        }
        if (c16841bPoll != null) {
            return c16841bPoll;
        }
        C16841b c16841b = new C16841b(str, str2, j);
        this.f95928g.add(c16841b);
        return c16841b;
    }

    /* JADX INFO: renamed from: h */
    private JSONObject m122712h(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static void m122713i() {
        f95921z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m122714j(String str, long j, String str2) {
        try {
            C16841b c16841bM122711g = m122711g(str, str2, j);
            c16841bM122711g.f95945b = str2;
            c16841bM122711g.f95944a = str;
            c16841bM122711g.f95946c = j;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m122718n() {
        int i = f95920y;
        if (i == 1) {
            return f95921z ? 2 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    public static long m122723s() {
        return f95915A;
    }

    /* JADX INFO: renamed from: B */
    public long m122731B() {
        return SystemClock.uptimeMillis() - this.f95940s;
    }

    /* JADX INFO: renamed from: H */
    public boolean m122732H() {
        return this.f95939r;
    }

    /* JADX INFO: renamed from: J */
    public JSONObject m122733J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m122712h(this.f95929h, this.f95930i));
            jSONObject.put("last_start_activity", m122712h(this.f95931j, this.f95932k));
            jSONObject.put("last_resume_activity", m122712h(this.f95933l, this.f95934m));
            jSONObject.put("last_pause_activity", m122712h(this.f95935n, this.f95936o));
            jSONObject.put("last_stop_activity", m122712h(this.f95937p, this.f95938q));
            jSONObject.put("alive_activities", m122699X());
            jSONObject.put("finish_activities", m122701Z());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: K */
    public String m122734K() {
        return String.valueOf(this.f95933l);
    }

    /* JADX INFO: renamed from: N */
    public JSONArray m122735N() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f95928g).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C16841b) it.next()).toString());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: l.euq0$a */
    public class C16840a implements Application.ActivityLifecycleCallbacks {
        public C16840a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            euq0.this.f95929h = activity.getClass().getName();
            euq0.this.f95930i = System.currentTimeMillis();
            boolean unused = euq0.f95918w = bundle != null;
            boolean unused2 = euq0.f95919x = true;
            euq0.this.f95924c.add(euq0.this.f95929h);
            euq0.this.f95925d.add(Long.valueOf(euq0.this.f95930i));
            euq0 euq0Var = euq0.this;
            euq0Var.m122714j(euq0Var.f95929h, euq0.this.f95930i, "onCreate");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            int iIndexOf = euq0.this.f95924c.indexOf(name);
            if (iIndexOf > -1 && iIndexOf < euq0.this.f95924c.size()) {
                euq0.this.f95924c.remove(iIndexOf);
                euq0.this.f95925d.remove(iIndexOf);
            }
            euq0.this.f95926e.add(name);
            long jCurrentTimeMillis = System.currentTimeMillis();
            euq0.this.f95927f.add(Long.valueOf(jCurrentTimeMillis));
            euq0.this.m122714j(name, jCurrentTimeMillis, "onDestroy");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            euq0.this.f95935n = activity.getClass().getName();
            euq0.this.f95936o = System.currentTimeMillis();
            euq0.m122694S(euq0.this);
            int i = euq0.this.f95942u;
            euq0 euq0Var = euq0.this;
            if (i != 0) {
                if (euq0Var.f95942u < 0) {
                    euq0.this.f95942u = 0;
                    euq0.this.f95939r = false;
                }
                euq0 euq0Var2 = euq0.this;
                euq0Var2.m122714j(euq0Var2.f95935n, euq0.this.f95936o, "onPause");
            }
            euq0Var.f95939r = false;
            boolean unused = euq0.f95919x = false;
            euq0.this.f95940s = SystemClock.uptimeMillis();
            euq0 euq0Var3 = euq0.this;
            euq0Var3.m122714j(euq0Var3.f95935n, euq0.this.f95936o, "onPause");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            int i;
            euq0.this.f95933l = activity.getClass().getName();
            euq0.this.f95934m = System.currentTimeMillis();
            euq0.m122687I(euq0.this);
            if (!euq0.this.f95939r) {
                euq0.this.f95939r = true;
                if (euq0.f95917v) {
                    boolean unused = euq0.f95917v = false;
                    int unused2 = euq0.f95920y = 1;
                    long unused3 = euq0.f95915A = euq0.this.f95934m;
                }
                if (euq0.this.f95933l.equals(euq0.this.f95935n)) {
                    if (!euq0.f95919x || euq0.f95918w) {
                        i = euq0.f95919x ? 4 : 3;
                    }
                    int unused4 = euq0.f95920y = i;
                    long unused5 = euq0.f95915A = euq0.this.f95934m;
                }
            }
            euq0 euq0Var = euq0.this;
            euq0Var.m122714j(euq0Var.f95933l, euq0.this.f95934m, "onResume");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            euq0.this.f95931j = activity.getClass().getName();
            euq0.this.f95932k = System.currentTimeMillis();
            euq0 euq0Var = euq0.this;
            euq0Var.m122714j(euq0Var.f95931j, euq0.this.f95932k, "onStart");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            euq0.this.f95937p = activity.getClass().getName();
            euq0.this.f95938q = System.currentTimeMillis();
            euq0 euq0Var = euq0.this;
            euq0Var.m122714j(euq0Var.f95937p, euq0.this.f95938q, "onStop");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
