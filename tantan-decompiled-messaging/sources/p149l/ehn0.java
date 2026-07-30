package p149l;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class ehn0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m116499b(final Act act, final AnchorStartData anchorStartData, hpd0 hpd0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            i3n0.m134270F(act, s9s.f163228b.m195791a4(), new d30() { // from class: l.dhn0
                @Override // p149l.d30
                public final void call() {
                    s9s.f163232f.m134369b(act, anchorStartData);
                }
            });
        } else {
            s9s.f163232f.m134369b(act, anchorStartData);
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m116501d(Intent intent) {
        if (intent != null) {
            return true;
        }
        gkh0.m126627j("[live]living_room", "VoiceJumpHelper.enterVoice(). originData is not BLiveVoice, intent is null, return. And live enable is " + lor.m150807l());
        CrashHelper.m81296c(new Exception("VoiceJumpHelper.enterVoice(). originData is not BLiveVoice, intent is null, return. And live enable is " + lor.m150807l()));
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m116502e(final Act act, final AnchorStartData anchorStartData) {
        if (!vdt.m198092b(3)) {
            if (s9s.f163228b.m195913p6()) {
                i3n0.m134270F(act, s9s.f163228b.m195791a4(), new d30() { // from class: l.bhn0
                    @Override // p149l.d30
                    public final void call() {
                        s9s.f163232f.m134369b(act, anchorStartData);
                    }
                });
                return;
            } else {
                s9s.f163232f.m134369b(act, anchorStartData);
                return;
            }
        }
        if (m116505h()) {
            final hpd0 hpd0Var = new hpd0("user_has_created_voice_room" + l9s.m149093o0(), Boolean.FALSE);
            if (s9s.f163228b.m195631G3()) {
                s9s.f163232f.m134369b(act, anchorStartData);
            } else if (hpd0Var.get().booleanValue()) {
                s9s.f163232f.m134369b(act, anchorStartData);
            } else {
                act.duringCreated(LiveVoiceApi.getRoomInfo(l9s.m149093o0())).subscribe(ffw.m121193d(new e30() { // from class: l.chn0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ehn0.m116499b(act, anchorStartData, hpd0Var, (BLiveVoiceRoom) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m116503f(Context context, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, String str, boolean z) {
        m116504g(context, bLiveVoiceRoomFeed.liveId, str, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m116504g(Context context, String str, String str2, boolean z) {
        Intent intentM134373f = s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2).m67597H("type_voice_live").m67603N(z).m67611u());
        if (m116501d(intentM134373f)) {
            context.startActivity(intentM134373f);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m116505h() {
        String strM112919b = dpn0.m112919b(100019);
        hfw.m130790a("EnterRoomChecker", "isInterceptStartVoiceLives");
        return MomentAllowForwardState.allow.equals(strM112919b);
    }

    /* JADX INFO: renamed from: i */
    public static void m116506i(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        AudienceStartData audienceStartDataM67611u = AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2).m67603N(z).m67597H("type_voice_live").m67607R(str5).m67608S(str6).m67610U(str4).m67601L(str3).m67611u();
        if (audienceStartDataM67611u.isQuickEnterRtc() && s9s.f163228b.m195976w7()) {
            hfw.m130790a("[live]voiceEntry", "rtc进房优化，采用快速加入rtc方案进房");
        }
        Intent intentM134373f = s9s.f163232f.m134373f(context, audienceStartDataM67611u);
        if (m116501d(intentM134373f)) {
            context.startActivity(intentM134373f);
        }
    }
}
