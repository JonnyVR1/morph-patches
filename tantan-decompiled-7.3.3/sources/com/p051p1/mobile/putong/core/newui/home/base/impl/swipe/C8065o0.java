package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.MarriageGuide;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8065o0;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.byd0;
import p153l.ji30;
import p153l.jxd0;
import p153l.psd0;
import p153l.pzi0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8065o0 extends AbstractC8022a {

    /* JADX INFO: renamed from: i */
    public jxd0 f22856i;

    /* JADX INFO: renamed from: g */
    public byd0 f22854g = null;

    /* JADX INFO: renamed from: h */
    public byd0 f22855h = null;

    /* JADX INFO: renamed from: j */
    public boolean f22857j = false;

    /* JADX INFO: renamed from: k */
    public boolean f22858k = false;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38707p(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public final boolean m38709r() {
        if (this.f22856i.get().booleanValue()) {
            return pzi0.m174437B(7, this.f22854g.get().longValue()) && this.f22855h.get().longValue() < 3;
        }
        return true;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m38711t(MarriageGuide marriageGuide) {
        if (this.f22857j) {
            return;
        }
        if (marriageGuide.momentCondition || marriageGuide.qualityCondition) {
            m38714w(marriageGuide);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m38712u(Act act) {
        act.duringCreated(CoreModule.f18264c.f20381e0.m116592n9()).subscribe(psd0.m173597H(new y20() { // from class: l.lkh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132472a.m38711t((MarriageGuide) obj);
            }
        }, new y20() { // from class: l.mkh0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8065o0.m38707p((Throwable) obj);
            }
        }));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (CoreModule.f18264c.f20381e0.m116545b8(false)) {
            return false;
        }
        if (this.f22854g == null) {
            this.f22854g = new byd0("marry_guide_dlg_show_date_" + CoreModule.m30929H().userId(), 0L);
        }
        if (this.f22855h == null) {
            this.f22855h = new byd0("marry_guide_dlg_show_times_" + CoreModule.m30929H().userId(), 0L);
        }
        if (this.f22856i == null) {
            this.f22856i = new jxd0("marry_guide_show_by_quality_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        }
        if (!this.f22858k && m38709r() && !aVar.f22842g && !pzi0.m174439D(CoreModule.f18264c.f20381e0.f89092O4.get().longValue())) {
            aVar.f22842g = true;
            this.f22858k = true;
            m38712u(aVar.f22837b.act());
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m38714w(MarriageGuide marriageGuide) {
        if (ji30.m144964h() == TabName.Card && !CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
            if (marriageGuide.qualityCondition && !this.f22856i.get().booleanValue()) {
                this.f22856i.put(Boolean.TRUE);
                CoreModule.f18264c.f20381e0.f89234g4.m137019l("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.f18264c.f20381e0.f89092O4.put(Long.valueOf(pzi0.m174454o()));
            } else if (marriageGuide.momentCondition && pzi0.m174437B(7, this.f22854g.get().longValue()) && this.f22855h.get().longValue() < 3) {
                this.f22854g.put(Long.valueOf(pzi0.m174454o()));
                byd0 byd0Var = this.f22855h;
                byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
                CoreModule.f18264c.f20381e0.f89234g4.m137019l("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.f18264c.f20381e0.f89092O4.put(Long.valueOf(pzi0.m174454o()));
            }
        }
    }
}
