package p153l;

import android.R;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class xco extends ar2<rdo> {

    /* JADX INFO: renamed from: a */
    public int f193354a;

    /* JADX INFO: renamed from: b */
    public boolean f193355b;

    /* JADX INFO: renamed from: c */
    public String f193356c;

    /* JADX INFO: renamed from: d */
    public xww f193357d;

    /* JADX INFO: renamed from: e */
    public xww f193358e;

    /* JADX INFO: renamed from: f */
    public boolean f193359f;

    /* JADX INFO: renamed from: g */
    public boolean f193360g;

    /* JADX INFO: renamed from: h */
    public m3h0 f193361h;

    /* JADX INFO: renamed from: i */
    public final Geocoder f193362i;

    /* JADX INFO: renamed from: j */
    public final C22507a<LatLng> f193363j;

    /* JADX INFO: renamed from: k */
    public final C22507a<String> f193364k;

    /* JADX INFO: renamed from: l */
    public AutocompleteSessionToken f193365l;

    /* JADX INFO: renamed from: m */
    public UUID f193366m;

    /* JADX INFO: renamed from: l.xco$a */
    public class C21281a implements hyl.InterfaceC17599a {
        public C21281a() {
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: b */
        public void mo137752b(boolean z) {
            xco xcoVar = xco.this;
            xcoVar.f193360g = true;
            ((rdo) xcoVar.viewModel).m180925k0();
            ((rdo) xco.this.viewModel).m180902N();
            ((rdo) xco.this.viewModel).m180929o0(true);
            ((rdo) xco.this.viewModel).m180934s0();
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: c */
        public void mo137753c(hyl.InterfaceC17600b interfaceC17600b) {
            if (((rdo) xco.this.viewModel).m180911W(interfaceC17600b)) {
                xco xcoVar = xco.this;
                xcoVar.m210239o1(xcoVar.f193357d);
            }
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: d */
        public void mo137754d(double d, double d2, float f, boolean z) {
            xco xcoVar = xco.this;
            xcoVar.f193360g = false;
            ((rdo) xcoVar.viewModel).m180901M();
            ((rdo) xco.this.viewModel).m180929o0(false);
            xco xcoVar2 = xco.this;
            if (z) {
                xcoVar2.f193363j.m137019l(new LatLng(d, d2));
            } else {
                ((rdo) xcoVar2.viewModel).m180934s0();
            }
        }
    }

    public xco(ner nerVar, Act act) {
        super(nerVar);
        this.f193363j = C22507a.m222758b();
        this.f193364k = C22507a.m222758b();
        this.f193362i = new Geocoder(CoreModule.f18263b);
        this.f193361h = new m3h0(act, new y20() { // from class: l.wco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188486a.m210230d1((lxw) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m210196a1(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        if (this.f193354a == 1) {
            act().setTitle(act().string(R$string.f18778Q1));
        }
        ((rdo) this.viewModel).m180932r();
        ((rdo) this.viewModel).m180897I(new C21281a());
        duringCreated(((rdo) this.viewModel).m180905Q().mo36929E3().doOnNext(new y20() { // from class: l.jco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120079a.m210224V0((uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.kco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180370E.m80047p().take(1);
            }
        }).flatMap(new qcj() { // from class: l.lco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131370a.m210225W0((Location) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.nco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141391a.m210226X0((Address) obj);
            }
        }));
        uqb0.f180370E.m80051t();
        ((rdo) this.viewModel).m180927m0(this.f193361h);
        ((rdo) this.viewModel).m180908T(new View.OnClickListener() { // from class: l.oco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146724a.m210227Y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Address m210197e0(double d, double d2, Address address) {
        address.setLatitude(d);
        address.setLongitude(d2);
        return address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public void m210202i1() {
        if (NullChecker.m82486a(this.f193358e)) {
            xww xwwVar = this.f193358e;
            if ("...".equals(xwwVar.m213448c()) || TextUtils.isEmpty(xwwVar.m213448c())) {
                o1j0.m165634h(R$string.f18644Lh);
                return;
            }
            Act act = act();
            if (!NullChecker.m82486a(act)) {
                o1j0.m165634h(R$string.f18644Lh);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("map_location", new DoublePair(this.f193358e.m213449d(), this.f193358e.m213450e()));
            intent.putExtra("map_address", xwwVar.m213448c());
            intent.putExtra("map_name", xwwVar.m213451f().equals(act.string(R$string.f18734Oh)) ? xwwVar.m213448c() : xwwVar.m213451f());
            intent.putExtra("map_city", xwwVar.m213451f());
            act.setResult(-1, intent);
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Address m210205l0(double d, double d2, Throwable th) {
        Address address = new Address(Locale.getDefault());
        address.setAddressLine(0, String.format("%s,%s", Double.valueOf(d), Double.valueOf(d2)));
        return address;
    }

    /* JADX INFO: renamed from: n1 */
    private void m210208n1(boolean z) {
        if (z != this.f193359f) {
            this.f193359f = z;
            ((rdo) this.viewModel).m180928n0(z);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m210215u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m210216x0(Throwable th) {
    }

    /* JADX INFO: renamed from: P0 */
    public void m210219P0(int i, boolean z, String str) {
        this.f193354a = i;
        this.f193355b = z;
        this.f193356c = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ C22421c m210220Q0(LatLng latLng) {
        return m210238m1(latLng.latitude, latLng.longitude);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m210221R0(Address address) {
        if (TextUtils.isEmpty(address.getFeatureName())) {
            address.setFeatureName(act().getString(R$string.f18734Oh));
        }
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        m210239o1(xww.m213446a(address));
        m210208n1(true);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ Boolean m210222S0(String str) {
        return Boolean.valueOf(((rdo) this.viewModel).m180912X());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m210223U0(ArrayList arrayList) {
        this.f193361h.m156931t(arrayList);
        ((rdo) this.viewModel).m180910V(arrayList);
        ((rdo) this.viewModel).m180933r0(arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m210224V0(uxj0 uxj0Var) {
        ((rdo) this.viewModel).m180904P();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ C22421c m210225W0(Location location) {
        return m210238m1(location.m80014u(), location.m80016x());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m210226X0(Address address) {
        ((rdo) this.viewModel).m180898J(address.getLatitude(), address.getLongitude());
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        address.setFeatureName(act().getString(R$string.f18458Fh));
        m210239o1(xww.m213446a(address));
        ((rdo) this.viewModel).m180899K();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m210227Y0(View view) {
        if (NullChecker.m82486a(this.f193357d)) {
            m210239o1(this.f193357d);
            ((rdo) this.viewModel).m180900L(this.f193357d.m213449d(), this.f193357d.m213450e(), 17);
        }
        m210208n1(false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.mco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135835a.m210196a1((Bundle) obj);
            }
        }, new x20() { // from class: l.pco
            @Override // p153l.x20
            public final void call() {
                this.f151616a.m210228b1();
            }
        });
        duringCreated((C22421c) this.f193363j.distinctUntilChanged().switchMap(new qcj() { // from class: l.qco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156611a.m210220Q0((LatLng) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.rco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162243a.m210221R0((Address) obj);
            }
        }));
        duringCreated((C22421c) this.f193364k.filter(new qcj() { // from class: l.sco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167273a.m210222S0((String) obj);
            }
        }).switchMap(new qcj() { // from class: l.tco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173266a.m210237l1((String) obj);
            }
        })).subscribe(psd0.m173600K(new y20() { // from class: l.uco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178454a.m210223U0((ArrayList) obj);
            }
        }, new y20() { // from class: l.vco
            @Override // p153l.y20
            public final void call(Object obj) {
                xco.m210216x0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m210228b1() {
        ((rdo) this.viewModel).m180924j0();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m210229c1(xww xwwVar) {
        this.f193366m = null;
        this.f193365l = null;
        this.f193357d = xwwVar;
        m210239o1(xwwVar);
        ((rdo) this.viewModel).m180900L(this.f193357d.m213449d(), this.f193357d.m213450e(), 17);
        ((rdo) this.viewModel).m180928n0(true);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m210230d1(lxw lxwVar) {
        ((rdo) this.viewModel).m180923i0(null, false);
        ((rdo) this.viewModel).m180907S(true);
        ((rdo) this.viewModel).m180906R(false);
        m210236k1(lxwVar.m156252c()).subscribe(psd0.m173600K(new y20() { // from class: l.hco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108725a.m210229c1((xww) obj);
            }
        }, new y20() { // from class: l.ico
            @Override // p153l.y20
            public final void call(Object obj) {
                xco.m210215u0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ Boolean m210231e1() {
        Iterator it = jyb.m147522n(bnl0.m105579s(act().toolbar()), new qcj() { // from class: l.gco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(lyh0.m156283c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Address m210232f1(double d, double d2) throws Exception {
        return this.f193362i.getFromLocation(d, d2, 1).get(0);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m210233g1() {
        if (!((rdo) this.viewModel).m180912X()) {
            return false;
        }
        ((rdo) this.viewModel).m180923i0("", true);
        ((rdo) this.viewModel).m180907S(true);
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m210234h1(Menu menu) {
        ((rdo) this.viewModel).m180909U(menu, this.f193354a, this.f193355b, new x20() { // from class: l.cco
            @Override // p153l.x20
            public final void call() {
                this.f80979a.m210202i1();
            }
        });
        m210235j1();
        if (!TextUtils.equals(this.f193356c, VipBaseFrag.f38350B) || !CoreModule.f18264c.f20396j0.f20028Y.get().booleanValue() || !CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20396j0.f20031b0.get().booleanValue()) {
            return true;
        }
        ((rdo) this.viewModel).m180930p0();
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public void m210235j1() {
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.bco
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f76190a.m210231e1();
            }
        });
    }

    /* JADX INFO: renamed from: k1 */
    public final C22421c<xww> m210236k1(String str) {
        if (this.f193366m == null) {
            this.f193366m = UUID.randomUUID();
        }
        return CoreModule.f18264c.f20399k0.m35385h3(str, this.f193366m.toString());
    }

    /* JADX INFO: renamed from: l1 */
    public final C22421c<ArrayList<lxw>> m210237l1(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(jyb.m147507f0(new lxw[0]));
        }
        if (this.f193366m == null) {
            this.f193366m = UUID.randomUUID();
        }
        return CoreModule.f18264c.f20399k0.m35386i3(str, this.f193366m.toString());
    }

    /* JADX INFO: renamed from: m1 */
    public final C22421c<Address> m210238m1(final double d, final double d2) {
        return C22421c.fromCallable(new Callable() { // from class: l.dco
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f87800a.m210232f1(d, d2);
            }
        }).timeout(1L, TimeUnit.SECONDS).compose(psd0.m173592C()).onErrorReturn(new qcj() { // from class: l.eco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xco.m210205l0(d, d2, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.fco
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xco.m210197e0(d, d2, (Address) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public final void m210239o1(xww xwwVar) {
        this.f193357d = xwwVar;
        this.f193358e = xwwVar;
        ((rdo) this.viewModel).m180896H(xwwVar);
        ((rdo) this.viewModel).m180926l0(xwwVar.m213449d(), xwwVar.m213450e(), xwwVar == this.f193357d);
        ((rdo) this.viewModel).m180934s0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
