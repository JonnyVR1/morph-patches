package com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.dum;
import p153l.l6t;
import p153l.oo2;
import p153l.q260;
import p153l.v6k0;
import p153l.wo0;
import p153l.x6k0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/UserAnchorTicketView;", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/BasePreOperationView;", "Ll/v6k0;", "Ll/oo2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "u0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/dum;", BaseSei.INFO, "v0", "(Ll/dum;)Ll/v6k0;", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/PreOperationAnimView;", "viewModel", "i0", "(Lcom/p1/mobile/putong/live/livingroom/increment/operation/PreOperationAnimView;)V", "inflateView", "Ll/q260;", NotificationCompat.CATEGORY_EVENT, "o0", "(Ll/q260;)V", "Ll/bnl0$g;", "from", "q0", "(Ll/bnl0$g;)V", OMSTemplateModeType.view, "t0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "get_root_svg", "()Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "set_root_svg", "(Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;)V", "_root_svg", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class UserAnchorTicketView extends BasePreOperationView<v6k0<? extends oo2>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayerWithMatrix _root_svg;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/UserAnchorTicketView$a", "Ll/wo0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13027a extends wo0 {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAnchorTicketView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: s0 */
    public static Unit m76298s0(UserAnchorTicketView userAnchorTicketView) {
        userAnchorTicketView.mo76173m0();
        l6t l6tVarM153101w2 = ((v6k0) userAnchorTicketView.f51640d).m153101w2();
        if (l6tVarM153101w2 != null) {
            l6tVarM153101w2.m153097C2(userAnchorTicketView.f51640d);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnimEffectPlayerWithMatrix get_root_svg() {
        AnimEffectPlayerWithMatrix animEffectPlayerWithMatrix = this._root_svg;
        if (animEffectPlayerWithMatrix != null) {
            return animEffectPlayerWithMatrix;
        }
        Intrinsics.m88391r("_root_svg");
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: i0 */
    public void mo76169i0(@NotNull PreOperationAnimView viewModel) {
        viewModel.getClass();
        viewModel.addView(this, new FrameLayout.LayoutParams(bnl0.m105592y0(), bnl0.m105588w0()));
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m76300u0(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo76175o0(@Nullable q260 event) {
        super.mo76175o0(event);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76299t0(this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo76177q0(@Nullable bnl0.C16067g from) {
        bnl0.m105525M0(this, true);
        get_root_svg().mo69680g("https://auto.tancdn.com/v1/raw/07df607e-7b69-47ea-ba45-25754fdb90d611.so", -1, new C13027a(), true);
        get_root_svg().m76297w(new Function0() { // from class: l.w6k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserAnchorTicketView.m76298s0(this.f187628a);
            }
        });
    }

    public final void set_root_svg(@NotNull AnimEffectPlayerWithMatrix animEffectPlayerWithMatrix) {
        animEffectPlayerWithMatrix.getClass();
        this._root_svg = animEffectPlayerWithMatrix;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m76299t0(View view) {
        x6k0.m209507a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final View m76300u0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM209508b = x6k0.m209508b(this, inflater, parent);
        viewM209508b.getClass();
        return viewM209508b;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    @NotNull
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public v6k0<? extends oo2> mo76174n0(@NotNull dum<?> info) {
        info.getClass();
        return new v6k0<>(info);
    }
}
