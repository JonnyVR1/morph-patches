package p153l;

import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;

/* JADX INFO: loaded from: classes4.dex */
public class x84 {

    /* JADX INFO: renamed from: a */
    public String f192779a;

    /* JADX INFO: renamed from: b */
    public String f192780b;

    /* JADX INFO: renamed from: c */
    public int f192781c;

    /* JADX INFO: renamed from: d */
    public int f192782d;

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding f192783e;

    /* JADX INFO: renamed from: f */
    public int f192784f;

    /* JADX INFO: renamed from: g */
    public int f192785g;

    /* JADX INFO: renamed from: h */
    public boolean f192786h;

    /* JADX INFO: renamed from: i */
    public boolean f192787i = false;

    /* JADX INFO: renamed from: j */
    public BLiveCallVolume f192788j;

    /* JADX INFO: renamed from: l.x84$a */
    public interface InterfaceC21264a {
        /* JADX INFO: renamed from: a */
        x84 mo99054a(x84 x84Var);
    }

    public x84(int i) {
        this.f192781c = i;
    }

    /* JADX INFO: renamed from: a */
    public static x84 m209668a(int i) {
        return new x84(i);
    }

    /* JADX INFO: renamed from: b */
    public int m209669b() {
        return this.f192781c;
    }

    /* JADX INFO: renamed from: c */
    public String m209670c() {
        int i = this.f192781c;
        if (i == 1) {
            return "token request";
        }
        if (i == 2) {
            return "member leave channel";
        }
        if (i == 3) {
            return "remote member  add";
        }
        if (i == 4) {
            return "query user info ";
        }
        if (i == 5) {
            return "local leave channel";
        }
        if (i == 6) {
            return "local join channel";
        }
        if (i == 7) {
            return "push  failed";
        }
        if (i == 8) {
            return "update volume";
        }
        if (i == 11) {
            return "push starting";
        }
        if (i == 12) {
            return "Join channel failed";
        }
        if (i == 13) {
            return "on received first video frame";
        }
        if (i == 14) {
            return "on received user inifo";
        }
        if (i == 15) {
            return "on connection lost";
        }
        return i == 16 ? "on engine error" : "";
    }

    /* JADX INFO: renamed from: d */
    public BLiveCallVolume m209671d() {
        return this.f192788j;
    }

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding m209672e() {
        return this.f192783e;
    }

    /* JADX INFO: renamed from: f */
    public String m209673f() {
        return this.f192780b;
    }

    /* JADX INFO: renamed from: g */
    public String m209674g() {
        return this.f192779a;
    }

    /* JADX INFO: renamed from: h */
    public int m209675h() {
        return this.f192782d;
    }

    /* JADX INFO: renamed from: i */
    public boolean m209676i() {
        return this.f192787i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m209677j() {
        return this.f192786h;
    }

    /* JADX INFO: renamed from: k */
    public x84 m209678k(int i) {
        this.f192785g = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public x84 m209679l(MMLiveTranscoding mMLiveTranscoding) {
        this.f192783e = mMLiveTranscoding;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public x84 m209680m(boolean z) {
        this.f192787i = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public x84 m209681n(String str) {
        this.f192780b = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public x84 m209682o(boolean z) {
        this.f192786h = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public x84 m209683p(Long l2) {
        this.f192779a = String.valueOf(l2);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public x84 m209684q(String str) {
        this.f192779a = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public x84 m209685r(int i) {
        this.f192782d = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public x84 m209686s(BLiveCallVolume bLiveCallVolume) {
        this.f192788j = bLiveCallVolume;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public x84 m209687t(int i) {
        this.f192784f = i;
        return this;
    }
}
