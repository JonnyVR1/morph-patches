package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l8o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ wur.C20965a m148943a(LiveBannerTabBean liveBannerTabBean) {
        wur.C20965a c20965a = new wur.C20965a();
        c20965a.m205664f(liveBannerTabBean.bannerMedia.bannerUrl);
        c20965a.m205665g(liveBannerTabBean.title);
        c20965a.m205667i(liveBannerTabBean.bannerType);
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(1);
        liveGoAction.setGoData(liveBannerTabBean.jumpUrl);
        c20965a.m205663e(liveGoAction);
        return c20965a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m148944b(q4s q4sVar, q4s q4sVar2) {
        return q4sVar.localRowIndex - q4sVar2.localRowIndex;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<q4s> m148945c(o3u o3uVar, LiveSquareTabBean liveSquareTabBean) {
        ArrayList<q4s> arrayList = new ArrayList<>();
        int i = 0;
        while (i < o3uVar.f169071a.size()) {
            BLiveSuggestLive bLiveSuggestLive = o3uVar.f169071a.get(i);
            i++;
            if (TextUtils.equals(liveSquareTabBean.getRequestName(), "square-nearby")) {
                q4s q4sVarM207516a = x9u.m207516a(3007);
                awu awuVar = new awu();
                awuVar.live = bLiveSuggestLive;
                x9u.m207517b(3, awuVar, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar, i, liveSquareTabBean.getPageId());
                q4sVarM207516a.m172973v(awuVar);
                arrayList.add(q4sVarM207516a);
            } else {
                q4s q4sVarM207516a2 = x9u.m207516a(3006);
                awu awuVar2 = new awu();
                awuVar2.live = bLiveSuggestLive;
                x9u.m207517b(3, awuVar2, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar2, i, liveSquareTabBean.getPageId());
                q4sVarM207516a2.m172973v(awuVar2);
                arrayList.add(q4sVarM207516a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (LiveSquareBannerBean liveSquareBannerBean : o3uVar.f141709c) {
            if (!vwb.m200296J(liveSquareBannerBean.tabs)) {
                q4s q4sVarM207516a3 = x9u.m207516a(1);
                wur wurVar = new wur();
                wurVar.m205657d(liveSquareBannerBean.f46221id);
                wurVar.m205656c(liveSquareBannerBean.type);
                wurVar.localAutoScroll = true;
                wurVar.m205658e(vwb.m200303Q(liveSquareBannerBean.tabs, new w9j() { // from class: l.j8o
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return l8o.m148943a((LiveBannerTabBean) obj);
                    }
                }));
                q4sVarM207516a3.m172968q(wurVar);
                q4sVarM207516a3.localRowIndex = liveSquareBannerBean.rowIndex;
                arrayList2.add(q4sVarM207516a3);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.k8o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l8o.m148944b((q4s) obj, (q4s) obj2);
            }
        });
        m148948f(arrayList, arrayList2, liveSquareTabBean.getPageId());
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m148946d(q4s q4sVar) {
        return (q4sVar.m172955d() != 3006 && q4sVar.m172955d() == 1) ? 6 : 3;
    }

    /* JADX INFO: renamed from: e */
    public static int m148947e(q4s q4sVar, int i, boolean z, List<q4s> list) {
        if (i == 0) {
            list.add(0, q4sVar);
            return 0;
        }
        int iM148946d = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM148946d += m148946d(list.get(i2));
            if (iM148946d >= i * 6) {
                int i3 = i2 + 1;
                list.add(i3, q4sVar);
                return i3;
            }
        }
        if (z && iM148946d % 6 != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iM148946d -= m148946d(list.get(size));
                list.remove(size);
                if (iM148946d % 6 == 0) {
                    break;
                }
            }
        }
        list.add(q4sVar);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m148948f(List<q4s> list, List<q4s> list2, String str) {
        for (int i = 0; i < list2.size(); i++) {
            q4s q4sVar = list2.get(i);
            int iM148947e = m148947e(q4sVar, q4sVar.localRowIndex, false, list);
            wur wurVarM172953b = q4sVar.m172953b();
            if (wurVarM172953b != null) {
                int i2 = 0;
                while (i2 < wurVarM172953b.m205655b().size()) {
                    wur.C20965a c20965a = wurVarM172953b.m205655b().get(i2);
                    LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
                    liveCardTrackData.setModuleId("e_live_banner");
                    liveCardTrackData.setPageId(str);
                    liveCardTrackData.put("banner_id", wurVarM172953b.m205654a());
                    liveCardTrackData.put("banner_type", c20965a.m205662d());
                    liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(iM148947e + 1));
                    i2++;
                    liveCardTrackData.put("sub_index", Integer.valueOf(i2));
                    c20965a.m205666h(liveCardTrackData);
                }
            }
        }
    }
}
