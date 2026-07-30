package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.List;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;
import p149l.a1d0;
import p149l.d1q;
import p149l.d30;
import p149l.e30;
import p149l.f2d0;
import p149l.ffw;
import p149l.lmj;
import p149l.lsi0;
import p149l.o2d0;
import p149l.s1d0;
import p149l.u1f;
import p149l.vwb;
import p149l.x0d0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightEquipDialogContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightEquipDialogContentView f46059d;

    /* JADX INFO: renamed from: e */
    public View f46060e;

    /* JADX INFO: renamed from: f */
    public DialogTitleBar f46061f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f46062g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46063h;

    /* JADX INFO: renamed from: i */
    public VButton f46064i;

    /* JADX INFO: renamed from: j */
    public VImage f46065j;

    /* JADX INFO: renamed from: k */
    public VText f46066k;

    /* JADX INFO: renamed from: l */
    public VText f46067l;

    /* JADX INFO: renamed from: m */
    public Group f46068m;

    /* JADX INFO: renamed from: n */
    public f2d0 f46069n;

    /* JADX INFO: renamed from: o */
    public u1f f46070o;

    /* JADX INFO: renamed from: p */
    public a1d0 f46071p;

    /* JADX INFO: renamed from: q */
    public d30 f46072q;

    /* JADX INFO: renamed from: r */
    public x0d0 f46073r;

    /* JADX INFO: renamed from: s */
    public boolean f46074s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView$a */
    public class C12577a extends RecyclerView.AbstractC0582t {
        public C12577a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            RightEquipDialogContentView rightEquipDialogContentView = RightEquipDialogContentView.this;
            rightEquipDialogContentView.m70610s0(recyclerView, i, rightEquipDialogContentView.f46074s);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            RightEquipDialogContentView.this.f46074s = i2 > 0;
        }
    }

    public RightEquipDialogContentView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m70603w0(View view) {
        m70608q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m70604y0(View view) {
        this.f46069n.m119166c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m70605z0(View view) {
        this.f46069n.m119172i(this.f46071p.f67173e.rightId);
    }

    /* JADX INFO: renamed from: B0 */
    public void m70606B0(x0d0 x0d0Var) {
        if (x0d0Var == null || x0d0Var.m206606a()) {
            xdl0.m208344M(this.f46068m, true);
            xdl0.m208344M(this.f46063h, false);
            return;
        }
        xdl0.m208344M(this.f46063h, true);
        xdl0.m208344M(this.f46068m, false);
        this.f46073r = x0d0Var;
        List<d1q<?>> listM181943g = s1d0.m181943g(getContext(), x0d0Var, this.f46069n.m119167d());
        boolean zM206609d = x0d0Var.m206609d();
        u1f u1fVar = this.f46070o;
        if (!zM206609d) {
            u1fVar.m67371Z(listM181943g);
            return;
        }
        int itemCount = u1fVar.getItemCount();
        this.f46070o.m67355J().addAll(listM181943g);
        this.f46070o.notifyItemRangeInserted(itemCount, listM181943g.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70607p0(this);
        this.f46070o = new u1f();
        this.f46062g.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f46062g.setAdapter(this.f46070o);
        this.f46064i.setOnClickListener(new View.OnClickListener() { // from class: l.j2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115914a.m70603w0(view);
            }
        });
        this.f46062g.addOnScrollListener(new C12577a());
        this.f46060e.setOnClickListener(new View.OnClickListener() { // from class: l.k2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120710a.m70604y0(view);
            }
        });
        this.f46067l.setOnClickListener(new View.OnClickListener() { // from class: l.l2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125774a.m70605z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m70607p0(View view) {
        o2d0.m162292a(this, view);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70608q0() {
        BLiveRightAnchorResultList bLiveRightAnchorResultListM181945i = s1d0.m181945i(this.f46070o.m67355J());
        if (vwb.m200296J(bLiveRightAnchorResultListM181945i.userRightActions)) {
            m70609r0();
        } else {
            LiveSquareApi.bindRightToAnchor(this.f46069n.m119167d(), bLiveRightAnchorResultListM181945i).subscribe(ffw.m121194e(new e30() { // from class: l.m2d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130921a.m70613v0((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.n2d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151593w(R$string.f44912l0);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70609r0() {
        d30 d30Var = this.f46072q;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m70610s0(@NonNull RecyclerView recyclerView, int i, boolean z) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null || i != 0 || !z || recyclerView.getAdapter() == null || linearLayoutManager.findLastCompletelyVisibleItemPosition() <= recyclerView.getAdapter().getItemCount() - 5 || this.f46073r.m206608c().lastPage) {
            return;
        }
        this.f46069n.m119171h(this.f46071p.f67173e.rightId, this.f46073r.m206608c().lastId);
    }

    /* JADX INFO: renamed from: t0 */
    public void m70611t0() {
        this.f46070o.m67355J().clear();
        this.f46070o.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: u0 */
    public void m70612u0(f2d0 f2d0Var, a1d0 a1d0Var, d30 d30Var) {
        this.f46069n = f2d0Var;
        this.f46071p = a1d0Var;
        this.f46072q = d30Var;
        this.f46061f.m68714e(lmj.m150590a(a1d0Var.f67173e.rightName), false);
        this.f46061f.setDivider(true);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m70613v0(BLiveEnvelope bLiveEnvelope) {
        m70609r0();
        lsi0.m151593w(R$string.f44914m0);
    }

    public RightEquipDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipDialogContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
