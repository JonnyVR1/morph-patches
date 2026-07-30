package p002l;

import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qat extends mee0 {
    public qat(liveAuthMessageNew.Msg msg) {
        super(msg);
    }

    /* JADX INFO: renamed from: h */
    public static qat m21151h(liveAuthMessageNew.Msg msg) {
        return new qat(msg);
    }

    @Override // p002l.mee0
    /* JADX INFO: renamed from: g */
    public void mo14076g(qg3 qg3Var, Object obj) {
        qg3Var.m22196d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m22195c()).build().toByteArray());
    }
}
