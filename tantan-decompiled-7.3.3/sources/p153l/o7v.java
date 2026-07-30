package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalCommonFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class o7v implements iam<j7v> {

    /* JADX INFO: renamed from: a */
    public final LiveVoiceInternalCommonFrag f145300a;

    /* JADX INFO: renamed from: b */
    public j7v f145301b;

    /* JADX INFO: renamed from: c */
    public r0u f145302c;

    /* JADX INFO: renamed from: d */
    public h2u f145303d;

    /* JADX INFO: renamed from: e */
    public View f145304e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f145305f;

    /* JADX INFO: renamed from: g */
    public LiveEmptyErrorView f145306g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f145307h;

    /* JADX INFO: renamed from: l.o7v$a */
    public class C19046a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f145308a;

        /* JADX INFO: renamed from: b */
        public boolean f145309b;

        public C19046a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f145308a = 0;
                this.f145309b = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f145308a;
            if ((i3 > 0 && i2 < 0) || (i3 < 0 && i2 > 0)) {
                this.f145308a = 0;
                this.f145309b = false;
            }
            int i4 = this.f145308a + i2;
            this.f145308a = i4;
            if (this.f145309b) {
                return;
            }
            if (i4 >= qa00.f156305R) {
                this.f145309b = true;
                o7v.this.f145301b.m143812Q2(true);
            } else if (i4 <= (-qa00.f156289B)) {
                this.f145309b = true;
                o7v.this.f145301b.m143812Q2(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.o7v$b */
    public class C19047b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r0u f145311a;

        public C19047b(r0u r0uVar) {
            this.f145311a = r0uVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return this.f145311a.m68539K(i);
        }
    }

    public o7v(LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag) {
        this.f145300a = liveVoiceInternalCommonFrag;
    }

    /* JADX INFO: renamed from: j */
    private void m166373j(List<? extends d3q<?>> list, boolean z, boolean z2) {
        this.f145302c.m68551W(this.f145303d);
        h2u h2uVar = new h2u(6, z, (z2 || list.size() == 0) ? false : true);
        this.f145303d = h2uVar;
        h2uVar.m133403I(this.f145300a.getResources().getColor(m9c0.f135401z));
        this.f145303d.m133404J(xau.m209910t(R$string.f45769q));
        this.f145302c.m68534E(this.f145303d);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m166374e(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.f145302c == null) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.n7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140633a.m166377k((uxr) obj);
            }
        });
        m166373j(this.f145302c.m68538J(), z, z2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(j7v j7vVar) {
        this.f145301b = j7vVar;
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
    public r0u m166376i() {
        final r0u r0uVarM179247J0 = r0u.m179247J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.f145307h = gridLayoutManager;
        gridLayoutManager.m3327v(new C19047b(r0uVarM179247J0));
        this.f145305f.setLayoutManager(this.f145307h);
        this.f145305f.setAdapter(r0uVarM179247J0);
        this.f145305f.setItemAnimator(null);
        final LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag = this.f145300a;
        Objects.requireNonNull(liveVoiceInternalCommonFrag);
        r0uVarM179247J0.m200149o0(liveVoiceInternalCommonFrag, new pcj() { // from class: l.l7v
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveVoiceInternalCommonFrag.m72004Q4());
            }
        }, LiveTeenDialogAct.f47064g);
        r0uVarM179247J0.m68552X(false);
        r0uVarM179247J0.m68558c0(new y20() { // from class: l.m7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135109a.m166378l(r0uVarM179247J0, (Integer) obj);
            }
        });
        return r0uVarM179247J0;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193860e2, viewGroup, false);
        this.f145304e = viewInflate;
        this.f145305f = (VRecyclerView) viewInflate.findViewById(ldc0.f131567k1);
        this.f145306g = (LiveEmptyErrorView) this.f145304e.findViewById(ldc0.f131542e0);
        return this.f145304e;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m166377k(uxr uxrVar) {
        r0u r0uVar = this.f145302c;
        r0uVar.m68542N(r0uVar.m68538J().size(), uxrVar);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m166378l(r0u r0uVar, Integer num) {
        if (num.intValue() >= r0uVar.getItemCount() - 2) {
            this.f145301b.m143811P2();
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m166379m() {
        r0u r0uVar = this.f145302c;
        return r0uVar == null || r0uVar.m68538J().size() == 0;
    }

    /* JADX INFO: renamed from: p */
    public void m166381p(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.f145302c == null) {
            this.f145302c = m166376i();
        }
        if (list.size() != 0 || this.f145302c.getItemCount() <= 1) {
            this.f145302c.m68554Z(list);
            this.f145306g.m71057a(list.size());
            m166373j(list, z, z2);
            this.f145302c.m200145k0();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m166382q() {
        r0u r0uVar = this.f145302c;
        if (r0uVar != null) {
            r0uVar.m68554Z(new ArrayList());
        }
        this.f145306g.m71058b();
    }

    /* JADX INFO: renamed from: r */
    public void m166383r() {
        this.f145306g.setEmptyText(xau.m209910t(R$string.f45712C0));
        this.f145305f.addOnScrollListener(new C19046a());
    }

    /* JADX INFO: renamed from: s */
    public void m166384s(xys xysVar) {
        try {
            wys wysVar = (wys) jyb.m147529r(this.f145302c.m68538J(), new qcj() { // from class: l.k7v
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((d3q) obj) instanceof wys);
                }
            });
            if (!NullChecker.m82486a(wysVar) || xysVar.m213645h() <= wysVar.m208625P()) {
                return;
            }
            wysVar.m208627R(xysVar);
            this.f145302c.m68543O(wysVar);
        } catch (Exception unused) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: n */
    public void m166380n(boolean z, int i, long j) {
    }
}
