package p149l;

import android.text.TextUtils;
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
public class w9u {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m202351a(q4s q4sVar, q4s q4sVar2) {
        return q4sVar.localRowIndex - q4sVar2.localRowIndex;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ wur.C20965a m202352b(LiveBannerTabBean liveBannerTabBean) {
        wur.C20965a c20965a = new wur.C20965a();
        c20965a.m205664f(liveBannerTabBean.bannerMedia.bannerUrl);
        c20965a.m205665g(liveBannerTabBean.title);
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(1);
        liveGoAction.setGoData(liveBannerTabBean.jumpUrl);
        c20965a.m205663e(liveGoAction);
        return c20965a;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<q4s> m202353c(o3u o3uVar, LiveSquareTabBean liveSquareTabBean) {
        ArrayList<q4s> arrayList = new ArrayList<>();
        List<BLiveSuggestLive> list = o3uVar.f141710d;
        boolean z = list != null && list.size() > 0;
        for (int i = 0; i < o3uVar.f169071a.size(); i++) {
            BLiveSuggestLive bLiveSuggestLive = o3uVar.f169071a.get(i);
            int i2 = (z ? 4 : 1) + i;
            if (TextUtils.equals(liveSquareTabBean.getPageId(), "p_live_nearby")) {
                q4s q4sVarM207516a = x9u.m207516a(1004);
                awu awuVar = new awu();
                awuVar.live = bLiveSuggestLive;
                x9u.m207517b(3, awuVar, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar, i2, liveSquareTabBean.getPageId());
                q4sVarM207516a.m172973v(awuVar);
                arrayList.add(q4sVarM207516a);
            } else if (TextUtils.equals(bLiveSuggestLive.liveType, "videoChat")) {
                q4s q4sVarM207516a2 = x9u.m207516a(1003);
                awu awuVar2 = new awu();
                awuVar2.live = bLiveSuggestLive;
                x9u.m207517b(4, awuVar2, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar2, i2, liveSquareTabBean.getPageId());
                q4sVarM207516a2.m172973v(awuVar2);
                arrayList.add(q4sVarM207516a2);
            } else {
                q4s q4sVarM207516a3 = x9u.m207516a(1002);
                awu awuVar3 = new awu();
                awuVar3.live = bLiveSuggestLive;
                x9u.m207517b(3, awuVar3, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar3, i2, liveSquareTabBean.getPageId());
                q4sVarM207516a3.m172973v(awuVar3);
                arrayList.add(q4sVarM207516a3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            q4s q4sVarM207516a4 = x9u.m207516a(1001);
            ddu dduVar = new ddu();
            List<BLiveSuggestLive> list2 = o3uVar.f141710d;
            if (list2.size() > 0) {
                awu awuVar4 = new awu();
                awuVar4.live = list2.get(0);
                x9u.m207517b(3, awuVar4, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar4, 1, liveSquareTabBean.getPageId());
                awuVar4.m99326b().put("window_type", "big_tv");
                dduVar.m111064d(awuVar4);
            }
            if (list2.size() > 1) {
                awu awuVar5 = new awu();
                awuVar5.live = list2.get(1);
                x9u.m207517b(3, awuVar5, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar5, 2, liveSquareTabBean.getPageId());
                dduVar.m111065e(awuVar5);
            }
            if (list2.size() > 2) {
                awu awuVar6 = new awu();
                awuVar6.live = list2.get(2);
                x9u.m207517b(3, awuVar6, liveSquareTabBean.getRequestName());
                x9u.m207518c(awuVar6, 3, liveSquareTabBean.getPageId());
                dduVar.m111066f(awuVar6);
            }
            q4sVarM207516a4.m172972u(dduVar);
            q4sVarM207516a4.localRowIndex = 1;
            arrayList2.add(q4sVarM207516a4);
        }
        for (LiveSquareBannerBean liveSquareBannerBean : o3uVar.f141709c) {
            if (!vwb.m200296J(liveSquareBannerBean.tabs)) {
                q4s q4sVarM207516a5 = x9u.m207516a(1);
                wur wurVar = new wur();
                wurVar.m205658e(vwb.m200303Q(liveSquareBannerBean.tabs, new w9j() { // from class: l.u9u
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return w9u.m202352b((LiveBannerTabBean) obj);
                    }
                }));
                q4sVarM207516a5.m172968q(wurVar);
                int i3 = liveSquareBannerBean.rowIndex;
                if (i3 == 0) {
                    i3 = 1;
                }
                q4sVarM207516a5.localRowIndex = i3;
                arrayList2.add(q4sVarM207516a5);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.v9u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w9u.m202351a((q4s) obj, (q4s) obj2);
            }
        });
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            q4s q4sVar = (q4s) arrayList2.get(i5);
            int i6 = ((q4sVar.localRowIndex - 1) * 2) - i4;
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 >= arrayList.size()) {
                arrayList.add(q4sVar);
            } else {
                arrayList.add(i6, q4sVar);
            }
            i4++;
        }
        return arrayList;
    }
}
