package p153l;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class bu9 extends n95 {

    /* JADX INFO: renamed from: D */
    private static boolean f78438D = false;

    /* JADX INFO: renamed from: E */
    private static WeakReference<Activity> f78439E;

    /* JADX INFO: renamed from: F */
    private static int f78440F;

    /* JADX INFO: renamed from: G */
    private static int f78441G;

    /* JADX INFO: renamed from: a */
    private WeakReference<Activity> f78445a;

    /* JADX INFO: renamed from: o */
    private boolean f78459o;

    /* JADX INFO: renamed from: r */
    private boolean f78462r;

    /* JADX INFO: renamed from: s */
    private boolean f78463s;

    /* JADX INFO: renamed from: b */
    private long f78446b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f78447c = false;

    /* JADX INFO: renamed from: d */
    private final Object f78448d = new Object();

    /* JADX INFO: renamed from: e */
    private String f78449e = null;

    /* JADX INFO: renamed from: f */
    private int f78450f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f78451g = false;

    /* JADX INFO: renamed from: h */
    private boolean f78452h = true;

    /* JADX INFO: renamed from: i */
    private boolean f78453i = false;

    /* JADX INFO: renamed from: j */
    private boolean f78454j = false;

    /* JADX INFO: renamed from: k */
    private int f78455k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f78456l = false;

    /* JADX INFO: renamed from: m */
    private boolean f78457m = false;

    /* JADX INFO: renamed from: n */
    private boolean f78458n = false;

    /* JADX INFO: renamed from: p */
    private int f78460p = 0;

    /* JADX INFO: renamed from: q */
    private Location f78461q = null;

    /* JADX INFO: renamed from: t */
    private final Object f78464t = new Object();

    /* JADX INFO: renamed from: u */
    private HashMap<String, Integer> f78465u = new HashMap<>();

    /* JADX INFO: renamed from: v */
    private long f78466v = 0;

    /* JADX INFO: renamed from: w */
    private String f78467w = null;

    /* JADX INFO: renamed from: x */
    private String f78468x = null;

    /* JADX INFO: renamed from: y */
    private String f78469y = null;

    /* JADX INFO: renamed from: z */
    private JSONObject f78470z = null;

    /* JADX INFO: renamed from: A */
    private boolean f78442A = false;

    /* JADX INFO: renamed from: B */
    private boolean f78443B = false;

    /* JADX INFO: renamed from: C */
    private final Object f78444C = new Object();

    /* JADX INFO: renamed from: K */
    public static void m106431K(int i) {
        f78440F = i;
    }

    /* JADX INFO: renamed from: L */
    public static void m106432L(boolean z) {
        f78438D = z;
    }

    /* JADX INFO: renamed from: R */
    public static void m106433R(@Nullable Activity activity) {
        if (activity == null) {
            f78439E = null;
        } else {
            if (activity.getLocalClassName().contains("InAppNotificationActivity")) {
                return;
            }
            f78439E = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m106434a0(int i) {
        f78441G = i;
    }

    /* JADX INFO: renamed from: e */
    public static int m106435e() {
        return f78440F;
    }

    /* JADX INFO: renamed from: i */
    public static Activity m106436i() {
        WeakReference<Activity> weakReference = f78439E;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: j */
    public static String m106437j() {
        Activity activityM106436i = m106436i();
        if (activityM106436i != null) {
            return activityM106436i.getLocalClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static int m106438n() {
        return f78441G;
    }

    /* JADX INFO: renamed from: w */
    public static void m106439w() {
        f78440F++;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m106440x() {
        return f78438D;
    }

    /* JADX INFO: renamed from: A */
    public boolean m106441A() {
        boolean z;
        synchronized (this.f78464t) {
            z = this.f78451g;
        }
        return z;
    }

    /* JADX INFO: renamed from: B */
    public boolean m106442B() {
        return this.f78453i;
    }

    /* JADX INFO: renamed from: C */
    public boolean m106443C() {
        return this.f78454j;
    }

    /* JADX INFO: renamed from: D */
    public boolean m106444D() {
        boolean z;
        synchronized (this.f78444C) {
            try {
                z = m106438n() > 0 && !this.f78443B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public boolean m106445E() {
        return this.f78456l;
    }

    /* JADX INFO: renamed from: F */
    public boolean m106446F() {
        return this.f78458n;
    }

    /* JADX INFO: renamed from: G */
    public boolean m106447G() {
        return this.f78462r;
    }

    /* JADX INFO: renamed from: H */
    public boolean m106448H() {
        return this.f78459o;
    }

    /* JADX INFO: renamed from: I */
    public boolean m106449I() {
        return this.f78442A;
    }

    /* JADX INFO: renamed from: J */
    public boolean m106450J() {
        return this.f78463s;
    }

    /* JADX INFO: renamed from: M */
    public void m106451M(@Nullable Activity activity) {
        this.f78445a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: N */
    public void m106452N(long j) {
        this.f78446b = j;
    }

    /* JADX INFO: renamed from: O */
    public void m106453O(boolean z) {
        synchronized (this.f78448d) {
            this.f78447c = z;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m106454P(boolean z) {
        this.f78457m = z;
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m106455Q(String str) {
        if (this.f78469y == null) {
            this.f78469y = str;
        }
    }

    /* JADX INFO: renamed from: S */
    public void m106456S(int i) {
        this.f78450f = i;
    }

    /* JADX INFO: renamed from: T */
    public void m106457T(boolean z) {
        synchronized (this.f78464t) {
            this.f78451g = z;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m106458U(String str, int i) {
        this.f78465u.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: V */
    public void m106459V(boolean z) {
        synchronized (this.f78464t) {
            this.f78452h = z;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m106460W(boolean z) {
        this.f78453i = z;
    }

    /* JADX INFO: renamed from: X */
    public void m106461X(boolean z) {
        this.f78454j = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m106462Y() {
        synchronized (this.f78444C) {
            this.f78443B = true;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m106463Z(int i) {
        this.f78455k = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m106464a() {
        this.f78469y = null;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m106465b() {
        this.f78468x = null;
    }

    /* JADX INFO: renamed from: b0 */
    public void m106466b0(boolean z) {
        this.f78456l = z;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m106467c() {
        this.f78467w = null;
    }

    /* JADX INFO: renamed from: c0 */
    public void m106468c0(int i) {
        this.f78460p = i;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m106469d() {
        this.f78470z = null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m106470d0(boolean z) {
        this.f78458n = z;
    }

    /* JADX INFO: renamed from: e0 */
    public void m106471e0(Location location) {
        this.f78461q = location;
    }

    /* JADX INFO: renamed from: f */
    public HashMap<String, Integer> m106472f() {
        return this.f78465u;
    }

    /* JADX INFO: renamed from: f0 */
    public synchronized void m106473f0(String str) {
        if (this.f78468x == null) {
            this.f78468x = str;
        }
    }

    /* JADX INFO: renamed from: g */
    public long m106474g() {
        return this.f78446b;
    }

    /* JADX INFO: renamed from: g0 */
    public void m106475g0(boolean z) {
        this.f78459o = z;
    }

    /* JADX INFO: renamed from: h */
    public synchronized String m106476h() {
        return this.f78469y;
    }

    /* JADX INFO: renamed from: h0 */
    public void m106477h0(long j) {
        this.f78466v = j;
    }

    /* JADX INFO: renamed from: i0 */
    public void m106478i0(boolean z) {
        this.f78442A = z;
    }

    /* JADX INFO: renamed from: j0 */
    public synchronized void m106479j0(String str) {
        if (this.f78467w == null) {
            this.f78467w = str;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m106480k() {
        return this.f78450f;
    }

    /* JADX INFO: renamed from: k0 */
    public synchronized void m106481k0(JSONObject jSONObject) {
        if (this.f78470z == null) {
            this.f78470z = jSONObject;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m106482l() {
        boolean z;
        synchronized (this.f78464t) {
            z = this.f78452h;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public int m106483m() {
        return this.f78455k;
    }

    /* JADX INFO: renamed from: o */
    public int m106484o() {
        return this.f78460p;
    }

    /* JADX INFO: renamed from: p */
    public Location m106485p() {
        return this.f78461q;
    }

    /* JADX INFO: renamed from: q */
    public synchronized String m106486q() {
        return this.f78468x;
    }

    /* JADX INFO: renamed from: r */
    public long m106487r() {
        return this.f78466v;
    }

    /* JADX INFO: renamed from: s */
    public String m106488s() {
        return this.f78449e;
    }

    /* JADX INFO: renamed from: t */
    public synchronized String m106489t() {
        return this.f78467w;
    }

    /* JADX INFO: renamed from: u */
    public synchronized JSONObject m106490u() {
        return this.f78470z;
    }

    /* JADX INFO: renamed from: v */
    public boolean m106491v() {
        return this.f78450f > 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m106492y() {
        boolean z;
        synchronized (this.f78448d) {
            z = this.f78447c;
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public boolean m106493z() {
        return this.f78457m;
    }
}
