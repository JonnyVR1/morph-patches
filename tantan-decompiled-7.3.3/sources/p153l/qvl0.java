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
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class qvl0 extends ar2<yvl0> {

    /* JADX INFO: renamed from: a */
    public fmj f159778a;

    /* JADX INFO: renamed from: b */
    public DoublePair f159779b;

    /* JADX INFO: renamed from: c */
    public DoublePair f159780c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f159781d;

    /* JADX INFO: renamed from: e */
    public boolean f159782e;

    public qvl0(ner nerVar) {
        super(nerVar);
        this.f159781d = RoamedLocationData.new_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m178322P0(Bundle bundle) {
        this.f159778a = fmj.m126236c(act(), true);
        ((yvl0) this.viewModel).m217548r();
        if (!qxv.m178618c()) {
            xxv.m213580g(act());
        }
        m178347D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m178323R0(pf60 pf60Var) {
        ((yvl0) this.viewModel).m217553y(pf60Var);
        DoublePair momentRoamLatitudeAndLongitude = ((User) pf60Var.f152156a).getMomentRoamLatitudeAndLongitude();
        this.f159780c = momentRoamLatitudeAndLongitude;
        if (!momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) && !jyb.m147520m(((RoamedLocationData) pf60Var.f152157b).data, new qcj() { // from class: l.hvl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111767a.m178360Y0((MessageLocation) obj);
            }
        })) {
            m178349F0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) pf60Var.f152157b;
        this.f159781d = roamedLocationData;
        ((yvl0) this.viewModel).m217545k(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m178324U0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f159779b = doublePair;
        doublePair.first = location.m80014u();
        this.f159779b.second = location.m80016x();
        this.f159778a.m126239e(act(), location.m80014u(), location.m80016x(), new y20() { // from class: l.evl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96008a.m178357Q0((z80) obj);
            }
        }, new y20() { // from class: l.gvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                App.f16087d.m21432k((Throwable) obj);
            }
        });
        ((yvl0) this.viewModel).m217551w(xxv.m213594u() || xxv.m213593t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m178325W0() {
        fhw.m125605a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.m46221X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m178326X0(Throwable th) {
        if (((yvl0) this.viewModel).m217547m()) {
            return;
        }
        l51.m152886F(act(), new Runnable() { // from class: l.avl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73630a.m178325W0();
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m178339q0(Act act, x20 x20Var, SettingGroups settingGroups) {
        act.progressDismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ pf60 m178340r0(User user, RoamedLocationData roamedLocationData) {
        return new pf60(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m178345y0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m178347D0() {
        final DoublePair momentRoamLatitudeAndLongitude = CoreModule.m30930K().me_().getMomentRoamLatitudeAndLongitude();
        RoamedLocationData roamedLocationDataM159276m = CoreModule.f18264c.f20399k0.f20831S.m159276m();
        if (NullChecker.m82486a(roamedLocationDataM159276m)) {
            this.f159781d = roamedLocationDataM159276m;
        }
        if (momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) || jyb.m147520m(this.f159781d.data, new qcj() { // from class: l.xul0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(tul0.m192753a(((MessageLocation) obj).coordinates, momentRoamLatitudeAndLongitude));
            }
        })) {
            return;
        }
        fmj.m126236c(act(), true).m126239e(act(), momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second, new y20() { // from class: l.yul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201645a.m178353J0(momentRoamLatitudeAndLongitude, (z80) obj);
            }
        }, new y20() { // from class: l.zul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206137a.m178354L0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m178348E0(final Act act, MessageLocation messageLocation, final x20 x20Var) {
        act.progress(R$string.f18632L5, true);
        DoublePair doublePair = messageLocation.coordinates;
        CoreModule.f18264c.f20381e0.m116462F9(doublePair.first, doublePair.second).subscribe(psd0.m173597H(new y20() { // from class: l.bvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                qvl0.m178339q0(act, x20Var, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.cvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                qvl0.m178345y0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m178349F0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m178348E0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: G0 */
    public void m178350G0(Intent intent) {
        final DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            doublePair.first = 1.0E-12d;
        }
        boolean zM192753a = tul0.m192753a(doublePair, this.f159779b);
        MessageLocation messageLocation = (MessageLocation) jyb.m147529r(this.f159781d.data, new qcj() { // from class: l.uul0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(tul0.m192753a(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM192753a) {
            if (this.f159780c.equals(DoublePair.new_())) {
                return;
            }
            m178349F0(act());
        } else if (NullChecker.m82486a(messageLocation)) {
            m178348E0(act(), messageLocation, null);
        } else {
            this.f159778a.m126239e(act(), doublePair.first, doublePair.second, new y20() { // from class: l.fvl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101050a.m178355N0(stringExtra, doublePair, (z80) obj);
                }
            }, new y20() { // from class: l.ivl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117094a.m178356O0(doublePair, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m178351H0() {
        return this.f159781d;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m178352I0() {
        return this.f159780c;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m178353J0(DoublePair doublePair, z80 z80Var) {
        String strMo143670b = z80Var.mo143670b();
        String strMo143669a = z80Var.mo143669a();
        if (TextUtils.isEmpty(strMo143670b) || TextUtils.isEmpty(strMo143669a)) {
            m178349F0(act());
            return;
        }
        if (this.f159781d.data.size() == 5) {
            this.f159781d.data.remove(4);
        }
        m178361a1(doublePair, strMo143670b, strMo143669a);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m178354L0(Throwable th) {
        m178349F0(act());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m178355N0(String str, DoublePair doublePair, z80 z80Var) {
        String strMo143670b = !TextUtils.isEmpty(z80Var.mo143670b()) ? z80Var.mo143670b() : act().string(R$string.f19439lo);
        if (TextUtils.isEmpty(str)) {
            str = z80Var.mo143669a();
        }
        m178361a1(doublePair, strMo143670b, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m178356O0(DoublePair doublePair, String str, Throwable th) {
        m178361a1(doublePair, act().string(R$string.f19439lo), str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m178357Q0(z80 z80Var) {
        ((yvl0) this.viewModel).m217552x(z80Var.mo143670b(), z80Var.mo143669a());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m178358S0(C4470c c4470c) {
        if (c4470c != C4470c.f16267i) {
            if (c4470c == C4470c.f16271m && this.f159782e) {
                CoreModule.f18264c.f20399k0.f20831S.m159273A(this.f159781d);
                return;
            }
            return;
        }
        boolean z = true;
        uqb0.f180370E.m80054w(true);
        yvl0 yvl0Var = (yvl0) this.viewModel;
        if (!xxv.m213594u() && !xxv.m213593t()) {
            z = false;
        }
        yvl0Var.m217551w(z);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m178359V0(Location location) {
        if (!qxv.m178618c() || xxv.m213588o()) {
            return;
        }
        CoreDlg.m46221X1(act(), true);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ Boolean m178360Y0(MessageLocation messageLocation) {
        return Boolean.valueOf(tul0.m192753a(messageLocation.coordinates, this.f159780c));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.jvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122817a.m178322P0((Bundle) obj);
            }
        });
        duringCreated(uqb0.f180370E.m80047p()).subscribe(psd0.m173596G(new y20() { // from class: l.kvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128972a.m178324U0((Location) obj);
            }
        }));
        if (xxv.m213590q()) {
            duringCreated(uqb0.f180370E.m80047p().timeout(3L, TimeUnit.SECONDS).take(1)).subscribe(psd0.m173600K(new y20() { // from class: l.lvl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133717a.m178359V0((Location) obj);
                }
            }, new y20() { // from class: l.mvl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138907a.m178326X0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new pcj() { // from class: l.nvl0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20399k0.f20831S.m159274k(), new rcj() { // from class: l.dvl0
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return qvl0.m178340r0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ovl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149277a.m178323R0((pf60) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.pvl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154307a.m178358S0((C4470c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.vul0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wul0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180370E.m80051t();
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final void m178361a1(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f159781d.data.add(0, messageLocation);
        CoreModule.f18264c.f20399k0.f20831S.m159273A(this.f159781d);
        m178348E0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: b1 */
    public void m178362b1(boolean z) {
        this.f159782e = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
