package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPushSettings;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hpd0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rs4 extends jq2<at4> {

    /* JADX INFO: renamed from: e */
    public static hpd0 f20696e = new hpd0("enter_as_send", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static hpd0 f20697f = new hpd0("enable_recommended_stickers", Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public String f20698a;

    /* JADX INFO: renamed from: b */
    public User f20699b;

    /* JADX INFO: renamed from: c */
    public Settings f20700c;

    /* JADX INFO: renamed from: d */
    public UserSubscriptionSettings f20701d;

    public rs4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m22889e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m22898t0(Bundle bundle) {
        ((at4) ((jq2) this).viewModel).m12198A3(this.f20698a);
        if (IntlCountryCodeController.m8i()) {
            m22909r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m22899u0(User user) {
        this.f20699b = user;
        if (this.f20700c == null) {
            this.f20700c = user.settings.clone();
        }
        ((at4) ((jq2) this).viewModel).m12210z();
        ((at4) ((jq2) this).viewModel).m12197A(this.f20700c.showMomentLikes().booleanValue(), this.f20700c.previewPushMessage().booleanValue(), ((Boolean) f20696e.get()).booleanValue(), ((Boolean) f20697f.get()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m22900x0(c cVar) {
        if (cVar == c.i && this.f20699b == null) {
            ((at4) ((jq2) this).viewModel).m12200C();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m22901A0(String str) {
        this.f20698a = str;
    }

    /* JADX INFO: renamed from: C0 */
    public void m22902C0() {
        if (NullChecker.a(this.f20699b) && NullChecker.a(this.f20700c) && CoreModule.m1850H().signedIn_() && !this.f20700c.equals(this.f20699b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f20700c.previewPushMessage();
            settingGroups.push.showMomentLikes = this.f20700c.showMomentLikes();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f20699b.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f1831J5), true);
                CoreModule.f1534c.f3652m0.m3051k8(settingGroupsSubtract).subscribe(mkd0.H(new e30() { // from class: l.ps4
                    public final void call(Object obj) {
                        this.f19278a.m22911y0((roj0) obj);
                    }
                }, new e30() { // from class: l.qs4
                    public final void call(Object obj) {
                        this.f20001a.m22912z0((Throwable) obj);
                    }
                }));
            }
        }
        if (IntlCountryCodeController.m8i() && NullChecker.a(this.f20701d) && CoreModule.m1850H().signedIn_()) {
            CoreModule.f1534c.f3628e0.m21340C9(this.f20701d);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m22903D0(boolean z) {
        this.f20701d.refuseSMS = Boolean.valueOf(z);
        m22902C0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m22904a0() {
        creates(new e30() { // from class: l.is4
            public final void call(Object obj) {
                this.f14727a.m22898t0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.js4
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ks4
            public final void call(Object obj) {
                this.f15976a.m22899u0((User) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ls4
            public final void call(Object obj) {
                this.f16609a.m22900x0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m22905n0(boolean z) {
        f20697f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o0 */
    public void m22906o0(boolean z) {
        f20696e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: p0 */
    public void m22907p0(boolean z) {
        this.f20700c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m22902C0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m22908q0(boolean z) {
        this.f20700c.getSettingGroup().push.showMomentLikes = Boolean.valueOf(z);
        m22902C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m22909r0() {
        duringCreated(CoreModule.f1534c.f3628e0.m21366J7()).map(new w9j() { // from class: l.ms4
            public final Object call(Object obj) {
                return ((SettingGroups) obj).subscription.refuseSMS;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ns4
            public final void call(Object obj) {
                this.f17829a.m22910s0((Boolean) obj);
            }
        }, new e30() { // from class: l.os4
            public final void call(Object obj) {
                rs4.m22889e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m22910s0(Boolean bool) {
        if (this.f20701d == null) {
            this.f20701d = UserSubscriptionSettings.new_();
        }
        ((at4) ((jq2) this).viewModel).m12199B(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m22911y0(roj0 roj0Var) {
        act().progressDismiss();
        ((at4) ((jq2) this).viewModel).m12197A(this.f20700c.showMomentLikes().booleanValue(), this.f20700c.previewPushMessage().booleanValue(), ((Boolean) f20696e.get()).booleanValue(), ((Boolean) f20697f.get()).booleanValue());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m22912z0(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    public void destroy() {
    }
}
