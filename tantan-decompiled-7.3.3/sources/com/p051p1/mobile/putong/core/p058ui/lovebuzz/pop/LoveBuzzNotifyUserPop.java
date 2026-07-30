package com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.gt0;
import p153l.haw;
import p153l.j8w;
import p153l.jyb;
import p153l.k8w;
import p153l.nbw;
import p153l.pf60;
import p153l.r1j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0012J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u0014R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-¨\u00064"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", BaseSei.f14626Z, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", ResourceDirection.f39656v, "()V", BaseSei.f14625Y, "", "type", "", "q", "(Ljava/lang/String;)Z", "w", "Landroid/view/View;", Careers.f39580it, "p", "(Landroid/view/View;)V", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Lcom/p1/mobile/android/app/Act;)V", "m", "u", BaseSei.f14624X, "r", "o", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "a", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "popView", "b", "Z", "shown", "c", "Ljava/lang/String;", "buzzType", Constants.INAPP_DATA_TAG, "notifyIsInvite", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        m48242w();
        this.buzzType = "";
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m48217A(Act act, LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData) {
        if (!k8w.INSTANCE.m148752a(act)) {
            loveBuzzNotifyUserPop.m48243x();
            return Unit.INSTANCE;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(false);
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop2 = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop2 != null) {
            baseBuzzNotifyPop2.m48210o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m48239t(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m48218B(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48210o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m48240u(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m48219C(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, BaseBuzzNotifyPop baseBuzzNotifyPop) {
        bnl0.m105524M(loveBuzzNotifyUserPop, true);
        loveBuzzNotifyUserPop.m48235p(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m48220a(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act, int i) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        BuzzMediaCallManager.INSTANCE.m48147c0();
        if (i == 100021) {
            haw.Companion companion = haw.INSTANCE;
            companion.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
            loveBuzzNotifyUserPop.m48243x();
            r1j0.m179419f(R$string.f20934U);
            haw hawVarM134320a = companion.m134320a();
            String str = loveBuzzPushData.biz;
            str.getClass();
            haw.m134251p0(hawVarM134320a, str, act, new Function0() { // from class: l.taw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m48232n();
                }
            }, null, false, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m48221b(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act) {
        loveBuzzNotifyUserPop.m48238s(loveBuzzPushData, act);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m48223d(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        nbw.INSTANCE.m162241j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        loveBuzzNotifyUserPop.m48243x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m48224e(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        nbw.INSTANCE.m162241j0(loveBuzzNotifyUserPop.buzzType, true, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m48225f(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        loveBuzzNotifyUserPop.m48243x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m48227h(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        loveBuzzNotifyUserPop.m48233m(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m48228i(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m48230k(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        nbw.INSTANCE.m162241j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m48209n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m48232n() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m48233m(final Act act, final LoveBuzzPushData data) {
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        String str = data.channelToken;
        String str2 = data.biz;
        str2.getClass();
        haw.m134225Y(hawVarM134320a, act, str, str2, new Function0() { // from class: l.cbw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m48225f(this.f80861a);
            }
        }, new Function1() { // from class: l.saw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoveBuzzNotifyUserPop.m48220a(this.f167078a, data, act, ((Integer) obj).intValue());
            }
        }, false, 32, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m48234o() {
        Context context = getContext();
        context.getClass();
        BaseBuzzNotifyPop baseBuzzNotifyPop = new BaseBuzzNotifyPop(context);
        this.popView = baseBuzzNotifyPop;
        addView(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: p */
    public final void m48235p(View it) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(gt0.f106347b);
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
    public final boolean m48236q(@NotNull String type) {
        type.getClass();
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop == null || TextUtils.equals(baseBuzzNotifyPop.getType(), type)) {
            return bnl0.m105529O0(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m48237r() {
        if (this.popView == null) {
            removeAllViews();
            m48234o();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m48238s(final LoveBuzzPushData data, final Act act) {
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        String str = data.biz;
        str.getClass();
        hawVarM134320a.m134305o0(str, act, new Function0() { // from class: l.abw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m48227h(this.f69661a, act, data);
            }
        }, new Function0() { // from class: l.bbw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m48228i(this.f76000a);
            }
        }, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public final void m48239t(final Act act, final LoveBuzzPushData data) {
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
                        haw hawVarM134320a = haw.INSTANCE.m134320a();
                        String str2 = data.buzzToken;
                        nbw nbwVar = nbw.INSTANCE;
                        String str3 = data.biz;
                        str3.getClass();
                        haw.m134254r0(hawVarM134320a, act, str2, data, nbwVar.m162268y(str3), new Function0() { // from class: l.waw
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m48223d(this.f188171a);
                            }
                        }, new Function0() { // from class: l.xaw
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m48230k(this.f193089a);
                            }
                        }, new Function0() { // from class: l.yaw
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m48224e(this.f198262a);
                            }
                        }, false, 128, null);
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
            nbw nbwVar2 = nbw.INSTANCE;
            nbwVar2.m162241j0(this.buzzType, false, !this.shown);
            haw hawVarM134320a2 = haw.INSTANCE.m134320a();
            String str4 = data.biz;
            str4.getClass();
            String str5 = data.biz;
            str5.getClass();
            if (haw.m134247m0(hawVarM134320a2, str4, act, false, nbwVar2.m162268y(str5), null, new Function0() { // from class: l.zaw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m48221b(this.f203597a, data, act);
                }
            }, 16, null)) {
                m48238s(data, act);
                return;
            }
            BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
            if (baseBuzzNotifyPop != null) {
                baseBuzzNotifyPop.m48209n0(true);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m48240u(Act act, LoveBuzzPushData data) {
        String str;
        nbw.INSTANCE.m162240i0(this.buzzType, !this.shown);
        if (k8w.INSTANCE.m148752a(act) && (str = data.biz) != null) {
            switch (str.hashCode()) {
                case -1019560155:
                    if (str.equals("voiceBuzz")) {
                        haw.Companion companion = haw.INSTANCE;
                        haw hawVarM134320a = companion.m134320a();
                        String str2 = data.channelToken;
                        String str3 = data.biz;
                        str3.getClass();
                        hawVarM134320a.m134289d1(str2, str3);
                        companion.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
                case -1004163680:
                    if (str.equals("textBuzz")) {
                        haw.INSTANCE.m134320a().m134288c1(data.buzzToken);
                    }
                    break;
                case 1332422126:
                    if (str.equals("videoBuzz")) {
                        haw.Companion companion2 = haw.INSTANCE;
                        haw hawVarM134320a2 = companion2.m134320a();
                        String str4 = data.channelToken;
                        String str5 = data.biz;
                        str5.getClass();
                        hawVarM134320a2.m134289d1(str4, str5);
                        companion2.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
                case 1740758636:
                    if (str.equals("memojiBuzz")) {
                        haw.Companion companion3 = haw.INSTANCE;
                        haw hawVarM134320a3 = companion3.m134320a();
                        String str6 = data.channelToken;
                        String str7 = data.biz;
                        str7.getClass();
                        hawVarM134320a3.m134289d1(str6, str7);
                        companion3.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
            }
        }
        m48243x();
    }

    /* JADX INFO: renamed from: v */
    public final void m48241v() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        nbw nbwVar = nbw.INSTANCE;
        pf60<Boolean, Boolean> pf60VarM147494Y = jyb.m147494Y(Boolean.valueOf(!this.shown), Boolean.FALSE);
        pf60VarM147494Y.getClass();
        nbwVar.m162243k0(pf60VarM147494Y, this.buzzType, this.notifyIsInvite, j8w.INSTANCE.m143907e());
        bnl0.m105524M(this, false);
        if (this.shown) {
            return;
        }
        if (Intrinsics.m88377d(this.buzzType, "textBuzz")) {
            haw.INSTANCE.m134320a().m134271I0(true);
        } else {
            haw.INSTANCE.m134320a().m134299j1(this.buzzType);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m48242w() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m48243x() {
        m48241v();
        haw.INSTANCE.m134320a().m134319z0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
    }

    /* JADX INFO: renamed from: y */
    public final void m48244y() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        bnl0.m105525M0(this, false);
    }

    /* JADX INFO: renamed from: z */
    public final void m48245z(@Nullable final Act act, @Nullable final LoveBuzzPushData data) {
        if (k8w.INSTANCE.m148752a(act) && data != null && NullChecker.m82486a(data.contentId) && data.contentId.equals(CoreModule.m30929H().userId())) {
            haw.Companion companion = haw.INSTANCE;
            companion.m134320a().m134317x0(act);
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(data.userId);
            if (userM116503Pa == null) {
                return;
            }
            String str = data.biz;
            str.getClass();
            this.buzzType = str;
            this.notifyIsInvite = Intrinsics.m88377d(data.buzzIntent, "intl.lovebuzz.invite");
            boolean zM134267E0 = !Intrinsics.m88377d(this.buzzType, "textBuzz") ? companion.m134320a().m134267E0(this.buzzType) : companion.m134320a().m134274L0();
            this.shown = zM134267E0;
            nbw nbwVar = nbw.INSTANCE;
            pf60<Boolean, Boolean> pf60VarM147494Y = jyb.m147494Y(Boolean.valueOf(!zM134267E0), Boolean.TRUE);
            pf60VarM147494Y.getClass();
            nbwVar.m162243k0(pf60VarM147494Y, this.buzzType, this.notifyIsInvite, j8w.INSTANCE.m143907e());
            m48237r();
            final BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
            if (baseBuzzNotifyPop != null) {
                baseBuzzNotifyPop.m48216v0(act, data, userM116503Pa, new Function0() { // from class: l.raw
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m48217A(act, this, data);
                    }
                }, new Function0() { // from class: l.uaw
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m48218B(this.f178240a, act, data);
                    }
                });
                baseBuzzNotifyPop.post(new Runnable() { // from class: l.vaw
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoveBuzzNotifyUserPop.m48219C(this.f183173a, baseBuzzNotifyPop);
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
