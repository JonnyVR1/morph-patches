package p007l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.lsi0;
import l.pvv;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VMenuBar;
import v.VRecyclerView;
import v.VSearchBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g340 implements s7m<x240> {

    /* JADX INFO: renamed from: a */
    public VMenuBar f8311a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f8312b;

    /* JADX INFO: renamed from: c */
    public ImageView f8313c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f8314d;

    /* JADX INFO: renamed from: f */
    public p90 f8316f;

    /* JADX INFO: renamed from: g */
    public n90 f8317g;

    /* JADX INFO: renamed from: h */
    public NewPostLocationAct f8318h;

    /* JADX INFO: renamed from: i */
    public x240 f8319i;

    /* JADX INFO: renamed from: e */
    public int f8315e = 2;

    /* JADX INFO: renamed from: j */
    public boolean f8320j = true;

    /* JADX INFO: renamed from: k */
    public List<k90> f8321k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public eml.InterfaceC2379a f8322l = new C2387a();

    /* JADX INFO: renamed from: l.g340$a */
    public class C2387a implements eml.InterfaceC2379a {
        public C2387a() {
        }

        @Override // p007l.eml.InterfaceC2379a
        /* JADX INFO: renamed from: a */
        public void mo9933a(List<k90> list) {
            if (NullChecker.b(g340.this.f8317g)) {
                g340.this.f8317g.m12124K(list);
                xdl0.M(g340.this.f8313c, list.size() < g340.this.f8315e);
                xdl0.M(g340.this.f8314d, list.size() >= g340.this.f8315e);
            }
            if (g340.this.f8320j) {
                g340.this.f8321k = list;
            }
        }

        @Override // p007l.eml.InterfaceC2379a
        public void onError(Throwable th) {
            lsi0.n(R$string.f442U);
        }
    }

    public g340(NewPostLocationAct newPostLocationAct) {
        this.f8318h = newPostLocationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m10366B(View view) {
        this.f8318h.hideInput(this.f8312b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m10367E(View view) {
        this.f8318h.hideInput();
        this.f8318h.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m10382y() {
        m10400w(null);
    }

    /* JADX INFO: renamed from: z */
    private void m10383z() {
        p90 p90Var = new p90(this.f8322l);
        this.f8316f = p90Var;
        p90Var.init();
    }

    /* JADX INFO: renamed from: A */
    public void m10384A(Bundle bundle) {
        if (!nkg.m12223U() || (nkg.m12223U() && cjh.m9191a(new d30() { // from class: l.b340
            public final void call() {
                this.f5900a.m10368F();
            }
        }))) {
            m10398u();
            if (!pvv.c() || cjh.m9193c()) {
                return;
            }
            FeedModule.m1140H().dl(act(), true, (d30) null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10385C(View view, boolean z) {
        this.f8312b.setPadding(t100.d(19.0f), 0, t100.d(z ? 7.0f : 19.0f), 0);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10386C0() {
        return this.f8318h;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10387G() {
        lsi0.y("开启定位服务，获取精准定位");
        this.f8318h.finish();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10388H(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m10400w(null);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m10368F() {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).w(false).u(true).m(new d30() { // from class: l.c340
            public final void call() {
                this.f6496a.m10387G();
            }
        }, new e30() { // from class: l.d340
            public final void call(Object obj) {
                this.f6787a.m10388H((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).i(this.f8318h);
    }

    /* JADX INFO: renamed from: J */
    public void m10390J(Location location) {
        this.f8316f.mo9600a(location, this.f8318h);
    }

    /* JADX INFO: renamed from: K */
    public final void m10391K(CharSequence charSequence) {
        if (this.f8317g == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8317g.m12124K(this.f8321k);
            xdl0.M(this.f8313c, false);
            xdl0.M(this.f8314d, true);
        } else {
            this.f8320j = false;
            if (nkg.m12223U()) {
                this.f8319i.m15991l0(charSequence.toString());
            } else {
                this.f8316f.m9602c(this.f8319i.f14741a, this.f8318h, charSequence.toString());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m10392L(List<k90> list, String str) {
        if (NullChecker.b(this.f8317g) && this.f8312b.getEditText().getText().toString().equals(str)) {
            this.f8317g.m12124K(list);
            xdl0.M(this.f8313c, list.size() < this.f8315e);
            xdl0.M(this.f8314d, list.size() >= this.f8315e);
        }
        if (this.f8320j) {
            this.f8321k.addAll(list);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10393M(k90 k90Var) {
        m10400w(k90Var);
    }

    /* JADX INFO: renamed from: N */
    public final void m10394N() {
        this.f8312b.d(new C2388b());
    }

    @Nullable
    public Act act() {
        return this.f8318h;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10396q = m10396q(layoutInflater, viewGroup);
        if (u2h.m14723h()) {
            this.f8311a.setLeftImage(f3c0.f7851m);
            this.f8311a.setCenterTextColor(this.f8318h.getResources().getColor(e1c0.f7140g));
            this.f8312b.setEditTextHintColor(this.f8318h.getResources().getColor(e1c0.f7142h));
            this.f8312b.setLeftImageRes(f3c0.f7859n);
        }
        m10394N();
        this.f8312b.setCancelListener(new View.OnClickListener() { // from class: l.y240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15205a.m10366B(view);
            }
        });
        this.f8312b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.z240
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f15559a.m10385C(view, z);
            }
        });
        this.f8311a.setLeftRegionClick(new View.OnClickListener() { // from class: l.a340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5561a.m10367E(view);
            }
        });
        return viewM10396q;
    }

    /* JADX INFO: renamed from: q */
    public View m10396q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h340.m10515b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m10395i1(x240 x240Var) {
        this.f8319i = x240Var;
    }

    /* JADX INFO: renamed from: u */
    public void m10398u() {
        if (this.f8316f == null) {
            m10383z();
        }
        if (this.f8317g == null) {
            n90 n90Var = new n90(this.f8318h, (TextUtils.equals(this.f8319i.f14743c, qnh.f12295K) || TextUtils.equals(this.f8319i.f14743c, "p_moment_post_guide_pop")) ? false : true);
            this.f8317g = n90Var;
            n90Var.m12125L(new Runnable() { // from class: l.e340
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7185a.m10382y();
                }
            });
            this.f8317g.m12126M(new e30() { // from class: l.f340
                public final void call(Object obj) {
                    this.f7560a.m10393M((k90) obj);
                }
            });
        }
        boolean zM12223U = nkg.m12223U();
        x240 x240Var = this.f8319i;
        if (zM12223U) {
            x240Var.m15990k0();
        } else {
            x240Var.m15998t0();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f8318h);
        linearLayoutManager.setOrientation(1);
        this.f8314d.setLayoutManager(linearLayoutManager);
        this.f8314d.setAdapter(this.f8317g);
    }

    /* JADX INFO: renamed from: v */
    public void m10399v() {
        if (NullChecker.a(this.f8316f)) {
            this.f8316f.destroy();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10400w(k90 k90Var) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        if (NullChecker.a(k90Var)) {
            bundle.putString("extra_addressInfo_name", k90Var.m11398c());
            bundle.putString("extra_addressInfo_address", k90Var.m11396a());
            bundle.putSerializable("extra_addressInfo_location", k90Var.m11397b());
            if (TextUtils.equals(this.f8319i.f14743c, qnh.f12295K) || TextUtils.equals(this.f8319i.f14743c, "p_moment_post_guide_pop")) {
                aa80.m8468b().m8470c(k90Var);
            }
        }
        intent.putExtras(bundle);
        this.f8318h.setResult(-1, intent);
        this.f8318h.finish();
    }

    /* JADX INFO: renamed from: x */
    public void m10401x() {
        if (NullChecker.b(this.f8312b)) {
            this.f8312b.clearFocus();
            this.f8318h.hideInput(this.f8312b);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.g340$b */
    public class C2388b implements TextWatcher {
        public C2388b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            g340.this.m10391K(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
