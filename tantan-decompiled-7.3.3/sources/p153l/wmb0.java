package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.data.UserPushSettings;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class wmb0 extends ar2<rnb0> {

    /* JADX INFO: renamed from: a */
    public User f189788a;

    /* JADX INFO: renamed from: b */
    public Settings f189789b;

    public wmb0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m207095i0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m207096m0(Bundle bundle) {
        ((rnb0) this.viewModel).m182210r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m207097n0(User user) {
        this.f189788a = user;
        if (this.f189789b == null) {
            this.f189789b = user.settings.mo225055clone();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.rmb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163841a.m207096m0((Bundle) obj);
            }
        });
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.smb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.tmb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174908a.m207097n0((User) obj);
            }
        }));
        m207100l0();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(rnb0 rnb0Var) {
        super.mo52715C(rnb0Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m207099k0(boolean z) {
        this.f189789b.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        if (NullChecker.m82486a(this.f189788a) && NullChecker.m82486a(this.f189789b) && CoreModule.m30929H().signedIn_() && !this.f189789b.equals(this.f189788a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f189789b.previewPushMessage();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f189788a.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                m207101o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m207100l0() {
        ((rnb0) this.viewModel).m182198B();
    }

    /* JADX INFO: renamed from: o0 */
    public void m207101o0(SettingGroups settingGroups) {
        CoreModule.f18264c.f20405m0.m32124k8(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.umb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wmb0.m207095i0((uxj0) obj);
            }
        }, new y20() { // from class: l.vmb0
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m207102p0(String str) {
        this.f189789b.getSettingGroup().live.voiceNotification = str;
        if (NullChecker.m82486a(this.f189788a) && NullChecker.m82486a(this.f189789b) && CoreModule.m30929H().signedIn_() && !this.f189789b.equals(this.f189788a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            settingGroups.live = userLiveSettings;
            userLiveSettings.voiceNotification = this.f189789b.getSettingGroup().live.voiceNotification;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f189788a.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                m207101o0(settingGroupsSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m207103q0(String str, boolean z) {
        m207104r0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public void m207104r0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f18264c.f20381e0.m116482K9(str, z, i, i2)).subscribe(psd0.m173601L(psd0.m173591B()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
