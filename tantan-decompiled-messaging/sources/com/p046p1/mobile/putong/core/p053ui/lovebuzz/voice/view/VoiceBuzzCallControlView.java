package com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.VoiceBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzControlView;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.f6w;
import p149l.hhx;
import p149l.hmb;
import p149l.hvc0;
import p149l.j8w;
import p149l.lsi0;
import p149l.m6w;
import p149l.mqi0;
import p149l.o7r;
import p149l.oe50;
import p149l.p9w;
import p149l.wkm0;
import p149l.xdl0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010B\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\"\u0010F\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R\"\u0010J\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R\u0018\u0010M\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "B0", "u0", "", "speak", "H0", "(Z)V", BLiveButtonType.mute, "G0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "s0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "r0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "E0", "D0", "Ll/oe50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setControlVBListener", "(Ll/oe50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "t0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_mic", "set_mic", "_mic", "g", "get_quit", "set_quit", "_quit", "h", "get_speaker", "set_speaker", "_speaker", RXScreenCaptureService.KEY_INDEX, "get_like", "set_like", "_like", "j", "Ll/oe50;", "controlListener", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public oe50 controlListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Runnable quitRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.view.VoiceBuzzCallControlView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8425a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30168a;

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
            f30168a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47123r0(layoutInflaterM163037a, this);
        this.quitRunnable = new Runnable() { // from class: l.mkm0
            @Override // java.lang.Runnable
            public final void run() {
                VoiceBuzzCallControlView.m47108n0(this.f134361a);
            }
        };
        m47112r();
        m47113u0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m47104j0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.m46988w();
        buzzMediaCallManager.m46967f0(z);
        voiceBuzzCallControlView.m47121G0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m47105k0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        p9w.m167888V(p9w.INSTANCE, null, 1, null);
        j8w.m140364N0(j8w.INSTANCE.m140473a(), voiceBuzzCallControlView.m47124s0(), null, new Function0() { // from class: l.ukm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m47117z0(this.f176946a);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m47108n0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        if (m6w.INSTANCE.m153296a(voiceBuzzCallControlView.m47124s0()) && NullChecker.m81303a(voiceBuzzCallControlView.get_quit())) {
            voiceBuzzCallControlView.get_quit().m47191d(y2c0.f195532M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m47109o0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        p9w.m167897j(p9w.INSTANCE, null, 1, null);
        j8w.m140377X0(j8w.INSTANCE.m140473a(), voiceBuzzCallControlView.m47124s0(), new Function0() { // from class: l.skm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m47115w0();
            }
        }, new Function0() { // from class: l.tkm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m47116y0();
            }
        }, null, 8, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m47110p0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long startTime = (hhxVarM140417B0.getStartTime() + ((long) (hhxVarM140417B0.getFrozenDuration() * 1000))) - mqi0.m155944o();
        if (startTime <= 0) {
            p9w.m167887C(p9w.INSTANCE, true, null, 2, null);
            f6w.m119652U(f6w.INSTANCE, voiceBuzzCallControlView.m47124s0(), new Function0() { // from class: l.vkm0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VoiceBuzzCallControlView.m47114v0(this.f181829a);
                }
            }, null, 4, null);
            return;
        }
        p9w.m167887C(p9w.INSTANCE, false, null, 2, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM133156c = hvc0.m133156c(R$string.f20161E0);
        strM133156c.getClass();
        lsi0.m151595y(String.format(strM133156c, Arrays.copyOf(new Object[]{Long.valueOf(C15167a.m87597c(startTime / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: q0 */
    public static void m47111q0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.m46944H();
        buzzMediaCallManager.m46965d0(z);
        voiceBuzzCallControlView.m47122H0(z);
    }

    /* JADX INFO: renamed from: r */
    private final void m47112r() {
        m47120E0();
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long startTime = (hhxVarM140417B0.getStartTime() + ((long) (hhxVarM140417B0.getFrozenDuration() * 1000))) - mqi0.m155944o();
        if (startTime > 0) {
            get_quit().m47191d(y2c0.f195531L);
            get_quit().postDelayed(this.quitRunnable, startTime);
        } else {
            get_quit().m47191d(y2c0.f195532M);
        }
        m47118B0();
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        m47121G0(buzzMediaCallManager.m46988w());
        m47122H0(buzzMediaCallManager.m46944H());
        m47119D0();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m47113u0() {
        xdl0.m208329E0(get_quit(), new View.OnClickListener() { // from class: l.nkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m47110p0(this.f139451a, view);
            }
        });
        xdl0.m208329E0(get_add_time(), new View.OnClickListener() { // from class: l.okm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m47109o0(this.f144452a, view);
            }
        });
        xdl0.m208329E0(get_mic(), new View.OnClickListener() { // from class: l.pkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m47104j0(this.f150010a, view);
            }
        });
        xdl0.m208329E0(get_speaker(), new View.OnClickListener() { // from class: l.qkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m47111q0(this.f155147a, view);
            }
        });
        xdl0.m208329E0(get_like(), new View.OnClickListener() { // from class: l.rkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m47105k0(this.f159873a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m47114v0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        oe50 oe50Var = voiceBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.mo126823b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m47115w0() {
        lsi0.m151593w(R$string.f20216e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m47116y0() {
        lsi0.m151593w(R$string.f20213d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m47117z0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        oe50 oe50Var = voiceBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.mo126822a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m47118B0() {
        int iM131710o1 = (int) hmb.m131710o1(12, "Earphone ");
        get_mic().get_control_desc().setMaxLines(2);
        get_mic().get_control_desc().setMaxWidth(iM131710o1);
        get_speaker().get_control_desc().setMaxLines(2);
        get_speaker().get_control_desc().setMaxWidth(iM131710o1);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m47119D0() {
        int i = C8425a.f30168a[j8w.INSTANCE.m140473a().m140417B0().getMatched().ordinal()];
        if (i == 1) {
            get_like().m47191d(y2c0.f195535P);
            get_add_time().m47191d(y2c0.f195520A);
            get_add_time().setEnabled(false);
            get_like().setEnabled(false);
            xdl0.m208344M(get_add_time_count(), false);
            return;
        }
        if (i != 2) {
            get_like().setEnabled(true);
            get_like().m47191d(y2c0.f195534O);
        } else {
            get_like().setEnabled(false);
            get_like().m47191d(y2c0.f195523D);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E0 */
    public final void m47120E0() {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            get_add_time().m47191d(y2c0.f195520A);
            xdl0.m208344M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (hhxVarM140417B0.getProlongCount() <= 0) {
                get_add_time().m47191d(y2c0.f195529J);
                xdl0.m208344M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m47191d(y2c0.f195595z);
            xdl0.m208344M(get_add_time_count(), true);
            get_add_time_count().setText("x " + hhxVarM140417B0.getProlongCount());
            get_add_time().setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m47121G0(boolean mute) {
        get_mic().m47191d(mute ? y2c0.f195536Q : y2c0.f195537R);
        get_mic().m47190c(mute ? R$string.f20167H0 : R$string.f20169I0);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m47122H0(boolean speak) {
        get_speaker().m47191d(speak ? y2c0.f195543X : y2c0.f195542W);
        get_speaker().m47190c(speak ? R$string.f20191T0 : R$string.f20189S0);
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
        Intrinsics.m87502r("_add_time");
        return null;
    }

    @NotNull
    public final VText get_add_time_count() {
        VText vText = this._add_time_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_add_time_count");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_like() {
        LoveBuzzControlView loveBuzzControlView = this._like;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m87502r("_like");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_mic() {
        LoveBuzzControlView loveBuzzControlView = this._mic;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m87502r("_mic");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m87502r("_quit");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_speaker() {
        LoveBuzzControlView loveBuzzControlView = this._speaker;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m87502r("_speaker");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final View m47123r0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM203685b = wkm0.m203685b(this, inflater, parent);
        viewM203685b.getClass();
        return viewM203685b;
    }

    /* JADX INFO: renamed from: s0 */
    public final VoiceBuzzAct m47124s0() {
        Context context = getContext();
        context.getClass();
        return (VoiceBuzzAct) context;
    }

    public final void setControlVBListener(@Nullable oe50 listener) {
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
    public final void m47125t0() {
        get_quit().removeCallbacks(this.quitRunnable);
        m6w.INSTANCE.m153299d(get_add_time(), get_add_time_count(), get_mic(), get_like(), get_speaker(), get_quit());
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
