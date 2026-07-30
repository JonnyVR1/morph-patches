package p149l;

import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;

/* JADX INFO: loaded from: classes4.dex */
public class y74 {

    /* JADX INFO: renamed from: a */
    public String f196660a;

    /* JADX INFO: renamed from: b */
    public String f196661b;

    /* JADX INFO: renamed from: c */
    public int f196662c;

    /* JADX INFO: renamed from: d */
    public int f196663d;

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding f196664e;

    /* JADX INFO: renamed from: f */
    public int f196665f;

    /* JADX INFO: renamed from: g */
    public int f196666g;

    /* JADX INFO: renamed from: h */
    public boolean f196667h;

    /* JADX INFO: renamed from: i */
    public boolean f196668i = false;

    /* JADX INFO: renamed from: j */
    public BLiveCallVolume f196669j;

    /* JADX INFO: renamed from: l.y74$a */
    public interface InterfaceC21330a {
        /* JADX INFO: renamed from: a */
        y74 mo106704a(y74 y74Var);
    }

    public y74(int i) {
        this.f196662c = i;
    }

    /* JADX INFO: renamed from: a */
    public static y74 m213284a(int i) {
        return new y74(i);
    }

    /* JADX INFO: renamed from: b */
    public int m213285b() {
        return this.f196662c;
    }

    /* JADX INFO: renamed from: c */
    public String m213286c() {
        int i = this.f196662c;
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
    public BLiveCallVolume m213287d() {
        return this.f196669j;
    }

    /* JADX INFO: renamed from: e */
    public MMLiveTranscoding m213288e() {
        return this.f196664e;
    }

    /* JADX INFO: renamed from: f */
    public String m213289f() {
        return this.f196661b;
    }

    /* JADX INFO: renamed from: g */
    public String m213290g() {
        return this.f196660a;
    }

    /* JADX INFO: renamed from: h */
    public int m213291h() {
        return this.f196663d;
    }

    /* JADX INFO: renamed from: i */
    public boolean m213292i() {
        return this.f196668i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m213293j() {
        return this.f196667h;
    }

    /* JADX INFO: renamed from: k */
    public y74 m213294k(int i) {
        this.f196666g = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public y74 m213295l(MMLiveTranscoding mMLiveTranscoding) {
        this.f196664e = mMLiveTranscoding;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public y74 m213296m(boolean z) {
        this.f196668i = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public y74 m213297n(String str) {
        this.f196661b = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public y74 m213298o(boolean z) {
        this.f196667h = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public y74 m213299p(Long l2) {
        this.f196660a = String.valueOf(l2);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public y74 m213300q(String str) {
        this.f196660a = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public y74 m213301r(int i) {
        this.f196663d = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public y74 m213302s(BLiveCallVolume bLiveCallVolume) {
        this.f196669j = bLiveCallVolume;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public y74 m213303t(int i) {
        this.f196665f = i;
        return this;
    }
}
