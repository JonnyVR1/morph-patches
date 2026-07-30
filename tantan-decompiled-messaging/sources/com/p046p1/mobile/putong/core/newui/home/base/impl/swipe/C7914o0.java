package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.MarriageGuide;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7914o0;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.e30;
import p149l.hpd0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.v930;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7914o0 extends AbstractC7871a {

    /* JADX INFO: renamed from: i */
    public hpd0 f22114i;

    /* JADX INFO: renamed from: g */
    public zpd0 f22112g = null;

    /* JADX INFO: renamed from: h */
    public zpd0 f22113h = null;

    /* JADX INFO: renamed from: j */
    public boolean f22115j = false;

    /* JADX INFO: renamed from: k */
    public boolean f22116k = false;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37704p(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public final boolean m37706r() {
        if (this.f22114i.get().booleanValue()) {
            return mqi0.m155927B(7, this.f22112g.get().longValue()) && this.f22113h.get().longValue() < 3;
        }
        return true;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m37708t(MarriageGuide marriageGuide) {
        if (this.f22115j) {
            return;
        }
        if (marriageGuide.momentCondition || marriageGuide.qualityCondition) {
            m37711w(marriageGuide);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m37709u(Act act) {
        act.duringCreated(CoreModule.f17545c.f19639e0.m169519n9()).subscribe(mkd0.m154956H(new e30() { // from class: l.dch0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85403a.m37708t((MarriageGuide) obj);
            }
        }, new e30() { // from class: l.ech0
            @Override // p149l.e30
            public final void call(Object obj) {
                C7914o0.m37704p((Throwable) obj);
            }
        }));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (CoreModule.f17545c.f19639e0.m169472b8(false)) {
            return false;
        }
        if (this.f22112g == null) {
            this.f22112g = new zpd0("marry_guide_dlg_show_date_" + CoreModule.m29931H().userId(), 0L);
        }
        if (this.f22113h == null) {
            this.f22113h = new zpd0("marry_guide_dlg_show_times_" + CoreModule.m29931H().userId(), 0L);
        }
        if (this.f22114i == null) {
            this.f22114i = new hpd0("marry_guide_show_by_quality_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        }
        if (!this.f22116k && m37706r() && !aVar.f22100g && !mqi0.m155929D(CoreModule.f17545c.f19639e0.f149235O4.get().longValue())) {
            aVar.f22100g = true;
            this.f22116k = true;
            m37709u(aVar.f22095b.act());
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m37711w(MarriageGuide marriageGuide) {
        if (v930.m197534h() == TabName.Card && !CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
            if (marriageGuide.qualityCondition && !this.f22114i.get().booleanValue()) {
                this.f22114i.put(Boolean.TRUE);
                CoreModule.f17545c.f19639e0.f149377g4.m132487l("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.f17545c.f19639e0.f149235O4.put(Long.valueOf(mqi0.m155944o()));
            } else if (marriageGuide.momentCondition && mqi0.m155927B(7, this.f22112g.get().longValue()) && this.f22113h.get().longValue() < 3) {
                this.f22112g.put(Long.valueOf(mqi0.m155944o()));
                zpd0 zpd0Var = this.f22113h;
                zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
                CoreModule.f17545c.f19639e0.f149377g4.m132487l("切换到想结婚模式可以更快找到理想伴侣");
                CoreModule.f17545c.f19639e0.f149235O4.put(Long.valueOf(mqi0.m155944o()));
            }
        }
    }
}
