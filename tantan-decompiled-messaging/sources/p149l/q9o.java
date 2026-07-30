package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class q9o {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m173651b(BLiveEnvelope bLiveEnvelope) {
        final BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = bLiveEnvelope.data.backGroundPicSetting;
        final String str = bLiveVoiceBackGroundPicSetting.currentId;
        vwb.m200354z(bLiveVoiceBackGroundPicSetting.backGroundPics, new e30() { // from class: l.o9o
            @Override // p149l.e30
            public final void call(Object obj) {
                q9o.m173654e(bLiveVoiceBackGroundPicSetting, str, (BLiveVoiceBackGroundPics) obj);
            }
        });
        return bLiveVoiceBackGroundPicSetting.backGroundPics;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m173654e(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (TextUtils.isEmpty(bLiveVoiceBackGroundPicSetting.currentId) || !str.equals(bLiveVoiceBackGroundPics.f44483id)) {
            bLiveVoiceBackGroundPics.check = false;
        } else {
            bLiveVoiceBackGroundPics.check = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<BLiveEnvelope> m173655f(String str, int i, boolean z) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/storeBackgroundPics/" + str)).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gradientIndex", i);
            jSONObject.put("manual", z);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107537d, "buyTheme" + str + i + z, jSONObject.toString());
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<List<BLiveVoiceBackGroundPics>> m173656g() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/storeBackgroundPics/user/me")).m107524p().m107537d(), "getRoomSettingBackgroundPics").map(new w9j() { // from class: l.n9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return q9o.m173651b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<List<BLiveVoiceBackGroundPics>> m173657h() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/storeBackgroundPics")).m107524p().m107537d(), "getVoiceThemeStore").map(new w9j() { // from class: l.m9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.storeBackgroundPics;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<BLiveVoiceRoom> m173658i(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backGroundPicId", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-rooms/" + str)).m107524p().m107536c("fields", "backGroundPicId").m107537d(), "requestChangeRoomBackground", jSONObject.toString()).map(new w9j() { // from class: l.p9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveEnvelope> m173659j(String str, String str2) {
        return upv.m194935w(LiveApiBuilder.m67307m(ytr.m216073b("/voice-lives/" + str + "/leaderboard")).m107536c("roomId", str2).m107536c("source", VoiceLive.TYPE).m107537d(), "requestVoiceLeaderBoards").doOnNext(new e30() { // from class: l.l9o
            @Override // p149l.e30
            public final void call(Object obj) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135640l(((BLiveEnvelope) obj).data.users);
            }
        });
    }
}
