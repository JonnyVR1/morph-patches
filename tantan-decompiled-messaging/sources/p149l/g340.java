package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VMenuBar;
import p147v.VRecyclerView;
import p147v.VSearchBar;

/* JADX INFO: loaded from: classes12.dex */
public class g340 implements s7m<x240> {

    /* JADX INFO: renamed from: a */
    public VMenuBar f100340a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f100341b;

    /* JADX INFO: renamed from: c */
    public ImageView f100342c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f100343d;

    /* JADX INFO: renamed from: f */
    public p90 f100345f;

    /* JADX INFO: renamed from: g */
    public n90 f100346g;

    /* JADX INFO: renamed from: h */
    public NewPostLocationAct f100347h;

    /* JADX INFO: renamed from: i */
    public x240 f100348i;

    /* JADX INFO: renamed from: e */
    public int f100344e = 2;

    /* JADX INFO: renamed from: j */
    public boolean f100349j = true;

    /* JADX INFO: renamed from: k */
    public List<k90> f100350k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public eml.InterfaceC16646a f100351l = new C16985a();

    /* JADX INFO: renamed from: l.g340$a */
    public class C16985a implements eml.InterfaceC16646a {
        public C16985a() {
        }

        @Override // p149l.eml.InterfaceC16646a
        /* JADX INFO: renamed from: a */
        public void mo117206a(List<k90> list) {
            if (NullChecker.m81304b(g340.this.f100346g)) {
                g340.this.f100346g.m158522K(list);
                xdl0.m208344M(g340.this.f100342c, list.size() < g340.this.f100344e);
                xdl0.m208344M(g340.this.f100343d, list.size() >= g340.this.f100344e);
            }
            if (g340.this.f100349j) {
                g340.this.f100350k = list;
            }
        }

        @Override // p149l.eml.InterfaceC16646a
        public void onError(Throwable th) {
            lsi0.m151584n(R$string.f38981U);
        }
    }

    public g340(NewPostLocationAct newPostLocationAct) {
        this.f100347h = newPostLocationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m124204B(View view) {
        this.f100347h.hideInput(this.f100341b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m124205E(View view) {
        this.f100347h.hideInput();
        this.f100347h.m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m124220y() {
        m124236w(null);
    }

    /* JADX INFO: renamed from: z */
    private void m124221z() {
        p90 p90Var = new p90(this.f100351l);
        this.f100345f = p90Var;
        p90Var.init();
    }

    /* JADX INFO: renamed from: A */
    public void m124222A(Bundle bundle) {
        if (!nkg.m159864U() || (nkg.m159864U() && cjh.m107155a(new d30() { // from class: l.b340
            @Override // p149l.d30
            public final void call() {
                this.f72803a.m124206F();
            }
        }))) {
            m124234u();
            if (!pvv.m171693c() || cjh.m107157c()) {
                return;
            }
            FeedModule.m60222H().mo30757dl(act(), true, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m124223C(View view, boolean z) {
        this.f100341b.setPadding(t100.m186890d(19.0f), 0, t100.m186890d(z ? 7.0f : 19.0f), 0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f100347h;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m124224G() {
        lsi0.m151595y("开启定位服务，获取精准定位");
        this.f100347h.m50458m2();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m124225H(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m124236w(null);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m124206F() {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.c340
            @Override // p149l.d30
            public final void call() {
                this.f78436a.m124224G();
            }
        }, new e30() { // from class: l.d340
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83460a.m124225H((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(this.f100347h);
    }

    /* JADX INFO: renamed from: J */
    public void m124227J(Location location) {
        this.f100345f.mo114573a(location, this.f100347h);
    }

    /* JADX INFO: renamed from: K */
    public final void m124228K(CharSequence charSequence) {
        if (this.f100346g == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f100346g.m158522K(this.f100350k);
            xdl0.m208344M(this.f100342c, false);
            xdl0.m208344M(this.f100343d, true);
        } else {
            this.f100349j = false;
            if (nkg.m159864U()) {
                this.f100348i.m206831l0(charSequence.toString());
            } else {
                this.f100345f.m114575c(this.f100348i.f189125a, this.f100347h, charSequence.toString());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m124229L(List<k90> list, String str) {
        if (NullChecker.m81304b(this.f100346g) && this.f100341b.getEditText().getText().toString().equals(str)) {
            this.f100346g.m158522K(list);
            xdl0.m208344M(this.f100342c, list.size() < this.f100344e);
            xdl0.m208344M(this.f100343d, list.size() >= this.f100344e);
        }
        if (this.f100349j) {
            this.f100350k.addAll(list);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m124230M(k90 k90Var) {
        m124236w(k90Var);
    }

    /* JADX INFO: renamed from: N */
    public final void m124231N() {
        this.f100341b.m223200d(new C16986b());
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f100347h;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM124232q = m124232q(layoutInflater, viewGroup);
        if (u2h.m191499h()) {
            this.f100340a.setLeftImage(f3c0.f94568m);
            this.f100340a.setCenterTextColor(this.f100347h.getResources().getColor(e1c0.f88784g));
            this.f100341b.setEditTextHintColor(this.f100347h.getResources().getColor(e1c0.f88786h));
            this.f100341b.setLeftImageRes(f3c0.f94576n);
        }
        m124231N();
        this.f100341b.setCancelListener(new View.OnClickListener() { // from class: l.y240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195490a.m124204B(view);
            }
        });
        this.f100341b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.z240
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f201158a.m124223C(view, z);
            }
        });
        this.f100340a.setLeftRegionClick(new View.OnClickListener() { // from class: l.a340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67328a.m124205E(view);
            }
        });
        return viewM124232q;
    }

    /* JADX INFO: renamed from: q */
    public View m124232q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h340.m129160b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x240 x240Var) {
        this.f100348i = x240Var;
    }

    /* JADX INFO: renamed from: u */
    public void m124234u() {
        if (this.f100345f == null) {
            m124221z();
        }
        if (this.f100346g == null) {
            n90 n90Var = new n90(this.f100347h, (TextUtils.equals(this.f100348i.f189127c, qnh.f155438K) || TextUtils.equals(this.f100348i.f189127c, "p_moment_post_guide_pop")) ? false : true);
            this.f100346g = n90Var;
            n90Var.m158523L(new Runnable() { // from class: l.e340
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88990a.m124220y();
                }
            });
            this.f100346g.m158524M(new e30() { // from class: l.f340
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94245a.m124230M((k90) obj);
                }
            });
        }
        boolean zM159864U = nkg.m159864U();
        x240 x240Var = this.f100348i;
        if (zM159864U) {
            x240Var.m206830k0();
        } else {
            x240Var.m206838t0();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f100347h);
        linearLayoutManager.setOrientation(1);
        this.f100343d.setLayoutManager(linearLayoutManager);
        this.f100343d.setAdapter(this.f100346g);
    }

    /* JADX INFO: renamed from: v */
    public void m124235v() {
        if (NullChecker.m81303a(this.f100345f)) {
            this.f100345f.destroy();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m124236w(k90 k90Var) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        if (NullChecker.m81303a(k90Var)) {
            bundle.putString("extra_addressInfo_name", k90Var.m144984c());
            bundle.putString("extra_addressInfo_address", k90Var.m144982a());
            bundle.putSerializable("extra_addressInfo_location", k90Var.m144983b());
            if (TextUtils.equals(this.f100348i.f189127c, qnh.f155438K) || TextUtils.equals(this.f100348i.f189127c, "p_moment_post_guide_pop")) {
                aa80.m95532b().m95534c(k90Var);
            }
        }
        intent.putExtras(bundle);
        this.f100347h.setResult(-1, intent);
        this.f100347h.m50458m2();
    }

    /* JADX INFO: renamed from: x */
    public void m124237x() {
        if (NullChecker.m81304b(this.f100341b)) {
            this.f100341b.clearFocus();
            this.f100347h.hideInput(this.f100341b);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.g340$b */
    public class C16986b implements TextWatcher {
        public C16986b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            g340.this.m124228K(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
