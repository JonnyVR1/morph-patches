package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.data.ConnectorConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.other.longlink.intercepter.CompressionInterceptor;
import com.p046p1.mobile.putong.live.livingroom.other.longlink.intercepter.CryptInterceptor;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class xkf0 extends r0w implements uul {

    /* JADX INFO: renamed from: a */
    public p850 f193290a;

    /* JADX INFO: renamed from: b */
    public qul f193291b;

    /* JADX INFO: renamed from: c */
    public boolean f193292c;

    /* JADX INFO: renamed from: d */
    public rzv.C19818a f193293d;

    /* JADX INFO: renamed from: e */
    public t1w f193294e;

    /* JADX INFO: renamed from: l.xkf0$a */
    public static class C21164a extends osm.C19026a {

        /* JADX INFO: renamed from: a */
        public hxq f193295a;

        @Override // p149l.osm.C19026a, p149l.osm
        /* JADX INFO: renamed from: d */
        public hxq mo165826d() {
            hxq hxqVar = this.f193295a;
            return hxqVar == null ? super.mo165826d() : hxqVar;
        }

        @Override // p149l.osm.C19026a, p149l.osm
        /* JADX INFO: renamed from: e */
        public iu40 mo165827e() {
            return new q7t();
        }

        /* JADX INFO: renamed from: f */
        public void m209792f(hxq hxqVar) {
            this.f193295a = hxqVar;
        }
    }

    public xkf0(qul qulVar) {
        super(qulVar);
        this.f193293d = new rzv.C19818a();
        this.f193294e = new t1w();
        this.f193291b = qulVar;
    }

    @Override // p149l.uul
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public void mo195377a(int i, String str) {
        if (i == 9) {
            qul qulVar = this.f193291b;
            t1w t1wVar = this.f193294e;
            qulVar.mo176624a(t1wVar.f167381h, t1wVar.f167374a, t1wVar.f167377d, t1wVar.f167378e, t1wVar.f167379f);
        }
    }

    @Override // p149l.uul
    /* JADX INFO: renamed from: d */
    public void mo195380d(int i, int i2, tul tulVar) {
        if (i2 == 6) {
            hfw.m130790a("[live][longlink]", this.f193294e.f167380g + "SocketLongLink State change, preState:" + dvf0.m113777a(i) + ", current:" + dvf0.m113777a(i2));
        }
        boolean z = i2 == 6;
        this.f193292c = z;
        this.f193291b.mo176625b(z);
        m209791j(tulVar);
    }

    @Override // p149l.r0w
    /* JADX INFO: renamed from: e */
    public rzv.C19818a mo177413e() {
        return this.f193293d;
    }

    @Override // p149l.r0w
    /* JADX INFO: renamed from: f */
    public void mo177414f(BLiveAbsData bLiveAbsData, long j) {
        if (this.f193290a == null || !this.f193292c) {
            gkh0.m126627j("[live][longlink]", this.f193294e.f167380g + "send Message error, isConnected:" + this.f193292c + ",okim:" + this.f193290a);
            return;
        }
        if (TextUtils.equals("voiceRoom", this.f193294e.f167380g)) {
            LongLinkChatMessage.RoomType roomType = LongLinkChatMessage.RoomType.video;
        } else {
            LongLinkChatMessage.RoomType roomType2 = LongLinkChatMessage.RoomType.video;
        }
        ypv.f199493a.m199329V();
        this.f193290a.m167791a(new qat(liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.chatReaded").setIsResponse(false).setData(li60.m149878a(liveAuthMessageNew.ChatReaded.newBuilder().setSeq(j).build())).build()));
    }

    @Override // p149l.r0w
    /* JADX INFO: renamed from: g */
    public void mo177415g(String str, String str2, boolean z, @NotNull Connector connector, String str3, String str4, String str5, String str6, String str7) {
        if (TextUtils.isEmpty(str)) {
            CrashHelper.m81296c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            CrashHelper.m81296c(new IllegalArgumentException(str3 + "SocketLongLink roomId is null"));
            return;
        }
        t1w.C20094a c20094aM186926g = t1w.C20094a.m186920a().m186925f(str).m186929j(str2).m186922c(z).m186926g(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        this.f193294e = c20094aM186926g.m186924e(str4).m186928i(str5).m186923d(str6).m186927h(str7).m186921b();
        if (this.f193290a == null) {
            m209790i(connector);
            return;
        }
        gkh0.m126629l("[live][longlink]", new IllegalAccessException(this.f193294e.f167380g + "okim is created, ignore"));
    }

    @Override // p149l.r0w
    /* JADX INFO: renamed from: h */
    public void mo177416h(String str) {
        if (this.f193290a == null) {
            gkh0.m126629l("[live][longlink]", new IllegalAccessException(this.f193294e.f167380g + "okim is null, ignore, roomid:" + str));
            return;
        }
        gkh0.m126627j("[live][longlink]", "stop  " + this.f193294e.f167380g + " longlink  ");
        this.f193290a.m167793c();
        this.f193290a = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m209790i(@NotNull Connector connector) {
        ArrayList arrayList = new ArrayList();
        List<String> list = "textRoom".equals(this.f193294e.f167380g) ? connector.text_room_tcp_addr_list : connector.tcp_addr_list;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new dvl(str));
                gkh0.m126627j("[live][longlink]", this.f193294e.f167380g + " added raw url: " + str);
            }
        }
        ConnectorConfig connectorConfig = connector.config;
        w4s w4sVar = new w4s(connectorConfig.reconnect_backoff_min, connectorConfig.reconnect_backoff_max, arrayList, connector.client_ip);
        mur murVar = new mur();
        murVar.m156432g(this.f193294e);
        ai2 ai2Var = new ai2();
        ai2Var.m96780j(this);
        C21164a c21164a = new C21164a();
        c21164a.m209792f(new c0t(connector.config.keepalive_timeout));
        p850 p850VarM121339b = new fh3().m121342e(w4sVar).m121341d(murVar).m121343f(ai2Var).m121340c(ypv.f199497e).m121344g(c21164a).m121346i(new mwt()).m121347j(new b0t(connector.config.keepalive_interval)).m121345h(this.f193294e).m121338a(new xs6()).m121338a(new CompressionInterceptor()).m121338a(new CryptInterceptor(ypv.f199497e)).m121338a(new lxk(this.f193294e.f167375b)).m121339b();
        this.f193290a = p850VarM121339b;
        p850VarM121339b.m167792b();
    }

    /* JADX INFO: renamed from: j */
    public final void m209791j(tul tulVar) {
        this.f193293d.f161701a = tulVar.m190711f();
        InterfaceC12887a.a aVarM190707b = tulVar.m190707b();
        if (aVarM190707b != null) {
            this.f193293d.f161702b = aVarM190707b.mo75510a();
        }
        this.f193293d.f161703c = tulVar.m190709d() == null ? "" : tulVar.m190709d().getMessage();
        this.f193293d.f161704d = System.currentTimeMillis();
    }

    @Override // p149l.uul
    /* JADX INFO: renamed from: b */
    public void mo195378b(boolean z) {
    }

    @Override // p149l.uul
    /* JADX INFO: renamed from: c */
    public void mo195379c(Throwable th) {
    }
}
