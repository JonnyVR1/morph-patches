package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import p149l.mqi0;
import p149l.tpd0;
import p149l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f */
/* JADX INFO: loaded from: classes11.dex */
public class C7886f extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public int f22077g = 0;

    /* JADX INFO: renamed from: h */
    public int f22078h = upa.m194731b3().continuous_left_sliding_bubble;

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (aVar.f22097d != SwipeDirection.LEFT) {
            this.f22077g = 0;
        } else {
            if (CoreModule.f17545c.f19639e0.f149236O5.get().intValue() >= 2) {
                return false;
            }
            long jM155944o = (mqi0.m155944o() / 1000) - CoreModule.f17545c.f19639e0.f149243P5.get().longValue();
            if (jM155944o > 0 && jM155944o < 86400) {
                return false;
            }
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
            if (justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f22077g = 0;
            } else {
                this.f22077g++;
            }
        }
        int i = this.f22077g;
        int i2 = this.f22078h;
        if (i == i2 && i2 != 0) {
            CoreModule.f17545c.f19639e0.f149243P5.put(Long.valueOf(mqi0.m155944o() / 1000));
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149236O5;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            aVar.f22095b.m37315k6();
        }
        return false;
    }
}
