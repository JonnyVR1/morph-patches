package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class f5i {
    /* JADX INFO: renamed from: a */
    public static boolean m119502a(Moment moment) {
        return TextUtils.equals(moment.liveState, "onLive") || TextUtils.equals(moment.liveState, "onMultiCall");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m119503b(xa70 xa70Var, Moment moment) {
        return (xa70Var == null || moment == null || !m119502a(moment) || vs0.m199798d(moment)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m119504c(xa70 xa70Var, Moment moment) {
        return (xa70Var == null || moment == null || !TextUtils.equals(moment.liveState, "onVoice") || vs0.m199798d(moment)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: d */
    public static void m119505d(xa70 xa70Var, Act act, Moment moment) {
        String str;
        String str2;
        AudioBusinessType audioBusinessTypeMo135235c;
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        Moment moment2;
        Live live;
        if ("from_nearby_focus".equals(xa70Var.f191690b)) {
            str2 = "momentFollow";
        } else {
            if (!"from_like".equals(xa70Var.f191690b)) {
                if ("from_nearby_falls_feed".equals(xa70Var.f191690b)) {
                    str2 = "momentNearby";
                } else {
                    str = "";
                }
                audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
                if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
                    if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                        lsi0.m151593w(R$string.f38876C2);
                        return;
                    } else {
                        osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
                        return;
                    }
                }
                if (qib0.f154713b0.f139230a.userId().equals(moment.live.anchor.f38803id)) {
                    FeedModule.m60223M().mo67229M6().mo102424i(act, "");
                    return;
                }
                momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
                if (momentVoiceLiveInfos == null && !TextUtils.isEmpty(momentVoiceLiveInfos.liveID)) {
                    FeedModule.m60223M().mo67229M6().mo102431p(act, moment.momentVoiceLiveInfos.liveID, kjb0.m146203n("", str), moment.owner, "");
                    return;
                }
                moment2 = xa70Var.f191689a;
                if (moment2 != null || (live = moment2.live) == null || TextUtils.isEmpty(live.f38767id)) {
                    return;
                }
                bkn0 bkn0VarMo67229M6 = FeedModule.m60223M().mo67229M6();
                Moment moment3 = xa70Var.f191689a;
                bkn0VarMo67229M6.mo102431p(act, moment3.live.f38767id, str, moment3.owner, moment.live.recommendInfo.category);
                return;
            }
            str2 = "momentLike";
        }
        str = str2;
        audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                lsi0.m151593w(R$string.f38876C2);
                return;
            } else {
                osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
                return;
            }
        }
        if (qib0.f154713b0.f139230a.userId().equals(moment.live.anchor.f38803id)) {
            FeedModule.m60223M().mo67229M6().mo102424i(act, "");
            return;
        }
        momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        if (momentVoiceLiveInfos == null) {
        }
        moment2 = xa70Var.f191689a;
        if (moment2 != null) {
        }
    }
}
