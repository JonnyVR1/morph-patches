package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ecl0 implements dxl {

    /* JADX INFO: renamed from: a */
    public boolean f93071a;

    /* JADX INFO: renamed from: b */
    public p2w f93072b;

    /* JADX INFO: renamed from: c */
    public kcg0 f93073c;

    /* JADX INFO: renamed from: d */
    public kcg0 f93074d;

    /* JADX INFO: renamed from: e */
    public C22507a<Boolean> f93075e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public aj1 f93076f = new aj1();

    /* JADX INFO: renamed from: g */
    public String f93077g;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m120383d(Connector connector) {
        if (connector != null) {
            return Boolean.TRUE;
        }
        CrashHelper.m82479c(new IllegalArgumentException("live long live data is null"));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m120385f(Throwable th) {
        o1j0.m165636j(zrv.f205803e.getString(R$string.f48509yk));
        nsh0.m164608j("[live][longlink]", "long link data is fail");
        CrashHelper.m82479c(th);
    }

    @Override // p153l.dxl
    /* JADX INFO: renamed from: a */
    public void mo118504a(final boolean z, final String str, final String str2, final String str3, final String str4) {
        psd0.m173633z(this.f93073c);
        this.f93073c = z1w.m218382c(str, str2, str3, str4, "videoChat", "").filter(new qcj() { // from class: l.acl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ecl0.m120383d((Connector) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.bcl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76180a.m120389j(str, z, str2, str3, str4, (Connector) obj);
            }
        }, new y20() { // from class: l.ccl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ecl0.m120385f((Throwable) obj);
            }
        }));
    }

    @Override // p153l.dxl
    /* JADX INFO: renamed from: b */
    public void mo118505b(boolean z) {
        this.f93075e.m137019l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m120386g() {
        p2w p2wVar;
        if (TextUtils.isEmpty(this.f93077g) || (p2wVar = this.f93072b) == null) {
            return;
        }
        p2wVar.mo132231h(this.f93077g);
        this.f93072b = null;
    }

    /* JADX INFO: renamed from: h */
    public C22421c<Boolean> m120387h() {
        return this.f93075e.asObservable();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m120388i(boolean z, String str, String str2, String str3, String str4, NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f93072b == null) {
            mo118504a(z, str, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m120389j(String str, boolean z, String str2, String str3, String str4, Connector connector) {
        nsh0.m164608j("[live][longlink]", "long link data is right");
        if (this.f93072b != null) {
            m120386g();
        }
        if (jyb.m147479J(connector.tcp_addr_list)) {
            wg3.m206174a("tcp_addr_list is empty");
            return;
        }
        gtf0 gtf0Var = new gtf0(this);
        this.f93072b = gtf0Var;
        gtf0Var.mo132230g(str, zrv.f205799a.m207631D0(), z, connector, "videoChat", "", str2, str3, str4);
    }

    /* JADX INFO: renamed from: k */
    public final void m120390k(final boolean z, final String str, final String str2, final String str3, final String str4) {
        psd0.m173633z(this.f93074d);
        this.f93074d = ConnectivityReceiver.m82473m().distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.dcl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87791a.m120388i(z, str, str2, str3, str4, (NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public aj1 m120391l() {
        return this.f93076f;
    }

    /* JADX INFO: renamed from: m */
    public final void m120392m() {
        v710.m200166d().m200174j(new mcl0(this.f93076f.f71673T1, null));
        v710.m200166d().m200174j(new lcl0(this.f93076f.f71670S1, null));
        v710.m200166d().m200174j(new zbl0(this.f93076f.f71676U1, null));
        v710.m200166d().m200174j(new vvk0(this.f93076f.f71679V1, null));
        v710.m200166d().m200174j(new ibl0(this.f93076f.f71682W1, null));
        v710.m200166d().m200174j(new qbl0(this.f93076f.f71688Y1, null));
        v710.m200166d().m200174j(new yks(this.f93076f.f71700c, null));
        v710.m200166d().m200174j(new jvr(this.f93076f.f71629F, null));
        v710.m200166d().m200174j(new zuf(this.f93076f.f71704d, null));
        v710.m200166d().m200174j(new wbl0(this.f93076f.f71691Z1, null));
        v710.m200166d().m200174j(new g26(this.f93076f.f71744n, null));
        v710.m200166d().m200174j(new ld4(this.f93076f.f71740m, null));
        v710.m200166d().m200174j(new vbl0(this.f93076f.f71685X1, null));
    }

    /* JADX INFO: renamed from: n */
    public void m120393n(boolean z, String str, String str2, String str3, String str4) {
        this.f93077g = str;
        m120394o(z, str, str2, str3, str4);
        m120392m();
    }

    /* JADX INFO: renamed from: o */
    public final void m120394o(boolean z, String str, String str2, String str3, String str4) {
        this.f93071a = true;
        mo118504a(z, str, str2, str3, str4);
        m120390k(z, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: p */
    public void m120395p() {
        this.f93071a = false;
        y3w.m214175e();
        psd0.m173633z(this.f93073c);
        psd0.m173633z(this.f93074d);
        m120386g();
    }
}
