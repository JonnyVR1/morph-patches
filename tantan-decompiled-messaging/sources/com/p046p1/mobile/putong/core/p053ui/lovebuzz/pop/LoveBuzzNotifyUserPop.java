package com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p149l.bt0;
import p149l.j760;
import p149l.j8w;
import p149l.l6w;
import p149l.m6w;
import p149l.osi0;
import p149l.p9w;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0012J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u0014R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", BaseSei.f13932Z, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", ResourceDirection.f38808v, "()V", BaseSei.f13931Y, "", "type", "", "q", "(Ljava/lang/String;)Z", "w", "Landroid/view/View;", Careers.f38732it, "p", "(Landroid/view/View;)V", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Lcom/p1/mobile/android/app/Act;)V", "m", "u", BaseSei.f13930X, "r", "o", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "a", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "popView", "b", "Z", "shown", "c", "Ljava/lang/String;", "buzzType", Constants.INAPP_DATA_TAG, "notifyIsInvite", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        m47059w();
        this.buzzType = "";
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m47034A(Act act, LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData) {
        if (!m6w.INSTANCE.m153296a(act)) {
            loveBuzzNotifyUserPop.m47060x();
            return Unit.INSTANCE;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(false);
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop2 = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop2 != null) {
            baseBuzzNotifyPop2.m47027o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m47056t(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m47035B(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47027o0();
        }
        act.getClass();
        loveBuzzNotifyUserPop.m47057u(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m47036C(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, BaseBuzzNotifyPop baseBuzzNotifyPop) {
        xdl0.m208344M(loveBuzzNotifyUserPop, true);
        loveBuzzNotifyUserPop.m47052p(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m47037a(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act, int i) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        BuzzMediaCallManager.INSTANCE.m46964c0();
        if (i == 100021) {
            j8w.Companion companion = j8w.INSTANCE;
            companion.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
            loveBuzzNotifyUserPop.m47060x();
            osi0.m165782f(R$string.f20192U);
            j8w j8wVarM140473a = companion.m140473a();
            String str = loveBuzzPushData.biz;
            str.getClass();
            j8w.m140404p0(j8wVarM140473a, str, act, new Function0() { // from class: l.v8w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m47049n();
                }
            }, null, false, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m47038b(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, LoveBuzzPushData loveBuzzPushData, Act act) {
        loveBuzzNotifyUserPop.m47055s(loveBuzzPushData, act);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m47040d(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.m167937j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        loveBuzzNotifyUserPop.m47060x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m47041e(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.m167937j0(loveBuzzNotifyUserPop.buzzType, true, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m47042f(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        loveBuzzNotifyUserPop.m47060x();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m47044h(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, Act act, LoveBuzzPushData loveBuzzPushData) {
        loveBuzzNotifyUserPop.m47050m(act, loveBuzzPushData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m47045i(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m47047k(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        p9w.INSTANCE.m167937j0(loveBuzzNotifyUserPop.buzzType, false, !loveBuzzNotifyUserPop.shown);
        BaseBuzzNotifyPop baseBuzzNotifyPop = loveBuzzNotifyUserPop.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.m47026n0(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m47049n() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m47050m(final Act act, final LoveBuzzPushData data) {
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        String str = data.channelToken;
        String str2 = data.biz;
        str2.getClass();
        j8w.m140378Y(j8wVarM140473a, act, str, str2, new Function0() { // from class: l.e9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m47042f(this.f90151a);
            }
        }, new Function1() { // from class: l.u8w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoveBuzzNotifyUserPop.m47037a(this.f175171a, data, act, ((Integer) obj).intValue());
            }
        }, false, 32, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m47051o() {
        Context context = getContext();
        context.getClass();
        BaseBuzzNotifyPop baseBuzzNotifyPop = new BaseBuzzNotifyPop(context);
        this.popView = baseBuzzNotifyPop;
        addView(baseBuzzNotifyPop);
    }

    /* JADX INFO: renamed from: p */
    public final void m47052p(View it) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(bt0.f77155b);
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
    public final boolean m47053q(@NotNull String type) {
        type.getClass();
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop == null || TextUtils.equals(baseBuzzNotifyPop.getType(), type)) {
            return xdl0.m208349O0(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m47054r() {
        if (this.popView == null) {
            removeAllViews();
            m47051o();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m47055s(final LoveBuzzPushData data, final Act act) {
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        String str = data.biz;
        str.getClass();
        j8wVarM140473a.m140458o0(str, act, new Function0() { // from class: l.c9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m47044h(this.f79977a, act, data);
            }
        }, new Function0() { // from class: l.d9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoveBuzzNotifyUserPop.m47045i(this.f85160a);
            }
        }, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public final void m47056t(final Act act, final LoveBuzzPushData data) {
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
                        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
                        String str2 = data.buzzToken;
                        p9w p9wVar = p9w.INSTANCE;
                        String str3 = data.biz;
                        str3.getClass();
                        j8w.m140407r0(j8wVarM140473a, act, str2, data, p9wVar.m167964y(str3), new Function0() { // from class: l.y8w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m47040d(this.f196888a);
                            }
                        }, new Function0() { // from class: l.z8w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m47047k(this.f202241a);
                            }
                        }, new Function0() { // from class: l.a9w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LoveBuzzNotifyUserPop.m47041e(this.f68214a);
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
            p9w p9wVar2 = p9w.INSTANCE;
            p9wVar2.m167937j0(this.buzzType, false, !this.shown);
            j8w j8wVarM140473a2 = j8w.INSTANCE.m140473a();
            String str4 = data.biz;
            str4.getClass();
            String str5 = data.biz;
            str5.getClass();
            if (j8w.m140400m0(j8wVarM140473a2, str4, act, false, p9wVar2.m167964y(str5), null, new Function0() { // from class: l.b9w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoveBuzzNotifyUserPop.m47038b(this.f74633a, data, act);
                }
            }, 16, null)) {
                m47055s(data, act);
                return;
            }
            BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
            if (baseBuzzNotifyPop != null) {
                baseBuzzNotifyPop.m47026n0(true);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public final void m47057u(Act act, LoveBuzzPushData data) {
        String str;
        p9w.INSTANCE.m167936i0(this.buzzType, !this.shown);
        if (m6w.INSTANCE.m153296a(act) && (str = data.biz) != null) {
            switch (str.hashCode()) {
                case -1019560155:
                    if (str.equals("voiceBuzz")) {
                        j8w.Companion companion = j8w.INSTANCE;
                        j8w j8wVarM140473a = companion.m140473a();
                        String str2 = data.channelToken;
                        String str3 = data.biz;
                        str3.getClass();
                        j8wVarM140473a.m140442d1(str2, str3);
                        companion.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
                case -1004163680:
                    if (str.equals("textBuzz")) {
                        j8w.INSTANCE.m140473a().m140441c1(data.buzzToken);
                    }
                    break;
                case 1332422126:
                    if (str.equals("videoBuzz")) {
                        j8w.Companion companion2 = j8w.INSTANCE;
                        j8w j8wVarM140473a2 = companion2.m140473a();
                        String str4 = data.channelToken;
                        String str5 = data.biz;
                        str5.getClass();
                        j8wVarM140473a2.m140442d1(str4, str5);
                        companion2.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
                case 1740758636:
                    if (str.equals("memojiBuzz")) {
                        j8w.Companion companion3 = j8w.INSTANCE;
                        j8w j8wVarM140473a3 = companion3.m140473a();
                        String str6 = data.channelToken;
                        String str7 = data.biz;
                        str7.getClass();
                        j8wVarM140473a3.m140442d1(str6, str7);
                        companion3.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
                    }
                    break;
            }
        }
        m47060x();
    }

    /* JADX INFO: renamed from: v */
    public final void m47058v() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        p9w p9wVar = p9w.INSTANCE;
        j760<Boolean, Boolean> j760VarM200311Y = vwb.m200311Y(Boolean.valueOf(!this.shown), Boolean.FALSE);
        j760VarM200311Y.getClass();
        p9wVar.m167939k0(j760VarM200311Y, this.buzzType, this.notifyIsInvite, l6w.INSTANCE.m148776e());
        xdl0.m208344M(this, false);
        if (this.shown) {
            return;
        }
        if (Intrinsics.m87488d(this.buzzType, "textBuzz")) {
            j8w.INSTANCE.m140473a().m140424I0(true);
        } else {
            j8w.INSTANCE.m140473a().m140452j1(this.buzzType);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m47059w() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m47060x() {
        m47058v();
        j8w.INSTANCE.m140473a().m140472z0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
    }

    /* JADX INFO: renamed from: y */
    public final void m47061y() {
        if (getVisibility() != 0) {
            return;
        }
        BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
        if (baseBuzzNotifyPop != null) {
            baseBuzzNotifyPop.clearAnimation();
        }
        xdl0.m208345M0(this, false);
    }

    /* JADX INFO: renamed from: z */
    public final void m47062z(@Nullable final Act act, @Nullable final LoveBuzzPushData data) {
        if (m6w.INSTANCE.m153296a(act) && data != null && NullChecker.m81303a(data.contentId) && data.contentId.equals(CoreModule.m29931H().userId())) {
            j8w.Companion companion = j8w.INSTANCE;
            companion.m140473a().m140470x0(act);
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(data.userId);
            if (userM169430Pa == null) {
                return;
            }
            String str = data.biz;
            str.getClass();
            this.buzzType = str;
            this.notifyIsInvite = Intrinsics.m87488d(data.buzzIntent, "intl.lovebuzz.invite");
            boolean zM140420E0 = !Intrinsics.m87488d(this.buzzType, "textBuzz") ? companion.m140473a().m140420E0(this.buzzType) : companion.m140473a().m140427L0();
            this.shown = zM140420E0;
            p9w p9wVar = p9w.INSTANCE;
            j760<Boolean, Boolean> j760VarM200311Y = vwb.m200311Y(Boolean.valueOf(!zM140420E0), Boolean.TRUE);
            j760VarM200311Y.getClass();
            p9wVar.m167939k0(j760VarM200311Y, this.buzzType, this.notifyIsInvite, l6w.INSTANCE.m148776e());
            m47054r();
            final BaseBuzzNotifyPop baseBuzzNotifyPop = this.popView;
            if (baseBuzzNotifyPop != null) {
                baseBuzzNotifyPop.m47033v0(act, data, userM169430Pa, new Function0() { // from class: l.t8w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m47034A(act, this, data);
                    }
                }, new Function0() { // from class: l.w8w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoveBuzzNotifyUserPop.m47035B(this.f185272a, act, data);
                    }
                });
                baseBuzzNotifyPop.post(new Runnable() { // from class: l.x8w
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoveBuzzNotifyUserPop.m47036C(this.f191561a, baseBuzzNotifyPop);
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
