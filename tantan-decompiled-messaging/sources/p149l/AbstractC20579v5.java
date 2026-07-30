package p149l;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.internal.TextScale;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.v5 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 Z2\u00020\u0001:\u0001>B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b1\u0010\u0015J-\u00102\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u00103J'\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u0010\r\u001a\u0002062\u0006\u00107\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020:2\u0006\u00107\u001a\u0002042\u0006\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006["}, m87232d2 = {"Ll/v5;", "Ll/d1m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/widget/LinearLayout;", "_view", "", "r", "(Landroid/widget/LinearLayout;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "u", "(Ljava/util/List;)V", "selectSection", ResourceDirection.f38808v, "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "j", "section", "Landroid/view/ViewGroup;", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "", FirebaseAnalytics.Param.INDEX, BaseSei.f13931Y, "(I)V", "", "p", "()F", BLiveStormDanmakuGiftResourceType.f44446s, "()V", "Ll/d30;", "callback", RXScreenCaptureService.KEY_INDEX, "(Ll/d30;)V", "size", "onComplete", Constants.KEY_T, "(ILl/d30;)V", BaseSei.f13930X, "w", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "init", "Landroid/view/View;", "select", BaseSei.f13932Z, "(ZLandroid/view/View;Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", BLiveOperationTitleShowType.duration, BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;ZI)V", "a", "Lcom/p1/mobile/android/app/Act;", "m", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "n", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/j5b0;", "o", "()Ll/j5b0;", "e", "Landroid/widget/LinearLayout;", "_sections_root", "Ll/a9j0;", "f", "Ll/a9j0;", "transitionSet", "g", "F", "normalWidth", "h", "selectWidth", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractC20579v5 implements d1m {

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

    public AbstractC20579v5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m197073c(boolean z, int i, View view) {
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
    public static void m197074d(AbstractC20579v5 abstractC20579v5, C8765d c8765d, View view) throws Exception {
        j5b0 j5b0Var = abstractC20579v5.mediator;
        if (j5b0Var != null) {
            j5b0Var.m139836f0(c8765d, false, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m197075e(AbstractC20579v5 abstractC20579v5, int i, d30 d30Var) {
        LinearLayout linearLayout = abstractC20579v5._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (abstractC20579v5.selectWidth + ((i - 1) * abstractC20579v5.normalWidth));
        LinearLayout linearLayout3 = abstractC20579v5._sections_root;
        if (linearLayout3 == null) {
            Intrinsics.m87502r("_sections_root");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m197076f(AbstractC20579v5 abstractC20579v5, View view, boolean z) {
        abstractC20579v5.m197081l((AnimBorderSectionView) view, z, 0);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static void m197077g(AbstractC20579v5 abstractC20579v5, List list) {
        abstractC20579v5.m197088s();
        LinearLayout linearLayout = abstractC20579v5._sections_root;
        a9j0 a9j0Var = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        v8j0.m197459b(linearLayout);
        LinearLayout linearLayout2 = abstractC20579v5._sections_root;
        if (linearLayout2 == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout2 = null;
        }
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C8765d c8765d = (C8765d) list.get(i);
            LinearLayout linearLayout3 = abstractC20579v5._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_sections_root");
                linearLayout3 = null;
            }
            View childAt = linearLayout3.getChildAt(i);
            childAt.getClass();
            View view = (AbsPurchaseSectionView) childAt;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = c8765d.m53530l() ? 1.174f : 1.0f;
            view.setLayoutParams(layoutParams2);
            abstractC20579v5.m197094z(false, view, c8765d.m53530l());
        }
        LinearLayout linearLayout4 = abstractC20579v5._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout4 = null;
        }
        a9j0 a9j0Var2 = abstractC20579v5.transitionSet;
        if (a9j0Var2 == null) {
            Intrinsics.m87502r("transitionSet");
        } else {
            a9j0Var = a9j0Var2;
        }
        v8j0.m197458a(linearLayout4, a9j0Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m197078h(AbstractC20579v5 abstractC20579v5, List list) {
        abstractC20579v5.m197093x(list);
    }

    @Override // p149l.d1m
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo100278b() {
        super.mo100278b();
    }

    /* JADX INFO: renamed from: i */
    public final void m197079i(d30 callback) {
        float fM208412y0 = (((xdl0.m208412y0() - svq.m186103c(20)) - (svq.m186103c(7) * 2)) - (p2b0.m167133h().m167157z() ? svq.m186103c(6) : 0)) / 3.174f;
        this.normalWidth = fM208412y0;
        this.selectWidth = fM208412y0 * 1.174f;
        callback.call();
    }

    /* JADX INFO: renamed from: j */
    public final void m197080j(@NotNull final List<? extends C8765d> sections) {
        sections.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        linearLayout.post(new Runnable() { // from class: l.p5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20579v5.m197077g(this.f147249a, sections);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract AbsPurchaseSectionView mo95542k(@NotNull C8765d section, @NotNull ViewGroup _root);

    /* JADX INFO: renamed from: l */
    public final void m197081l(AnimBorderSectionView _view, final boolean select, final int duration) {
        vwb.m200354z(_view.getAnimBackgroundList(), new e30() { // from class: l.u5
            @Override // p149l.e30
            public final void call(Object obj) {
                AbstractC20579v5.m197073c(select, duration, (View) obj);
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
    public final void m197087r(@NotNull LinearLayout _view) {
        _view.getClass();
        if (this._sections_root == null) {
            this._sections_root = _view;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m197088s() {
        if (this.transitionSet == null) {
            a9j0 a9j0Var = new a9j0();
            this.transitionSet = a9j0Var;
            a9j0Var.m95430f(new cr4());
            a9j0 a9j0Var2 = this.transitionSet;
            a9j0 a9j0Var3 = null;
            if (a9j0Var2 == null) {
                Intrinsics.m87502r("transitionSet");
                a9j0Var2 = null;
            }
            a9j0Var2.m95430f(new TextScale());
            a9j0 a9j0Var4 = this.transitionSet;
            if (a9j0Var4 == null) {
                Intrinsics.m87502r("transitionSet");
                a9j0Var4 = null;
            }
            a9j0Var4.m95430f(new lii0());
            a9j0 a9j0Var5 = this.transitionSet;
            if (a9j0Var5 == null) {
                Intrinsics.m87502r("transitionSet");
            } else {
                a9j0Var3 = a9j0Var5;
            }
            a9j0Var3.setDuration(200L);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m197089t(final int size, final d30 onComplete) {
        LinearLayout linearLayout = this._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (!p2b0.m167133h().m167157z()) {
            LinearLayout linearLayout3 = this._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.m87502r("_sections_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.setWeightSum(3.174f);
            onComplete.call();
            return;
        }
        if (this.normalWidth <= 0.0f || this.selectWidth <= 0.0f) {
            m197079i(new d30() { // from class: l.s5
                @Override // p149l.d30
                public final void call() {
                    AbstractC20579v5.m197075e(this.f162474a, size, onComplete);
                }
            });
            return;
        }
        LinearLayout linearLayout4 = this._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout4 = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (this.selectWidth + ((size - 1) * this.normalWidth));
        LinearLayout linearLayout5 = this._sections_root;
        if (linearLayout5 == null) {
            Intrinsics.m87502r("_sections_root");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setLayoutParams(layoutParams);
        onComplete.call();
    }

    /* JADX INFO: renamed from: u */
    public final void m197090u(@NotNull final List<? extends C8765d> sections) {
        sections.getClass();
        int size = sections.size();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        if (size != linearLayout.getChildCount()) {
            m197089t(sections.size(), new d30() { // from class: l.q5
                @Override // p149l.d30
                public final void call() {
                    AbstractC20579v5.m197078h(this.f152689a, sections);
                }
            });
        } else {
            m197093x(sections);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m197091v(@NotNull List<? extends C8765d> sections, @NotNull C8765d selectSection) {
        sections.getClass();
        selectSection.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m87502r("_sections_root");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C8765d c8765d = sections.get(i);
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.m87502r("_sections_root");
                linearLayout2 = null;
            }
            View childAt = linearLayout2.getChildAt(i);
            childAt.getClass();
            c8765d.m53540v(Intrinsics.m87488d(c8765d, selectSection));
            m197092w(sections, (AbsPurchaseSectionView) childAt, c8765d);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m197092w(List<? extends C8765d> sections, AbsPurchaseSectionView _view, C8765d section) {
        C8765d.a aVarM53520b;
        if (!p2b0.m167133h().m167157z() || C8766e.m53650x(this.from)) {
            aVarM53520b = section.m53532n() ? section.m53520b() : section.m53522d();
        } else {
            aVarM53520b = NullChecker.m81303a(section.m53522d()) ? section.m53522d() : section.m53520b();
        }
        _view.mo54324a(section.m53530l(), aVarM53520b.m53601s().autoRenewable(), aVarM53520b);
    }

    /* JADX INFO: renamed from: x */
    public final void m197093x(List<? extends C8765d> sections) {
        AbsPurchaseSectionView absPurchaseSectionViewMo95542k;
        int size = sections.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final C8765d c8765d = sections.get(i2);
            LinearLayout linearLayout = this._sections_root;
            ViewGroup viewGroup = null;
            if (linearLayout == null) {
                Intrinsics.m87502r("_sections_root");
                linearLayout = null;
            }
            int childCount = linearLayout.getChildCount();
            ViewGroup viewGroup2 = this._sections_root;
            if (childCount > i2) {
                if (viewGroup2 == null) {
                    Intrinsics.m87502r("_sections_root");
                    viewGroup2 = null;
                }
                View viewM1328a = ViewGroupKt.m1328a(viewGroup2, i2);
                viewM1328a.getClass();
                absPurchaseSectionViewMo95542k = (AbsPurchaseSectionView) viewM1328a;
            } else {
                if (viewGroup2 == null) {
                    Intrinsics.m87502r("_sections_root");
                    viewGroup2 = null;
                }
                absPurchaseSectionViewMo95542k = mo95542k(c8765d, viewGroup2);
            }
            absPurchaseSectionViewMo95542k.mo54324a(c8765d.m53530l(), c8765d.m53532n(), c8765d.m53532n() ? c8765d.m53520b() : c8765d.m53522d());
            m197094z(true, absPurchaseSectionViewMo95542k, c8765d.m53530l());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.leftMargin = svq.m186103c(3);
            layoutParams.rightMargin = svq.m186103c(3);
            layoutParams.weight = c8765d.m53530l() ? 1.174f : 1.0f;
            xdl0.m208329E0(absPurchaseSectionViewMo95542k, new View.OnClickListener() { // from class: l.t5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    AbstractC20579v5.m197074d(this.f167762a, c8765d, view);
                }
            });
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.m87502r("_sections_root");
                linearLayout2 = null;
            }
            if (linearLayout2.indexOfChild(absPurchaseSectionViewMo95542k) == -1) {
                LinearLayout linearLayout3 = this._sections_root;
                if (linearLayout3 == null) {
                    Intrinsics.m87502r("_sections_root");
                } else {
                    viewGroup = linearLayout3;
                }
                viewGroup.addView(absPurchaseSectionViewMo95542k, layoutParams);
            } else {
                absPurchaseSectionViewMo95542k.setLayoutParams(layoutParams);
            }
            if (c8765d.m53530l()) {
                i = i2;
            }
        }
        mo110587y(i);
    }

    /* JADX INFO: renamed from: z */
    public final void m197094z(boolean init, final View _view, final boolean select) {
        if (_view instanceof AnimBorderSectionView) {
            if (init) {
                xdl0.m208366b0(_view, new v9j() { // from class: l.r5
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC20579v5.m197076f(this.f157742a, _view, select);
                    }
                });
            } else {
                m197081l((AnimBorderSectionView) _view, select, 200);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo110587y(int index) {
    }
}
