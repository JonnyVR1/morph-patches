package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C0746b;
import androidx.viewpager2.widget.C0747c;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.view.circleindicator.CircleIndicator3;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0019\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u0017\u00100\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00103\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010+J\u0017\u00104\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010ER\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010GR$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010IR\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010KR\u0016\u0010N\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010M¨\u0006O"}, m87232d2 = {"Ll/sq5;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "f", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "callback", "", Constants.KEY_T, "(Ll/d30;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/f30;", "", "sectionClicked", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/List;Ll/f30;Ll/e30;)V", "h", "()I", "r", "()V", OMSTemplateModeType.view, "k", "(Landroid/view/View;)V", "e", Constants.INAPP_DATA_TAG, "m", "()Z", "p", "(Ljava/util/List;Ll/f30;)V", ResourceDirection.f38808v, "position", RXScreenCaptureService.KEY_INDEX, "(I)V", BaseSei.f13931Y, BaseSei.f13930X, "j", "o", "n", "w", "g", "u", BLiveStormDanmakuGiftResourceType.f44444l, "(I)Z", "oldPosition", "newPosition", "q", "(II)V", "a", "Lcom/p1/mobile/android/app/Act;", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator3;", "c", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator3;", "indicator", "Ll/hr5;", "Ll/hr5;", "adapter", "Ljava/util/List;", "Ll/f30;", "Ll/d30;", "onPaymentTriggered", "I", "selectedPosition", "Z", "isInitializing", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sq5 {

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
    public hr5 adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends C8765d> sections;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public f30<C8765d, Boolean> sectionClicked;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public d30 onPaymentTriggered;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isInitializing;

    /* JADX INFO: renamed from: l.sq5$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/sq5$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20012a extends ViewPager2.AbstractC0740i {
        public C20012a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            sq5.this.m185459j(position);
        }
    }

    public sq5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.sections = CollectionsKt.emptyList();
        this.isInitializing = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m185450a(sq5 sq5Var, int i, int i2) {
        sq5Var.m185466q(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m185451b(sq5 sq5Var, Integer num) {
        num.getClass();
        sq5Var.m185458i(num.intValue());
    }

    /* JADX INFO: renamed from: d */
    public final void m185453d() {
        ViewPager2 viewPager2 = this.viewPager;
        View childAt = viewPager2 != null ? viewPager2.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setClipChildren(false);
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
            int iM186890d = t100.m186890d(88.0f);
            recyclerView.setPadding(iM186890d, 0, iM186890d, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m185454e() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setClipChildren(false);
            viewPager2.setClipToPadding(false);
            m185453d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final View m185455f(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131653v, root, false);
        viewInflate.getClass();
        m185460k(viewInflate);
        m185454e();
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public final void m185456g() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4250j(this.selectedPosition, false);
        }
        m185463n(this.selectedPosition);
        this.isInitializing = false;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    /* JADX INFO: renamed from: i */
    public final void m185458i(int position) {
        if (position == this.selectedPosition) {
            d30 d30Var = this.onPaymentTriggered;
            if (d30Var != null) {
                d30Var.call();
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4250j(position, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m185459j(int position) {
        if (position >= this.sections.size()) {
            return;
        }
        if (!this.isInitializing) {
            m185464o();
        }
        m185470u(position);
        m185463n(position);
    }

    /* JADX INFO: renamed from: k */
    public final void m185460k(View view) {
        this.viewPager = (ViewPager2) view.findViewById(z4c0.f201485N0);
        this.indicator = (CircleIndicator3) view.findViewById(z4c0.f201526f0);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m185461l(int position) {
        return position >= 0 && position < this.sections.size();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m185462m() {
        return (this.viewPager == null || this.indicator == null) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m185463n(int position) {
        f30<C8765d, Boolean> f30Var;
        C8765d c8765d = (C8765d) CollectionsKt.getOrNull(this.sections, position);
        if (c8765d == null || (f30Var = this.sectionClicked) == null) {
            return;
        }
        f30Var.call(c8765d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public final void m185464o() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.performHapticFeedback(3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m185465p(List<? extends C8765d> sections, f30<C8765d, Boolean> sectionClicked) {
        this.isInitializing = true;
        this.sections = sections;
        this.sectionClicked = sectionClicked;
        Iterator<? extends C8765d> it = sections.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().m53530l()) {
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
    public final void m185466q(int oldPosition, int newPosition) {
        hr5 hr5Var = this.adapter;
        if (hr5Var != null) {
            hr5Var.notifyItemChanged(oldPosition);
            hr5Var.notifyItemChanged(newPosition);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m185467r() {
        this.viewPager = null;
        this.indicator = null;
        this.adapter = null;
        this.sections = CollectionsKt.emptyList();
        this.sectionClicked = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m185468s(@NotNull List<? extends C8765d> sections, @NotNull f30<C8765d, Boolean> sectionClicked, @NotNull e30<Integer> dismiss) {
        sections.getClass();
        sectionClicked.getClass();
        dismiss.getClass();
        if (m185462m()) {
            m185465p(sections, sectionClicked);
            m185471v();
            m185474y();
            m185473x();
            m185472w();
            m185456g();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m185469t(@Nullable d30 callback) {
        this.onPaymentTriggered = callback;
    }

    /* JADX INFO: renamed from: u */
    public final void m185470u(final int position) {
        final int i;
        if (!m185461l(position) || position == (i = this.selectedPosition)) {
            return;
        }
        this.selectedPosition = position;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.post(new Runnable() { // from class: l.qq5
                @Override // java.lang.Runnable
                public final void run() {
                    sq5.m185450a(this.f155865a, i, position);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m185471v() {
        hr5 hr5Var;
        hr5 hr5Var2 = new hr5(this.act, this.sections, new e30() { // from class: l.rq5
            @Override // p149l.e30
            public final void call(Object obj) {
                sq5.m185451b(this.f160589a, (Integer) obj);
            }
        }, this);
        this.adapter = hr5Var2;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(hr5Var2);
            viewPager2.setOffscreenPageLimit(2);
        }
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("intl_compliment_iap_config");
            strM79302F.getClass();
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM79302F);
            int iOptInt = jSONObject.optInt("hotIndex");
            int iOptInt2 = jSONObject.optInt("bestValueIndex");
            hq5 hq5Var = hq5.INSTANCE;
            Integer num = hq5Var.m132428a().get(Integer.valueOf(iOptInt));
            Integer num2 = hq5Var.m132428a().get(Integer.valueOf(iOptInt2));
            if (num == null || num2 == null || (hr5Var = this.adapter) == null) {
                return;
            }
            hr5Var.m132618D(num, num2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m185472w() {
        CircleIndicator3 circleIndicator3 = this.indicator;
        if (circleIndicator3 != null) {
            circleIndicator3.mo56208k(Color.parseColor("#F5C001"), Color.parseColor("#1A000000"));
            circleIndicator3.setViewPager(this.viewPager);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m185473x() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.m4247g(new C20012a());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m185474y() {
        C0746b c0746b = new C0746b();
        c0746b.m4289b(new C0747c(t100.m186890d(30.0f)));
        c0746b.m4289b(new zgj());
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setPageTransformer(c0746b);
        }
    }
}
