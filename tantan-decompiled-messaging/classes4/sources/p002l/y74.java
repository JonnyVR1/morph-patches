package p002l;

import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y74 {

    /* JADX INFO: renamed from: a */
    public String f22717a;

    /* JADX INFO: renamed from: b */
    public String f22718b;

    /* JADX INFO: renamed from: c */
    public int f22719c;

    /* JADX INFO: renamed from: d */
    public int f22720d;

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding f22721e;

    /* JADX INFO: renamed from: f */
    public int f22722f;

    /* JADX INFO: renamed from: g */
    public int f22723g;

    /* JADX INFO: renamed from: h */
    public boolean f22724h;

    /* JADX INFO: renamed from: i */
    public boolean f22725i = false;

    /* JADX INFO: renamed from: j */
    public BLiveCallVolume f22726j;

    /* JADX INFO: renamed from: l.y74$a */
    public interface InterfaceC0911a {
        /* JADX INFO: renamed from: a */
        y74 mo11030a(y74 y74Var);
    }

    public y74(int i) {
        this.f22719c = i;
    }

    /* JADX INFO: renamed from: a */
    public static y74 m26413a(int i) {
        return new y74(i);
    }

    /* JADX INFO: renamed from: b */
    public int m26414b() {
        return this.f22719c;
    }

    /* JADX INFO: renamed from: c */
    public String m26415c() {
        int i = this.f22719c;
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
    public BLiveCallVolume m26416d() {
        return this.f22726j;
    }

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding m26417e() {
        return this.f22721e;
    }

    /* JADX INFO: renamed from: f */
    public String m26418f() {
        return this.f22718b;
    }

    /* JADX INFO: renamed from: g */
    public String m26419g() {
        return this.f22717a;
    }

    /* JADX INFO: renamed from: h */
    public int m26420h() {
        return this.f22720d;
    }

    /* JADX INFO: renamed from: i */
    public boolean m26421i() {
        return this.f22725i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m26422j() {
        return this.f22724h;
    }

    /* JADX INFO: renamed from: k */
    public y74 m26423k(int i) {
        this.f22723g = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public y74 m26424l(MMLiveTranscoding mMLiveTranscoding) {
        this.f22721e = mMLiveTranscoding;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public y74 m26425m(boolean z) {
        this.f22725i = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public y74 m26426n(String str) {
        this.f22718b = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public y74 m26427o(boolean z) {
        this.f22724h = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public y74 m26428p(Long l2) {
        this.f22717a = String.valueOf(l2);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public y74 m26429q(String str) {
        this.f22717a = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public y74 m26430r(int i) {
        this.f22720d = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public y74 m26431s(BLiveCallVolume bLiveCallVolume) {
        this.f22726j = bLiveCallVolume;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public y74 m26432t(int i) {
        this.f22722f = i;
        return this;
    }
}
