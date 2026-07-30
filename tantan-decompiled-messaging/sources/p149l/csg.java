package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class csg {
    /* JADX INFO: renamed from: a */
    public static boolean m108505a(@NonNull Live live) {
        return TEnum.equals(live.state, "onlive") || TEnum.equals(live.state, "suspended");
    }

    /* JADX INFO: renamed from: b */
    public static void m108506b(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
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
            kjb0.m146183F(act, false);
        } else {
            Live live = moment.live;
            kjb0.m146184G(act, live, kjb0.m146202m(live, str), moment.live.recommendInfo.category);
        }
        osg.m165773h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m108507c(Act act, String str, Moment moment) {
        if (qib0.f154713b0.f139230a.userId().equals(moment.live.anchor.f38803id)) {
            kjb0.m146183F(act, false);
        } else {
            Live live = moment.live;
            kjb0.m146184G(act, live, kjb0.m146202m(live, str), moment.live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m108508d(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
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
        } else {
            FeedModule.m60223M().mo67229M6().mo102431p(act, moment.momentVoiceLiveInfos.liveID, kjb0.m146203n("", str), moment.owner, "");
        }
        osg.m165773h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m108509e(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
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
        } else {
            FeedModule.m60223M().mo67229M6().mo102431p(act, moment.voiceLive.f39250id, kjb0.m146203n("", str), moment.owner, "");
        }
        osg.m165773h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m108510f(Moment moment, View view) {
        boolean z = m108505a(moment.live) && !vwb.m200296J(moment.live.redPacketIds);
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }
}
