package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p1.mobile.putong.live.base.data.BLiveAuthSendData;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v4s extends Auth {
    public v4s(BLiveAuthSendData bLiveAuthSendData, long j) {
        super(bLiveAuthSendData, j);
    }

    @Override // p002l.mee0
    /* JADX INFO: renamed from: g */
    public void mo14076g(qg3 qg3Var, Object obj) {
        qg3Var.m22196d(((BLiveAuthSendData) obj).toJson().getBytes());
        qg3Var.m22198f("connect");
    }

    /* JADX INFO: renamed from: j */
    public s460 m23753j() throws Auth.AuthException {
        try {
            return m9130h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
