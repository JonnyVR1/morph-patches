package p153l;

import android.net.NetworkInfo;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class p1w implements dxl {

    /* JADX INFO: renamed from: j */
    public static String f150202j = "-1";

    /* JADX INFO: renamed from: a */
    public boolean f150203a;

    /* JADX INFO: renamed from: c */
    public zod f150205c;

    /* JADX INFO: renamed from: d */
    public p2w f150206d;

    /* JADX INFO: renamed from: e */
    public kcg0 f150207e;

    /* JADX INFO: renamed from: f */
    public kcg0 f150208f;

    /* JADX INFO: renamed from: h */
    public final l2w f150210h;

    /* JADX INFO: renamed from: b */
    public String f150204b = "msg_from_send_gift_hint";

    /* JADX INFO: renamed from: g */
    public C22507a<Boolean> f150209g = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public cxl<LiveMessage> f150211i = new cxl<>();

    /* JADX INFO: renamed from: l.p1w$a */
    public static class C19272a {

        /* JADX INFO: renamed from: a */
        public String f150212a = "";

        /* JADX INFO: renamed from: b */
        public String f150213b = "";

        /* JADX INFO: renamed from: c */
        public String f150214c = "";

        /* JADX INFO: renamed from: d */
        public long f150215d = System.currentTimeMillis();

        /* JADX INFO: renamed from: a */
        public String m170293a() {
            String str = this.f150212a;
            str.getClass();
            switch (str) {
                case "AuthSuccess":
                    return "connected";
                case "Idle":
                case "Connecting":
                case "Connected":
                    return "connecting";
                default:
                    return "close";
            }
        }
    }

    public p1w(l2w l2wVar) {
        this.f150210h = l2wVar;
    }

    /* JADX INFO: renamed from: B */
    private void m170266B(boolean z, String str, String str2, String str3, String str4) {
        this.f150203a = true;
        mo118504a(z, str, str2, str3, str4);
        m170275q(z, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m170269e(Connector connector) {
        if (connector != null) {
            return Boolean.TRUE;
        }
        CrashHelper.m82479c(new IllegalArgumentException("live long live data is null"));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m170270f(Throwable th) {
        o1j0.m165636j(zrv.f205803e.getString(R$string.f48509yk));
        nsh0.m164608j("[live][longlink]", "long link data is fail");
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: h */
    private void m170272h() {
        p2w p2wVar;
        if (this.f150210h.m152643g() == null || (p2wVar = this.f150206d) == null) {
            return;
        }
        p2wVar.mo132231h(this.f150210h.m152643g().room.f45267id);
        this.f150206d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m170273o(boolean z, String str, String str2, String str3, String str4, NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f150206d == null) {
            mo118504a(z, str, str2, str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m170274p(String str, boolean z, String str2, String str3, String str4, Connector connector) {
        nsh0.m164608j("[live][longlink]", "long link data is right");
        if (this.f150206d != null) {
            m170272h();
        }
        if (jyb.m147479J(connector.tcp_addr_list)) {
            wg3.m206174a("tcp_addr_list is empty");
            return;
        }
        gtf0 gtf0Var = new gtf0(this);
        this.f150206d = gtf0Var;
        gtf0Var.mo132230g(str, zrv.f205799a.m207631D0(), z, connector, this.f150210h.m152641e().mo118365C0(), this.f150210h.m152643g().liveMode, str2, str3, str4);
    }

    /* JADX INFO: renamed from: q */
    private void m170275q(final boolean z, final String str, final String str2, final String str3, final String str4) {
        psd0.m173633z(this.f150208f);
        this.f150208f = ConnectivityReceiver.m82473m().distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.m1w
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134471a.m170273o(z, str, str2, str3, str4, (NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public void m170276A(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        m170266B(z, str, str2, str3, str4);
        m170289w(z2);
    }

    /* JADX INFO: renamed from: C */
    public void m170277C() {
        this.f150203a = false;
        this.f150210h.m152638b();
        y3w.m214175e();
        psd0.m173633z(this.f150207e);
        psd0.m173633z(this.f150208f);
        m170272h();
    }

    @Override // p153l.dxl
    /* JADX INFO: renamed from: a */
    public void mo118504a(final boolean z, final String str, final String str2, final String str3, final String str4) {
        psd0.m173633z(this.f150207e);
        this.f150207e = z1w.m218382c(str, str2, str3, str4, this.f150210h.m152641e().mo118365C0(), this.f150210h.m152643g().liveMode).filter(new qcj() { // from class: l.j1w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p1w.m170269e((Connector) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.k1w
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123546a.m170274p(str, z, str2, str3, str4, (Connector) obj);
            }
        }, new y20() { // from class: l.l1w
            @Override // p153l.y20
            public final void call(Object obj) {
                p1w.m170270f((Throwable) obj);
            }
        }));
    }

    @Override // p153l.dxl
    /* JADX INFO: renamed from: b */
    public void mo118505b(boolean z) {
        this.f150209g.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public C22507a<User> m170278i() {
        return this.f150210h.m152639c();
    }

    /* JADX INFO: renamed from: j */
    public C19272a m170279j() {
        p2w p2wVar = this.f150206d;
        if (p2wVar != null) {
            return p2wVar.mo132228e();
        }
        C19272a c19272a = new C19272a();
        c19272a.f150212a = "init";
        c19272a.f150215d = System.currentTimeMillis();
        return c19272a;
    }

    /* JADX INFO: renamed from: k */
    public C22421c<Boolean> m170280k() {
        return this.f150209g.asObservable();
    }

    /* JADX INFO: renamed from: l */
    public C22507a<Followship> m170281l() {
        return this.f150210h.m152642f();
    }

    /* JADX INFO: renamed from: m */
    public Followship m170282m() {
        return this.f150210h.m152642f().m222761e();
    }

    /* JADX INFO: renamed from: n */
    public C22507a<ArrayList<String>> m170283n() {
        return this.f150210h.m152644h();
    }

    /* JADX INFO: renamed from: r */
    public aj1 m170284r() {
        return this.f150210h.m152640d();
    }

    /* JADX INFO: renamed from: s */
    public void m170285s(boolean z, List<BLiveChatMessage> list) {
        m170286t(z, list, false);
    }

    /* JADX INFO: renamed from: t */
    public void m170286t(boolean z, List<BLiveChatMessage> list, final boolean z2) {
        jyb.m147537z(zrv.m221193k().m203563Y4(z, "room".equals(this.f150210h.m152641e().mo118365C0())), new y20() { // from class: l.n1w
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139795a.m170288v(((Integer) obj).intValue());
            }
        });
        if (list != null) {
            jyb.m147537z(list, new y20() { // from class: l.o1w
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveChatMessage bLiveChatMessage = (BLiveChatMessage) obj;
                    v710.m200166d().m200168c("msg_from_request_" + bLiveChatMessage.hashCode(), "live.chat.msg", f7t.m124505y(bLiveChatMessage, z2), p1w.f150202j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m170287u(InterfaceC3442q interfaceC3442q) {
        v710.m200166d().m200168c(this.f150204b, "live.chat.msg", interfaceC3442q, f150202j);
    }

    /* JADX INFO: renamed from: v */
    public void m170288v(int i) {
        Template.TemplateData templateDataBuild = Template.TemplateData.newBuilder().setId(i).build();
        nsh0.m164608j("[live]live_room_message", zrv.f205803e.getString(R$string.f48052e2));
        v710.m200166d().m200168c(System.currentTimeMillis() + "", "live.client.local.system", templateDataBuild, f150202j);
    }

    /* JADX INFO: renamed from: w */
    public final void m170289w(boolean z) {
        zod zodVar;
        if (z && (zodVar = this.f150205c) != null) {
            zodVar.m220739g(this.f150210h.m152641e().m168538n0());
        } else {
            this.f150205c = new zod(this.f150210h.m152641e().m168538n0(), y3w.m214171a(this.f150210h), m170284r().f71692a, this.f150211i);
            y3w.m214173c(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m170290x(BLiveAbsData bLiveAbsData, long j) {
        p2w p2wVar = this.f150206d;
        if (p2wVar != null) {
            p2wVar.mo132229f(bLiveAbsData, j);
            return;
        }
        nsh0.m164608j("[live][longlink]", "send Message Ack error，seq is " + j);
    }

    /* JADX INFO: renamed from: y */
    public void m170291y(C22507a<User> c22507a) {
        this.f150210h.m152648l(c22507a);
    }

    /* JADX INFO: renamed from: z */
    public void m170292z(BLiveAbsData bLiveAbsData) {
        zod zodVar = this.f150205c;
        if (zodVar != null) {
            zodVar.m220739g(bLiveAbsData);
        }
    }
}
