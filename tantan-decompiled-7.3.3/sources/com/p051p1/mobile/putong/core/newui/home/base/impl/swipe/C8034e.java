package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import p153l.al80;
import p153l.cl80;
import p153l.d5l;
import p153l.gra;
import p153l.l51;
import p153l.pzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e */
/* JADX INFO: loaded from: classes11.dex */
public class C8034e extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public int f22812g = 0;

    /* JADX INFO: renamed from: h */
    public long f22813h = 0;

    /* JADX INFO: renamed from: i */
    public int f22814i = gra.m131679f0().left_slide_guidance;

    /* JADX INFO: renamed from: j */
    public int f22815j = gra.m131679f0().right_slide_guidance;

    /* JADX INFO: renamed from: k */
    public int f22816k = gra.m131679f0().right_interval;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8049j.a f22817a;

        public a(C8049j.a aVar) {
            this.f22817a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22817a.f22837b.m38294f6();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        int i;
        if (!CoreModule.f18264c.f20381e0.f89072L5.get().booleanValue() && (i = this.f22814i) != 0) {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c.f20364Y0.f161176r == i) {
                c4883c.f20381e0.f89072L5.put(Boolean.TRUE);
                l51.m152888H(aVar.f22837b.act(), new a(aVar), 200L);
                return false;
            }
        }
        if (!CoreModule.f18264c.f20381e0.f89079M5.get().booleanValue() && this.f22815j != 0) {
            SwipeDirection swipeDirection = aVar.f22839d;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                long jM174454o = pzi0.m174454o();
                long j = this.f22813h;
                if (j == 0) {
                    this.f22813h = jM174454o;
                    this.f22812g = 1;
                } else if (jM174454o - j < ((long) this.f22816k) * 1000) {
                    this.f22813h = jM174454o;
                    this.f22812g++;
                } else {
                    this.f22813h = 0L;
                    this.f22812g = 0;
                }
                if (this.f22812g == this.f22815j) {
                    d5l d5lVar = new d5l(aVar.f22837b.act());
                    if (C4522a.m22099p().m22107I()) {
                        C4522a.m22099p().m22102C(CorePopLevel.HIGH_SPEED_RIGHT_SLIDE, aVar.f22837b.act(), d5lVar, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    } else {
                        cl80.m110426e().m110439q(al80.m98641a(d5lVar));
                    }
                    CoreModule.f18264c.f20381e0.f89079M5.put(Boolean.TRUE);
                }
            } else {
                this.f22813h = 0L;
                this.f22812g = 0;
            }
        }
        return false;
    }
}
