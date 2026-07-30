package p149l;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u0013J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010,\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\fR\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, m87232d2 = {"Ll/byj;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/nyj;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/nyj;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "I", "(Landroid/view/View;)V", "", "Ll/eyj;", "memberItems", "X", "(Ljava/util/List;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "()V", "U", "p", "m", "", "menuType", "W", "(I)V", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "Lv/VLinear;", "k", "Lv/VLinear;", "Q", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "P", "()Landroid/view/View;", "set_empty", "_empty", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BloodType.f38728O, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_content", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_content", "n", "get_title", "set_title", "_title", "Lv/VImage;", "o", "Lv/VImage;", "N", "()Lv/VImage;", "set_close_btn", "(Lv/VImage;)V", "_close_btn", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", j6f.LATITUDE_SOUTH, "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "q", "R", "set_rules_btn", "_rules_btn", "Lv/VPagerNoPage;", "r", "Lv/VPagerNoPage;", j6f.GPS_DIRECTION_TRUE, "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/dyj;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/dyj;", "getPagerAdapter", "()Ll/dyj;", "setPagerAdapter", "(Ll/dyj;)V", "pagerAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class byj extends LiveMenuDialogHolder<nyj> {

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
    public dyj pagerAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byj(@Nullable Act act, @NotNull nyj nyjVar) {
        super(t6c0.f168112M8, act, nyjVar, j2g0.m139458e(true));
        nyjVar.getClass();
        this.pagerAdapter = new dyj();
    }

    /* JADX INFO: renamed from: K */
    public static final void m104474K(byj byjVar, View view) {
        byjVar.mo71838p();
    }

    /* JADX INFO: renamed from: L */
    public static final void m104475L(byj byjVar, View view) {
        byjVar.mo71838p();
    }

    /* JADX INFO: renamed from: M */
    public static final void m104476M(byj byjVar, View view) {
        byjVar.m104477U();
    }

    /* JADX INFO: renamed from: U */
    private final void m104477U() {
        int height = m104482O().getHeight() + xdl0.m208336I(act());
        nyj nyjVar = (nyj) this.f47757b;
        String str = ddv.f85633E;
        str.getClass();
        nyjVar.m162025b4(str, height);
    }

    /* JADX INFO: renamed from: V */
    private final void m104478V() {
        m104487T().setAdapter(this.pagerAdapter);
        m104487T().m4185d(new C16016a());
    }

    /* JADX INFO: renamed from: X */
    private final void m104479X(List<eyj> memberItems) {
        this.pagerAdapter.m114076q(memberItems);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m104484Q().getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m104480I(View view) {
        oyj.m166670a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m104481N() {
        VImage vImage = this._close_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final ConstraintLayout m104482O() {
        ConstraintLayout constraintLayout = this._content;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m104483P() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VLinear m104484Q() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m104485R() {
        VImage vImage = this._rules_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_rules_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TabLayout m104486S() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VPagerNoPage m104487T() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final void m104488W(int menuType) {
        m71834E();
        m104487T().setCurrentItem(menuType);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return ((nyj) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m104479X(((nyj) this.f47757b).m162024a4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@Nullable View view) {
        if (view != null) {
            m104480I(view);
            m71831A(80);
            m71844z(LiveDialogEnum.GIFT_WALL);
            m104486S().setupWithViewPager(m104487T());
            m104478V();
            xdl0.m208325C0(m104482O(), (int) (((double) xdl0.m208408w0()) * 0.8d));
            xdl0.m208325C0(m104483P(), (int) (((double) xdl0.m208408w0()) * 0.2d));
            xdl0.m208329E0(m104483P(), new View.OnClickListener() { // from class: l.yxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byj.m104474K(this.f200628a, view2);
                }
            });
            xdl0.m208329E0(m104481N(), new View.OnClickListener() { // from class: l.zxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byj.m104475L(this.f205459a, view2);
                }
            });
            xdl0.m208329E0(m104485R(), new View.OnClickListener() { // from class: l.ayj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byj.m104476M(this.f72294a, view2);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo71838p() {
        ((nyj) this.f47757b).m162026e4(0);
        super.mo71838p();
    }

    /* JADX INFO: renamed from: l.byj$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/byj$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16016a implements ViewPager.InterfaceC0716j {
        public C16016a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            ((nyj) byj.this.f47757b).m162026e4(position == 0 ? 0 : 1);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
