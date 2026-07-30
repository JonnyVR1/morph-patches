package p002l;

import com.google.protobuf.q;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import java.util.LinkedHashMap;
import java.util.List;
import l.e51;
import l.ki60;
import l.li60;
import l.mqi0;
import l.sul;
import l.uvr;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q7t extends iu40 {

    /* JADX INFO: renamed from: c */
    public LinkedHashMap<String, liveAuthMessageNew.Msg> f17849c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b */
    public j9t f17848b = new j9t();

    @Override // p002l.iu40, p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        s460 s460VarMo18695c = vq4Var.mo18695c();
        if (s460VarMo18695c.m22194b().m24688g()) {
            liveAuthMessageNew.Msg msgM15779a = this.f17848b.m15779a(s460VarMo18695c.m22193a());
            List<sul> listM17631e = lz00.m17628d().m17631e(msgM15779a.getMsgTypeName());
            if (vwb.J(listM17631e)) {
                vq4Var.mo18694b().m17157m().mo26978a("message has no deal, messageType:" + msgM15779a.getMsgTypeName());
            } else {
                final q qVarB = li60.b(listM17631e.get(0).b(), msgM15779a.getData());
                final ki60 ki60Var = new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON, msgM15779a.getMsgId(), qVarB);
                for (final sul sulVar : listM17631e) {
                    e51.G(new Runnable() { // from class: l.p7t
                        @Override // java.lang.Runnable
                        public final void run() {
                            sulVar.a(qVarB, ki60Var);
                        }
                    });
                }
            }
            if (uvr.d().A0()) {
                m21059g(msgM15779a, vq4Var.mo18694b());
            } else {
                m21060h(msgM15779a, vq4Var.mo18694b());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21059g(liveAuthMessageNew.Msg msg, lec0 lec0Var) {
        h10.m14126h(liveAuthMessageNew.Msg.newBuilder().setData(li60.a(liveAuthMessageNew.Ack.newBuilder().setMsgId(msg.getMsgId()).setMsgTypeName(msg.getMsgTypeName()).setRecvTimestamp(mqi0.o()).build())).build()).mo9124a(lec0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m21060h(liveAuthMessageNew.Msg msg, lec0 lec0Var) {
        if (msg.getStatus().getNeedAck()) {
            qat.m21151h(liveAuthMessageNew.Msg.newBuilder().setIsResponse(true).setMsgTypeName("live.client.msg.ack").setStatus(liveAuthMessageNew.Status.newBuilder().setStatus(200).setRecvTs(mqi0.o()).build()).build()).mo9124a(lec0Var);
        }
    }
}
