package p007l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.LiveState;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import l.ib1;
import l.lsi0;
import l.osi0;
import l.qib0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class csg {
    /* JADX INFO: renamed from: a */
    public static boolean m9236a(@NonNull Live live) {
        return TEnum.equals(live.state, "onlive") || TEnum.equals(live.state, LiveState.suspended);
    }

    /* JADX INFO: renamed from: b */
    public static void m9237b(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
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
            kjb0.m11442F(act, false);
        } else {
            Live live = moment.live;
            kjb0.m11443G(act, live, kjb0.m11461m(live, str), moment.live.recommendInfo.category);
        }
        osg.m12852h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m9238c(Act act, String str, Moment moment) {
        if (qib0.b0.a.userId().equals(moment.live.anchor.f264id)) {
            kjb0.m11442F(act, false);
        } else {
            Live live = moment.live;
            kjb0.m11443G(act, live, kjb0.m11461m(live, str), moment.live.recommendInfo.category);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9239d(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
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
        } else {
            FeedModule.m1141M().M6().p(act, moment.momentVoiceLiveInfos.liveID, kjb0.m11462n("", str), moment.owner, "");
        }
        osg.m12852h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m9240e(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
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
        } else {
            FeedModule.m1141M().M6().p(act, moment.voiceLive.f711id, kjb0.m11462n("", str), moment.owner, "");
        }
        osg.m12852h(act, str, moment, i, z, hx60Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m9241f(Moment moment, View view) {
        boolean z = m9236a(moment.live) && !vwb.J(moment.live.redPacketIds);
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }
}
