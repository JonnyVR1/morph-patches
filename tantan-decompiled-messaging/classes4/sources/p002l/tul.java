package p002l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class tul implements g3f.InterfaceC0581a {

    /* JADX INFO: renamed from: a */
    public g3f f20383a;

    /* JADX INFO: renamed from: b */
    public int f20384b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC0476a.a f20385c;

    /* JADX INFO: renamed from: d */
    public Throwable f20386d;

    /* JADX INFO: renamed from: l.tul$a */
    public static class C0839a extends tul {
        public C0839a(g3f g3fVar, InterfaceC0476a.a aVar, Throwable th) {
            super(g3fVar, 7, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.tul$b */
    public static class C0840b extends tul {
        public C0840b(g3f g3fVar, InterfaceC0476a.a aVar) {
            super(g3fVar, 6, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$c */
    public static class C0841c extends tul {
        public C0841c(g3f g3fVar, InterfaceC0476a.a aVar, Throwable th) {
            super(g3fVar, 4, aVar, th);
        }
    }

    /* JADX INFO: renamed from: l.tul$d */
    public static class C0842d extends tul {
        public C0842d(g3f g3fVar, InterfaceC0476a.a aVar) {
            super(g3fVar, 3, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$e */
    public static class C0843e extends tul {
        public C0843e(g3f g3fVar, InterfaceC0476a.a aVar) {
            super(g3fVar, 2, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$f */
    public static class C0844f extends tul {
        public C0844f(g3f g3fVar, InterfaceC0476a.a aVar) {
            super(g3fVar, 5, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$g */
    public static abstract class AbstractC0845g implements g3f.InterfaceC0582b<tul> {

        /* JADX INFO: renamed from: a */
        public int f20387a;

        /* JADX INFO: renamed from: b */
        public int f20388b;

        @Override // p002l.g3f.InterfaceC0582b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13544a(tul tulVar) {
            this.f20387a = this.f20388b;
            int iM23176e = tulVar.m23176e();
            this.f20388b = iM23176e;
            mo12792c(this.f20387a, iM23176e, tulVar);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo12792c(int i, int i2, tul tulVar);
    }

    /* JADX INFO: renamed from: l.tul$h */
    public static class C0846h extends tul {
        public C0846h(g3f g3fVar, InterfaceC0476a.a aVar, Throwable th) {
            super(g3fVar, 12, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$i */
    public static class C0847i extends tul {
        public C0847i(g3f g3fVar, InterfaceC0476a.a aVar) {
            super(g3fVar, 1, aVar, new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: l.tul$j */
    public static class C0848j extends tul {
        public C0848j(g3f g3fVar) {
            super(g3fVar, 13, null, new Throwable[0]);
        }
    }

    public tul(g3f g3fVar, int i, InterfaceC0476a.a aVar, Throwable... thArr) {
        this.f20383a = g3fVar;
        this.f20384b = i;
        this.f20385c = aVar;
        if (thArr.length != 0) {
            this.f20386d = thArr[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23172a() {
        this.f20383a.m13541b(this);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0476a.a m23173b() {
        return this.f20385c;
    }

    /* JADX INFO: renamed from: c */
    public String m23174c() {
        String strM23177f = m23177f();
        if (this.f20385c != null) {
            strM23177f = strM23177f + "," + this.f20385c.mo9145a();
        }
        if (this.f20386d == null) {
            return strM23177f;
        }
        return strM23177f + "," + this.f20386d.getMessage();
    }

    /* JADX INFO: renamed from: d */
    public Throwable m23175d() {
        return this.f20386d;
    }

    /* JADX INFO: renamed from: e */
    public int m23176e() {
        return this.f20384b;
    }

    /* JADX INFO: renamed from: f */
    public String m23177f() {
        int i = this.f20384b;
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
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                return "AuthError";
            default:
                return "NA";
        }
    }
}
