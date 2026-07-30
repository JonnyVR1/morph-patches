package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class scu extends mq2<LongLinkLiveMessage.LiveSystemMessage> {
    public scu(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        return new LiveControlMessage(str, "system").setContent(liveSystemMessage.getContent()).setTemplateId(liveSystemMessage.getTempdata().getId());
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str2) {
        LongLinkLiveMessage.UserInfo userInfoBuild;
        LongLinkLiveMessage.UserInfo userInfo;
        int id = liveSystemMessage.getTempdata().getId();
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(id);
        LiveMessage.ExtInfo extInfoM124479A = f7t.m124479A(liveSystemMessage.getTempdata(), bLiveTemplateM157079f);
        if (extInfoM124479A.atUserInfo == null) {
            if (extInfoM124479A.buttonUserInfo != null) {
                LongLinkLiveMessage.UserInfo userInfoBuild2 = LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM124479A.buttonUserInfo.userId).build();
                extInfoM124479A.buttonScene = f7t.m124504x(bLiveTemplateM157079f);
                userInfo = userInfoBuild2;
            } else {
                String strM124504x = f7t.m124504x(bLiveTemplateM157079f);
                if (!TextUtils.isEmpty(strM124504x)) {
                    extInfoM124479A.buttonScene = strM124504x;
                }
                userInfoBuild = null;
            }
            LiveMessage liveMessageM159457n = m159457n(str, id, userInfo, null, liveSystemMessage.getTempdata());
            liveMessageM159457n.extInfo = extInfoM124479A;
            return liveMessageM159457n;
        }
        userInfoBuild = LongLinkLiveMessage.UserInfo.newBuilder().setId(extInfoM124479A.atUserInfo.userId).build();
        userInfo = userInfoBuild;
        LiveMessage liveMessageM159457n2 = m159457n(str, id, userInfo, null, liveSystemMessage.getTempdata());
        liveMessageM159457n2.extInfo = extInfoM124479A;
        return liveMessageM159457n2;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSystemMessage> mo95510b() {
        return LongLinkLiveMessage.LiveSystemMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.systemMsg";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0("live.voiceRoom.systemMessage");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveSystemMessage liveSystemMessage, String str) {
        return m159460r("no_care", "no_care", "no_care");
    }
}
