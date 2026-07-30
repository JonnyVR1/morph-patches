package p007l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.UserLiveLabel;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import l.bkn0;
import l.ib1;
import l.lsi0;
import l.osi0;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f5i {
    /* JADX INFO: renamed from: a */
    public static boolean m10063a(Moment moment) {
        return TextUtils.equals(moment.liveState, UserLiveLabel.LIVE_STATE) || TextUtils.equals(moment.liveState, UserLiveLabel.LIVE_MULTI_CALL);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10064b(xa70 xa70Var, Moment moment) {
        return (xa70Var == null || moment == null || !m10063a(moment) || vs0.m15566d(moment)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10065c(xa70 xa70Var, Moment moment) {
        return (xa70Var == null || moment == null || !TextUtils.equals(moment.liveState, UserLiveLabel.VOICE_STATE) || vs0.m15566d(moment)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: d */
    public static void m10066d(xa70 xa70Var, Act act, Moment moment) {
        String str;
        String str2;
        AudioBusinessType audioBusinessTypeC;
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        Moment moment2;
        Live live;
        if ("from_nearby_focus".equals(xa70Var.f14821b)) {
            str2 = "momentFollow";
        } else {
            if (!"from_like".equals(xa70Var.f14821b)) {
                if ("from_nearby_falls_feed".equals(xa70Var.f14821b)) {
                    str2 = "momentNearby";
                } else {
                    str = "";
                }
                audioBusinessTypeC = ib1.b().c();
                if (NullChecker.a(audioBusinessTypeC)) {
                    if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
                        lsi0.w(R$string.f337C2);
                        return;
                    } else {
                        osi0.g(audioBusinessTypeC.getBusinessMsg());
                        return;
                    }
                }
                if (qib0.b0.a.userId().equals(moment.live.anchor.f264id)) {
                    FeedModule.m1141M().M6().i(act, "");
                    return;
                }
                momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
                if (momentVoiceLiveInfos == null && !TextUtils.isEmpty(momentVoiceLiveInfos.liveID)) {
                    FeedModule.m1141M().M6().p(act, moment.momentVoiceLiveInfos.liveID, kjb0.m11462n("", str), moment.owner, "");
                    return;
                }
                moment2 = xa70Var.f14820a;
                if (moment2 != null || (live = moment2.live) == null || TextUtils.isEmpty(live.f228id)) {
                    return;
                }
                bkn0 bkn0VarM6 = FeedModule.m1141M().M6();
                Moment moment3 = xa70Var.f14820a;
                bkn0VarM6.p(act, moment3.live.f228id, str, moment3.owner, moment.live.recommendInfo.category);
                return;
            }
            str2 = "momentLike";
        }
        str = str2;
        audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
                lsi0.w(R$string.f337C2);
                return;
            } else {
                osi0.g(audioBusinessTypeC.getBusinessMsg());
                return;
            }
        }
        if (qib0.b0.a.userId().equals(moment.live.anchor.f264id)) {
            FeedModule.m1141M().M6().i(act, "");
            return;
        }
        momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        if (momentVoiceLiveInfos == null) {
        }
        moment2 = xa70Var.f14820a;
        if (moment2 != null) {
        }
    }
}
