package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.vip.privilege.VipBaseFrag;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.e30;
import l.eqh0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.pvl;
import l.qib0;
import l.rbo;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xao extends jq2<rbo> {

    /* JADX INFO: renamed from: a */
    public int f8434a;

    /* JADX INFO: renamed from: b */
    public boolean f8435b;

    /* JADX INFO: renamed from: c */
    public String f8436c;

    /* JADX INFO: renamed from: d */
    public ytw f8437d;

    /* JADX INFO: renamed from: e */
    public ytw f8438e;

    /* JADX INFO: renamed from: f */
    public boolean f8439f;

    /* JADX INFO: renamed from: g */
    public boolean f8440g;

    /* JADX INFO: renamed from: h */
    public evg0 f8441h;

    /* JADX INFO: renamed from: i */
    public final Geocoder f8442i;

    /* JADX INFO: renamed from: j */
    public final a<LatLng> f8443j;

    /* JADX INFO: renamed from: k */
    public final a<String> f8444k;

    /* JADX INFO: renamed from: l */
    public AutocompleteSessionToken f8445l;

    /* JADX INFO: renamed from: m */
    public UUID f8446m;

    /* JADX INFO: renamed from: l.xao$a */
    public class C3479a implements pvl.a {
        public C3479a() {
        }

        /* JADX INFO: renamed from: b */
        public void m10777b(boolean z) {
            xao xaoVar = xao.this;
            xaoVar.f8440g = true;
            ((jq2) xaoVar).viewModel.k0();
            ((jq2) xao.this).viewModel.N();
            ((jq2) xao.this).viewModel.o0(true);
            ((jq2) xao.this).viewModel.s0();
        }

        /* JADX INFO: renamed from: c */
        public void m10778c(pvl.b bVar) {
            if (((jq2) xao.this).viewModel.W(bVar)) {
                xao xaoVar = xao.this;
                xaoVar.m10776o1(xaoVar.f8437d);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m10779d(double d, double d2, float f, boolean z) {
            xao xaoVar = xao.this;
            xaoVar.f8440g = false;
            ((jq2) xaoVar).viewModel.M();
            ((jq2) xao.this).viewModel.o0(false);
            xao xaoVar2 = xao.this;
            if (z) {
                xaoVar2.f8443j.onNext(new LatLng(d, d2));
            } else {
                ((jq2) xaoVar2).viewModel.s0();
            }
        }
    }

    public xao(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f8443j = a.b();
        this.f8444k = a.b();
        this.f8442i = new Geocoder(CoreModule.b);
        this.f8441h = new evg0(act, new e30() { // from class: l.wao
            public final void call(Object obj) {
                this.f8151a.m10767d1((muw) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m10732a1(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        if (this.f8434a == 1) {
            act().setTitle(act().string(R.string.Q1));
        }
        ((jq2) this).viewModel.r();
        ((jq2) this).viewModel.I(new C3479a());
        duringCreated(((jq2) this).viewModel.Q().E3().doOnNext(new e30() { // from class: l.jao
            public final void call(Object obj) {
                this.f5293a.m10760V0((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kao
            public final Object call(Object obj) {
                return qib0.E.p().take(1);
            }
        }).flatMap(new w9j() { // from class: l.lao
            public final Object call(Object obj) {
                return this.f6139a.m10761W0((Location) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.nao
            public final void call(Object obj) {
                this.f6498a.m10762X0((Address) obj);
            }
        }));
        qib0.E.t();
        ((jq2) this).viewModel.m0(this.f8441h);
        ((jq2) this).viewModel.T(new View.OnClickListener() { // from class: l.oao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6639a.m10763Y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Address m10733e0(double d, double d2, Address address) {
        address.setLatitude(d);
        address.setLongitude(d2);
        return address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public void m10738i1() {
        if (NullChecker.a(this.f8438e)) {
            ytw ytwVar = this.f8438e;
            if ("...".equals(ytwVar.m11309c()) || TextUtils.isEmpty(ytwVar.m11309c())) {
                lsi0.h(R.string.qh);
                return;
            }
            Act act = act();
            if (!NullChecker.a(act)) {
                lsi0.h(R.string.qh);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("map_location", (Serializable) new DoublePair(this.f8438e.m11310d(), this.f8438e.m11311e()));
            intent.putExtra("map_address", ytwVar.m11309c());
            intent.putExtra("map_name", ytwVar.m11312f().equals(act.string(R.string.th)) ? ytwVar.m11309c() : ytwVar.m11312f());
            intent.putExtra("map_city", ytwVar.m11312f());
            act.setResult(-1, intent);
            act.finish();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Address m10741l0(double d, double d2, Throwable th) {
        Address address = new Address(Locale.getDefault());
        address.setAddressLine(0, String.format("%s,%s", Double.valueOf(d), Double.valueOf(d2)));
        return address;
    }

    /* JADX INFO: renamed from: n1 */
    private void m10744n1(boolean z) {
        if (z != this.f8439f) {
            this.f8439f = z;
            ((jq2) this).viewModel.n0(z);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m10751u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m10752x0(Throwable th) {
    }

    /* JADX INFO: renamed from: P0 */
    public void m10755P0(int i, boolean z, String str) {
        this.f8434a = i;
        this.f8435b = z;
        this.f8436c = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ c m10756Q0(LatLng latLng) {
        return m10775m1(latLng.latitude, latLng.longitude);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m10757R0(Address address) {
        if (TextUtils.isEmpty(address.getFeatureName())) {
            address.setFeatureName(act().getString(R.string.th));
        }
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        m10776o1(ytw.m11307a(address));
        m10744n1(true);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ Boolean m10758S0(String str) {
        return Boolean.valueOf(((jq2) this).viewModel.X());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m10759U0(ArrayList arrayList) {
        this.f8441h.m6337t(arrayList);
        ((jq2) this).viewModel.V(arrayList);
        ((jq2) this).viewModel.r0(arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m10760V0(roj0 roj0Var) {
        ((jq2) this).viewModel.P();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ c m10761W0(Location location) {
        return m10775m1(location.u(), location.x());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m10762X0(Address address) {
        ((jq2) this).viewModel.J(address.getLatitude(), address.getLongitude());
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        address.setFeatureName(act().getString(R.string.kh));
        m10776o1(ytw.m11307a(address));
        ((jq2) this).viewModel.K();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m10763Y0(View view) {
        if (NullChecker.a(this.f8437d)) {
            m10776o1(this.f8437d);
            ((jq2) this).viewModel.L(this.f8437d.m11310d(), this.f8437d.m11311e(), 17);
        }
        m10744n1(false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10764a0() {
        creates(new e30() { // from class: l.mao
            public final void call(Object obj) {
                this.f6323a.m10732a1((Bundle) obj);
            }
        }, new d30() { // from class: l.pao
            public final void call() {
                this.f6843a.m10765b1();
            }
        });
        duringCreated(this.f8443j.distinctUntilChanged().switchMap(new w9j() { // from class: l.qao
            public final Object call(Object obj) {
                return this.f6999a.m10756Q0((LatLng) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.rao
            public final void call(Object obj) {
                this.f7163a.m10757R0((Address) obj);
            }
        }));
        duringCreated(this.f8444k.filter(new w9j() { // from class: l.sao
            public final Object call(Object obj) {
                return this.f7321a.m10758S0((String) obj);
            }
        }).switchMap(new w9j() { // from class: l.tao
            public final Object call(Object obj) {
                return this.f7555a.m10774l1((String) obj);
            }
        })).subscribe(mkd0.K(new e30() { // from class: l.uao
            public final void call(Object obj) {
                this.f7729a.m10759U0((ArrayList) obj);
            }
        }, new e30() { // from class: l.vao
            public final void call(Object obj) {
                xao.m10752x0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m10765b1() {
        ((jq2) this).viewModel.j0();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m10766c1(ytw ytwVar) {
        this.f8446m = null;
        this.f8445l = null;
        this.f8437d = ytwVar;
        m10776o1(ytwVar);
        ((jq2) this).viewModel.L(this.f8437d.m11310d(), this.f8437d.m11311e(), 17);
        ((jq2) this).viewModel.n0(true);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m10767d1(muw muwVar) {
        ((jq2) this).viewModel.i0((String) null, false);
        ((jq2) this).viewModel.S(true);
        ((jq2) this).viewModel.R(false);
        m10773k1(muwVar.m8270c()).subscribe(mkd0.K(new e30() { // from class: l.hao
            public final void call(Object obj) {
                this.f4858a.m10766c1((ytw) obj);
            }
        }, new e30() { // from class: l.iao
            public final void call(Object obj) {
                xao.m10751u0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ Boolean m10768e1() {
        Iterator it = vwb.n(xdl0.s(act().toolbar()), new w9j() { // from class: l.gao
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Address m10769f1(double d, double d2) throws Exception {
        return this.f8442i.getFromLocation(d, d2, 1).get(0);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m10770g1() {
        if (!((jq2) this).viewModel.X()) {
            return false;
        }
        ((jq2) this).viewModel.i0("", true);
        ((jq2) this).viewModel.S(true);
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m10771h1(Menu menu) {
        ((jq2) this).viewModel.U(menu, this.f8434a, this.f8435b, new d30() { // from class: l.cao
            public final void call() {
                this.f4000a.m10738i1();
            }
        });
        m10772j1();
        if (!TextUtils.equals(this.f8436c, VipBaseFrag.B) || !((Boolean) CoreModule.c.j0.Y.get()).booleanValue() || !CoreModule.c.e0.p9().isVIP() || ((Boolean) CoreModule.c.j0.b0.get()).booleanValue()) {
            return true;
        }
        ((jq2) this).viewModel.p0();
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public void m10772j1() {
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.bao
            public final Object call() {
                return this.f3360a.m10768e1();
            }
        });
    }

    /* JADX INFO: renamed from: k1 */
    public final c<ytw> m10773k1(String str) {
        if (this.f8446m == null) {
            this.f8446m = UUID.randomUUID();
        }
        return CoreModule.c.k0.h3(str, this.f8446m.toString());
    }

    /* JADX INFO: renamed from: l1 */
    public final c<ArrayList<muw>> m10774l1(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.just(vwb.f0(new muw[0]));
        }
        if (this.f8446m == null) {
            this.f8446m = UUID.randomUUID();
        }
        return CoreModule.c.k0.i3(str, this.f8446m.toString());
    }

    /* JADX INFO: renamed from: m1 */
    public final c<Address> m10775m1(final double d, final double d2) {
        return c.fromCallable(new Callable() { // from class: l.dao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4140a.m10769f1(d, d2);
            }
        }).timeout(1L, TimeUnit.SECONDS).compose(mkd0.C()).onErrorReturn(new w9j() { // from class: l.eao
            public final Object call(Object obj) {
                return xao.m10741l0(d, d2, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.fao
            public final Object call(Object obj) {
                return xao.m10733e0(d, d2, (Address) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public final void m10776o1(ytw ytwVar) {
        this.f8437d = ytwVar;
        this.f8438e = ytwVar;
        ((jq2) this).viewModel.H(ytwVar);
        ((jq2) this).viewModel.l0(ytwVar.m11310d(), ytwVar.m11311e(), ytwVar == this.f8437d);
        ((jq2) this).viewModel.s0();
    }

    public void destroy() {
    }
}
