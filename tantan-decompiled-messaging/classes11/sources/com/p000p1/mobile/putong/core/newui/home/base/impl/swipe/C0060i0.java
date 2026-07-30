package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.card.VSwipeStack;
import l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0060i0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public int f868g;

    /* JADX INFO: renamed from: h */
    public long[] f869h;

    /* JADX INFO: renamed from: i */
    public int f870i;

    public C0060i0() {
        int i = upa.g1().enable ? upa.g1().countPerSecond : 0;
        this.f868g = i;
        this.f869h = new long[i];
        this.f870i = 0;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!upa.g1().enable) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f870i;
        int i2 = i + 1;
        int i3 = this.f868g;
        if (i2 >= i3) {
            i2 = 0;
        }
        long[] jArr = this.f869h;
        if (jCurrentTimeMillis - jArr[i2] < 1000) {
            return true;
        }
        jArr[i] = jCurrentTimeMillis;
        int i4 = i + 1;
        this.f870i = i4;
        if (i4 >= i3) {
            this.f870i = 0;
        }
        return false;
    }
}
