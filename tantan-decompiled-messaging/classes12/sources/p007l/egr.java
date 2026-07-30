package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p001ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.newui.PlatformQualificationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bzc0;
import l.d30;
import l.ggr;
import l.s7m;
import l.sjc0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xma;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class egr implements s7m<bgr> {

    /* JADX INFO: renamed from: a */
    public VPullUpRecyclerView f7354a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f7355b;

    /* JADX INFO: renamed from: c */
    public TextView f7356c;

    /* JADX INFO: renamed from: d */
    public PlatformQualificationView f7357d;

    /* JADX INFO: renamed from: e */
    public Button f7358e;

    /* JADX INFO: renamed from: f */
    public LikedUsersMyTabFrag f7359f;

    /* JADX INFO: renamed from: g */
    public bgr f7360g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f7361h;

    /* JADX INFO: renamed from: i */
    public Boolean f7362i = Boolean.FALSE;

    /* JADX INFO: renamed from: j */
    public boolean f7363j = false;

    /* JADX INFO: renamed from: k */
    public boolean f7364k = false;

    /* JADX INFO: renamed from: l.egr$a */
    public class C2371a extends GridLayoutManager.c {
        public C2371a() {
        }

        /* JADX INFO: renamed from: f */
        public int m9833f(int i) {
            if (egr.this.f7359f.m492O4().getItemViewType(i) == 2) {
                return egr.this.f7361h.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.egr$b */
    public class C2372b extends RecyclerView.t {
        public C2372b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m9835b() {
            egr.this.f7364k = false;
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (xma.e4() && bzc0.e()) {
                if (!egr.this.f7363j && recyclerView.computeVerticalScrollOffset() > t100.d(600.0f)) {
                    egr.this.f7363j = true;
                    egr.this.f7364k = true;
                    egr.this.f7360g.m8883N0("p_navigation,ilike_module", new d30() { // from class: l.fgr
                        public final void call() {
                            this.f8101a.m9835b();
                        }
                    });
                } else if (sjc0.a(recyclerView) && sjc0.b(recyclerView) && !egr.this.f7364k) {
                    egr.this.f7360g.m8882L0("p_navigation,ilike_module");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.egr$c */
    public class C2373c implements nfr.InterfaceC2440b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LikedUser f7367a;

        public C2373c(LikedUser likedUser) {
            this.f7367a = likedUser;
        }

        @Override // p007l.nfr.InterfaceC2440b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo9836a() {
            return this.f7367a;
        }

        @Override // p007l.nfr.InterfaceC2440b
        public int getItemType() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.egr$d */
    public class C2374d implements nfr.InterfaceC2440b {
        public C2374d() {
        }

        @Override // p007l.nfr.InterfaceC2440b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo9836a() {
            return null;
        }

        @Override // p007l.nfr.InterfaceC2440b
        public int getItemType() {
            return 2;
        }
    }

    public egr(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        this.f7359f = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m9821k(View view) {
        this.f7360g.m8882L0("p_navigation,ilike_module");
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m9822C0() {
        return this.f7359f.act();
    }

    /* JADX INFO: renamed from: i */
    public View m9823i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ggr.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9823i = m9823i(layoutInflater, viewGroup);
        viewM9823i.setBackgroundColor(-1);
        return viewM9823i;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m9824i1(bgr bgrVar) {
        this.f7360g = bgrVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2373c m9826l(LikedUser likedUser) {
        return new C2373c(likedUser);
    }

    /* JADX INFO: renamed from: m */
    public void m9827m(boolean z) {
        m9832s(this.f7362i.booleanValue());
        this.f7359f.m492O4().m12192R(z);
    }

    /* JADX INFO: renamed from: n */
    public void m9828n() {
        this.f7358e.setOnClickListener(new View.OnClickListener() { // from class: l.cgr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6645a.m9821k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m9829p(ArrayList<LikedUser> arrayList, boolean z) {
        if (vwb.J(arrayList)) {
            m9830q(true);
            return;
        }
        m9830q(false);
        ArrayList<nfr.InterfaceC2440b> arrayList2 = new ArrayList<>();
        arrayList2.addAll(vwb.Q(arrayList, new w9j() { // from class: l.dgr
            public final Object call(Object obj) {
                return this.f6929a.m9826l((LikedUser) obj);
            }
        }));
        arrayList2.add(new C2374d());
        this.f7359f.m492O4().m12194T(arrayList2, z);
    }

    /* JADX INFO: renamed from: q */
    public void m9830q(boolean z) {
        xdl0.M(this.f7355b, z);
        xdl0.M(this.f7354a, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m9831r() {
        this.f7356c.setText("去滑卡发现更多喜欢的人");
        xdl0.M(this.f7357d, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f7359f.act(), 2);
        this.f7361h = gridLayoutManager;
        gridLayoutManager.v(new C2371a());
        this.f7354a.setLayoutManager(this.f7361h);
        this.f7354a.setOnScrollListener(new C2372b());
        this.f7354a.setAdapter(this.f7359f.m492O4());
        new k(this.f7360g.m8886r0()).g(this.f7354a);
        m9830q(true);
        m9832s(this.f7362i.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m9832s(boolean z) {
        if (NullChecker.a(this.f7358e)) {
            if (xma.L3()) {
                z = false;
            }
            xdl0.M(this.f7358e, z);
        }
    }

    public void destroy() {
    }
}
