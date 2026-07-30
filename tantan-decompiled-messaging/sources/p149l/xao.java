package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class xao extends jq2<rbo> {

    /* JADX INFO: renamed from: a */
    public int f191759a;

    /* JADX INFO: renamed from: b */
    public boolean f191760b;

    /* JADX INFO: renamed from: c */
    public String f191761c;

    /* JADX INFO: renamed from: d */
    public ytw f191762d;

    /* JADX INFO: renamed from: e */
    public ytw f191763e;

    /* JADX INFO: renamed from: f */
    public boolean f191764f;

    /* JADX INFO: renamed from: g */
    public boolean f191765g;

    /* JADX INFO: renamed from: h */
    public evg0 f191766h;

    /* JADX INFO: renamed from: i */
    public final Geocoder f191767i;

    /* JADX INFO: renamed from: j */
    public final C22392a<LatLng> f191768j;

    /* JADX INFO: renamed from: k */
    public final C22392a<String> f191769k;

    /* JADX INFO: renamed from: l */
    public AutocompleteSessionToken f191770l;

    /* JADX INFO: renamed from: m */
    public UUID f191771m;

    /* JADX INFO: renamed from: l.xao$a */
    public class C21054a implements pvl.InterfaceC19345a {
        public C21054a() {
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: b */
        public void mo171678b(boolean z) {
            xao xaoVar = xao.this;
            xaoVar.f191765g = true;
            ((rbo) xaoVar.viewModel).m178674k0();
            ((rbo) xao.this.viewModel).m178651N();
            ((rbo) xao.this.viewModel).m178678o0(true);
            ((rbo) xao.this.viewModel).m178683s0();
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: c */
        public void mo171679c(pvl.InterfaceC19346b interfaceC19346b) {
            if (((rbo) xao.this.viewModel).m178660W(interfaceC19346b)) {
                xao xaoVar = xao.this;
                xaoVar.m207635o1(xaoVar.f191762d);
            }
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: d */
        public void mo171680d(double d, double d2, float f, boolean z) {
            xao xaoVar = xao.this;
            xaoVar.f191765g = false;
            ((rbo) xaoVar.viewModel).m178650M();
            ((rbo) xao.this.viewModel).m178678o0(false);
            xao xaoVar2 = xao.this;
            if (z) {
                xaoVar2.f191768j.m132487l(new LatLng(d, d2));
            } else {
                ((rbo) xaoVar2.viewModel).m178683s0();
            }
        }
    }

    public xao(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f191768j = C22392a.m221512b();
        this.f191769k = C22392a.m221512b();
        this.f191767i = new Geocoder(CoreModule.f17544b);
        this.f191766h = new evg0(act, new e30() { // from class: l.wao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185491a.m207626d1((muw) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m207592a1(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        if (this.f191759a == 1) {
            act().setTitle(act().string(R$string.f18048Q1));
        }
        ((rbo) this.viewModel).m178681r();
        ((rbo) this.viewModel).m178646I(new C21054a());
        duringCreated(((rbo) this.viewModel).m178654Q().mo35926E3().doOnNext(new e30() { // from class: l.jao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117105a.m207620V0((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154687E.m78864p().take(1);
            }
        }).flatMap(new w9j() { // from class: l.lao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127228a.m207621W0((Location) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.nao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137924a.m207622X0((Address) obj);
            }
        }));
        qib0.f154687E.m78868t();
        ((rbo) this.viewModel).m178676m0(this.f191766h);
        ((rbo) this.viewModel).m178657T(new View.OnClickListener() { // from class: l.oao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142854a.m207623Y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Address m207593e0(double d, double d2, Address address) {
        address.setLatitude(d);
        address.setLongitude(d2);
        return address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public void m207598i1() {
        if (NullChecker.m81303a(this.f191763e)) {
            ytw ytwVar = this.f191763e;
            if ("...".equals(ytwVar.m216090c()) || TextUtils.isEmpty(ytwVar.m216090c())) {
                lsi0.m151578h(R$string.f18856qh);
                return;
            }
            Act act = act();
            if (!NullChecker.m81303a(act)) {
                lsi0.m151578h(R$string.f18856qh);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("map_location", new DoublePair(this.f191763e.m216091d(), this.f191763e.m216092e()));
            intent.putExtra("map_address", ytwVar.m216090c());
            intent.putExtra("map_name", ytwVar.m216093f().equals(act.string(R$string.f18946th)) ? ytwVar.m216090c() : ytwVar.m216093f());
            intent.putExtra("map_city", ytwVar.m216093f());
            act.setResult(-1, intent);
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Address m207601l0(double d, double d2, Throwable th) {
        Address address = new Address(Locale.getDefault());
        address.setAddressLine(0, String.format("%s,%s", Double.valueOf(d), Double.valueOf(d2)));
        return address;
    }

    /* JADX INFO: renamed from: n1 */
    private void m207604n1(boolean z) {
        if (z != this.f191764f) {
            this.f191764f = z;
            ((rbo) this.viewModel).m178677n0(z);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m207611u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m207612x0(Throwable th) {
    }

    /* JADX INFO: renamed from: P0 */
    public void m207615P0(int i, boolean z, String str) {
        this.f191759a = i;
        this.f191760b = z;
        this.f191761c = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ C22306c m207616Q0(LatLng latLng) {
        return m207634m1(latLng.latitude, latLng.longitude);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m207617R0(Address address) {
        if (TextUtils.isEmpty(address.getFeatureName())) {
            address.setFeatureName(act().getString(R$string.f18946th));
        }
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        m207635o1(ytw.m216088a(address));
        m207604n1(true);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ Boolean m207618S0(String str) {
        return Boolean.valueOf(((rbo) this.viewModel).m178661X());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m207619U0(ArrayList arrayList) {
        this.f191766h.m118265t(arrayList);
        ((rbo) this.viewModel).m178659V(arrayList);
        ((rbo) this.viewModel).m178682r0(arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m207620V0(roj0 roj0Var) {
        ((rbo) this.viewModel).m178653P();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ C22306c m207621W0(Location location) {
        return m207634m1(location.m78831u(), location.m78833x());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m207622X0(Address address) {
        ((rbo) this.viewModel).m178647J(address.getLatitude(), address.getLongitude());
        if (address.getMaxAddressLineIndex() < 0) {
            address.setAddressLine(0, String.format("%s,%s", Double.valueOf(address.getLatitude()), Double.valueOf(address.getLatitude())));
        }
        address.setFeatureName(act().getString(R$string.f18671kh));
        m207635o1(ytw.m216088a(address));
        ((rbo) this.viewModel).m178648K();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m207623Y0(View view) {
        if (NullChecker.m81303a(this.f191762d)) {
            m207635o1(this.f191762d);
            ((rbo) this.viewModel).m178649L(this.f191762d.m216091d(), this.f191762d.m216092e(), 17);
        }
        m207604n1(false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.mao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132942a.m207592a1((Bundle) obj);
            }
        }, new d30() { // from class: l.pao
            @Override // p149l.d30
            public final void call() {
                this.f147993a.m207624b1();
            }
        });
        duringCreated((C22306c) this.f191768j.distinctUntilChanged().switchMap(new w9j() { // from class: l.qao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153547a.m207616Q0((LatLng) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.rao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158545a.m207617R0((Address) obj);
            }
        }));
        duringCreated((C22306c) this.f191769k.filter(new w9j() { // from class: l.sao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163424a.m207618S0((String) obj);
            }
        }).switchMap(new w9j() { // from class: l.tao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169173a.m207633l1((String) obj);
            }
        })).subscribe(mkd0.m154959K(new e30() { // from class: l.uao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175613a.m207619U0((ArrayList) obj);
            }
        }, new e30() { // from class: l.vao
            @Override // p149l.e30
            public final void call(Object obj) {
                xao.m207612x0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m207624b1() {
        ((rbo) this.viewModel).m178673j0();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m207625c1(ytw ytwVar) {
        this.f191771m = null;
        this.f191770l = null;
        this.f191762d = ytwVar;
        m207635o1(ytwVar);
        ((rbo) this.viewModel).m178649L(this.f191762d.m216091d(), this.f191762d.m216092e(), 17);
        ((rbo) this.viewModel).m178677n0(true);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m207626d1(muw muwVar) {
        ((rbo) this.viewModel).m178672i0(null, false);
        ((rbo) this.viewModel).m178656S(true);
        ((rbo) this.viewModel).m178655R(false);
        m207632k1(muwVar.m156453c()).subscribe(mkd0.m154959K(new e30() { // from class: l.hao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106763a.m207625c1((ytw) obj);
            }
        }, new e30() { // from class: l.iao
            @Override // p149l.e30
            public final void call(Object obj) {
                xao.m207611u0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ Boolean m207627e1() {
        Iterator it = vwb.m200339n(xdl0.m208399s(act().toolbar()), new w9j() { // from class: l.gao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m117752c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Address m207628f1(double d, double d2) throws Exception {
        return this.f191767i.getFromLocation(d, d2, 1).get(0);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m207629g1() {
        if (!((rbo) this.viewModel).m178661X()) {
            return false;
        }
        ((rbo) this.viewModel).m178672i0("", true);
        ((rbo) this.viewModel).m178656S(true);
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m207630h1(Menu menu) {
        ((rbo) this.viewModel).m178658U(menu, this.f191759a, this.f191760b, new d30() { // from class: l.cao
            @Override // p149l.d30
            public final void call() {
                this.f80040a.m207598i1();
            }
        });
        m207631j1();
        if (!TextUtils.equals(this.f191761c, VipBaseFrag.f37502B) || !CoreModule.f17545c.f19654j0.f19286Y.get().booleanValue() || !CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19654j0.f19289b0.get().booleanValue()) {
            return true;
        }
        ((rbo) this.viewModel).m178679p0();
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public void m207631j1() {
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.bao
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f74709a.m207627e1();
            }
        });
    }

    /* JADX INFO: renamed from: k1 */
    public final C22306c<ytw> m207632k1(String str) {
        if (this.f191771m == null) {
            this.f191771m = UUID.randomUUID();
        }
        return CoreModule.f17545c.f19657k0.m34382h3(str, this.f191771m.toString());
    }

    /* JADX INFO: renamed from: l1 */
    public final C22306c<ArrayList<muw>> m207633l1(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(vwb.m200324f0(new muw[0]));
        }
        if (this.f191771m == null) {
            this.f191771m = UUID.randomUUID();
        }
        return CoreModule.f17545c.f19657k0.m34383i3(str, this.f191771m.toString());
    }

    /* JADX INFO: renamed from: m1 */
    public final C22306c<Address> m207634m1(final double d, final double d2) {
        return C22306c.fromCallable(new Callable() { // from class: l.dao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f85247a.m207628f1(d, d2);
            }
        }).timeout(1L, TimeUnit.SECONDS).compose(mkd0.m154951C()).onErrorReturn(new w9j() { // from class: l.eao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xao.m207601l0(d, d2, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.fao
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xao.m207593e0(d, d2, (Address) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public final void m207635o1(ytw ytwVar) {
        this.f191762d = ytwVar;
        this.f191763e = ytwVar;
        ((rbo) this.viewModel).m178645H(ytwVar);
        ((rbo) this.viewModel).m178675l0(ytwVar.m216091d(), ytwVar.m216092e(), ytwVar == this.f191762d);
        ((rbo) this.viewModel).m178683s0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
