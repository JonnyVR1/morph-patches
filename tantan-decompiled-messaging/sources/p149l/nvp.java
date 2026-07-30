package p149l;

import android.text.TextUtils;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class nvp {

    /* JADX INFO: renamed from: a */
    public final String f140784a;

    /* JADX INFO: renamed from: b */
    public final String f140785b;

    /* JADX INFO: renamed from: c */
    public final String f140786c;

    /* JADX INFO: renamed from: d */
    public final int f140787d;

    /* JADX INFO: renamed from: e */
    public final String f140788e;

    /* JADX INFO: renamed from: f */
    public final String f140789f;

    /* JADX INFO: renamed from: g */
    public boolean f140790g;

    /* JADX INFO: renamed from: h */
    public String f140791h;

    /* JADX INFO: renamed from: i */
    public String f140792i;

    /* JADX INFO: renamed from: j */
    public String f140793j;

    /* JADX INFO: renamed from: k */
    public String f140794k;

    /* JADX INFO: renamed from: l */
    public int f140795l;

    /* JADX INFO: renamed from: l.nvp$a */
    public static class C18786a {

        /* JADX INFO: renamed from: a */
        public String f140796a;

        /* JADX INFO: renamed from: b */
        public String f140797b;

        /* JADX INFO: renamed from: c */
        public String f140798c;

        /* JADX INFO: renamed from: d */
        public int f140799d;

        /* JADX INFO: renamed from: e */
        public String f140800e;

        /* JADX INFO: renamed from: f */
        public String f140801f;

        /* JADX INFO: renamed from: g */
        public String f140802g;

        /* JADX INFO: renamed from: h */
        public String f140803h;

        /* JADX INFO: renamed from: i */
        public String f140804i;

        /* JADX INFO: renamed from: j */
        public String f140805j;

        /* JADX INFO: renamed from: k */
        public int f140806k = t100.m186890d(14.0f);

        /* JADX INFO: renamed from: l */
        public boolean f140807l;

        /* JADX INFO: renamed from: n */
        public static C18786a m161734n() {
            return new C18786a();
        }

        /* JADX INFO: renamed from: m */
        public nvp m161735m() {
            return new nvp(this);
        }

        /* JADX INFO: renamed from: o */
        public C18786a m161736o(String str) {
            this.f140805j = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18786a m161737p(String str) {
            this.f140804i = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18786a m161738q(String str) {
            this.f140797b = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18786a m161739r(String str) {
            this.f140801f = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18786a m161740s(int i) {
            this.f140799d = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18786a m161741t(int i) {
            this.f140806k = i;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18786a m161742u(String str) {
            this.f140800e = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18786a m161743v(boolean z) {
            this.f140807l = z;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18786a m161744w(String str) {
            this.f140803h = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18786a m161745x(String str) {
            this.f140796a = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C18786a m161746y(String str) {
            this.f140802g = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C18786a m161747z(String str) {
            this.f140798c = w8u.m202208F(str, 10);
            return this;
        }
    }

    public nvp(C18786a c18786a) {
        this.f140784a = c18786a.f140796a;
        this.f140785b = c18786a.f140797b;
        this.f140786c = c18786a.f140798c;
        this.f140787d = c18786a.f140799d;
        this.f140788e = c18786a.f140800e;
        this.f140789f = c18786a.f140801f;
        this.f140791h = c18786a.f140802g;
        this.f140792i = c18786a.f140803h;
        this.f140793j = c18786a.f140804i;
        this.f140794k = c18786a.f140805j;
        this.f140795l = c18786a.f140806k;
        this.f140790g = c18786a.f140807l;
    }

    /* JADX INFO: renamed from: a */
    public String m161707a() {
        return this.f140793j;
    }

    /* JADX INFO: renamed from: b */
    public String m161708b() {
        return this.f140794k;
    }

    /* JADX INFO: renamed from: c */
    public String m161709c() {
        return this.f140793j;
    }

    /* JADX INFO: renamed from: d */
    public String m161710d() {
        return this.f140785b;
    }

    /* JADX INFO: renamed from: e */
    public String m161711e() {
        return this.f140789f;
    }

    /* JADX INFO: renamed from: f */
    public int m161712f() {
        return this.f140795l;
    }

    /* JADX INFO: renamed from: g */
    public String m161713g() {
        return this.f140788e;
    }

    /* JADX INFO: renamed from: h */
    public String m161714h() {
        return this.f140792i;
    }

    /* JADX INFO: renamed from: i */
    public String m161715i() {
        return this.f140784a;
    }

    /* JADX INFO: renamed from: j */
    public String m161716j() {
        return this.f140786c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m161717k() {
        return this.f140790g;
    }

    /* JADX INFO: renamed from: l */
    public boolean m161718l() {
        return "not_chat".equals(this.f140789f);
    }

    /* JADX INFO: renamed from: m */
    public boolean m161719m() {
        return TextUtils.equals(this.f140791h, IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY);
    }

    /* JADX INFO: renamed from: n */
    public boolean m161720n() {
        return TextUtils.equals(this.f140791h, "voiceFanBase");
    }

    /* JADX INFO: renamed from: o */
    public void m161721o(int i) {
        this.f140795l = i;
    }
}
