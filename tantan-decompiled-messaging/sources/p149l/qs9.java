package p149l;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class qs9 extends m85 {

    /* JADX INFO: renamed from: D */
    private static boolean f156117D = false;

    /* JADX INFO: renamed from: E */
    private static WeakReference<Activity> f156118E;

    /* JADX INFO: renamed from: F */
    private static int f156119F;

    /* JADX INFO: renamed from: G */
    private static int f156120G;

    /* JADX INFO: renamed from: a */
    private WeakReference<Activity> f156124a;

    /* JADX INFO: renamed from: o */
    private boolean f156138o;

    /* JADX INFO: renamed from: r */
    private boolean f156141r;

    /* JADX INFO: renamed from: s */
    private boolean f156142s;

    /* JADX INFO: renamed from: b */
    private long f156125b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f156126c = false;

    /* JADX INFO: renamed from: d */
    private final Object f156127d = new Object();

    /* JADX INFO: renamed from: e */
    private String f156128e = null;

    /* JADX INFO: renamed from: f */
    private int f156129f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f156130g = false;

    /* JADX INFO: renamed from: h */
    private boolean f156131h = true;

    /* JADX INFO: renamed from: i */
    private boolean f156132i = false;

    /* JADX INFO: renamed from: j */
    private boolean f156133j = false;

    /* JADX INFO: renamed from: k */
    private int f156134k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f156135l = false;

    /* JADX INFO: renamed from: m */
    private boolean f156136m = false;

    /* JADX INFO: renamed from: n */
    private boolean f156137n = false;

    /* JADX INFO: renamed from: p */
    private int f156139p = 0;

    /* JADX INFO: renamed from: q */
    private Location f156140q = null;

    /* JADX INFO: renamed from: t */
    private final Object f156143t = new Object();

    /* JADX INFO: renamed from: u */
    private HashMap<String, Integer> f156144u = new HashMap<>();

    /* JADX INFO: renamed from: v */
    private long f156145v = 0;

    /* JADX INFO: renamed from: w */
    private String f156146w = null;

    /* JADX INFO: renamed from: x */
    private String f156147x = null;

    /* JADX INFO: renamed from: y */
    private String f156148y = null;

    /* JADX INFO: renamed from: z */
    private JSONObject f156149z = null;

    /* JADX INFO: renamed from: A */
    private boolean f156121A = false;

    /* JADX INFO: renamed from: B */
    private boolean f156122B = false;

    /* JADX INFO: renamed from: C */
    private final Object f156123C = new Object();

    /* JADX INFO: renamed from: K */
    public static void m176164K(int i) {
        f156119F = i;
    }

    /* JADX INFO: renamed from: L */
    public static void m176165L(boolean z) {
        f156117D = z;
    }

    /* JADX INFO: renamed from: R */
    public static void m176166R(@Nullable Activity activity) {
        if (activity == null) {
            f156118E = null;
        } else {
            if (activity.getLocalClassName().contains("InAppNotificationActivity")) {
                return;
            }
            f156118E = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m176167a0(int i) {
        f156120G = i;
    }

    /* JADX INFO: renamed from: e */
    public static int m176168e() {
        return f156119F;
    }

    /* JADX INFO: renamed from: i */
    public static Activity m176169i() {
        WeakReference<Activity> weakReference = f156118E;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: j */
    public static String m176170j() {
        Activity activityM176169i = m176169i();
        if (activityM176169i != null) {
            return activityM176169i.getLocalClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static int m176171n() {
        return f156120G;
    }

    /* JADX INFO: renamed from: w */
    public static void m176172w() {
        f156119F++;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m176173x() {
        return f156117D;
    }

    /* JADX INFO: renamed from: A */
    public boolean m176174A() {
        boolean z;
        synchronized (this.f156143t) {
            z = this.f156130g;
        }
        return z;
    }

    /* JADX INFO: renamed from: B */
    public boolean m176175B() {
        return this.f156132i;
    }

    /* JADX INFO: renamed from: C */
    public boolean m176176C() {
        return this.f156133j;
    }

    /* JADX INFO: renamed from: D */
    public boolean m176177D() {
        boolean z;
        synchronized (this.f156123C) {
            try {
                z = m176171n() > 0 && !this.f156122B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public boolean m176178E() {
        return this.f156135l;
    }

    /* JADX INFO: renamed from: F */
    public boolean m176179F() {
        return this.f156137n;
    }

    /* JADX INFO: renamed from: G */
    public boolean m176180G() {
        return this.f156141r;
    }

    /* JADX INFO: renamed from: H */
    public boolean m176181H() {
        return this.f156138o;
    }

    /* JADX INFO: renamed from: I */
    public boolean m176182I() {
        return this.f156121A;
    }

    /* JADX INFO: renamed from: J */
    public boolean m176183J() {
        return this.f156142s;
    }

    /* JADX INFO: renamed from: M */
    public void m176184M(@Nullable Activity activity) {
        this.f156124a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: N */
    public void m176185N(long j) {
        this.f156125b = j;
    }

    /* JADX INFO: renamed from: O */
    public void m176186O(boolean z) {
        synchronized (this.f156127d) {
            this.f156126c = z;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m176187P(boolean z) {
        this.f156136m = z;
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m176188Q(String str) {
        if (this.f156148y == null) {
            this.f156148y = str;
        }
    }

    /* JADX INFO: renamed from: S */
    public void m176189S(int i) {
        this.f156129f = i;
    }

    /* JADX INFO: renamed from: T */
    public void m176190T(boolean z) {
        synchronized (this.f156143t) {
            this.f156130g = z;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m176191U(String str, int i) {
        this.f156144u.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: V */
    public void m176192V(boolean z) {
        synchronized (this.f156143t) {
            this.f156131h = z;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m176193W(boolean z) {
        this.f156132i = z;
    }

    /* JADX INFO: renamed from: X */
    public void m176194X(boolean z) {
        this.f156133j = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m176195Y() {
        synchronized (this.f156123C) {
            this.f156122B = true;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m176196Z(int i) {
        this.f156134k = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m176197a() {
        this.f156148y = null;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m176198b() {
        this.f156147x = null;
    }

    /* JADX INFO: renamed from: b0 */
    public void m176199b0(boolean z) {
        this.f156135l = z;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m176200c() {
        this.f156146w = null;
    }

    /* JADX INFO: renamed from: c0 */
    public void m176201c0(int i) {
        this.f156139p = i;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m176202d() {
        this.f156149z = null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m176203d0(boolean z) {
        this.f156137n = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m176204e0(Location location) {
        this.f156140q = location;
    }

    /* JADX INFO: renamed from: f */
    public HashMap<String, Integer> m176205f() {
        return this.f156144u;
    }

    /* JADX INFO: renamed from: f0 */
    public synchronized void m176206f0(String str) {
        if (this.f156147x == null) {
            this.f156147x = str;
        }
    }

    /* JADX INFO: renamed from: g */
    public long m176207g() {
        return this.f156125b;
    }

    /* JADX INFO: renamed from: g0 */
    public void m176208g0(boolean z) {
        this.f156138o = z;
    }

    /* JADX INFO: renamed from: h */
    public synchronized String m176209h() {
        return this.f156148y;
    }

    /* JADX INFO: renamed from: h0 */
    public void m176210h0(long j) {
        this.f156145v = j;
    }

    /* JADX INFO: renamed from: i0 */
    public void m176211i0(boolean z) {
        this.f156121A = z;
    }

    /* JADX INFO: renamed from: j0 */
    public synchronized void m176212j0(String str) {
        if (this.f156146w == null) {
            this.f156146w = str;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m176213k() {
        return this.f156129f;
    }

    /* JADX INFO: renamed from: k0 */
    public synchronized void m176214k0(JSONObject jSONObject) {
        if (this.f156149z == null) {
            this.f156149z = jSONObject;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m176215l() {
        boolean z;
        synchronized (this.f156143t) {
            z = this.f156131h;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public int m176216m() {
        return this.f156134k;
    }

    /* JADX INFO: renamed from: o */
    public int m176217o() {
        return this.f156139p;
    }

    /* JADX INFO: renamed from: p */
    public Location m176218p() {
        return this.f156140q;
    }

    /* JADX INFO: renamed from: q */
    public synchronized String m176219q() {
        return this.f156147x;
    }

    /* JADX INFO: renamed from: r */
    public long m176220r() {
        return this.f156145v;
    }

    /* JADX INFO: renamed from: s */
    public String m176221s() {
        return this.f156128e;
    }

    /* JADX INFO: renamed from: t */
    public synchronized String m176222t() {
        return this.f156146w;
    }

    /* JADX INFO: renamed from: u */
    public synchronized JSONObject m176223u() {
        return this.f156149z;
    }

    /* JADX INFO: renamed from: v */
    public boolean m176224v() {
        return this.f156129f > 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m176225y() {
        boolean z;
        synchronized (this.f156127d) {
            z = this.f156126c;
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public boolean m176226z() {
        return this.f156136m;
    }
}
