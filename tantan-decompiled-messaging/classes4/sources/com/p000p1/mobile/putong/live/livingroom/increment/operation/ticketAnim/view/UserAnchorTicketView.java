package com.p000p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ap0;
import l.k4t;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.bsm;
import p002l.ho2;
import p002l.ku50;
import p002l.pxj0;
import p002l.rxj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/UserAnchorTicketView;", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/BasePreOperationView;", "Ll/pxj0;", "Ll/ho2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "u0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/bsm;", "info", "v0", "(Ll/bsm;)Ll/pxj0;", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/PreOperationAnimView;", "viewModel", "i0", "(Lcom/p1/mobile/putong/live/livingroom/increment/operation/PreOperationAnimView;)V", "inflateView", "Ll/ku50;", "event", "o0", "(Ll/ku50;)V", "Ll/xdl0$g;", "from", "q0", "(Ll/xdl0$g;)V", "view", "t0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "get_root_svg", "()Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "set_root_svg", "(Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;)V", "_root_svg", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class UserAnchorTicketView extends BasePreOperationView<pxj0<? extends ho2>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayerWithMatrix _root_svg;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView$a */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/UserAnchorTicketView$a", "Ll/ap0;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0453a extends ap0 {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAnchorTicketView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: s0 */
    public static Unit m8731s0(UserAnchorTicketView userAnchorTicketView) {
        userAnchorTicketView.mo8598m0();
        k4t k4tVarW2 = ((pxj0) userAnchorTicketView.f6834d).w2();
        if (k4tVarW2 != null) {
            k4tVarW2.C2(userAnchorTicketView.f6834d);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnimEffectPlayerWithMatrix get_root_svg() {
        AnimEffectPlayerWithMatrix animEffectPlayerWithMatrix = this._root_svg;
        if (animEffectPlayerWithMatrix != null) {
            return animEffectPlayerWithMatrix;
        }
        Intrinsics.r("_root_svg");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: i0 */
    public void mo8593i0(@NotNull PreOperationAnimView viewModel) {
        viewModel.getClass();
        viewModel.addView((View) this, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(xdl0.y0(), xdl0.w0()));
    }

    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m8733u0(inflater, parent);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo8600o0(@Nullable ku50 event) {
        super.mo8600o0(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8732t0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo8602q0(@Nullable xdl0.g from) {
        xdl0.M0(this, true);
        get_root_svg().g("https://auto.tancdn.com/v1/raw/07df607e-7b69-47ea-ba45-25754fdb90d611.so", -1, new C0453a(), true);
        get_root_svg().m8730w(new Function0() { // from class: l.qxj0
            public final Object invoke() {
                return UserAnchorTicketView.m8731s0(this.f18270a);
            }
        });
    }

    public final void set_root_svg(@NotNull AnimEffectPlayerWithMatrix animEffectPlayerWithMatrix) {
        animEffectPlayerWithMatrix.getClass();
        this._root_svg = animEffectPlayerWithMatrix;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8732t0(View view) {
        rxj0.m22146a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final View m8733u0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM22147b = rxj0.m22147b(this, inflater, parent);
        viewM22147b.getClass();
        return viewM22147b;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    @NotNull
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public pxj0<? extends ho2> mo8599n0(@NotNull bsm<?> info) {
        info.getClass();
        return new pxj0<>(info);
    }
}
