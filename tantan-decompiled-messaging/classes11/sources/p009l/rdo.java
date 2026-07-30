package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFragTabBar;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.member.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.f30;
import l.hmb;
import l.s7m;
import l.sdo;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\tJ\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u00106R\u001f\u0010;\u001a\u000607R\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R$\u0010B\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006K"}, d2 = {"Ll/rdo;", "Ll/s7m;", "Ll/ldo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;)V", "", "l", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "d", "(Ll/ldo;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "m", "", "count", "n", "(I)V", "pos", "q", "D1", "x1", "u", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFragTabBar;", "b", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFragTabBar;", "j", "()Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFragTabBar;", "set_tab_bar", "(Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFragTabBar;)V", "_tab_bar", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "k", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "Ll/ldo;", "Ll/rdo$a;", "e", "Lkotlin/Lazy;", "()Ll/rdo$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "f", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "p", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "i", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "s", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "visitorFrag", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class rdo implements s7m<ldo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public IntlMeetFragTabBar _tab_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ldo presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public IntlMeetLikersFrag meetFrag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlMeetVisitorFrag visitorFrag;

    /* JADX INFO: renamed from: l.rdo$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/rdo$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Ll/rdo;Landroidx/fragment/app/Fragment;)V", "", "position", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1175a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ rdo f19778j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1175a(@NotNull rdo rdoVar, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f19778j = rdoVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m21620A(int position) {
            rdo rdoVar = this.f19778j;
            if (position == 1) {
                rdoVar.m21617s(new IntlMeetVisitorFrag());
                IntlMeetVisitorFrag visitorFrag = this.f19778j.getVisitorFrag();
                visitorFrag.getClass();
                return visitorFrag;
            }
            rdoVar.m21615p(new IntlMeetLikersFrag());
            IntlMeetLikersFrag meetFrag = this.f19778j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        public int getItemCount() {
            return 2;
        }
    }

    public rdo(@NotNull IntlMeetFrag intlMeetFrag) {
        intlMeetFrag.getClass();
        this.frag = intlMeetFrag;
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.pdo
            public final Object invoke() {
                return rdo.m21600a(this.f18495a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C1175a m21600a(rdo rdoVar) {
        return new C1175a(rdoVar, rdoVar.frag);
    }

    /* JADX INFO: renamed from: b */
    public static void m21601b(rdo rdoVar, Integer num, Boolean bool) {
        IntlMeetVisitorFrag intlMeetVisitorFrag;
        zvf0.r((num != null && num.intValue() == 1) ? "e_intl_meet_tab_visitor" : "e_intl_meet_tab_see", "p_intl_meet_view");
        int currentItem = rdoVar.m21612k().getCurrentItem();
        if (num != null && num.intValue() == currentItem) {
            return;
        }
        ViewPager2 viewPager2M21612k = rdoVar.m21612k();
        num.getClass();
        viewPager2M21612k.j(num.intValue(), false);
        if (num.intValue() == 0) {
            IntlMeetLikersFrag intlMeetLikersFrag = rdoVar.meetFrag;
            if (intlMeetLikersFrag != null) {
                if (!intlMeetLikersFrag.isAdded()) {
                    intlMeetLikersFrag = null;
                }
                if (intlMeetLikersFrag != null) {
                    intlMeetLikersFrag.onHiddenChanged(false);
                }
            }
            IntlMeetVisitorFrag intlMeetVisitorFrag2 = rdoVar.visitorFrag;
            if (intlMeetVisitorFrag2 != null) {
                intlMeetVisitorFrag = intlMeetVisitorFrag2.isAdded() ? intlMeetVisitorFrag2 : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(true);
                    return;
                }
                return;
            }
            return;
        }
        if (num.intValue() == 1) {
            IntlMeetLikersFrag intlMeetLikersFrag2 = rdoVar.meetFrag;
            if (intlMeetLikersFrag2 != null) {
                if (!intlMeetLikersFrag2.isAdded()) {
                    intlMeetLikersFrag2 = null;
                }
                if (intlMeetLikersFrag2 != null) {
                    intlMeetLikersFrag2.onHiddenChanged(true);
                }
            }
            IntlMeetVisitorFrag intlMeetVisitorFrag3 = rdoVar.visitorFrag;
            if (intlMeetVisitorFrag3 != null) {
                intlMeetVisitorFrag = intlMeetVisitorFrag3.isAdded() ? intlMeetVisitorFrag3 : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m21602l() {
        xdl0.X(m21611j(), hmb.n1(this.frag.act()) + t100.h);
        m21611j().m3406w(this.frag, new f30() { // from class: l.qdo
            public final void call(Object obj, Object obj2) {
                rdo.m21601b(this.f19165a, (Integer) obj, (Boolean) obj2);
            }
        });
        if (IntlCountryCodeController.k()) {
            xdl0.M(m21611j().f2981c, false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m21603C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m21605c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = sdo.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m21610i1(@NotNull ldo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C1175a m21607e() {
        return (C1175a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final IntlMeetLikersFrag getMeetFrag() {
        return this.meetFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMeetVisitorFrag getVisitorFrag() {
        return this.visitorFrag;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m21605c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final IntlMeetFragTabBar m21611j() {
        IntlMeetFragTabBar intlMeetFragTabBar = this._tab_bar;
        if (intlMeetFragTabBar != null) {
            return intlMeetFragTabBar;
        }
        Intrinsics.r("_tab_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ViewPager2 m21612k() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m21613m() {
        m21612k().setAdapter(m21607e());
        m21612k().setUserInputEnabled(false);
        m21602l();
    }

    /* JADX INFO: renamed from: n */
    public final void m21614n(int count) {
        String string;
        if (count == 0) {
            string = this.frag.act().getString(R.string.v0);
            string.getClass();
        } else if (count == 1) {
            string = this.frag.act().getString(R.string.w0, count + " ");
            string.getClass();
        } else {
            IntlMeetFrag intlMeetFrag = this.frag;
            if (count < 100) {
                string = intlMeetFrag.act().getString(R.string.x0, count + " ");
                string.getClass();
            } else {
                string = intlMeetFrag.act().getString(R.string.x0, "99+ ");
                string.getClass();
            }
        }
        m21611j().m3402C(string);
    }

    /* JADX INFO: renamed from: p */
    public final void m21615p(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: q */
    public final void m21616q(int pos) {
        IntlMeetVisitorFrag intlMeetVisitorFrag;
        if (pos == m21612k().getCurrentItem()) {
            return;
        }
        m21612k().j(pos, false);
        if (pos == 0) {
            IntlMeetLikersFrag intlMeetLikersFrag = this.meetFrag;
            if (intlMeetLikersFrag != null) {
                if (!intlMeetLikersFrag.isAdded()) {
                    intlMeetLikersFrag = null;
                }
                if (intlMeetLikersFrag != null) {
                    intlMeetLikersFrag.onHiddenChanged(false);
                }
            }
            IntlMeetVisitorFrag intlMeetVisitorFrag2 = this.visitorFrag;
            if (intlMeetVisitorFrag2 != null) {
                intlMeetVisitorFrag = intlMeetVisitorFrag2.isAdded() ? intlMeetVisitorFrag2 : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(true);
                    return;
                }
                return;
            }
            return;
        }
        if (pos != 1) {
            return;
        }
        IntlMeetLikersFrag intlMeetLikersFrag2 = this.meetFrag;
        if (intlMeetLikersFrag2 != null) {
            if (!intlMeetLikersFrag2.isAdded()) {
                intlMeetLikersFrag2 = null;
            }
            if (intlMeetLikersFrag2 != null) {
                intlMeetLikersFrag2.onHiddenChanged(true);
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag3 = this.visitorFrag;
        if (intlMeetVisitorFrag3 != null) {
            intlMeetVisitorFrag = intlMeetVisitorFrag3.isAdded() ? intlMeetVisitorFrag3 : null;
            if (intlMeetVisitorFrag != null) {
                intlMeetVisitorFrag.onHiddenChanged(false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m21617s(@Nullable IntlMeetVisitorFrag intlMeetVisitorFrag) {
        this.visitorFrag = intlMeetVisitorFrag;
    }

    /* JADX INFO: renamed from: u */
    public final void m21618u(int count) {
        m21611j().setNewVisitorCount(count);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m21604D1() {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21619x1() {
    }
}
