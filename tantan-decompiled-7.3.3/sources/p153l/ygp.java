package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetTribeFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragPresenter;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001f\u0010C\u001a\u00060?R\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b=\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b@\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010Y\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006Z"}, m88121d2 = {"Ll/ygp;", "Ll/iam;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;)V", "", "n", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", "", Constants.INAPP_POSITION, "w", "(I)V", BLiveStormDanmakuGiftResourceType.f45294s, "count", "q", "D1", "x1", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "Lv/VImage;", "b", "Lv/VImage;", "k", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", "set_tab_bar", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;)V", "_tab_bar", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "m", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Ll/ygp$a;", "f", "Lkotlin/Lazy;", "()Ll/ygp$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "u", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "h", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetLikersFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", "j", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", BaseSei.f14624X, "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;)V", "tribeFrag", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ygp implements iam<IntlTribeMeetFragPresenter> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlTribeMeetFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _bg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlTribeMeetFragTabBar _tab_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public IntlTribeMeetFragPresenter presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlMeetFrag2 meetFrag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlMeetLikersFrag meetLikersFrag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public IntlMeetTribeFrag tribeFrag;

    /* JADX INFO: renamed from: l.ygp$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/ygp$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Ll/ygp;Landroidx/fragment/app/Fragment;)V", "", "position", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C21594a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ygp f199864j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21594a(@NotNull ygp ygpVar, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f199864j = ygpVar;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            if (position == 1) {
                this.f199864j.m215870x(new IntlMeetTribeFrag());
                IntlMeetTribeFrag tribeFrag = this.f199864j.getTribeFrag();
                tribeFrag.getClass();
                return tribeFrag;
            }
            boolean zM29114k = IntlCountryCodeController.m29114k();
            ygp ygpVar = this.f199864j;
            if (zM29114k) {
                ygpVar.m215868v(new IntlMeetLikersFrag());
                IntlMeetLikersFrag meetLikersFrag = this.f199864j.getMeetLikersFrag();
                meetLikersFrag.getClass();
                return meetLikersFrag;
            }
            ygpVar.m215867u(new IntlMeetFrag2());
            IntlMeetFrag2 meetFrag = this.f199864j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.ygp$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/ygp$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21595b extends ViewPager2.AbstractC0742i {
        public C21595b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            bnl0.m105524M(ygp.this.m215862l().f25037h, position == 1);
            ygp ygpVar = ygp.this;
            if (position == 1) {
                ygpVar.m215861k().setImageDrawable(App.f16088e.getDrawable(gbc0.f103225W));
            } else {
                ygpVar.m215861k().setImageDrawable(null);
            }
        }
    }

    public ygp(@NotNull IntlTribeMeetFrag intlTribeMeetFrag) {
        intlTribeMeetFrag.getClass();
        this.frag = intlTribeMeetFrag;
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wgp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ygp.m215852b(this.f189000a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m215851a(ygp ygpVar, Integer num, Boolean bool) {
        IntlMeetTribeFrag intlMeetTribeFrag;
        String str = (num != null && num.intValue() == 1) ? "e_intl_tribe_entrance_click" : "e_intl_meet_entrance_click";
        if (num != null && num.intValue() == 1) {
            ygpVar.m215861k().setImageDrawable(App.f16088e.getDrawable(gbc0.f103225W));
        } else {
            ygpVar.m215861k().setImageDrawable(null);
        }
        i4g0.m138520r(str, "p_intl_meet_view");
        int currentItem = ygpVar.m215863m().getCurrentItem();
        if (num != null && num.intValue() == currentItem) {
            return;
        }
        ViewPager2 viewPager2M215863m = ygpVar.m215863m();
        num.getClass();
        viewPager2M215863m.m4252j(num.intValue(), false);
        if (num.intValue() == 0) {
            if (IntlCountryCodeController.m29114k()) {
                IntlMeetLikersFrag intlMeetLikersFrag = ygpVar.meetLikersFrag;
                if (intlMeetLikersFrag != null) {
                    if (!intlMeetLikersFrag.isAdded()) {
                        intlMeetLikersFrag = null;
                    }
                    if (intlMeetLikersFrag != null) {
                        intlMeetLikersFrag.onHiddenChanged(false);
                    }
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2 = ygpVar.meetFrag;
                if (intlMeetFrag2 != null) {
                    if (!intlMeetFrag2.isAdded()) {
                        intlMeetFrag2 = null;
                    }
                    if (intlMeetFrag2 != null) {
                        intlMeetFrag2.onHiddenChanged(false);
                    }
                }
            }
            IntlMeetTribeFrag intlMeetTribeFrag2 = ygpVar.tribeFrag;
            if (intlMeetTribeFrag2 != null) {
                intlMeetTribeFrag = intlMeetTribeFrag2.isAdded() ? intlMeetTribeFrag2 : null;
                if (intlMeetTribeFrag != null) {
                    intlMeetTribeFrag.onHiddenChanged(true);
                    return;
                }
                return;
            }
            return;
        }
        if (num.intValue() == 1) {
            if (IntlCountryCodeController.m29114k()) {
                IntlMeetLikersFrag intlMeetLikersFrag2 = ygpVar.meetLikersFrag;
                if (intlMeetLikersFrag2 != null) {
                    if (!intlMeetLikersFrag2.isAdded()) {
                        intlMeetLikersFrag2 = null;
                    }
                    if (intlMeetLikersFrag2 != null) {
                        intlMeetLikersFrag2.onHiddenChanged(true);
                    }
                }
            } else {
                IntlMeetFrag2 intlMeetFrag3 = ygpVar.meetFrag;
                if (intlMeetFrag3 != null) {
                    if (!intlMeetFrag3.isAdded()) {
                        intlMeetFrag3 = null;
                    }
                    if (intlMeetFrag3 != null) {
                        intlMeetFrag3.onHiddenChanged(true);
                    }
                }
            }
            IntlMeetTribeFrag intlMeetTribeFrag3 = ygpVar.tribeFrag;
            if (intlMeetTribeFrag3 != null) {
                intlMeetTribeFrag = intlMeetTribeFrag3.isAdded() ? intlMeetTribeFrag3 : null;
                if (intlMeetTribeFrag != null) {
                    intlMeetTribeFrag.onHiddenChanged(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C21594a m215852b(ygp ygpVar) {
        return new C21594a(ygpVar, ygpVar.frag);
    }

    /* JADX INFO: renamed from: n */
    private final void m215853n() {
        bnl0.m105540X(m215862l(), vnb.m201954n1(this.frag.act()) + qa00.f156321h);
        m215862l().m40491q0(this.frag, new z20() { // from class: l.xgp
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                ygp.m215851a(this.f194218a, (Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m215855c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM219653b = zgp.m219653b(this, inflater, parent);
        viewM219653b.getClass();
        return viewM219653b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull IntlTribeMeetFragPresenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C21594a m215857e() {
        return (C21594a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final IntlMeetFrag2 getMeetFrag() {
        return this.meetFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMeetLikersFrag getMeetLikersFrag() {
        return this.meetLikersFrag;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m215855c(inflater, parent);
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final IntlMeetTribeFrag getTribeFrag() {
        return this.tribeFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VImage m215861k() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final IntlTribeMeetFragTabBar m215862l() {
        IntlTribeMeetFragTabBar intlTribeMeetFragTabBar = this._tab_bar;
        if (intlTribeMeetFragTabBar != null) {
            return intlTribeMeetFragTabBar;
        }
        Intrinsics.m88391r("_tab_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ViewPager2 m215863m() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m215864p() {
        m215863m().setAdapter(m215857e());
        m215863m().setUserInputEnabled(false);
        m215863m().m4249g(new C21595b());
        m215853n();
    }

    /* JADX INFO: renamed from: q */
    public final void m215865q(int count) {
        String string;
        if (count == 0) {
            string = this.frag.act().getString(R$string.f21433v0);
            string.getClass();
        } else if (count == 1) {
            string = this.frag.act().getString(R$string.f21436w0, count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            string.getClass();
        } else {
            IntlTribeMeetFrag intlTribeMeetFrag = this.frag;
            if (count < 100) {
                string = intlTribeMeetFrag.act().getString(R$string.f21439x0, count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                string.getClass();
            } else {
                string = intlTribeMeetFrag.act().getString(R$string.f21439x0, "99+ ");
                string.getClass();
            }
        }
        m215862l().m40496z0(string);
    }

    /* JADX INFO: renamed from: s */
    public final void m215866s() {
        IntlMeetFrag2 intlMeetFrag2;
        m215869w(0);
        m215862l().m40489B0(0);
        if (IntlCountryCodeController.m29114k() || (intlMeetFrag2 = this.meetFrag) == null) {
            return;
        }
        intlMeetFrag2.m40439R4();
    }

    /* JADX INFO: renamed from: u */
    public final void m215867u(@Nullable IntlMeetFrag2 intlMeetFrag2) {
        this.meetFrag = intlMeetFrag2;
    }

    /* JADX INFO: renamed from: v */
    public final void m215868v(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetLikersFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: w */
    public final void m215869w(int pos) {
        IntlMeetTribeFrag intlMeetTribeFrag;
        if (pos == m215863m().getCurrentItem()) {
            return;
        }
        m215863m().m4252j(pos, false);
        if (pos == 0) {
            if (IntlCountryCodeController.m29114k()) {
                IntlMeetLikersFrag intlMeetLikersFrag = this.meetLikersFrag;
                if (intlMeetLikersFrag != null) {
                    if (!intlMeetLikersFrag.isAdded()) {
                        intlMeetLikersFrag = null;
                    }
                    if (intlMeetLikersFrag != null) {
                        intlMeetLikersFrag.onHiddenChanged(false);
                    }
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2 = this.meetFrag;
                if (intlMeetFrag2 != null) {
                    if (!intlMeetFrag2.isAdded()) {
                        intlMeetFrag2 = null;
                    }
                    if (intlMeetFrag2 != null) {
                        intlMeetFrag2.onHiddenChanged(false);
                    }
                }
            }
            IntlMeetTribeFrag intlMeetTribeFrag2 = this.tribeFrag;
            if (intlMeetTribeFrag2 != null) {
                intlMeetTribeFrag = intlMeetTribeFrag2.isAdded() ? intlMeetTribeFrag2 : null;
                if (intlMeetTribeFrag != null) {
                    intlMeetTribeFrag.onHiddenChanged(true);
                    return;
                }
                return;
            }
            return;
        }
        if (pos != 1) {
            return;
        }
        if (IntlCountryCodeController.m29114k()) {
            IntlMeetLikersFrag intlMeetLikersFrag2 = this.meetLikersFrag;
            if (intlMeetLikersFrag2 != null) {
                if (!intlMeetLikersFrag2.isAdded()) {
                    intlMeetLikersFrag2 = null;
                }
                if (intlMeetLikersFrag2 != null) {
                    intlMeetLikersFrag2.onHiddenChanged(true);
                }
            }
        } else {
            IntlMeetFrag2 intlMeetFrag3 = this.meetFrag;
            if (intlMeetFrag3 != null) {
                if (!intlMeetFrag3.isAdded()) {
                    intlMeetFrag3 = null;
                }
                if (intlMeetFrag3 != null) {
                    intlMeetFrag3.onHiddenChanged(true);
                }
            }
        }
        IntlMeetTribeFrag intlMeetTribeFrag3 = this.tribeFrag;
        if (intlMeetTribeFrag3 != null) {
            intlMeetTribeFrag = intlMeetTribeFrag3.isAdded() ? intlMeetTribeFrag3 : null;
            if (intlMeetTribeFrag != null) {
                intlMeetTribeFrag.onHiddenChanged(false);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m215870x(@Nullable IntlMeetTribeFrag intlMeetTribeFrag) {
        this.tribeFrag = intlMeetTribeFrag;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m215854D1() {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m215871x1() {
    }
}
