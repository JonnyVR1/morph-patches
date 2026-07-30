package p009l;

import android.os.Bundle;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarFilterPairedUserAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.FateRadarGreeting;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zdw extends jq2<aew> {

    /* JADX INFO: renamed from: a */
    public FateRadar f23602a;

    /* JADX INFO: renamed from: l.zdw$a */
    public class C1350a implements e30<Throwable> {
        public C1350a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((aew) ((jq2) zdw.this).viewModel).m11361k(false);
        }
    }

    /* JADX INFO: renamed from: l.zdw$c */
    public class C1352c implements e30<Throwable> {
        public C1352c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$e */
    public class C1354e implements e30<Throwable> {
        public C1354e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$f */
    public class C1355f implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f23608a;

        public C1355f(int i) {
            this.f23608a = i;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            zdw.this.act().progressDismiss();
            ((aew) ((jq2) zdw.this).viewModel).f9444e.m6029h(this.f23608a);
        }
    }

    /* JADX INFO: renamed from: l.zdw$g */
    public class C1356g implements e30<Throwable> {
        public C1356g() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            zdw.this.act().progressDismiss();
            osi0.g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$h */
    public class ViewOnClickListenerC1357h implements View.OnClickListener {
        public ViewOnClickListenerC1357h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f23602a == null || zdw.this.f23602a.searchConditions == null || zdw.this.f23602a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m6045Z1(zdw.this.act(), "select_status", zdw.this.f23602a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$i */
    public class ViewOnClickListenerC1358i implements View.OnClickListener {
        public ViewOnClickListenerC1358i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f23602a == null || zdw.this.f23602a.searchConditions == null || zdw.this.f23602a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m6045Z1(zdw.this.act(), "select_feature", zdw.this.f23602a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$j */
    public class ViewOnClickListenerC1359j implements View.OnClickListener {
        public ViewOnClickListenerC1359j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f23602a == null || zdw.this.f23602a.searchConditions == null || zdw.this.f23602a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m6045Z1(zdw.this.act(), "select_selectedInterest", zdw.this.f23602a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$k */
    public class C1360k implements e30<Boolean> {
        public C1360k() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            zdw.this.m25735x0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: l.zdw$l */
    public class C1361l implements e30<FateRadar> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23615a;

        public C1361l(boolean z) {
            this.f23615a = z;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            boolean zA = NullChecker.a(fateRadar);
            zdw zdwVar = zdw.this;
            if (!zA) {
                ((aew) ((jq2) zdwVar).viewModel).m11357f();
                return;
            }
            zdwVar.f23602a = fateRadar;
            ((aew) ((jq2) zdw.this).viewModel).m11360j(fateRadar);
            if (this.f23615a) {
                ((aew) ((jq2) zdw.this).viewModel).m11356e();
            }
        }
    }

    /* JADX INFO: renamed from: l.zdw$m */
    public class C1362m implements e30<Throwable> {
        public C1362m() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((aew) ((jq2) zdw.this).viewModel).m11357f();
        }
    }

    /* JADX INFO: renamed from: l.zdw$n */
    public class C1363n implements e30<Boolean> {
        public C1363n() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.c.s2.T.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: l.zdw$o */
    public class C1364o implements e30<Throwable> {
        public C1364o() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.g("更新失败");
            zdw.this.m25732r0();
        }
    }

    /* JADX INFO: renamed from: l.zdw$p */
    public class C1365p implements e30<FateRadar> {
        public C1365p() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            if (fateRadar != null) {
                ((aew) ((jq2) zdw.this).viewModel).m11361k(fateRadar.switchSetting.status);
            }
        }
    }

    public zdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m25727t0(Bundle bundle) {
        ((aew) ((jq2) this).viewModel).m11355d(bundle);
        xdl0.E0(((aew) ((jq2) this).viewModel).f9443d.f4164f, new ViewOnClickListenerC1357h());
        xdl0.E0(((aew) ((jq2) this).viewModel).f9443d.f4166h, new ViewOnClickListenerC1358i());
        xdl0.E0(((aew) ((jq2) this).viewModel).f9443d.f4168j, new ViewOnClickListenerC1359j());
        m25734u0();
        m25733s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m25728A0(FateRadarSearchConditions fateRadarSearchConditions) {
        duringCreated(CoreModule.c.s2.K3(fateRadarSearchConditions)).subscribe(mkd0.H(new C1351b(), new C1352c()));
    }

    /* JADX INFO: renamed from: a0 */
    public void m25729a0() {
        super.a0();
        creates(new e30() { // from class: l.ydw
            public final void call(Object obj) {
                this.f23007a.m25727t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.s2.S).subscribe(mkd0.G(new C1360k()));
    }

    /* JADX INFO: renamed from: p0 */
    public void m25730p0(boolean z) {
        duringCreated(CoreModule.c.s2.N3(z)).subscribe(mkd0.H(new C1363n(), new C1364o()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m25731q0(int i) {
        act().progress(R.string.J5);
        duringCreated(CoreModule.c.s2.E3(i)).subscribe(mkd0.H(new C1355f(i), new C1356g()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m25732r0() {
        duringCreated(CoreModule.c.s2.H3()).subscribe(mkd0.H(new C1365p(), new C1350a()));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m25733s0() {
        CoreModule.c.s2.I3();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m25734u0() {
        m25735x0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m25735x0(boolean z) {
        ((aew) ((jq2) this).viewModel).m11358i();
        duringCreated(CoreModule.c.s2.G3()).subscribe(mkd0.H(new C1361l(z), new C1362m()));
    }

    /* JADX INFO: renamed from: y0 */
    public void m25736y0() {
        m25734u0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m25737z0(FateRadarGreeting fateRadarGreeting) {
        duringCreated(CoreModule.c.s2.M3(fateRadarGreeting)).subscribe(mkd0.H(new C1353d(), new C1354e()));
    }

    /* JADX INFO: renamed from: l.zdw$b */
    public class C1351b implements e30<Boolean> {
        public C1351b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: l.zdw$d */
    public class C1353d implements e30<Boolean> {
        public C1353d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    public void destroy() {
    }
}
