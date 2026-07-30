package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hmt implements iam<ylt> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f110664a;

    /* JADX INFO: renamed from: b */
    public final VText f110665b;

    /* JADX INFO: renamed from: c */
    public final View f110666c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f110667d;

    /* JADX INFO: renamed from: e */
    public nlt f110668e;

    /* JADX INFO: renamed from: f */
    public ylt f110669f;

    /* JADX INFO: renamed from: g */
    public boolean f110670g = false;

    /* JADX INFO: renamed from: h */
    public Animator f110671h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f110672i;

    public hmt(LinearLayout linearLayout, final VRecyclerView vRecyclerView, final VText vText, View view) {
        this.f110667d = linearLayout;
        this.f110664a = vRecyclerView;
        this.f110665b = vText;
        this.f110666c = view;
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.zlt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f205003a.m135995p(vRecyclerView, vText, view2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    private void m135989k() {
        gnt.m130983c();
        this.f110669f.act().dialog().m21499D(R$string.f45009e).m21541l0(R$string.f44997a, new Runnable() { // from class: l.amt
            @Override // java.lang.Runnable
            public final void run() {
                gnt.m130982b();
            }
        }).m21555t0(R$string.f45000b, new Runnable() { // from class: l.bmt
            @Override // java.lang.Runnable
            public final void run() {
                this.f77404a.m135994n();
            }
        }).m21567z0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f110664a.getContext();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f110669f.act();
    }

    @Override // p153l.iam
    public void destroy() {
        AnimatorSet animatorSet = this.f110672i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator animator = this.f110671h;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ylt yltVar) {
        this.f110669f = yltVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m135991j(final List<olt> list) {
        LinearLayout linearLayout = this.f110667d;
        Animator animatorM132169o = gt0.m132169o(linearLayout, it0.f116780m, linearLayout.getHeight(), 0);
        Animator animatorM132171q = gt0.m132171q(this.f110667d, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f110672i = animatorSet;
        animatorSet.play(animatorM132169o).with(animatorM132171q);
        this.f110672i.setDuration(250L);
        Runnable runnable = new Runnable() { // from class: l.gmt
            @Override // java.lang.Runnable
            public final void run() {
                this.f105032a.m135993m(list);
            }
        };
        gt0.m132161g(this.f110672i, runnable, runnable);
        this.f110672i.start();
    }

    /* JADX INFO: renamed from: l */
    public void m135992l(List<olt> list) {
        this.f110670g = false;
        m135997s(list);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m135993m(List list) {
        m135997s(list);
        bnl0.m105505C0(this.f110667d, -2);
        this.f110667d.setAlpha(1.0f);
        this.f110664a.requestLayout();
        this.f110672i = null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m135994n() {
        this.f110669f.m216629Q2();
        gnt.m130984d();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m135995p(VRecyclerView vRecyclerView, VText vText, View view) {
        getAct().hideInput();
        if (this.f110670g) {
            m135989k();
        } else {
            m136001x(vRecyclerView, vText);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m135996q(olt oltVar) {
        if (this.f110664a.getItemAnimator().isRunning()) {
            return;
        }
        this.f110669f.m216631U2(oltVar);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m135998u(VRecyclerView vRecyclerView, VText vText) {
        bnl0.m105505C0(vRecyclerView, -2);
        this.f110671h = null;
        vText.setText(R$string.f45006d);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m135997s(List<olt> list) {
        m136000w(list, -1);
    }

    /* JADX INFO: renamed from: w */
    public void m136000w(final List<olt> list, int i) {
        List<olt> arrayList;
        boolean zIsEmpty = list.isEmpty();
        bnl0.m105524M(this.f110664a, !zIsEmpty);
        bnl0.m105524M(this.f110666c, !zIsEmpty);
        bnl0.m105524M(this.f110664a, true);
        boolean z = list.size() > 2;
        bnl0.m105524M(this.f110665b, z);
        if (bnl0.m105529O0(this.f110666c)) {
            bnl0.m105540X(this.f110666c, z ? qa00.f156316c : qa00.f156326m);
        }
        this.f110665b.setText(this.f110670g ? R$string.f45006d : R$string.f45003c);
        if (this.f110670g || !z) {
            arrayList = list;
        } else {
            arrayList = new ArrayList<>();
            arrayList.add(list.get(0));
            arrayList.add(list.get(1));
        }
        if (this.f110668e == null) {
            final ylt yltVar = this.f110669f;
            Objects.requireNonNull(yltVar);
            nlt nltVar = new nlt(arrayList, new y20() { // from class: l.cmt
                @Override // p153l.y20
                public final void call(Object obj) {
                    yltVar.m216630T2((olt) obj);
                }
            }, this.f110669f.m150394E2().f115832b);
            this.f110668e = nltVar;
            nltVar.m163778K(new y20() { // from class: l.dmt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f89727a.m135996q((olt) obj);
                }
            });
            this.f110664a.setAdapter(this.f110668e);
            return;
        }
        if (!this.f110670g || i < 0 || i >= this.f110664a.getLayoutManager().getChildCount()) {
            this.f110668e.m163779L(arrayList);
        } else {
            ((LiveSearchHistoryItemView) this.f110664a.getLayoutManager().getChildAt(i)).m72017d(new x20() { // from class: l.emt
                @Override // p153l.x20
                public final void call() {
                    this.f94691a.m135997s(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m136001x(final VRecyclerView vRecyclerView, final VText vText) {
        this.f110670g = true;
        List<olt> list = this.f110669f.f200582g;
        m135997s(list);
        int height = vRecyclerView.getHeight();
        ViewGroup.LayoutParams layoutParams = vRecyclerView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = height;
        vRecyclerView.setLayoutParams(layoutParams);
        Animator animatorM132169o = gt0.m132169o(vRecyclerView, it0.f116780m, height, (height / 2) * list.size());
        this.f110671h = animatorM132169o;
        animatorM132169o.setDuration((list.size() - 2) * 30);
        gt0.m132160f(this.f110671h, new Runnable() { // from class: l.fmt
            @Override // java.lang.Runnable
            public final void run() {
                this.f99834a.m135998u(vRecyclerView, vText);
            }
        });
        this.f110671h.start();
    }
}
