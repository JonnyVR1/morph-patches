package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0078o0;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.MarriageGuide;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.v930;
import l.zpd0;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0078o0 extends AbstractC0035a {

    /* JADX INFO: renamed from: i */
    public hpd0 f892i;

    /* JADX INFO: renamed from: g */
    public zpd0 f890g = null;

    /* JADX INFO: renamed from: h */
    public zpd0 f891h = null;

    /* JADX INFO: renamed from: j */
    public boolean f893j = false;

    /* JADX INFO: renamed from: k */
    public boolean f894k = false;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1675p(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1677r() {
        if (((Boolean) this.f892i.get()).booleanValue()) {
            return mqi0.m18533B(7, ((Long) this.f890g.get()).longValue()) && ((Long) this.f891h.get()).longValue() < 3;
        }
        return true;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1679t(MarriageGuide marriageGuide) {
        if (this.f893j) {
            return;
        }
        if (marriageGuide.momentCondition || marriageGuide.qualityCondition) {
            m1682w(marriageGuide);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1680u(Act act) {
        act.duringCreated(CoreModule.c.e0.n9()).subscribe(mkd0.H(new e30() { // from class: l.dch0
            public final void call(Object obj) {
                this.f11726a.m1679t((MarriageGuide) obj);
            }
        }, new e30() { // from class: l.ech0
            public final void call(Object obj) {
                C0078o0.m1675p((Throwable) obj);
            }
        }));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (CoreModule.c.e0.b8(false)) {
            return false;
        }
        if (this.f890g == null) {
            this.f890g = new zpd0("marry_guide_dlg_show_date_" + CoreModule.H().userId(), 0L);
        }
        if (this.f891h == null) {
            this.f891h = new zpd0("marry_guide_dlg_show_times_" + CoreModule.H().userId(), 0L);
        }
        if (this.f892i == null) {
            this.f892i = new hpd0("marry_guide_show_by_quality_" + CoreModule.H().userId(), Boolean.FALSE);
        }
        if (!this.f894k && m1677r() && !aVar.f878g && !mqi0.m18535D(((Long) CoreModule.c.e0.O4.get()).longValue())) {
            aVar.f878g = true;
            this.f894k = true;
            m1680u(aVar.f873b.act());
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m1682w(MarriageGuide marriageGuide) {
        if (v930.h() == TabName.Card && !((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
            if (marriageGuide.qualityCondition && !((Boolean) this.f892i.get()).booleanValue()) {
                this.f892i.put(Boolean.TRUE);
                CoreModule.c.e0.g4.onNext("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.c.e0.O4.put(Long.valueOf(mqi0.m18550o()));
            } else if (marriageGuide.momentCondition && mqi0.m18533B(7, ((Long) this.f890g.get()).longValue()) && ((Long) this.f891h.get()).longValue() < 3) {
                this.f890g.put(Long.valueOf(mqi0.m18550o()));
                zpd0 zpd0Var = this.f891h;
                zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
                CoreModule.c.e0.g4.onNext("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.c.e0.O4.put(Long.valueOf(mqi0.m18550o()));
            }
        }
    }
}
