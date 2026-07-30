package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;

/* JADX INFO: loaded from: classes4.dex */
public class lur extends Auth {
    public lur(liveAuthMessageNew.Msg msg, long j) {
        super(msg, j);
    }

    @Override // p149l.mee0
    /* JADX INFO: renamed from: g */
    public void mo128638g(qg3 qg3Var, Object obj) {
        qg3Var.m182211d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(qg3Var.m182210c()).build().toByteArray());
    }

    /* JADX INFO: renamed from: j */
    public s460 m151813j() throws Auth.AuthException {
        try {
            return m75495h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
