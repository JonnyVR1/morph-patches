package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u00104\"\u0004\b7\u0010\u0007R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\fR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u000f¨\u0006`"}, m88121d2 = {"Ll/yw40;", "Ll/iam;", "Ll/vw40;", "Ll/dw40;", "Landroid/widget/LinearLayout;", "tips", "<init>", "(Landroid/widget/LinearLayout;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "presenter", Constants.INAPP_DATA_TAG, "(Ll/vw40;)V", "", "p", "()Z", "w", "()V", "show", BaseSei.f14624X, "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;", "chatTip", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;)V", "", "type", "f", "(Ljava/lang/String;)Landroid/view/View;", "", "progress", "isFinish", ResourceDirection.f39656v, "(FZ)V", "e", "(F)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "destroy", "a", "Landroid/widget/LinearLayout;", "k", "()Landroid/widget/LinearLayout;", "b", "get_tip_and_service", "set_tip_and_service", "_tip_and_service", "Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", "Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;", "set_input_chat_tip_list", "(Lcom/p1/mobile/putong/live/base/view/LiveFadeRecyclerView;)V", "_input_chat_tip_list", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_service", "(Landroid/widget/FrameLayout;)V", "_service", "Lv/VText;", "Lv/VText;", "get_service_text", "()Lv/VText;", "set_service_text", "(Lv/VText;)V", "_service_text", "Landroid/view/View;", "n", "()Landroid/view/View;", "set_service_red_dot", "_service_red_dot", "Ll/e35;", "g", "Ll/e35;", RXScreenCaptureService.KEY_INDEX, "()Ll/e35;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/e35;)V", "chatTipAdapter", "h", "Ll/vw40;", "j", "()Ll/vw40;", "u", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class yw40 implements iam<vw40<dw40>> {

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
    public e35 chatTipAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public vw40<dw40> presenter;

    public yw40(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this.tips = linearLayout;
    }

    /* JADX INFO: renamed from: a */
    public static void m217562a(vw40 vw40Var, String str) {
        if (j35.m143323h()) {
            vw40Var.m163853b4();
        } else {
            vw40Var.m213811F2().ChatEvent.sendNormalMessage().mo199273j(new gw40(j35.m143317b(str)));
            vw40Var.m163852X3();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m217563b(vw40 vw40Var, View view) {
        vw40Var.m203064m4();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = m217569j().act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: c */
    public final void m217564c(View view) {
        zw40.m221855a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull final vw40<dw40> presenter) {
        presenter.getClass();
        m217577u(presenter);
        m217564c(this.tips);
        m217571l().setLayoutManager(new LinearLayoutManager(m217571l().getContext(), 0, false));
        m217576s(new e35(presenter.act(), m217571l(), new y20() { // from class: l.ww40
            @Override // p153l.y20
            public final void call(Object obj) {
                yw40.m217562a(presenter, (String) obj);
            }
        }));
        m217571l().setAdapter(m217568i());
        LiveFadeRecyclerView liveFadeRecyclerViewM217571l = m217571l();
        int i = qa00.f156322i;
        liveFadeRecyclerViewM217571l.addItemDecoration(new guf0(i, i));
        m217572m().setOnClickListener(new View.OnClickListener() { // from class: l.xw40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yw40.m217563b(presenter, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
        m217568i().m119252I(new ArrayList());
    }

    /* JADX INFO: renamed from: e */
    public final void m217566e(float progress) {
        this.tips.setAlpha(progress);
        if (bnl0.m105529O0(this.tips)) {
            return;
        }
        bnl0.m105524M(this.tips, true);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final View m217567f(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d("vipServiceBubble", type) && bnl0.m105529O0(m217572m())) {
            return m217572m();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final e35 m217568i() {
        e35 e35Var = this.chatTipAdapter;
        if (e35Var != null) {
            return e35Var;
        }
        Intrinsics.m88391r("chatTipAdapter");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final vw40<dw40> m217569j() {
        vw40<dw40> vw40Var = this.presenter;
        if (vw40Var != null) {
            return vw40Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final LinearLayout getTips() {
        return this.tips;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LiveFadeRecyclerView m217571l() {
        LiveFadeRecyclerView liveFadeRecyclerView = this._input_chat_tip_list;
        if (liveFadeRecyclerView != null) {
            return liveFadeRecyclerView;
        }
        Intrinsics.m88391r("_input_chat_tip_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m217572m() {
        FrameLayout frameLayout = this._service;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_service");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m217573n() {
        View view = this._service_red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_service_red_dot");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m217574p() {
        return bnl0.m105529O0(m217572m());
    }

    /* JADX INFO: renamed from: q */
    public final void m217575q(@Nullable BLiveChatTip chatTip) {
        boolean z = chatTip == null || jyb.m147479J(chatTip.tips);
        bnl0.m105525M0(m217571l(), !z);
        if (z) {
            return;
        }
        e35 e35VarM217568i = m217568i();
        chatTip.getClass();
        e35VarM217568i.m119252I(chatTip.tips);
    }

    /* JADX INFO: renamed from: s */
    public final void m217576s(@NotNull e35 e35Var) {
        e35Var.getClass();
        this.chatTipAdapter = e35Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m217577u(@NotNull vw40<dw40> vw40Var) {
        vw40Var.getClass();
        this.presenter = vw40Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m217578v(float progress, boolean isFinish) {
        this.tips.setAlpha(progress);
        if (isFinish) {
            bnl0.m105524M(this.tips, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m217579w() {
        m217571l().setFadingEdgeLength(qa00.m175859d(90.0f));
        m217571l().setHorizontalFadingEdgeEnabled(true);
        m217571l().m69909H();
        bnl0.m105524M(m217572m(), true);
    }

    /* JADX INFO: renamed from: x */
    public final void m217580x(boolean show) {
        bnl0.m105524M(m217573n(), show);
    }
}
