package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xlf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u00104\"\u0004\b7\u0010\u0007R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\fR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u000f¨\u0006`"}, d2 = {"Ll/ko40;", "Ll/s7m;", "Ll/ho40;", "Ll/pn40;", "Landroid/widget/LinearLayout;", "tips", "<init>", "(Landroid/widget/LinearLayout;)V", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)V", "presenter", "d", "(Ll/ho40;)V", "", "p", "()Z", "w", "()V", "show", "x", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;", "chatTip", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;)V", "", "type", "f", "(Ljava/lang/String;)Landroid/view/View;", "", "progress", "isFinish", "v", "(FZ)V", "e", "(F)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "destroy", "a", "Landroid/widget/LinearLayout;", "k", "()Landroid/widget/LinearLayout;", "b", "get_tip_and_service", "set_tip_and_service", "_tip_and_service", "Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", "Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", "l", "()Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", "set_input_chat_tip_list", "(Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;)V", "_input_chat_tip_list", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_service", "(Landroid/widget/FrameLayout;)V", "_service", "Lv/VText;", "Lv/VText;", "get_service_text", "()Lv/VText;", "set_service_text", "(Lv/VText;)V", "_service_text", "Landroid/view/View;", "n", "()Landroid/view/View;", "set_service_red_dot", "_service_red_dot", "Ll/f25;", "g", "Ll/f25;", "i", "()Ll/f25;", "s", "(Ll/f25;)V", "chatTipAdapter", "h", "Ll/ho40;", "j", "()Ll/ho40;", "u", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ko40 implements s7m<ho40<pn40>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LinearLayout tips;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _tip_and_service;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LiveFadeRecyclerView _input_chat_tip_list;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _service;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _service_text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _service_red_dot;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public f25 chatTipAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ho40<pn40> presenter;

    public ko40(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this.tips = linearLayout;
    }

    /* JADX INFO: renamed from: a */
    public static void m16702a(ho40 ho40Var, String str) {
        if (k25.m16472h()) {
            ho40Var.m13964b4();
        } else {
            ho40Var.m25548F2().ChatEvent.sendNormalMessage().j(new sn40(k25.m16466b(str)));
            ho40Var.m13960X3();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16703b(ho40 ho40Var, View view) {
        ho40Var.m14650m4();
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m16704C0() {
        Act act = m16711j().act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: c */
    public final void m16705c(View view) {
        lo40.m17336a(this, view);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m16710i1(@NotNull final ho40<pn40> presenter) {
        presenter.getClass();
        m16719u(presenter);
        m16705c(this.tips);
        m16713l().setLayoutManager(new LinearLayoutManager(m16713l().getContext(), 0, false));
        m16718s(new f25(presenter.act(), m16713l(), new e30() { // from class: l.io40
            public final void call(Object obj) {
                ko40.m16702a(presenter, (String) obj);
            }
        }));
        m16713l().setAdapter(m16709i());
        LiveFadeRecyclerView liveFadeRecyclerViewM16713l = m16713l();
        int i = t100.i;
        liveFadeRecyclerViewM16713l.addItemDecoration(new xlf0(i, i));
        m16714m().setOnClickListener(new View.OnClickListener() { // from class: l.jo40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ko40.m16703b(presenter, view);
            }
        });
    }

    public void destroy() {
        m16709i().m12929I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public final void m16707e(float progress) {
        this.tips.setAlpha(progress);
        if (xdl0.O0(this.tips)) {
            return;
        }
        xdl0.M(this.tips, true);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final View m16708f(@NotNull String type) {
        type.getClass();
        if (Intrinsics.d("vipServiceBubble", type) && xdl0.O0(m16714m())) {
            return m16714m();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final f25 m16709i() {
        f25 f25Var = this.chatTipAdapter;
        if (f25Var != null) {
            return f25Var;
        }
        Intrinsics.r("chatTipAdapter");
        return null;
    }

    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ho40<pn40> m16711j() {
        ho40<pn40> ho40Var = this.presenter;
        if (ho40Var != null) {
            return ho40Var;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final LinearLayout getTips() {
        return this.tips;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LiveFadeRecyclerView m16713l() {
        LiveFadeRecyclerView liveFadeRecyclerView = this._input_chat_tip_list;
        if (liveFadeRecyclerView != null) {
            return liveFadeRecyclerView;
        }
        Intrinsics.r("_input_chat_tip_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m16714m() {
        FrameLayout frameLayout = this._service;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_service");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m16715n() {
        View view = this._service_red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_service_red_dot");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16716p() {
        return xdl0.O0(m16714m());
    }

    /* JADX INFO: renamed from: q */
    public final void m16717q(@Nullable BLiveChatTip chatTip) {
        boolean z = chatTip == null || vwb.J(chatTip.tips);
        xdl0.M0(m16713l(), !z);
        if (z) {
            return;
        }
        f25 f25VarM16709i = m16709i();
        chatTip.getClass();
        f25VarM16709i.m12929I(chatTip.tips);
    }

    /* JADX INFO: renamed from: s */
    public final void m16718s(@NotNull f25 f25Var) {
        f25Var.getClass();
        this.chatTipAdapter = f25Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m16719u(@NotNull ho40<pn40> ho40Var) {
        ho40Var.getClass();
        this.presenter = ho40Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m16720v(float progress, boolean isFinish) {
        this.tips.setAlpha(progress);
        if (isFinish) {
            xdl0.M(this.tips, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16721w() {
        m16713l().setFadingEdgeLength(t100.d(90.0f));
        m16713l().setHorizontalFadingEdgeEnabled(true);
        m16713l().H();
        xdl0.M(m16714m(), true);
    }

    /* JADX INFO: renamed from: x */
    public final void m16722x(boolean show) {
        xdl0.M(m16715n(), show);
    }
}
