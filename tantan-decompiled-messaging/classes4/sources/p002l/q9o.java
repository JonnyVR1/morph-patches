package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.cll;
import l.e30;
import l.fld0;
import l.idv;
import l.upv;
import l.vwb;
import l.w9j;
import l.ypv;
import l.ytr;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q9o {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m21136b(BLiveEnvelope bLiveEnvelope) {
        final BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = bLiveEnvelope.data.backGroundPicSetting;
        final String str = bLiveVoiceBackGroundPicSetting.currentId;
        vwb.z(bLiveVoiceBackGroundPicSetting.backGroundPics, new e30() { // from class: l.o9o
            public final void call(Object obj) {
                q9o.m21139e(bLiveVoiceBackGroundPicSetting, str, (BLiveVoiceBackGroundPics) obj);
            }
        });
        return bLiveVoiceBackGroundPicSetting.backGroundPics;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BLiveVoiceRoom m21138d(BLiveEnvelope bLiveEnvelope) {
        return (BLiveVoiceRoom) bLiveEnvelope.data.voiceRooms.get(0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21139e(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (TextUtils.isEmpty(bLiveVoiceBackGroundPicSetting.currentId) || !str.equals(bLiveVoiceBackGroundPics.id)) {
            bLiveVoiceBackGroundPics.check = false;
        } else {
            bLiveVoiceBackGroundPics.check = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static c<BLiveEnvelope> m21140f(String str, int i, boolean z) {
        cll cllVarD = cll.l(ytr.b("/storeBackgroundPics/" + str)).p().d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gradientIndex", i);
            jSONObject.put("manual", z);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarD, "buyTheme" + str + i + z, jSONObject.toString());
    }

    /* JADX INFO: renamed from: g */
    public static c<List<BLiveVoiceBackGroundPics>> m21141g() {
        return upv.w(cll.l(ytr.b("/storeBackgroundPics/user/me")).p().d(), "getRoomSettingBackgroundPics").map(new w9j() { // from class: l.n9o
            public final Object call(Object obj) {
                return q9o.m21136b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static c<List<BLiveVoiceBackGroundPics>> m21142h() {
        return upv.w(cll.l(ytr.b("/storeBackgroundPics")).p().d(), "getVoiceThemeStore").map(new w9j() { // from class: l.m9o
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.storeBackgroundPics;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static c<BLiveVoiceRoom> m21143i(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backGroundPicId", str2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.m(cll.l(ytr.b("/voice-rooms/" + str)).p().c("fields", "backGroundPicId").d(), "requestChangeRoomBackground", jSONObject.toString()).map(new w9j() { // from class: l.p9o
            public final Object call(Object obj) {
                return q9o.m21138d((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static c<BLiveEnvelope> m21144j(String str, String str2) {
        return upv.w(LiveApiBuilder.m(ytr.b("/voice-lives/" + str + "/leaderboard")).c("roomId", str2).c("source", "voicelive").d(), "requestVoiceLeaderBoards").doOnNext(new e30() { // from class: l.l9o
            public final void call(Object obj) {
                ((idv) ypv.l(fld0.b)).l(((BLiveEnvelope) obj).data.users);
            }
        });
    }
}
