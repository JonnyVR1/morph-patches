package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.MarrySettings;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class jzw extends jq2<qzw> {

    /* JADX INFO: renamed from: a */
    public boolean f120426a;

    /* JADX INFO: renamed from: b */
    public boolean f120427b;

    public jzw(mcr mcrVar) {
        super(mcrVar);
        this.f120426a = false;
        this.f120427b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m143961i0(Bundle bundle) {
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        ((qzw) this.viewModel).m177310r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f120426a = act().getIntent().getBooleanExtra("open_home", false);
        this.f120427b = act().getIntent().getBooleanExtra("show_dot", false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hzw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110235a.m143961i0((Bundle) obj);
            }
        });
        m143963h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m143962g0() {
        o0x.m162188B(act(), true);
        if (this.f120427b) {
            CoreModule.f17545c.f19639e0.f149337b4.put(Boolean.FALSE);
        }
        if (this.f120426a) {
            act().startActivity(NewMainAct.m39685I5(act(), NavigationIntent.get("cards")));
            act().m66873d2();
            act().overridePendingTransition(nzb0.f141199a, rzb0.f161628B);
        } else {
            act().m66873d2();
        }
        m143965k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m143963h0() {
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new g830())).subscribe(mkd0.m154955G(new e30() { // from class: l.izw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115601a.m143964j0((j760) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m143964j0(j760 j760Var) {
        ((qzw) this.viewModel).m177311s((VerificationCenter) j760Var.f116564a, (User) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: k0 */
    public void m143965k0() {
        SettingGroups settingGroup = CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup();
        SettingGroups settingGroupsMo223809clone = settingGroup.mo223809clone();
        if (settingGroupsMo223809clone.marriage == null) {
            settingGroupsMo223809clone.marriage = MarrySettings.new_();
        }
        settingGroupsMo223809clone.marriage.closeMode = false;
        SettingGroups settingGroupsSubtract = settingGroupsMo223809clone.subtract(settingGroup);
        if (NullChecker.m81303a(settingGroupsSubtract)) {
            CoreModule.f17545c.f19663m0.m31121k8(settingGroupsSubtract);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
