package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class fir implements iam<cir> {

    /* JADX INFO: renamed from: a */
    public VPullUpRecyclerView f99214a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f99215b;

    /* JADX INFO: renamed from: c */
    public TextView f99216c;

    /* JADX INFO: renamed from: d */
    public PlatformQualificationView f99217d;

    /* JADX INFO: renamed from: e */
    public Button f99218e;

    /* JADX INFO: renamed from: f */
    public LikedUsersMyTabFrag f99219f;

    /* JADX INFO: renamed from: g */
    public cir f99220g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f99221h;

    /* JADX INFO: renamed from: i */
    public Boolean f99222i = Boolean.FALSE;

    /* JADX INFO: renamed from: j */
    public boolean f99223j = false;

    /* JADX INFO: renamed from: k */
    public boolean f99224k = false;

    /* JADX INFO: renamed from: l.fir$a */
    public class C16980a extends GridLayoutManager.AbstractC0554c {
        public C16980a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (fir.this.f99219f.m48000O4().getItemViewType(i) == 2) {
                return fir.this.f99221h.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.fir$b */
    public class C16981b extends RecyclerView.AbstractC0584t {
        public C16981b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m125710b() {
            fir.this.f99224k = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (joa.m146386f4() && e7d0.m119696e()) {
                if (!fir.this.f99223j && recyclerView.computeVerticalScrollOffset() > qa00.m175859d(600.0f)) {
                    fir.this.f99223j = true;
                    fir.this.f99224k = true;
                    fir.this.f99220g.m109935N0("p_navigation,ilike_module", new x20() { // from class: l.gir
                        @Override // p153l.x20
                        public final void call() {
                            this.f104519a.m125710b();
                        }
                    });
                } else if (zrc0.m221154a(recyclerView) && zrc0.m221155b(recyclerView) && !fir.this.f99224k) {
                    fir.this.f99220g.m109934L0("p_navigation,ilike_module");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fir$c */
    public class C16982c implements ohr.InterfaceC19139b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LikedUser f99227a;

        public C16982c(LikedUser likedUser) {
            this.f99227a = likedUser;
        }

        @Override // p153l.ohr.InterfaceC19139b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo125711a() {
            return this.f99227a;
        }

        @Override // p153l.ohr.InterfaceC19139b
        public int getItemType() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.fir$d */
    public class C16983d implements ohr.InterfaceC19139b {
        public C16983d() {
        }

        @Override // p153l.ohr.InterfaceC19139b
        @Nullable
        /* JADX INFO: renamed from: a */
        public LikedUser mo125711a() {
            return null;
        }

        @Override // p153l.ohr.InterfaceC19139b
        public int getItemType() {
            return 2;
        }
    }

    public fir(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        this.f99219f = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m125699k(View view) {
        this.f99220g.m109934L0("p_navigation,ilike_module");
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f99219f.act();
    }

    /* JADX INFO: renamed from: i */
    public View m125700i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hir.m135132b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM125700i = m125700i(layoutInflater, viewGroup);
        viewM125700i.setBackgroundColor(-1);
        return viewM125700i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cir cirVar) {
        this.f99220g = cirVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C16982c m125702l(LikedUser likedUser) {
        return new C16982c(likedUser);
    }

    /* JADX INFO: renamed from: m */
    public void m125703m(boolean z) {
        m125708s(this.f99222i.booleanValue());
        this.f99219f.m48000O4().m167735R(z);
    }

    /* JADX INFO: renamed from: n */
    public void m125704n() {
        this.f99218e.setOnClickListener(new View.OnClickListener() { // from class: l.dir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88702a.m125699k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m125705p(ArrayList<LikedUser> arrayList, boolean z) {
        if (jyb.m147479J(arrayList)) {
            m125706q(true);
            return;
        }
        m125706q(false);
        ArrayList<ohr.InterfaceC19139b> arrayList2 = new ArrayList<>();
        arrayList2.addAll(jyb.m147486Q(arrayList, new qcj() { // from class: l.eir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94190a.m125702l((LikedUser) obj);
            }
        }));
        arrayList2.add(new C16983d());
        this.f99219f.m48000O4().m167737T(arrayList2, z);
    }

    /* JADX INFO: renamed from: q */
    public void m125706q(boolean z) {
        bnl0.m105524M(this.f99215b, z);
        bnl0.m105524M(this.f99214a, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m125707r() {
        this.f99216c.setText("去滑卡发现更多喜欢的人");
        bnl0.m105524M(this.f99217d, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f99219f.act(), 2);
        this.f99221h = gridLayoutManager;
        gridLayoutManager.m3327v(new C16980a());
        this.f99214a.setLayoutManager(this.f99221h);
        this.f99214a.setOnScrollListener(new C16981b());
        this.f99214a.setAdapter(this.f99219f.m48000O4());
        new C0607k(this.f99220g.m109936r0()).m3751g(this.f99214a);
        m125706q(true);
        m125708s(this.f99222i.booleanValue());
    }

    /* JADX INFO: renamed from: s */
    public void m125708s(boolean z) {
        if (NullChecker.m82486a(this.f99218e)) {
            if (joa.m146361M3()) {
                z = false;
            }
            bnl0.m105524M(this.f99218e, z);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
