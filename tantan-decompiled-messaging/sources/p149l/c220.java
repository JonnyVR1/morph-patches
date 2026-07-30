package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsFrag;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, m87232d2 = {"Ll/c220;", "Ll/s7m;", "Ll/z120;", "Ll/df50;", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/z120;)V", "inflateView", "r", "()V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "", "Lcom/p1/mobile/putong/data/Visitor;", SchemeKey.visitors, "", "next", "q", "(Ljava/util/List;Ljava/lang/String;)V", "", "oDiamondExpired", "p", "(Z)V", "", "Ll/i120;", "e", "()Ljava/util/List;", "f", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "Lv/VPullDownRefreshLayout;", "b", "Lv/VPullDownRefreshLayout;", "n", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/LinearLayout;", "set_get_privilege", "(Landroid/widget/LinearLayout;)V", "_get_privilege", "Ll/z120;", "Ll/r120;", "g", "Ll/r120;", "adapter", "h", "Ljava/lang/String;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c220 implements s7m<z120>, df50 {

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
    public z120 presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public r120 adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String next;

    public c220(@NotNull MyVisitorsFrag myVisitorsFrag) {
        myVisitorsFrag.getClass();
        this.frag = myVisitorsFrag;
    }

    /* JADX INFO: renamed from: a */
    public static void m104891a(c220 c220Var, View view) {
        zvf0.m220396r("e_visitor_unlock", "p_my_visitor_isee");
        CoreModule.m29935P().m94651a().mo33618wh(c220Var.frag.act(), "p_navigation_visit,isee", null, null, null, Privilege.visitor_hide_footprint);
    }

    /* JADX INFO: renamed from: b */
    public static void m104892b(c220 c220Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        z120 z120Var = c220Var.presenter;
        if (z120Var != null) {
            z120Var.m216785j0(false, c220Var.next);
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m104893c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM109706b = d220.m109706b(this, inflater, parent);
        viewM109706b.getClass();
        return viewM109706b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull z120 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final List<i120> m104895e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i120(1, null));
        arrayList.add(new i120(3, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List<i120> m104896f(List<? extends Visitor> visitors, String next) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i120(1, null));
        Iterator<? extends Visitor> it = visitors.iterator();
        while (it.hasNext()) {
            arrayList.add(new i120(0, it.next()));
        }
        if (TextUtils.isEmpty(next)) {
            arrayList.add(new i120(2, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LinearLayout m104897i() {
        LinearLayout linearLayout = this._get_privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m104893c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VPullUpRecyclerView m104898l() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m104899m() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VPullDownRefreshLayout m104900n() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m87502r("_swipe_refresh");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m104901p(boolean oDiamondExpired) {
        if (oDiamondExpired) {
            zvf0.m220402x("e_visitor_unlock", "p_my_visitor_isee");
        }
        xdl0.m208344M(m104899m(), oDiamondExpired);
        xdl0.m208357U(m104900n(), svq.m186103c(oDiamondExpired ? 100 : 0));
    }

    /* JADX INFO: renamed from: q */
    public final void m104902q(@NotNull List<? extends Visitor> visitors, @Nullable String next) {
        visitors.getClass();
        this.next = next;
        m104900n().m223775t();
        m104900n().m223770o();
        if (TextUtils.isEmpty(next)) {
            m104900n().m223755G(false);
        } else {
            m104900n().m223755G(true);
        }
        boolean zM200296J = vwb.m200296J(visitors);
        r120 r120Var = this.adapter;
        if (zM200296J) {
            if (r120Var == null) {
                Intrinsics.m87502r("adapter");
                r120Var = null;
            }
            r120Var.m177435G(m104895e());
            return;
        }
        if (r120Var == null) {
            Intrinsics.m87502r("adapter");
            r120Var = null;
        }
        r120Var.m177435G(m104896f(visitors, next));
    }

    /* JADX INFO: renamed from: r */
    public final void m104903r() {
        xdl0.m208329E0(m104897i(), new View.OnClickListener() { // from class: l.a220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c220.m104891a(this.f67218a, view);
            }
        });
        m104900n().mo223159O(this);
        m104900n().mo223158M(new me50() { // from class: l.b220
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                c220.m104892b(this.f72652a, hnc0Var);
            }
        });
        Act act = this.frag.act();
        act.getClass();
        this.adapter = new r120(act);
        VPullUpRecyclerView vPullUpRecyclerViewM104898l = m104898l();
        r120 r120Var = this.adapter;
        if (r120Var == null) {
            Intrinsics.m87502r("adapter");
            r120Var = null;
        }
        vPullUpRecyclerViewM104898l.setAdapter(r120Var);
        m104898l().setLayoutManager(new LinearLayoutManager(this.frag.act()));
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        z120 z120Var = this.presenter;
        if (z120Var != null) {
            z120Var.m216785j0(true, "");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
