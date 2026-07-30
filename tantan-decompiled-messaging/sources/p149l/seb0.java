package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.data.UserPushSettings;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class seb0 extends jq2<nfb0> {

    /* JADX INFO: renamed from: a */
    public User f163939a;

    /* JADX INFO: renamed from: b */
    public Settings f163940b;

    public seb0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m183588i0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m183589m0(Bundle bundle) {
        ((nfb0) this.viewModel).m159221r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m183590n0(User user) {
        this.f163939a = user;
        if (this.f163940b == null) {
            this.f163940b = user.settings.mo223809clone();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.neb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138600a.m183589m0((Bundle) obj);
            }
        });
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.oeb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.peb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148416a.m183590n0((User) obj);
            }
        }));
        m183593l0();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(nfb0 nfb0Var) {
        super.mo51532C(nfb0Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m183592k0(boolean z) {
        this.f163940b.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        if (NullChecker.m81303a(this.f163939a) && NullChecker.m81303a(this.f163940b) && CoreModule.m29931H().signedIn_() && !this.f163940b.equals(this.f163939a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f163940b.previewPushMessage();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f163939a.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                m183594o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m183593l0() {
        ((nfb0) this.viewModel).m159209B();
    }

    /* JADX INFO: renamed from: o0 */
    public void m183594o0(SettingGroups settingGroups) {
        CoreModule.f17545c.f19663m0.m31121k8(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.qeb0
            @Override // p149l.e30
            public final void call(Object obj) {
                seb0.m183588i0((roj0) obj);
            }
        }, new e30() { // from class: l.reb0
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m183595p0(String str) {
        this.f163940b.getSettingGroup().live.voiceNotification = str;
        if (NullChecker.m81303a(this.f163939a) && NullChecker.m81303a(this.f163940b) && CoreModule.m29931H().signedIn_() && !this.f163940b.equals(this.f163939a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            settingGroups.live = userLiveSettings;
            userLiveSettings.voiceNotification = this.f163940b.getSettingGroup().live.voiceNotification;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f163939a.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                m183594o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m183596q0(String str, boolean z) {
        m183597r0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public void m183597r0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f17545c.f19639e0.m169409K9(str, z, i, i2)).subscribe(mkd0.m154960L(mkd0.m154950B()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
