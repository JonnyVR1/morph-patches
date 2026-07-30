package p153l;

import android.text.TextUtils;
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
public class xbu {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m210003a(r6s r6sVar, r6s r6sVar2) {
        return r6sVar.localRowIndex - r6sVar2.localRowIndex;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xwr.C21468a m210004b(LiveBannerTabBean liveBannerTabBean) {
        xwr.C21468a c21468a = new xwr.C21468a();
        c21468a.m213432f(liveBannerTabBean.bannerMedia.bannerUrl);
        c21468a.m213433g(liveBannerTabBean.title);
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(1);
        liveGoAction.setGoData(liveBannerTabBean.jumpUrl);
        c21468a.m213431e(liveGoAction);
        return c21468a;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<r6s> m210005c(p5u p5uVar, LiveSquareTabBean liveSquareTabBean) {
        ArrayList<r6s> arrayList = new ArrayList<>();
        List<BLiveSuggestLive> list = p5uVar.f150694d;
        boolean z = list != null && list.size() > 0;
        for (int i = 0; i < p5uVar.f178357a.size(); i++) {
            BLiveSuggestLive bLiveSuggestLive = p5uVar.f178357a.get(i);
            int i2 = (z ? 4 : 1) + i;
            if (TextUtils.equals(liveSquareTabBean.getPageId(), "p_live_nearby")) {
                r6s r6sVarM215110a = ybu.m215110a(1004);
                byu byuVar = new byu();
                byuVar.live = bLiveSuggestLive;
                ybu.m215111b(3, byuVar, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar, i2, liveSquareTabBean.getPageId());
                r6sVarM215110a.m180038v(byuVar);
                arrayList.add(r6sVarM215110a);
            } else if (TextUtils.equals(bLiveSuggestLive.liveType, "videoChat")) {
                r6s r6sVarM215110a2 = ybu.m215110a(1003);
                byu byuVar2 = new byu();
                byuVar2.live = bLiveSuggestLive;
                ybu.m215111b(4, byuVar2, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar2, i2, liveSquareTabBean.getPageId());
                r6sVarM215110a2.m180038v(byuVar2);
                arrayList.add(r6sVarM215110a2);
            } else {
                r6s r6sVarM215110a3 = ybu.m215110a(1002);
                byu byuVar3 = new byu();
                byuVar3.live = bLiveSuggestLive;
                ybu.m215111b(3, byuVar3, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar3, i2, liveSquareTabBean.getPageId());
                r6sVarM215110a3.m180038v(byuVar3);
                arrayList.add(r6sVarM215110a3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            r6s r6sVarM215110a4 = ybu.m215110a(1001);
            efu efuVar = new efu();
            List<BLiveSuggestLive> list2 = p5uVar.f150694d;
            if (list2.size() > 0) {
                byu byuVar4 = new byu();
                byuVar4.live = list2.get(0);
                ybu.m215111b(3, byuVar4, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar4, 1, liveSquareTabBean.getPageId());
                byuVar4.m107080b().put("window_type", "big_tv");
                efuVar.m120720d(byuVar4);
            }
            if (list2.size() > 1) {
                byu byuVar5 = new byu();
                byuVar5.live = list2.get(1);
                ybu.m215111b(3, byuVar5, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar5, 2, liveSquareTabBean.getPageId());
                efuVar.m120721e(byuVar5);
            }
            if (list2.size() > 2) {
                byu byuVar6 = new byu();
                byuVar6.live = list2.get(2);
                ybu.m215111b(3, byuVar6, liveSquareTabBean.getRequestName());
                ybu.m215112c(byuVar6, 3, liveSquareTabBean.getPageId());
                efuVar.m120722f(byuVar6);
            }
            r6sVarM215110a4.m180037u(efuVar);
            r6sVarM215110a4.localRowIndex = 1;
            arrayList2.add(r6sVarM215110a4);
        }
        for (LiveSquareBannerBean liveSquareBannerBean : p5uVar.f150693c) {
            if (!jyb.m147479J(liveSquareBannerBean.tabs)) {
                r6s r6sVarM215110a5 = ybu.m215110a(1);
                xwr xwrVar = new xwr();
                xwrVar.m213426e(jyb.m147486Q(liveSquareBannerBean.tabs, new qcj() { // from class: l.vbu
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return xbu.m210004b((LiveBannerTabBean) obj);
                    }
                }));
                r6sVarM215110a5.m180033q(xwrVar);
                int i3 = liveSquareBannerBean.rowIndex;
                if (i3 == 0) {
                    i3 = 1;
                }
                r6sVarM215110a5.localRowIndex = i3;
                arrayList2.add(r6sVarM215110a5);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.wbu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xbu.m210003a((r6s) obj, (r6s) obj2);
            }
        });
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            r6s r6sVar = (r6s) arrayList2.get(i5);
            int i6 = ((r6sVar.localRowIndex - 1) * 2) - i4;
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 >= arrayList.size()) {
                arrayList.add(r6sVar);
            } else {
                arrayList.add(i6, r6sVar);
            }
            i4++;
        }
        return arrayList;
    }
}
