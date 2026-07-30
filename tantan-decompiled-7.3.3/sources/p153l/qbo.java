package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class qbo {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m176058b(BLiveEnvelope bLiveEnvelope) {
        final BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = bLiveEnvelope.data.backGroundPicSetting;
        final String str = bLiveVoiceBackGroundPicSetting.currentId;
        jyb.m147537z(bLiveVoiceBackGroundPicSetting.backGroundPics, new y20() { // from class: l.obo
            @Override // p153l.y20
            public final void call(Object obj) {
                qbo.m176061e(bLiveVoiceBackGroundPicSetting, str, (BLiveVoiceBackGroundPics) obj);
            }
        });
        return bLiveVoiceBackGroundPicSetting.backGroundPics;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m176061e(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (TextUtils.isEmpty(bLiveVoiceBackGroundPicSetting.currentId) || !str.equals(bLiveVoiceBackGroundPics.f45331id)) {
            bLiveVoiceBackGroundPics.check = false;
        } else {
            bLiveVoiceBackGroundPics.check = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<BLiveEnvelope> m176062f(String str, int i, boolean z) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/storeBackgroundPics/" + str)).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gradientIndex", i);
            jSONObject.put("manual", z);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182301d, "buyTheme" + str + i + z, jSONObject.toString());
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<List<BLiveVoiceBackGroundPics>> m176063g() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/storeBackgroundPics/user/me")).m182288p().m182301d(), "getRoomSettingBackgroundPics").map(new qcj() { // from class: l.nbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qbo.m176058b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<List<BLiveVoiceBackGroundPics>> m176064h() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/storeBackgroundPics")).m182288p().m182301d(), "getVoiceThemeStore").map(new qcj() { // from class: l.mbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.storeBackgroundPics;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<BLiveVoiceRoom> m176065i(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backGroundPicId", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str)).m182288p().m182300c("fields", "backGroundPicId").m182301d(), "requestChangeRoomBackground", jSONObject.toString()).map(new qcj() { // from class: l.pbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveEnvelope> m176066j(String str, String str2) {
        return vrv.m202562w(LiveApiBuilder.m68490m(zvr.m221802b("/voice-lives/" + str + "/leaderboard")).m182300c("roomId", str2).m182300c("source", VoiceLive.TYPE).m182301d(), "requestVoiceLeaderBoards").doOnNext(new y20() { // from class: l.lbo
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144725l(((BLiveEnvelope) obj).data.users);
            }
        });
    }
}
