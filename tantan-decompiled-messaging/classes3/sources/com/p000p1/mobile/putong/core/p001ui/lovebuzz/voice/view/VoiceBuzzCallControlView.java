package com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.VoiceBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzControlView;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.manager.LoveBuzzConstants;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.a;
import l.f6w;
import l.hhx;
import l.hmb;
import l.hvc0;
import l.j8w;
import l.lsi0;
import l.m6w;
import l.mqi0;
import l.o7r;
import l.oe50;
import l.p9w;
import l.wkm0;
import l.xdl0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010B\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\"\u0010F\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R\"\u0010J\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R\u0018\u0010M\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "B0", "u0", "", "speak", "H0", "(Z)V", "mute", "G0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "s0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "r0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "E0", "D0", "Ll/oe50;", "listener", "setControlVBListener", "(Ll/oe50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "t0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "d", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_mic", "set_mic", "_mic", "g", "get_quit", "set_quit", "_quit", XHTMLElement.XPATH_PREFIX, "get_speaker", "set_speaker", "_speaker", "i", "get_like", "set_like", "_like", "j", "Ll/oe50;", "controlListener", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0008a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59a;

        static {
            int[] iArr = new int[LoveBuzzConstants.MATCH.values().length];
            try {
                iArr[LoveBuzzConstants.MATCH.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoveBuzzConstants.MATCH.ME_LIKE_PEER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m148r0(layoutInflaterA, this);
        this.quitRunnable = new Runnable() { // from class: l.mkm0
            @Override // java.lang.Runnable
            public final void run() {
                VoiceBuzzCallControlView.m133n0(this.f5682a);
            }
        };
        m137r();
        m138u0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m129j0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.w();
        buzzMediaCallManager.f0(z);
        voiceBuzzCallControlView.m146G0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m130k0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        p9w.V(p9w.INSTANCE, (String) null, 1, (Object) null);
        j8w.N0(j8w.Companion.a(), voiceBuzzCallControlView.m149s0(), (String) null, new Function0() { // from class: l.ukm0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m142z0(this.f8006a);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m133n0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        if (m6w.INSTANCE.a(voiceBuzzCallControlView.m149s0()) && NullChecker.a(voiceBuzzCallControlView.get_quit())) {
            voiceBuzzCallControlView.get_quit().m220d(y2c0.M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m134o0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        p9w.j(p9w.INSTANCE, (String) null, 1, (Object) null);
        j8w.X0(j8w.Companion.a(), voiceBuzzCallControlView.m149s0(), new Function0() { // from class: l.skm0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m140w0();
            }
        }, new Function0() { // from class: l.tkm0
            public final Object invoke() {
                return VoiceBuzzCallControlView.m141y0();
            }
        }, (String) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m135p0(final VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long j = (hhxVarB0.j() + ((long) (hhxVarB0.d() * 1000))) - mqi0.o();
        if (j <= 0) {
            p9w.C(p9w.INSTANCE, true, (String) null, 2, (Object) null);
            f6w.U(f6w.INSTANCE, voiceBuzzCallControlView.m149s0(), new Function0() { // from class: l.vkm0
                public final Object invoke() {
                    return VoiceBuzzCallControlView.m139v0(this.f8346a);
                }
            }, (String) null, 4, (Object) null);
            return;
        }
        p9w.C(p9w.INSTANCE, false, (String) null, 2, (Object) null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strC = hvc0.c(R.string.E0);
        strC.getClass();
        lsi0.y(String.format(strC, Arrays.copyOf(new Object[]{Long.valueOf(a.c(j / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: q0 */
    public static void m136q0(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        boolean z = !buzzMediaCallManager.H();
        buzzMediaCallManager.d0(z);
        voiceBuzzCallControlView.m147H0(z);
    }

    /* JADX INFO: renamed from: r */
    private final void m137r() {
        m145E0();
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long j = (hhxVarB0.j() + ((long) (hhxVarB0.d() * 1000))) - mqi0.o();
        if (j > 0) {
            get_quit().m220d(y2c0.L);
            get_quit().postDelayed(this.quitRunnable, j);
        } else {
            get_quit().m220d(y2c0.M);
        }
        m143B0();
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        m146G0(buzzMediaCallManager.w());
        m147H0(buzzMediaCallManager.H());
        m144D0();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m138u0() {
        xdl0.E0(get_quit(), new View.OnClickListener() { // from class: l.nkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m135p0(this.f5920a, view);
            }
        });
        xdl0.E0(get_add_time(), new View.OnClickListener() { // from class: l.okm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m134o0(this.f6179a, view);
            }
        });
        xdl0.E0(get_mic(), new View.OnClickListener() { // from class: l.pkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m129j0(this.f6454a, view);
            }
        });
        xdl0.E0(get_speaker(), new View.OnClickListener() { // from class: l.qkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m136q0(this.f6650a, view);
            }
        });
        xdl0.E0(get_like(), new View.OnClickListener() { // from class: l.rkm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceBuzzCallControlView.m130k0(this.f6976a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m139v0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        oe50 oe50Var = voiceBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m140w0() {
        lsi0.w(R.string.e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m141y0() {
        lsi0.w(R.string.d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m142z0(VoiceBuzzCallControlView voiceBuzzCallControlView) {
        oe50 oe50Var = voiceBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m143B0() {
        int iO1 = (int) hmb.o1(12, "Earphone ");
        get_mic().get_control_desc().setMaxLines(2);
        get_mic().get_control_desc().setMaxWidth(iO1);
        get_speaker().get_control_desc().setMaxLines(2);
        get_speaker().get_control_desc().setMaxWidth(iO1);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m144D0() {
        int i = C0008a.f59a[j8w.Companion.a().B0().f().ordinal()];
        if (i == 1) {
            get_like().m220d(y2c0.P);
            get_add_time().m220d(y2c0.A);
            get_add_time().setEnabled(false);
            get_like().setEnabled(false);
            xdl0.M(get_add_time_count(), false);
            return;
        }
        if (i != 2) {
            get_like().setEnabled(true);
            get_like().m220d(y2c0.O);
        } else {
            get_like().setEnabled(false);
            get_like().m220d(y2c0.D);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E0 */
    public final void m145E0() {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED) {
            get_add_time().m220d(y2c0.A);
            xdl0.M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (hhxVarB0.i() <= 0) {
                get_add_time().m220d(y2c0.J);
                xdl0.M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m220d(y2c0.z);
            xdl0.M(get_add_time_count(), true);
            get_add_time_count().setText("x " + hhxVarB0.i());
            get_add_time().setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m146G0(boolean mute) {
        get_mic().m220d(mute ? y2c0.Q : y2c0.R);
        get_mic().m219c(mute ? R.string.H0 : R.string.I0);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m147H0(boolean speak) {
        get_speaker().m220d(speak ? y2c0.X : y2c0.W);
        get_speaker().m219c(speak ? R.string.T0 : R.string.S0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void detachViewFromParent(@Nullable View child) {
        super/*android.view.ViewGroup*/.detachViewFromParent(child);
        get_quit().removeCallbacks(this.quitRunnable);
    }

    @NotNull
    public final LoveBuzzControlView get_add_time() {
        LoveBuzzControlView loveBuzzControlView = this._add_time;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_add_time");
        return null;
    }

    @NotNull
    public final VText get_add_time_count() {
        VText vText = this._add_time_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_add_time_count");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_like() {
        LoveBuzzControlView loveBuzzControlView = this._like;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_like");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_mic() {
        LoveBuzzControlView loveBuzzControlView = this._mic;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_mic");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_quit");
        return null;
    }

    @NotNull
    public final LoveBuzzControlView get_speaker() {
        LoveBuzzControlView loveBuzzControlView = this._speaker;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_speaker");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final View m148r0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = wkm0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final VoiceBuzzAct m149s0() {
        Object context = getContext();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m150t0() {
        get_quit().removeCallbacks(this.quitRunnable);
        m6w.INSTANCE.d(new View[]{get_add_time(), get_add_time_count(), get_mic(), get_like(), get_speaker(), get_quit()});
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
