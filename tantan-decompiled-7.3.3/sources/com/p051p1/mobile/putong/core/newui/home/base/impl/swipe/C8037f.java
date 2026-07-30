package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import p153l.gra;
import p153l.pzi0;
import p153l.vxd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f */
/* JADX INFO: loaded from: classes11.dex */
public class C8037f extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public int f22819g = 0;

    /* JADX INFO: renamed from: h */
    public int f22820h = gra.m131662b3().continuous_left_sliding_bubble;

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (aVar.f22839d != SwipeDirection.LEFT) {
            this.f22819g = 0;
        } else {
            if (CoreModule.f18264c.f20381e0.f89093O5.get().intValue() >= 2) {
                return false;
            }
            long jM174454o = (pzi0.m174454o() / 1000) - CoreModule.f18264c.f20381e0.f89100P5.get().longValue();
            if (jM174454o > 0 && jM174454o < 86400) {
                return false;
            }
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
            if (justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f22819g = 0;
            } else {
                this.f22819g++;
            }
        }
        int i = this.f22819g;
        int i2 = this.f22820h;
        if (i == i2 && i2 != 0) {
            CoreModule.f18264c.f20381e0.f89100P5.put(Long.valueOf(pzi0.m174454o() / 1000));
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89093O5;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            aVar.f22837b.m38318k6();
        }
        return false;
    }
}
