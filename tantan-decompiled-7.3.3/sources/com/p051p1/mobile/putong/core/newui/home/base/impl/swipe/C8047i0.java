package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import p153l.gra;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8047i0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public int f22832g;

    /* JADX INFO: renamed from: h */
    public long[] f22833h;

    /* JADX INFO: renamed from: i */
    public int f22834i;

    public C8047i0() {
        int i = gra.m131685g1().enable ? gra.m131685g1().countPerSecond : 0;
        this.f22832g = i;
        this.f22833h = new long[i];
        this.f22834i = 0;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!gra.m131685g1().enable) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f22834i;
        int i2 = i + 1;
        int i3 = this.f22832g;
        if (i2 >= i3) {
            i2 = 0;
        }
        long[] jArr = this.f22833h;
        if (jCurrentTimeMillis - jArr[i2] < 1000) {
            return true;
        }
        jArr[i] = jCurrentTimeMillis;
        int i4 = i + 1;
        this.f22834i = i4;
        if (i4 >= i3) {
            this.f22834i = 0;
        }
        return false;
    }
}
