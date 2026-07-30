package p149l;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class qu5 {

    /* JADX INFO: renamed from: a */
    private String f156425a;

    /* JADX INFO: renamed from: b */
    private boolean f156426b;

    /* JADX INFO: renamed from: c */
    private boolean f156427c;

    /* JADX INFO: renamed from: d */
    private boolean f156428d;

    /* JADX INFO: renamed from: e */
    private long f156429e;

    /* JADX INFO: renamed from: f */
    private long f156430f;

    /* JADX INFO: renamed from: g */
    private long f156431g;

    /* JADX INFO: renamed from: l.qu5$b */
    public static class C19579b {

        /* JADX INFO: renamed from: a */
        private int f156432a = -1;

        /* JADX INFO: renamed from: b */
        private int f156433b = -1;

        /* JADX INFO: renamed from: c */
        private int f156434c = -1;

        /* JADX INFO: renamed from: d */
        private String f156435d = null;

        /* JADX INFO: renamed from: e */
        private long f156436e = -1;

        /* JADX INFO: renamed from: f */
        private long f156437f = -1;

        /* JADX INFO: renamed from: g */
        private long f156438g = -1;

        /* JADX INFO: renamed from: h */
        public qu5 m176532h(Context context) {
            return new qu5(context, this);
        }

        /* JADX INFO: renamed from: i */
        public C19579b m176533i(String str) {
            this.f156435d = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19579b m176534j(boolean z) {
            this.f156432a = z ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19579b m176535k(long j) {
            this.f156437f = j;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C19579b m176536l(boolean z) {
            this.f156433b = z ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19579b m176537m(long j) {
            this.f156436e = j;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19579b m176538n(long j) {
            this.f156438g = j;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C19579b m176539o(boolean z) {
            this.f156434c = z ? 1 : 0;
            return this;
        }
    }

    private qu5(Context context, C19579b c19579b) {
        this.f156426b = true;
        this.f156427c = false;
        this.f156428d = false;
        this.f156429e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f156430f = 86400L;
        this.f156431g = 86400L;
        if (c19579b.f156432a == 0) {
            this.f156426b = false;
        } else if (c19579b.f156432a == 1) {
            this.f156426b = true;
        } else {
            this.f156426b = true;
        }
        if (TextUtils.isEmpty(c19579b.f156435d)) {
            this.f156425a = fmq0.m122192b(context);
        } else {
            this.f156425a = c19579b.f156435d;
        }
        if (c19579b.f156436e > -1) {
            this.f156429e = c19579b.f156436e;
        } else {
            this.f156429e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (c19579b.f156437f > -1) {
            this.f156430f = c19579b.f156437f;
        } else {
            this.f156430f = 86400L;
        }
        if (c19579b.f156438g > -1) {
            this.f156431g = c19579b.f156438g;
        } else {
            this.f156431g = 86400L;
        }
        if (c19579b.f156433b != 0 && c19579b.f156433b == 1) {
            this.f156427c = true;
        } else {
            this.f156427c = false;
        }
        if (c19579b.f156434c == 0) {
            this.f156428d = false;
        } else if (c19579b.f156434c == 1) {
            this.f156428d = true;
        } else {
            this.f156428d = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static qu5 m176517a(Context context) {
        return m176518b().m176534j(true).m176533i(fmq0.m122192b(context)).m176537m(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).m176536l(false).m176535k(86400L).m176539o(false).m176538n(86400L).m176532h(context);
    }

    /* JADX INFO: renamed from: b */
    public static C19579b m176518b() {
        return new C19579b();
    }

    /* JADX INFO: renamed from: c */
    public long m176519c() {
        return this.f156430f;
    }

    /* JADX INFO: renamed from: d */
    public long m176520d() {
        return this.f156429e;
    }

    /* JADX INFO: renamed from: e */
    public long m176521e() {
        return this.f156431g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m176522f() {
        return this.f156426b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m176523g() {
        return this.f156427c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m176524h() {
        return this.f156428d;
    }

    public String toString() {
        return "Config{mEventEncrypted=" + this.f156426b + ", mAESKey='" + this.f156425a + "', mMaxFileLength=" + this.f156429e + ", mEventUploadSwitchOpen=" + this.f156427c + ", mPerfUploadSwitchOpen=" + this.f156428d + ", mEventUploadFrequency=" + this.f156430f + ", mPerfUploadFrequency=" + this.f156431g + '}';
    }
}
