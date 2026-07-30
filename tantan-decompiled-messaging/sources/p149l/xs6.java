package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class xs6 extends bxm {

    /* JADX INFO: renamed from: b */
    public j9t f194204b = new j9t();

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        s460 s460VarMo159107c = vq4Var.mo159107c();
        wkf0 wkf0VarM182209b = s460VarMo159107c.m182209b();
        if (wkf0VarM182209b.m203666f()) {
            s460VarMo159107c.m182213f("connect");
        } else if (wkf0VarM182209b.m203667g() || wkf0VarM182209b.m203665e()) {
            liveAuthMessageNew.Msg msgM140586a = this.f194204b.m140586a(s460VarMo159107c.m182208a());
            s460VarMo159107c.m182213f(msgM140586a.getMsgId());
            String strM75487a = vq4Var.mo159106b().m149489c().m75487a();
            vq4Var.mo159106b().m149499m().mo216485a(strM75487a + "ConvertInterceptor received message type:" + msgM140586a.getMsgTypeName());
        }
        if (wkf0VarM182209b.m203667g() && (wkf0VarM182209b instanceof lwt) && ((lwt) wkf0VarM182209b).m152012k()) {
            vq4Var.mo159106b().m149492f().m118456z();
        }
        vq4Var.mo159105a(vq4Var.mo159107c());
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        if (vq4Var.call() instanceof qat) {
            liveAuthMessageNew.Msg from = liveAuthMessageNew.Msg.parseFrom(vq4Var.mo159107c().m182208a());
            vq4Var.mo159106b().m149499m().mo216485a("ConvertInterceptor send message:" + from.getMsgTypeName());
        }
        vq4Var.mo159105a(vq4Var.mo159107c());
    }
}
