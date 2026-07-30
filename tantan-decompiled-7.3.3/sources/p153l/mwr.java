package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;

/* JADX INFO: loaded from: classes5.dex */
public class mwr extends Auth {
    public mwr(liveAuthMessageNew.Msg msg, long j) {
        super(msg, j);
    }

    @Override // p153l.rme0
    /* JADX INFO: renamed from: g */
    public void mo101382g(eh3 eh3Var, Object obj) {
        eh3Var.m215138d(((liveAuthMessageNew.Msg) obj).toBuilder().setMsgId(eh3Var.m215137c()).build().toByteArray());
    }

    /* JADX INFO: renamed from: j */
    public yc60 m160590j() throws Auth.AuthException {
        try {
            return m76678h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
