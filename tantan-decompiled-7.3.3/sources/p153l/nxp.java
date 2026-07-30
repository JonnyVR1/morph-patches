package p153l;

import android.text.TextUtils;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class nxp {

    /* JADX INFO: renamed from: a */
    public final String f144201a;

    /* JADX INFO: renamed from: b */
    public final String f144202b;

    /* JADX INFO: renamed from: c */
    public final String f144203c;

    /* JADX INFO: renamed from: d */
    public final int f144204d;

    /* JADX INFO: renamed from: e */
    public final String f144205e;

    /* JADX INFO: renamed from: f */
    public final String f144206f;

    /* JADX INFO: renamed from: g */
    public boolean f144207g;

    /* JADX INFO: renamed from: h */
    public String f144208h;

    /* JADX INFO: renamed from: i */
    public String f144209i;

    /* JADX INFO: renamed from: j */
    public String f144210j;

    /* JADX INFO: renamed from: k */
    public String f144211k;

    /* JADX INFO: renamed from: l */
    public int f144212l;

    /* JADX INFO: renamed from: l.nxp$a */
    public static class C18985a {

        /* JADX INFO: renamed from: a */
        public String f144213a;

        /* JADX INFO: renamed from: b */
        public String f144214b;

        /* JADX INFO: renamed from: c */
        public String f144215c;

        /* JADX INFO: renamed from: d */
        public int f144216d;

        /* JADX INFO: renamed from: e */
        public String f144217e;

        /* JADX INFO: renamed from: f */
        public String f144218f;

        /* JADX INFO: renamed from: g */
        public String f144219g;

        /* JADX INFO: renamed from: h */
        public String f144220h;

        /* JADX INFO: renamed from: i */
        public String f144221i;

        /* JADX INFO: renamed from: j */
        public String f144222j;

        /* JADX INFO: renamed from: k */
        public int f144223k = qa00.m175859d(14.0f);

        /* JADX INFO: renamed from: l */
        public boolean f144224l;

        /* JADX INFO: renamed from: n */
        public static C18985a m165234n() {
            return new C18985a();
        }

        /* JADX INFO: renamed from: m */
        public nxp m165235m() {
            return new nxp(this);
        }

        /* JADX INFO: renamed from: o */
        public C18985a m165236o(String str) {
            this.f144222j = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18985a m165237p(String str) {
            this.f144221i = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18985a m165238q(String str) {
            this.f144214b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18985a m165239r(String str) {
            this.f144218f = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18985a m165240s(int i) {
            this.f144216d = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18985a m165241t(int i) {
            this.f144223k = i;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18985a m165242u(String str) {
            this.f144217e = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18985a m165243v(boolean z) {
            this.f144224l = z;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18985a m165244w(String str) {
            this.f144220h = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18985a m165245x(String str) {
            this.f144213a = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C18985a m165246y(String str) {
            this.f144219g = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C18985a m165247z(String str) {
            this.f144215c = xau.m209901F(str, 10);
            return this;
        }
    }

    public nxp(C18985a c18985a) {
        this.f144201a = c18985a.f144213a;
        this.f144202b = c18985a.f144214b;
        this.f144203c = c18985a.f144215c;
        this.f144204d = c18985a.f144216d;
        this.f144205e = c18985a.f144217e;
        this.f144206f = c18985a.f144218f;
        this.f144208h = c18985a.f144219g;
        this.f144209i = c18985a.f144220h;
        this.f144210j = c18985a.f144221i;
        this.f144211k = c18985a.f144222j;
        this.f144212l = c18985a.f144223k;
        this.f144207g = c18985a.f144224l;
    }

    /* JADX INFO: renamed from: a */
    public String m165207a() {
        return this.f144210j;
    }

    /* JADX INFO: renamed from: b */
    public String m165208b() {
        return this.f144211k;
    }

    /* JADX INFO: renamed from: c */
    public String m165209c() {
        return this.f144210j;
    }

    /* JADX INFO: renamed from: d */
    public String m165210d() {
        return this.f144202b;
    }

    /* JADX INFO: renamed from: e */
    public String m165211e() {
        return this.f144206f;
    }

    /* JADX INFO: renamed from: f */
    public int m165212f() {
        return this.f144212l;
    }

    /* JADX INFO: renamed from: g */
    public String m165213g() {
        return this.f144205e;
    }

    /* JADX INFO: renamed from: h */
    public String m165214h() {
        return this.f144209i;
    }

    /* JADX INFO: renamed from: i */
    public String m165215i() {
        return this.f144201a;
    }

    /* JADX INFO: renamed from: j */
    public String m165216j() {
        return this.f144203c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m165217k() {
        return this.f144207g;
    }

    /* JADX INFO: renamed from: l */
    public boolean m165218l() {
        return "not_chat".equals(this.f144206f);
    }

    /* JADX INFO: renamed from: m */
    public boolean m165219m() {
        return TextUtils.equals(this.f144208h, IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY);
    }

    /* JADX INFO: renamed from: n */
    public boolean m165220n() {
        return TextUtils.equals(this.f144208h, "voiceFanBase");
    }

    /* JADX INFO: renamed from: o */
    public void m165221o(int i) {
        this.f144212l = i;
    }
}
