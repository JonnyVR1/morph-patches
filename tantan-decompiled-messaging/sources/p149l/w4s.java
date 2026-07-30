package p149l;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC12888b;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.RealConnection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class w4s extends AbstractC12888b {

    /* JADX INFO: renamed from: a */
    public final List<dvl> f184586a;

    /* JADX INFO: renamed from: b */
    public final C20802c[] f184587b;

    /* JADX INFO: renamed from: c */
    public int f184588c;

    /* JADX INFO: renamed from: d */
    public int f184589d;

    /* JADX INFO: renamed from: e */
    public RealConnection f184590e;

    /* JADX INFO: renamed from: f */
    public final String f184591f;

    /* JADX INFO: renamed from: l.w4s$a */
    public class C20800a implements InterfaceC12887a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f184592a;

        public C20800a(String str) {
            this.f184592a = str;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a.a
        /* JADX INFO: renamed from: a */
        public String mo75510a() {
            return this.f184592a;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a.a
        /* JADX INFO: renamed from: b */
        public String mo75511b() {
            return w4s.this.f184591f;
        }
    }

    /* JADX INFO: renamed from: l.w4s$b */
    public class C20801b implements InterfaceC12887a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f184594a;

        public C20801b(String str) {
            this.f184594a = str;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a.a
        /* JADX INFO: renamed from: a */
        public String mo75510a() {
            return this.f184594a;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a.a
        /* JADX INFO: renamed from: b */
        public String mo75511b() {
            return w4s.this.f184591f;
        }
    }

    /* JADX INFO: renamed from: l.w4s$c */
    public static class C20802c {

        /* JADX INFO: renamed from: a */
        public final int f184596a;

        /* JADX INFO: renamed from: b */
        public final int f184597b;

        /* JADX INFO: renamed from: c */
        public int f184598c = 0;

        public C20802c(int i, int i2) {
            this.f184597b = i2;
            this.f184596a = i * 1000;
        }

        /* JADX INFO: renamed from: b */
        public boolean m201570b() {
            int i = this.f184598c + 1;
            this.f184598c = i;
            if (i <= this.f184597b) {
                return true;
            }
            m201571c();
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m201571c() {
            this.f184598c = 0;
        }
    }

    public w4s(int i, int i2, @NotNull List<dvl> list, String str) {
        this.f184586a = list;
        this.f184591f = str;
        this.f184587b = new C20802c[]{new C20802c(i, list.size() + 2), new C20802c(i2, list.size() + 3)};
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC12888b
    /* JADX INFO: renamed from: a */
    public InterfaceC12887a mo75512a(lec0 lec0Var, int i) throws Exception {
        return m201565f(lec0Var, i);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC12888b
    /* JADX INFO: renamed from: b */
    public InterfaceC12887a.a mo75513b() {
        return this.f184590e.m75506m();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC12887a m201563d(lec0 lec0Var, int i) {
        if (this.f184586a.isEmpty()) {
            lec0Var.m149499m().mo216485a("create new connect fail, address list is empty");
            return null;
        }
        if (i > this.f184586a.size() - 1) {
            i = 0;
        }
        String strM113789a = this.f184586a.get(i).m113789a();
        lec0Var.m149499m().mo216485a("create new connect succeed, rawUrl:" + strM113789a);
        lec0Var.m149501o().f167387n = strM113789a;
        return m201564e(lec0Var, strM113789a);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC12887a m201564e(lec0 lec0Var, String str) {
        RealConnection realConnection = this.f184590e;
        if (realConnection == null) {
            this.f184590e = new RealConnection(lec0Var, new C20800a(str));
        } else {
            realConnection.m75508o(new C20801b(str));
        }
        return this.f184590e;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC12887a m201565f(lec0 lec0Var, int i) throws Exception {
        if (i == 0) {
            m201568i();
        }
        lec0Var.m149499m().mo216485a(toString() + "===retryCount:" + i + "===ServerAddressIndex:" + this.f184588c + "===currentReConnectLevel:" + this.f184589d);
        InterfaceC12887a interfaceC12887aM201563d = m201563d(lec0Var, m201566g(i));
        if (interfaceC12887aM201563d == null) {
            lec0Var.m149495i().mo96777c(9, "" + i);
            whq0.m203241a("Retry reconnection exceeds the maximum number of times null");
            return null;
        }
        long jM201567h = m201567h();
        if (jM201567h >= 0) {
            if (i != 0) {
                Thread.sleep(jM201567h);
            }
            return interfaceC12887aM201563d;
        }
        lec0Var.m149495i().mo96777c(9, "" + i);
        throw new Exception(toString() + "Retry reconnection exceeds the maximum number of times");
    }

    /* JADX INFO: renamed from: g */
    public final int m201566g(int i) {
        if (i <= 0 || i % 2 != 0) {
            return this.f184588c;
        }
        int i2 = this.f184588c + 1;
        this.f184588c = i2;
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m201567h() {
        int i = this.f184589d;
        C20802c[] c20802cArr = this.f184587b;
        if (i >= c20802cArr.length) {
            this.f184589d = c20802cArr.length - 1;
            return -1;
        }
        C20802c c20802c = c20802cArr[i];
        if (c20802c.m201570b()) {
            return c20802c.f184596a;
        }
        this.f184589d++;
        return m201567h();
    }

    /* JADX INFO: renamed from: i */
    public final void m201568i() {
        this.f184589d = 0;
        this.f184588c = 0;
        for (C20802c c20802c : this.f184587b) {
            c20802c.m201571c();
        }
    }
}
