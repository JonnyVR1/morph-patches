package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gkt implements s7m<xjt> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f103227a;

    /* JADX INFO: renamed from: b */
    public final VText f103228b;

    /* JADX INFO: renamed from: c */
    public final View f103229c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f103230d;

    /* JADX INFO: renamed from: e */
    public mjt f103231e;

    /* JADX INFO: renamed from: f */
    public xjt f103232f;

    /* JADX INFO: renamed from: g */
    public boolean f103233g = false;

    /* JADX INFO: renamed from: h */
    public Animator f103234h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f103235i;

    public gkt(LinearLayout linearLayout, final VRecyclerView vRecyclerView, final VText vText, View view) {
        this.f103230d = linearLayout;
        this.f103227a = vRecyclerView;
        this.f103228b = vText;
        this.f103229c = view;
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.yjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f198686a.m126712p(vRecyclerView, vText, view2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    private void m126706k() {
        flt.m122092c();
        this.f103232f.act().dialog().m20500D(R$string.f44161e).m20542l0(R$string.f44149a, new Runnable() { // from class: l.zjt
            @Override // java.lang.Runnable
            public final void run() {
                flt.m122091b();
            }
        }).m20556t0(R$string.f44152b, new Runnable() { // from class: l.akt
            @Override // java.lang.Runnable
            public final void run() {
                this.f70318a.m126711n();
            }
        }).m20568z0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f103227a.getContext();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f103232f.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        AnimatorSet animatorSet = this.f103235i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator animator = this.f103234h;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xjt xjtVar) {
        this.f103232f = xjtVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m126708j(final List<njt> list) {
        LinearLayout linearLayout = this.f103230d;
        Animator animatorM103742o = bt0.m103742o(linearLayout, dt0.f87801m, linearLayout.getHeight(), 0);
        Animator animatorM103744q = bt0.m103744q(this.f103230d, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f103235i = animatorSet;
        animatorSet.play(animatorM103742o).with(animatorM103744q);
        this.f103235i.setDuration(250L);
        Runnable runnable = new Runnable() { // from class: l.fkt
            @Override // java.lang.Runnable
            public final void run() {
                this.f98095a.m126710m(list);
            }
        };
        bt0.m103734g(this.f103235i, runnable, runnable);
        this.f103235i.start();
    }

    /* JADX INFO: renamed from: l */
    public void m126709l(List<njt> list) {
        this.f103233g = false;
        m126714s(list);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m126710m(List list) {
        m126714s(list);
        xdl0.m208325C0(this.f103230d, -2);
        this.f103230d.setAlpha(1.0f);
        this.f103227a.requestLayout();
        this.f103235i = null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m126711n() {
        this.f103232f.m209750Q2();
        flt.m122093d();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m126712p(VRecyclerView vRecyclerView, VText vText, View view) {
        getAct().hideInput();
        if (this.f103233g) {
            m126706k();
        } else {
            m126718x(vRecyclerView, vText);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m126713q(njt njtVar) {
        if (this.f103227a.getItemAnimator().isRunning()) {
            return;
        }
        this.f103232f.m209752U2(njtVar);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m126715u(VRecyclerView vRecyclerView, VText vText) {
        xdl0.m208325C0(vRecyclerView, -2);
        this.f103234h = null;
        vText.setText(R$string.f44158d);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m126714s(List<njt> list) {
        m126717w(list, -1);
    }

    /* JADX INFO: renamed from: w */
    public void m126717w(final List<njt> list, int i) {
        List<njt> arrayList;
        boolean zIsEmpty = list.isEmpty();
        xdl0.m208344M(this.f103227a, !zIsEmpty);
        xdl0.m208344M(this.f103229c, !zIsEmpty);
        xdl0.m208344M(this.f103227a, true);
        boolean z = list.size() > 2;
        xdl0.m208344M(this.f103228b, z);
        if (xdl0.m208349O0(this.f103229c)) {
            xdl0.m208360X(this.f103229c, z ? t100.f167254c : t100.f167264m);
        }
        this.f103228b.setText(this.f103233g ? R$string.f44158d : R$string.f44155c);
        if (this.f103233g || !z) {
            arrayList = list;
        } else {
            arrayList = new ArrayList<>();
            arrayList.add(list.get(0));
            arrayList.add(list.get(1));
        }
        if (this.f103231e == null) {
            final xjt xjtVar = this.f103232f;
            Objects.requireNonNull(xjtVar);
            mjt mjtVar = new mjt(arrayList, new e30() { // from class: l.bkt
                @Override // p149l.e30
                public final void call(Object obj) {
                    xjtVar.m209751T2((njt) obj);
                }
            }, this.f103232f.m141815E2().f108267b);
            this.f103231e = mjtVar;
            mjtVar.m154915K(new e30() { // from class: l.ckt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81350a.m126713q((njt) obj);
                }
            });
            this.f103227a.setAdapter(this.f103231e);
            return;
        }
        if (!this.f103233g || i < 0 || i >= this.f103227a.getLayoutManager().getChildCount()) {
            this.f103231e.m154916L(arrayList);
        } else {
            ((LiveSearchHistoryItemView) this.f103227a.getLayoutManager().getChildAt(i)).m70834d(new d30() { // from class: l.dkt
                @Override // p149l.d30
                public final void call() {
                    this.f86705a.m126714s(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m126718x(final VRecyclerView vRecyclerView, final VText vText) {
        this.f103233g = true;
        List<njt> list = this.f103232f.f193243g;
        m126714s(list);
        int height = vRecyclerView.getHeight();
        ViewGroup.LayoutParams layoutParams = vRecyclerView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = height;
        vRecyclerView.setLayoutParams(layoutParams);
        Animator animatorM103742o = bt0.m103742o(vRecyclerView, dt0.f87801m, height, (height / 2) * list.size());
        this.f103234h = animatorM103742o;
        animatorM103742o.setDuration((list.size() - 2) * 30);
        bt0.m103733f(this.f103234h, new Runnable() { // from class: l.ekt
            @Override // java.lang.Runnable
            public final void run() {
                this.f92010a.m126715u(vRecyclerView, vText);
            }
        });
        this.f103234h.start();
    }
}
