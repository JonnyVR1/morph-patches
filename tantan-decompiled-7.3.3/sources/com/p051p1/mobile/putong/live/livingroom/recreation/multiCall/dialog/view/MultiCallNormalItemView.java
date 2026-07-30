package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallNormalItemBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.cd10;
import p153l.czq;
import p153l.ff10;
import p153l.izs;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.s910;
import p153l.vi10;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\u0018R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallNormalItemBindings;", "Ll/vi10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/ff10;", "data", "", "q0", "(Ll/ff10;)V", "Ll/s910;", "p0", "(Ll/s910;)V", "", "enable", "n0", "(Z)V", "", "text", "z0", "(Ljava/lang/String;)V", "v0", "()V", "u0", "Lcom/p1/mobile/putong/data/Followship;", "followShip", "w0", "(Lcom/p1/mobile/putong/data/Followship;)V", "checked", "o0", "(ZZ)V", "state", "y0", "", "n", "I", "avatarViewSize", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MultiCallNormalItemView extends LiveMultiCallNormalItemBindings<vi10> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int avatarViewSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallNormalItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.avatarViewSize = qa00.f156337x;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m76943j0(s910 s910Var, View view) {
        view.getClass();
        s910Var.m185129K().invoke(s910Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m76944k0(s910 s910Var, View view) {
        view.getClass();
        Function1<String, Unit> function1M185131N = s910Var.m185131N();
        String str = s910Var.getApplyData().userId;
        str.getClass();
        function1M185131N.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m76947r0(y20 y20Var, ff10 ff10Var, View view) {
        view.getClass();
        y20Var.call(ff10Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m76948s0(y20 y20Var, ff10 ff10Var, View view) {
        view.getClass();
        y20Var.call(ff10Var.getCallInvite().toUserId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m76949t0(y20 y20Var, ff10 ff10Var, View view) {
        y20Var.call(ff10Var);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76950n0(boolean enable) {
        TextView textView = this.f48876j;
        if (enable) {
            textView.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            this.f48875i.setBackgroundResource(obc0.f146446p0);
        } else {
            textView.setTextColor(n3d0.m161277a(n9c0.f140808Z0));
            this.f48875i.setBackgroundResource(obc0.f146386k0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76951o0(boolean enable, boolean checked) {
        bnl0.m105524M(this.f48879m, enable);
        this.f48879m.setChecked(checked);
        bnl0.m105524M(this.f48877k, !enable);
        bnl0.m105524M(this.f48876j, !enable);
        bnl0.m105524M(this.f48875i, !enable);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76952p0(@NotNull final s910 data) {
        data.getClass();
        izs.m142869t("context_common", this.f48872f, data.getApplyData().userAvatar, this.avatarViewSize);
        this.f48873g.setText(data.getApplyData().userName);
        m76956w0(data.getApplyData().followship);
        View view = this.f48875i;
        view.getClass();
        czq.m113347c(view, new Function1() { // from class: l.hj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallNormalItemView.m76943j0(data, (View) obj);
            }
        });
        MysteryAvatarView mysteryAvatarView = this.f48872f;
        mysteryAvatarView.getClass();
        czq.m113347c(mysteryAvatarView, new Function1() { // from class: l.ij10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallNormalItemView.m76944k0(data, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76953q0(@NotNull final ff10 data) {
        data.getClass();
        izs.m142869t("context_common", this.f48872f, data.getCallInvite().toUserAvatar, this.avatarViewSize);
        final y20<ff10> y20VarM125340H = data.m125340H();
        if (y20VarM125340H != null) {
            bnl0.m105591y(this.f48878l, true);
            VFrame vFrame = this.f48878l;
            vFrame.getClass();
            czq.m113347c(vFrame, new Function1() { // from class: l.ej10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiCallNormalItemView.m76947r0(y20VarM125340H, data, (View) obj);
                }
            });
        }
        final y20<String> y20VarM125341I = data.m125341I();
        if (y20VarM125341I != null) {
            bnl0.m105591y(this.f48872f, true);
            MysteryAvatarView mysteryAvatarView = this.f48872f;
            mysteryAvatarView.getClass();
            czq.m113347c(mysteryAvatarView, new Function1() { // from class: l.fj10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiCallNormalItemView.m76948s0(y20VarM125341I, data, (View) obj);
                }
            });
        }
        final y20<ff10> y20VarM125345N = data.m125345N();
        if (y20VarM125345N != null) {
            bnl0.m105591y(this, true);
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.gj10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultiCallNormalItemView.m76949t0(y20VarM125345N, data, view);
                }
            });
        }
        if (Intrinsics.m88377d(cd10.f81052D, data.getType())) {
            m76956w0(data.getCallInvite().followship);
        }
        m76951o0(data.getEnableCheck(), data.getChecked());
        this.f48873g.setText(data.getCallInvite().toUserName);
        String str = data.getCallInvite().state;
        str.getClass();
        m76957y0(str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m76954u0() {
        bnl0.m105524M(this.f48877k, false);
        bnl0.m105524M(this.f48876j, true);
        this.f48877k.clearAnimation();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m76955v0() {
        bnl0.m105524M(this.f48877k, true);
        bnl0.m105524M(this.f48876j, false);
        this.f48877k.clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(600L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        this.f48877k.setAnimation(rotateAnimation);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m76956w0(Followship followShip) {
        VText vText = this.f48874h;
        if (followShip != null) {
            bnl0.m105524M(vText, TEnum.equals(followShip.state, "matched"));
        } else {
            bnl0.m105524M(vText, false);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m76957y0(String state) {
        bnl0.m105524M(this.f48876j, true);
        bnl0.m105524M(this.f48877k, false);
        if (Intrinsics.m88377d(cd10.f81091s, state)) {
            m76950n0(true);
            this.f48876j.setText(xau.m209910t(R$string.f48211l8));
            this.f48878l.setEnabled(false);
        } else if (Intrinsics.m88377d(cd10.f81090r, state)) {
            m76950n0(false);
            this.f48876j.setText(xau.m209910t(R$string.f48453w8));
            this.f48878l.setEnabled(false);
        } else {
            m76950n0(true);
            this.f48876j.setText(xau.m209910t(R$string.f48431v8));
            this.f48878l.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m76958z0(@NotNull String text) {
        text.getClass();
        bnl0.m105524M(this.f48876j, true);
        bnl0.m105524M(this.f48877k, false);
        this.f48876j.setText(text);
    }

    public /* synthetic */ MultiCallNormalItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
