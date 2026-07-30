package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.t5 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 Z2\u00020\u0001:\u0001>B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b1\u0010\u0015J-\u00102\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u00103J'\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u0010\r\u001a\u0002062\u0006\u00107\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020:2\u0006\u00107\u001a\u0002042\u0006\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006["}, m88121d2 = {"Ll/t5;", "Ll/w3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/widget/LinearLayout;", "_view", "", "r", "(Landroid/widget/LinearLayout;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "u", "(Ljava/util/List;)V", "selectSection", ResourceDirection.f39656v, "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "j", "section", "Landroid/view/ViewGroup;", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "", FirebaseAnalytics.Param.INDEX, BaseSei.f14625Y, "(I)V", "", "p", "()F", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "Ll/x20;", "callback", RXScreenCaptureService.KEY_INDEX, "(Ll/x20;)V", "size", "onComplete", Constants.KEY_T, "(ILl/x20;)V", BaseSei.f14624X, "w", "(Ljava/util/List;Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "init", "Landroid/view/View;", "select", BaseSei.f14626Z, "(ZLandroid/view/View;Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", BLiveOperationTitleShowType.duration, BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;ZI)V", "a", "Lcom/p1/mobile/android/app/Act;", "m", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "q", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "n", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/ndb0;", "o", "()Ll/ndb0;", "e", "Landroid/widget/LinearLayout;", "_sections_root", "Ll/eij0;", "f", "Ll/eij0;", "transitionSet", "g", "F", "normalWidth", "h", "selectWidth", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class AbstractC20237t5 implements w3m {

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
    public final ndb0 mediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LinearLayout _sections_root;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public eij0 transitionSet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float normalWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float selectWidth;

    public AbstractC20237t5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m189333c(boolean z, int i, View view) {
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
    public static void m189334d(AbstractC20237t5 abstractC20237t5, C8928d c8928d, View view) throws Exception {
        ndb0 ndb0Var = abstractC20237t5.mediator;
        if (ndb0Var != null) {
            ndb0Var.m162680f0(c8928d, false, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m189335e(AbstractC20237t5 abstractC20237t5, int i, x20 x20Var) {
        LinearLayout linearLayout = abstractC20237t5._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (abstractC20237t5.selectWidth + ((i - 1) * abstractC20237t5.normalWidth));
        LinearLayout linearLayout3 = abstractC20237t5._sections_root;
        if (linearLayout3 == null) {
            Intrinsics.m88391r("_sections_root");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m189336f(AbstractC20237t5 abstractC20237t5, View view, boolean z) {
        abstractC20237t5.m189341l((AnimBorderSectionView) view, z, 0);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static void m189337g(AbstractC20237t5 abstractC20237t5, List list) {
        abstractC20237t5.m189348s();
        LinearLayout linearLayout = abstractC20237t5._sections_root;
        eij0 eij0Var = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        zhj0.m219689b(linearLayout);
        LinearLayout linearLayout2 = abstractC20237t5._sections_root;
        if (linearLayout2 == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout2 = null;
        }
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C8928d c8928d = (C8928d) list.get(i);
            LinearLayout linearLayout3 = abstractC20237t5._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_sections_root");
                linearLayout3 = null;
            }
            View childAt = linearLayout3.getChildAt(i);
            childAt.getClass();
            View view = (AbsPurchaseSectionView) childAt;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = c8928d.m54713l() ? 1.174f : 1.0f;
            view.setLayoutParams(layoutParams2);
            abstractC20237t5.m189354z(false, view, c8928d.m54713l());
        }
        LinearLayout linearLayout4 = abstractC20237t5._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout4 = null;
        }
        eij0 eij0Var2 = abstractC20237t5.transitionSet;
        if (eij0Var2 == null) {
            Intrinsics.m88391r("transitionSet");
        } else {
            eij0Var = eij0Var2;
        }
        zhj0.m219688a(linearLayout4, eij0Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m189338h(AbstractC20237t5 abstractC20237t5, List list) {
        abstractC20237t5.m189353x(list);
    }

    @Override // p153l.w3m
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo152867b() {
        super.mo152867b();
    }

    /* JADX INFO: renamed from: i */
    public final void m189339i(x20 callback) {
        float fM105592y0 = (((bnl0.m105592y0() - txq.m193530c(20)) - (txq.m193530c(7) * 2)) - (tab0.m189811h().m189835z() ? txq.m193530c(6) : 0)) / 3.174f;
        this.normalWidth = fM105592y0;
        this.selectWidth = fM105592y0 * 1.174f;
        callback.call();
    }

    /* JADX INFO: renamed from: j */
    public final void m189340j(@NotNull final List<? extends C8928d> sections) {
        sections.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        linearLayout.post(new Runnable() { // from class: l.n5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20237t5.m189337g(this.f140269a, sections);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract AbsPurchaseSectionView mo120887k(@NotNull C8928d section, @NotNull ViewGroup _root);

    /* JADX INFO: renamed from: l */
    public final void m189341l(AnimBorderSectionView _view, final boolean select, final int duration) {
        jyb.m147537z(_view.getAnimBackgroundList(), new y20() { // from class: l.s5
            @Override // p153l.y20
            public final void call(Object obj) {
                AbstractC20237t5.m189333c(select, duration, (View) obj);
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
    public final ndb0 getMediator() {
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
    public final void m189347r(@NotNull LinearLayout _view) {
        _view.getClass();
        if (this._sections_root == null) {
            this._sections_root = _view;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m189348s() {
        if (this.transitionSet == null) {
            eij0 eij0Var = new eij0();
            this.transitionSet = eij0Var;
            eij0Var.m120898f(new bs4());
            eij0 eij0Var2 = this.transitionSet;
            eij0 eij0Var3 = null;
            if (eij0Var2 == null) {
                Intrinsics.m88391r("transitionSet");
                eij0Var2 = null;
            }
            eij0Var2.m120898f(new TextScale());
            eij0 eij0Var4 = this.transitionSet;
            if (eij0Var4 == null) {
                Intrinsics.m88391r("transitionSet");
                eij0Var4 = null;
            }
            eij0Var4.m120898f(new lri0());
            eij0 eij0Var5 = this.transitionSet;
            if (eij0Var5 == null) {
                Intrinsics.m88391r("transitionSet");
            } else {
                eij0Var3 = eij0Var5;
            }
            eij0Var3.setDuration(200L);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m189349t(final int size, final x20 onComplete) {
        LinearLayout linearLayout = this._sections_root;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (!tab0.m189811h().m189835z()) {
            LinearLayout linearLayout3 = this._sections_root;
            if (linearLayout3 == null) {
                Intrinsics.m88391r("_sections_root");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.setWeightSum(3.174f);
            onComplete.call();
            return;
        }
        if (this.normalWidth <= 0.0f || this.selectWidth <= 0.0f) {
            m189339i(new x20() { // from class: l.q5
                @Override // p153l.x20
                public final void call() {
                    AbstractC20237t5.m189335e(this.f155639a, size, onComplete);
                }
            });
            return;
        }
        LinearLayout linearLayout4 = this._sections_root;
        if (linearLayout4 == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout4 = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout4.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = (int) (this.selectWidth + ((size - 1) * this.normalWidth));
        LinearLayout linearLayout5 = this._sections_root;
        if (linearLayout5 == null) {
            Intrinsics.m88391r("_sections_root");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setLayoutParams(layoutParams);
        onComplete.call();
    }

    /* JADX INFO: renamed from: u */
    public final void m189350u(@NotNull final List<? extends C8928d> sections) {
        sections.getClass();
        int size = sections.size();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        if (size != linearLayout.getChildCount()) {
            m189349t(sections.size(), new x20() { // from class: l.o5
                @Override // p153l.x20
                public final void call() {
                    AbstractC20237t5.m189338h(this.f145022a, sections);
                }
            });
        } else {
            m189353x(sections);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m189351v(@NotNull List<? extends C8928d> sections, @NotNull C8928d selectSection) {
        sections.getClass();
        selectSection.getClass();
        LinearLayout linearLayout = this._sections_root;
        if (linearLayout == null) {
            Intrinsics.m88391r("_sections_root");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C8928d c8928d = sections.get(i);
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.m88391r("_sections_root");
                linearLayout2 = null;
            }
            View childAt = linearLayout2.getChildAt(i);
            childAt.getClass();
            c8928d.m54723v(Intrinsics.m88377d(c8928d, selectSection));
            m189352w(sections, (AbsPurchaseSectionView) childAt, c8928d);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m189352w(List<? extends C8928d> sections, AbsPurchaseSectionView _view, C8928d section) {
        C8928d.a aVarM54703b;
        if (!tab0.m189811h().m189835z() || C8929e.m54833x(this.from)) {
            aVarM54703b = section.m54715n() ? section.m54703b() : section.m54705d();
        } else {
            aVarM54703b = NullChecker.m82486a(section.m54705d()) ? section.m54705d() : section.m54703b();
        }
        _view.mo55507a(section.m54713l(), aVarM54703b.m54784s().autoRenewable(), aVarM54703b);
    }

    /* JADX INFO: renamed from: x */
    public final void m189353x(List<? extends C8928d> sections) {
        AbsPurchaseSectionView absPurchaseSectionViewMo120887k;
        int size = sections.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final C8928d c8928d = sections.get(i2);
            LinearLayout linearLayout = this._sections_root;
            ViewGroup viewGroup = null;
            if (linearLayout == null) {
                Intrinsics.m88391r("_sections_root");
                linearLayout = null;
            }
            int childCount = linearLayout.getChildCount();
            ViewGroup viewGroup2 = this._sections_root;
            if (childCount > i2) {
                if (viewGroup2 == null) {
                    Intrinsics.m88391r("_sections_root");
                    viewGroup2 = null;
                }
                View viewM1329a = ViewGroupKt.m1329a(viewGroup2, i2);
                viewM1329a.getClass();
                absPurchaseSectionViewMo120887k = (AbsPurchaseSectionView) viewM1329a;
            } else {
                if (viewGroup2 == null) {
                    Intrinsics.m88391r("_sections_root");
                    viewGroup2 = null;
                }
                absPurchaseSectionViewMo120887k = mo120887k(c8928d, viewGroup2);
            }
            absPurchaseSectionViewMo120887k.mo55507a(c8928d.m54713l(), c8928d.m54715n(), c8928d.m54715n() ? c8928d.m54703b() : c8928d.m54705d());
            m189354z(true, absPurchaseSectionViewMo120887k, c8928d.m54713l());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.leftMargin = txq.m193530c(3);
            layoutParams.rightMargin = txq.m193530c(3);
            layoutParams.weight = c8928d.m54713l() ? 1.174f : 1.0f;
            bnl0.m105509E0(absPurchaseSectionViewMo120887k, new View.OnClickListener() { // from class: l.r5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    AbstractC20237t5.m189334d(this.f161265a, c8928d, view);
                }
            });
            LinearLayout linearLayout2 = this._sections_root;
            if (linearLayout2 == null) {
                Intrinsics.m88391r("_sections_root");
                linearLayout2 = null;
            }
            if (linearLayout2.indexOfChild(absPurchaseSectionViewMo120887k) == -1) {
                LinearLayout linearLayout3 = this._sections_root;
                if (linearLayout3 == null) {
                    Intrinsics.m88391r("_sections_root");
                } else {
                    viewGroup = linearLayout3;
                }
                viewGroup.addView(absPurchaseSectionViewMo120887k, layoutParams);
            } else {
                absPurchaseSectionViewMo120887k.setLayoutParams(layoutParams);
            }
            if (c8928d.m54713l()) {
                i = i2;
            }
        }
        mo135119y(i);
    }

    /* JADX INFO: renamed from: z */
    public final void m189354z(boolean init, final View _view, final boolean select) {
        if (_view instanceof AnimBorderSectionView) {
            if (init) {
                bnl0.m105546b0(_view, new pcj() { // from class: l.p5
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC20237t5.m189336f(this.f150582a, _view, select);
                    }
                });
            } else {
                m189341l((AnimBorderSectionView) _view, select, 200);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo135119y(int index) {
    }
}
