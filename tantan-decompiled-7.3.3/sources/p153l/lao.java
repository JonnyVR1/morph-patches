package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class lao {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xwr.C21468a m153517a(LiveBannerTabBean liveBannerTabBean) {
        xwr.C21468a c21468a = new xwr.C21468a();
        c21468a.m213432f(liveBannerTabBean.bannerMedia.bannerUrl);
        c21468a.m213433g(liveBannerTabBean.title);
        c21468a.m213435i(liveBannerTabBean.bannerType);
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(1);
        liveGoAction.setGoData(liveBannerTabBean.jumpUrl);
        c21468a.m213431e(liveGoAction);
        return c21468a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m153518b(r6s r6sVar, r6s r6sVar2) {
        return r6sVar.localRowIndex - r6sVar2.localRowIndex;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<r6s> m153519c(p5u p5uVar, LiveSquareTabBean liveSquareTabBean) {
        ArrayList<r6s> arrayList = new ArrayList<>();
        int i = 0;
        while (i < p5uVar.f178357a.size()) {
            BLiveSuggestLive bLiveSuggestLive = p5uVar.f178357a.get(i);
            i++;
            if (TextUtils.equals(liveSquareTabBean.getRequestName(), "square-nearby")) {
                r6s r6sVarM215110a = ybu.m215110a(3007);
                byu byuVar = new byu();
                byuVar.live = bLiveSuggestLive;
                ybu.m215111b(3, byuVar, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar, i, liveSquareTabBean.getPageId());
                r6sVarM215110a.m180038v(byuVar);
                arrayList.add(r6sVarM215110a);
            } else {
                r6s r6sVarM215110a2 = ybu.m215110a(3006);
                byu byuVar2 = new byu();
                byuVar2.live = bLiveSuggestLive;
                ybu.m215111b(3, byuVar2, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar2, i, liveSquareTabBean.getPageId());
                r6sVarM215110a2.m180038v(byuVar2);
                arrayList.add(r6sVarM215110a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (LiveSquareBannerBean liveSquareBannerBean : p5uVar.f150693c) {
            if (!jyb.m147479J(liveSquareBannerBean.tabs)) {
                r6s r6sVarM215110a3 = ybu.m215110a(1);
                xwr xwrVar = new xwr();
                xwrVar.m213425d(liveSquareBannerBean.f47069id);
                xwrVar.m213424c(liveSquareBannerBean.type);
                xwrVar.localAutoScroll = true;
                xwrVar.m213426e(jyb.m147486Q(liveSquareBannerBean.tabs, new qcj() { // from class: l.jao
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lao.m153517a((LiveBannerTabBean) obj);
                    }
                }));
                r6sVarM215110a3.m180033q(xwrVar);
                r6sVarM215110a3.localRowIndex = liveSquareBannerBean.rowIndex;
                arrayList2.add(r6sVarM215110a3);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.kao
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lao.m153518b((r6s) obj, (r6s) obj2);
            }
        });
        m153522f(arrayList, arrayList2, liveSquareTabBean.getPageId());
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m153520d(r6s r6sVar) {
        return (r6sVar.m180020d() != 3006 && r6sVar.m180020d() == 1) ? 6 : 3;
    }

    /* JADX INFO: renamed from: e */
    public static int m153521e(r6s r6sVar, int i, boolean z, List<r6s> list) {
        if (i == 0) {
            list.add(0, r6sVar);
            return 0;
        }
        int iM153520d = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM153520d += m153520d(list.get(i2));
            if (iM153520d >= i * 6) {
                int i3 = i2 + 1;
                list.add(i3, r6sVar);
                return i3;
            }
        }
        if (z && iM153520d % 6 != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iM153520d -= m153520d(list.get(size));
                list.remove(size);
                if (iM153520d % 6 == 0) {
                    break;
                }
            }
        }
        list.add(r6sVar);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m153522f(List<r6s> list, List<r6s> list2, String str) {
        for (int i = 0; i < list2.size(); i++) {
            r6s r6sVar = list2.get(i);
            int iM153521e = m153521e(r6sVar, r6sVar.localRowIndex, false, list);
            xwr xwrVarM180018b = r6sVar.m180018b();
            if (xwrVarM180018b != null) {
                int i2 = 0;
                while (i2 < xwrVarM180018b.m213423b().size()) {
                    xwr.C21468a c21468a = xwrVarM180018b.m213423b().get(i2);
                    LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
                    liveCardTrackData.setModuleId("e_live_banner");
                    liveCardTrackData.setPageId(str);
                    liveCardTrackData.put("banner_id", xwrVarM180018b.m213422a());
                    liveCardTrackData.put("banner_type", c21468a.m213430d());
                    liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(iM153521e + 1));
                    i2++;
                    liveCardTrackData.put("sub_index", Integer.valueOf(i2));
                    c21468a.m213434h(liveCardTrackData);
                }
            }
        }
    }
}
