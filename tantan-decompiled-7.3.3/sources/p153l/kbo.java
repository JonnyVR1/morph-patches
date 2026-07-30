package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class kbo {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149064a(BLiveEnvelope bLiveEnvelope) {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboardNew_ = bLiveEnvelope.data.giftLeaderboard;
        if (bLiveIntlGiftLeaderboardNew_ == null) {
            bLiveIntlGiftLeaderboardNew_ = BLiveIntlGiftLeaderboard.new_();
        }
        ((hiv) zrv.m221194l(htd0.f111521c)).f110088s.m137019l(bLiveIntlGiftLeaderboardNew_);
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<Boolean> m149070g() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/familyShare/users/me")), "familyChatShareEnable").map(new qcj() { // from class: l.gbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        }).map(new qcj() { // from class: l.hbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveData) obj).family.f45236id));
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<BLiveIntlFamilyShareInfo> m149071h(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/familyShare/sharePane/me")).m182288p().m182300c("liveType", str).m182300c("liveId", str2).m182301d(), "getFamilyInfo_" + str2).map(new qcj() { // from class: l.ibo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyShareInfo;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<BLiveEnvelope> m149072i(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/share-users")), "getFriendListInLive_" + str);
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveIntlGiftLeaderboard> m149073j() {
        return ((hiv) zrv.m221194l(htd0.f111521c)).f110088s.asObservable().onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveEnvelope> m149074k(String str, List<String> list) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/rooms/" + str + "/share-users")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("userIds", jSONArray);
        } catch (JSONException unused) {
        }
        return vrv.m202555p(rnlVarM182301d, "live_postSelectedShareItem" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: l */
    public static void m149075l(String str, String str2) {
        vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/gift-leaderboard/current")).m182288p().m182300c("anchorId", str).m182300c("liveType", str2).m182301d(), "requestGiftStarBoard").subscribe(dhw.m115826e(new y20() { // from class: l.ebo
            @Override // p153l.y20
            public final void call(Object obj) {
                kbo.m149064a((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.fbo
            @Override // p153l.y20
            public final void call(Object obj) {
                ((hiv) zrv.m221194l(htd0.f111521c)).f110088s.m137019l(BLiveIntlGiftLeaderboard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<uxj0> m149076m(String str, String str2, String str3) {
        String string;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/familyShare/" + str3));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareType", str);
            jSONObject.put("roomId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            string = "";
        }
        return vrv.m202555p(rnlVarM182263l, "toShareFamily_" + str2 + str3, string).map(new qcj() { // from class: l.jbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
