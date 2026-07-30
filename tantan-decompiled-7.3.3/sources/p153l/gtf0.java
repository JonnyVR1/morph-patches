package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.data.ConnectorConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.other.longlink.intercepter.CompressionInterceptor;
import com.p051p1.mobile.putong.live.livingroom.other.longlink.intercepter.CryptInterceptor;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class gtf0 extends p2w implements hxl {

    /* JADX INFO: renamed from: a */
    public wg50 f106408a;

    /* JADX INFO: renamed from: b */
    public dxl f106409b;

    /* JADX INFO: renamed from: c */
    public boolean f106410c;

    /* JADX INFO: renamed from: d */
    public p1w.C19272a f106411d;

    /* JADX INFO: renamed from: e */
    public r3w f106412e;

    /* JADX INFO: renamed from: l.gtf0$a */
    public static class C17311a extends qum.C19668a {

        /* JADX INFO: renamed from: a */
        public hzq f106413a;

        @Override // p153l.qum.C19668a, p153l.qum
        /* JADX INFO: renamed from: d */
        public hzq mo132234d() {
            hzq hzqVar = this.f106413a;
            return hzqVar == null ? super.mo132234d() : hzqVar;
        }

        @Override // p153l.qum.C19668a, p153l.qum
        /* JADX INFO: renamed from: e */
        public x250 mo132235e() {
            return new r9t();
        }

        /* JADX INFO: renamed from: f */
        public void m132236f(hzq hzqVar) {
            this.f106413a = hzqVar;
        }
    }

    public gtf0(dxl dxlVar) {
        super(dxlVar);
        this.f106411d = new p1w.C19272a();
        this.f106412e = new r3w();
        this.f106409b = dxlVar;
    }

    @Override // p153l.hxl
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public void mo132224a(int i, String str) {
        if (i == 9) {
            dxl dxlVar = this.f106409b;
            r3w r3wVar = this.f106412e;
            dxlVar.mo118504a(r3wVar.f161093h, r3wVar.f161086a, r3wVar.f161089d, r3wVar.f161090e, r3wVar.f161091f);
        }
    }

    @Override // p153l.hxl
    /* JADX INFO: renamed from: d */
    public void mo132227d(int i, int i2, gxl gxlVar) {
        if (i2 == 6) {
            fhw.m125605a("[live][longlink]", this.f106412e.f161092g + "SocketLongLink State change, preState:" + m3g0.m156929a(i) + ", current:" + m3g0.m156929a(i2));
        }
        boolean z = i2 == 6;
        this.f106410c = z;
        this.f106409b.mo118505b(z);
        m132233j(gxlVar);
    }

    @Override // p153l.p2w
    /* JADX INFO: renamed from: e */
    public p1w.C19272a mo132228e() {
        return this.f106411d;
    }

    @Override // p153l.p2w
    /* JADX INFO: renamed from: f */
    public void mo132229f(BLiveAbsData bLiveAbsData, long j) {
        if (this.f106408a == null || !this.f106410c) {
            nsh0.m164608j("[live][longlink]", this.f106412e.f161092g + "send Message error, isConnected:" + this.f106410c + ",okim:" + this.f106408a);
            return;
        }
        if (TextUtils.equals("voiceRoom", this.f106412e.f161092g)) {
            LongLinkChatMessage.RoomType roomType = LongLinkChatMessage.RoomType.video;
        } else {
            LongLinkChatMessage.RoomType roomType2 = LongLinkChatMessage.RoomType.video;
        }
        zrv.f205799a.m207651V();
        this.f106408a.m206175a(new rct(liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.chatReaded").setIsResponse(false).setData(qq60.m177480a(liveAuthMessageNew.ChatReaded.newBuilder().setSeq(j).build())).build()));
    }

    @Override // p153l.p2w
    /* JADX INFO: renamed from: g */
    public void mo132230g(String str, String str2, boolean z, @NotNull Connector connector, String str3, String str4, String str5, String str6, String str7) {
        if (TextUtils.isEmpty(str)) {
            CrashHelper.m82479c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            CrashHelper.m82479c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        r3w.C19756a c19756aM179715g = r3w.C19756a.m179709a().m179714f(str).m179718j(str2).m179711c(z).m179715g(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        this.f106412e = c19756aM179715g.m179713e(str4).m179717i(str5).m179712d(str6).m179716h(str7).m179710b();
        if (this.f106408a == null) {
            m132232i(connector);
            return;
        }
        nsh0.m164610l("[live][longlink]", new IllegalAccessException(this.f106412e.f161092g + "okim is created, ignore"));
    }

    @Override // p153l.p2w
    /* JADX INFO: renamed from: h */
    public void mo132231h(String str) {
        if (this.f106408a == null) {
            nsh0.m164610l("[live][longlink]", new IllegalAccessException(this.f106412e.f161092g + "okim is null, ignore, roomid:" + str));
            return;
        }
        nsh0.m164608j("[live][longlink]", "stop  " + this.f106412e.f161092g + " longlink  ");
        this.f106408a.m206177c();
        this.f106408a = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m132232i(@NotNull Connector connector) {
        ArrayList arrayList = new ArrayList();
        List<String> list = "textRoom".equals(this.f106412e.f161092g) ? connector.text_room_tcp_addr_list : connector.tcp_addr_list;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new vxl(str));
                nsh0.m164608j("[live][longlink]", this.f106412e.f161092g + " added raw url: " + str);
            }
        }
        ConnectorConfig connectorConfig = connector.config;
        x6s x6sVar = new x6s(connectorConfig.reconnect_backoff_min, connectorConfig.reconnect_backoff_max, arrayList, connector.client_ip);
        nwr nwrVar = new nwr();
        nwrVar.m165046g(this.f106412e);
        hi2 hi2Var = new hi2();
        hi2Var.m135101j(this);
        C17311a c17311a = new C17311a();
        c17311a.m132236f(new d2t(connector.config.keepalive_timeout));
        wg50 wg50VarM191208b = new th3().m191211e(x6sVar).m191210d(nwrVar).m191212f(hi2Var).m191209c(zrv.f205803e).m191213g(c17311a).m191215i(new nyt()).m191216j(new c2t(connector.config.keepalive_interval)).m191214h(this.f106412e).m191207a(new au6()).m191207a(new CompressionInterceptor()).m191207a(new CryptInterceptor(zrv.f205803e)).m191207a(new b0l(this.f106412e.f161087b)).m191208b();
        this.f106408a = wg50VarM191208b;
        wg50VarM191208b.m206176b();
    }

    /* JADX INFO: renamed from: j */
    public final void m132233j(gxl gxlVar) {
        this.f106411d.f150212a = gxlVar.m132881f();
        InterfaceC13050a.a aVarM132877b = gxlVar.m132877b();
        if (aVarM132877b != null) {
            this.f106411d.f150213b = aVarM132877b.mo76693a();
        }
        this.f106411d.f150214c = gxlVar.m132879d() == null ? "" : gxlVar.m132879d().getMessage();
        this.f106411d.f150215d = System.currentTimeMillis();
    }

    @Override // p153l.hxl
    /* JADX INFO: renamed from: b */
    public void mo132225b(boolean z) {
    }

    @Override // p153l.hxl
    /* JADX INFO: renamed from: c */
    public void mo132226c(Throwable th) {
    }
}
