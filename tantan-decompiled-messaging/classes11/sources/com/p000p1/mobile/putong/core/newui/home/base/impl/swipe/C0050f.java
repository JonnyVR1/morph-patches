package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import l.tpd0;
import l.upa;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0050f extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public int f855g = 0;

    /* JADX INFO: renamed from: h */
    public int f856h = upa.b3().continuous_left_sliding_bubble;

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (aVar.f875d != SwipeDirection.LEFT) {
            this.f855g = 0;
        } else {
            if (((Integer) CoreModule.c.e0.O5.get()).intValue() >= 2) {
                return false;
            }
            long jM18550o = (mqi0.m18550o() / 1000) - ((Long) CoreModule.c.e0.P5.get()).longValue();
            if (jM18550o > 0 && jM18550o < 86400) {
                return false;
            }
            CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
            if (justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f855g = 0;
            } else {
                this.f855g++;
            }
        }
        int i = this.f855g;
        int i2 = this.f856h;
        if (i == i2 && i2 != 0) {
            CoreModule.c.e0.P5.put(Long.valueOf(mqi0.m18550o() / 1000));
            tpd0 tpd0Var = CoreModule.c.e0.O5;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            aVar.f873b.m1284k6();
        }
        return false;
    }
}
