package p149l;

import android.net.NetworkInfo;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class sp80 extends jq2<zp80> {

    /* JADX INFO: renamed from: a */
    public User f165755a;

    /* JADX INFO: renamed from: b */
    public Settings f165756b;

    /* JADX INFO: renamed from: c */
    public PrivacyMembershipSetting f165757c;

    /* JADX INFO: renamed from: d */
    public u640 f165758d;

    /* JADX INFO: renamed from: e */
    public in80 f165759e;

    /* JADX INFO: renamed from: f */
    public Act f165760f;

    public sp80(mcr mcrVar) {
        super(mcrVar);
        this.f165760f = (Act) mcrVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m185330e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m185335j0(NetworkInfo networkInfo) {
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m185340p0(User user) {
        this.f165755a = user;
        Settings settings = this.f165756b;
        Settings settingsSubtract = settings == null ? null : user.settings.subtract(settings);
        if (this.f165756b == null || NullChecker.m81303a(settingsSubtract)) {
            Settings settingsMo223809clone = user.settings.mo223809clone();
            this.f165756b = settingsMo223809clone;
            ((zp80) this.viewModel).m219640A(settingsMo223809clone);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m185341y0() {
        if (NullChecker.m81303a(this.f165757c) && xma.m210047L3()) {
            duringCreated(CoreModule.f17545c.f19561E0.m203788R3(this.f165757c)).subscribe(mkd0.m154956H(new e30() { // from class: l.lp80
                @Override // p149l.e30
                public final void call(Object obj) {
                    sp80.m185330e0((roj0) obj);
                }
            }, new e30() { // from class: l.mp80
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        u640 u640Var = new u640(this.f165760f);
        this.f165758d = u640Var;
        in80 in80Var = new in80(this.f165760f);
        this.f165759e = in80Var;
        u640Var.mo51532C(in80Var);
        this.f165759e.mo21065i1(this.f165758d);
        CoreModule.f17545c.f19561E0.m203796Z3();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.hp80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ip80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114275a.m185340p0((User) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.jp80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kp80
            @Override // p149l.e30
            public final void call(Object obj) {
                sp80.m185335j0((NetworkInfo) obj);
            }
        }));
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(zp80 zp80Var) {
        super.mo51532C(zp80Var);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m185343q0(roj0 roj0Var) {
        ((zp80) this.viewModel).m219652y();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m185344r0(Throwable th) {
        ((zp80) this.viewModel).m219651x(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m185345s0() {
        this.f165756b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((zp80) this.viewModel).m219642C());
        m185348x0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m185346t0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((zp80) this.viewModel).m219646m(false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m185347u0(SettingGroups settingGroups) {
        CoreModule.f17545c.f19663m0.m31121k8(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.np80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139938a.m185343q0((roj0) obj);
            }
        }, new e30() { // from class: l.op80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144957a.m185344r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m185348x0() {
        if (NullChecker.m81303a(this.f165755a) && NullChecker.m81303a(this.f165756b) && CoreModule.m29931H().signedIn_() && !this.f165756b.equals(this.f165755a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f165756b.hideContacts();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.radius = this.f165756b.getSearchRadius();
            settingGroups.search.invisibleRadius = this.f165756b.getSettingGroup().search.invisibleRadius;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f165755a.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                ((zp80) this.viewModel).m219653z(act().getString(R$string.f17842J5), true);
                m185347u0(settingGroupsSubtract);
            }
        }
        m185341y0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m185349z0(boolean z) {
        if (!z) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.pp80
                @Override // p149l.d30
                public final void call() {
                    this.f150632a.m185345s0();
                }
            }, new e30() { // from class: l.qp80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155680a.m185346t0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act());
            return;
        }
        this.f165756b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((zp80) this.viewModel).m219642C());
        m185348x0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
