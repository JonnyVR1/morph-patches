package p153l;

import android.content.Context;
import android.view.View;
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
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\nJ\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000fR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u000fR\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, m88121d2 = {"Ll/x5r;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/e4r;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/e4r;)V", "", BloodType.f39576O, "()V", "p", "Landroid/view/View;", OMSTemplateModeType.view, "m", "(Landroid/view/View;)V", "", "menuType", "P", "(I)V", BLiveStormDanmakuGiftResourceType.f45292l, "", "Ll/v3r;", "memberItems", "Q", "(Ljava/util/List;)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "G", "Lv/VLinear;", "k", "Lv/VLinear;", "L", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "K", "()Landroid/view/View;", "set_empty", "_empty", "J", "set_content", "_content", "Lcom/google/android/material/tabs/TabLayout;", "n", "Lcom/google/android/material/tabs/TabLayout;", "M", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "Lv/VPagerNoPage;", "o", "Lv/VPagerNoPage;", "N", "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/u3r;", "Ll/u3r;", "getPagerAdapter", "()Ll/u3r;", "setPagerAdapter", "(Ll/u3r;)V", "pagerAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x5r extends LiveMenuDialogHolder<e4r> {

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
    public u3r pagerAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5r(@Nullable Act act, @NotNull e4r e4rVar) {
        super(yec0.f199259t8, act, e4rVar, qag0.m175924e(true));
        e4rVar.getClass();
        this.pagerAdapter = new u3r();
    }

    /* JADX INFO: renamed from: I */
    public static final void m209418I(x5r x5rVar, View view) {
        x5rVar.mo73021p();
    }

    /* JADX INFO: renamed from: O */
    private final void m209419O() {
        m209425N().setAdapter(this.pagerAdapter);
        m209425N().m4187d(new C21255a());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m209423L().getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m209420G(View view) {
        y5r.m214314a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m209421J() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m209422K() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VLinear m209423L() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final TabLayout m209424M() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VPagerNoPage m209425N() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m209426P(int menuType) {
        m73017E();
        m209425N().setCurrentItem(menuType == 2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m209427Q(@NotNull List<v3r> memberItems) {
        memberItems.getClass();
        this.pagerAdapter.m194387q(memberItems);
        if (this.pagerAdapter.getCount() <= 1) {
            m209424M().setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return ((e4r) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m209427Q(((e4r) this.f48605b).m119468a4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        if (view != null) {
            m209420G(view);
            m73014A(80);
            m73027z(LiveDialogEnum.VOICE_KTV_DIALOG);
            m209424M().setupWithViewPager(m209425N());
            m209419O();
            bnl0.m105505C0(m209421J(), (int) (((double) bnl0.m105588w0()) * 0.8d));
            bnl0.m105505C0(m209422K(), (int) (((double) bnl0.m105588w0()) * 0.2d));
            bnl0.m105509E0(m209422K(), new View.OnClickListener() { // from class: l.w5r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x5r.m209418I(this.f187542a, view2);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo73021p() {
        ((e4r) this.f48605b).m119470d4(1);
        super.mo73021p();
    }

    /* JADX INFO: renamed from: l.x5r$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/x5r$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21255a implements ViewPager.InterfaceC0718j {
        public C21255a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            ((e4r) x5r.this.f48605b).m119470d4(position == 0 ? 1 : 2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
