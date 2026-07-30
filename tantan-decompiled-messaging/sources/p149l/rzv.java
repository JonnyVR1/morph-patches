package p149l;

import android.net.NetworkInfo;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class rzv implements qul {

    /* JADX INFO: renamed from: j */
    public static String f161691j = "-1";

    /* JADX INFO: renamed from: a */
    public boolean f161692a;

    /* JADX INFO: renamed from: c */
    public und f161694c;

    /* JADX INFO: renamed from: d */
    public r0w f161695d;

    /* JADX INFO: renamed from: e */
    public c4g0 f161696e;

    /* JADX INFO: renamed from: f */
    public c4g0 f161697f;

    /* JADX INFO: renamed from: h */
    public final n0w f161699h;

    /* JADX INFO: renamed from: b */
    public String f161693b = "msg_from_send_gift_hint";

    /* JADX INFO: renamed from: g */
    public C22392a<Boolean> f161698g = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public pul<LiveMessage> f161700i = new pul<>();

    /* JADX INFO: renamed from: l.rzv$a */
    public static class C19818a {

        /* JADX INFO: renamed from: a */
        public String f161701a = "";

        /* JADX INFO: renamed from: b */
        public String f161702b = "";

        /* JADX INFO: renamed from: c */
        public String f161703c = "";

        /* JADX INFO: renamed from: d */
        public long f161704d = System.currentTimeMillis();

        /* JADX INFO: renamed from: a */
        public String m181798a() {
            String str = this.f161701a;
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
        this.f161699h = n0wVar;
    }

    /* JADX INFO: renamed from: B */
    private void m181771B(boolean z, String str, String str2, String str3, String str4) {
        this.f161692a = true;
        mo176624a(z, str, str2, str3, str4);
        m181780q(z, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m181774e(Connector connector) {
        if (connector != null) {
            return Boolean.TRUE;
        }
        CrashHelper.m81296c(new IllegalArgumentException("live long live data is null"));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m181775f(Throwable th) {
        lsi0.m151580j(ypv.f199497e.getString(R$string.f47661yk));
        gkh0.m126627j("[live][longlink]", "long link data is fail");
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: h */
    private void m181777h() {
        r0w r0wVar;
        if (this.f161699h.m157294g() == null || (r0wVar = this.f161695d) == null) {
            return;
        }
        r0wVar.mo177416h(this.f161699h.m157294g().room.f44419id);
        this.f161695d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m181778o(boolean z, String str, String str2, String str3, String str4, NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f161695d == null) {
            mo176624a(z, str, str2, str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m181779p(String str, boolean z, String str2, String str3, String str4, Connector connector) {
        gkh0.m126627j("[live][longlink]", "long link data is right");
        if (this.f161695d != null) {
            m181777h();
        }
        if (vwb.m200296J(connector.tcp_addr_list)) {
            ig3.m135964a("tcp_addr_list is empty");
            return;
        }
        xkf0 xkf0Var = new xkf0(this);
        this.f161695d = xkf0Var;
        xkf0Var.mo177415g(str, ypv.f199493a.m199309D0(), z, connector, this.f161699h.m157292e().mo132058C0(), this.f161699h.m157294g().liveMode, str2, str3, str4);
    }

    /* JADX INFO: renamed from: q */
    private void m181780q(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.m154992z(this.f161697f);
        this.f161697f = ConnectivityReceiver.m81290m().distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.ozv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146507a.m181778o(z, str, str2, str3, str4, (NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public void m181781A(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        m181771B(z, str, str2, str3, str4);
        m181794w(z2);
    }

    /* JADX INFO: renamed from: C */
    public void m181782C() {
        this.f161692a = false;
        this.f161699h.m157289b();
        a2w.m94629e();
        mkd0.m154992z(this.f161696e);
        mkd0.m154992z(this.f161697f);
        m181777h();
    }

    @Override // p149l.qul
    /* JADX INFO: renamed from: a */
    public void mo176624a(final boolean z, final String str, final String str2, final String str3, final String str4) {
        mkd0.m154992z(this.f161696e);
        this.f161696e = b0w.m99791c(str, str2, str3, str4, this.f161699h.m157292e().mo132058C0(), this.f161699h.m157294g().liveMode).filter(new w9j() { // from class: l.lzv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rzv.m181774e((Connector) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.mzv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136436a.m181779p(str, z, str2, str3, str4, (Connector) obj);
            }
        }, new e30() { // from class: l.nzv
            @Override // p149l.e30
            public final void call(Object obj) {
                rzv.m181775f((Throwable) obj);
            }
        }));
    }

    @Override // p149l.qul
    /* JADX INFO: renamed from: b */
    public void mo176625b(boolean z) {
        this.f161698g.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public C22392a<User> m181783i() {
        return this.f161699h.m157290c();
    }

    /* JADX INFO: renamed from: j */
    public C19818a m181784j() {
        r0w r0wVar = this.f161695d;
        if (r0wVar != null) {
            return r0wVar.mo177413e();
        }
        C19818a c19818a = new C19818a();
        c19818a.f161701a = "init";
        c19818a.f161704d = System.currentTimeMillis();
        return c19818a;
    }

    /* JADX INFO: renamed from: k */
    public C22306c<Boolean> m181785k() {
        return this.f161698g.asObservable();
    }

    /* JADX INFO: renamed from: l */
    public C22392a<Followship> m181786l() {
        return this.f161699h.m157293f();
    }

    /* JADX INFO: renamed from: m */
    public Followship m181787m() {
        return this.f161699h.m157293f().m221515e();
    }

    /* JADX INFO: renamed from: n */
    public C22392a<ArrayList<String>> m181788n() {
        return this.f161699h.m157295h();
    }

    /* JADX INFO: renamed from: r */
    public ti1 m181789r() {
        return this.f161699h.m157291d();
    }

    /* JADX INFO: renamed from: s */
    public void m181790s(boolean z, List<BLiveChatMessage> list) {
        m181791t(z, list, false);
    }

    /* JADX INFO: renamed from: t */
    public void m181791t(boolean z, List<BLiveChatMessage> list, final boolean z2) {
        vwb.m200354z(ypv.m215672k().m195776Y4(z, "room".equals(this.f161699h.m157292e().mo132058C0())), new e30() { // from class: l.pzv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151977a.m181793v(((Integer) obj).intValue());
            }
        });
        if (list != null) {
            vwb.m200354z(list, new e30() { // from class: l.qzv
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveChatMessage bLiveChatMessage = (BLiveChatMessage) obj;
                    lz00.m152304d().m152306c("msg_from_request_" + bLiveChatMessage.hashCode(), "live.chat.msg", e5t.m114921y(bLiveChatMessage, z2), rzv.f161691j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public void m181792u(InterfaceC3419q interfaceC3419q) {
        lz00.m152304d().m152306c(this.f161693b, "live.chat.msg", interfaceC3419q, f161691j);
    }

    /* JADX INFO: renamed from: v */
    public void m181793v(int i) {
        Template.TemplateData templateDataBuild = Template.TemplateData.newBuilder().setId(i).build();
        gkh0.m126627j("[live]live_room_message", ypv.f199497e.getString(R$string.f47204e2));
        lz00.m152304d().m152306c(System.currentTimeMillis() + "", "live.client.local.system", templateDataBuild, f161691j);
    }

    /* JADX INFO: renamed from: w */
    public final void m181794w(boolean z) {
        und undVar;
        if (z && (undVar = this.f161694c) != null) {
            undVar.m194420g(this.f161699h.m157292e().m132152n0());
        } else {
            this.f161694c = new und(this.f161699h.m157292e().m132152n0(), a2w.m94625a(this.f161699h), m181789r().f170425a, this.f161700i);
            a2w.m94627c(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m181795x(BLiveAbsData bLiveAbsData, long j) {
        r0w r0wVar = this.f161695d;
        if (r0wVar != null) {
            r0wVar.mo177414f(bLiveAbsData, j);
            return;
        }
        gkh0.m126627j("[live][longlink]", "send Message Ack error，seq is " + j);
    }

    /* JADX INFO: renamed from: y */
    public void m181796y(C22392a<User> c22392a) {
        this.f161699h.m157299l(c22392a);
    }

    /* JADX INFO: renamed from: z */
    public void m181797z(BLiveAbsData bLiveAbsData) {
        und undVar = this.f161694c;
        if (undVar != null) {
            undVar.m194420g(bLiveAbsData);
        }
    }
}
