package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class rtg {
    /* JADX INFO: renamed from: a */
    public static boolean m183115a(@NonNull Live live) {
        return TEnum.equals(live.state, "onlive") || TEnum.equals(live.state, "suspended");
    }

    /* JADX INFO: renamed from: b */
    public static void m183116b(Act act, String str, Moment moment, int i, boolean z, n570 n570Var) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
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
            orb0.m168877F(act, false);
        } else {
            Live live = moment.live;
            orb0.m168878G(act, live, orb0.m168896m(live, str), moment.live.recommendInfo.category);
        }
        dug.m118142h(act, str, moment, i, z, n570Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m183117c(Act act, String str, Moment moment) {
        if (uqb0.f180396b0.f170324a.userId().equals(moment.live.anchor.f39651id)) {
            orb0.m168877F(act, false);
        } else {
            Live live = moment.live;
            orb0.m168878G(act, live, orb0.m168896m(live, str), moment.live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m183118d(Act act, String str, Moment moment, int i, boolean z, n570 n570Var) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
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
        } else {
            FeedModule.m61407M().mo68412M6().mo127345p(act, moment.momentVoiceLiveInfos.liveID, orb0.m168897n("", str), moment.owner, "");
        }
        dug.m118142h(act, str, moment, i, z, n570Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m183119e(Act act, String str, Moment moment, int i, boolean z, n570 n570Var) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
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
        } else {
            FeedModule.m61407M().mo68412M6().mo127345p(act, moment.voiceLive.f40098id, orb0.m168897n("", str), moment.owner, "");
        }
        dug.m118142h(act, str, moment, i, z, n570Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m183120f(Moment moment, View view) {
        boolean z = m183115a(moment.live) && !jyb.m147479J(moment.live.redPacketIds);
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }
}
