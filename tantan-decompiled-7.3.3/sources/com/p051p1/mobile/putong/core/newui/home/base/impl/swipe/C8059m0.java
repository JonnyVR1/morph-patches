package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.OMSEventId;
import com.p051p1.mobile.putong.data.OMSPosition;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import p153l.byd0;
import p153l.c6w;
import p153l.hve0;
import p153l.pk50;
import p153l.pzi0;
import p153l.qxv;
import p153l.spl0;
import p153l.tzi0;
import p153l.uqb0;
import p153l.x20;
import p153l.xxv;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8059m0 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f22849j;

    /* JADX INFO: renamed from: k */
    public int f22850k;

    public C8059m0(String str, boolean z) {
        super(str, z);
        this.f22849j = new byd0("lost_location_notify_dlg", 0L);
        this.f22850k = 0;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo38503q(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo38505s(final C8049j.a aVar) {
        int i;
        SwipeDirection swipeDirection = aVar.f22839d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || (i = this.f22850k) >= 5) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        this.f22850k = i + 1;
        if (spl0.m187399y()) {
            if (hve0.m137320v()) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!uqb0.f180403i0.m218282a(pk50.m172568j().m172574f().m181661Y(this.f22792g, OMSEventId.get(OMSEventId.e_swipe_before).name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        } else {
            if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && (!qxv.m178618c() || xxv.m213588o())) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (!tzi0.m193670h(pzi0.m174454o(), this.f22849j.get().longValue(), 4)) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
            if (this.f22850k != 5) {
                return SwipeDialogOmsLimitStrategy.HandleState.refuse;
            }
        }
        aVar.f22842g = true;
        c6w.m108186j(aVar.f22837b.act(), new x20() { // from class: l.jkh0
            @Override // p153l.x20
            public final void call() {
                aVar.f22837b.m38369v2().m101919K8();
            }
        }, new x20() { // from class: l.kkh0
            @Override // p153l.x20
            public final void call() {
                this.f127197a.m38693v();
            }
        }, true, false, this.f22792g);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m38693v() {
        this.f22849j.put(Long.valueOf(pzi0.m174454o()));
    }
}
