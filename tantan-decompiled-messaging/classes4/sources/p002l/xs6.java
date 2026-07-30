package p002l;

import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xs6 extends bxm {

    /* JADX INFO: renamed from: b */
    public j9t f22439b = new j9t();

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        s460 s460VarMo18695c = vq4Var.mo18695c();
        wkf0 wkf0VarM22194b = s460VarMo18695c.m22194b();
        if (wkf0VarM22194b.m24687f()) {
            s460VarMo18695c.m22198f("connect");
        } else if (wkf0VarM22194b.m24688g() || wkf0VarM22194b.m24686e()) {
            liveAuthMessageNew.Msg msgM15779a = this.f22439b.m15779a(s460VarMo18695c.m22193a());
            s460VarMo18695c.m22198f(msgM15779a.getMsgId());
            String strM9122a = vq4Var.mo18694b().m17147c().m9122a();
            vq4Var.mo18694b().m17157m().mo26978a(strM9122a + "ConvertInterceptor received message type:" + msgM15779a.getMsgTypeName());
        }
        if (wkf0VarM22194b.m24688g() && (wkf0VarM22194b instanceof lwt) && ((lwt) wkf0VarM22194b).m17501k()) {
            vq4Var.mo18694b().m17150f().m12791z();
        }
        vq4Var.mo18693a(vq4Var.mo18695c());
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        if (vq4Var.call() instanceof qat) {
            liveAuthMessageNew.Msg from = liveAuthMessageNew.Msg.parseFrom(vq4Var.mo18695c().m22193a());
            vq4Var.mo18694b().m17157m().mo26978a("ConvertInterceptor send message:" + from.getMsgTypeName());
        }
        vq4Var.mo18693a(vq4Var.mo18695c());
    }
}
