package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import p149l.mqi0;
import p149l.tqf0;
import p149l.uc80;
import p149l.upa;
import p149l.wc80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i */
/* JADX INFO: loaded from: classes11.dex */
public class C7895i extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public boolean f22089g = false;

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigM194749f1;
        if (CoreModule.f17545c.f19639e0.m169527p9().age.intValue() < 40 && !CoreModule.f17545c.f19639e0.m169527p9().isBannedNew() && !CoreModule.f17545c.f19639e0.m169527p9().isBanned() && !CoreModule.f17545c.f19639e0.m169527p9().isFakeUser() && (springFestivalMarriageActivitiesConfigM194749f1 = upa.m194749f1()) != null && CoreModule.f17545c.f19639e0.f149455q4.get().intValue() != springFestivalMarriageActivitiesConfigM194749f1.version && !this.f22089g && CoreModule.f17545c.f19662l2.m214215a3(mqi0.m155944o()) >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            NewMainAct newMainActAct = aVar.f22095b.act();
            if (NullChecker.m81303a(newMainActAct)) {
                tqf0 tqf0Var = new tqf0(newMainActAct);
                if (C4371a.m21100p().m21108I()) {
                    C4371a.m21100p().m21103C(CorePopLevel.MARRYSPRINGFESTIVAL, newMainActAct, tqf0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    wc80.m202636e().m202649q(uc80.m192995a(tqf0Var));
                }
                this.f22089g = true;
            }
        }
        return false;
    }
}
