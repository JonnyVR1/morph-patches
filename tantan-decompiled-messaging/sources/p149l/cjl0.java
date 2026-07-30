package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class cjl0 extends jq2<ljl0> {

    /* JADX INFO: renamed from: h */
    public static double f81199h = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public DoublePair f81200a;

    /* JADX INFO: renamed from: b */
    public mjj f81201b;

    /* JADX INFO: renamed from: c */
    public boolean f81202c;

    /* JADX INFO: renamed from: d */
    public DoublePair f81203d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f81204e;

    /* JADX INFO: renamed from: f */
    public DoublePair f81205f;

    /* JADX INFO: renamed from: g */
    public String f81206g;

    public cjl0(mcr mcrVar) {
        super(mcrVar);
        this.f81204e = RoamedLocationData.new_();
        this.f81205f = DoublePair.new_();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m107179C0(final Act act, MessageLocation messageLocation, final d30 d30Var) {
        act.progress(R$string.f17842J5, true);
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.roamingLatitude = Double.valueOf(messageLocation.coordinates.first);
        settingGroups.search.roamingLongitude = Double.valueOf(messageLocation.coordinates.second);
        CoreModule.f17545c.f19663m0.m31121k8(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.mil0
            @Override // p149l.e30
            public final void call(Object obj) {
                cjl0.m107211y0(act, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.nil0
            @Override // p149l.e30
            public final void call(Object obj) {
                cjl0.m107195g0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m107180D0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m107179C0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m107181E0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f81199h && Math.abs(doublePair.second - doublePair2.second) < f81199h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m107182N0(Bundle bundle) {
        this.f81201b = mjj.m154842c(act(), true);
        ((ljl0) this.viewModel).m150008r();
        if (pvv.m171693c()) {
            return;
        }
        wvv.m205767g(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m107183O0(d90 d90Var) {
        ((ljl0) this.viewModel).m150002B(d90Var.mo110405b(), d90Var.mo110404a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m107184P0(j760 j760Var) {
        ((ljl0) this.viewModel).m150003C(j760Var);
        DoublePair latitudeAndLongitude = ((User) j760Var.f116564a).getLatitudeAndLongitude();
        this.f81200a = latitudeAndLongitude;
        if (!latitudeAndLongitude.equals(DoublePair.new_()) && !vwb.m200337m(((RoamedLocationData) j760Var.f116565b).data, new w9j() { // from class: l.til0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170592a.m107191X0((MessageLocation) obj);
            }
        })) {
            m107180D0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) j760Var.f116565b;
        this.f81204e = roamedLocationData;
        ((ljl0) this.viewModel).m150005l(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m107185Q0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            qib0.f154687E.m78871w(true);
            ((ljl0) this.viewModel).m150010z(wvv.m205781u() || wvv.m205780t());
        } else if (c4319c == C4319c.f15550k) {
            zvf0.m220369B("e_vip_history_page_location_info", "", vwb.m200311Y("is_location_success", Boolean.valueOf(qib0.f154687E.m78865q() != null)));
        } else if (c4319c == C4319c.f15552m && this.f81202c) {
            CoreModule.f17545c.f19657k0.f20088R.m121229A(this.f81204e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m107186R0(Boolean bool) {
        if (bool.booleanValue() && TextUtils.equals(this.f81206g, "p_youthvip_page")) {
            ((ljl0) this.viewModel).m150001A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m107187S0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f81203d = doublePair;
        doublePair.first = location.m78831u();
        this.f81203d.second = location.m78833x();
        this.f81201b.m154844e(act(), location.m78831u(), location.m78833x(), new e30() { // from class: l.oil0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144139a.m107183O0((d90) obj);
            }
        }, new e30() { // from class: l.pil0
            @Override // p149l.e30
            public final void call(Object obj) {
                App.f15368d.m20433k((Throwable) obj);
            }
        });
        ((ljl0) this.viewModel).m150010z(wvv.m205781u() || wvv.m205780t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m107188U0(Location location) {
        if (!pvv.m171693c() || wvv.m205775o()) {
            return;
        }
        CoreDlg.m45038X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m107189V0() {
        hfw.m130790a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.m45038X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m107190W0(Throwable th) {
        if (((ljl0) this.viewModel).m150007p()) {
            return;
        }
        e51.m114741F(act(), new Runnable() { // from class: l.ril0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159566a.m107189V0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ Boolean m107191X0(MessageLocation messageLocation) {
        return Boolean.valueOf(m107181E0(messageLocation.coordinates, this.f81200a));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m107192Y0(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f81204e.data.add(0, messageLocation);
        CoreModule.f17545c.f19657k0.f20088R.m121229A(this.f81204e);
        m107179C0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m107195g0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ j760 m107203o0(User user, RoamedLocationData roamedLocationData) {
        return new j760(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m107211y0(Act act, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m107213F0(Intent intent) {
        final DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            doublePair.first = 1.0E-12d;
        }
        boolean zM107181E0 = m107181E0(doublePair, this.f81203d);
        MessageLocation messageLocation = (MessageLocation) vwb.m200346r(this.f81204e.data, new w9j() { // from class: l.hil0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.m107181E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM107181E0) {
            if (this.f81200a.equals(DoublePair.new_())) {
                return;
            }
            m107180D0(act());
        } else if (NullChecker.m81303a(messageLocation)) {
            m107179C0(act(), messageLocation, null);
        } else {
            this.f81201b.m154844e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.sil0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164721a.m107217J0(stringExtra, doublePair, (d90) obj);
                }
            }, new e30() { // from class: l.uil0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176658a.m107218L0(doublePair, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public String m107214G0() {
        return this.f81206g;
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m107215H0() {
        return this.f81204e;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m107216I0() {
        return this.f81200a;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m107217J0(String str, DoublePair doublePair, d90 d90Var) {
        String strMo110405b = !TextUtils.isEmpty(d90Var.mo110405b()) ? d90Var.mo110405b() : act().string(R$string.f18010On);
        if (TextUtils.isEmpty(str)) {
            str = d90Var.mo110404a();
        }
        m107192Y0(doublePair, strMo110405b, str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m107218L0(DoublePair doublePair, String str, Throwable th) {
        m107192Y0(doublePair, act().string(R$string.f18010On), str);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f81206g = act().getIntent().getStringExtra("from");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.vil0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181618a.m107182N0((Bundle) obj);
            }
        });
        duringCreated(qib0.f154687E.m78864p()).subscribe(mkd0.m154955G(new e30() { // from class: l.xil0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193137a.m107187S0((Location) obj);
            }
        }));
        if (wvv.m205777q()) {
            duringCreated(qib0.f154687E.m78864p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe(mkd0.m154959K(new e30() { // from class: l.yil0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198518a.m107188U0((Location) obj);
                }
            }, new e30() { // from class: l.zil0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203343a.m107190W0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new v9j() { // from class: l.ajl0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19657k0.f20088R.m121230k(), new x9j() { // from class: l.qil0
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return cjl0.m107203o0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bjl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75921a.m107184P0((j760) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.iil0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113414a.m107185Q0((C4319c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.jil0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kil0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154687E.m78868t();
            }
        }));
        if (g6a.m124577z()) {
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("youthVip")).map(new w9j() { // from class: l.lil0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!xma.m210055T3((UserPrivilege) obj));
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.wil0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186553a.m107186R0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m107219a1(boolean z) {
        this.f81202c = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
