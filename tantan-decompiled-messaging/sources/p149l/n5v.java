package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalCommonFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class n5v implements s7m<i5v> {

    /* JADX INFO: renamed from: a */
    public final LiveVoiceInternalCommonFrag f137236a;

    /* JADX INFO: renamed from: b */
    public i5v f137237b;

    /* JADX INFO: renamed from: c */
    public qyt f137238c;

    /* JADX INFO: renamed from: d */
    public g0u f137239d;

    /* JADX INFO: renamed from: e */
    public View f137240e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f137241f;

    /* JADX INFO: renamed from: g */
    public LiveEmptyErrorView f137242g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f137243h;

    /* JADX INFO: renamed from: l.n5v$a */
    public class C18625a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f137244a;

        /* JADX INFO: renamed from: b */
        public boolean f137245b;

        public C18625a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f137244a = 0;
                this.f137245b = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f137244a;
            if ((i3 > 0 && i2 < 0) || (i3 < 0 && i2 > 0)) {
                this.f137244a = 0;
                this.f137245b = false;
            }
            int i4 = this.f137244a + i2;
            this.f137244a = i4;
            if (this.f137245b) {
                return;
            }
            if (i4 >= t100.f167243R) {
                this.f137245b = true;
                n5v.this.f137237b.m134558Q2(true);
            } else if (i4 <= (-t100.f167227B)) {
                this.f137245b = true;
                n5v.this.f137237b.m134558Q2(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.n5v$b */
    public class C18626b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qyt f137247a;

        public C18626b(qyt qytVar) {
            this.f137247a = qytVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return this.f137247a.m67356K(i);
        }
    }

    public n5v(LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag) {
        this.f137236a = liveVoiceInternalCommonFrag;
    }

    /* JADX INFO: renamed from: j */
    private void m158004j(List<? extends d1q<?>> list, boolean z, boolean z2) {
        this.f137238c.m67368W(this.f137239d);
        g0u g0uVar = new g0u(6, z, (z2 || list.size() == 0) ? false : true);
        this.f137239d = g0uVar;
        g0uVar.m124005I(this.f137236a.getResources().getColor(g1c0.f100171z));
        this.f137239d.m124006J(w8u.m202217t(R$string.f44921q));
        this.f137238c.m67351E(this.f137239d);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m158005e(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.f137238c == null) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.m5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131424a.m158008k((tvr) obj);
            }
        });
        m158004j(this.f137238c.m67355J(), z, z2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i5v i5vVar) {
        this.f137237b = i5vVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public qyt m158007i() {
        final qyt qytVarM177065J0 = qyt.m177065J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.f137243h = gridLayoutManager;
        gridLayoutManager.m3326v(new C18626b(qytVarM177065J0));
        this.f137241f.setLayoutManager(this.f137243h);
        this.f137241f.setAdapter(qytVarM177065J0);
        this.f137241f.setItemAnimator(null);
        final LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag = this.f137236a;
        Objects.requireNonNull(liveVoiceInternalCommonFrag);
        qytVarM177065J0.m191781o0(liveVoiceInternalCommonFrag, new v9j() { // from class: l.k5v
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveVoiceInternalCommonFrag.m70821Q4());
            }
        }, LiveTeenDialogAct.f46216g);
        qytVarM177065J0.m67369X(false);
        qytVarM177065J0.m67375c0(new e30() { // from class: l.l5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126205a.m158009l(qytVarM177065J0, (Integer) obj);
            }
        });
        return qytVarM177065J0;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162746e2, viewGroup, false);
        this.f137240e = viewInflate;
        this.f137241f = (VRecyclerView) viewInflate.findViewById(f5c0.f95110k1);
        this.f137242g = (LiveEmptyErrorView) this.f137240e.findViewById(f5c0.f95085e0);
        return this.f137240e;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m158008k(tvr tvrVar) {
        qyt qytVar = this.f137238c;
        qytVar.m67359N(qytVar.m67355J().size(), tvrVar);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m158009l(qyt qytVar, Integer num) {
        if (num.intValue() >= qytVar.getItemCount() - 2) {
            this.f137237b.m134557P2();
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m158010m() {
        qyt qytVar = this.f137238c;
        return qytVar == null || qytVar.m67355J().size() == 0;
    }

    /* JADX INFO: renamed from: p */
    public void m158012p(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.f137238c == null) {
            this.f137238c = m158007i();
        }
        if (list.size() != 0 || this.f137238c.getItemCount() <= 1) {
            this.f137238c.m67371Z(list);
            this.f137242g.m69874a(list.size());
            m158004j(list, z, z2);
            this.f137238c.m191777k0();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m158013q() {
        qyt qytVar = this.f137238c;
        if (qytVar != null) {
            qytVar.m67371Z(new ArrayList());
        }
        this.f137242g.m69875b();
    }

    /* JADX INFO: renamed from: r */
    public void m158014r() {
        this.f137242g.setEmptyText(w8u.m202217t(R$string.f44864C0));
        this.f137241f.addOnScrollListener(new C18625a());
    }

    /* JADX INFO: renamed from: s */
    public void m158015s(wws wwsVar) {
        try {
            vws vwsVar = (vws) vwb.m200346r(this.f137238c.m67355J(), new w9j() { // from class: l.j5v
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((d1q) obj) instanceof vws);
                }
            });
            if (!NullChecker.m81303a(vwsVar) || wwsVar.m205882h() <= vwsVar.m200439P()) {
                return;
            }
            vwsVar.m200441R(wwsVar);
            this.f137238c.m67360O(vwsVar);
        } catch (Exception unused) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n */
    public void m158011n(boolean z, int i, long j) {
    }
}
