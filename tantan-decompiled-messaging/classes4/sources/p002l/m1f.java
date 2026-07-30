package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m1f extends vp2<LongLinkLiveMessage.EnterRoom> {
    public m1f(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.EnterRoom enterRoom, String str2) {
        LiveUserInfo liveUserInfo;
        long j;
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.msgName = mo9245e();
        extInfo.followUserId = enterRoom.getUser().getId();
        LongLinkLiveMessage.UserInfo user = enterRoom.getUser();
        if (user != null) {
            if (TextUtils.isEmpty(user.getGrade())) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(user.getGrade());
                } catch (Exception e) {
                    CrashHelper.c(new Throwable(e.getMessage()));
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
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(tempdata.getId());
        LiveMessage.ExtInfo extInfoM12194A = e5t.m12194A(tempdata, bLiveTemplateM20739f);
        BLiveAtUserInfo bLiveAtUserInfo = extInfoM12194A.buttonUserInfo;
        if (bLiveAtUserInfo != null) {
            extInfo.buttonUserInfo = bLiveAtUserInfo;
            extInfo.buttonScene = e5t.m12219x(bLiveTemplateM20739f);
        }
        BLiveAtUserInfo bLiveAtUserInfo2 = extInfoM12194A.atUserInfo;
        if (bLiveAtUserInfo2 != null) {
            extInfo.atUserInfo = bLiveAtUserInfo2;
        }
        extInfo.isImportantMsg = enterRoom.getIsImportant();
        return m24090l(null, str, enterRoom.getTempdata().getId(), liveUserInfo2, null, enterRoom.getTempdata(), extInfo);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.EnterRoom> mo9244b() {
        return LongLinkLiveMessage.EnterRoom.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.enter";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{"live.voiceRoom.enterRoom"});
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.EnterRoom enterRoom, String str) {
        return m24095r(enterRoom.getRoomId(), "no_care", "no_care");
    }
}
