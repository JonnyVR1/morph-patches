package p153l;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class uv5 {

    /* JADX INFO: renamed from: a */
    private String f181109a;

    /* JADX INFO: renamed from: b */
    private boolean f181110b;

    /* JADX INFO: renamed from: c */
    private boolean f181111c;

    /* JADX INFO: renamed from: d */
    private boolean f181112d;

    /* JADX INFO: renamed from: e */
    private long f181113e;

    /* JADX INFO: renamed from: f */
    private long f181114f;

    /* JADX INFO: renamed from: g */
    private long f181115g;

    /* JADX INFO: renamed from: l.uv5$b */
    public static class C20683b {

        /* JADX INFO: renamed from: a */
        private int f181116a = -1;

        /* JADX INFO: renamed from: b */
        private int f181117b = -1;

        /* JADX INFO: renamed from: c */
        private int f181118c = -1;

        /* JADX INFO: renamed from: d */
        private String f181119d = null;

        /* JADX INFO: renamed from: e */
        private long f181120e = -1;

        /* JADX INFO: renamed from: f */
        private long f181121f = -1;

        /* JADX INFO: renamed from: g */
        private long f181122g = -1;

        /* JADX INFO: renamed from: h */
        public uv5 m198255h(Context context) {
            return new uv5(context, this);
        }

        /* JADX INFO: renamed from: i */
        public C20683b m198256i(String str) {
            this.f181119d = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20683b m198257j(boolean z) {
            this.f181116a = z ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20683b m198258k(long j) {
            this.f181121f = j;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C20683b m198259l(boolean z) {
            this.f181117b = z ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20683b m198260m(long j) {
            this.f181120e = j;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C20683b m198261n(long j) {
            this.f181122g = j;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C20683b m198262o(boolean z) {
            this.f181118c = z ? 1 : 0;
            return this;
        }
    }

    private uv5(Context context, C20683b c20683b) {
        this.f181110b = true;
        this.f181111c = false;
        this.f181112d = false;
        this.f181113e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f181114f = 86400L;
        this.f181115g = 86400L;
        if (c20683b.f181116a == 0) {
            this.f181110b = false;
        } else if (c20683b.f181116a == 1) {
            this.f181110b = true;
        } else {
            this.f181110b = true;
        }
        if (TextUtils.isEmpty(c20683b.f181119d)) {
            this.f181109a = lvq0.m156001b(context);
        } else {
            this.f181109a = c20683b.f181119d;
        }
        if (c20683b.f181120e > -1) {
            this.f181113e = c20683b.f181120e;
        } else {
            this.f181113e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (c20683b.f181121f > -1) {
            this.f181114f = c20683b.f181121f;
        } else {
            this.f181114f = 86400L;
        }
        if (c20683b.f181122g > -1) {
            this.f181115g = c20683b.f181122g;
        } else {
            this.f181115g = 86400L;
        }
        if (c20683b.f181117b != 0 && c20683b.f181117b == 1) {
            this.f181111c = true;
        } else {
            this.f181111c = false;
        }
        if (c20683b.f181118c == 0) {
            this.f181112d = false;
        } else if (c20683b.f181118c == 1) {
            this.f181112d = true;
        } else {
            this.f181112d = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static uv5 m198240a(Context context) {
        return m198241b().m198257j(true).m198256i(lvq0.m156001b(context)).m198260m(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).m198259l(false).m198258k(86400L).m198262o(false).m198261n(86400L).m198255h(context);
    }

    /* JADX INFO: renamed from: b */
    public static C20683b m198241b() {
        return new C20683b();
    }

    /* JADX INFO: renamed from: c */
    public long m198242c() {
        return this.f181114f;
    }

    /* JADX INFO: renamed from: d */
    public long m198243d() {
        return this.f181113e;
    }

    /* JADX INFO: renamed from: e */
    public long m198244e() {
        return this.f181115g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m198245f() {
        return this.f181110b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m198246g() {
        return this.f181111c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m198247h() {
        return this.f181112d;
    }

    public String toString() {
        return "Config{mEventEncrypted=" + this.f181110b + ", mAESKey='" + this.f181109a + "', mMaxFileLength=" + this.f181113e + ", mEventUploadSwitchOpen=" + this.f181111c + ", mPerfUploadSwitchOpen=" + this.f181112d + ", mEventUploadFrequency=" + this.f181114f + ", mPerfUploadFrequency=" + this.f181115g + '}';
    }
}
