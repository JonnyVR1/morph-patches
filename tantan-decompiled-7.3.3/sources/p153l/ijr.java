package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFilterBar;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFrag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class ijr implements iam<fjr> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f115255a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f115256b;

    /* JADX INFO: renamed from: c */
    public VFrame f115257c;

    /* JADX INFO: renamed from: d */
    public VFrame f115258d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f115259e;

    /* JADX INFO: renamed from: f */
    public VImage f115260f;

    /* JADX INFO: renamed from: g */
    public VText f115261g;

    /* JADX INFO: renamed from: h */
    public VProgressBar f115262h;

    /* JADX INFO: renamed from: i */
    public VPullUpRecyclerView f115263i;

    /* JADX INFO: renamed from: j */
    public View f115264j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterBar f115265k;

    /* JADX INFO: renamed from: l */
    public Button f115266l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f115267m;

    /* JADX INFO: renamed from: n */
    public VText f115268n;

    /* JADX INFO: renamed from: o */
    public VText f115269o;

    /* JADX INFO: renamed from: p */
    public LikedUserFrag f115270p;

    /* JADX INFO: renamed from: q */
    public fjr f115271q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f115272r;

    /* JADX INFO: renamed from: s */
    public ArrayList<Animator> f115273s = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public om0 f115274t;

    /* JADX INFO: renamed from: l.ijr$a */
    public class C17727a extends GridLayoutManager.AbstractC0554c {
        public C17727a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (ijr.this.f115270p.m47965Q4().getItemViewType(i) == 0) {
                return ijr.this.f115272r.m3318m();
            }
            return 1;
        }
    }

    public ijr(LikedUserFrag likedUserFrag) {
        this.f115270p = likedUserFrag;
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115270p.act();
    }

    /* JADX INFO: renamed from: c */
    public View m140223c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jjr.m145113b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fjr fjrVar) {
        this.f115271q = fjrVar;
    }

    @Override // p153l.iam
    public void destroy() {
        if (jyb.m147479J(this.f115273s)) {
            return;
        }
        Iterator<Animator> it = this.f115273s.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f115273s.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m140225e() {
        bnl0.m105524M(this.f115255a, false);
    }

    /* JADX INFO: renamed from: f */
    public void m140226f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f115270p.act());
        linearLayoutManager.setOrientation(0);
        this.f115256b.setLayoutManager(linearLayoutManager);
        om0 om0Var = new om0(this.f115270p);
        this.f115274t = om0Var;
        this.f115256b.setAdapter(om0Var);
    }

    /* JADX INFO: renamed from: i */
    public void m140227i() {
        bnl0.m105525M0(this.f115265k, false);
        this.f115263i.setBackgroundColor(-1);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m140223c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m140228j(boolean z, boolean z2) {
        if (z) {
            this.f115258d.setVisibility(0);
            this.f115259e.setVisibility(4);
            this.f115262h.setVisibility(0);
            this.f115263i.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f115258d;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f115259e.setVisibility(4);
            this.f115262h.setVisibility(4);
            this.f115263i.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f115259e.setVisibility(0);
        this.f115262h.setVisibility(4);
        this.f115263i.setVisibility(4);
        this.f115261g.setText(R$string.f21432v);
    }

    /* JADX INFO: renamed from: k */
    public void m140229k(x20 x20Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f115270p.act(), 2);
        this.f115272r = gridLayoutManager;
        gridLayoutManager.m3327v(new C17727a());
        this.f115263i.setLayoutManager(this.f115272r);
        this.f115263i.setAdapter(this.f115270p.m47965Q4());
        m140237v(x20Var);
        this.f115255a.setLeftIconAsBack(this.f115270p.act());
        this.f115255a.setLeftIconResource(gbc0.f103261b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m140230l(View view) {
        this.f115271q.m125912f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m140231m(View view) {
        this.f115271q.m125912f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: n */
    public void m140232n(boolean z) {
        m140238w(!z);
        this.f115270p.m47965Q4().m97899R(z);
    }

    /* JADX INFO: renamed from: p */
    public void m140233p(List<pm0> list) {
        if (this.f115274t == null) {
            return;
        }
        if (!bnl0.m105529O0(this.f115256b)) {
            bnl0.m105524M(this.f115256b, true);
        }
        this.f115274t.m168180G(list);
    }

    /* JADX INFO: renamed from: q */
    public void m140234q() {
        if (!rs9.m182935d()) {
            this.f115266l.setOnClickListener(new View.OnClickListener() { // from class: l.hjr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110297a.m140231m(view);
                }
            });
            return;
        }
        bnl0.m105524M(this.f115267m, true);
        bnl0.m105524M(this.f115266l, false);
        bnl0.m105509E0(this.f115267m, new View.OnClickListener() { // from class: l.gjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104646a.m140230l(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m140235s(vg60<LikedUser> vg60Var, boolean z) {
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        m140236u(this.f115270p.getResources().getString(R$string.f21435w, iM201222d > 99 ? "99+" : String.valueOf(iM201222d)));
        if (iM201222d != 0) {
            this.f115270p.m47965Q4().m97901T(vg60Var.f184001a, z);
            m140228j(false, false);
            m140238w(!z);
        } else {
            if (CoreModule.m30933P().m143405a().mo34436Vf()) {
                m140238w(!z);
            } else {
                m140238w(false);
            }
            m140228j(false, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m140236u(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        this.f115255a.setTitle(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v */
    public final void m140237v(x20 x20Var) {
        this.f115263i.setOnPullUpListener(x20Var);
        this.f115263i.setPullUpInterval(300L);
    }

    /* JADX INFO: renamed from: w */
    public void m140238w(boolean z) {
        if (rs9.m182935d()) {
            bnl0.m105524M(this.f115267m, z);
        } else {
            bnl0.m105524M(this.f115266l, z);
        }
    }
}
