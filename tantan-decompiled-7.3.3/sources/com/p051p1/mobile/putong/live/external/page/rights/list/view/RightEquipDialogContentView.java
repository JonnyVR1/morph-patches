package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.List;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p153l.a9d0;
import p153l.bnl0;
import p153l.bpj;
import p153l.d3q;
import p153l.d9d0;
import p153l.dhw;
import p153l.iad0;
import p153l.jyb;
import p153l.o1j0;
import p153l.rad0;
import p153l.v9d0;
import p153l.x20;
import p153l.y20;
import p153l.z2f;

/* JADX INFO: loaded from: classes9.dex */
public class RightEquipDialogContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightEquipDialogContentView f46907d;

    /* JADX INFO: renamed from: e */
    public View f46908e;

    /* JADX INFO: renamed from: f */
    public DialogTitleBar f46909f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f46910g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46911h;

    /* JADX INFO: renamed from: i */
    public VButton f46912i;

    /* JADX INFO: renamed from: j */
    public VImage f46913j;

    /* JADX INFO: renamed from: k */
    public VText f46914k;

    /* JADX INFO: renamed from: l */
    public VText f46915l;

    /* JADX INFO: renamed from: m */
    public Group f46916m;

    /* JADX INFO: renamed from: n */
    public iad0 f46917n;

    /* JADX INFO: renamed from: o */
    public z2f f46918o;

    /* JADX INFO: renamed from: p */
    public d9d0 f46919p;

    /* JADX INFO: renamed from: q */
    public x20 f46920q;

    /* JADX INFO: renamed from: r */
    public a9d0 f46921r;

    /* JADX INFO: renamed from: s */
    public boolean f46922s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView$a */
    public class C12740a extends RecyclerView.AbstractC0584t {
        public C12740a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            RightEquipDialogContentView rightEquipDialogContentView = RightEquipDialogContentView.this;
            rightEquipDialogContentView.m71793s0(recyclerView, i, rightEquipDialogContentView.f46922s);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            RightEquipDialogContentView.this.f46922s = i2 > 0;
        }
    }

    public RightEquipDialogContentView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m71786w0(View view) {
        m71791q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m71787y0(View view) {
        this.f46917n.m139184c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m71788z0(View view) {
        this.f46917n.m139190i(this.f46919p.f85760e.rightId);
    }

    /* JADX INFO: renamed from: B0 */
    public void m71789B0(a9d0 a9d0Var) {
        if (a9d0Var == null || a9d0Var.m96555a()) {
            bnl0.m105524M(this.f46916m, true);
            bnl0.m105524M(this.f46911h, false);
            return;
        }
        bnl0.m105524M(this.f46911h, true);
        bnl0.m105524M(this.f46916m, false);
        this.f46921r = a9d0Var;
        List<d3q<?>> listM200423g = v9d0.m200423g(getContext(), a9d0Var, this.f46917n.m139185d());
        boolean zM96558d = a9d0Var.m96558d();
        z2f z2fVar = this.f46918o;
        if (!zM96558d) {
            z2fVar.m68554Z(listM200423g);
            return;
        }
        int itemCount = z2fVar.getItemCount();
        this.f46918o.m68538J().addAll(listM200423g);
        this.f46918o.notifyItemRangeInserted(itemCount, listM200423g.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71790p0(this);
        this.f46918o = new z2f();
        this.f46910g.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f46910g.setAdapter(this.f46918o);
        this.f46912i.setOnClickListener(new View.OnClickListener() { // from class: l.mad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135508a.m71786w0(view);
            }
        });
        this.f46910g.addOnScrollListener(new C12740a());
        this.f46908e.setOnClickListener(new View.OnClickListener() { // from class: l.nad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141002a.m71787y0(view);
            }
        });
        this.f46915l.setOnClickListener(new View.OnClickListener() { // from class: l.oad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145689a.m71788z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m71790p0(View view) {
        rad0.m180715a(this, view);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m71791q0() {
        BLiveRightAnchorResultList bLiveRightAnchorResultListM200425i = v9d0.m200425i(this.f46918o.m68538J());
        if (jyb.m147479J(bLiveRightAnchorResultListM200425i.userRightActions)) {
            m71792r0();
        } else {
            LiveSquareApi.bindRightToAnchor(this.f46917n.m139185d(), bLiveRightAnchorResultListM200425i).subscribe(dhw.m115826e(new y20() { // from class: l.pad0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151256a.m71796v0((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.qad0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165649w(R$string.f45760l0);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m71792r0() {
        x20 x20Var = this.f46920q;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m71793s0(@NonNull RecyclerView recyclerView, int i, boolean z) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null || i != 0 || !z || recyclerView.getAdapter() == null || linearLayoutManager.findLastCompletelyVisibleItemPosition() <= recyclerView.getAdapter().getItemCount() - 5 || this.f46921r.m96557c().lastPage) {
            return;
        }
        this.f46917n.m139189h(this.f46919p.f85760e.rightId, this.f46921r.m96557c().lastId);
    }

    /* JADX INFO: renamed from: t0 */
    public void m71794t0() {
        this.f46918o.m68538J().clear();
        this.f46918o.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: u0 */
    public void m71795u0(iad0 iad0Var, d9d0 d9d0Var, x20 x20Var) {
        this.f46917n = iad0Var;
        this.f46919p = d9d0Var;
        this.f46920q = x20Var;
        this.f46909f.m69897e(bpj.m105844a(d9d0Var.f85760e.rightName), false);
        this.f46909f.setDivider(true);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m71796v0(BLiveEnvelope bLiveEnvelope) {
        m71792r0();
        o1j0.m165649w(R$string.f45762m0);
    }

    public RightEquipDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipDialogContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
