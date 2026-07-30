package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lur extends Auth {
    public lur(liveAuthMessageNew.Msg msg, long j) {
        super(msg, j);
    }

    @Override // p002l.mee0
    /* JADX INFO: renamed from: g */
    public void mo14076g(qg3 qg3Var, Object obj) {
        qg3Var.m22196d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m22195c()).build().toByteArray());
    }

    /* JADX INFO: renamed from: j */
    public s460 m17471j() throws Auth.AuthException {
        try {
            return m9130h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
