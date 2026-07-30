package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsFrag;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, m88121d2 = {"Ll/ka20;", "Ll/iam;", "Ll/ha20;", "Ll/jn50;", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/ha20;)V", "inflateView", "r", "()V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/mvc0;", "refreshLayout", "w2", "(Ll/mvc0;)V", "", "Lcom/p1/mobile/putong/data/Visitor;", SchemeKey.visitors, "", "next", "q", "(Ljava/util/List;Ljava/lang/String;)V", "", "oDiamondExpired", "p", "(Z)V", "", "Ll/q920;", "e", "()Ljava/util/List;", "f", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "Lv/VPullDownRefreshLayout;", "b", "Lv/VPullDownRefreshLayout;", "n", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/LinearLayout;", "set_get_privilege", "(Landroid/widget/LinearLayout;)V", "_get_privilege", "Ll/ha20;", "Ll/z920;", "g", "Ll/z920;", "adapter", "h", "Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ka20 implements iam<ha20>, jn50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MyVisitorsFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VPullDownRefreshLayout _swipe_refresh;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _privilege;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LinearLayout _get_privilege;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ha20 presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public z920 adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String next;

    public ka20(@NotNull MyVisitorsFrag myVisitorsFrag) {
        myVisitorsFrag.getClass();
        this.frag = myVisitorsFrag;
    }

    /* JADX INFO: renamed from: a */
    public static void m148924a(ka20 ka20Var, View view) {
        i4g0.m138520r("e_visitor_unlock", "p_my_visitor_isee");
        CoreModule.m30933P().m143405a().mo34621wh(ka20Var.frag.act(), "p_navigation_visit,isee", null, null, null, Privilege.visitor_hide_footprint);
    }

    /* JADX INFO: renamed from: b */
    public static void m148925b(ka20 ka20Var, mvc0 mvc0Var) {
        mvc0Var.getClass();
        ha20 ha20Var = ka20Var.presenter;
        if (ha20Var != null) {
            ha20Var.m134123j0(false, ka20Var.next);
        }
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
    public final View m148926c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM153469b = la20.m153469b(this, inflater, parent);
        viewM153469b.getClass();
        return viewM153469b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull ha20 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final List<q920> m148928e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q920(1, null));
        arrayList.add(new q920(3, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List<q920> m148929f(List<? extends Visitor> visitors, String next) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q920(1, null));
        Iterator<? extends Visitor> it = visitors.iterator();
        while (it.hasNext()) {
            arrayList.add(new q920(0, it.next()));
        }
        if (TextUtils.isEmpty(next)) {
            arrayList.add(new q920(2, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LinearLayout m148930i() {
        LinearLayout linearLayout = this._get_privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m148926c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VPullUpRecyclerView m148931l() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m148932m() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VPullDownRefreshLayout m148933n() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_swipe_refresh");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m148934p(boolean oDiamondExpired) {
        if (oDiamondExpired) {
            i4g0.m138526x("e_visitor_unlock", "p_my_visitor_isee");
        }
        bnl0.m105524M(m148932m(), oDiamondExpired);
        bnl0.m105537U(m148933n(), txq.m193530c(oDiamondExpired ? 100 : 0));
    }

    /* JADX INFO: renamed from: q */
    public final void m148935q(@NotNull List<? extends Visitor> visitors, @Nullable String next) {
        visitors.getClass();
        this.next = next;
        m148933n().m225021t();
        m148933n().m225016o();
        if (TextUtils.isEmpty(next)) {
            m148933n().m225001G(false);
        } else {
            m148933n().m225001G(true);
        }
        boolean zM147479J = jyb.m147479J(visitors);
        z920 z920Var = this.adapter;
        if (zM147479J) {
            if (z920Var == null) {
                Intrinsics.m88391r("adapter");
                z920Var = null;
            }
            z920Var.m219046G(m148928e());
            return;
        }
        if (z920Var == null) {
            Intrinsics.m88391r("adapter");
            z920Var = null;
        }
        z920Var.m219046G(m148929f(visitors, next));
    }

    /* JADX INFO: renamed from: r */
    public final void m148936r() {
        bnl0.m105509E0(m148930i(), new View.OnClickListener() { // from class: l.ia20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ka20.m148924a(this.f113542a, view);
            }
        });
        m148933n().mo224405O(this);
        m148933n().mo224404M(new tm50() { // from class: l.ja20
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                ka20.m148925b(this.f118934a, mvc0Var);
            }
        });
        Act act = this.frag.act();
        act.getClass();
        this.adapter = new z920(act);
        VPullUpRecyclerView vPullUpRecyclerViewM148931l = m148931l();
        z920 z920Var = this.adapter;
        if (z920Var == null) {
            Intrinsics.m88391r("adapter");
            z920Var = null;
        }
        vPullUpRecyclerViewM148931l.setAdapter(z920Var);
        m148931l().setLayoutManager(new LinearLayoutManager(this.frag.act()));
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NotNull mvc0 refreshLayout) {
        refreshLayout.getClass();
        ha20 ha20Var = this.presenter;
        if (ha20Var != null) {
            ha20Var.m134123j0(true, "");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
