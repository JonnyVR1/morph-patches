package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import p149l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7896i0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public int f22090g;

    /* JADX INFO: renamed from: h */
    public long[] f22091h;

    /* JADX INFO: renamed from: i */
    public int f22092i;

    public C7896i0() {
        int i = upa.m194754g1().enable ? upa.m194754g1().countPerSecond : 0;
        this.f22090g = i;
        this.f22091h = new long[i];
        this.f22092i = 0;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!upa.m194754g1().enable) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f22092i;
        int i2 = i + 1;
        int i3 = this.f22090g;
        if (i2 >= i3) {
            i2 = 0;
        }
        long[] jArr = this.f22091h;
        if (jCurrentTimeMillis - jArr[i2] < 1000) {
            return true;
        }
        jArr[i] = jCurrentTimeMillis;
        int i4 = i + 1;
        this.f22092i = i4;
        if (i4 >= i3) {
            this.f22092i = 0;
        }
        return false;
    }
}
