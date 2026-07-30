package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveChatRealMsgLiveInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class vtn {
    /* JADX INFO: renamed from: b */
    public static l2s m200047b(BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo) {
        if (!NullChecker.m81303a(bLiveChatRealMsgLiveInfo) || TextUtils.isEmpty(bLiveChatRealMsgLiveInfo.anchorName) || TextUtils.isEmpty(bLiveChatRealMsgLiveInfo.anchorAvatar)) {
            return null;
        }
        l2s l2sVar = new l2s();
        l2sVar.m148301f(bLiveChatRealMsgLiveInfo.anchorAvatar);
        l2sVar.m148303h(bLiveChatRealMsgLiveInfo.type);
        l2sVar.m148302g(bLiveChatRealMsgLiveInfo.title);
        l2sVar.m148300e(bLiveChatRealMsgLiveInfo.anchorName);
        return l2sVar;
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<l2s> m200048c() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/chatMsg/live-status"), new mt0[0]), "getIntlLiveChatLittleHelperRealMsg").map(new w9j() { // from class: l.utn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vtn.m200047b(((BLiveEnvelope) obj).data.chatMsgLiveInfo);
            }
        });
    }
}
