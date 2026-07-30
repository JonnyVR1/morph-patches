package p002l;

import android.net.NetworkInfo;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.data.Connector;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.e30;
import l.ffw;
import l.gkh0;
import l.ig3;
import l.lsi0;
import l.mkd0;
import l.ti1;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rzv implements qul {

    /* JADX INFO: renamed from: j */
    public static String f18731j = "-1";

    /* JADX INFO: renamed from: a */
    public boolean f18732a;

    /* JADX INFO: renamed from: c */
    public und f18734c;

    /* JADX INFO: renamed from: d */
    public r0w f18735d;

    /* JADX INFO: renamed from: e */
    public c4g0 f18736e;

    /* JADX INFO: renamed from: f */
    public c4g0 f18737f;

    /* JADX INFO: renamed from: h */
    public final n0w f18739h;

    /* JADX INFO: renamed from: b */
    public String f18733b = "msg_from_send_gift_hint";

    /* JADX INFO: renamed from: g */
    public a<Boolean> f18738g = a.b();

    /* JADX INFO: renamed from: i */
    public pul<LiveMessage> f18740i = new pul<>();

    /* JADX INFO: renamed from: l.rzv$a */
    public static class C0801a {

        /* JADX INFO: renamed from: a */
        public String f18741a = "";

        /* JADX INFO: renamed from: b */
        public String f18742b = "";

        /* JADX INFO: renamed from: c */
        public String f18743c = "";

        /* JADX INFO: renamed from: d */
        public long f18744d = System.currentTimeMillis();

        /* JADX INFO: renamed from: a */
        public String m22181a() {
            String str = this.f18741a;
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

    public rzv(n0w n0wVar) {
        this.f18739h = n0wVar;
    }

    /* JADX INFO: renamed from: B */
    private void m22154B(boolean z, String str, String str2, String str3, String str4) {
        this.f18732a = true;
        mo21581a(z, str, str2, str3, str4);
        m22163q(z, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m22157e(Connector connector) {
        if (connector != null) {
            return Boolean.TRUE;
        }
        CrashHelper.c(new IllegalArgumentException("live long live data is null"));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22158f(Throwable th) {
        lsi0.j(ypv.e.getString(R$string.f3703yk));
        gkh0.j("[live][longlink]", "long link data is fail");
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: h */
    private void m22160h() {
        r0w r0wVar;
        if (this.f18739h.m18356g() == null || (r0wVar = this.f18735d) == null) {
            return;
        }
        r0wVar.mo21714h(this.f18739h.m18356g().room.id);
        this.f18735d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m22161o(boolean z, String str, String str2, String str3, String str4, NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f18735d == null) {
            mo21581a(z, str, str2, str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m22162p(String str, boolean z, String str2, String str3, String str4, Connector connector) {
        gkh0.j("[live][longlink]", "long link data is right");
        if (this.f18735d != null) {
            m22160h();
        }
        if (vwb.J(connector.tcp_addr_list)) {
            ig3.a("tcp_addr_list is empty");
            return;
        }
        xkf0 xkf0Var = new xkf0(this);
        this.f18735d = xkf0Var;
        xkf0Var.mo21713g(str, ypv.a.D0(), z, connector, this.f18739h.m18354e().mo14493C0(), this.f18739h.m18356g().liveMode, str2, str3, str4);
    }

    /* JADX INFO: renamed from: q */
    private void m22163q(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.z(this.f18737f);
        this.f18737f = ConnectivityReceiver.m().distinctUntilChanged().subscribe(ffw.d(new e30() { // from class: l.ozv
            public final void call(Object obj) {
                this.f16924a.m22161o(z, str, str2, str3, str4, (NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public void m22164A(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        m22154B(z, str, str2, str3, str4);
        m22177w(z2);
    }

    /* JADX INFO: renamed from: C */
    public void m22165C() {
        this.f18732a = false;
        this.f18739h.m18351b();
        a2w.m9305e();
        mkd0.z(this.f18736e);
        mkd0.z(this.f18737f);
        m22160h();
    }

    @Override // p002l.qul
    /* JADX INFO: renamed from: a */
    public void mo21581a(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.z(this.f18736e);
        this.f18736e = b0w.m10143c(str, str2, str3, str4, this.f18739h.m18354e().mo14493C0(), this.f18739h.m18356g().liveMode).filter(new w9j() { // from class: l.lzv
            public final Object call(Object obj) {
                return rzv.m22157e((Connector) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.mzv
            public final void call(Object obj) {
                this.f15758a.m22162p(str, z, str2, str3, str4, (Connector) obj);
            }
        }, new e30() { // from class: l.nzv
            public final void call(Object obj) {
                rzv.m22158f((Throwable) obj);
            }
        }));
    }

    @Override // p002l.qul
    /* JADX INFO: renamed from: b */
    public void mo21582b(boolean z) {
        this.f18738g.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public a<User> m22166i() {
        return this.f18739h.m18352c();
    }

    /* JADX INFO: renamed from: j */
    public C0801a m22167j() {
        r0w r0wVar = this.f18735d;
        if (r0wVar != null) {
            return r0wVar.mo21711e();
        }
        C0801a c0801a = new C0801a();
        c0801a.f18741a = "init";
        c0801a.f18744d = System.currentTimeMillis();
        return c0801a;
    }

    /* JADX INFO: renamed from: k */
    public c<Boolean> m22168k() {
        return this.f18738g.asObservable();
    }

    /* JADX INFO: renamed from: l */
    public a<Followship> m22169l() {
        return this.f18739h.m18355f();
    }

    /* JADX INFO: renamed from: m */
    public Followship m22170m() {
        return (Followship) this.f18739h.m18355f().e();
    }

    /* JADX INFO: renamed from: n */
    public a<ArrayList<String>> m22171n() {
        return this.f18739h.m18357h();
    }

    /* JADX INFO: renamed from: r */
    public ti1 m22172r() {
        return this.f18739h.m18353d();
    }

    /* JADX INFO: renamed from: s */
    public void m22173s(boolean z, List<BLiveChatMessage> list) {
        m22174t(z, list, false);
    }

    /* JADX INFO: renamed from: t */
    public void m22174t(boolean z, List<BLiveChatMessage> list, final boolean z2) {
        vwb.z(ypv.k().Y4(z, "room".equals(this.f18739h.m18354e().mo14493C0())), new e30() { // from class: l.pzv
            public final void call(Object obj) {
                this.f17735a.m22176v(((Integer) obj).intValue());
            }
        });
        if (list != null) {
            vwb.z(list, new e30() { // from class: l.qzv
                public final void call(Object obj) {
                    BLiveChatMessage bLiveChatMessage = (BLiveChatMessage) obj;
                    lz00.m17628d().m17630c("msg_from_request_" + bLiveChatMessage.hashCode(), "live.chat.msg", e5t.m12220y(bLiveChatMessage, z2), rzv.f18731j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m22175u(q qVar) {
        lz00.m17628d().m17630c(this.f18733b, "live.chat.msg", qVar, f18731j);
    }

    /* JADX INFO: renamed from: v */
    public void m22176v(int i) {
        q qVar = (Template.TemplateData) Template.TemplateData.newBuilder().setId(i).build();
        gkh0.j("[live]live_room_message", ypv.e.getString(R$string.f3246e2));
        lz00.m17628d().m17630c(System.currentTimeMillis() + "", "live.client.local.system", qVar, f18731j);
    }

    /* JADX INFO: renamed from: w */
    public final void m22177w(boolean z) {
        und undVar;
        if (z && (undVar = this.f18734c) != null) {
            undVar.m23571g(this.f18739h.m18354e().m14588n0());
        } else {
            this.f18734c = new und(this.f18739h.m18354e().m14588n0(), a2w.m9301a(this.f18739h), m22172r().a, this.f18740i);
            a2w.m9303c(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m22178x(BLiveAbsData bLiveAbsData, long j) {
        r0w r0wVar = this.f18735d;
        if (r0wVar != null) {
            r0wVar.mo21712f(bLiveAbsData, j);
            return;
        }
        gkh0.j("[live][longlink]", "send Message Ack error，seq is " + j);
    }

    /* JADX INFO: renamed from: y */
    public void m22179y(a<User> aVar) {
        this.f18739h.m18361l(aVar);
    }

    /* JADX INFO: renamed from: z */
    public void m22180z(BLiveAbsData bLiveAbsData) {
        und undVar = this.f18734c;
        if (undVar != null) {
            undVar.m23571g(bLiveAbsData);
        }
    }
}
