package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m1f extends vp2<LongLinkLiveMessage.EnterRoom> {
    public m1f(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.EnterRoom enterRoom, String str2) {
        LiveUserInfo liveUserInfo;
        long j;
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.msgName = mo94399e();
        extInfo.followUserId = enterRoom.getUser().getId();
        LongLinkLiveMessage.UserInfo user = enterRoom.getUser();
        if (user != null) {
            if (TextUtils.isEmpty(user.getGrade())) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(user.getGrade());
                } catch (Exception e) {
                    CrashHelper.m81296c(new Throwable(e.getMessage()));
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
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(tempdata.getId());
        LiveMessage.ExtInfo extInfoM114895A = e5t.m114895A(tempdata, bLiveTemplateM171773f);
        BLiveAtUserInfo bLiveAtUserInfo = extInfoM114895A.buttonUserInfo;
        if (bLiveAtUserInfo != null) {
            extInfo.buttonUserInfo = bLiveAtUserInfo;
            extInfo.buttonScene = e5t.m114920x(bLiveTemplateM171773f);
        }
        BLiveAtUserInfo bLiveAtUserInfo2 = extInfoM114895A.atUserInfo;
        if (bLiveAtUserInfo2 != null) {
            extInfo.atUserInfo = bLiveAtUserInfo2;
        }
        extInfo.isImportantMsg = enterRoom.getIsImportant();
        return m199207l(null, str, enterRoom.getTempdata().getId(), liveUserInfo2, null, enterRoom.getTempdata(), extInfo);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.EnterRoom> mo94398b() {
        return LongLinkLiveMessage.EnterRoom.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.enter";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0("live.voiceRoom.enterRoom");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.EnterRoom enterRoom, String str) {
        return m199212r(enterRoom.getRoomId(), "no_care", "no_care");
    }
}
