package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPushSettings;
import com.p051p1.mobile.putong.data.UserSubscriptionSettings;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class qt4 extends ar2<zt4> {

    /* JADX INFO: renamed from: e */
    public static jxd0 f159383e = new jxd0("enter_as_send", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static jxd0 f159384f = new jxd0("enable_recommended_stickers", Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public String f159385a;

    /* JADX INFO: renamed from: b */
    public User f159386b;

    /* JADX INFO: renamed from: c */
    public Settings f159387c;

    /* JADX INFO: renamed from: d */
    public UserSubscriptionSettings f159388d;

    public qt4(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m177868e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m177877t0(Bundle bundle) {
        ((zt4) this.viewModel).m221402A3(this.f159385a);
        if (IntlCountryCodeController.m29112i()) {
            m177887r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m177878u0(User user) {
        this.f159386b = user;
        if (this.f159387c == null) {
            this.f159387c = user.settings.mo225055clone();
        }
        ((zt4) this.viewModel).m221412z();
        ((zt4) this.viewModel).m221401A(this.f159387c.showMomentLikes().booleanValue(), this.f159387c.previewPushMessage().booleanValue(), f159383e.get().booleanValue(), f159384f.get().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m177879x0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f159386b == null) {
            ((zt4) this.viewModel).m221404C();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m177880A0(String str) {
        this.f159385a = str;
    }

    /* JADX INFO: renamed from: C0 */
    public void m177881C0() {
        if (NullChecker.m82486a(this.f159386b) && NullChecker.m82486a(this.f159387c) && CoreModule.m30929H().signedIn_() && !this.f159387c.equals(this.f159386b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f159387c.previewPushMessage();
            settingGroups.push.showMomentLikes = this.f159387c.showMomentLikes();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f159386b.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f18632L5), true);
                CoreModule.f18264c.f20405m0.m32124k8(settingGroupsSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.ot4
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f148923a.m177889y0((uxj0) obj);
                    }
                }, new y20() { // from class: l.pt4
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f153986a.m177890z0((Throwable) obj);
                    }
                }));
            }
        }
        if (IntlCountryCodeController.m29112i() && NullChecker.m82486a(this.f159388d) && CoreModule.m30929H().signedIn_()) {
            CoreModule.f18264c.f20381e0.m116450C9(this.f159388d);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m177882D0(boolean z) {
        this.f159388d.refuseSMS = Boolean.valueOf(z);
        m177881C0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ht4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111505a.m177877t0((Bundle) obj);
            }
        });
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.it4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.jt4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122552a.m177878u0((User) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.kt4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128646a.m177879x0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m177883n0(boolean z) {
        f159384f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o0 */
    public void m177884o0(boolean z) {
        f159383e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: p0 */
    public void m177885p0(boolean z) {
        this.f159387c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m177881C0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m177886q0(boolean z) {
        this.f159387c.getSettingGroup().push.showMomentLikes = Boolean.valueOf(z);
        m177881C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m177887r0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116476J7()).map(new qcj() { // from class: l.lt4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SettingGroups) obj).subscription.refuseSMS;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.mt4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138542a.m177888s0((Boolean) obj);
            }
        }, new y20() { // from class: l.nt4
            @Override // p153l.y20
            public final void call(Object obj) {
                qt4.m177868e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m177888s0(Boolean bool) {
        if (this.f159388d == null) {
            this.f159388d = UserSubscriptionSettings.new_();
        }
        ((zt4) this.viewModel).m221403B(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m177889y0(uxj0 uxj0Var) {
        act().progressDismiss();
        ((zt4) this.viewModel).m221401A(this.f159387c.showMomentLikes().booleanValue(), this.f159387c.previewPushMessage().booleanValue(), f159383e.get().booleanValue(), f159384f.get().booleanValue());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m177890z0(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
