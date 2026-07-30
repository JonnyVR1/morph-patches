package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class egr implements s7m<bgr> {

    /* JADX INFO: renamed from: a */
    public VPullUpRecyclerView f90969a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f90970b;

    /* JADX INFO: renamed from: c */
    public TextView f90971c;

    /* JADX INFO: renamed from: d */
    public PlatformQualificationView f90972d;

    /* JADX INFO: renamed from: e */
    public Button f90973e;

    /* JADX INFO: renamed from: f */
    public LikedUsersMyTabFrag f90974f;

    /* JADX INFO: renamed from: g */
    public bgr f90975g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f90976h;

    /* JADX INFO: renamed from: i */
    public Boolean f90977i = Boolean.FALSE;

    /* JADX INFO: renamed from: j */
    public boolean f90978j = false;

    /* JADX INFO: renamed from: k */
    public boolean f90979k = false;

    /* JADX INFO: renamed from: l.egr$a */
    public class C16595a extends GridLayoutManager.AbstractC0553c {
        public C16595a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (egr.this.f90974f.m46817O4().getItemViewType(i) == 2) {
                return egr.this.f90976h.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.egr$b */
    public class C16596b extends RecyclerView.AbstractC0582t {
        public C16596b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m116315b() {
            egr.this.f90979k = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (xma.m210071e4() && bzc0.m104565e()) {
                if (!egr.this.f90978j && recyclerView.computeVerticalScrollOffset() > t100.m186890d(600.0f)) {
                    egr.this.f90978j = true;
                    egr.this.f90979k = true;
                    egr.this.f90975g.m101705N0("p_navigation,ilike_module", new d30() { // from class: l.fgr
                        @Override // p149l.d30
                        public final void call() {
                            this.f97396a.m116315b();
                        }
                    });
                } else if (sjc0.m184481a(recyclerView) && sjc0.m184482b(recyclerView) && !egr.this.f90979k) {
                    egr.this.f90975g.m101704L0("p_navigation,ilike_module");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.egr$c */
    public class C16597c implements nfr.InterfaceC18690b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LikedUser f90982a;

        public C16597c(LikedUser likedUser) {
            this.f90982a = likedUser;
        }

        @Override // p149l.nfr.InterfaceC18690b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo116316a() {
            return this.f90982a;
        }

        @Override // p149l.nfr.InterfaceC18690b
        public int getItemType() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.egr$d */
    public class C16598d implements nfr.InterfaceC18690b {
        public C16598d() {
        }

        @Override // p149l.nfr.InterfaceC18690b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo116316a() {
            return null;
        }

        @Override // p149l.nfr.InterfaceC18690b
        public int getItemType() {
            return 2;
        }
    }

    public egr(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        this.f90974f = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m116304k(View view) {
        this.f90975g.m101704L0("p_navigation,ilike_module");
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90974f.act();
    }

    /* JADX INFO: renamed from: i */
    public View m116305i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ggr.m125999b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM116305i = m116305i(layoutInflater, viewGroup);
        viewM116305i.setBackgroundColor(-1);
        return viewM116305i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bgr bgrVar) {
        this.f90975g = bgrVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C16597c m116307l(LikedUser likedUser) {
        return new C16597c(likedUser);
    }

    /* JADX INFO: renamed from: m */
    public void m116308m(boolean z) {
        m116313s(this.f90977i.booleanValue());
        this.f90974f.m46817O4().m159274R(z);
    }

    /* JADX INFO: renamed from: n */
    public void m116309n() {
        this.f90973e.setOnClickListener(new View.OnClickListener() { // from class: l.cgr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80790a.m116304k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m116310p(ArrayList<LikedUser> arrayList, boolean z) {
        if (vwb.m200296J(arrayList)) {
            m116311q(true);
            return;
        }
        m116311q(false);
        ArrayList<nfr.InterfaceC18690b> arrayList2 = new ArrayList<>();
        arrayList2.addAll(vwb.m200303Q(arrayList, new w9j() { // from class: l.dgr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86161a.m116307l((LikedUser) obj);
            }
        }));
        arrayList2.add(new C16598d());
        this.f90974f.m46817O4().m159276T(arrayList2, z);
    }

    /* JADX INFO: renamed from: q */
    public void m116311q(boolean z) {
        xdl0.m208344M(this.f90970b, z);
        xdl0.m208344M(this.f90969a, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m116312r() {
        this.f90971c.setText("去滑卡发现更多喜欢的人");
        xdl0.m208344M(this.f90972d, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f90974f.act(), 2);
        this.f90976h = gridLayoutManager;
        gridLayoutManager.m3326v(new C16595a());
        this.f90969a.setLayoutManager(this.f90976h);
        this.f90969a.setOnScrollListener(new C16596b());
        this.f90969a.setAdapter(this.f90974f.m46817O4());
        new C0605k(this.f90975g.m101706r0()).m3750g(this.f90969a);
        m116311q(true);
        m116313s(this.f90977i.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m116313s(boolean z) {
        if (NullChecker.m81303a(this.f90973e)) {
            if (xma.m210047L3()) {
                z = false;
            }
            xdl0.m208344M(this.f90973e, z);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
