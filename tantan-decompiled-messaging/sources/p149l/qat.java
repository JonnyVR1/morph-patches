package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class qat extends mee0 {
    public qat(liveAuthMessageNew.Msg msg) {
        super(msg);
    }

    /* JADX INFO: renamed from: h */
    public static qat m173775h(liveAuthMessageNew.Msg msg) {
        return new qat(msg);
    }

    @Override // p149l.mee0
    /* JADX INFO: renamed from: g */
    public void mo128638g(qg3 qg3Var, Object obj) {
        qg3Var.m182211d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m182210c()).build().toByteArray());
    }
}
