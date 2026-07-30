package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class z2l0 implements qul {

    /* JADX INFO: renamed from: a */
    public boolean f201255a;

    /* JADX INFO: renamed from: b */
    public r0w f201256b;

    /* JADX INFO: renamed from: c */
    public c4g0 f201257c;

    /* JADX INFO: renamed from: d */
    public c4g0 f201258d;

    /* JADX INFO: renamed from: e */
    public C22392a<Boolean> f201259e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public ti1 f201260f = new ti1();

    /* JADX INFO: renamed from: g */
    public String f201261g;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m216971d(Connector connector) {
        if (connector != null) {
            return Boolean.TRUE;
        }
        CrashHelper.m81296c(new IllegalArgumentException("live long live data is null"));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m216973f(Throwable th) {
        lsi0.m151580j(ypv.f199497e.getString(R$string.f47661yk));
        gkh0.m126627j("[live][longlink]", "long link data is fail");
        CrashHelper.m81296c(th);
    }

    @Override // p149l.qul
    /* JADX INFO: renamed from: a */
    public void mo176624a(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.m154992z(this.f201257c);
        this.f201257c = b0w.m99791c(str, str2, str3, str4, "videoChat", "").filter(new w9j() { // from class: l.v2l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z2l0.m216971d((Connector) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.w2l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184251a.m216977j(str, z, str2, str3, str4, (Connector) obj);
            }
        }, new e30() { // from class: l.x2l0
            @Override // p149l.e30
            public final void call(Object obj) {
                z2l0.m216973f((Throwable) obj);
            }
        }));
    }

    @Override // p149l.qul
    /* JADX INFO: renamed from: b */
    public void mo176625b(boolean z) {
        this.f201259e.m132487l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m216974g() {
        r0w r0wVar;
        if (TextUtils.isEmpty(this.f201261g) || (r0wVar = this.f201256b) == null) {
            return;
        }
        r0wVar.mo177416h(this.f201261g);
        this.f201256b = null;
    }

    /* JADX INFO: renamed from: h */
    public C22306c<Boolean> m216975h() {
        return this.f201259e.asObservable();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m216976i(boolean z, String str, String str2, String str3, String str4, NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f201256b == null) {
            mo176624a(z, str, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m216977j(String str, boolean z, String str2, String str3, String str4, Connector connector) {
        gkh0.m126627j("[live][longlink]", "long link data is right");
        if (this.f201256b != null) {
            m216974g();
        }
        if (vwb.m200296J(connector.tcp_addr_list)) {
            ig3.m135964a("tcp_addr_list is empty");
            return;
        }
        xkf0 xkf0Var = new xkf0(this);
        this.f201256b = xkf0Var;
        xkf0Var.mo177415g(str, ypv.f199493a.m199309D0(), z, connector, "videoChat", "", str2, str3, str4);
    }

    /* JADX INFO: renamed from: k */
    public final void m216978k(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.m154992z(this.f201258d);
        this.f201258d = ConnectivityReceiver.m81290m().distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.y2l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195626a.m216976i(z, str, str2, str3, str4, (NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public ti1 m216979l() {
        return this.f201260f;
    }

    /* JADX INFO: renamed from: m */
    public final void m216980m() {
        lz00.m152304d().m152312j(new h3l0(this.f201260f.f170406T1, null));
        lz00.m152304d().m152312j(new g3l0(this.f201260f.f170403S1, null));
        lz00.m152304d().m152312j(new u2l0(this.f201260f.f170409U1, null));
        lz00.m152304d().m152312j(new pmk0(this.f201260f.f170412V1, null));
        lz00.m152304d().m152312j(new d2l0(this.f201260f.f170415W1, null));
        lz00.m152304d().m152312j(new l2l0(this.f201260f.f170421Y1, null));
        lz00.m152304d().m152312j(new xis(this.f201260f.f170433c, null));
        lz00.m152304d().m152312j(new itr(this.f201260f.f170362F, null));
        lz00.m152304d().m152312j(new ltf(this.f201260f.f170437d, null));
        lz00.m152304d().m152312j(new r2l0(this.f201260f.f170424Z1, null));
        lz00.m152304d().m152312j(new b16(this.f201260f.f170477n, null));
        lz00.m152304d().m152312j(new mc4(this.f201260f.f170473m, null));
        lz00.m152304d().m152312j(new q2l0(this.f201260f.f170418X1, null));
    }

    /* JADX INFO: renamed from: n */
    public void m216981n(boolean z, String str, String str2, String str3, String str4) {
        this.f201261g = str;
        m216982o(z, str, str2, str3, str4);
        m216980m();
    }

    /* JADX INFO: renamed from: o */
    public final void m216982o(boolean z, String str, String str2, String str3, String str4) {
        this.f201255a = true;
        mo176624a(z, str, str2, str3, str4);
        m216978k(z, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: p */
    public void m216983p() {
        this.f201255a = false;
        a2w.m94629e();
        mkd0.m154992z(this.f201257c);
        mkd0.m154992z(this.f201258d);
        m216974g();
    }
}
