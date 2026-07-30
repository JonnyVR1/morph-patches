package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.FateRadarGreeting;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarFilterPairedUserAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xfw extends ar2<yfw> {

    /* JADX INFO: renamed from: a */
    public FateRadar f194095a;

    /* JADX INFO: renamed from: l.xfw$a */
    public class C21314a implements y20<Throwable> {
        public C21314a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((yfw) xfw.this.viewModel).m215823k(false);
        }
    }

    /* JADX INFO: renamed from: l.xfw$c */
    public class C21316c implements y20<Throwable> {
        public C21316c() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            r1j0.m179420g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.xfw$e */
    public class C21318e implements y20<Throwable> {
        public C21318e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            r1j0.m179420g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.xfw$f */
    public class C21319f implements y20<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f194101a;

        public C21319f(int i) {
            this.f194101a = i;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            xfw.this.act().progressDismiss();
            ((yfw) xfw.this.viewModel).f199659e.m42904h(this.f194101a);
        }
    }

    /* JADX INFO: renamed from: l.xfw$g */
    public class C21320g implements y20<Throwable> {
        public C21320g() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            xfw.this.act().progressDismiss();
            r1j0.m179420g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.xfw$h */
    public class ViewOnClickListenerC21321h implements View.OnClickListener {
        public ViewOnClickListenerC21321h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (xfw.this.f194095a == null || xfw.this.f194095a.searchConditions == null || xfw.this.f194095a.searchConditions.customItems == null) {
                return;
            }
            xfw.this.act().startActivity(LoveRadarFilterPairedUserAct.m42918a2(xfw.this.act(), "select_status", xfw.this.f194095a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.xfw$i */
    public class ViewOnClickListenerC21322i implements View.OnClickListener {
        public ViewOnClickListenerC21322i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (xfw.this.f194095a == null || xfw.this.f194095a.searchConditions == null || xfw.this.f194095a.searchConditions.customItems == null) {
                return;
            }
            xfw.this.act().startActivity(LoveRadarFilterPairedUserAct.m42918a2(xfw.this.act(), "select_feature", xfw.this.f194095a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.xfw$j */
    public class ViewOnClickListenerC21323j implements View.OnClickListener {
        public ViewOnClickListenerC21323j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (xfw.this.f194095a == null || xfw.this.f194095a.searchConditions == null || xfw.this.f194095a.searchConditions.customItems == null) {
                return;
            }
            xfw.this.act().startActivity(LoveRadarFilterPairedUserAct.m42918a2(xfw.this.act(), "select_selectedInterest", xfw.this.f194095a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.xfw$k */
    public class C21324k implements y20<Boolean> {
        public C21324k() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            xfw.this.m210842x0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: l.xfw$l */
    public class C21325l implements y20<FateRadar> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f194108a;

        public C21325l(boolean z) {
            this.f194108a = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            boolean zM82486a = NullChecker.m82486a(fateRadar);
            xfw xfwVar = xfw.this;
            if (!zM82486a) {
                ((yfw) xfwVar.viewModel).m215820f();
                return;
            }
            xfwVar.f194095a = fateRadar;
            ((yfw) xfw.this.viewModel).m215822j(fateRadar);
            if (this.f194108a) {
                ((yfw) xfw.this.viewModel).m215819e();
            }
        }
    }

    /* JADX INFO: renamed from: l.xfw$m */
    public class C21326m implements y20<Throwable> {
        public C21326m() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((yfw) xfw.this.viewModel).m215820f();
        }
    }

    /* JADX INFO: renamed from: l.xfw$n */
    public class C21327n implements y20<Boolean> {
        public C21327n() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.f18264c.f20425s2.f110503T.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: l.xfw$o */
    public class C21328o implements y20<Throwable> {
        public C21328o() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            r1j0.m179420g("更新失败");
            xfw.this.m210839r0();
        }
    }

    /* JADX INFO: renamed from: l.xfw$p */
    public class C21329p implements y20<FateRadar> {
        public C21329p() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            if (fateRadar != null) {
                ((yfw) xfw.this.viewModel).m215823k(fateRadar.switchSetting.status);
            }
        }
    }

    public xfw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m210835t0(Bundle bundle) {
        ((yfw) this.viewModel).m215818d(bundle);
        bnl0.m105509E0(((yfw) this.viewModel).f199658d.f26128f, new ViewOnClickListenerC21321h());
        bnl0.m105509E0(((yfw) this.viewModel).f199658d.f26130h, new ViewOnClickListenerC21322i());
        bnl0.m105509E0(((yfw) this.viewModel).f199658d.f26132j, new ViewOnClickListenerC21323j());
        m210841u0();
        m210840s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m210836A0(FateRadarSearchConditions fateRadarSearchConditions) {
        duringCreated(CoreModule.f18264c.f20425s2.m135735K3(fateRadarSearchConditions)).subscribe(psd0.m173597H(new C21315b(), new C21316c()));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188892a.m210835t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20425s2.f110502S).subscribe(psd0.m173596G(new C21324k()));
    }

    /* JADX INFO: renamed from: p0 */
    public void m210837p0(boolean z) {
        duringCreated(CoreModule.f18264c.f20425s2.m135738N3(z)).subscribe(psd0.m173597H(new C21327n(), new C21328o()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m210838q0(int i) {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.f18264c.f20425s2.m135729E3(i)).subscribe(psd0.m173597H(new C21319f(i), new C21320g()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m210839r0() {
        duringCreated(CoreModule.f18264c.f20425s2.m135732H3()).subscribe(psd0.m173597H(new C21329p(), new C21314a()));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m210840s0() {
        CoreModule.f18264c.f20425s2.m135733I3();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m210841u0() {
        m210842x0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m210842x0(boolean z) {
        ((yfw) this.viewModel).m215821i();
        duringCreated(CoreModule.f18264c.f20425s2.m135731G3()).subscribe(psd0.m173597H(new C21325l(z), new C21326m()));
    }

    /* JADX INFO: renamed from: y0 */
    public void m210843y0() {
        m210841u0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m210844z0(FateRadarGreeting fateRadarGreeting) {
        duringCreated(CoreModule.f18264c.f20425s2.m135737M3(fateRadarGreeting)).subscribe(psd0.m173597H(new C21317d(), new C21318e()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.xfw$b */
    public class C21315b implements y20<Boolean> {
        public C21315b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: l.xfw$d */
    public class C21317d implements y20<Boolean> {
        public C21317d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }
}
