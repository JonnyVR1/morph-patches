package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxl implements l4f.InterfaceC18342a {

    /* JADX INFO: renamed from: a */
    public l4f f106957a;

    /* JADX INFO: renamed from: b */
    public int f106958b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC13050a.a f106959c;

    /* JADX INFO: renamed from: d */
    public Throwable f106960d;

    /* JADX INFO: renamed from: l.gxl$a */
    public static class C17335a extends gxl {
        public C17335a(l4f l4fVar, InterfaceC13050a.a aVar, Throwable th) {
            super(l4fVar, 7, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.gxl$b */
    public static class C17336b extends gxl {
        public C17336b(l4f l4fVar, InterfaceC13050a.a aVar) {
            super(l4fVar, 6, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$c */
    public static class C17337c extends gxl {
        public C17337c(l4f l4fVar, InterfaceC13050a.a aVar, Throwable th) {
            super(l4fVar, 4, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.gxl$d */
    public static class C17338d extends gxl {
        public C17338d(l4f l4fVar, InterfaceC13050a.a aVar) {
            super(l4fVar, 3, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$e */
    public static class C17339e extends gxl {
        public C17339e(l4f l4fVar, InterfaceC13050a.a aVar) {
            super(l4fVar, 2, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$f */
    public static class C17340f extends gxl {
        public C17340f(l4f l4fVar, InterfaceC13050a.a aVar) {
            super(l4fVar, 5, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$g */
    public static abstract class AbstractC17341g implements l4f.InterfaceC18343b<gxl> {

        /* JADX INFO: renamed from: a */
        public int f106961a;

        /* JADX INFO: renamed from: b */
        public int f106962b;

        @Override // p153l.l4f.InterfaceC18343b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo132882a(gxl gxlVar) {
            this.f106961a = this.f106962b;
            int iM132880e = gxlVar.m132880e();
            this.f106962b = iM132880e;
            mo132884c(this.f106961a, iM132880e, gxlVar);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo132884c(int i, int i2, gxl gxlVar);
    }

    /* JADX INFO: renamed from: l.gxl$h */
    public static class C17342h extends gxl {
        public C17342h(l4f l4fVar, InterfaceC13050a.a aVar, Throwable th) {
            super(l4fVar, 12, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$i */
    public static class C17343i extends gxl {
        public C17343i(l4f l4fVar, InterfaceC13050a.a aVar) {
            super(l4fVar, 1, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.gxl$j */
    public static class C17344j extends gxl {
        public C17344j(l4f l4fVar) {
            super(l4fVar, 13, null, new Throwable[0]);
        }
    }

    public gxl(l4f l4fVar, int i, InterfaceC13050a.a aVar, Throwable... thArr) {
        this.f106957a = l4fVar;
        this.f106958b = i;
        this.f106959c = aVar;
        if (thArr.length != 0) {
            this.f106960d = thArr[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m132876a() {
        this.f106957a.m152762b(this);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13050a.a m132877b() {
        return this.f106959c;
    }

    /* JADX INFO: renamed from: c */
    public String m132878c() {
        String strM132881f = m132881f();
        if (this.f106959c != null) {
            strM132881f = strM132881f + Constants.SEPARATOR_COMMA + this.f106959c.mo76693a();
        }
        if (this.f106960d == null) {
            return strM132881f;
        }
        return strM132881f + Constants.SEPARATOR_COMMA + this.f106960d.getMessage();
    }

    /* JADX INFO: renamed from: d */
    public Throwable m132879d() {
        return this.f106960d;
    }

    /* JADX INFO: renamed from: e */
    public int m132880e() {
        return this.f106958b;
    }

    /* JADX INFO: renamed from: f */
    public String m132881f() {
        int i = this.f106958b;
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
