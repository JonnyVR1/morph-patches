package p006l;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.internal.TextScale;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a9j0;
import l.cr4;
import l.d30;
import l.e30;
import l.p2b0;
import l.svq;
import l.u7j0;
import l.v8j0;
import l.v9j;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.v5 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 Z2\u00020\u0001:\u0001>B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b1\u0010\u0015J-\u00102\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u00103J'\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u0010\r\u001a\u0002062\u0006\u00107\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020:2\u0006\u00107\u001a\u0002042\u0006\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006["}, d2 = {"Ll/v5;", "Ll/d1m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/widget/LinearLayout;", "_view", "", "r", "(Landroid/widget/LinearLayout;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "u", "(Ljava/util/List;)V", "selectSection", "v", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "j", "section", "Landroid/view/ViewGroup;", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "", "index", "y", "(I)V", "", "p", "()F", "s", "()V", "Ll/d30;", "callback", "i", "(Ll/d30;)V", "size", "onComplete", "t", "(ILl/d30;)V", "x", "w", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "init", "Landroid/view/View;", "select", "z", "(ZLandroid/view/View;Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", "duration", "l", "(Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;ZI)V", "a", "Lcom/p1/mobile/android/app/Act;", "m", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "d", "Ll/j5b0;", "o", "()Ll/j5b0;", "e", "Landroid/widget/LinearLayout;", "_sections_root", "Ll/a9j0;", "f", "Ll/a9j0;", "transitionSet", "g", "F", "normalWidth", "h", "selectWidth", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractC1372v5 implements d1m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final j5b0 mediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LinearLayout _sections_root;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public a9j0 transitionSet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float normalWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float selectWidth;

    public AbstractC1372v5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m25732c(boolean z, int i, View view) {
        view.getClass();
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            if (!z) {
                ((TransitionDrawable) background).resetTransition();
                return;
            }
            TransitionDrawable transitionDrawable = (TransitionDrawable) background;
            transitionDrawable.resetTransition();
            transitionDrawable.startTransition(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m25733d(AbstractC1372v5 abstractC1372v5, d dVar, View view) {
        j5b0 j5b0Var = abstractC1372v5.mediator;
        if (j5b0Var != null) {
            j5b0Var.m17282f0(dVar, false, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25734e(AbstractC1372v5 abstractC1372v5, int i, d30 d30Var) {
        LinearLayout linearLayout = abstractC1372v5._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (abstractC1372v5.selectWidth + ((i - 1) * abstractC1372v5.normalWidth));
        LinearLayout linearLayout3 = abstractC1372v5._sections_root;
        if (linearLayout3 == null) {
            Intrinsics.r("_sections_root");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m25735f(AbstractC1372v5 abstractC1372v5, View view, boolean z) {
        abstractC1372v5.m25740l((AnimBorderSectionView) view, z, 0);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static void m25736g(AbstractC1372v5 abstractC1372v5, List list) {
        abstractC1372v5.m25747s();
        LinearLayout linearLayout = abstractC1372v5._sections_root;
        u7j0 u7j0Var = null;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        v8j0.b(linearLayout);
        LinearLayout linearLayout2 = abstractC1372v5._sections_root;
        if (linearLayout2 == null) {
            Intrinsics.r("_sections_root");
            linearLayout2 = null;
        }
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) list.get(i);
            LinearLayout linearLayout3 = abstractC1372v5._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_sections_root");
                linearLayout3 = null;
            }
            View childAt = linearLayout3.getChildAt(i);
            childAt.getClass();
            View view = (AbsPurchaseSectionView) childAt;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = dVar.l() ? 1.174f : 1.0f;
            view.setLayoutParams(layoutParams2);
            abstractC1372v5.m25753z(false, view, dVar.l());
        }
        LinearLayout linearLayout4 = abstractC1372v5._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.r("_sections_root");
            linearLayout4 = null;
        }
        u7j0 u7j0Var2 = abstractC1372v5.transitionSet;
        if (u7j0Var2 == null) {
            Intrinsics.r("transitionSet");
        } else {
            u7j0Var = u7j0Var2;
        }
        v8j0.a(linearLayout4, u7j0Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m25737h(AbstractC1372v5 abstractC1372v5, List list) {
        abstractC1372v5.m25752x(list);
    }

    @Override // p006l.d1m
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo12554b() {
        super.mo12554b();
    }

    /* JADX INFO: renamed from: i */
    public final void m25738i(d30 callback) {
        float fY0 = (((xdl0.y0() - svq.c(20)) - (svq.c(7) * 2)) - (p2b0.h().z() ? svq.c(6) : 0)) / 3.174f;
        this.normalWidth = fY0;
        this.selectWidth = fY0 * 1.174f;
        callback.call();
    }

    /* JADX INFO: renamed from: j */
    public final void m25739j(@NotNull final List<? extends d> sections) {
        sections.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        linearLayout.post(new Runnable() { // from class: l.p5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1372v5.m25736g(this.f18589a, sections);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract AbsPurchaseSectionView mo11802k(@NotNull d section, @NotNull ViewGroup _root);

    /* JADX INFO: renamed from: l */
    public final void m25740l(AnimBorderSectionView _view, final boolean select, final int duration) {
        vwb.z(_view.getAnimBackgroundList(), new e30() { // from class: l.u5
            public final void call(Object obj) {
                AbstractC1372v5.m25732c(select, duration, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final j5b0 getMediator() {
        return this.mediator;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getNormalWidth() {
        return this.normalWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: r */
    public final void m25746r(@NotNull LinearLayout _view) {
        _view.getClass();
        if (this._sections_root == null) {
            this._sections_root = _view;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m25747s() {
        if (this.transitionSet == null) {
            a9j0 a9j0Var = new a9j0();
            this.transitionSet = a9j0Var;
            a9j0Var.f(new cr4());
            a9j0 a9j0Var2 = this.transitionSet;
            a9j0 a9j0Var3 = null;
            if (a9j0Var2 == null) {
                Intrinsics.r("transitionSet");
                a9j0Var2 = null;
            }
            a9j0Var2.f(new TextScale());
            a9j0 a9j0Var4 = this.transitionSet;
            if (a9j0Var4 == null) {
                Intrinsics.r("transitionSet");
                a9j0Var4 = null;
            }
            a9j0Var4.f(new lii0());
            a9j0 a9j0Var5 = this.transitionSet;
            if (a9j0Var5 == null) {
                Intrinsics.r("transitionSet");
            } else {
                a9j0Var3 = a9j0Var5;
            }
            a9j0Var3.r(200L);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m25748t(final int size, final d30 onComplete) {
        LinearLayout linearLayout = this._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (!p2b0.h().z()) {
            LinearLayout linearLayout3 = this._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.r("_sections_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.setWeightSum(3.174f);
            onComplete.call();
            return;
        }
        if (this.normalWidth <= 0.0f || this.selectWidth <= 0.0f) {
            m25738i(new d30() { // from class: l.s5
                public final void call() {
                    AbstractC1372v5.m25734e(this.f21105a, size, onComplete);
                }
            });
            return;
        }
        LinearLayout linearLayout4 = this._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.r("_sections_root");
            linearLayout4 = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (this.selectWidth + ((size - 1) * this.normalWidth));
        LinearLayout linearLayout5 = this._sections_root;
        if (linearLayout5 == null) {
            Intrinsics.r("_sections_root");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setLayoutParams(layoutParams);
        onComplete.call();
    }

    /* JADX INFO: renamed from: u */
    public final void m25749u(@NotNull final List<? extends d> sections) {
        sections.getClass();
        int size = sections.size();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        if (size != linearLayout.getChildCount()) {
            m25748t(sections.size(), new d30() { // from class: l.q5
                public final void call() {
                    AbstractC1372v5.m25737h(this.f19632a, sections);
                }
            });
        } else {
            m25752x(sections);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m25750v(@NotNull List<? extends d> sections, @NotNull d selectSection) {
        sections.getClass();
        selectSection.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.r("_sections_root");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = sections.get(i);
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.r("_sections_root");
                linearLayout2 = null;
            }
            View childAt = linearLayout2.getChildAt(i);
            childAt.getClass();
            dVar.v(Intrinsics.d(dVar, selectSection));
            m25751w(sections, (AbsPurchaseSectionView) childAt, dVar);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m25751w(List<? extends d> sections, AbsPurchaseSectionView _view, d section) {
        d.a aVarB;
        if (!p2b0.h().z() || e.x(this.from)) {
            aVarB = section.n() ? section.b() : section.d();
        } else {
            aVarB = NullChecker.a(section.d()) ? section.d() : section.b();
        }
        _view.mo7659a(section.l(), aVarB.s().autoRenewable(), aVarB);
    }

    /* JADX INFO: renamed from: x */
    public final void m25752x(List<? extends d> sections) {
        AbsPurchaseSectionView absPurchaseSectionViewMo11802k;
        int size = sections.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final d dVar = sections.get(i2);
            LinearLayout linearLayout = this._sections_root;
            ViewGroup viewGroup = null;
            if (linearLayout == null) {
                Intrinsics.r("_sections_root");
                linearLayout = null;
            }
            int childCount = linearLayout.getChildCount();
            ViewGroup viewGroup2 = this._sections_root;
            if (childCount > i2) {
                if (viewGroup2 == null) {
                    Intrinsics.r("_sections_root");
                    viewGroup2 = null;
                }
                View viewA = ViewGroupKt.a(viewGroup2, i2);
                viewA.getClass();
                absPurchaseSectionViewMo11802k = (AbsPurchaseSectionView) viewA;
            } else {
                if (viewGroup2 == null) {
                    Intrinsics.r("_sections_root");
                    viewGroup2 = null;
                }
                absPurchaseSectionViewMo11802k = mo11802k(dVar, viewGroup2);
            }
            absPurchaseSectionViewMo11802k.mo7659a(dVar.l(), dVar.n(), dVar.n() ? dVar.b() : dVar.d());
            m25753z(true, absPurchaseSectionViewMo11802k, dVar.l());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.leftMargin = svq.c(3);
            layoutParams.rightMargin = svq.c(3);
            layoutParams.weight = dVar.l() ? 1.174f : 1.0f;
            xdl0.E0(absPurchaseSectionViewMo11802k, new View.OnClickListener() { // from class: l.t5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC1372v5.m25733d(this.f21874a, dVar, view);
                }
            });
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.r("_sections_root");
                linearLayout2 = null;
            }
            if (linearLayout2.indexOfChild(absPurchaseSectionViewMo11802k) == -1) {
                LinearLayout linearLayout3 = this._sections_root;
                if (linearLayout3 == null) {
                    Intrinsics.r("_sections_root");
                } else {
                    viewGroup = linearLayout3;
                }
                viewGroup.addView(absPurchaseSectionViewMo11802k, layoutParams);
            } else {
                absPurchaseSectionViewMo11802k.setLayoutParams(layoutParams);
            }
            if (dVar.l()) {
                i = i2;
            }
        }
        mo13886y(i);
    }

    /* JADX INFO: renamed from: z */
    public final void m25753z(boolean init, final View _view, final boolean select) {
        if (_view instanceof AnimBorderSectionView) {
            if (init) {
                xdl0.b0(_view, new v9j() { // from class: l.r5
                    public final Object call() {
                        return AbstractC1372v5.m25735f(this.f20337a, _view, select);
                    }
                });
            } else {
                m25740l((AnimBorderSectionView) _view, select, 200);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo13886y(int index) {
    }
}
