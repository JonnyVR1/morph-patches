package com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.VoiceBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzControlView;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.aum0;
import p153l.bnl0;
import p153l.d8w;
import p153l.ebc0;
import p153l.eqx;
import p153l.haw;
import p153l.k3d0;
import p153l.k8w;
import p153l.nbw;
import p153l.o1j0;
import p153l.p9r;
import p153l.pzi0;
import p153l.vm50;
import p153l.vnb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010B\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\"\u0010F\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R\"\u0010J\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R\u0018\u0010M\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "B0", "u0", "", "speak", "H0", "(Z)V", BLiveButtonType.mute, "G0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "s0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "r0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "E0", "D0", "Ll/vm50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setControlVBListener", "(Ll/vm50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "t0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_mic", "set_mic", "_mic", "g", "get_quit", "set_quit", "_quit", "h", "get_speaker", "set_speaker", "_speaker", RXScreenCaptureService.KEY_INDEX, "get_like", "set_like", "_like", "j", "Ll/vm50;", "controlListener", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceBuzzCallControlView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LoveBuzzControlView _add_time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _add_time_count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LoveBuzzControlView _mic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LoveBuzzControlView _quit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public LoveBuzzControlView _speaker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LoveBuzzControlView _like;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public vm50 controlListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Runnable quitRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.view.VoiceBuzzCallControlView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8588a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31016a;

        static {
            int[] iArr = new int[LoveBuzzConstants$MATCH.values().length];
            try {
                iArr[LoveBuzzConstants$MATCH.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoveBuzzConstants$MATCH.ME_LIKE_PEER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31016a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48306r0(layoutInflaterM171370a, this);
        this.quitRunnable = new Runnable() { // from class: l.qtm0
            @Override // java.lang.Runnable
            public final void run() {
                VoiceBuzzCallControlView.m48291n0(this.f159467a);
            }
        };
        m48295r();
        m48296u0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m48287j0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.m48171w();
        buzzMediaCallManager.m48150f0(z);
        voiceBuzzCallControlView.m48304G0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m48288k0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        nbw.m162192V(nbw.INSTANCE, null, 1, null);
        haw.m134211N0(haw.INSTANCE.m134320a(), voiceBuzzCallControlView.m48307s0(), null, new Function0() { // from class: l.ytm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m48300z0(this.f201526a);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m48291n0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        if (k8w.INSTANCE.m148752a(voiceBuzzCallControlView.m48307s0()) && NullChecker.m82486a(voiceBuzzCallControlView.get_quit())) {
            voiceBuzzCallControlView.get_quit().m48374d(ebc0.f92854M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m48292o0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        nbw.m162201j(nbw.INSTANCE, null, 1, null);
        haw.m134224X0(haw.INSTANCE.m134320a(), voiceBuzzCallControlView.m48307s0(), new Function0() { // from class: l.wtm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m48298w0();
            }
        }, new Function0() { // from class: l.xtm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m48299y0();
            }
        }, null, 8, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m48293p0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long startTime = (eqxVarM134264B0.getStartTime() + ((long) (eqxVarM134264B0.getFrozenDuration() * 1000))) - pzi0.m174454o();
        if (startTime <= 0) {
            nbw.m162191C(nbw.INSTANCE, true, null, 2, null);
            d8w.m114937U(d8w.INSTANCE, voiceBuzzCallControlView.m48307s0(), new Function0() { // from class: l.ztm0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VoiceBuzzCallControlView.m48297v0(this.f206028a);
                }
            }, null, 4, null);
            return;
        }
        nbw.m162191C(nbw.INSTANCE, false, null, 2, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM148007c = k3d0.m148007c(R$string.f20903E0);
        strM148007c.getClass();
        o1j0.m165651y(String.format(strM148007c, Arrays.copyOf(new Object[]{Long.valueOf(C15274a.m88487c(startTime / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: q0 */
    public static void m48294q0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.m48127H();
        buzzMediaCallManager.m48148d0(z);
        voiceBuzzCallControlView.m48305H0(z);
    }

    /* JADX INFO: renamed from: r */
    private final void m48295r() {
        m48303E0();
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long startTime = (eqxVarM134264B0.getStartTime() + ((long) (eqxVarM134264B0.getFrozenDuration() * 1000))) - pzi0.m174454o();
        if (startTime > 0) {
            get_quit().m48374d(ebc0.f92853L);
            get_quit().postDelayed(this.quitRunnable, startTime);
        } else {
            get_quit().m48374d(ebc0.f92854M);
        }
        m48301B0();
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        m48304G0(buzzMediaCallManager.m48171w());
        m48305H0(buzzMediaCallManager.m48127H());
        m48302D0();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m48296u0() {
        bnl0.m105509E0(get_quit(), new View.OnClickListener() { // from class: l.rtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m48293p0(this.f164836a, view);
            }
        });
        bnl0.m105509E0(get_add_time(), new View.OnClickListener() { // from class: l.stm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m48292o0(this.f170591a, view);
            }
        });
        bnl0.m105509E0(get_mic(), new View.OnClickListener() { // from class: l.ttm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m48287j0(this.f176084a, view);
            }
        });
        bnl0.m105509E0(get_speaker(), new View.OnClickListener() { // from class: l.utm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m48294q0(this.f180980a, view);
            }
        });
        bnl0.m105509E0(get_like(), new View.OnClickListener() { // from class: l.vtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m48288k0(this.f185731a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m48297v0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        vm50 vm50Var = voiceBuzzCallControlView.controlListener;
        if (vm50Var != null) {
            vm50Var.mo151618b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m48298w0() {
        o1j0.m165649w(R$string.f20958e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m48299y0() {
        o1j0.m165649w(R$string.f20955d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m48300z0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        vm50 vm50Var = voiceBuzzCallControlView.controlListener;
        if (vm50Var != null) {
            vm50Var.mo151617a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m48301B0() {
        int iM201955o1 = (int) vnb.m201955o1(12, "Earphone ");
        get_mic().get_control_desc().setMaxLines(2);
        get_mic().get_control_desc().setMaxWidth(iM201955o1);
        get_speaker().get_control_desc().setMaxLines(2);
        get_speaker().get_control_desc().setMaxWidth(iM201955o1);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m48302D0() {
        int i = C8588a.f31016a[haw.INSTANCE.m134320a().m134264B0().getMatched().ordinal()];
        if (i == 1) {
            get_like().m48374d(ebc0.f92857P);
            get_add_time().m48374d(ebc0.f92842A);
            get_add_time().setEnabled(false);
            get_like().setEnabled(false);
            bnl0.m105524M(get_add_time_count(), false);
            return;
        }
        if (i != 2) {
            get_like().setEnabled(true);
            get_like().m48374d(ebc0.f92856O);
        } else {
            get_like().setEnabled(false);
            get_like().m48374d(ebc0.f92845D);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E0 */
    public final void m48303E0() {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            get_add_time().m48374d(ebc0.f92842A);
            bnl0.m105524M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (eqxVarM134264B0.getProlongCount() <= 0) {
                get_add_time().m48374d(ebc0.f92851J);
                bnl0.m105524M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m48374d(ebc0.f92917z);
            bnl0.m105524M(get_add_time_count(), true);
            get_add_time_count().setText("x " + eqxVarM134264B0.getProlongCount());
            get_add_time().setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m48304G0(boolean mute) {
        get_mic().m48374d(mute ? ebc0.f92858Q : ebc0.f92859R);
        get_mic().m48373c(mute ? R$string.f20909H0 : R$string.f20911I0);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m48305H0(boolean speak) {
        get_speaker().m48374d(speak ? ebc0.f92865X : ebc0.f92864W);
        get_speaker().m48373c(speak ? R$string.f20933T0 : R$string.f20931S0);
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(@Nullable View child) {
        super.detachViewFromParent(child);
        get_quit().removeCallbacks(this.quitRunnable);
    }

    @NotNull
    public final LoveBuzzControlView get_add_time() {
        LoveBuzzControlView loveBuzzControlView = this._add_time;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_add_time");
        return null;
    }

    @NotNull
    public final VText get_add_time_count() {
        VText vText = this._add_time_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_add_time_count");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_like() {
        LoveBuzzControlView loveBuzzControlView = this._like;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_like");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_mic() {
        LoveBuzzControlView loveBuzzControlView = this._mic;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_mic");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_quit");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_speaker() {
        LoveBuzzControlView loveBuzzControlView = this._speaker;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_speaker");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final View m48306r0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM100402b = aum0.m100402b(this, inflater, parent);
        viewM100402b.getClass();
        return viewM100402b;
    }

    /* JADX INFO: renamed from: s0 */
    public final VoiceBuzzAct m48307s0() {
        Context context = getContext();
        context.getClass();
        return (VoiceBuzzAct) context;
    }

    public final void setControlVBListener(@Nullable vm50 listener) {
        this.controlListener = listener;
    }

    public final void set_add_time(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._add_time = loveBuzzControlView;
    }

    public final void set_add_time_count(@NotNull VText vText) {
        vText.getClass();
        this._add_time_count = vText;
    }

    public final void set_like(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._like = loveBuzzControlView;
    }

    public final void set_mic(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._mic = loveBuzzControlView;
    }

    public final void set_quit(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._quit = loveBuzzControlView;
    }

    public final void set_speaker(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._speaker = loveBuzzControlView;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m48308t0() {
        get_quit().removeCallbacks(this.quitRunnable);
        k8w.INSTANCE.m148755d(get_add_time(), get_add_time_count(), get_mic(), get_like(), get_speaker(), get_quit());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceBuzzCallControlView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
