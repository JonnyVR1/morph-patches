package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class jvn0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m143525d(BLiveEnvelope bLiveEnvelope) {
        final BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = bLiveEnvelope.data.backGroundPicSetting;
        final String str = bLiveVoiceBackGroundPicSetting.currentId;
        vwb.m200354z(bLiveVoiceBackGroundPicSetting.backGroundPics, new e30() { // from class: l.hvn0
            @Override // p149l.e30
            public final void call(Object obj) {
                jvn0.m143526e(bLiveVoiceBackGroundPicSetting, str, (BLiveVoiceBackGroundPics) obj);
            }
        });
        return bLiveVoiceBackGroundPicSetting.backGroundPics;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m143526e(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (TextUtils.isEmpty(bLiveVoiceBackGroundPicSetting.currentId) || !str.equals(bLiveVoiceBackGroundPics.f44483id)) {
            bLiveVoiceBackGroundPics.check = false;
        } else {
            bLiveVoiceBackGroundPics.check = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<List<BLiveVoiceBackGroundPics>> m143529h(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/voice-rooms/" + str + "/settingBackGroundPics")).m107524p();
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("source", str2);
        }
        return upv.m194935w(c16188aM107524p.m107537d(), "getRoomSettingBackgroundPics").map(new w9j() { // from class: l.gvn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jvn0.m143525d((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m143530i(final Act act) {
        upv.m194935w(cll.m107499l(ytr.m216073b("/voice-rooms/-1/settingBackGroundPics")).m107524p().m107537d(), "getRoomSettingBackgroundPicsWithPreLoad").map(new w9j() { // from class: l.cvn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.backGroundPicSetting.backGroundPics;
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.dvn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qau.m173779d(act, vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.evn0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((BLiveVoiceBackGroundPics) obj2).picType.equals("svga"));
                    }
                }), new w9j() { // from class: l.fvn0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return ((BLiveVoiceBackGroundPics) obj2).url;
                    }
                }));
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveVoiceRoom> m143531j(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backGroundPicId", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194925m(cll.m107499l(ytr.m216073b("/voice-rooms/" + str)).m107524p().m107536c("fields", "backGroundPicId").m107537d(), "requestChangeRoomBackground", jSONObject.toString()).map(new w9j() { // from class: l.ivn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }
}
