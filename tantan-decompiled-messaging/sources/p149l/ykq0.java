package p149l;

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
public class ykq0 {

    /* JADX INFO: renamed from: A */
    private static long f198793A = -1;

    /* JADX INFO: renamed from: B */
    private static volatile ykq0 f198794B = null;

    /* JADX INFO: renamed from: v */
    private static boolean f198795v = true;

    /* JADX INFO: renamed from: w */
    private static boolean f198796w = false;

    /* JADX INFO: renamed from: x */
    private static boolean f198797x = false;

    /* JADX INFO: renamed from: y */
    private static int f198798y = 1;

    /* JADX INFO: renamed from: z */
    private static boolean f198799z = false;

    /* JADX INFO: renamed from: a */
    private Application f198800a;

    /* JADX INFO: renamed from: b */
    private Context f198801b;

    /* JADX INFO: renamed from: h */
    private String f198807h;

    /* JADX INFO: renamed from: i */
    private long f198808i;

    /* JADX INFO: renamed from: j */
    private String f198809j;

    /* JADX INFO: renamed from: k */
    private long f198810k;

    /* JADX INFO: renamed from: l */
    private String f198811l;

    /* JADX INFO: renamed from: m */
    private long f198812m;

    /* JADX INFO: renamed from: n */
    private String f198813n;

    /* JADX INFO: renamed from: o */
    private long f198814o;

    /* JADX INFO: renamed from: p */
    private String f198815p;

    /* JADX INFO: renamed from: q */
    private long f198816q;

    /* JADX INFO: renamed from: u */
    private int f198820u;

    /* JADX INFO: renamed from: c */
    private List<String> f198802c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private List<Long> f198803d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private List<String> f198804e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private List<Long> f198805f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private LinkedList<C21428b> f198806g = new LinkedList<>();

    /* JADX INFO: renamed from: r */
    private boolean f198817r = false;

    /* JADX INFO: renamed from: s */
    private long f198818s = -1;

    /* JADX INFO: renamed from: t */
    private int f198819t = 50;

    /* JADX INFO: renamed from: l.ykq0$b */
    public static class C21428b {

        /* JADX INFO: renamed from: a */
        String f198822a;

        /* JADX INFO: renamed from: b */
        String f198823b;

        /* JADX INFO: renamed from: c */
        long f198824c;

        public C21428b(String str, String str2, long j) {
            this.f198823b = str2;
            this.f198824c = j;
            this.f198822a = str;
        }

        public String toString() {
            return clq0.m107577a().format(new Date(this.f198824c)) + " : " + this.f198822a + ' ' + this.f198823b;
        }
    }

    private ykq0(Application application) {
        this.f198801b = application;
        this.f198800a = application;
        try {
            m215170V();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static ykq0 m215154A() {
        if (f198794B == null) {
            synchronized (ykq0.class) {
                try {
                    if (f198794B == null) {
                        f198794B = new ykq0(hrq0.m132701j());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198794B;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m215160I(ykq0 ykq0Var) {
        int i = ykq0Var.f198820u;
        ykq0Var.f198820u = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ int m215167S(ykq0 ykq0Var) {
        int i = ykq0Var.f198820u;
        ykq0Var.f198820u = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: V */
    private void m215170V() {
        if (this.f198800a != null) {
            this.f198800a.registerActivityLifecycleCallbacks(new C21427a());
        }
    }

    /* JADX INFO: renamed from: X */
    private JSONArray m215172X() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f198802c;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f198802c.size(); i++) {
                try {
                    jSONArray.put(m215185h(this.f198802c.get(i), this.f198803d.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: Z */
    private JSONArray m215174Z() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f198804e;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f198804e.size(); i++) {
                try {
                    jSONArray.put(m215185h(this.f198804e.get(i), this.f198805f.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    private C21428b m215184g(String str, String str2, long j) {
        C21428b c21428bPoll;
        if (this.f198806g.size() >= this.f198819t) {
            c21428bPoll = this.f198806g.poll();
            if (c21428bPoll != null) {
                this.f198806g.add(c21428bPoll);
            }
        } else {
            c21428bPoll = null;
        }
        if (c21428bPoll != null) {
            return c21428bPoll;
        }
        C21428b c21428b = new C21428b(str, str2, j);
        this.f198806g.add(c21428b);
        return c21428b;
    }

    /* JADX INFO: renamed from: h */
    private JSONObject m215185h(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static void m215186i() {
        f198799z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m215187j(String str, long j, String str2) {
        try {
            C21428b c21428bM215184g = m215184g(str, str2, j);
            c21428bM215184g.f198823b = str2;
            c21428bM215184g.f198822a = str;
            c21428bM215184g.f198824c = j;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m215191n() {
        int i = f198798y;
        if (i == 1) {
            return f198799z ? 2 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    public static long m215196s() {
        return f198793A;
    }

    /* JADX INFO: renamed from: B */
    public long m215204B() {
        return SystemClock.uptimeMillis() - this.f198818s;
    }

    /* JADX INFO: renamed from: H */
    public boolean m215205H() {
        return this.f198817r;
    }

    /* JADX INFO: renamed from: J */
    public JSONObject m215206J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m215185h(this.f198807h, this.f198808i));
            jSONObject.put("last_start_activity", m215185h(this.f198809j, this.f198810k));
            jSONObject.put("last_resume_activity", m215185h(this.f198811l, this.f198812m));
            jSONObject.put("last_pause_activity", m215185h(this.f198813n, this.f198814o));
            jSONObject.put("last_stop_activity", m215185h(this.f198815p, this.f198816q));
            jSONObject.put("alive_activities", m215172X());
            jSONObject.put("finish_activities", m215174Z());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: K */
    public String m215207K() {
        return String.valueOf(this.f198811l);
    }

    /* JADX INFO: renamed from: N */
    public JSONArray m215208N() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f198806g).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C21428b) it.next()).toString());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: l.ykq0$a */
    public class C21427a implements Application.ActivityLifecycleCallbacks {
        public C21427a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ykq0.this.f198807h = activity.getClass().getName();
            ykq0.this.f198808i = System.currentTimeMillis();
            boolean unused = ykq0.f198796w = bundle != null;
            boolean unused2 = ykq0.f198797x = true;
            ykq0.this.f198802c.add(ykq0.this.f198807h);
            ykq0.this.f198803d.add(Long.valueOf(ykq0.this.f198808i));
            ykq0 ykq0Var = ykq0.this;
            ykq0Var.m215187j(ykq0Var.f198807h, ykq0.this.f198808i, "onCreate");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            int iIndexOf = ykq0.this.f198802c.indexOf(name);
            if (iIndexOf > -1 && iIndexOf < ykq0.this.f198802c.size()) {
                ykq0.this.f198802c.remove(iIndexOf);
                ykq0.this.f198803d.remove(iIndexOf);
            }
            ykq0.this.f198804e.add(name);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ykq0.this.f198805f.add(Long.valueOf(jCurrentTimeMillis));
            ykq0.this.m215187j(name, jCurrentTimeMillis, "onDestroy");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ykq0.this.f198813n = activity.getClass().getName();
            ykq0.this.f198814o = System.currentTimeMillis();
            ykq0.m215167S(ykq0.this);
            int i = ykq0.this.f198820u;
            ykq0 ykq0Var = ykq0.this;
            if (i != 0) {
                if (ykq0Var.f198820u < 0) {
                    ykq0.this.f198820u = 0;
                    ykq0.this.f198817r = false;
                }
                ykq0 ykq0Var2 = ykq0.this;
                ykq0Var2.m215187j(ykq0Var2.f198813n, ykq0.this.f198814o, "onPause");
            }
            ykq0Var.f198817r = false;
            boolean unused = ykq0.f198797x = false;
            ykq0.this.f198818s = SystemClock.uptimeMillis();
            ykq0 ykq0Var3 = ykq0.this;
            ykq0Var3.m215187j(ykq0Var3.f198813n, ykq0.this.f198814o, "onPause");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            int i;
            ykq0.this.f198811l = activity.getClass().getName();
            ykq0.this.f198812m = System.currentTimeMillis();
            ykq0.m215160I(ykq0.this);
            if (!ykq0.this.f198817r) {
                ykq0.this.f198817r = true;
                if (ykq0.f198795v) {
                    boolean unused = ykq0.f198795v = false;
                    int unused2 = ykq0.f198798y = 1;
                    long unused3 = ykq0.f198793A = ykq0.this.f198812m;
                }
                if (ykq0.this.f198811l.equals(ykq0.this.f198813n)) {
                    if (!ykq0.f198797x || ykq0.f198796w) {
                        i = ykq0.f198797x ? 4 : 3;
                    }
                    int unused4 = ykq0.f198798y = i;
                    long unused5 = ykq0.f198793A = ykq0.this.f198812m;
                }
            }
            ykq0 ykq0Var = ykq0.this;
            ykq0Var.m215187j(ykq0Var.f198811l, ykq0.this.f198812m, "onResume");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ykq0.this.f198809j = activity.getClass().getName();
            ykq0.this.f198810k = System.currentTimeMillis();
            ykq0 ykq0Var = ykq0.this;
            ykq0Var.m215187j(ykq0Var.f198809j, ykq0.this.f198810k, "onStart");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ykq0.this.f198815p = activity.getClass().getName();
            ykq0.this.f198816q = System.currentTimeMillis();
            ykq0 ykq0Var = ykq0.this;
            ykq0Var.m215187j(ykq0Var.f198815p, ykq0.this.f198816q, "onStop");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
