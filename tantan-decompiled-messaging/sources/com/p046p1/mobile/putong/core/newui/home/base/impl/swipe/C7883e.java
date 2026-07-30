package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import p149l.e51;
import p149l.mqi0;
import p149l.n2l;
import p149l.uc80;
import p149l.upa;
import p149l.wc80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e */
/* JADX INFO: loaded from: classes11.dex */
public class C7883e extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public int f22070g = 0;

    /* JADX INFO: renamed from: h */
    public long f22071h = 0;

    /* JADX INFO: renamed from: i */
    public int f22072i = upa.m194748f0().left_slide_guidance;

    /* JADX INFO: renamed from: j */
    public int f22073j = upa.m194748f0().right_slide_guidance;

    /* JADX INFO: renamed from: k */
    public int f22074k = upa.m194748f0().right_interval;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7898j.a f22075a;

        public a(C7898j.a aVar) {
            this.f22075a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22075a.f22095b.m37291f6();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        int i;
        if (!CoreModule.f17545c.f19639e0.f149215L5.get().booleanValue() && (i = this.f22072i) != 0) {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c.f19622Y0.f94273r == i) {
                c4732c.f19639e0.f149215L5.put(Boolean.TRUE);
                e51.m114743H(aVar.f22095b.act(), new a(aVar), 200L);
                return false;
            }
        }
        if (!CoreModule.f17545c.f19639e0.f149222M5.get().booleanValue() && this.f22073j != 0) {
            SwipeDirection swipeDirection = aVar.f22097d;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                long jM155944o = mqi0.m155944o();
                long j = this.f22071h;
                if (j == 0) {
                    this.f22071h = jM155944o;
                    this.f22070g = 1;
                } else if (jM155944o - j < ((long) this.f22074k) * 1000) {
                    this.f22071h = jM155944o;
                    this.f22070g++;
                } else {
                    this.f22071h = 0L;
                    this.f22070g = 0;
                }
                if (this.f22070g == this.f22073j) {
                    n2l n2lVar = new n2l(aVar.f22095b.act());
                    if (C4371a.m21100p().m21108I()) {
                        C4371a.m21100p().m21103C(CorePopLevel.HIGH_SPEED_RIGHT_SLIDE, aVar.f22095b.act(), n2lVar, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    } else {
                        wc80.m202636e().m202649q(uc80.m192995a(n2lVar));
                    }
                    CoreModule.f17545c.f19639e0.f149222M5.put(Boolean.TRUE);
                }
            } else {
                this.f22071h = 0L;
                this.f22070g = 0;
            }
        }
        return false;
    }
}
