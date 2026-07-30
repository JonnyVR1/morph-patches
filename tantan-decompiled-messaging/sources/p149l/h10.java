package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class h10 extends mee0 {
    public h10(liveAuthMessageNew.Msg msg) {
        super(msg);
    }

    /* JADX INFO: renamed from: h */
    public static h10 m128994h(liveAuthMessageNew.Msg msg) {
        return new h10(msg);
    }

    @Override // p149l.mee0
    /* JADX INFO: renamed from: g */
    public void mo128638g(qg3 qg3Var, Object obj) {
        qg3Var.m182211d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m182210c()).build().getData().toByteArray());
    }
}
