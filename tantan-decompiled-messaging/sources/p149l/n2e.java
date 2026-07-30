package p149l;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.cache.common.C1579b;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.C1585a;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class n2e {

    /* JADX INFO: renamed from: a */
    public final int f136789a;

    /* JADX INFO: renamed from: b */
    public final String f136790b;

    /* JADX INFO: renamed from: c */
    public final syg0<File> f136791c;

    /* JADX INFO: renamed from: d */
    public final long f136792d;

    /* JADX INFO: renamed from: e */
    public final long f136793e;

    /* JADX INFO: renamed from: f */
    public final long f136794f;

    /* JADX INFO: renamed from: g */
    public final q1f f136795g;

    /* JADX INFO: renamed from: h */
    public final CacheErrorLogger f136796h;

    /* JADX INFO: renamed from: i */
    public final CacheEventListener f136797i;

    /* JADX INFO: renamed from: j */
    public final q3e f136798j;

    /* JADX INFO: renamed from: k */
    public final Context f136799k;

    /* JADX INFO: renamed from: l */
    public final boolean f136800l;

    /* JADX INFO: renamed from: l.n2e$a */
    public class C18609a implements syg0<File> {
        public C18609a() {
        }

        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            rf80.m179116g(n2e.this.f136799k);
            return n2e.this.f136799k.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: renamed from: l.n2e$b */
    public static final class C18610b {

        /* JADX INFO: renamed from: a */
        public int f136802a;

        /* JADX INFO: renamed from: b */
        public String f136803b;

        /* JADX INFO: renamed from: c */
        public syg0<File> f136804c;

        /* JADX INFO: renamed from: d */
        public long f136805d;

        /* JADX INFO: renamed from: e */
        public long f136806e;

        /* JADX INFO: renamed from: f */
        public long f136807f;

        /* JADX INFO: renamed from: g */
        public q1f f136808g;

        /* JADX INFO: renamed from: h */
        public CacheErrorLogger f136809h;

        /* JADX INFO: renamed from: i */
        public CacheEventListener f136810i;

        /* JADX INFO: renamed from: j */
        public q3e f136811j;

        /* JADX INFO: renamed from: k */
        public boolean f136812k;

        /* JADX INFO: renamed from: l */
        public final Context f136813l;

        public C18610b(Context context) {
            this.f136802a = 1;
            this.f136803b = "image_cache";
            this.f136805d = 41943040L;
            this.f136806e = 10485760L;
            this.f136807f = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            this.f136808g = new C1585a();
            this.f136813l = context;
        }

        /* JADX INFO: renamed from: n */
        public n2e m157592n() {
            return new n2e(this);
        }

        /* JADX INFO: renamed from: o */
        public C18610b m157593o(String str) {
            this.f136803b = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18610b m157594p(File file) {
            this.f136804c = vyg0.m200647a(file);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18610b m157595q(long j) {
            this.f136805d = j;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18610b m157596r(long j) {
            this.f136806e = j;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18610b m157597s(long j) {
            this.f136807f = j;
            return this;
        }
    }

    public n2e(C18610b c18610b) {
        Context context = c18610b.f136813l;
        this.f136799k = context;
        rf80.m179119j((c18610b.f136804c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (c18610b.f136804c == null && context != null) {
            c18610b.f136804c = new C18609a();
        }
        this.f136789a = c18610b.f136802a;
        this.f136790b = (String) rf80.m179116g(c18610b.f136803b);
        this.f136791c = (syg0) rf80.m179116g(c18610b.f136804c);
        this.f136792d = c18610b.f136805d;
        this.f136793e = c18610b.f136806e;
        this.f136794f = c18610b.f136807f;
        this.f136795g = (q1f) rf80.m179116g(c18610b.f136808g);
        this.f136796h = c18610b.f136809h == null ? C1579b.m8073b() : c18610b.f136809h;
        this.f136797i = c18610b.f136810i == null ? kk40.m146308h() : c18610b.f136810i;
        this.f136798j = c18610b.f136811j == null ? pk40.m169970b() : c18610b.f136811j;
        this.f136800l = c18610b.f136812k;
    }

    /* JADX INFO: renamed from: m */
    public static C18610b m157566m(Context context) {
        return new C18610b(context);
    }

    /* JADX INFO: renamed from: b */
    public String m157567b() {
        return this.f136790b;
    }

    /* JADX INFO: renamed from: c */
    public syg0<File> m157568c() {
        return this.f136791c;
    }

    /* JADX INFO: renamed from: d */
    public CacheErrorLogger m157569d() {
        return this.f136796h;
    }

    /* JADX INFO: renamed from: e */
    public CacheEventListener m157570e() {
        return this.f136797i;
    }

    /* JADX INFO: renamed from: f */
    public long m157571f() {
        return this.f136792d;
    }

    /* JADX INFO: renamed from: g */
    public q3e m157572g() {
        return this.f136798j;
    }

    /* JADX INFO: renamed from: h */
    public q1f m157573h() {
        return this.f136795g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m157574i() {
        return this.f136800l;
    }

    /* JADX INFO: renamed from: j */
    public long m157575j() {
        return this.f136793e;
    }

    /* JADX INFO: renamed from: k */
    public long m157576k() {
        return this.f136794f;
    }

    /* JADX INFO: renamed from: l */
    public int m157577l() {
        return this.f136789a;
    }
}
