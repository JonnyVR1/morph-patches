package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAuthSendData;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;

/* JADX INFO: loaded from: classes4.dex */
public class v4s extends Auth {
    public v4s(BLiveAuthSendData bLiveAuthSendData, long j) {
        super(bLiveAuthSendData, j);
    }

    @Override // p149l.mee0
    /* JADX INFO: renamed from: g */
    public void mo128638g(qg3 qg3Var, Object obj) {
        qg3Var.m182211d(((BLiveAuthSendData) obj).toJson().getBytes());
        qg3Var.m182213f("connect");
    }

    /* JADX INFO: renamed from: j */
    public s460 m197061j() throws Auth.AuthException {
        try {
            return m75495h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
