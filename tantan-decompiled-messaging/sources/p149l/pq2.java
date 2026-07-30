package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pq2 {

    /* JADX INFO: renamed from: c */
    protected String f150739c;

    /* JADX INFO: renamed from: e */
    protected String f150741e;

    /* JADX INFO: renamed from: f */
    protected int f150742f;

    /* JADX INFO: renamed from: h */
    protected C19314a f150744h;

    /* JADX INFO: renamed from: i */
    private int f150745i;

    /* JADX INFO: renamed from: k */
    private int f150747k;

    /* JADX INFO: renamed from: l */
    private String f150748l;

    /* JADX INFO: renamed from: a */
    protected final ArrayList<String> f150737a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    protected final AtomicBoolean f150738b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    protected long f150740d = 0;

    /* JADX INFO: renamed from: g */
    protected int f150743g = 0;

    /* JADX INFO: renamed from: j */
    private int f150746j = 1;

    /* JADX INFO: renamed from: m */
    protected final Object f150749m = new Object();

    /* JADX INFO: renamed from: l.pq2$a */
    public class C19314a {

        /* JADX INFO: renamed from: a */
        public String f150750a;

        /* JADX INFO: renamed from: b */
        public int f150751b;

        /* JADX INFO: renamed from: c */
        private int f150752c;

        public C19314a(String str, int i) {
            this.f150750a = str;
            this.f150751b = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m170892a() {
            return this.f150752c < 6;
        }

        /* JADX INFO: renamed from: b */
        public void m170893b() {
            this.f150752c = 0;
        }

        /* JADX INFO: renamed from: c */
        public int m170894c() {
            return this.f150752c;
        }

        /* JADX INFO: renamed from: d */
        public void m170895d() {
            this.f150752c++;
        }

        public String toString() {
            return this.f150750a + ":" + this.f150751b + "   失败次数 " + this.f150752c;
        }
    }

    public pq2(String str, int i) {
        this.f150739c = str;
        this.f150745i = i;
        m170891p(str);
    }

    /* JADX INFO: renamed from: a */
    public void m170876a() {
        m170886k("tang-------清空失败次数 " + this.f150747k);
        this.f150747k = 0;
    }

    /* JADX INFO: renamed from: b */
    public String m170877b() {
        return this.f150748l;
    }

    /* JADX INFO: renamed from: c */
    public String m170878c() {
        return this.f150741e;
    }

    /* JADX INFO: renamed from: d */
    public int m170879d() {
        return this.f150746j;
    }

    /* JADX INFO: renamed from: e */
    public int m170880e() {
        return this.f150747k;
    }

    /* JADX INFO: renamed from: f */
    public boolean m170881f(String str, int i) {
        C19314a c19314a = this.f150744h;
        if (c19314a == null || !TextUtils.equals(str, c19314a.f150750a)) {
            return true;
        }
        C19314a c19314a2 = this.f150744h;
        if (i == c19314a2.f150751b) {
            return c19314a2.m170892a();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m170882g() {
        return TextUtils.equals(this.f150739c, "referee.immomo.com");
    }

    /* JADX INFO: renamed from: h */
    public boolean m170883h() {
        return TextUtils.equals(this.f150739c, this.f150741e);
    }

    /* JADX INFO: renamed from: i */
    public void m170884i(String str) {
        cmc0.m107608c();
    }

    /* JADX INFO: renamed from: j */
    public void m170885j(String str) {
        cmc0.m107606a(str);
    }

    /* JADX INFO: renamed from: k */
    public void m170886k(String str) {
        cmc0.m107607b(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m170887l() {
        this.f150748l = System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: m */
    public void m170888m() {
        C19314a c19314a = this.f150744h;
        if (c19314a == null) {
            this.f150744h = new C19314a(this.f150741e, this.f150742f);
        } else if (!TextUtils.equals(c19314a.f150750a, this.f150741e)) {
            int i = this.f150744h.f150751b;
            int i2 = this.f150742f;
            if (i != i2) {
                this.f150744h = new C19314a(this.f150741e, i2);
            }
        }
        this.f150744h.m170895d();
        m170886k("tang--------currentFailedRecord 当前连续失败次数是 " + this.f150744h.toString());
    }

    /* JADX INFO: renamed from: n */
    public void m170889n() {
        this.f150747k++;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX INFO: renamed from: o */
    public void m170890o() {
        boolean z;
        if (TextUtils.isEmpty(this.f150741e)) {
            return;
        }
        C19314a c19314a = this.f150744h;
        if (c19314a == null || !TextUtils.equals(this.f150741e, c19314a.f150750a)) {
            this.f150744h = new C19314a(this.f150741e, this.f150742f);
            z = true;
        } else {
            C19314a c19314a2 = this.f150744h;
            if (c19314a2.f150751b != this.f150742f) {
                this.f150744h = new C19314a(this.f150741e, this.f150742f);
                z = true;
            } else {
                if (c19314a2 != null) {
                    c19314a2.m170893b();
                }
                z = false;
            }
        }
        m170886k("tang------重置当前失败纪录，是否真的重置 " + z);
    }

    /* JADX INFO: renamed from: p */
    public void m170891p(String str) {
        this.f150741e = str;
        m170886k("tang-----设置当前使用的域名 " + this.f150741e);
    }
}
