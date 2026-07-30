package p153l;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC13051b;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.RealConnection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class x6s extends AbstractC13051b {

    /* JADX INFO: renamed from: a */
    public final List<vxl> f192608a;

    /* JADX INFO: renamed from: b */
    public final C21261c[] f192609b;

    /* JADX INFO: renamed from: c */
    public int f192610c;

    /* JADX INFO: renamed from: d */
    public int f192611d;

    /* JADX INFO: renamed from: e */
    public RealConnection f192612e;

    /* JADX INFO: renamed from: f */
    public final String f192613f;

    /* JADX INFO: renamed from: l.x6s$a */
    public class C21259a implements InterfaceC13050a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f192614a;

        public C21259a(String str) {
            this.f192614a = str;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a.a
        /* JADX INFO: renamed from: a */
        public String mo76693a() {
            return this.f192614a;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a.a
        /* JADX INFO: renamed from: b */
        public String mo76694b() {
            return x6s.this.f192613f;
        }
    }

    /* JADX INFO: renamed from: l.x6s$b */
    public class C21260b implements InterfaceC13050a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f192616a;

        public C21260b(String str) {
            this.f192616a = str;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a.a
        /* JADX INFO: renamed from: a */
        public String mo76693a() {
            return this.f192616a;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a.a
        /* JADX INFO: renamed from: b */
        public String mo76694b() {
            return x6s.this.f192613f;
        }
    }

    /* JADX INFO: renamed from: l.x6s$c */
    public static class C21261c {

        /* JADX INFO: renamed from: a */
        public final int f192618a;

        /* JADX INFO: renamed from: b */
        public final int f192619b;

        /* JADX INFO: renamed from: c */
        public int f192620c = 0;

        public C21261c(int i, int i2) {
            this.f192619b = i2;
            this.f192618a = i * 1000;
        }

        /* JADX INFO: renamed from: b */
        public boolean m209543b() {
            int i = this.f192620c + 1;
            this.f192620c = i;
            if (i <= this.f192619b) {
                return true;
            }
            m209544c();
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m209544c() {
            this.f192620c = 0;
        }
    }

    public x6s(int i, int i2, @NotNull List<vxl> list, String str) {
        this.f192608a = list;
        this.f192613f = str;
        this.f192609b = new C21261c[]{new C21261c(i, list.size() + 2), new C21261c(i2, list.size() + 3)};
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC13051b
    /* JADX INFO: renamed from: a */
    public InterfaceC13050a mo76695a(smc0 smc0Var, int i) throws Exception {
        return m209538f(smc0Var, i);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC13051b
    /* JADX INFO: renamed from: b */
    public InterfaceC13050a.a mo76696b() {
        return this.f192612e.m76689m();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13050a m209536d(smc0 smc0Var, int i) {
        if (this.f192608a.isEmpty()) {
            smc0Var.m186795m().mo204126a("create new connect fail, address list is empty");
            return null;
        }
        if (i > this.f192608a.size() - 1) {
            i = 0;
        }
        String strM203863a = this.f192608a.get(i).m203863a();
        smc0Var.m186795m().mo204126a("create new connect succeed, rawUrl:" + strM203863a);
        smc0Var.m186797o().f161099n = strM203863a;
        return m209537e(smc0Var, strM203863a);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13050a m209537e(smc0 smc0Var, String str) {
        RealConnection realConnection = this.f192612e;
        if (realConnection == null) {
            this.f192612e = new RealConnection(smc0Var, new C21259a(str));
        } else {
            realConnection.m76691o(new C21260b(str));
        }
        return this.f192612e;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13050a m209538f(smc0 smc0Var, int i) throws Exception {
        if (i == 0) {
            m209541i();
        }
        smc0Var.m186795m().mo204126a(toString() + "===retryCount:" + i + "===ServerAddressIndex:" + this.f192610c + "===currentReConnectLevel:" + this.f192611d);
        InterfaceC13050a interfaceC13050aM209536d = m209536d(smc0Var, m209539g(i));
        if (interfaceC13050aM209536d == null) {
            smc0Var.m186791i().mo135098c(9, "" + i);
            brq0.m106161a("Retry reconnection exceeds the maximum number of times null");
            return null;
        }
        long jM209540h = m209540h();
        if (jM209540h >= 0) {
            if (i != 0) {
                Thread.sleep(jM209540h);
            }
            return interfaceC13050aM209536d;
        }
        smc0Var.m186791i().mo135098c(9, "" + i);
        throw new Exception(toString() + "Retry reconnection exceeds the maximum number of times");
    }

    /* JADX INFO: renamed from: g */
    public final int m209539g(int i) {
        if (i <= 0 || i % 2 != 0) {
            return this.f192610c;
        }
        int i2 = this.f192610c + 1;
        this.f192610c = i2;
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m209540h() {
        int i = this.f192611d;
        C21261c[] c21261cArr = this.f192609b;
        if (i >= c21261cArr.length) {
            this.f192611d = c21261cArr.length - 1;
            return -1;
        }
        C21261c c21261c = c21261cArr[i];
        if (c21261c.m209543b()) {
            return c21261c.f192618a;
        }
        this.f192611d++;
        return m209540h();
    }

    /* JADX INFO: renamed from: i */
    public final void m209541i() {
        this.f192611d = 0;
        this.f192610c = 0;
        for (C21261c c21261c : this.f192609b) {
            c21261c.m209544c();
        }
    }
}
