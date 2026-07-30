package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class n4o0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m161572d(BLiveEnvelope bLiveEnvelope) {
        final BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = bLiveEnvelope.data.backGroundPicSetting;
        final String str = bLiveVoiceBackGroundPicSetting.currentId;
        jyb.m147537z(bLiveVoiceBackGroundPicSetting.backGroundPics, new y20() { // from class: l.l4o0
            @Override // p153l.y20
            public final void call(Object obj) {
                n4o0.m161573e(bLiveVoiceBackGroundPicSetting, str, (BLiveVoiceBackGroundPics) obj);
            }
        });
        return bLiveVoiceBackGroundPicSetting.backGroundPics;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m161573e(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (TextUtils.isEmpty(bLiveVoiceBackGroundPicSetting.currentId) || !str.equals(bLiveVoiceBackGroundPics.f45331id)) {
            bLiveVoiceBackGroundPics.check = false;
        } else {
            bLiveVoiceBackGroundPics.check = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<List<BLiveVoiceBackGroundPics>> m161576h(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/voice-rooms/" + str + "/settingBackGroundPics")).m182288p();
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("source", str2);
        }
        return vrv.m202562w(c19886aM182288p.m182301d(), "getRoomSettingBackgroundPics").map(new qcj() { // from class: l.k4o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n4o0.m161572d((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m161577i(final Act act) {
        vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-rooms/-1/settingBackGroundPics")).m182288p().m182301d(), "getRoomSettingBackgroundPicsWithPreLoad").map(new qcj() { // from class: l.g4o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.backGroundPicSetting.backGroundPics;
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.h4o0
            @Override // p153l.y20
            public final void call(Object obj) {
                rcu.m180826d(act, jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.i4o0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((BLiveVoiceBackGroundPics) obj2).picType.equals("svga"));
                    }
                }), new qcj() { // from class: l.j4o0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ((BLiveVoiceBackGroundPics) obj2).url;
                    }
                }));
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveVoiceRoom> m161578j(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backGroundPicId", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-rooms/" + str)).m182288p().m182300c("fields", "backGroundPicId").m182301d(), "requestChangeRoomBackground", jSONObject.toString()).map(new qcj() { // from class: l.m4o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceRooms.get(0);
            }
        });
    }
}
