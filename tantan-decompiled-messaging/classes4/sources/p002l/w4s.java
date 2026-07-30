package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC0477b;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.RealConnection;
import java.util.List;
import l.whq0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w4s extends AbstractC0477b {

    /* JADX INFO: renamed from: a */
    public final List<dvl> f21443a;

    /* JADX INFO: renamed from: b */
    public final C0874c[] f21444b;

    /* JADX INFO: renamed from: c */
    public int f21445c;

    /* JADX INFO: renamed from: d */
    public int f21446d;

    /* JADX INFO: renamed from: e */
    public RealConnection f21447e;

    /* JADX INFO: renamed from: f */
    public final String f21448f;

    /* JADX INFO: renamed from: l.w4s$a */
    public class C0872a implements InterfaceC0476a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21449a;

        public C0872a(String str) {
            this.f21449a = str;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a.a
        /* JADX INFO: renamed from: a */
        public String mo9145a() {
            return this.f21449a;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a.a
        /* JADX INFO: renamed from: b */
        public String mo9146b() {
            return w4s.this.f21448f;
        }
    }

    /* JADX INFO: renamed from: l.w4s$b */
    public class C0873b implements InterfaceC0476a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21451a;

        public C0873b(String str) {
            this.f21451a = str;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a.a
        /* JADX INFO: renamed from: a */
        public String mo9145a() {
            return this.f21451a;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a.a
        /* JADX INFO: renamed from: b */
        public String mo9146b() {
            return w4s.this.f21448f;
        }
    }

    /* JADX INFO: renamed from: l.w4s$c */
    public static class C0874c {

        /* JADX INFO: renamed from: a */
        public final int f21453a;

        /* JADX INFO: renamed from: b */
        public final int f21454b;

        /* JADX INFO: renamed from: c */
        public int f21455c = 0;

        public C0874c(int i, int i2) {
            this.f21454b = i2;
            this.f21453a = i * 1000;
        }

        /* JADX INFO: renamed from: b */
        public boolean m24314b() {
            int i = this.f21455c + 1;
            this.f21455c = i;
            if (i <= this.f21454b) {
                return true;
            }
            m24315c();
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m24315c() {
            this.f21455c = 0;
        }
    }

    public w4s(int i, int i2, @NotNull List<dvl> list, String str) {
        this.f21443a = list;
        this.f21448f = str;
        this.f21444b = new C0874c[]{new C0874c(i, list.size() + 2), new C0874c(i2, list.size() + 3)};
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC0477b
    /* JADX INFO: renamed from: a */
    public InterfaceC0476a mo9147a(lec0 lec0Var, int i) throws Exception {
        return m24309f(lec0Var, i);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC0477b
    /* JADX INFO: renamed from: b */
    public InterfaceC0476a.a mo9148b() {
        return this.f21447e.m9141m();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0476a m24307d(lec0 lec0Var, int i) {
        if (this.f21443a.isEmpty()) {
            lec0Var.m17157m().mo26978a("create new connect fail, address list is empty");
            return null;
        }
        if (i > this.f21443a.size() - 1) {
            i = 0;
        }
        String strM12061a = this.f21443a.get(i).m12061a();
        lec0Var.m17157m().mo26978a("create new connect succeed, rawUrl:" + strM12061a);
        lec0Var.m17159o().f19379n = strM12061a;
        return m24308e(lec0Var, strM12061a);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0476a m24308e(lec0 lec0Var, String str) {
        RealConnection realConnection = this.f21447e;
        if (realConnection == null) {
            this.f21447e = new RealConnection(lec0Var, new C0872a(str));
        } else {
            realConnection.m9143o(new C0873b(str));
        }
        return this.f21447e;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0476a m24309f(lec0 lec0Var, int i) throws Exception {
        if (i == 0) {
            m24312i();
        }
        lec0Var.m17157m().mo26978a(toString() + "===retryCount:" + i + "===ServerAddressIndex:" + this.f21445c + "===currentReConnectLevel:" + this.f21446d);
        InterfaceC0476a interfaceC0476aM24307d = m24307d(lec0Var, m24310g(i));
        if (interfaceC0476aM24307d == null) {
            lec0Var.m17153i().mo9788c(9, "" + i);
            whq0.a("Retry reconnection exceeds the maximum number of times null");
            return null;
        }
        long jM24311h = m24311h();
        if (jM24311h >= 0) {
            if (i != 0) {
                Thread.sleep(jM24311h);
            }
            return interfaceC0476aM24307d;
        }
        lec0Var.m17153i().mo9788c(9, "" + i);
        throw new Exception(toString() + "Retry reconnection exceeds the maximum number of times");
    }

    /* JADX INFO: renamed from: g */
    public final int m24310g(int i) {
        if (i <= 0 || i % 2 != 0) {
            return this.f21445c;
        }
        int i2 = this.f21445c + 1;
        this.f21445c = i2;
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m24311h() {
        int i = this.f21446d;
        C0874c[] c0874cArr = this.f21444b;
        if (i >= c0874cArr.length) {
            this.f21446d = c0874cArr.length - 1;
            return -1;
        }
        C0874c c0874c = c0874cArr[i];
        if (c0874c.m24314b()) {
            return c0874c.f21453a;
        }
        this.f21446d++;
        return m24311h();
    }

    /* JADX INFO: renamed from: i */
    public final void m24312i() {
        this.f21446d = 0;
        this.f21445c = 0;
        for (C0874c c0874c : this.f21444b) {
            c0874c.m24315c();
        }
    }
}
