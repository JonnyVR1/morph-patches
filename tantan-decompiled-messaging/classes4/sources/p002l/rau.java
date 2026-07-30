package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rau extends vp2<LongLinkLiveMessage.LiveSystemMessage> {
    public rau(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        return new LiveControlMessage(str, "system").setContent(liveSystemMessage.getContent()).setTemplateId(liveSystemMessage.getTempdata().getId());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        LongLinkLiveMessage.UserInfo userInfo;
        LongLinkLiveMessage.UserInfo userInfo2;
        int id = liveSystemMessage.getTempdata().getId();
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(id);
        LiveMessage.ExtInfo extInfoM12194A = e5t.m12194A(liveSystemMessage.getTempdata(), bLiveTemplateM20739f);
        if (extInfoM12194A.atUserInfo == null) {
            if (extInfoM12194A.buttonUserInfo != null) {
                LongLinkLiveMessage.UserInfo userInfo3 = (LongLinkLiveMessage.UserInfo) LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM12194A.buttonUserInfo.userId).build();
                extInfoM12194A.buttonScene = e5t.m12219x(bLiveTemplateM20739f);
                userInfo2 = userInfo3;
            } else {
                String strM12219x = e5t.m12219x(bLiveTemplateM20739f);
                if (!TextUtils.isEmpty(strM12219x)) {
                    extInfoM12194A.buttonScene = strM12219x;
                }
                userInfo = null;
            }
            LiveMessage liveMessageM24092n = m24092n(str, id, userInfo2, null, liveSystemMessage.getTempdata());
            liveMessageM24092n.extInfo = extInfoM12194A;
            return liveMessageM24092n;
        }
        userInfo = (LongLinkLiveMessage.UserInfo) LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM12194A.atUserInfo.userId).build();
        userInfo2 = userInfo;
        LiveMessage liveMessageM24092n2 = m24092n(str, id, userInfo2, null, liveSystemMessage.getTempdata());
        liveMessageM24092n2.extInfo = extInfoM12194A;
        return liveMessageM24092n2;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSystemMessage> mo9244b() {
        return LongLinkLiveMessage.LiveSystemMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.systemMsg";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{"live.voiceRoom.systemMessage"});
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str) {
        return m24095r("no_care", "no_care", "no_care");
    }
}
