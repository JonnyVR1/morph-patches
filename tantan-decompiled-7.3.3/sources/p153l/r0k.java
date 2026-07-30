package p153l;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u0013J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010,\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\fR\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, m88121d2 = {"Ll/r0k;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/d1k;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/d1k;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "I", "(Landroid/view/View;)V", "", "Ll/u0k;", "memberItems", "X", "(Ljava/util/List;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "()V", "U", "p", "m", "", "menuType", "W", "(I)V", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "Lv/VLinear;", "k", "Lv/VLinear;", "Q", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "P", "()Landroid/view/View;", "set_empty", "_empty", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BloodType.f39576O, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_content", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_content", "n", "get_title", "set_title", "_title", "Lv/VImage;", "o", "Lv/VImage;", "N", "()Lv/VImage;", "set_close_btn", "(Lv/VImage;)V", "_close_btn", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", p7f.LATITUDE_SOUTH, "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "q", "R", "set_rules_btn", "_rules_btn", "Lv/VPagerNoPage;", "r", "Lv/VPagerNoPage;", p7f.GPS_DIRECTION_TRUE, "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/t0k;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/t0k;", "getPagerAdapter", "()Ll/t0k;", "setPagerAdapter", "(Ll/t0k;)V", "pagerAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r0k extends LiveMenuDialogHolder<d1k> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ConstraintLayout _content;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ConstraintLayout _title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _close_btn;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TabLayout _tabLayout;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _rules_btn;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VPagerNoPage _viewpager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public t0k pagerAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0k(@Nullable Act act, @NotNull d1k d1kVar) {
        super(yec0.f198844M8, act, d1kVar, qag0.m175924e(true));
        d1kVar.getClass();
        this.pagerAdapter = new t0k();
    }

    /* JADX INFO: renamed from: K */
    public static final void m179224K(r0k r0kVar, View view) {
        r0kVar.mo73021p();
    }

    /* JADX INFO: renamed from: L */
    public static final void m179225L(r0k r0kVar, View view) {
        r0kVar.mo73021p();
    }

    /* JADX INFO: renamed from: M */
    public static final void m179226M(r0k r0kVar, View view) {
        r0kVar.m179227U();
    }

    /* JADX INFO: renamed from: U */
    private final void m179227U() {
        int height = m179232O().getHeight() + bnl0.m105516I(act());
        d1k d1kVar = (d1k) this.f48605b;
        String str = efv.f93826E;
        str.getClass();
        d1kVar.m113588b4(str, height);
    }

    /* JADX INFO: renamed from: V */
    private final void m179228V() {
        m179237T().setAdapter(this.pagerAdapter);
        m179237T().m4187d(new C19715a());
    }

    /* JADX INFO: renamed from: X */
    private final void m179229X(List<u0k> memberItems) {
        this.pagerAdapter.m188802q(memberItems);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m179234Q().getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m179230I(View view) {
        e1k.m118983a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m179231N() {
        VImage vImage = this._close_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final ConstraintLayout m179232O() {
        ConstraintLayout constraintLayout = this._content;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m179233P() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VLinear m179234Q() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m179235R() {
        VImage vImage = this._rules_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_rules_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TabLayout m179236S() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VPagerNoPage m179237T() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final void m179238W(int menuType) {
        m73017E();
        m179237T().setCurrentItem(menuType);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return ((d1k) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m179229X(((d1k) this.f48605b).m113587a4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        if (view != null) {
            m179230I(view);
            m73014A(80);
            m73027z(LiveDialogEnum.GIFT_WALL);
            m179236S().setupWithViewPager(m179237T());
            m179228V();
            bnl0.m105505C0(m179232O(), (int) (((double) bnl0.m105588w0()) * 0.8d));
            bnl0.m105505C0(m179233P(), (int) (((double) bnl0.m105588w0()) * 0.2d));
            bnl0.m105509E0(m179233P(), new View.OnClickListener() { // from class: l.o0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    r0k.m179224K(this.f144552a, view2);
                }
            });
            bnl0.m105509E0(m179231N(), new View.OnClickListener() { // from class: l.p0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    r0k.m179225L(this.f150054a, view2);
                }
            });
            bnl0.m105509E0(m179235R(), new View.OnClickListener() { // from class: l.q0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    r0k.m179226M(this.f155059a, view2);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo73021p() {
        ((d1k) this.f48605b).m113589e4(0);
        super.mo73021p();
    }

    /* JADX INFO: renamed from: l.r0k$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/r0k$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19715a implements ViewPager.InterfaceC0718j {
        public C19715a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            ((d1k) r0k.this.f48605b).m113589e4(position == 0 ? 0 : 1);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
