package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.MarrySettings;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class i2x extends ar2<p2x> {

    /* JADX INFO: renamed from: a */
    public boolean f112674a;

    /* JADX INFO: renamed from: b */
    public boolean f112675b;

    public i2x(ner nerVar) {
        super(nerVar);
        this.f112674a = false;
        this.f112675b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m138244i0(Bundle bundle) {
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        ((p2x) this.viewModel).m170420r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f112674a = act().getIntent().getBooleanExtra("open_home", false);
        this.f112675b = act().getIntent().getBooleanExtra("show_dot", false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g2x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101900a.m138244i0((Bundle) obj);
            }
        });
        m138246h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m138245g0() {
        n3x.m161356B(act(), true);
        if (this.f112675b) {
            CoreModule.f18264c.f20381e0.f89194b4.put(Boolean.FALSE);
        }
        if (this.f112674a) {
            act().startActivity(NewMainAct.m40697M5(act(), NavigationIntent.get("cards")));
            act().m68056e2();
            act().overridePendingTransition(s7c0.f166680a, x7c0.f192685B);
        } else {
            act().m68056e2();
        }
        m138248k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m138246h0() {
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new ug30())).subscribe(psd0.m173596G(new y20() { // from class: l.h2x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107602a.m138247j0((pf60) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m138247j0(pf60 pf60Var) {
        ((p2x) this.viewModel).m170421s((VerificationCenter) pf60Var.f152156a, (User) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: k0 */
    public void m138248k0() {
        SettingGroups settingGroup = CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup();
        SettingGroups settingGroupsMo225055clone = settingGroup.mo225055clone();
        if (settingGroupsMo225055clone.marriage == null) {
            settingGroupsMo225055clone.marriage = MarrySettings.new_();
        }
        settingGroupsMo225055clone.marriage.closeMode = false;
        SettingGroups settingGroupsSubtract = settingGroupsMo225055clone.subtract(settingGroup);
        if (NullChecker.m82486a(settingGroupsSubtract)) {
            CoreModule.f18264c.f20405m0.m32124k8(settingGroupsSubtract);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
