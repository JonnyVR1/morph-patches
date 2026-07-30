package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r2f extends mq2<LongLinkLiveMessage.EnterRoom> {
    public r2f(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.EnterRoom enterRoom, String str2) {
        LiveUserInfo liveUserInfo;
        long j;
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.msgName = mo95511e();
        extInfo.followUserId = enterRoom.getUser().getId();
        LongLinkLiveMessage.UserInfo user = enterRoom.getUser();
        if (user != null) {
            if (TextUtils.isEmpty(user.getGrade())) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(user.getGrade());
                } catch (Exception e) {
                    CrashHelper.m82479c(new Throwable(e.getMessage()));
                    j = 0;
                }
            }
            liveUserInfo = new LiveUserInfo(user.getId(), user.getName(), j);
            liveUserInfo.userIdentity = user.getIdentity();
        } else {
            liveUserInfo = null;
        }
        LiveUserInfo liveUserInfo2 = liveUserInfo;
        Template.TemplateData tempdata = enterRoom.getTempdata();
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(tempdata.getId());
        LiveMessage.ExtInfo extInfoM124479A = f7t.m124479A(tempdata, bLiveTemplateM157079f);
        BLiveAtUserInfo bLiveAtUserInfo = extInfoM124479A.buttonUserInfo;
        if (bLiveAtUserInfo != null) {
            extInfo.buttonUserInfo = bLiveAtUserInfo;
            extInfo.buttonScene = f7t.m124504x(bLiveTemplateM157079f);
        }
        BLiveAtUserInfo bLiveAtUserInfo2 = extInfoM124479A.atUserInfo;
        if (bLiveAtUserInfo2 != null) {
            extInfo.atUserInfo = bLiveAtUserInfo2;
        }
        extInfo.isImportantMsg = enterRoom.getIsImportant();
        return m159455l(null, str, enterRoom.getTempdata().getId(), liveUserInfo2, null, enterRoom.getTempdata(), extInfo);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.EnterRoom> mo95510b() {
        return LongLinkLiveMessage.EnterRoom.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.enter";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0("live.voiceRoom.enterRoom");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.EnterRoom enterRoom, String str) {
        return m159460r(enterRoom.getRoomId(), "no_care", "no_care");
    }
}
