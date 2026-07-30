package p006l;

import android.net.NetworkInfo;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sp80 extends jq2<zp80> {

    /* JADX INFO: renamed from: a */
    public User f21558a;

    /* JADX INFO: renamed from: b */
    public Settings f21559b;

    /* JADX INFO: renamed from: c */
    public PrivacyMembershipSetting f21560c;

    /* JADX INFO: renamed from: d */
    public u640 f21561d;

    /* JADX INFO: renamed from: e */
    public in80 f21562e;

    /* JADX INFO: renamed from: f */
    public Act f21563f;

    public sp80(mcr mcrVar) {
        super(mcrVar);
        this.f21563f = (Act) mcrVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m24004e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m24009j0(NetworkInfo networkInfo) {
        CoreModule.f1534c.f3553F0.m12317q3();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m24014p0(User user) {
        this.f21558a = user;
        Settings settings = this.f21559b;
        Settings settingsSubtract = settings == null ? null : user.settings.subtract(settings);
        if (this.f21559b == null || NullChecker.a(settingsSubtract)) {
            Settings settingsClone = user.settings.clone();
            this.f21559b = settingsClone;
            ((zp80) ((jq2) this).viewModel).m28766A(settingsClone);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m24015y0() {
        if (NullChecker.a(this.f21560c) && xma.m27355L3()) {
            duringCreated(CoreModule.f1534c.f3550E0.m26480R3(this.f21560c)).subscribe(mkd0.H(new e30() { // from class: l.lp80
                public final void call(Object obj) {
                    sp80.m24004e0((roj0) obj);
                }
            }, new e30() { // from class: l.mp80
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m24017Z() {
        super.Z();
        u640 u640Var = new u640(this.f21563f);
        this.f21561d = u640Var;
        in80 in80Var = new in80(this.f21563f);
        this.f21562e = in80Var;
        u640Var.C(in80Var);
        this.f21562e.m28103i1(this.f21561d);
        CoreModule.f1534c.f3550E0.m26488Z3();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24018a0() {
        super.a0();
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.hp80
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ip80
            public final void call(Object obj) {
                this.f14623a.m24014p0((User) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.jp80
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kp80
            public final void call(Object obj) {
                sp80.m24009j0((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void m24016C(zp80 zp80Var) {
        super.C(zp80Var);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m24020q0(roj0 roj0Var) {
        ((zp80) ((jq2) this).viewModel).m28780y();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m24021r0(Throwable th) {
        ((zp80) ((jq2) this).viewModel).m28779x(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m24022s0() {
        this.f21559b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((zp80) ((jq2) this).viewModel).m28768C());
        m24025x0();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m24023t0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ((zp80) ((jq2) this).viewModel).m28774m(false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m24024u0(SettingGroups settingGroups) {
        CoreModule.f1534c.f3652m0.m3051k8(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.np80
            public final void call(Object obj) {
                this.f17791a.m24020q0((roj0) obj);
            }
        }, new e30() { // from class: l.op80
            public final void call(Object obj) {
                this.f18315a.m24021r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m24025x0() {
        if (NullChecker.a(this.f21558a) && NullChecker.a(this.f21559b) && CoreModule.m1850H().signedIn_() && !this.f21559b.equals(this.f21558a.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
            settingGroups.privacy = userPrivacySettings;
            userPrivacySettings.hideContacts = this.f21559b.hideContacts();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.radius = this.f21559b.getSearchRadius();
            settingGroups.search.invisibleRadius = this.f21559b.getSettingGroup().search.invisibleRadius;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f21558a.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                ((zp80) ((jq2) this).viewModel).m28781z(act().getString(R$string.f1831J5), true);
                m24024u0(settingGroupsSubtract);
            }
        }
        m24015y0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m24026z0(boolean z) {
        if (!z) {
            PermissionHelper.c().r(new String[]{"android.permission.READ_CONTACTS"}).w(false).u(false).m(new d30() { // from class: l.pp80
                public final void call() {
                    this.f19256a.m24022s0();
                }
            }, new e30() { // from class: l.qp80
                public final void call(Object obj) {
                    this.f19965a.m24023t0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act());
            return;
        }
        this.f21559b.getSettingGroup().privacy.hideContacts = Boolean.valueOf(((zp80) ((jq2) this).viewModel).m28768C());
        m24025x0();
    }

    public void destroy() {
    }
}
