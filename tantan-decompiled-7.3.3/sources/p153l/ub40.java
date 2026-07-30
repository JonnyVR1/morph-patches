package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VMenuBar;
import p151v.VRecyclerView;
import p151v.VSearchBar;

/* JADX INFO: loaded from: classes13.dex */
public class ub40 implements iam<lb40> {

    /* JADX INFO: renamed from: a */
    public VMenuBar f178262a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f178263b;

    /* JADX INFO: renamed from: c */
    public ImageView f178264c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f178265d;

    /* JADX INFO: renamed from: f */
    public l90 f178267f;

    /* JADX INFO: renamed from: g */
    public j90 f178268g;

    /* JADX INFO: renamed from: h */
    public NewPostLocationAct f178269h;

    /* JADX INFO: renamed from: i */
    public lb40 f178270i;

    /* JADX INFO: renamed from: e */
    public int f178266e = 2;

    /* JADX INFO: renamed from: j */
    public boolean f178271j = true;

    /* JADX INFO: renamed from: k */
    public List<g90> f178272k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public qol.InterfaceC19615a f178273l = new C20534a();

    /* JADX INFO: renamed from: l.ub40$a */
    public class C20534a implements qol.InterfaceC19615a {
        public C20534a() {
        }

        @Override // p153l.qol.InterfaceC19615a
        /* JADX INFO: renamed from: a */
        public void mo146707a(List<g90> list) {
            if (NullChecker.m82487b(ub40.this.f178268g)) {
                ub40.this.f178268g.m143925K(list);
                bnl0.m105524M(ub40.this.f178264c, list.size() < ub40.this.f178266e);
                bnl0.m105524M(ub40.this.f178265d, list.size() >= ub40.this.f178266e);
            }
            if (ub40.this.f178271j) {
                ub40.this.f178272k = list;
            }
        }

        @Override // p153l.qol.InterfaceC19615a
        public void onError(Throwable th) {
            o1j0.m165640n(R$string.f39829U);
        }
    }

    public ub40(NewPostLocationAct newPostLocationAct) {
        this.f178269h = newPostLocationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m195210B(View view) {
        this.f178269h.hideInput(this.f178263b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m195211E(View view) {
        this.f178269h.hideInput();
        this.f178269h.m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m195226y() {
        m195242w(null);
    }

    /* JADX INFO: renamed from: z */
    private void m195227z() {
        l90 l90Var = new l90(this.f178273l);
        this.f178267f = l90Var;
        l90Var.init();
    }

    /* JADX INFO: renamed from: A */
    public void m195228A(Bundle bundle) {
        if (!cmg.m111193U() || (cmg.m111193U() && rkh.m181857a(new x20() { // from class: l.pb40
            @Override // p153l.x20
            public final void call() {
                this.f151346a.m195212F();
            }
        }))) {
            m195240u();
            if (!qxv.m178618c() || rkh.m181859c()) {
                return;
            }
            FeedModule.m61406H().mo31760dl(act(), true, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m195229C(View view, boolean z) {
        this.f178263b.setPadding(qa00.m175859d(19.0f), 0, qa00.m175859d(z ? 7.0f : 19.0f), 0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f178269h;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m195230G() {
        o1j0.m165651y("开启定位服务，获取精准定位");
        this.f178269h.m51642n2();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m195231H(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m195242w(null);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m195212F() {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.qb40
            @Override // p153l.x20
            public final void call() {
                this.f156454a.m195230G();
            }
        }, new y20() { // from class: l.rb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161980a.m195231H((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(this.f178269h);
    }

    /* JADX INFO: renamed from: J */
    public void m195233J(Location location) {
        this.f178267f.mo119236a(location, this.f178269h);
    }

    /* JADX INFO: renamed from: K */
    public final void m195234K(CharSequence charSequence) {
        if (this.f178268g == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f178268g.m143925K(this.f178272k);
            bnl0.m105524M(this.f178264c, false);
            bnl0.m105524M(this.f178265d, true);
        } else {
            this.f178271j = false;
            if (cmg.m111193U()) {
                this.f178270i.m153566l0(charSequence.toString());
            } else {
                this.f178267f.m119238c(this.f178270i.f130771a, this.f178269h, charSequence.toString());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m195235L(List<g90> list, String str) {
        if (NullChecker.m82487b(this.f178268g) && this.f178263b.getEditText().getText().toString().equals(str)) {
            this.f178268g.m143925K(list);
            bnl0.m105524M(this.f178264c, list.size() < this.f178266e);
            bnl0.m105524M(this.f178265d, list.size() >= this.f178266e);
        }
        if (this.f178271j) {
            this.f178272k.addAll(list);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m195236M(g90 g90Var) {
        m195242w(g90Var);
    }

    /* JADX INFO: renamed from: N */
    public final void m195237N() {
        this.f178263b.m224446d(new C20535b());
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f178269h;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM195238q = m195238q(layoutInflater, viewGroup);
        if (j4h.m143424h()) {
            this.f178262a.setLeftImage(lbc0.f131086m);
            this.f178262a.setCenterTextColor(this.f178269h.getResources().getColor(k9c0.f124507g));
            this.f178263b.setEditTextHintColor(this.f178269h.getResources().getColor(k9c0.f124509h));
            this.f178263b.setLeftImageRes(lbc0.f131094n);
        }
        m195237N();
        this.f178263b.setCancelListener(new View.OnClickListener() { // from class: l.mb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135616a.m195210B(view);
            }
        });
        this.f178263b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.nb40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f141070a.m195229C(view, z);
            }
        });
        this.f178262a.setLeftRegionClick(new View.OnClickListener() { // from class: l.ob40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145933a.m195211E(view);
            }
        });
        return viewM195238q;
    }

    /* JADX INFO: renamed from: q */
    public View m195238q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vb40.m200686b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lb40 lb40Var) {
        this.f178270i = lb40Var;
    }

    /* JADX INFO: renamed from: u */
    public void m195240u() {
        if (this.f178267f == null) {
            m195227z();
        }
        if (this.f178268g == null) {
            j90 j90Var = new j90(this.f178269h, (TextUtils.equals(this.f178270i.f130773c, fph.f100129K) || TextUtils.equals(this.f178270i.f130773c, "p_moment_post_guide_pop")) ? false : true);
            this.f178268g = j90Var;
            j90Var.m143926L(new Runnable() { // from class: l.sb40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167106a.m195226y();
                }
            });
            this.f178268g.m143927M(new y20() { // from class: l.tb40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172831a.m195236M((g90) obj);
                }
            });
        }
        boolean zM111193U = cmg.m111193U();
        lb40 lb40Var = this.f178270i;
        if (zM111193U) {
            lb40Var.m153565k0();
        } else {
            lb40Var.m153573t0();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f178269h);
        linearLayoutManager.setOrientation(1);
        this.f178265d.setLayoutManager(linearLayoutManager);
        this.f178265d.setAdapter(this.f178268g);
    }

    /* JADX INFO: renamed from: v */
    public void m195241v() {
        if (NullChecker.m82486a(this.f178267f)) {
            this.f178267f.destroy();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m195242w(g90 g90Var) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        if (NullChecker.m82486a(g90Var)) {
            bundle.putString("extra_addressInfo_name", g90Var.m129468c());
            bundle.putString("extra_addressInfo_address", g90Var.m129466a());
            bundle.putSerializable("extra_addressInfo_location", g90Var.m129467b());
            if (TextUtils.equals(this.f178270i.f130773c, fph.f100129K) || TextUtils.equals(this.f178270i.f130773c, "p_moment_post_guide_pop")) {
                gi80.m130297b().m130299c(g90Var);
            }
        }
        intent.putExtras(bundle);
        this.f178269h.setResult(-1, intent);
        this.f178269h.m51642n2();
    }

    /* JADX INFO: renamed from: x */
    public void m195243x() {
        if (NullChecker.m82487b(this.f178263b)) {
            this.f178263b.clearFocus();
            this.f178269h.hideInput(this.f178263b);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ub40$b */
    public class C20535b implements TextWatcher {
        public C20535b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ub40.this.m195234K(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
