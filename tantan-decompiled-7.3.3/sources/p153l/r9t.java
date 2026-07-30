package p153l;

import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r9t extends x250 {

    /* JADX INFO: renamed from: c */
    public LinkedHashMap<String, liveAuthMessageNew.Msg> f161868c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b */
    public kbt f161867b = new kbt();

    @Override // p153l.x250, p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        if (yc60VarMo196644c.m215136b().m127319g()) {
            liveAuthMessageNew.Msg msgM149077a = this.f161867b.m149077a(yc60VarMo196644c.m215135a());
            List<fxl> listM200169e = v710.m200166d().m200169e(msgM149077a.getMsgTypeName());
            if (jyb.m147479J(listM200169e)) {
                ur4Var.mo196643b().m186795m().mo204126a("message has no deal, messageType:" + msgM149077a.getMsgTypeName());
            } else {
                final InterfaceC3442q interfaceC3442qM177481b = qq60.m177481b(listM200169e.get(0).mo95510b(), msgM149077a.getData());
                final pq60 pq60Var = new pq60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON, msgM149077a.getMsgId(), interfaceC3442qM177481b);
                for (final fxl fxlVar : listM200169e) {
                    l51.m152887G(new Runnable() { // from class: l.q9t
                        @Override // java.lang.Runnable
                        public final void run() {
                            fxlVar.mo123068a(interfaceC3442qM177481b, pq60Var);
                        }
                    });
                }
            }
            if (vxr.m203876d().m170964A0()) {
                m180657g(msgM149077a, ur4Var.mo196643b());
            } else {
                m180658h(msgM149077a, ur4Var.mo196643b());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m180657g(liveAuthMessageNew.Msg msg, smc0 smc0Var) {
        b10.m101381h(liveAuthMessageNew.Msg.newBuilder().setData(qq60.m177480a(liveAuthMessageNew.Ack.newBuilder().setMsgId(msg.getMsgId()).setMsgTypeName(msg.getMsgTypeName()).setRecvTimestamp(pzi0.m174454o()).build())).build()).mo76672a(smc0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m180658h(liveAuthMessageNew.Msg msg, smc0 smc0Var) {
        if (msg.getStatus().getNeedAck()) {
            rct.m180820h(liveAuthMessageNew.Msg.newBuilder().setIsResponse(true).setMsgTypeName("live.client.msg.ack").setStatus(liveAuthMessageNew.Status.newBuilder().setStatus(200).setRecvTs(pzi0.m174454o()).build()).build()).mo76672a(smc0Var);
        }
    }
}
