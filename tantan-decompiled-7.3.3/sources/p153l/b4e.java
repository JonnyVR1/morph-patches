package p153l;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.cache.common.C1602b;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.C1608a;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b4e {

    /* JADX INFO: renamed from: a */
    public final int f74894a;

    /* JADX INFO: renamed from: b */
    public final String f74895b;

    /* JADX INFO: renamed from: c */
    public final a7h0<File> f74896c;

    /* JADX INFO: renamed from: d */
    public final long f74897d;

    /* JADX INFO: renamed from: e */
    public final long f74898e;

    /* JADX INFO: renamed from: f */
    public final long f74899f;

    /* JADX INFO: renamed from: g */
    public final v2f f74900g;

    /* JADX INFO: renamed from: h */
    public final CacheErrorLogger f74901h;

    /* JADX INFO: renamed from: i */
    public final CacheEventListener f74902i;

    /* JADX INFO: renamed from: j */
    public final e5e f74903j;

    /* JADX INFO: renamed from: k */
    public final Context f74904k;

    /* JADX INFO: renamed from: l */
    public final boolean f74905l;

    /* JADX INFO: renamed from: l.b4e$a */
    public class C15922a implements a7h0<File> {
        public C15922a() {
        }

        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            wn80.m207182g(b4e.this.f74904k);
            return b4e.this.f74904k.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: renamed from: l.b4e$b */
    public static final class C15923b {

        /* JADX INFO: renamed from: a */
        public int f74907a;

        /* JADX INFO: renamed from: b */
        public String f74908b;

        /* JADX INFO: renamed from: c */
        public a7h0<File> f74909c;

        /* JADX INFO: renamed from: d */
        public long f74910d;

        /* JADX INFO: renamed from: e */
        public long f74911e;

        /* JADX INFO: renamed from: f */
        public long f74912f;

        /* JADX INFO: renamed from: g */
        public v2f f74913g;

        /* JADX INFO: renamed from: h */
        public CacheErrorLogger f74914h;

        /* JADX INFO: renamed from: i */
        public CacheEventListener f74915i;

        /* JADX INFO: renamed from: j */
        public e5e f74916j;

        /* JADX INFO: renamed from: k */
        public boolean f74917k;

        /* JADX INFO: renamed from: l */
        public final Context f74918l;

        public C15923b(Context context) {
            this.f74907a = 1;
            this.f74908b = "image_cache";
            this.f74910d = 41943040L;
            this.f74911e = 10485760L;
            this.f74912f = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            this.f74913g = new C1608a();
            this.f74918l = context;
        }

        /* JADX INFO: renamed from: n */
        public b4e m102441n() {
            return new b4e(this);
        }

        /* JADX INFO: renamed from: o */
        public C15923b m102442o(String str) {
            this.f74908b = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C15923b m102443p(File file) {
            this.f74909c = d7h0.m114734a(file);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C15923b m102444q(long j) {
            this.f74910d = j;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C15923b m102445r(long j) {
            this.f74911e = j;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C15923b m102446s(long j) {
            this.f74912f = j;
            return this;
        }
    }

    public b4e(C15923b c15923b) {
        Context context = c15923b.f74918l;
        this.f74904k = context;
        wn80.m207185j((c15923b.f74909c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (c15923b.f74909c == null && context != null) {
            c15923b.f74909c = new C15922a();
        }
        this.f74894a = c15923b.f74907a;
        this.f74895b = (String) wn80.m207182g(c15923b.f74908b);
        this.f74896c = (a7h0) wn80.m207182g(c15923b.f74909c);
        this.f74897d = c15923b.f74910d;
        this.f74898e = c15923b.f74911e;
        this.f74899f = c15923b.f74912f;
        this.f74900g = (v2f) wn80.m207182g(c15923b.f74913g);
        this.f74901h = c15923b.f74914h == null ? C1602b.m8127b() : c15923b.f74914h;
        this.f74902i = c15923b.f74915i == null ? ys40.m217238h() : c15923b.f74915i;
        this.f74903j = c15923b.f74916j == null ? dt40.m117799b() : c15923b.f74916j;
        this.f74905l = c15923b.f74917k;
    }

    /* JADX INFO: renamed from: m */
    public static C15923b m102415m(Context context) {
        return new C15923b(context);
    }

    /* JADX INFO: renamed from: b */
    public String m102416b() {
        return this.f74895b;
    }

    /* JADX INFO: renamed from: c */
    public a7h0<File> m102417c() {
        return this.f74896c;
    }

    /* JADX INFO: renamed from: d */
    public CacheErrorLogger m102418d() {
        return this.f74901h;
    }

    /* JADX INFO: renamed from: e */
    public CacheEventListener m102419e() {
        return this.f74902i;
    }

    /* JADX INFO: renamed from: f */
    public long m102420f() {
        return this.f74897d;
    }

    /* JADX INFO: renamed from: g */
    public e5e m102421g() {
        return this.f74903j;
    }

    /* JADX INFO: renamed from: h */
    public v2f m102422h() {
        return this.f74900g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m102423i() {
        return this.f74905l;
    }

    /* JADX INFO: renamed from: j */
    public long m102424j() {
        return this.f74898e;
    }

    /* JADX INFO: renamed from: k */
    public long m102425k() {
        return this.f74899f;
    }

    /* JADX INFO: renamed from: l */
    public int m102426l() {
        return this.f74894a;
    }
}
