package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveChatRealMsgLiveInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class vvn {
    /* JADX INFO: renamed from: b */
    public static m4s m203023b(BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo) {
        if (!NullChecker.m82486a(bLiveChatRealMsgLiveInfo) || TextUtils.isEmpty(bLiveChatRealMsgLiveInfo.anchorName) || TextUtils.isEmpty(bLiveChatRealMsgLiveInfo.anchorAvatar)) {
            return null;
        }
        m4s m4sVar = new m4s();
        m4sVar.m157059f(bLiveChatRealMsgLiveInfo.anchorAvatar);
        m4sVar.m157061h(bLiveChatRealMsgLiveInfo.type);
        m4sVar.m157060g(bLiveChatRealMsgLiveInfo.title);
        m4sVar.m157058e(bLiveChatRealMsgLiveInfo.anchorName);
        return m4sVar;
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<m4s> m203024c() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/chatMsg/live-status"), new st0[0]), "getIntlLiveChatLittleHelperRealMsg").map(new qcj() { // from class: l.uvn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vvn.m203023b(((BLiveEnvelope) obj).data.chatMsgLiveInfo);
            }
        });
    }
}
