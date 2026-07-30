package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.d90;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mcr;
import l.mjj;
import l.mkd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wvv;
import l.x9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mml0 extends jq2<uml0> {

    /* JADX INFO: renamed from: a */
    public mjj f17117a;

    /* JADX INFO: renamed from: b */
    public DoublePair f17118b;

    /* JADX INFO: renamed from: c */
    public DoublePair f17119c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f17120d;

    /* JADX INFO: renamed from: e */
    public boolean f17121e;

    public mml0(mcr mcrVar) {
        super(mcrVar);
        this.f17120d = RoamedLocationData.new_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m19396P0(Bundle bundle) {
        this.f17117a = mjj.c(act(), true);
        ((uml0) ((jq2) this).viewModel).m25291r();
        if (!pvv.m21771c()) {
            wvv.g(act());
        }
        m19421D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m19397R0(j760 j760Var) {
        ((uml0) ((jq2) this).viewModel).m25296y(j760Var);
        DoublePair momentRoamLatitudeAndLongitude = ((User) j760Var.a).getMomentRoamLatitudeAndLongitude();
        this.f17119c = momentRoamLatitudeAndLongitude;
        if (!momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) && !vwb.m(((RoamedLocationData) j760Var.b).data, new w9j() { // from class: l.dml0
            public final Object call(Object obj) {
                return this.f10482a.m19434Y0((MessageLocation) obj);
            }
        })) {
            m19423F0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) j760Var.b;
        this.f17120d = roamedLocationData;
        ((uml0) ((jq2) this).viewModel).m25288k(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m19398U0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f17118b = doublePair;
        doublePair.first = location.u();
        this.f17118b.second = location.x();
        this.f17117a.e(act(), location.u(), location.x(), new e30() { // from class: l.aml0
            public final void call(Object obj) {
                this.f8369a.m19431Q0((d90) obj);
            }
        }, new e30() { // from class: l.cml0
            public final void call(Object obj) {
                App.d.k((Throwable) obj);
            }
        });
        ((uml0) ((jq2) this).viewModel).m25294w(wvv.u() || wvv.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m19399W0() {
        hfw.m16208a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m19400X0(Throwable th) {
        if (((uml0) ((jq2) this).viewModel).m25290m()) {
            return;
        }
        e51.F(act(), new Runnable() { // from class: l.wll0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25226a.m19399W0();
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m19413q0(Act act, d30 d30Var, SettingGroups settingGroups) {
        act.progressDismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ j760 m19414r0(User user, RoamedLocationData roamedLocationData) {
        return new j760(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m19419y0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m19421D0() {
        final DoublePair momentRoamLatitudeAndLongitude = CoreModule.m1851K().me_().getMomentRoamLatitudeAndLongitude();
        RoamedLocationData roamedLocationData = (RoamedLocationData) CoreModule.f1534c.f3646k0.f4078S.m();
        if (NullChecker.a(roamedLocationData)) {
            this.f17120d = roamedLocationData;
        }
        if (momentRoamLatitudeAndLongitude.equals(DoublePair.new_()) || vwb.m(this.f17120d.data, new w9j() { // from class: l.tll0
            public final Object call(Object obj) {
                return Boolean.valueOf(pll0.m21591a(((MessageLocation) obj).coordinates, momentRoamLatitudeAndLongitude));
            }
        })) {
            return;
        }
        mjj.c(act(), true).e(act(), momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second, new e30() { // from class: l.ull0
            public final void call(Object obj) {
                this.f23631a.m19427J0(momentRoamLatitudeAndLongitude, (d90) obj);
            }
        }, new e30() { // from class: l.vll0
            public final void call(Object obj) {
                this.f24377a.m19428L0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m19422E0(final Act act, MessageLocation messageLocation, final d30 d30Var) {
        act.progress(R$string.f1831J5, true);
        DoublePair doublePair = messageLocation.coordinates;
        CoreModule.f1534c.f3628e0.m21352F9(doublePair.first, doublePair.second).subscribe(mkd0.H(new e30() { // from class: l.xll0
            public final void call(Object obj) {
                mml0.m19413q0(act, d30Var, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.yll0
            public final void call(Object obj) {
                mml0.m19419y0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m19423F0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m19422E0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: G0 */
    public void m19424G0(Intent intent) {
        final DoublePair serializableExtra = intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (serializableExtra.first == 0.0d && serializableExtra.second == 0.0d) {
            serializableExtra.first = 1.0E-12d;
        }
        boolean zM21591a = pll0.m21591a(serializableExtra, this.f17118b);
        MessageLocation messageLocation = (MessageLocation) vwb.r(this.f17120d.data, new w9j() { // from class: l.qll0
            public final Object call(Object obj) {
                return Boolean.valueOf(pll0.m21591a(((MessageLocation) obj).coordinates, serializableExtra));
            }
        });
        if (zM21591a) {
            if (this.f17119c.equals(DoublePair.new_())) {
                return;
            }
            m19423F0(act());
        } else if (NullChecker.a(messageLocation)) {
            m19422E0(act(), messageLocation, null);
        } else {
            this.f17117a.e(act(), serializableExtra.first, serializableExtra.second, new e30() { // from class: l.bml0
                public final void call(Object obj) {
                    this.f8991a.m19429N0(stringExtra, serializableExtra, (d90) obj);
                }
            }, new e30() { // from class: l.eml0
                public final void call(Object obj) {
                    this.f11275a.m19430O0(serializableExtra, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m19425H0() {
        return this.f17120d;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m19426I0() {
        return this.f17119c;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m19427J0(DoublePair doublePair, d90 d90Var) {
        String strB = d90Var.b();
        String strA = d90Var.a();
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strA)) {
            m19423F0(act());
            return;
        }
        if (this.f17120d.data.size() == 5) {
            this.f17120d.data.remove(4);
        }
        m19437a1(doublePair, strB, strA);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m19428L0(Throwable th) {
        m19423F0(act());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m19429N0(String str, DoublePair doublePair, d90 d90Var) {
        String strB = !TextUtils.isEmpty(d90Var.b()) ? d90Var.b() : act().string(R$string.f1999On);
        if (TextUtils.isEmpty(str)) {
            str = d90Var.a();
        }
        m19437a1(doublePair, strB, str);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m19430O0(DoublePair doublePair, String str, Throwable th) {
        m19437a1(doublePair, act().string(R$string.f1999On), str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m19431Q0(d90 d90Var) {
        ((uml0) ((jq2) this).viewModel).m25295x(d90Var.b(), d90Var.a());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m19432S0(c cVar) {
        if (cVar != c.i) {
            if (cVar == c.m && this.f17121e) {
                CoreModule.f1534c.f3646k0.f4078S.A(this.f17120d);
                return;
            }
            return;
        }
        boolean z = true;
        qib0.f19778E.w(true);
        uml0 uml0Var = (uml0) ((jq2) this).viewModel;
        if (!wvv.u() && !wvv.t()) {
            z = false;
        }
        uml0Var.m25294w(z);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m19433V0(Location location) {
        if (!pvv.m21771c() || wvv.o()) {
            return;
        }
        CoreDlg.X1(act(), true);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ Boolean m19434Y0(MessageLocation messageLocation) {
        return Boolean.valueOf(pll0.m21591a(messageLocation.coordinates, this.f17119c));
    }

    /* JADX INFO: renamed from: Z */
    public void m19435Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m19436a0() {
        super.a0();
        creates(new e30() { // from class: l.fml0
            public final void call(Object obj) {
                this.f12779a.m19396P0((Bundle) obj);
            }
        });
        duringCreated(qib0.f19778E.p()).subscribe(mkd0.G(new e30() { // from class: l.gml0
            public final void call(Object obj) {
                this.f13398a.m19398U0((Location) obj);
            }
        }));
        if (wvv.q()) {
            duringCreated(qib0.f19778E.p().timeout(3L, TimeUnit.SECONDS).take(1)).subscribe(mkd0.K(new e30() { // from class: l.hml0
                public final void call(Object obj) {
                    this.f13946a.m19433V0((Location) obj);
                }
            }, new e30() { // from class: l.iml0
                public final void call(Object obj) {
                    this.f14566a.m19400X0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new v9j() { // from class: l.jml0
            public final Object call() {
                return mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3646k0.f4078S.k(), new x9j() { // from class: l.zll0
                    public final Object call(Object obj, Object obj2) {
                        return mml0.m19414r0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kml0
            public final void call(Object obj) {
                this.f15910a.m19397R0((j760) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.lml0
            public final void call(Object obj) {
                this.f16524a.m19432S0((c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.rll0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sll0
            public final void call(Object obj) {
                qib0.f19778E.t();
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final void m19437a1(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f17120d.data.add(0, messageLocation);
        CoreModule.f1534c.f3646k0.f4078S.A(this.f17120d);
        m19422E0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: b1 */
    public void m19438b1(boolean z) {
        this.f17121e = z;
    }

    public void destroy() {
    }
}
