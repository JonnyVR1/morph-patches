package p149l;

import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q7t extends iu40 {

    /* JADX INFO: renamed from: c */
    public LinkedHashMap<String, liveAuthMessageNew.Msg> f153073c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b */
    public j9t f153072b = new j9t();

    @Override // p149l.iu40, p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        s460 s460VarMo159107c = vq4Var.mo159107c();
        if (s460VarMo159107c.m182209b().m203667g()) {
            liveAuthMessageNew.Msg msgM140586a = this.f153072b.m140586a(s460VarMo159107c.m182208a());
            List<sul> listM152307e = lz00.m152304d().m152307e(msgM140586a.getMsgTypeName());
            if (vwb.m200296J(listM152307e)) {
                vq4Var.mo159106b().m149499m().mo216485a("message has no deal, messageType:" + msgM140586a.getMsgTypeName());
            } else {
                final InterfaceC3419q interfaceC3419qM149879b = li60.m149879b(listM152307e.get(0).mo94398b(), msgM140586a.getData());
                final ki60 ki60Var = new ki60(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON, msgM140586a.getMsgId(), interfaceC3419qM149879b);
                for (final sul sulVar : listM152307e) {
                    e51.m114742G(new Runnable() { // from class: l.p7t
                        @Override // java.lang.Runnable
                        public final void run() {
                            sulVar.mo133933a(interfaceC3419qM149879b, ki60Var);
                        }
                    });
                }
            }
            if (uvr.m196087d().m162657A0()) {
                m173298g(msgM140586a, vq4Var.mo159106b());
            } else {
                m173299h(msgM140586a, vq4Var.mo159106b());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m173298g(liveAuthMessageNew.Msg msg, lec0 lec0Var) {
        h10.m128994h(liveAuthMessageNew.Msg.newBuilder().setData(li60.m149878a(liveAuthMessageNew.Ack.newBuilder().setMsgId(msg.getMsgId()).setMsgTypeName(msg.getMsgTypeName()).setRecvTimestamp(mqi0.m155944o()).build())).build()).mo75489a(lec0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m173299h(liveAuthMessageNew.Msg msg, lec0 lec0Var) {
        if (msg.getStatus().getNeedAck()) {
            qat.m173775h(liveAuthMessageNew.Msg.newBuilder().setIsResponse(true).setMsgTypeName("live.client.msg.ack").setStatus(liveAuthMessageNew.Status.newBuilder().setStatus(200).setRecvTs(mqi0.m155944o()).build()).build()).mo75489a(lec0Var);
        }
    }
}
