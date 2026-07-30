package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import l.cll;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.jo0;
import l.roj0;
import l.upv;
import l.w9j;
import l.ypv;
import l.ytr;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k9o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16571a(BLiveEnvelope bLiveEnvelope) {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboardNew_ = bLiveEnvelope.data.giftLeaderboard;
        if (bLiveIntlGiftLeaderboardNew_ == null) {
            bLiveIntlGiftLeaderboardNew_ = BLiveIntlGiftLeaderboard.new_();
        }
        ((ggv) ypv.l(fld0.c)).s.onNext(bLiveIntlGiftLeaderboardNew_);
    }

    /* JADX INFO: renamed from: g */
    public static c<Boolean> m16577g() {
        return upv.w(cll.l(ytr.b("/familyShare/users/me")), "familyChatShareEnable").map(new w9j() { // from class: l.g9o
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        }).map(new w9j() { // from class: l.h9o
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((BLiveData) obj).family.id));
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static c<BLiveIntlFamilyShareInfo> m16578h(String str, String str2) {
        return upv.w(cll.l(ytr.b("/familyShare/sharePane/me")).p().c("liveType", str).c("liveId", str2).d(), "getFamilyInfo_" + str2).map(new w9j() { // from class: l.i9o
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyShareInfo;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static c<BLiveEnvelope> m16579i(String str) {
        return upv.w(cll.l(ytr.b("/rooms/" + str + "/share-users")), "getFriendListInLive_" + str);
    }

    /* JADX INFO: renamed from: j */
    public static c<BLiveIntlGiftLeaderboard> m16580j() {
        return ((ggv) ypv.l(fld0.c)).s.asObservable().onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: k */
    public static c<BLiveEnvelope> m16581k(String str, List<String> list) {
        cll cllVarD = cll.l(ytr.b("/rooms/" + str + "/share-users")).p().d();
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
        return upv.p(cllVarD, "live_postSelectedShareItem" + str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: l */
    public static void m16582l(String str, String str2) {
        upv.w(cll.l(ytr.b("/live/gift-leaderboard/current")).p().c("anchorId", str).c("liveType", str2).d(), "requestGiftStarBoard").subscribe(ffw.e(new e30() { // from class: l.e9o
            public final void call(Object obj) {
                k9o.m16571a((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.f9o
            public final void call(Object obj) {
                ((ggv) ypv.l(fld0.c)).s.onNext(BLiveIntlGiftLeaderboard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static c<roj0> m16583m(String str, String str2, String str3) {
        String string;
        cll cllVarL = cll.l(ytr.b("/familyShare/" + str3));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareType", str);
            jSONObject.put("roomId", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            string = "";
        }
        return upv.p(cllVarL, "toShareFamily_" + str2 + str3, string).map(new w9j() { // from class: l.j9o
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }
}
