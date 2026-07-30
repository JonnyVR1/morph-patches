package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes5.dex */
public class b10 extends rme0 {
    public b10(liveAuthMessageNew.Msg msg) {
        super(msg);
    }

    /* JADX INFO: renamed from: h */
    public static b10 m101381h(liveAuthMessageNew.Msg msg) {
        return new b10(msg);
    }

    @Override // p153l.rme0
    /* JADX INFO: renamed from: g */
    public void mo101382g(eh3 eh3Var, Object obj) {
        eh3Var.m215138d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(eh3Var.m215137c()).build().getData().toByteArray());
    }
}
