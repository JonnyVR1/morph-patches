package p153l;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class iqn0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m141674b(final Act act, final AnchorStartData anchorStartData, jxd0 jxd0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            mcn0.m157925F(act, tbs.f172989b.m203578a4(), new x20() { // from class: l.hqn0
                @Override // p153l.x20
                public final void call() {
                    tbs.f172993f.m143700b(act, anchorStartData);
                }
            });
        } else {
            tbs.f172993f.m143700b(act, anchorStartData);
            jxd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m141676d(Intent intent) {
        if (intent != null) {
            return true;
        }
        nsh0.m164608j("[live]living_room", "VoiceJumpHelper.enterVoice(). originData is not BLiveVoice, intent is null, return. And live enable is " + mqr.m159592l());
        CrashHelper.m82479c(new Exception("VoiceJumpHelper.enterVoice(). originData is not BLiveVoice, intent is null, return. And live enable is " + mqr.m159592l()));
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m141677e(final Act act, final AnchorStartData anchorStartData) {
        if (!wft.m206159b(3)) {
            if (tbs.f172989b.m203700p6()) {
                mcn0.m157925F(act, tbs.f172989b.m203578a4(), new x20() { // from class: l.fqn0
                    @Override // p153l.x20
                    public final void call() {
                        tbs.f172993f.m143700b(act, anchorStartData);
                    }
                });
                return;
            } else {
                tbs.f172993f.m143700b(act, anchorStartData);
                return;
            }
        }
        if (m141680h()) {
            final jxd0 jxd0Var = new jxd0("user_has_created_voice_room" + mbs.m157870o0(), Boolean.FALSE);
            if (tbs.f172989b.m203418G3()) {
                tbs.f172993f.m143700b(act, anchorStartData);
            } else if (jxd0Var.get().booleanValue()) {
                tbs.f172993f.m143700b(act, anchorStartData);
            } else {
                act.duringCreated(LiveVoiceApi.getRoomInfo(mbs.m157870o0())).subscribe(dhw.m115825d(new y20() { // from class: l.gqn0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iqn0.m141674b(act, anchorStartData, jxd0Var, (BLiveVoiceRoom) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m141678f(Context context, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, String str, boolean z) {
        m141679g(context, bLiveVoiceRoomFeed.liveId, str, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m141679g(Context context, String str, String str2, boolean z) {
        Intent intentM143704f = tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2).m68780H("type_voice_live").m68786N(z).m68794u());
        if (m141676d(intentM143704f)) {
            context.startActivity(intentM143704f);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m141680h() {
        String strM137760b = hyn0.m137760b(100019);
        fhw.m125605a("EnterRoomChecker", "isInterceptStartVoiceLives");
        return MomentAllowForwardState.allow.equals(strM137760b);
    }

    /* JADX INFO: renamed from: i */
    public static void m141681i(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        AudienceStartData audienceStartDataM68794u = AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2).m68786N(z).m68780H("type_voice_live").m68790R(str5).m68791S(str6).m68793U(str4).m68784L(str3).m68794u();
        if (audienceStartDataM68794u.isQuickEnterRtc() && tbs.f172989b.m203763w7()) {
            fhw.m125605a("[live]voiceEntry", "rtc进房优化，采用快速加入rtc方案进房");
        }
        Intent intentM143704f = tbs.f172993f.m143704f(context, audienceStartDataM68794u);
        if (m141676d(intentM143704f)) {
            context.startActivity(intentM143704f);
        }
    }
}
