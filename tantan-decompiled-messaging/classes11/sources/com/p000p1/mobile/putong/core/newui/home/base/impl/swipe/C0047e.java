package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import l.e51;
import l.n2l;
import l.uc80;
import l.upa;
import l.wc80;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0047e extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public int f848g = 0;

    /* JADX INFO: renamed from: h */
    public long f849h = 0;

    /* JADX INFO: renamed from: i */
    public int f850i = upa.f0().left_slide_guidance;

    /* JADX INFO: renamed from: j */
    public int f851j = upa.f0().right_slide_guidance;

    /* JADX INFO: renamed from: k */
    public int f852k = upa.f0().right_interval;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0062j.a f853a;

        public a(C0062j.a aVar) {
            this.f853a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f853a.f873b.m1259f6();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        int i;
        if (!((Boolean) CoreModule.c.e0.L5.get()).booleanValue() && (i = this.f850i) != 0) {
            c cVar = CoreModule.c;
            if (cVar.Y0.r == i) {
                cVar.e0.L5.put(Boolean.TRUE);
                e51.H(aVar.f873b.act(), new a(aVar), 200L);
                return false;
            }
        }
        if (!((Boolean) CoreModule.c.e0.M5.get()).booleanValue() && this.f851j != 0) {
            SwipeDirection swipeDirection = aVar.f875d;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                long jM18550o = mqi0.m18550o();
                long j = this.f849h;
                if (j == 0) {
                    this.f849h = jM18550o;
                    this.f848g = 1;
                } else if (jM18550o - j < ((long) this.f852k) * 1000) {
                    this.f849h = jM18550o;
                    this.f848g++;
                } else {
                    this.f849h = 0L;
                    this.f848g = 0;
                }
                if (this.f848g == this.f851j) {
                    n2l n2lVar = new n2l(aVar.f873b.act());
                    if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
                        com.p1.mobile.android.ui.poplevel.a.p().C(CorePopLevel.HIGH_SPEED_RIGHT_SLIDE, aVar.f873b.act(), n2lVar, 20000);
                    } else {
                        wc80.e().q(uc80.a(n2lVar));
                    }
                    CoreModule.c.e0.M5.put(Boolean.TRUE);
                }
            } else {
                this.f849h = 0L;
                this.f848g = 0;
            }
        }
        return false;
    }
}
