package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.OMSEventId;
import com.p1.mobile.putong.data.OMSPosition;
import l.d30;
import l.ogl0;
import l.pvv;
import l.qib0;
import l.qqi0;
import l.wvv;
import l.zpd0;
import p009l.ane0;
import p009l.e4w;
import p009l.ic50;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0072m0 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f885j;

    /* JADX INFO: renamed from: k */
    public int f886k;

    public C0072m0(String str, boolean z) {
        super(str, z);
        this.f885j = new zpd0("lost_location_notify_dlg", 0L);
        this.f886k = 0;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo1471q(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo1473s(final C0062j.a aVar) {
        int i;
        SwipeDirection swipeDirection = aVar.f875d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || (i = this.f886k) >= 5) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        this.f886k = i + 1;
        if (ogl0.y()) {
            if (ane0.m11525v()) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!qib0.i0.a(ic50.m16316j().m16322f().m17404Y(this.f828g, OMSEventId.get("e_swipe_before").name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        } else {
            if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && (!pvv.c() || wvv.o())) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!qqi0.h(mqi0.m18550o(), ((Long) this.f885j.get()).longValue(), 4)) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (this.f886k != 5) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        }
        aVar.f878g = true;
        e4w.m13730j(aVar.f873b.act(), new d30() { // from class: l.bch0
            public final void call() {
                aVar.f873b.m1335v2().m19329K8();
            }
        }, new d30() { // from class: l.cch0
            public final void call() {
                this.f10514a.m1661v();
            }
        }, true, false, this.f828g);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1661v() {
        this.f885j.put(Long.valueOf(mqi0.m18550o()));
    }
}
