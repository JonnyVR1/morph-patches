package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.FateRadarGreeting;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarFilterPairedUserAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class zdw extends jq2<aew> {

    /* JADX INFO: renamed from: a */
    public FateRadar f202726a;

    /* JADX INFO: renamed from: l.zdw$a */
    public class C21664a implements e30<Throwable> {
        public C21664a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((aew) zdw.this.viewModel).m96141k(false);
        }
    }

    /* JADX INFO: renamed from: l.zdw$c */
    public class C21666c implements e30<Throwable> {
        public C21666c() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.m165783g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$e */
    public class C21668e implements e30<Throwable> {
        public C21668e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.m165783g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$f */
    public class C21669f implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f202732a;

        public C21669f(int i) {
            this.f202732a = i;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            zdw.this.act().progressDismiss();
            ((aew) zdw.this.viewModel).f69109e.m41893h(this.f202732a);
        }
    }

    /* JADX INFO: renamed from: l.zdw$g */
    public class C21670g implements e30<Throwable> {
        public C21670g() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            zdw.this.act().progressDismiss();
            osi0.m165783g("更新失败");
        }
    }

    /* JADX INFO: renamed from: l.zdw$h */
    public class ViewOnClickListenerC21671h implements View.OnClickListener {
        public ViewOnClickListenerC21671h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f202726a == null || zdw.this.f202726a.searchConditions == null || zdw.this.f202726a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m41907Z1(zdw.this.act(), "select_status", zdw.this.f202726a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$i */
    public class ViewOnClickListenerC21672i implements View.OnClickListener {
        public ViewOnClickListenerC21672i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f202726a == null || zdw.this.f202726a.searchConditions == null || zdw.this.f202726a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m41907Z1(zdw.this.act(), "select_feature", zdw.this.f202726a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$j */
    public class ViewOnClickListenerC21673j implements View.OnClickListener {
        public ViewOnClickListenerC21673j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (zdw.this.f202726a == null || zdw.this.f202726a.searchConditions == null || zdw.this.f202726a.searchConditions.customItems == null) {
                return;
            }
            zdw.this.act().startActivity(LoveRadarFilterPairedUserAct.m41907Z1(zdw.this.act(), "select_selectedInterest", zdw.this.f202726a.searchConditions));
        }
    }

    /* JADX INFO: renamed from: l.zdw$k */
    public class C21674k implements e30<Boolean> {
        public C21674k() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            zdw.this.m218227x0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: l.zdw$l */
    public class C21675l implements e30<FateRadar> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f202739a;

        public C21675l(boolean z) {
            this.f202739a = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            boolean zM81303a = NullChecker.m81303a(fateRadar);
            zdw zdwVar = zdw.this;
            if (!zM81303a) {
                ((aew) zdwVar.viewModel).m96138f();
                return;
            }
            zdwVar.f202726a = fateRadar;
            ((aew) zdw.this.viewModel).m96140j(fateRadar);
            if (this.f202739a) {
                ((aew) zdw.this.viewModel).m96137e();
            }
        }
    }

    /* JADX INFO: renamed from: l.zdw$m */
    public class C21676m implements e30<Throwable> {
        public C21676m() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((aew) zdw.this.viewModel).m96138f();
        }
    }

    /* JADX INFO: renamed from: l.zdw$n */
    public class C21677n implements e30<Boolean> {
        public C21677n() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.f17545c.f19683s2.f170717T.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: l.zdw$o */
    public class C21678o implements e30<Throwable> {
        public C21678o() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            osi0.m165783g("更新失败");
            zdw.this.m218224r0();
        }
    }

    /* JADX INFO: renamed from: l.zdw$p */
    public class C21679p implements e30<FateRadar> {
        public C21679p() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            if (fateRadar != null) {
                ((aew) zdw.this.viewModel).m96141k(fateRadar.switchSetting.status);
            }
        }
    }

    public zdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m218220t0(Bundle bundle) {
        ((aew) this.viewModel).m96136d(bundle);
        xdl0.m208329E0(((aew) this.viewModel).f69108d.f25386f, new ViewOnClickListenerC21671h());
        xdl0.m208329E0(((aew) this.viewModel).f69108d.f25388h, new ViewOnClickListenerC21672i());
        xdl0.m208329E0(((aew) this.viewModel).f69108d.f25390j, new ViewOnClickListenerC21673j());
        m218226u0();
        m218225s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m218221A0(FateRadarSearchConditions fateRadarSearchConditions) {
        duringCreated(CoreModule.f17545c.f19683s2.m189328K3(fateRadarSearchConditions)).subscribe(mkd0.m154956H(new C21665b(), new C21666c()));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ydw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197649a.m218220t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19683s2.f170716S).subscribe(mkd0.m154955G(new C21674k()));
    }

    /* JADX INFO: renamed from: p0 */
    public void m218222p0(boolean z) {
        duringCreated(CoreModule.f17545c.f19683s2.m189331N3(z)).subscribe(mkd0.m154956H(new C21677n(), new C21678o()));
    }

    /* JADX INFO: renamed from: q0 */
    public void m218223q0(int i) {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.f17545c.f19683s2.m189322E3(i)).subscribe(mkd0.m154956H(new C21669f(i), new C21670g()));
    }

    /* JADX INFO: renamed from: r0 */
    public void m218224r0() {
        duringCreated(CoreModule.f17545c.f19683s2.m189325H3()).subscribe(mkd0.m154956H(new C21679p(), new C21664a()));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m218225s0() {
        CoreModule.f17545c.f19683s2.m189326I3();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m218226u0() {
        m218227x0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m218227x0(boolean z) {
        ((aew) this.viewModel).m96139i();
        duringCreated(CoreModule.f17545c.f19683s2.m189324G3()).subscribe(mkd0.m154956H(new C21675l(z), new C21676m()));
    }

    /* JADX INFO: renamed from: y0 */
    public void m218228y0() {
        m218226u0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m218229z0(FateRadarGreeting fateRadarGreeting) {
        duringCreated(CoreModule.f17545c.f19683s2.m189330M3(fateRadarGreeting)).subscribe(mkd0.m154956H(new C21667d(), new C21668e()));
    }

    /* JADX INFO: renamed from: l.zdw$b */
    public class C21665b implements e30<Boolean> {
        public C21665b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: l.zdw$d */
    public class C21667d implements e30<Boolean> {
        public C21667d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
