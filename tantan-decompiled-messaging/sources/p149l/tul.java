package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tul implements g3f.InterfaceC16988a {

    /* JADX INFO: renamed from: a */
    public g3f f172193a;

    /* JADX INFO: renamed from: b */
    public int f172194b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC12887a.a f172195c;

    /* JADX INFO: renamed from: d */
    public Throwable f172196d;

    /* JADX INFO: renamed from: l.tul$a */
    public static class C20282a extends tul {
        public C20282a(g3f g3fVar, InterfaceC12887a.a aVar, Throwable th) {
            super(g3fVar, 7, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.tul$b */
    public static class C20283b extends tul {
        public C20283b(g3f g3fVar, InterfaceC12887a.a aVar) {
            super(g3fVar, 6, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$c */
    public static class C20284c extends tul {
        public C20284c(g3f g3fVar, InterfaceC12887a.a aVar, Throwable th) {
            super(g3fVar, 4, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.tul$d */
    public static class C20285d extends tul {
        public C20285d(g3f g3fVar, InterfaceC12887a.a aVar) {
            super(g3fVar, 3, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$e */
    public static class C20286e extends tul {
        public C20286e(g3f g3fVar, InterfaceC12887a.a aVar) {
            super(g3fVar, 2, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$f */
    public static class C20287f extends tul {
        public C20287f(g3f g3fVar, InterfaceC12887a.a aVar) {
            super(g3fVar, 5, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$g */
    public static abstract class AbstractC20288g implements g3f.InterfaceC16989b<tul> {

        /* JADX INFO: renamed from: a */
        public int f172197a;

        /* JADX INFO: renamed from: b */
        public int f172198b;

        @Override // p149l.g3f.InterfaceC16989b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo124265a(tul tulVar) {
            this.f172197a = this.f172198b;
            int iM190710e = tulVar.m190710e();
            this.f172198b = iM190710e;
            mo118457c(this.f172197a, iM190710e, tulVar);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo118457c(int i, int i2, tul tulVar);
    }

    /* JADX INFO: renamed from: l.tul$h */
    public static class C20289h extends tul {
        public C20289h(g3f g3fVar, InterfaceC12887a.a aVar, Throwable th) {
            super(g3fVar, 12, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$i */
    public static class C20290i extends tul {
        public C20290i(g3f g3fVar, InterfaceC12887a.a aVar) {
            super(g3fVar, 1, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$j */
    public static class C20291j extends tul {
        public C20291j(g3f g3fVar) {
            super(g3fVar, 13, null, new Throwable[0]);
        }
    }

    public tul(g3f g3fVar, int i, InterfaceC12887a.a aVar, Throwable... thArr) {
        this.f172193a = g3fVar;
        this.f172194b = i;
        this.f172195c = aVar;
        if (thArr.length != 0) {
            this.f172196d = thArr[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m190706a() {
        this.f172193a.m124262b(this);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12887a.a m190707b() {
        return this.f172195c;
    }

    /* JADX INFO: renamed from: c */
    public String m190708c() {
        String strM190711f = m190711f();
        if (this.f172195c != null) {
            strM190711f = strM190711f + Constants.SEPARATOR_COMMA + this.f172195c.mo75510a();
        }
        if (this.f172196d == null) {
            return strM190711f;
        }
        return strM190711f + Constants.SEPARATOR_COMMA + this.f172196d.getMessage();
    }

    /* JADX INFO: renamed from: d */
    public Throwable m190709d() {
        return this.f172196d;
    }

    /* JADX INFO: renamed from: e */
    public int m190710e() {
        return this.f172194b;
    }

    /* JADX INFO: renamed from: f */
    public String m190711f() {
        int i = this.f172194b;
        if (i == 12) {
            return "IOError";
        }
        if (i == 13) {
            return "KeepAliveError";
        }
        switch (i) {
            case 1:
                return "Idle";
            case 2:
                return "Connecting";
            case 3:
                return "Connected";
            case 4:
                return "ConnectError";
            case 5:
                return "Disconnected";
            case 6:
                return "AuthSuccess";
            case 7:
                return "AuthError";
            default:
                return "NA";
        }
    }
}
