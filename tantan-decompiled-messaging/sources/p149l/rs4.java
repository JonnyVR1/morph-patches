package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPushSettings;
import com.p046p1.mobile.putong.data.UserSubscriptionSettings;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class rs4 extends jq2<at4> {

    /* JADX INFO: renamed from: e */
    public static hpd0 f160804e = new hpd0("enter_as_send", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static hpd0 f160805f = new hpd0("enable_recommended_stickers", Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public String f160806a;

    /* JADX INFO: renamed from: b */
    public User f160807b;

    /* JADX INFO: renamed from: c */
    public Settings f160808c;

    /* JADX INFO: renamed from: d */
    public UserSubscriptionSettings f160809d;

    public rs4(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m180616e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m180625t0(Bundle bundle) {
        ((at4) this.viewModel).m98752A3(this.f160806a);
        if (IntlCountryCodeController.m28113i()) {
            m180635r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m180626u0(User user) {
        this.f160807b = user;
        if (this.f160808c == null) {
            this.f160808c = user.settings.mo223809clone();
        }
        ((at4) this.viewModel).m98762z();
        ((at4) this.viewModel).m98751A(this.f160808c.showMomentLikes().booleanValue(), this.f160808c.previewPushMessage().booleanValue(), f160804e.get().booleanValue(), f160805f.get().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m180627x0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f160807b == null) {
            ((at4) this.viewModel).m98754C();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m180628A0(String str) {
        this.f160806a = str;
    }

    /* JADX INFO: renamed from: C0 */
    public void m180629C0() {
        if (NullChecker.m81303a(this.f160807b) && NullChecker.m81303a(this.f160808c) && CoreModule.m29931H().signedIn_() && !this.f160808c.equals(this.f160807b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f160808c.previewPushMessage();
            settingGroups.push.showMomentLikes = this.f160808c.showMomentLikes();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f160807b.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f17842J5), true);
                CoreModule.f17545c.f19663m0.m31121k8(settingGroupsSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.ps4
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f150973a.m180637y0((roj0) obj);
                    }
                }, new e30() { // from class: l.qs4
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f156099a.m180638z0((Throwable) obj);
                    }
                }));
            }
        }
        if (IntlCountryCodeController.m28113i() && NullChecker.m81303a(this.f160809d) && CoreModule.m29931H().signedIn_()) {
            CoreModule.f17545c.f19639e0.m169377C9(this.f160809d);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m180630D0(boolean z) {
        this.f160809d.refuseSMS = Boolean.valueOf(z);
        m180629C0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.is4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114731a.m180625t0((Bundle) obj);
            }
        });
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.js4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ks4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124417a.m180626u0((User) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ls4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129802a.m180627x0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m180631n0(boolean z) {
        f160805f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o0 */
    public void m180632o0(boolean z) {
        f160804e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: p0 */
    public void m180633p0(boolean z) {
        this.f160808c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m180629C0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m180634q0(boolean z) {
        this.f160808c.getSettingGroup().push.showMomentLikes = Boolean.valueOf(z);
        m180629C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m180635r0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169403J7()).map(new w9j() { // from class: l.ms4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SettingGroups) obj).subscription.refuseSMS;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ns4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140237a.m180636s0((Boolean) obj);
            }
        }, new e30() { // from class: l.os4
            @Override // p149l.e30
            public final void call(Object obj) {
                rs4.m180616e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m180636s0(Boolean bool) {
        if (this.f160809d == null) {
            this.f160809d = UserSubscriptionSettings.new_();
        }
        ((at4) this.viewModel).m98753B(bool.booleanValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m180637y0(roj0 roj0Var) {
        act().progressDismiss();
        ((at4) this.viewModel).m98751A(this.f160808c.showMomentLikes().booleanValue(), this.f160808c.previewPushMessage().booleanValue(), f160804e.get().booleanValue(), f160805f.get().booleanValue());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m180638z0(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
