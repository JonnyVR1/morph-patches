package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallNormalItemBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;
import p149l.cxq;
import p149l.e30;
import p149l.h1c0;
import p149l.hxs;
import p149l.i110;
import p149l.i3c0;
import p149l.kvc0;
import p149l.la10;
import p149l.s410;
import p149l.t100;
import p149l.v610;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\u0018R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallNormalItemBindings;", "Ll/la10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/v610;", "data", "", "q0", "(Ll/v610;)V", "Ll/i110;", "p0", "(Ll/i110;)V", "", "enable", "n0", "(Z)V", "", "text", "z0", "(Ljava/lang/String;)V", "v0", "()V", "u0", "Lcom/p1/mobile/putong/data/Followship;", "followShip", "w0", "(Lcom/p1/mobile/putong/data/Followship;)V", "checked", "o0", "(ZZ)V", "state", "y0", "", "n", "I", "avatarViewSize", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MultiCallNormalItemView extends LiveMultiCallNormalItemBindings<la10> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int avatarViewSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallNormalItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.avatarViewSize = t100.f167275x;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75760j0(i110 i110Var, View view) {
        view.getClass();
        i110Var.m133953K().invoke(i110Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m75761k0(i110 i110Var, View view) {
        view.getClass();
        Function1<String, Unit> function1M133955N = i110Var.m133955N();
        String str = i110Var.getApplyData().userId;
        str.getClass();
        function1M133955N.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m75764r0(e30 e30Var, v610 v610Var, View view) {
        view.getClass();
        e30Var.call(v610Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m75765s0(e30 e30Var, v610 v610Var, View view) {
        view.getClass();
        e30Var.call(v610Var.getCallInvite().toUserId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m75766t0(e30 e30Var, v610 v610Var, View view) {
        e30Var.call(v610Var);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75767n0(boolean enable) {
        TextView textView = this.f48028j;
        if (enable) {
            textView.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            this.f48027i.setBackgroundResource(i3c0.f111118p0);
        } else {
            textView.setTextColor(kvc0.m147352a(h1c0.f105347Z0));
            this.f48027i.setBackgroundResource(i3c0.f111058k0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75768o0(boolean enable, boolean checked) {
        xdl0.m208344M(this.f48031m, enable);
        this.f48031m.setChecked(checked);
        xdl0.m208344M(this.f48029k, !enable);
        xdl0.m208344M(this.f48028j, !enable);
        xdl0.m208344M(this.f48027i, !enable);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75769p0(@NotNull final i110 data) {
        data.getClass();
        hxs.m133407t("context_common", this.f48024f, data.getApplyData().userAvatar, this.avatarViewSize);
        this.f48025g.setText(data.getApplyData().userName);
        m75773w0(data.getApplyData().followship);
        View view = this.f48027i;
        view.getClass();
        cxq.m109105c(view, new Function1() { // from class: l.xa10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallNormalItemView.m75760j0(data, (View) obj);
            }
        });
        MysteryAvatarView mysteryAvatarView = this.f48024f;
        mysteryAvatarView.getClass();
        cxq.m109105c(mysteryAvatarView, new Function1() { // from class: l.ya10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallNormalItemView.m75761k0(data, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75770q0(@NotNull final v610 data) {
        data.getClass();
        hxs.m133407t("context_common", this.f48024f, data.getCallInvite().toUserAvatar, this.avatarViewSize);
        final e30<v610> e30VarM197186H = data.m197186H();
        if (e30VarM197186H != null) {
            xdl0.m208411y(this.f48030l, true);
            VFrame vFrame = this.f48030l;
            vFrame.getClass();
            cxq.m109105c(vFrame, new Function1() { // from class: l.ua10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiCallNormalItemView.m75764r0(e30VarM197186H, data, (View) obj);
                }
            });
        }
        final e30<String> e30VarM197187I = data.m197187I();
        if (e30VarM197187I != null) {
            xdl0.m208411y(this.f48024f, true);
            MysteryAvatarView mysteryAvatarView = this.f48024f;
            mysteryAvatarView.getClass();
            cxq.m109105c(mysteryAvatarView, new Function1() { // from class: l.va10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiCallNormalItemView.m75765s0(e30VarM197187I, data, (View) obj);
                }
            });
        }
        final e30<v610> e30VarM197191N = data.m197191N();
        if (e30VarM197191N != null) {
            xdl0.m208411y(this, true);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wa10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultiCallNormalItemView.m75766t0(e30VarM197191N, data, view);
                }
            });
        }
        if (Intrinsics.m87488d(s410.f162214D, data.getType())) {
            m75773w0(data.getCallInvite().followship);
        }
        m75768o0(data.getEnableCheck(), data.getChecked());
        this.f48025g.setText(data.getCallInvite().toUserName);
        String str = data.getCallInvite().state;
        str.getClass();
        m75774y0(str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75771u0() {
        xdl0.m208344M(this.f48029k, false);
        xdl0.m208344M(this.f48028j, true);
        this.f48029k.clearAnimation();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75772v0() {
        xdl0.m208344M(this.f48029k, true);
        xdl0.m208344M(this.f48028j, false);
        this.f48029k.clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(600L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        this.f48029k.setAnimation(rotateAnimation);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m75773w0(Followship followShip) {
        VText vText = this.f48026h;
        if (followShip != null) {
            xdl0.m208344M(vText, TEnum.equals(followShip.state, "matched"));
        } else {
            xdl0.m208344M(vText, false);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m75774y0(String state) {
        xdl0.m208344M(this.f48028j, true);
        xdl0.m208344M(this.f48029k, false);
        if (Intrinsics.m87488d(s410.f162253s, state)) {
            m75767n0(true);
            this.f48028j.setText(w8u.m202217t(R$string.f47363l8));
            this.f48030l.setEnabled(false);
        } else if (Intrinsics.m87488d(s410.f162252r, state)) {
            m75767n0(false);
            this.f48028j.setText(w8u.m202217t(R$string.f47605w8));
            this.f48030l.setEnabled(false);
        } else {
            m75767n0(true);
            this.f48028j.setText(w8u.m202217t(R$string.f47583v8));
            this.f48030l.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m75775z0(@NotNull String text) {
        text.getClass();
        xdl0.m208344M(this.f48028j, true);
        xdl0.m208344M(this.f48029k, false);
        this.f48028j.setText(text);
    }

    public /* synthetic */ MultiCallNormalItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
