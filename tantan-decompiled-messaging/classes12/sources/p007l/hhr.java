package p007l;

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
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserFilterBar;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.member.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.b3c0;
import l.d30;
import l.gr9;
import l.ihr;
import l.q860;
import l.s7m;
import l.vwb;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hhr implements s7m<ehr> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f8723a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f8724b;

    /* JADX INFO: renamed from: c */
    public VFrame f8725c;

    /* JADX INFO: renamed from: d */
    public VFrame f8726d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f8727e;

    /* JADX INFO: renamed from: f */
    public VImage f8728f;

    /* JADX INFO: renamed from: g */
    public VText f8729g;

    /* JADX INFO: renamed from: h */
    public VProgressBar f8730h;

    /* JADX INFO: renamed from: i */
    public VPullUpRecyclerView f8731i;

    /* JADX INFO: renamed from: j */
    public View f8732j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterBar f8733k;

    /* JADX INFO: renamed from: l */
    public Button f8734l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f8735m;

    /* JADX INFO: renamed from: n */
    public VText f8736n;

    /* JADX INFO: renamed from: o */
    public VText f8737o;

    /* JADX INFO: renamed from: p */
    public LikedUserFrag f8738p;

    /* JADX INFO: renamed from: q */
    public ehr f8739q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f8740r;

    /* JADX INFO: renamed from: s */
    public ArrayList<Animator> f8741s = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public sm0 f8742t;

    /* JADX INFO: renamed from: l.hhr$a */
    public class C2394a extends GridLayoutManager.c {
        public C2394a() {
        }

        /* JADX INFO: renamed from: f */
        public int m10645f(int i) {
            if (hhr.this.f8738p.m454Q4().getItemViewType(i) == 0) {
                return hhr.this.f8740r.m();
            }
            return 1;
        }
    }

    public hhr(LikedUserFrag likedUserFrag) {
        this.f8738p = likedUserFrag;
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m10627C0() {
        return this.f8738p.act();
    }

    /* JADX INFO: renamed from: c */
    public View m10628c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ihr.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m10633i1(ehr ehrVar) {
        this.f8739q = ehrVar;
    }

    public void destroy() {
        if (vwb.J(this.f8741s)) {
            return;
        }
        Iterator<Animator> it = this.f8741s.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f8741s.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m10630e() {
        xdl0.M(this.f8723a, false);
    }

    /* JADX INFO: renamed from: f */
    public void m10631f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f8738p.act());
        linearLayoutManager.setOrientation(0);
        this.f8724b.setLayoutManager(linearLayoutManager);
        sm0 sm0Var = new sm0(this.f8738p);
        this.f8742t = sm0Var;
        this.f8724b.setAdapter(sm0Var);
    }

    /* JADX INFO: renamed from: i */
    public void m10632i() {
        xdl0.M0(this.f8733k, false);
        this.f8731i.setBackgroundColor(-1);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10628c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m10634j(boolean z, boolean z2) {
        if (z) {
            this.f8726d.setVisibility(0);
            this.f8727e.setVisibility(4);
            this.f8730h.setVisibility(0);
            this.f8731i.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f8726d;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f8727e.setVisibility(4);
            this.f8730h.setVisibility(4);
            this.f8731i.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f8727e.setVisibility(0);
        this.f8730h.setVisibility(4);
        this.f8731i.setVisibility(4);
        this.f8729g.setText(R.string.v);
    }

    /* JADX INFO: renamed from: k */
    public void m10635k(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f8738p.act(), 2);
        this.f8740r = gridLayoutManager;
        gridLayoutManager.v(new C2394a());
        this.f8731i.setLayoutManager(this.f8740r);
        this.f8731i.setAdapter(this.f8738p.m454Q4());
        m10643v(d30Var);
        this.f8723a.setLeftIconAsBack(this.f8738p.act());
        this.f8723a.setLeftIconResource(b3c0.b);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10636l(View view) {
        this.f8739q.m9889f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10637m(View view) {
        this.f8739q.m9889f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: renamed from: n */
    public void m10638n(boolean z) {
        m10644w(!z);
        this.f8738p.m454Q4().m17387R(z);
    }

    /* JADX INFO: renamed from: p */
    public void m10639p(List<tm0> list) {
        if (this.f8742t == null) {
            return;
        }
        if (!xdl0.O0(this.f8724b)) {
            xdl0.M(this.f8724b, true);
        }
        this.f8742t.m14260G(list);
    }

    /* JADX INFO: renamed from: q */
    public void m10640q() {
        if (!gr9.d()) {
            this.f8734l.setOnClickListener(new View.OnClickListener() { // from class: l.ghr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8455a.m10637m(view);
                }
            });
            return;
        }
        xdl0.M(this.f8735m, true);
        xdl0.M(this.f8734l, false);
        xdl0.E0(this.f8735m, new View.OnClickListener() { // from class: l.fhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8104a.m10636l(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m10641s(q860<LikedUser> q860Var, boolean z) {
        int iD = q860Var == null ? 0 : q860Var.d();
        m10642u(this.f8738p.getResources().getString(R.string.w, iD > 99 ? "99+" : String.valueOf(iD)));
        if (iD != 0) {
            this.f8738p.m454Q4().m17389T(q860Var.a, z);
            m10634j(false, false);
            m10644w(!z);
        } else {
            if (CoreModule.P().a().Vf()) {
                m10644w(!z);
            } else {
                m10644w(false);
            }
            m10634j(false, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m10642u(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        this.f8723a.setTitle(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v */
    public final void m10643v(d30 d30Var) {
        this.f8731i.setOnPullUpListener(d30Var);
        this.f8731i.setPullUpInterval(300L);
    }

    /* JADX INFO: renamed from: w */
    public void m10644w(boolean z) {
        if (gr9.d()) {
            xdl0.M(this.f8735m, z);
        } else {
            xdl0.M(this.f8734l, z);
        }
    }
}
