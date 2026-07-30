package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import p153l.al80;
import p153l.cl80;
import p153l.czf0;
import p153l.gra;
import p153l.pzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i */
/* JADX INFO: loaded from: classes11.dex */
public class C8046i extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public boolean f22831g = false;

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigM131680f1;
        if (CoreModule.f18264c.f20381e0.m116600p9().age.intValue() < 40 && !CoreModule.f18264c.f20381e0.m116600p9().isBannedNew() && !CoreModule.f18264c.f20381e0.m116600p9().isBanned() && !CoreModule.f18264c.f20381e0.m116600p9().isFakeUser() && (springFestivalMarriageActivitiesConfigM131680f1 = gra.m131680f1()) != null && CoreModule.f18264c.f20381e0.f89312q4.get().intValue() != springFestivalMarriageActivitiesConfigM131680f1.version && !this.f22831g && CoreModule.f18264c.f20404l2.m109523a3(pzi0.m174454o()) >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            NewMainAct newMainActAct = aVar.f22837b.act();
            if (NullChecker.m82486a(newMainActAct)) {
                czf0 czf0Var = new czf0(newMainActAct);
                if (C4522a.m22099p().m22107I()) {
                    C4522a.m22099p().m22102C(CorePopLevel.MARRYSPRINGFESTIVAL, newMainActAct, czf0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    cl80.m110426e().m110439q(al80.m98641a(czf0Var));
                }
                this.f22831g = true;
            }
        }
        return false;
    }
}
