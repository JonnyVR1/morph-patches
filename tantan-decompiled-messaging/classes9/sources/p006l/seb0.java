package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.UserPushSettings;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class seb0 extends jq2<nfb0> {

    /* JADX INFO: renamed from: a */
    public User f21271a;

    /* JADX INFO: renamed from: b */
    public Settings f21272b;

    public seb0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m23695i0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m23696m0(Bundle bundle) {
        ((nfb0) ((jq2) this).viewModel).m20120r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m23697n0(User user) {
        this.f21271a = user;
        if (this.f21272b == null) {
            this.f21272b = user.settings.clone();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m23699a0() {
        creates(new e30() { // from class: l.neb0
            public final void call(Object obj) {
                this.f17630a.m23696m0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.oeb0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.peb0
            public final void call(Object obj) {
                this.f18699a.m23697n0((User) obj);
            }
        }));
        m23702l0();
    }

    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void m23698C(nfb0 nfb0Var) {
        super.C(nfb0Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m23701k0(boolean z) {
        this.f21272b.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        if (NullChecker.a(this.f21271a) && NullChecker.a(this.f21272b) && CoreModule.m1850H().signedIn_() && !this.f21272b.equals(this.f21271a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f21272b.previewPushMessage();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f21271a.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                m23703o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m23702l0() {
        ((nfb0) ((jq2) this).viewModel).m20106B();
    }

    /* JADX INFO: renamed from: o0 */
    public void m23703o0(SettingGroups settingGroups) {
        CoreModule.f1534c.f3652m0.m3051k8(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.qeb0
            public final void call(Object obj) {
                seb0.m23695i0((roj0) obj);
            }
        }, new e30() { // from class: l.reb0
            public final void call(Object obj) {
                yij0.D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m23704p0(String str) {
        this.f21272b.getSettingGroup().live.voiceNotification = str;
        if (NullChecker.a(this.f21271a) && NullChecker.a(this.f21272b) && CoreModule.m1850H().signedIn_() && !this.f21272b.equals(this.f21271a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            settingGroups.live = userLiveSettings;
            userLiveSettings.voiceNotification = this.f21272b.getSettingGroup().live.voiceNotification;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f21271a.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                m23703o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m23705q0(String str, boolean z) {
        m23706r0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public void m23706r0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f1534c.f3628e0.m21372K9(str, z, i, i2)).subscribe(mkd0.L(mkd0.B()));
    }

    public void destroy() {
    }
}
