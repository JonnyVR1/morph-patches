package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class u6i {
    /* JADX INFO: renamed from: a */
    public static boolean m194708a(Moment moment) {
        return TextUtils.equals(moment.liveState, "onLive") || TextUtils.equals(moment.liveState, "onMultiCall");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m194709b(dj70 dj70Var, Moment moment) {
        return (dj70Var == null || moment == null || !m194708a(moment) || at0.m100010d(moment)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m194710c(dj70 dj70Var, Moment moment) {
        return (dj70Var == null || moment == null || !TextUtils.equals(moment.liveState, "onVoice") || at0.m100010d(moment)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: d */
    public static void m194711d(dj70 dj70Var, Act act, Moment moment) {
        String str;
        String str2;
        AudioBusinessType audioBusinessTypeMo171474c;
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        Moment moment2;
        Live live;
        if ("from_nearby_focus".equals(dj70Var.f88792b)) {
            str2 = "momentFollow";
        } else {
            if (!"from_like".equals(dj70Var.f88792b)) {
                if ("from_nearby_falls_feed".equals(dj70Var.f88792b)) {
                    str2 = "momentNearby";
                } else {
                    str = "";
                }
                audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
                if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
                    if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                        o1j0.m165649w(R$string.f39724C2);
                        return;
                    } else {
                        r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
                        return;
                    }
                }
                if (uqb0.f180396b0.f170324a.userId().equals(moment.live.anchor.f39651id)) {
                    FeedModule.m61407M().mo68412M6().mo127338i(act, "");
                    return;
                }
                momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
                if (momentVoiceLiveInfos == null && !TextUtils.isEmpty(momentVoiceLiveInfos.liveID)) {
                    FeedModule.m61407M().mo68412M6().mo127345p(act, moment.momentVoiceLiveInfos.liveID, orb0.m168897n("", str), moment.owner, "");
                    return;
                }
                moment2 = dj70Var.f88791a;
                if (moment2 != null || (live = moment2.live) == null || TextUtils.isEmpty(live.f39615id)) {
                    return;
                }
                ftn0 ftn0VarMo68412M6 = FeedModule.m61407M().mo68412M6();
                Moment moment3 = dj70Var.f88791a;
                ftn0VarMo68412M6.mo127345p(act, moment3.live.f39615id, str, moment3.owner, moment.live.recommendInfo.category);
                return;
            }
            str2 = "momentLike";
        }
        str = str2;
        audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                o1j0.m165649w(R$string.f39724C2);
                return;
            } else {
                r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
                return;
            }
        }
        if (uqb0.f180396b0.f170324a.userId().equals(moment.live.anchor.f39651id)) {
            FeedModule.m61407M().mo68412M6().mo127338i(act, "");
            return;
        }
        momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        if (momentVoiceLiveInfos == null) {
        }
        moment2 = dj70Var.f88791a;
        if (moment2 != null) {
        }
    }
}
