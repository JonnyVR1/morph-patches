package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C0748b;
import androidx.viewpager2.widget.C0749c;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.view.circleindicator.CircleIndicator3;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0019\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u0017\u00100\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00103\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010+J\u0017\u00104\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010ER\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010GR$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010IR\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010KR\u0016\u0010N\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010M¨\u0006O"}, m88121d2 = {"Ll/s6h0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "f", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/x20;", "callback", "", Constants.KEY_T, "(Ll/x20;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/z20;", "", "sectionClicked", "Ll/y20;", "", SysnotifListener.ACTION_DISMISS, BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;Ll/z20;Ll/y20;)V", "h", "()I", "r", "()V", OMSTemplateModeType.view, "k", "(Landroid/view/View;)V", "e", Constants.INAPP_DATA_TAG, "m", "()Z", "p", "(Ljava/util/List;Ll/z20;)V", ResourceDirection.f39656v, "position", RXScreenCaptureService.KEY_INDEX, "(I)V", BaseSei.f14625Y, BaseSei.f14624X, "j", "o", "n", "w", "g", "u", BLiveStormDanmakuGiftResourceType.f45292l, "(I)Z", "oldPosition", "newPosition", "q", "(II)V", "a", "Lcom/p1/mobile/android/app/Act;", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator3;", "c", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator3;", "indicator", "Ll/v6h0;", "Ll/v6h0;", "adapter", "Ljava/util/List;", "Ll/z20;", "Ll/x20;", "onPaymentTriggered", "I", "selectedPosition", "Z", "isInitializing", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class s6h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ViewPager2 viewPager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public CircleIndicator3 indicator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public v6h0 adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends C8928d> sections;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public z20<C8928d, Boolean> sectionClicked;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public x20 onPaymentTriggered;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isInitializing;

    /* JADX INFO: renamed from: l.s6h0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/s6h0$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19997a extends ViewPager2.AbstractC0742i {
        public C19997a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            s6h0.this.m184895j(position);
        }
    }

    public s6h0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.sections = CollectionsKt.emptyList();
        this.isInitializing = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m184886a(s6h0 s6h0Var, Integer num) {
        num.getClass();
        s6h0Var.m184894i(num.intValue());
    }

    /* JADX INFO: renamed from: b */
    public static void m184887b(s6h0 s6h0Var, int i, int i2) {
        s6h0Var.m184902q(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m184889d() {
        ViewPager2 viewPager2 = this.viewPager;
        View childAt = viewPager2 != null ? viewPager2.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setClipChildren(false);
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
            int iM175859d = qa00.m175859d(88.0f);
            recyclerView.setPadding(iM175859d, 0, iM175859d, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m184890e() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setClipChildren(false);
            viewPager2.setClipToPadding(false);
            m184889d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final View m184891f(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162532c0, root, false);
        viewInflate.getClass();
        m184896k(viewInflate);
        m184890e();
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public final void m184892g() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4252j(this.selectedPosition, false);
        }
        m184899n(this.selectedPosition);
        this.isInitializing = false;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    /* JADX INFO: renamed from: i */
    public final void m184894i(int position) {
        if (position == this.selectedPosition) {
            x20 x20Var = this.onPaymentTriggered;
            if (x20Var != null) {
                x20Var.call();
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4252j(position, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m184895j(int position) {
        if (position >= this.sections.size()) {
            return;
        }
        if (!this.isInitializing) {
            m184900o();
        }
        m184906u(position);
        m184899n(position);
    }

    /* JADX INFO: renamed from: k */
    public final void m184896k(View view) {
        this.viewPager = (ViewPager2) view.findViewById(fdc0.f98361N0);
        this.indicator = (CircleIndicator3) view.findViewById(fdc0.f98402f0);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m184897l(int position) {
        return position >= 0 && position < this.sections.size();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m184898m() {
        return (this.viewPager == null || this.indicator == null) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m184899n(int position) {
        z20<C8928d, Boolean> z20Var;
        C8928d c8928d = (C8928d) CollectionsKt.getOrNull(this.sections, position);
        if (c8928d == null || (z20Var = this.sectionClicked) == null) {
            return;
        }
        z20Var.call(c8928d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public final void m184900o() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.performHapticFeedback(3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m184901p(List<? extends C8928d> sections, z20<C8928d, Boolean> sectionClicked) {
        this.isInitializing = true;
        this.sections = sections;
        this.sectionClicked = sectionClicked;
        Iterator<? extends C8928d> it = sections.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().m54713l()) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        this.selectedPosition = numValueOf != null ? numValueOf.intValue() : 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m184902q(int oldPosition, int newPosition) {
        v6h0 v6h0Var = this.adapter;
        if (v6h0Var != null) {
            v6h0Var.notifyItemChanged(oldPosition);
            v6h0Var.notifyItemChanged(newPosition);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m184903r() {
        this.viewPager = null;
        this.indicator = null;
        this.adapter = null;
        this.sections = CollectionsKt.emptyList();
        this.sectionClicked = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m184904s(@NotNull List<? extends C8928d> sections, @NotNull z20<C8928d, Boolean> sectionClicked, @NotNull y20<Integer> dismiss) {
        sections.getClass();
        sectionClicked.getClass();
        dismiss.getClass();
        if (m184898m()) {
            m184901p(sections, sectionClicked);
            m184907v();
            m184910y();
            m184909x();
            m184908w();
            m184892g();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m184905t(@Nullable x20 callback) {
        this.onPaymentTriggered = callback;
    }

    /* JADX INFO: renamed from: u */
    public final void m184906u(final int position) {
        final int i;
        if (!m184897l(position) || position == (i = this.selectedPosition)) {
            return;
        }
        this.selectedPosition = position;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.post(new Runnable() { // from class: l.q6h0
                @Override // java.lang.Runnable
                public final void run() {
                    s6h0.m184887b(this.f155813a, i, position);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m184907v() {
        v6h0 v6h0Var = new v6h0(this.act, this.sections, new y20() { // from class: l.r6h0
            @Override // p153l.y20
            public final void call(Object obj) {
                s6h0.m184886a(this.f161474a, (Integer) obj);
            }
        }, this);
        this.adapter = v6h0Var;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(v6h0Var);
            viewPager2.setOffscreenPageLimit(2);
        }
        v6h0 v6h0Var2 = this.adapter;
        if (v6h0Var2 != null) {
            v6h0Var2.m200060D(30);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m184908w() {
        CircleIndicator3 circleIndicator3 = this.indicator;
        if (circleIndicator3 != null) {
            circleIndicator3.mo57391k(Color.parseColor("#62CAFA"), Color.parseColor("#1A000000"));
            circleIndicator3.setViewPager(this.viewPager);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m184909x() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4249g(new C19997a());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m184910y() {
        C0748b c0748b = new C0748b();
        c0748b.m4291b(new C0749c(qa00.m175859d(30.0f)));
        c0748b.m4291b(new ujj());
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setPageTransformer(c0748b);
        }
    }
}
