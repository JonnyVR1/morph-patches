package p149l;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ'\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0014¢\u0006\u0004\b&\u0010\u0017J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\fR\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u0011¨\u0006X"}, m87232d2 = {"Ll/fay;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/say;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/say;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "I", "(Landroid/view/View;)V", "", "Ll/vay;", "memberItems", "W", "(Ljava/util/List;)V", "", "defaultIndex", "", "isOnPage", "L", "(IZ)V", "showSettleRedPoint", "showMicRedPoint", "X", "(ZZ)V", "U", "()V", "m", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "count", j6f.GPS_MEASUREMENT_INTERRUPTED, "(IZLcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;)V", "indexMenuType", "isShow", "M", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "Lv/VLinear;", "k", "Lv/VLinear;", "Q", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "P", "()Landroid/view/View;", "set_empty", "_empty", BloodType.f38728O, "set_content", "_content", "Lcom/google/android/material/tabs/TabLayout;", "n", "Lcom/google/android/material/tabs/TabLayout;", "R", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "Lv/VPagerNoPage;", "o", "Lv/VPagerNoPage;", j6f.LATITUDE_SOUTH, "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/uay;", "p", "Ll/uay;", "getPagerAdapter", "()Ll/uay;", "setPagerAdapter", "(Ll/uay;)V", "pagerAdapter", "q", "Ljava/util/List;", "N", "()Ljava/util/List;", j6f.GPS_DIRECTION_TRUE, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fay extends LiveMenuDialogHolder<say> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VLinear _content;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TabLayout _tabLayout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VPagerNoPage _viewpager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public uay pagerAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public List<vay> memberItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fay(@Nullable Act act, @NotNull say sayVar) {
        super(t6c0.f168167R3, act, sayVar, j2g0.m139457d(0.3f, true));
        sayVar.getClass();
        this.pagerAdapter = new uay();
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m120322F(vay vayVar) {
        return Boolean.valueOf(vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() > 1);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m120324H(int i, vay vayVar) {
        return Boolean.valueOf(vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != i);
    }

    /* JADX INFO: renamed from: K */
    public static final void m120326K(fay fayVar, View view) {
        fayVar.mo71838p();
    }

    /* JADX INFO: renamed from: U */
    private final void m120327U() {
        m120337S().setAdapter(this.pagerAdapter);
    }

    /* JADX INFO: renamed from: W */
    private final void m120328W(List<vay> memberItems) {
        m120338T(memberItems);
        this.pagerAdapter.m192806q(memberItems);
        if (this.pagerAdapter.getCount() <= 1) {
            m120336R().setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m120335Q().getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m120329I(View view) {
        tay.m187784a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m120330L(final int defaultIndex, boolean isOnPage) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m120332N());
        if (isOnPage) {
            vwb.m200320d0(arrayList, new w9j() { // from class: l.day
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return fay.m120324H(defaultIndex, (vay) obj);
                }
            });
        } else {
            vwb.m200320d0(arrayList, new w9j() { // from class: l.eay
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return fay.m120322F((vay) obj);
                }
            });
        }
        if (!isOnPage) {
            T t = this.f47757b;
            t.getClass();
            if (e0o0.m114322h(t)) {
                this.pagerAdapter.m192806q(m120332N());
                m120337S().setCurrentItem(defaultIndex);
                return;
            }
        }
        this.pagerAdapter.m192806q(arrayList);
        m120337S().setCurrentItem(((vay) arrayList.get(0)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
    }

    /* JADX INFO: renamed from: M */
    public final void m120331M(int indexMenuType, boolean isShow) {
        View customView;
        m120336R();
        int i = 0;
        for (Object obj : m120332N()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            vay vayVar = (vay) obj;
            TabLayout.Tab tabAt = m120336R().getTabAt(i);
            View viewFindViewById = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : customView.findViewById(g5c0.f101070u6);
            if (viewFindViewById != null && vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == indexMenuType) {
                xdl0.m208344M(viewFindViewById, isShow);
            }
            i = i2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final List<vay> m120332N() {
        List<vay> list = this.memberItems;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("memberItems");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m120333O() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m120334P() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VLinear m120335Q() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TabLayout m120336R() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VPagerNoPage m120337S() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m120338T(@NotNull List<vay> list) {
        list.getClass();
        this.memberItems = list;
    }

    /* JADX INFO: renamed from: V */
    public final void m120339V(int defaultIndex, boolean isOnPage, @Nullable BLiveVoiceAdminPanelCounter count) {
        m71834E();
        m120327U();
        m120330L(defaultIndex, isOnPage);
        if (count == null) {
            m120340X(false, false);
        } else {
            m120340X(count.applySettleRedDot > 0, count.applyCallRedDot > 0);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m120340X(boolean showSettleRedPoint, boolean showMicRedPoint) {
        View customView;
        View customView2;
        int i = 0;
        for (Object obj : m120332N()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            vay vayVar = (vay) obj;
            TabLayout.Tab tabAt = m120336R().getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(t6c0.f168101L9);
            }
            View viewFindViewById = null;
            TextView textView = (tabAt == null || (customView2 = tabAt.getCustomView()) == null) ? null : (TextView) customView2.findViewById(g5c0.f100880a7);
            if (textView != null) {
                textView.setText(tabAt != null ? tabAt.getText() : null);
            }
            if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
                viewFindViewById = customView.findViewById(g5c0.f101070u6);
            }
            if (viewFindViewById != null) {
                if (showSettleRedPoint && vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 2) {
                    xdl0.m208344M(viewFindViewById, showSettleRedPoint);
                } else if (showMicRedPoint && vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 3) {
                    xdl0.m208344M(viewFindViewById, showMicRedPoint);
                } else {
                    xdl0.m208344M(viewFindViewById, false);
                }
            }
            i = i2;
        }
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return ((say) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m120328W(((say) this.f47757b).m183141e4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@Nullable View view) {
        if (view != null) {
            m120329I(view);
            m71831A(80);
            m71844z(LiveDialogEnum.VOICE_MEMBER_MANAGER);
            m120336R().setupWithViewPager(m120337S());
            xdl0.m208325C0(m120333O(), (int) (((double) xdl0.m208408w0()) * 0.6d));
            xdl0.m208325C0(m120334P(), (int) (((double) xdl0.m208408w0()) * 0.4d));
            xdl0.m208329E0(m120334P(), new View.OnClickListener() { // from class: l.cay
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fay.m120326K(this.f80086a, view2);
                }
            });
            m120337S().m4185d(new C16788a());
        }
    }

    /* JADX INFO: renamed from: l.fay$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/fay$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16788a implements ViewPager.InterfaceC0716j {
        public C16788a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            ((say) fay.this.f47757b).m183142f4(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
