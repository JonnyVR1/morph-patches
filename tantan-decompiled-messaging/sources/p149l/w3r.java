package p149l;

import android.content.Context;
import android.view.View;
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
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\nJ\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000fR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u000fR\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, m87232d2 = {"Ll/w3r;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/d2r;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/d2r;)V", "", BloodType.f38728O, "()V", "p", "Landroid/view/View;", OMSTemplateModeType.view, "m", "(Landroid/view/View;)V", "", "menuType", "P", "(I)V", BLiveStormDanmakuGiftResourceType.f44444l, "", "Ll/u1r;", "memberItems", "Q", "(Ljava/util/List;)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "G", "Lv/VLinear;", "k", "Lv/VLinear;", "L", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Landroid/view/View;", "K", "()Landroid/view/View;", "set_empty", "_empty", "J", "set_content", "_content", "Lcom/google/android/material/tabs/TabLayout;", "n", "Lcom/google/android/material/tabs/TabLayout;", "M", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "Lv/VPagerNoPage;", "o", "Lv/VPagerNoPage;", "N", "()Lv/VPagerNoPage;", "set_viewpager", "(Lv/VPagerNoPage;)V", "_viewpager", "Ll/t1r;", "Ll/t1r;", "getPagerAdapter", "()Ll/t1r;", "setPagerAdapter", "(Ll/t1r;)V", "pagerAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w3r extends LiveMenuDialogHolder<d2r> {

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
    public t1r pagerAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3r(@Nullable Act act, @NotNull d2r d2rVar) {
        super(t6c0.f168527t8, act, d2rVar, j2g0.m139458e(true));
        d2rVar.getClass();
        this.pagerAdapter = new t1r();
    }

    /* JADX INFO: renamed from: I */
    public static final void m201378I(w3r w3rVar, View view) {
        w3rVar.mo71838p();
    }

    /* JADX INFO: renamed from: O */
    private final void m201379O() {
        m201385N().setAdapter(this.pagerAdapter);
        m201385N().m4185d(new C20793a());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m201383L().getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m201380G(View view) {
        x3r.m206945a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m201381J() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m201382K() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VLinear m201383L() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final TabLayout m201384M() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VPagerNoPage m201385N() {
        VPagerNoPage vPagerNoPage = this._viewpager;
        if (vPagerNoPage != null) {
            return vPagerNoPage;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m201386P(int menuType) {
        m71834E();
        m201385N().setCurrentItem(menuType == 2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m201387Q(@NotNull List<u1r> memberItems) {
        memberItems.getClass();
        this.pagerAdapter.m186916q(memberItems);
        if (this.pagerAdapter.getCount() <= 1) {
            m201384M().setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return ((d2r) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m201387Q(((d2r) this.f47757b).m109824a4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@Nullable View view) {
        if (view != null) {
            m201380G(view);
            m71831A(80);
            m71844z(LiveDialogEnum.VOICE_KTV_DIALOG);
            m201384M().setupWithViewPager(m201385N());
            m201379O();
            xdl0.m208325C0(m201381J(), (int) (((double) xdl0.m208408w0()) * 0.8d));
            xdl0.m208325C0(m201382K(), (int) (((double) xdl0.m208408w0()) * 0.2d));
            xdl0.m208329E0(m201382K(), new View.OnClickListener() { // from class: l.v3r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w3r.m201378I(this.f179839a, view2);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo71838p() {
        ((d2r) this.f47757b).m109826d4(1);
        super.mo71838p();
    }

    /* JADX INFO: renamed from: l.w3r$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"l/w3r$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20793a implements ViewPager.InterfaceC0716j {
        public C20793a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            ((d2r) w3r.this.f47757b).m109826d4(position == 0 ? 1 : 2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
