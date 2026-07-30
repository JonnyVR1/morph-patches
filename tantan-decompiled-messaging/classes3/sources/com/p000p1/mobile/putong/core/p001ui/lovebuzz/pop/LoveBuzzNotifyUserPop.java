package com.p000p1.mobile.putong.core.p001ui.lovebuzz.pop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bt0;
import l.j760;
import l.j8w;
import l.l6w;
import l.m6w;
import l.osi0;
import l.p9w;
import l.vwb;
import l.xdl0;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0012J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u0014R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-¨\u00064"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", "z", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", "v", "()V", "y", "", IjkMediaMeta.IJKM_KEY_TYPE, "", "q", "(Ljava/lang/String;)Z", "w", "Landroid/view/View;", "it", "p", "(Landroid/view/View;)V", "t", "s", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Lcom/p1/mobile/android/app/Act;)V", MessageElement.XPATH_PREFIX, "u", "x", "r", "o", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "a", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "popView", "b", "Z", "shown", "c", "Ljava/lang/String;", "buzzType", "d", "notifyIsInvite", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class LoveBuzzNotifyUserPop extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BaseBuzzNotifyPop popView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean shown;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String buzzType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean notifyIsInvite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzNotifyUserPop(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        m71w();
        this.buzzType = "";
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m46A(Act act, LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData) {
        if (!m6w.INSTANCE.a(act)) {
            loveBuzzNotifyUserPop.m72x();
            return Unit.INSTANCE;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(false);
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop2 = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop2 != null) {
            baseBuzzNotifyPop2.m38o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m68t(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m47B(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m38o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m69u(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static final void m48C(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, BaseBuzzNotifyPop baseBuzzNotifyPop) {
        xdl0.M(loveBuzzNotifyUserPop, true);
        loveBuzzNotifyUserPop.m64p(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m49a(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act, int i) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        BuzzMediaCallManager.INSTANCE.c0();
        if (i == 100021) {
            j8w.a aVar = j8w.Companion;
            aVar.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
            loveBuzzNotifyUserPop.m72x();
            osi0.f(R.string.U);
            j8w j8wVarA = aVar.a();
            String str = loveBuzzPushData.biz;
            str.getClass();
            j8w.p0(j8wVarA, str, act, new Function0() { // from class: l.v8w
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m61n();
                }
            }, (Function0) null, false, 24, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m50b(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act) {
        loveBuzzNotifyUserPop.m67s(loveBuzzPushData, act);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m52d(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        loveBuzzNotifyUserPop.m72x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m53e(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.j0(loveBuzzNotifyUserPop.buzzType, true, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m54f(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        loveBuzzNotifyUserPop.m72x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m56h(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        loveBuzzNotifyUserPop.m62m(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m57i(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m59k(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m37n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m61n() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m62m(final Act act, final LoveBuzzPushData data) {
        j8w j8wVarA = j8w.Companion.a();
        String str = data.channelToken;
        String str2 = data.biz;
        str2.getClass();
        j8w.Y(j8wVarA, act, str, str2, new Function0() { // from class: l.e9w
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m54f(this.f3226a);
            }
        }, new Function1() { // from class: l.u8w
            public final Object invoke(Object obj) {
                return LoveBuzzNotifyUserPop.m49a(this.f7935a, data, act, ((Integer) obj).intValue());
            }
        }, false, 32, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.core.ui.lovebuzz.pop.BaseBuzzNotifyPop] */
    /* JADX INFO: renamed from: o */
    public final void m63o() {
        Context context = getContext();
        context.getClass();
        ?? baseBuzzNotifyPop = new BaseBuzzNotifyPop(context);
        this.popView = baseBuzzNotifyPop;
        addView(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: p */
    public final void m64p(View it) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(bt0.b);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(it, "alpha", 0.8f, 1.0f);
        float f = -it.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(it, "translationY", f - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m65q(@NotNull String type) {
        type.getClass();
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop == null || TextUtils.equals(baseBuzzNotifyPop.getTv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE java.lang.String(), type)) {
            return xdl0.O0(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m66r() {
        if (this.popView == null) {
            removeAllViews();
            m63o();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m67s(final LoveBuzzPushData data, final Act act) {
        j8w j8wVarA = j8w.Companion.a();
        String str = data.biz;
        str.getClass();
        j8wVarA.o0(str, act, new Function0() { // from class: l.c9w
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m56h(this.f2594a, act, data);
            }
        }, new Function0() { // from class: l.d9w
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m57i(this.f2918a);
            }
        }, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public final void m68t(final Act act, final LoveBuzzPushData data) {
        String str = data.biz;
        if (str != null) {
            switch (str.hashCode()) {
                case -1019560155:
                    if (!str.equals("voiceBuzz")) {
                        return;
                    }
                    break;
                case -1004163680:
                    if (str.equals("textBuzz")) {
                        j8w j8wVarA = j8w.Companion.a();
                        String str2 = data.buzzToken;
                        p9w p9wVar = p9w.INSTANCE;
                        String str3 = data.biz;
                        str3.getClass();
                        j8w.r0(j8wVarA, act, str2, data, p9wVar.y(str3), new Function0() { // from class: l.y8w
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m52d(this.f8938a);
                            }
                        }, new Function0() { // from class: l.z8w
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m59k(this.f9276a);
                            }
                        }, new Function0() { // from class: l.a9w
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m53e(this.f2095a);
                            }
                        }, false, 128, (Object) null);
                        return;
                    }
                    return;
                case 1332422126:
                    if (!str.equals("videoBuzz")) {
                        return;
                    }
                    break;
                case 1740758636:
                    if (!str.equals("memojiBuzz")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            p9w p9wVar2 = p9w.INSTANCE;
            p9wVar2.j0(this.buzzType, false, !this.shown);
            j8w j8wVarA2 = j8w.Companion.a();
            String str4 = data.biz;
            str4.getClass();
            String str5 = data.biz;
            str5.getClass();
            if (j8w.m0(j8wVarA2, str4, act, false, p9wVar2.y(str5), (Function0) null, new Function0() { // from class: l.b9w
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m50b(this.f2358a, data, act);
                }
            }, 16, (Object) null)) {
                m67s(data, act);
                return;
            }
            BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
            if (baseBuzzNotifyPop != null) {
                baseBuzzNotifyPop.m37n0(true);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m69u(Act act, LoveBuzzPushData data) {
        String str;
        p9w.INSTANCE.i0(this.buzzType, !this.shown);
        if (m6w.INSTANCE.a(act) && (str = data.biz) != null) {
            switch (str.hashCode()) {
                case -1019560155:
                    if (str.equals("voiceBuzz")) {
                        j8w.a aVar = j8w.Companion;
                        j8w j8wVarA = aVar.a();
                        String str2 = data.channelToken;
                        String str3 = data.biz;
                        str3.getClass();
                        j8wVarA.d1(str2, str3);
                        aVar.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
                    }
                    break;
                case -1004163680:
                    if (str.equals("textBuzz")) {
                        j8w.Companion.a().c1(data.buzzToken);
                    }
                    break;
                case 1332422126:
                    if (str.equals("videoBuzz")) {
                        j8w.a aVar2 = j8w.Companion;
                        j8w j8wVarA2 = aVar2.a();
                        String str4 = data.channelToken;
                        String str5 = data.biz;
                        str5.getClass();
                        j8wVarA2.d1(str4, str5);
                        aVar2.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
                    }
                    break;
                case 1740758636:
                    if (str.equals("memojiBuzz")) {
                        j8w.a aVar3 = j8w.Companion;
                        j8w j8wVarA3 = aVar3.a();
                        String str6 = data.channelToken;
                        String str7 = data.biz;
                        str7.getClass();
                        j8wVarA3.d1(str6, str7);
                        aVar3.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
                    }
                    break;
            }
        }
        m72x();
    }

    /* JADX INFO: renamed from: v */
    public final void m70v() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        p9w p9wVar = p9w.INSTANCE;
        j760 j760VarY = vwb.Y(Boolean.valueOf(!this.shown), Boolean.FALSE);
        j760VarY.getClass();
        p9wVar.k0(j760VarY, this.buzzType, this.notifyIsInvite, l6w.INSTANCE.e());
        xdl0.M(this, false);
        if (this.shown) {
            return;
        }
        if (Intrinsics.d(this.buzzType, "textBuzz")) {
            j8w.Companion.a().I0(true);
        } else {
            j8w.Companion.a().j1(this.buzzType);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m71w() {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m72x() {
        m70v();
        j8w.Companion.a().z0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
    }

    /* JADX INFO: renamed from: y */
    public final void m73y() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        xdl0.M0(this, false);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.p1.mobile.putong.core.ui.lovebuzz.pop.BaseBuzzNotifyPop] */
    /* JADX INFO: renamed from: z */
    public final void m74z(@Nullable final Act act, @Nullable final LoveBuzzPushData data) {
        if (m6w.INSTANCE.a(act) && data != null && NullChecker.a(data.contentId) && data.contentId.equals(CoreModule.H().userId())) {
            j8w.a aVar = j8w.Companion;
            aVar.a().x0(act);
            User userPa = CoreModule.c.e0.Pa(data.userId);
            if (userPa == null) {
                return;
            }
            String str = data.biz;
            str.getClass();
            this.buzzType = str;
            this.notifyIsInvite = Intrinsics.d(data.buzzIntent, "intl.lovebuzz.invite");
            boolean zE0 = !Intrinsics.d(this.buzzType, "textBuzz") ? aVar.a().E0(this.buzzType) : aVar.a().L0();
            this.shown = zE0;
            p9w p9wVar = p9w.INSTANCE;
            j760 j760VarY = vwb.Y(Boolean.valueOf(!zE0), Boolean.TRUE);
            j760VarY.getClass();
            p9wVar.k0(j760VarY, this.buzzType, this.notifyIsInvite, l6w.INSTANCE.e());
            m66r();
            final ?? r3 = this.popView;
            if (r3 != 0) {
                r3.m45v0(act, data, userPa, new Function0() { // from class: l.t8w
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m46A(act, this, data);
                    }
                }, new Function0() { // from class: l.w8w
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m47B(this.f8515a, act, data);
                    }
                });
                r3.post(new Runnable() { // from class: l.x8w
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoveBuzzNotifyUserPop.m48C(this.f8743a, r3);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzNotifyUserPop(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzNotifyUserPop(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
