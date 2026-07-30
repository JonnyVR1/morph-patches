package p003l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.MarrySettings;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.g830;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.nzb0;
import l.o0x;
import l.rzb0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jzw extends jq2<qzw> {

    /* JADX INFO: renamed from: a */
    public boolean f4770a;

    /* JADX INFO: renamed from: b */
    public boolean f4771b;

    public jzw(mcr mcrVar) {
        super(mcrVar);
        this.f4770a = false;
        this.f4771b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m5465i0(Bundle bundle) {
        CoreModule.c.e0.W9(CoreModule.H().userId());
        ((qzw) ((jq2) this).viewModel).m7119r();
    }

    /* JADX INFO: renamed from: Z */
    public void m5466Z() {
        super.Z();
        this.f4770a = act().getIntent().getBooleanExtra("open_home", false);
        this.f4771b = act().getIntent().getBooleanExtra("show_dot", false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m5467a0() {
        super.a0();
        creates(new e30() { // from class: l.hzw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4313a.m5465i0((Bundle) obj);
            }
        });
        m5469h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m5468g0() {
        o0x.B(act(), true);
        if (this.f4771b) {
            CoreModule.c.e0.b4.put(Boolean.FALSE);
        }
        if (this.f4770a) {
            act().startActivity(NewMainAct.I5(act(), NavigationIntent.get("cards")));
            act().finish();
            act().overridePendingTransition(nzb0.a, rzb0.B);
        } else {
            act().finish();
        }
        m5471k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5469h0() {
        duringCreated(C1099c.combineLatest(CoreModule.c.B0.j4().distinctUntilChanged(), CoreModule.c.e0.o9().distinctUntilChanged(), new g830())).subscribe((m250) mkd0.G(new e30() { // from class: l.izw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4524a.m5470j0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m5470j0(j760 j760Var) {
        ((qzw) ((jq2) this).viewModel).m7120s((VerificationCenter) j760Var.a, (User) j760Var.b);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5471k0() {
        SettingGroups settingGroup = CoreModule.c.e0.p9().settings.getSettingGroup();
        SettingGroups settingGroupsClone = settingGroup.clone();
        if (settingGroupsClone.marriage == null) {
            settingGroupsClone.marriage = MarrySettings.new_();
        }
        settingGroupsClone.marriage.closeMode = false;
        SettingGroups settingGroupsSubtract = settingGroupsClone.subtract(settingGroup);
        if (NullChecker.a(settingGroupsSubtract)) {
            CoreModule.c.m0.k8(settingGroupsSubtract);
        }
    }

    public void destroy() {
    }
}
