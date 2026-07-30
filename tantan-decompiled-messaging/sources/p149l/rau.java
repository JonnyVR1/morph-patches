package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rau extends vp2<LongLinkLiveMessage.LiveSystemMessage> {
    public rau(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        return new LiveControlMessage(str, "system").setContent(liveSystemMessage.getContent()).setTemplateId(liveSystemMessage.getTempdata().getId());
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        LongLinkLiveMessage.UserInfo userInfoBuild;
        LongLinkLiveMessage.UserInfo userInfo;
        int id = liveSystemMessage.getTempdata().getId();
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(id);
        LiveMessage.ExtInfo extInfoM114895A = e5t.m114895A(liveSystemMessage.getTempdata(), bLiveTemplateM171773f);
        if (extInfoM114895A.atUserInfo == null) {
            if (extInfoM114895A.buttonUserInfo != null) {
                LongLinkLiveMessage.UserInfo userInfoBuild2 = LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM114895A.buttonUserInfo.userId).build();
                extInfoM114895A.buttonScene = e5t.m114920x(bLiveTemplateM171773f);
                userInfo = userInfoBuild2;
            } else {
                String strM114920x = e5t.m114920x(bLiveTemplateM171773f);
                if (!TextUtils.isEmpty(strM114920x)) {
                    extInfoM114895A.buttonScene = strM114920x;
                }
                userInfoBuild = null;
            }
            LiveMessage liveMessageM199209n = m199209n(str, id, userInfo, null, liveSystemMessage.getTempdata());
            liveMessageM199209n.extInfo = extInfoM114895A;
            return liveMessageM199209n;
        }
        userInfoBuild = LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM114895A.atUserInfo.userId).build();
        userInfo = userInfoBuild;
        LiveMessage liveMessageM199209n2 = m199209n(str, id, userInfo, null, liveSystemMessage.getTempdata());
        liveMessageM199209n2.extInfo = extInfoM114895A;
        return liveMessageM199209n2;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSystemMessage> mo94398b() {
        return LongLinkLiveMessage.LiveSystemMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.live.systemMsg";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0("live.voiceRoom.systemMessage");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str) {
        return m199212r("no_care", "no_care", "no_care");
    }
}
