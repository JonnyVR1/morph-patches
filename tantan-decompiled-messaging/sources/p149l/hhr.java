package p149l;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFilterBar;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFrag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class hhr implements s7m<ehr> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f107803a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f107804b;

    /* JADX INFO: renamed from: c */
    public VFrame f107805c;

    /* JADX INFO: renamed from: d */
    public VFrame f107806d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f107807e;

    /* JADX INFO: renamed from: f */
    public VImage f107808f;

    /* JADX INFO: renamed from: g */
    public VText f107809g;

    /* JADX INFO: renamed from: h */
    public VProgressBar f107810h;

    /* JADX INFO: renamed from: i */
    public VPullUpRecyclerView f107811i;

    /* JADX INFO: renamed from: j */
    public View f107812j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterBar f107813k;

    /* JADX INFO: renamed from: l */
    public Button f107814l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f107815m;

    /* JADX INFO: renamed from: n */
    public VText f107816n;

    /* JADX INFO: renamed from: o */
    public VText f107817o;

    /* JADX INFO: renamed from: p */
    public LikedUserFrag f107818p;

    /* JADX INFO: renamed from: q */
    public ehr f107819q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f107820r;

    /* JADX INFO: renamed from: s */
    public ArrayList<Animator> f107821s = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public sm0 f107822t;

    /* JADX INFO: renamed from: l.hhr$a */
    public class C17318a extends GridLayoutManager.AbstractC0553c {
        public C17318a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (hhr.this.f107818p.m46782Q4().getItemViewType(i) == 0) {
                return hhr.this.f107820r.m3317m();
            }
            return 1;
        }
    }

    public hhr(LikedUserFrag likedUserFrag) {
        this.f107818p = likedUserFrag;
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107818p.act();
    }

    /* JADX INFO: renamed from: c */
    public View m131132c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ihr.m136270b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ehr ehrVar) {
        this.f107819q = ehrVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (vwb.m200296J(this.f107821s)) {
            return;
        }
        Iterator<Animator> it = this.f107821s.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f107821s.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m131134e() {
        xdl0.m208344M(this.f107803a, false);
    }

    /* JADX INFO: renamed from: f */
    public void m131135f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f107818p.act());
        linearLayoutManager.setOrientation(0);
        this.f107804b.setLayoutManager(linearLayoutManager);
        sm0 sm0Var = new sm0(this.f107818p);
        this.f107822t = sm0Var;
        this.f107804b.setAdapter(sm0Var);
    }

    /* JADX INFO: renamed from: i */
    public void m131136i() {
        xdl0.m208345M0(this.f107813k, false);
        this.f107811i.setBackgroundColor(-1);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m131132c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m131137j(boolean z, boolean z2) {
        if (z) {
            this.f107806d.setVisibility(0);
            this.f107807e.setVisibility(4);
            this.f107810h.setVisibility(0);
            this.f107811i.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f107806d;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f107807e.setVisibility(4);
            this.f107810h.setVisibility(4);
            this.f107811i.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f107807e.setVisibility(0);
        this.f107810h.setVisibility(4);
        this.f107811i.setVisibility(4);
        this.f107809g.setText(R$string.f20690v);
    }

    /* JADX INFO: renamed from: k */
    public void m131138k(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f107818p.act(), 2);
        this.f107820r = gridLayoutManager;
        gridLayoutManager.m3326v(new C17318a());
        this.f107811i.setLayoutManager(this.f107820r);
        this.f107811i.setAdapter(this.f107818p.m46782Q4());
        m131146v(d30Var);
        this.f107803a.setLeftIconAsBack(this.f107818p.act());
        this.f107803a.setLeftIconResource(b3c0.f73010b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m131139l(View view) {
        this.f107819q.m116557f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m131140m(View view) {
        this.f107819q.m116557f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: n */
    public void m131141n(boolean z) {
        m131147w(!z);
        this.f107818p.m46782Q4().m218400R(z);
    }

    /* JADX INFO: renamed from: p */
    public void m131142p(List<tm0> list) {
        if (this.f107822t == null) {
            return;
        }
        if (!xdl0.m208349O0(this.f107804b)) {
            xdl0.m208344M(this.f107804b, true);
        }
        this.f107822t.m184900G(list);
    }

    /* JADX INFO: renamed from: q */
    public void m131143q() {
        if (!gr9.m127679d()) {
            this.f107814l.setOnClickListener(new View.OnClickListener() { // from class: l.ghr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102678a.m131140m(view);
                }
            });
            return;
        }
        xdl0.m208344M(this.f107815m, true);
        xdl0.m208344M(this.f107814l, false);
        xdl0.m208329E0(this.f107815m, new View.OnClickListener() { // from class: l.fhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97541a.m131139l(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m131144s(q860<LikedUser> q860Var, boolean z) {
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        m131145u(this.f107818p.getResources().getString(R$string.f20693w, iM173344d > 99 ? "99+" : String.valueOf(iM173344d)));
        if (iM173344d != 0) {
            this.f107818p.m46782Q4().m218402T(q860Var.f153135a, z);
            m131137j(false, false);
            m131147w(!z);
        } else {
            if (CoreModule.m29935P().m94651a().mo33433Vf()) {
                m131147w(!z);
            } else {
                m131147w(false);
            }
            m131137j(false, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m131145u(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        this.f107803a.setTitle(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v */
    public final void m131146v(d30 d30Var) {
        this.f107811i.setOnPullUpListener(d30Var);
        this.f107811i.setPullUpInterval(300L);
    }

    /* JADX INFO: renamed from: w */
    public void m131147w(boolean z) {
        if (gr9.m127679d()) {
            xdl0.m208344M(this.f107815m, z);
        } else {
            xdl0.m208344M(this.f107814l, z);
        }
    }
}
