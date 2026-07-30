package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class k9o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m145101a(BLiveEnvelope bLiveEnvelope) {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboardNew_ = bLiveEnvelope.data.giftLeaderboard;
        if (bLiveIntlGiftLeaderboardNew_ == null) {
            bLiveIntlGiftLeaderboardNew_ = BLiveIntlGiftLeaderboard.new_();
        }
        ((ggv) ypv.m215673l(fld0.f98148c)).f102558s.m132487l(bLiveIntlGiftLeaderboardNew_);
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<Boolean> m145107g() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/familyShare/users/me")), "familyChatShareEnable").map(new w9j() { // from class: l.g9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        }).map(new w9j() { // from class: l.h9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveData) obj).family.f44388id));
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<BLiveIntlFamilyShareInfo> m145108h(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/familyShare/sharePane/me")).m107524p().m107536c("liveType", str).m107536c("liveId", str2).m107537d(), "getFamilyInfo_" + str2).map(new w9j() { // from class: l.i9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyShareInfo;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<BLiveEnvelope> m145109i(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str + "/share-users")), "getFriendListInLive_" + str);
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveIntlGiftLeaderboard> m145110j() {
        return ((ggv) ypv.m215673l(fld0.f98148c)).f102558s.asObservable().onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveEnvelope> m145111k(String str, List<String> list) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/rooms/" + str + "/share-users")).m107524p().m107537d();
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
        return upv.m194928p(cllVarM107537d, "live_postSelectedShareItem" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: l */
    public static void m145112l(String str, String str2) {
        upv.m194935w(cll.m107499l(ytr.m216073b("/live/gift-leaderboard/current")).m107524p().m107536c("anchorId", str).m107536c("liveType", str2).m107537d(), "requestGiftStarBoard").subscribe(ffw.m121194e(new e30() { // from class: l.e9o
            @Override // p149l.e30
            public final void call(Object obj) {
                k9o.m145101a((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.f9o
            @Override // p149l.e30
            public final void call(Object obj) {
                ((ggv) ypv.m215673l(fld0.f98148c)).f102558s.m132487l(BLiveIntlGiftLeaderboard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<roj0> m145113m(String str, String str2, String str3) {
        String string;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/familyShare/" + str3));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareType", str);
            jSONObject.put("roomId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            string = "";
        }
        return upv.m194928p(cllVarM107499l, "toShareFamily_" + str2 + str3, string).map(new w9j() { // from class: l.j9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
