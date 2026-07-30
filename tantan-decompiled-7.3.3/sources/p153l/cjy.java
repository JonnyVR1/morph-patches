package p153l;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ'\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0014¢\u0006\u0004\b&\u0010\u0017J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\fR\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u0011¨\u0006X"}, m88121d2 = {"Ll/cjy;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/pjy;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/pjy;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "I", "(Landroid/view/View;)V", "", "Ll/sjy;", "memberItems", "W", "(Ljava/util/List;)V", "", "defaultIndex", "", "isOnPage", "L", "(IZ)V", "showSettleRedPoint", "showMicRedPoint", "X", "(ZZ)V", "U", "()V", "m", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "count", p7f.GPS_MEASUREMENT_INTERRUPTED, "(IZLcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;)V", "indexMenuType", "isShow", "M", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "Lv/VLinear;", "k", "Lv/VLinear;", "Q", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "P", "()Landroid/view/View;", "set_empty", "_empty", BloodType.f39576O, "set_content", "_content", "Lcom/google/android/material/tabs/TabLayout;", "n", "Lcom/google/android/material/tabs/TabLayout;", "R", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "Lv/VPagerNoPage;", "o", "Lv/VPagerNoPage;", p7f.LATITUDE_SOUTH, "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/rjy;", "p", "Ll/rjy;", "getPagerAdapter", "()Ll/rjy;", "setPagerAdapter", "(Ll/rjy;)V", "pagerAdapter", "q", "Ljava/util/List;", "N", "()Ljava/util/List;", p7f.GPS_DIRECTION_TRUE, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cjy extends LiveMenuDialogHolder<pjy> {

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
    public rjy pagerAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public List<sjy> memberItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjy(@Nullable Act act, @NotNull pjy pjyVar) {
        super(yec0.f198899R3, act, pjyVar, qag0.m175923d(0.3f, true));
        pjyVar.getClass();
        this.pagerAdapter = new rjy();
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m110288F(sjy sjyVar) {
        return Boolean.valueOf(sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() > 1);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m110290H(int i, sjy sjyVar) {
        return Boolean.valueOf(sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != i);
    }

    /* JADX INFO: renamed from: K */
    public static final void m110292K(cjy cjyVar, View view) {
        cjyVar.mo73021p();
    }

    /* JADX INFO: renamed from: U */
    private final void m110293U() {
        m110303S().setAdapter(this.pagerAdapter);
    }

    /* JADX INFO: renamed from: W */
    private final void m110294W(List<sjy> memberItems) {
        m110304T(memberItems);
        this.pagerAdapter.m181764q(memberItems);
        if (this.pagerAdapter.getCount() <= 1) {
            m110302R().setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m110301Q().getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m110295I(View view) {
        qjy.m176905a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m110296L(final int defaultIndex, boolean isOnPage) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m110298N());
        if (isOnPage) {
            jyb.m147503d0(arrayList, new qcj() { // from class: l.ajy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return cjy.m110290H(defaultIndex, (sjy) obj);
                }
            });
        } else {
            jyb.m147503d0(arrayList, new qcj() { // from class: l.bjy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return cjy.m110288F((sjy) obj);
                }
            });
        }
        if (!isOnPage) {
            T t = this.f48605b;
            t.getClass();
            if (i9o0.m139137h(t)) {
                this.pagerAdapter.m181764q(m110298N());
                m110303S().setCurrentItem(defaultIndex);
                return;
            }
        }
        this.pagerAdapter.m181764q(arrayList);
        m110303S().setCurrentItem(((sjy) arrayList.get(0)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
    }

    /* JADX INFO: renamed from: M */
    public final void m110297M(int indexMenuType, boolean isShow) {
        View customView;
        m110302R();
        int i = 0;
        for (Object obj : m110298N()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sjy sjyVar = (sjy) obj;
            TabLayout.Tab tabAt = m110302R().getTabAt(i);
            View viewFindViewById = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : customView.findViewById(mdc0.f136315u6);
            if (viewFindViewById != null && sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == indexMenuType) {
                bnl0.m105524M(viewFindViewById, isShow);
            }
            i = i2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final List<sjy> m110298N() {
        List<sjy> list = this.memberItems;
        if (list != null) {
            return list;
        }
        Intrinsics.m88391r("memberItems");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m110299O() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m110300P() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VLinear m110301Q() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TabLayout m110302R() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VPagerNoPage m110303S() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m110304T(@NotNull List<sjy> list) {
        list.getClass();
        this.memberItems = list;
    }

    /* JADX INFO: renamed from: V */
    public final void m110305V(int defaultIndex, boolean isOnPage, @Nullable BLiveVoiceAdminPanelCounter count) {
        m73017E();
        m110293U();
        m110296L(defaultIndex, isOnPage);
        if (count == null) {
            m110306X(false, false);
        } else {
            m110306X(count.applySettleRedDot > 0, count.applyCallRedDot > 0);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m110306X(boolean showSettleRedPoint, boolean showMicRedPoint) {
        View customView;
        View customView2;
        int i = 0;
        for (Object obj : m110298N()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sjy sjyVar = (sjy) obj;
            TabLayout.Tab tabAt = m110302R().getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(yec0.f198833L9);
            }
            View viewFindViewById = null;
            TextView textView = (tabAt == null || (customView2 = tabAt.getCustomView()) == null) ? null : (TextView) customView2.findViewById(mdc0.f136125a7);
            if (textView != null) {
                textView.setText(tabAt != null ? tabAt.getText() : null);
            }
            if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
                viewFindViewById = customView.findViewById(mdc0.f136315u6);
            }
            if (viewFindViewById != null) {
                if (showSettleRedPoint && sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 2) {
                    bnl0.m105524M(viewFindViewById, showSettleRedPoint);
                } else if (showMicRedPoint && sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 3) {
                    bnl0.m105524M(viewFindViewById, showMicRedPoint);
                } else {
                    bnl0.m105524M(viewFindViewById, false);
                }
            }
            i = i2;
        }
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return ((pjy) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m110294W(((pjy) this.f48605b).m172556e4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        if (view != null) {
            m110295I(view);
            m73014A(80);
            m73027z(LiveDialogEnum.VOICE_MEMBER_MANAGER);
            m110302R().setupWithViewPager(m110303S());
            bnl0.m105505C0(m110299O(), (int) (((double) bnl0.m105588w0()) * 0.6d));
            bnl0.m105505C0(m110300P(), (int) (((double) bnl0.m105588w0()) * 0.4d));
            bnl0.m105509E0(m110300P(), new View.OnClickListener() { // from class: l.ziy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cjy.m110292K(this.f204629a, view2);
                }
            });
            m110303S().m4187d(new C16291a());
        }
    }

    /* JADX INFO: renamed from: l.cjy$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/cjy$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16291a implements ViewPager.InterfaceC0718j {
        public C16291a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            ((pjy) cjy.this.f48605b).m172557f4(position);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
