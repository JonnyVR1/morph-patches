package p002l;

import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h10 extends mee0 {
    public h10(liveAuthMessageNew.Msg msg) {
        super(msg);
    }

    /* JADX INFO: renamed from: h */
    public static h10 m14126h(liveAuthMessageNew.Msg msg) {
        return new h10(msg);
    }

    @Override // p002l.mee0
    /* JADX INFO: renamed from: g */
    public void mo14076g(qg3 qg3Var, Object obj) {
        qg3Var.m22196d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m22195c()).build().getData().toByteArray());
    }
}
