package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAuthSendData;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;

/* JADX INFO: loaded from: classes5.dex */
public class w6s extends Auth {
    public w6s(BLiveAuthSendData bLiveAuthSendData, long j) {
        super(bLiveAuthSendData, j);
    }

    @Override // p153l.rme0
    /* JADX INFO: renamed from: g */
    public void mo101382g(eh3 eh3Var, Object obj) {
        eh3Var.m215138d(((BLiveAuthSendData) obj).toJson().getBytes());
        eh3Var.m215140f("connect");
    }

    /* JADX INFO: renamed from: j */
    public yc60 m205195j() throws Auth.AuthException {
        try {
            return m76678h();
        } catch (Exception unused) {
            throw new Auth.AuthException("auth connect step get ack null");
        }
    }
}
