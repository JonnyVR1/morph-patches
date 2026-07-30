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
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
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
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wvv;
import l.x9j;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cjl0 extends jq2<ljl0> {

    /* JADX INFO: renamed from: h */
    public static double f9690h = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public DoublePair f9691a;

    /* JADX INFO: renamed from: b */
    public mjj f9692b;

    /* JADX INFO: renamed from: c */
    public boolean f9693c;

    /* JADX INFO: renamed from: d */
    public DoublePair f9694d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f9695e;

    /* JADX INFO: renamed from: f */
    public DoublePair f9696f;

    /* JADX INFO: renamed from: g */
    public String f9697g;

    public cjl0(mcr mcrVar) {
        super(mcrVar);
        this.f9695e = RoamedLocationData.new_();
        this.f9696f = DoublePair.new_();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m13474C0(final Act act, MessageLocation messageLocation, final d30 d30Var) {
        act.progress(R$string.f1831J5, true);
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.roamingLatitude = Double.valueOf(messageLocation.coordinates.first);
        settingGroups.search.roamingLongitude = Double.valueOf(messageLocation.coordinates.second);
        CoreModule.f1534c.f3652m0.m3051k8(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.mil0
            public final void call(Object obj) {
                cjl0.m13506y0(act, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.nil0
            public final void call(Object obj) {
                cjl0.m13490g0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public static void m13475D0(Act act) {
        MessageLocation messageLocation = new MessageLocation();
        DoublePair doublePair = new DoublePair();
        messageLocation.coordinates = doublePair;
        doublePair.isEmpty = true;
        m13474C0(act, messageLocation, null);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m13476E0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f9690h && Math.abs(doublePair.second - doublePair2.second) < f9690h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m13477N0(Bundle bundle) {
        this.f9692b = mjj.c(act(), true);
        ((ljl0) ((jq2) this).viewModel).m18824r();
        if (pvv.m21771c()) {
            return;
        }
        wvv.g(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m13478O0(d90 d90Var) {
        ((ljl0) ((jq2) this).viewModel).m18816B(d90Var.b(), d90Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m13479P0(j760 j760Var) {
        ((ljl0) ((jq2) this).viewModel).m18817C(j760Var);
        DoublePair latitudeAndLongitude = ((User) j760Var.a).getLatitudeAndLongitude();
        this.f9691a = latitudeAndLongitude;
        if (!latitudeAndLongitude.equals(DoublePair.new_()) && !vwb.m(((RoamedLocationData) j760Var.b).data, new w9j() { // from class: l.til0
            public final Object call(Object obj) {
                return this.f22134a.m13486X0((MessageLocation) obj);
            }
        })) {
            m13475D0(act());
        }
        RoamedLocationData roamedLocationData = (RoamedLocationData) j760Var.b;
        this.f9695e = roamedLocationData;
        ((ljl0) ((jq2) this).viewModel).m18821l(roamedLocationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m13480Q0(c cVar) {
        if (cVar == c.i) {
            qib0.f19778E.w(true);
            ((ljl0) ((jq2) this).viewModel).m18826z(wvv.u() || wvv.t());
        } else if (cVar == c.k) {
            zvf0.B("e_vip_history_page_location_info", "", new j760[]{vwb.Y("is_location_success", Boolean.valueOf(qib0.f19778E.q() != null))});
        } else if (cVar == c.m && this.f9693c) {
            CoreModule.f1534c.f3646k0.f4077R.A(this.f9695e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m13481R0(Boolean bool) {
        if (bool.booleanValue() && TextUtils.equals(this.f9697g, "p_youthvip_page")) {
            ((ljl0) ((jq2) this).viewModel).m18815A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m13482S0(Location location) {
        DoublePair doublePair = new DoublePair();
        this.f9694d = doublePair;
        doublePair.first = location.u();
        this.f9694d.second = location.x();
        this.f9692b.e(act(), location.u(), location.x(), new e30() { // from class: l.oil0
            public final void call(Object obj) {
                this.f18253a.m13478O0((d90) obj);
            }
        }, new e30() { // from class: l.pil0
            public final void call(Object obj) {
                App.d.k((Throwable) obj);
            }
        });
        ((ljl0) ((jq2) this).viewModel).m18826z(wvv.u() || wvv.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m13483U0(Location location) {
        if (!pvv.m21771c() || wvv.o()) {
            return;
        }
        CoreDlg.X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m13484V0() {
        hfw.m16208a("checkPermissionDlg", "show in VipLocationHistoryAct");
        CoreDlg.X1(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m13485W0(Throwable th) {
        if (((ljl0) ((jq2) this).viewModel).m18823p()) {
            return;
        }
        e51.F(act(), new Runnable() { // from class: l.ril0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20566a.m13484V0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ Boolean m13486X0(MessageLocation messageLocation) {
        return Boolean.valueOf(m13476E0(messageLocation.coordinates, this.f9691a));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m13487Y0(DoublePair doublePair, String str, String str2) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        this.f9695e.data.add(0, messageLocation);
        CoreModule.f1534c.f3646k0.f4077R.A(this.f9695e);
        m13474C0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m13490g0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ j760 m13498o0(User user, RoamedLocationData roamedLocationData) {
        return new j760(user, roamedLocationData);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m13506y0(Act act, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m13508F0(Intent intent) {
        final DoublePair serializableExtra = intent.getSerializableExtra("map_location");
        final String stringExtra = intent.getStringExtra("map_address");
        if (serializableExtra.first == 0.0d && serializableExtra.second == 0.0d) {
            serializableExtra.first = 1.0E-12d;
        }
        boolean zM13476E0 = m13476E0(serializableExtra, this.f9694d);
        MessageLocation messageLocation = (MessageLocation) vwb.r(this.f9695e.data, new w9j() { // from class: l.hil0
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.m13476E0(((MessageLocation) obj).coordinates, serializableExtra));
            }
        });
        if (zM13476E0) {
            if (this.f9691a.equals(DoublePair.new_())) {
                return;
            }
            m13475D0(act());
        } else if (NullChecker.a(messageLocation)) {
            m13474C0(act(), messageLocation, null);
        } else {
            this.f9692b.e(act(), serializableExtra.first, serializableExtra.second, new e30() { // from class: l.sil0
                public final void call(Object obj) {
                    this.f21329a.m13512J0(stringExtra, serializableExtra, (d90) obj);
                }
            }, new e30() { // from class: l.uil0
                public final void call(Object obj) {
                    this.f23557a.m13513L0(serializableExtra, stringExtra, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public String m13509G0() {
        return this.f9697g;
    }

    /* JADX INFO: renamed from: H0 */
    public RoamedLocationData m13510H0() {
        return this.f9695e;
    }

    /* JADX INFO: renamed from: I0 */
    public DoublePair m13511I0() {
        return this.f9691a;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m13512J0(String str, DoublePair doublePair, d90 d90Var) {
        String strB = !TextUtils.isEmpty(d90Var.b()) ? d90Var.b() : act().string(R$string.f1999On);
        if (TextUtils.isEmpty(str)) {
            str = d90Var.a();
        }
        m13487Y0(doublePair, strB, str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m13513L0(DoublePair doublePair, String str, Throwable th) {
        m13487Y0(doublePair, act().string(R$string.f1999On), str);
    }

    /* JADX INFO: renamed from: Z */
    public void m13514Z() {
        super.Z();
        this.f9697g = act().getIntent().getStringExtra("from");
    }

    /* JADX INFO: renamed from: a0 */
    public void m13515a0() {
        creates(new e30() { // from class: l.vil0
            public final void call(Object obj) {
                this.f24337a.m13477N0((Bundle) obj);
            }
        });
        duringCreated(qib0.f19778E.p()).subscribe(mkd0.G(new e30() { // from class: l.xil0
            public final void call(Object obj) {
                this.f27533a.m13482S0((Location) obj);
            }
        }));
        if (wvv.q()) {
            duringCreated(qib0.f19778E.p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe(mkd0.K(new e30() { // from class: l.yil0
                public final void call(Object obj) {
                    this.f28235a.m13483U0((Location) obj);
                }
            }, new e30() { // from class: l.zil0
                public final void call(Object obj) {
                    this.f28768a.m13485W0((Throwable) obj);
                }
            }, false));
        }
        duringCreated(new v9j() { // from class: l.ajl0
            public final Object call() {
                return mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3646k0.f4077R.k(), new x9j() { // from class: l.qil0
                    public final Object call(Object obj, Object obj2) {
                        return cjl0.m13498o0((User) obj, (RoamedLocationData) obj2);
                    }
                });
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bjl0
            public final void call(Object obj) {
                this.f8927a.m13479P0((j760) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.iil0
            public final void call(Object obj) {
                this.f14493a.m13480Q0((c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.jil0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kil0
            public final void call(Object obj) {
                qib0.f19778E.t();
            }
        }));
        if (g6a.m15603z()) {
            duringCreated(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("youthVip")).map(new w9j() { // from class: l.lil0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!xma.m27363T3((UserPrivilege) obj));
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.wil0
                public final void call(Object obj) {
                    this.f25171a.m13481R0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m13516a1(boolean z) {
        this.f9693c = z;
    }

    public void destroy() {
    }
}
