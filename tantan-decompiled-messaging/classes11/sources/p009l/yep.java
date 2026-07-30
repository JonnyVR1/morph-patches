package p009l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetTribeFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragPresenter;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragTabBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.member.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.f30;
import l.hmb;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zep;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001f\u0010C\u001a\u00060?R\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b=\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b@\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010Y\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Ll/yep;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;)V", "", "n", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "d", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", "", "pos", "w", "(I)V", "s", "count", "q", "D1", "x1", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "Lv/VImage;", "b", "Lv/VImage;", "k", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", "l", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;", "set_tab_bar", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragTabBar;)V", "_tab_bar", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "m", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Ll/yep$a;", "f", "Lkotlin/Lazy;", "()Ll/yep$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "u", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "h", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "i", "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "v", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetLikersFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", "j", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;", "x", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetTribeFrag;)V", "tribeFrag", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class yep implements s7m<IntlTribeMeetFragPresenter> {

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

    /* JADX INFO: renamed from: l.yep$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/yep$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Ll/yep;Landroidx/fragment/app/Fragment;)V", "", "position", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1329a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ yep f23020j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1329a(@NotNull yep yepVar, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f23020j = yepVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m25325A(int position) {
            if (position == 1) {
                this.f23020j.m25323x(new IntlMeetTribeFrag());
                IntlMeetTribeFrag tribeFrag = this.f23020j.getTribeFrag();
                tribeFrag.getClass();
                return tribeFrag;
            }
            boolean zK = IntlCountryCodeController.k();
            yep yepVar = this.f23020j;
            if (zK) {
                yepVar.m25321v(new IntlMeetLikersFrag());
                IntlMeetLikersFrag meetLikersFrag = this.f23020j.getMeetLikersFrag();
                meetLikersFrag.getClass();
                return meetLikersFrag;
            }
            yepVar.m25320u(new IntlMeetFrag2());
            IntlMeetFrag2 meetFrag = this.f23020j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.yep$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/yep$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1330b extends ViewPager2.i {
        public C1330b() {
        }

        public void onPageSelected(int position) {
            xdl0.M(yep.this.m25315l().f3073h, position == 1);
            yep yepVar = yep.this;
            if (position == 1) {
                yepVar.m25314k().setImageDrawable(App.e.getDrawable(b3c0.W));
            } else {
                yepVar.m25314k().setImageDrawable((Drawable) null);
            }
        }
    }

    public yep(@NotNull IntlTribeMeetFrag intlTribeMeetFrag) {
        intlTribeMeetFrag.getClass();
        this.frag = intlTribeMeetFrag;
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.wep
            public final Object invoke() {
                return yep.m25303b(this.f22072a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m25302a(yep yepVar, Integer num, Boolean bool) {
        IntlMeetTribeFrag intlMeetTribeFrag;
        String str = (num != null && num.intValue() == 1) ? "e_intl_tribe_entrance_click" : "e_intl_meet_entrance_click";
        if (num != null && num.intValue() == 1) {
            yepVar.m25314k().setImageDrawable(App.e.getDrawable(b3c0.W));
        } else {
            yepVar.m25314k().setImageDrawable((Drawable) null);
        }
        zvf0.r(str, "p_intl_meet_view");
        int currentItem = yepVar.m25316m().getCurrentItem();
        if (num != null && num.intValue() == currentItem) {
            return;
        }
        ViewPager2 viewPager2M25316m = yepVar.m25316m();
        num.getClass();
        viewPager2M25316m.j(num.intValue(), false);
        if (num.intValue() == 0) {
            if (IntlCountryCodeController.k()) {
                IntlMeetLikersFrag intlMeetLikersFrag = yepVar.meetLikersFrag;
                if (intlMeetLikersFrag != null) {
                    if (!intlMeetLikersFrag.isAdded()) {
                        intlMeetLikersFrag = null;
                    }
                    if (intlMeetLikersFrag != null) {
                        intlMeetLikersFrag.onHiddenChanged(false);
                    }
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2 = yepVar.meetFrag;
                if (intlMeetFrag2 != null) {
                    if (!intlMeetFrag2.isAdded()) {
                        intlMeetFrag2 = null;
                    }
                    if (intlMeetFrag2 != null) {
                        intlMeetFrag2.onHiddenChanged(false);
                    }
                }
            }
            IntlMeetTribeFrag intlMeetTribeFrag2 = yepVar.tribeFrag;
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
            if (IntlCountryCodeController.k()) {
                IntlMeetLikersFrag intlMeetLikersFrag2 = yepVar.meetLikersFrag;
                if (intlMeetLikersFrag2 != null) {
                    if (!intlMeetLikersFrag2.isAdded()) {
                        intlMeetLikersFrag2 = null;
                    }
                    if (intlMeetLikersFrag2 != null) {
                        intlMeetLikersFrag2.onHiddenChanged(true);
                    }
                }
            } else {
                IntlMeetFrag2 intlMeetFrag3 = yepVar.meetFrag;
                if (intlMeetFrag3 != null) {
                    if (!intlMeetFrag3.isAdded()) {
                        intlMeetFrag3 = null;
                    }
                    if (intlMeetFrag3 != null) {
                        intlMeetFrag3.onHiddenChanged(true);
                    }
                }
            }
            IntlMeetTribeFrag intlMeetTribeFrag3 = yepVar.tribeFrag;
            if (intlMeetTribeFrag3 != null) {
                intlMeetTribeFrag = intlMeetTribeFrag3.isAdded() ? intlMeetTribeFrag3 : null;
                if (intlMeetTribeFrag != null) {
                    intlMeetTribeFrag.onHiddenChanged(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1329a m25303b(yep yepVar) {
        return new C1329a(yepVar, yepVar.frag);
    }

    /* JADX INFO: renamed from: n */
    private final void m25304n() {
        xdl0.X(m25315l(), hmb.n1(this.frag.act()) + t100.h);
        m25315l().m3546q0(this.frag, new f30() { // from class: l.xep
            public final void call(Object obj, Object obj2) {
                yep.m25302a(this.f22581a, (Integer) obj, (Boolean) obj2);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m25305C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m25307c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = zep.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m25312i1(@NotNull IntlTribeMeetFragPresenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C1329a m25309e() {
        return (C1329a) this.adapter.getValue();
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

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m25307c(inflater, parent);
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final IntlMeetTribeFrag getTribeFrag() {
        return this.tribeFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VImage m25314k() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final IntlTribeMeetFragTabBar m25315l() {
        IntlTribeMeetFragTabBar intlTribeMeetFragTabBar = this._tab_bar;
        if (intlTribeMeetFragTabBar != null) {
            return intlTribeMeetFragTabBar;
        }
        Intrinsics.r("_tab_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ViewPager2 m25316m() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m25317p() {
        m25316m().setAdapter(m25309e());
        m25316m().setUserInputEnabled(false);
        m25316m().g(new C1330b());
        m25304n();
    }

    /* JADX INFO: renamed from: q */
    public final void m25318q(int count) {
        String string;
        if (count == 0) {
            string = this.frag.act().getString(R.string.v0);
            string.getClass();
        } else if (count == 1) {
            string = this.frag.act().getString(R.string.w0, count + " ");
            string.getClass();
        } else {
            IntlTribeMeetFrag intlTribeMeetFrag = this.frag;
            if (count < 100) {
                string = intlTribeMeetFrag.act().getString(R.string.x0, count + " ");
                string.getClass();
            } else {
                string = intlTribeMeetFrag.act().getString(R.string.x0, "99+ ");
                string.getClass();
            }
        }
        m25315l().m3551z0(string);
    }

    /* JADX INFO: renamed from: s */
    public final void m25319s() {
        IntlMeetFrag2 intlMeetFrag2;
        m25322w(0);
        m25315l().m3544B0(0);
        if (IntlCountryCodeController.k() || (intlMeetFrag2 = this.meetFrag) == null) {
            return;
        }
        intlMeetFrag2.m3486R4();
    }

    /* JADX INFO: renamed from: u */
    public final void m25320u(@Nullable IntlMeetFrag2 intlMeetFrag2) {
        this.meetFrag = intlMeetFrag2;
    }

    /* JADX INFO: renamed from: v */
    public final void m25321v(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetLikersFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: w */
    public final void m25322w(int pos) {
        IntlMeetTribeFrag intlMeetTribeFrag;
        if (pos == m25316m().getCurrentItem()) {
            return;
        }
        m25316m().j(pos, false);
        if (pos == 0) {
            if (IntlCountryCodeController.k()) {
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
        if (IntlCountryCodeController.k()) {
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
    public final void m25323x(@Nullable IntlMeetTribeFrag intlMeetTribeFrag) {
        this.tribeFrag = intlMeetTribeFrag;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m25306D1() {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25324x1() {
    }
}
