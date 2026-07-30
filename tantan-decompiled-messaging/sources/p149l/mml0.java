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
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class mml0 extends jq2<uml0> {

    /* JADX INFO: renamed from: a */
    public mjj f134673a;

    /* JADX INFO: renamed from: b */
    public DoublePair f134674b;

    /* JADX INFO: renamed from: c */
    public DoublePair f134675c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f134676d;

    /* JADX INFO: renamed from: e */
    public boolean f134677e;

    public mml0(mcr mcrVar) {
        super(mcrVar);
        this.f134676d = RoamedLocationData.new_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m155442P0(Bundle bundle) {
        this.f134673a = mjj.m154842c(act(), true);
        ((uml0) this.viewModel).m194389r();
        if (!pvv.m171693c()) {
            wvv.m205767g(act());
        }
        m155467D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m155443R0(j760 j760Var) {
        ((uml0) this.viewModel).m194394y(j760Var);
        DoublePair momentRoamLatitudeAndLongitude = ((User) j760Var.f116564a).getMomentRoamLatitudeAndLongitude();
        this.f134675c = momentRoamLatitudeAndLongitude;
        if (!momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) && !vwb.m200337m(((RoamedLocationData) j760Var.f116565b).data, new w9j() { // from class: l.dml0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86955a.m155480Y0((MessageLocation) obj);
            }
        })) {
            m155469F0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) j760Var.f116565b;
        this.f134676d = roamedLocationData;
        ((uml0) this.viewModel).m194386k(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m155444U0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f134674b = doublePair;
        doublePair.first = location.m78831u();
        this.f134674b.second = location.m78833x();
        this.f134673a.m154844e(act(), location.m78831u(), location.m78833x(), new e30() { // from class: l.aml0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70630a.m155477Q0((d90) obj);
            }
        }, new e30() { // from class: l.cml0
            @Override // p149l.e30
            public final void call(Object obj) {
                App.f15368d.m20433k((Throwable) obj);
            }
        });
        ((uml0) this.viewModel).m194392w(wvv.m205781u() || wvv.m205780t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m155445W0() {
        hfw.m130790a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.m45038X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m155446X0(Throwable th) {
        if (((uml0) this.viewModel).m194388m()) {
            return;
        }
        e51.m114741F(act(), new Runnable() { // from class: l.wll0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186962a.m155445W0();
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m155459q0(Act act, d30 d30Var, SettingGroups settingGroups) {
        act.progressDismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ j760 m155460r0(User user, RoamedLocationData roamedLocationData) {
        return new j760(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m155465y0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m155467D0() {
        final DoublePair momentRoamLatitudeAndLongitude = CoreModule.m29932K().me_().getMomentRoamLatitudeAndLongitude();
        RoamedLocationData roamedLocationDataM121232m = CoreModule.f17545c.f19657k0.f20089S.m121232m();
        if (NullChecker.m81303a(roamedLocationDataM121232m)) {
            this.f134676d = roamedLocationDataM121232m;
        }
        if (momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) || vwb.m200337m(this.f134676d.data, new w9j() { // from class: l.tll0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(pll0.m170238a(((MessageLocation) obj).coordinates, momentRoamLatitudeAndLongitude));
            }
        })) {
            return;
        }
        mjj.m154842c(act(), true).m154844e(act(), momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second, new e30() { // from class: l.ull0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177078a.m155473J0(momentRoamLatitudeAndLongitude, (d90) obj);
            }
        }, new e30() { // from class: l.vll0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181967a.m155474L0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m155468E0(final Act act, MessageLocation messageLocation, final d30 d30Var) {
        act.progress(R$string.f17842J5, true);
        DoublePair doublePair = messageLocation.coordinates;
        CoreModule.f17545c.f19639e0.m169389F9(doublePair.first, doublePair.second).subscribe(mkd0.m154956H(new e30() { // from class: l.xll0
            @Override // p149l.e30
            public final void call(Object obj) {
                mml0.m155459q0(act, d30Var, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.yll0
            @Override // p149l.e30
            public final void call(Object obj) {
                mml0.m155465y0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m155469F0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m155468E0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: G0 */
    public void m155470G0(Intent intent) {
        final DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            doublePair.first = 1.0E-12d;
        }
        boolean zM170238a = pll0.m170238a(doublePair, this.f134674b);
        MessageLocation messageLocation = (MessageLocation) vwb.m200346r(this.f134676d.data, new w9j() { // from class: l.qll0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(pll0.m170238a(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM170238a) {
            if (this.f134675c.equals(DoublePair.new_())) {
                return;
            }
            m155469F0(act());
        } else if (NullChecker.m81303a(messageLocation)) {
            m155468E0(act(), messageLocation, null);
        } else {
            this.f134673a.m154844e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.bml0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76288a.m155475N0(stringExtra, doublePair, (d90) obj);
                }
            }, new e30() { // from class: l.eml0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92224a.m155476O0(doublePair, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m155471H0() {
        return this.f134676d;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m155472I0() {
        return this.f134675c;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m155473J0(DoublePair doublePair, d90 d90Var) {
        String strMo110405b = d90Var.mo110405b();
        String strMo110404a = d90Var.mo110404a();
        if (TextUtils.isEmpty(strMo110405b) || TextUtils.isEmpty(strMo110404a)) {
            m155469F0(act());
            return;
        }
        if (this.f134676d.data.size() == 5) {
            this.f134676d.data.remove(4);
        }
        m155481a1(doublePair, strMo110405b, strMo110404a);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m155474L0(Throwable th) {
        m155469F0(act());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m155475N0(String str, DoublePair doublePair, d90 d90Var) {
        String strMo110405b = !TextUtils.isEmpty(d90Var.mo110405b()) ? d90Var.mo110405b() : act().string(R$string.f18010On);
        if (TextUtils.isEmpty(str)) {
            str = d90Var.mo110404a();
        }
        m155481a1(doublePair, strMo110405b, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m155476O0(DoublePair doublePair, String str, Throwable th) {
        m155481a1(doublePair, act().string(R$string.f18010On), str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m155477Q0(d90 d90Var) {
        ((uml0) this.viewModel).m194393x(d90Var.mo110405b(), d90Var.mo110404a());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m155478S0(C4319c c4319c) {
        if (c4319c != C4319c.f15548i) {
            if (c4319c == C4319c.f15552m && this.f134677e) {
                CoreModule.f17545c.f19657k0.f20089S.m121229A(this.f134676d);
                return;
            }
            return;
        }
        boolean z = true;
        qib0.f154687E.m78871w(true);
        uml0 uml0Var = (uml0) this.viewModel;
        if (!wvv.m205781u() && !wvv.m205780t()) {
            z = false;
        }
        uml0Var.m194392w(z);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m155479V0(Location location) {
        if (!pvv.m171693c() || wvv.m205775o()) {
            return;
        }
        CoreDlg.m45038X1(act(), true);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ Boolean m155480Y0(MessageLocation messageLocation) {
        return Boolean.valueOf(pll0.m170238a(messageLocation.coordinates, this.f134675c));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.fml0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98312a.m155442P0((Bundle) obj);
            }
        });
        duringCreated(qib0.f154687E.m78864p()).subscribe(mkd0.m154955G(new e30() { // from class: l.gml0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103490a.m155444U0((Location) obj);
            }
        }));
        if (wvv.m205777q()) {
            duringCreated(qib0.f154687E.m78864p().timeout(3L, TimeUnit.SECONDS).take(1)).subscribe(mkd0.m154959K(new e30() { // from class: l.hml0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108444a.m155479V0((Location) obj);
                }
            }, new e30() { // from class: l.iml0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113943a.m155446X0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new v9j() { // from class: l.jml0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19657k0.f20089S.m121230k(), new x9j() { // from class: l.zll0
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return mml0.m155460r0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kml0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123810a.m155443R0((j760) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.lml0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128805a.m155478S0((C4319c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.rll0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sll0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154687E.m78868t();
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final void m155481a1(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f134676d.data.add(0, messageLocation);
        CoreModule.f17545c.f19657k0.f20089S.m121229A(this.f134676d);
        m155468E0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: b1 */
    public void m155482b1(boolean z) {
        this.f134677e = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
