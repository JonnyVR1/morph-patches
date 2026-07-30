package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.OMSEventId;
import com.p046p1.mobile.putong.data.OMSPosition;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import p149l.ane0;
import p149l.d30;
import p149l.e4w;
import p149l.ic50;
import p149l.mqi0;
import p149l.ogl0;
import p149l.pvv;
import p149l.qib0;
import p149l.qqi0;
import p149l.wvv;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7908m0 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f22107j;

    /* JADX INFO: renamed from: k */
    public int f22108k;

    public C7908m0(String str, boolean z) {
        super(str, z);
        this.f22107j = new zpd0("lost_location_notify_dlg", 0L);
        this.f22108k = 0;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo37500q(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo37502s(final C7898j.a aVar) {
        int i;
        SwipeDirection swipeDirection = aVar.f22097d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || (i = this.f22108k) >= 5) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        this.f22108k = i + 1;
        if (ogl0.m164272y()) {
            if (ane0.m97750v()) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!qib0.f154720i0.m196493a(ic50.m135327j().m135333f().m145238Y(this.f22050g, OMSEventId.get(OMSEventId.e_swipe_before).name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        } else {
            if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && (!pvv.m171693c() || wvv.m205775o())) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!qqi0.m175940h(mqi0.m155944o(), this.f22107j.get().longValue(), 4)) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (this.f22108k != 5) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        }
        aVar.f22100g = true;
        e4w.m114722j(aVar.f22095b.act(), new d30() { // from class: l.bch0
            @Override // p149l.d30
            public final void call() {
                aVar.f22095b.m37366v2().m161125K8();
            }
        }, new d30() { // from class: l.cch0
            @Override // p149l.d30
            public final void call() {
                this.f80242a.m37690v();
            }
        }, true, false, this.f22050g);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m37690v() {
        this.f22107j.put(Long.valueOf(mqi0.m155944o()));
    }
}
