package p153l;

import android.net.NetworkInfo;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class wx80 extends ar2<dy80> {

    /* JADX INFO: renamed from: a */
    public User f191378a;

    /* JADX INFO: renamed from: b */
    public Settings f191379b;

    /* JADX INFO: renamed from: c */
    public PrivacyMembershipSetting f191380c;

    /* JADX INFO: renamed from: d */
    public if40 f191381d;

    /* JADX INFO: renamed from: e */
    public mv80 f191382e;

    /* JADX INFO: renamed from: f */
    public Act f191383f;

    public wx80(ner nerVar) {
        super(nerVar);
        this.f191383f = (Act) nerVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m208375e0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m208380j0(NetworkInfo networkInfo) {
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m208385p0(User user) {
        this.f191378a = user;
        Settings settings = this.f191379b;
        Settings settingsSubtract = settings == null ? null : user.settings.subtract(settings);
        if (this.f191379b == null || NullChecker.m82486a(settingsSubtract)) {
            Settings settingsMo225055clone = user.settings.mo225055clone();
            this.f191379b = settingsMo225055clone;
            ((dy80) this.viewModel).m118630A(settingsMo225055clone);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m208386y0() {
        if (NullChecker.m82486a(this.f191380c) && joa.m146361M3()) {
            duringCreated(CoreModule.f18264c.f20303E0.m141076R3(this.f191380c)).subscribe(psd0.m173597H(new y20() { // from class: l.px80
                @Override // p153l.y20
                public final void call(Object obj) {
                    wx80.m208375e0((uxj0) obj);
                }
            }, new y20() { // from class: l.qx80
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        if40 if40Var = new if40(this.f191383f);
        this.f191381d = if40Var;
        mv80 mv80Var = new mv80(this.f191383f);
        this.f191382e = mv80Var;
        if40Var.mo52715C(mv80Var);
        this.f191382e.mo22064i1(this.f191381d);
        CoreModule.f18264c.f20303E0.m141084Z3();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.lx80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.mx80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139209a.m208385p0((User) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.nx80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ox80
            @Override // p153l.y20
            public final void call(Object obj) {
                wx80.m208380j0((NetworkInfo) obj);
            }
        }));
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(dy80 dy80Var) {
        super.mo52715C(dy80Var);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m208388q0(uxj0 uxj0Var) {
        ((dy80) this.viewModel).m118642y();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m208389r0(Throwable th) {
        ((dy80) this.viewModel).m118641x(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m208390s0() {
        this.f191379b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((dy80) this.viewModel).m118632C());
        m208393x0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m208391t0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((dy80) this.viewModel).m118636m(false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m208392u0(SettingGroups settingGroups) {
        CoreModule.f18264c.f20405m0.m32124k8(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.rx80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165315a.m208388q0((uxj0) obj);
            }
        }, new y20() { // from class: l.sx80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171095a.m208389r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m208393x0() {
        if (NullChecker.m82486a(this.f191378a) && NullChecker.m82486a(this.f191379b) && CoreModule.m30929H().signedIn_() && !this.f191379b.equals(this.f191378a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f191379b.hideContacts();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.radius = this.f191379b.getSearchRadius();
            settingGroups.search.invisibleRadius = this.f191379b.getSettingGroup().search.invisibleRadius;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f191378a.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                ((dy80) this.viewModel).m118643z(act().getString(R$string.f18632L5), true);
                m208392u0(settingGroupsSubtract);
            }
        }
        m208386y0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m208394z0(boolean z) {
        if (!z) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.tx80
                @Override // p153l.x20
                public final void call() {
                    this.f176533a.m208390s0();
                }
            }, new y20() { // from class: l.ux80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181354a.m208391t0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act());
            return;
        }
        this.f191379b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((dy80) this.viewModel).m118632C());
        m208393x0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
