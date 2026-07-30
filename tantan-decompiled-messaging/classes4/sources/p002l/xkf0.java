package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.other.longlink.intercepter.CompressionInterceptor;
import com.p000p1.mobile.putong.live.livingroom.other.longlink.intercepter.CryptInterceptor;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.Connector;
import com.p1.mobile.putong.data.ConnectorConfig;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.gkh0;
import l.hfw;
import l.li60;
import l.ypv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xkf0 extends r0w implements uul {

    /* JADX INFO: renamed from: a */
    public p850 f22337a;

    /* JADX INFO: renamed from: b */
    public qul f22338b;

    /* JADX INFO: renamed from: c */
    public boolean f22339c;

    /* JADX INFO: renamed from: d */
    public rzv.C0801a f22340d;

    /* JADX INFO: renamed from: e */
    public t1w f22341e;

    /* JADX INFO: renamed from: l.xkf0$a */
    public static class C0898a extends osm.C0731a {

        /* JADX INFO: renamed from: a */
        public hxq f22342a;

        @Override // p002l.osm.C0731a, p002l.osm
        /* JADX INFO: renamed from: d */
        public hxq mo19740d() {
            hxq hxqVar = this.f22342a;
            return hxqVar == null ? super.mo19740d() : hxqVar;
        }

        @Override // p002l.osm.C0731a, p002l.osm
        /* JADX INFO: renamed from: e */
        public iu40 mo19741e() {
            return new q7t();
        }

        /* JADX INFO: renamed from: f */
        public void m26027f(hxq hxqVar) {
            this.f22342a = hxqVar;
        }
    }

    public xkf0(qul qulVar) {
        super(qulVar);
        this.f22340d = new rzv.C0801a();
        this.f22341e = new t1w();
        this.f22338b = qulVar;
    }

    @Override // p002l.uul
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public void mo23639a(int i, String str) {
        if (i == 9) {
            qul qulVar = this.f22338b;
            t1w t1wVar = this.f22341e;
            qulVar.mo21581a(t1wVar.f19373h, t1wVar.f19366a, t1wVar.f19369d, t1wVar.f19370e, t1wVar.f19371f);
        }
    }

    @Override // p002l.uul
    /* JADX INFO: renamed from: d */
    public void mo23642d(int i, int i2, tul tulVar) {
        if (i2 == 6) {
            hfw.a("[live][longlink]", this.f22341e.f19372g + "SocketLongLink State change, preState:" + dvf0.m12059a(i) + ", current:" + dvf0.m12059a(i2));
        }
        boolean z = i2 == 6;
        this.f22339c = z;
        this.f22338b.mo21582b(z);
        m26026j(tulVar);
    }

    @Override // p002l.r0w
    /* JADX INFO: renamed from: e */
    public rzv.C0801a mo21711e() {
        return this.f22340d;
    }

    @Override // p002l.r0w
    /* JADX INFO: renamed from: f */
    public void mo21712f(BLiveAbsData bLiveAbsData, long j) {
        if (this.f22337a == null || !this.f22339c) {
            gkh0.j("[live][longlink]", this.f22341e.f19372g + "send Message error, isConnected:" + this.f22339c + ",okim:" + this.f22337a);
            return;
        }
        if (TextUtils.equals("voiceRoom", this.f22341e.f19372g)) {
            LongLinkChatMessage.RoomType roomType = LongLinkChatMessage.RoomType.video;
        } else {
            LongLinkChatMessage.RoomType roomType2 = LongLinkChatMessage.RoomType.video;
        }
        ypv.a.V();
        this.f22337a.m20127a(new qat(liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.chatReaded").setIsResponse(false).setData(li60.a(liveAuthMessageNew.ChatReaded.newBuilder().setSeq(j).build())).build()));
    }

    @Override // p002l.r0w
    /* JADX INFO: renamed from: g */
    public void mo21713g(String str, String str2, boolean z, @NotNull Connector connector, String str3, String str4, String str5, String str6, String str7) {
        if (TextUtils.isEmpty(str)) {
            CrashHelper.c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            CrashHelper.c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        t1w.C0833a c0833aM22780g = t1w.C0833a.m22774a().m22779f(str).m22783j(str2).m22776c(z).m22780g(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        this.f22341e = c0833aM22780g.m22778e(str4).m22782i(str5).m22777d(str6).m22781h(str7).m22775b();
        if (this.f22337a == null) {
            m26025i(connector);
            return;
        }
        gkh0.l("[live][longlink]", new IllegalAccessException(this.f22341e.f19372g + "okim is created, ignore"));
    }

    @Override // p002l.r0w
    /* JADX INFO: renamed from: h */
    public void mo21714h(String str) {
        if (this.f22337a == null) {
            gkh0.l("[live][longlink]", new IllegalAccessException(this.f22341e.f19372g + "okim is null, ignore, roomid:" + str));
            return;
        }
        gkh0.j("[live][longlink]", "stop  " + this.f22341e.f19372g + " longlink  ");
        this.f22337a.m20129c();
        this.f22337a = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m26025i(@NotNull Connector connector) {
        ArrayList arrayList = new ArrayList();
        List list = "textRoom".equals(this.f22341e.f19372g) ? connector.text_room_tcp_addr_list : connector.tcp_addr_list;
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new dvl(str));
                gkh0.j("[live][longlink]", this.f22341e.f19372g + " added raw url: " + str);
            }
        }
        ConnectorConfig connectorConfig = connector.config;
        w4s w4sVar = new w4s(connectorConfig.reconnect_backoff_min, connectorConfig.reconnect_backoff_max, arrayList, connector.client_ip);
        mur murVar = new mur();
        murVar.m18207g(this.f22341e);
        ai2 ai2Var = new ai2();
        ai2Var.m9791j(this);
        C0898a c0898a = new C0898a();
        c0898a.m26027f(new c0t(connector.config.keepalive_timeout));
        p850 p850VarM13173b = new fh3().m13176e(w4sVar).m13175d(murVar).m13177f(ai2Var).m13174c(ypv.e).m13178g(c0898a).m13180i(new mwt()).m13181j(new b0t(connector.config.keepalive_interval)).m13179h(this.f22341e).m13172a(new xs6()).m13172a(new CompressionInterceptor()).m13172a(new CryptInterceptor(ypv.e)).m13172a(new lxk(this.f22341e.f19367b)).m13173b();
        this.f22337a = p850VarM13173b;
        p850VarM13173b.m20128b();
    }

    /* JADX INFO: renamed from: j */
    public final void m26026j(tul tulVar) {
        this.f22340d.f18741a = tulVar.m23177f();
        InterfaceC0476a.a aVarM23173b = tulVar.m23173b();
        if (aVarM23173b != null) {
            this.f22340d.f18742b = aVarM23173b.mo9145a();
        }
        this.f22340d.f18743c = tulVar.m23175d() == null ? "" : tulVar.m23175d().getMessage();
        this.f22340d.f18744d = System.currentTimeMillis();
    }

    @Override // p002l.uul
    /* JADX INFO: renamed from: b */
    public void mo23640b(boolean z) {
    }

    @Override // p002l.uul
    /* JADX INFO: renamed from: c */
    public void mo23641c(Throwable th) {
    }
}
