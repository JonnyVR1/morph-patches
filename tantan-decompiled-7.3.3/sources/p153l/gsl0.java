package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class gsl0 extends ar2<psl0> {

    /* JADX INFO: renamed from: h */
    public static double f106303h = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public DoublePair f106304a;

    /* JADX INFO: renamed from: b */
    public fmj f106305b;

    /* JADX INFO: renamed from: c */
    public boolean f106306c;

    /* JADX INFO: renamed from: d */
    public DoublePair f106307d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f106308e;

    /* JADX INFO: renamed from: f */
    public DoublePair f106309f;

    /* JADX INFO: renamed from: g */
    public String f106310g;

    public gsl0(ner nerVar) {
        super(nerVar);
        this.f106308e = RoamedLocationData.new_();
        this.f106309f = DoublePair.new_();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m132070C0(final Act act, MessageLocation messageLocation, final x20 x20Var) {
        act.progress(R$string.f18632L5, true);
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.roamingLatitude = Double.valueOf(messageLocation.coordinates.first);
        settingGroups.search.roamingLongitude = Double.valueOf(messageLocation.coordinates.second);
        CoreModule.f18264c.f20405m0.m32124k8(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.qrl0
            @Override // p153l.y20
            public final void call(Object obj) {
                gsl0.m132102y0(act, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.rrl0
            @Override // p153l.y20
            public final void call(Object obj) {
                gsl0.m132086g0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m132071D0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m132070C0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m132072E0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f106303h && Math.abs(doublePair.second - doublePair2.second) < f106303h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m132073N0(Bundle bundle) {
        this.f106305b = fmj.m126236c(act(), true);
        ((psl0) this.viewModel).m173682r();
        if (qxv.m178618c()) {
            return;
        }
        xxv.m213580g(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m132074O0(z80 z80Var) {
        ((psl0) this.viewModel).m173676B(z80Var.mo143670b(), z80Var.mo143669a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m132075P0(pf60 pf60Var) {
        ((psl0) this.viewModel).m173677C(pf60Var);
        DoublePair latitudeAndLongitude = ((User) pf60Var.f152156a).getLatitudeAndLongitude();
        this.f106304a = latitudeAndLongitude;
        if (!latitudeAndLongitude.equals(DoublePair.new_()) && !jyb.m147520m(((RoamedLocationData) pf60Var.f152157b).data, new qcj() { // from class: l.xrl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195933a.m132082X0((MessageLocation) obj);
            }
        })) {
            m132071D0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) pf60Var.f152157b;
        this.f106308e = roamedLocationData;
        ((psl0) this.viewModel).m173679l(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m132076Q0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            uqb0.f180370E.m80054w(true);
            ((psl0) this.viewModel).m173684z(xxv.m213594u() || xxv.m213593t());
        } else if (c4470c == C4470c.f16269k) {
            i4g0.m138493B("e_vip_history_page_location_info", "", jyb.m147494Y("is_location_success", Boolean.valueOf(uqb0.f180370E.m80048q() != null)));
        } else if (c4470c == C4470c.f16271m && this.f106306c) {
            CoreModule.f18264c.f20399k0.f20830R.m159273A(this.f106308e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m132077R0(Boolean bool) {
        if (bool.booleanValue() && TextUtils.equals(this.f106310g, "p_youthvip_page")) {
            ((psl0) this.viewModel).m173675A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m132078S0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f106307d = doublePair;
        doublePair.first = location.m80014u();
        this.f106307d.second = location.m80016x();
        this.f106305b.m126239e(act(), location.m80014u(), location.m80016x(), new y20() { // from class: l.srl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170358a.m132074O0((z80) obj);
            }
        }, new y20() { // from class: l.trl0
            @Override // p153l.y20
            public final void call(Object obj) {
                App.f16087d.m21432k((Throwable) obj);
            }
        });
        ((psl0) this.viewModel).m173684z(xxv.m213594u() || xxv.m213593t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m132079U0(Location location) {
        if (!qxv.m178618c() || xxv.m213588o()) {
            return;
        }
        CoreDlg.m46221X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m132080V0() {
        fhw.m125605a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.m46221X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m132081W0(Throwable th) {
        if (((psl0) this.viewModel).m173681p()) {
            return;
        }
        l51.m152886F(act(), new Runnable() { // from class: l.vrl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185496a.m132080V0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ Boolean m132082X0(MessageLocation messageLocation) {
        return Boolean.valueOf(m132072E0(messageLocation.coordinates, this.f106304a));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m132083Y0(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f106308e.data.add(0, messageLocation);
        CoreModule.f18264c.f20399k0.f20830R.m159273A(this.f106308e);
        m132070C0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m132086g0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ pf60 m132094o0(User user, RoamedLocationData roamedLocationData) {
        return new pf60(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m132102y0(Act act, x20 x20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m132104F0(Intent intent) {
        final DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            doublePair.first = 1.0E-12d;
        }
        boolean zM132072E0 = m132072E0(doublePair, this.f106307d);
        MessageLocation messageLocation = (MessageLocation) jyb.m147529r(this.f106308e.data, new qcj() { // from class: l.lrl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(gsl0.m132072E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM132072E0) {
            if (this.f106304a.equals(DoublePair.new_())) {
                return;
            }
            m132071D0(act());
        } else if (NullChecker.m82486a(messageLocation)) {
            m132070C0(act(), messageLocation, null);
        } else {
            this.f106305b.m126239e(act(), doublePair.first, doublePair.second, new y20() { // from class: l.wrl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190529a.m132108J0(stringExtra, doublePair, (z80) obj);
                }
            }, new y20() { // from class: l.yrl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201328a.m132109L0(doublePair, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public String m132105G0() {
        return this.f106310g;
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m132106H0() {
        return this.f106308e;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m132107I0() {
        return this.f106304a;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m132108J0(String str, DoublePair doublePair, z80 z80Var) {
        String strMo143670b = !TextUtils.isEmpty(z80Var.mo143670b()) ? z80Var.mo143670b() : act().string(R$string.f19439lo);
        if (TextUtils.isEmpty(str)) {
            str = z80Var.mo143669a();
        }
        m132083Y0(doublePair, strMo143670b, str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m132109L0(DoublePair doublePair, String str, Throwable th) {
        m132083Y0(doublePair, act().string(R$string.f19439lo), str);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f106310g = act().getIntent().getStringExtra("from");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zrl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205770a.m132073N0((Bundle) obj);
            }
        });
        duringCreated(uqb0.f180370E.m80047p()).subscribe(psd0.m173596G(new y20() { // from class: l.bsl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78174a.m132078S0((Location) obj);
            }
        }));
        if (xxv.m213590q()) {
            duringCreated(uqb0.f180370E.m80047p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe(psd0.m173600K(new y20() { // from class: l.csl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83465a.m132079U0((Location) obj);
                }
            }, new y20() { // from class: l.dsl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90495a.m132081W0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new pcj() { // from class: l.esl0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20399k0.f20830R.m159274k(), new rcj() { // from class: l.url0
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return gsl0.m132094o0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fsl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100641a.m132075P0((pf60) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.mrl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138391a.m132076Q0((C4470c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.nrl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.orl0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180370E.m80051t();
            }
        }));
        if (s7a.m184997z()) {
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("youthVip")).map(new qcj() { // from class: l.prl0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!joa.m146369U3((UserPrivilege) obj));
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.asl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73143a.m132077R0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m132110a1(boolean z) {
        this.f106306c = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
