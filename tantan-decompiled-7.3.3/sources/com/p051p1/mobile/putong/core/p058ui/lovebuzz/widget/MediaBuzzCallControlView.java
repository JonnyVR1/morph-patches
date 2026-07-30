package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import p153l.bnl0;
import p153l.d8w;
import p153l.dqx;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u0018\u0010B\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "r0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "type", "w0", "(Ljava/lang/String;)V", "z0", "y0", "Ll/vm50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setControlVBListener", "(Ll/vm50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "q0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_quit", "set_quit", "_quit", "g", "get_like", "set_like", "_like", "h", "Ll/vm50;", "controlListener", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "buzzType", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MediaBuzzCallControlView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LoveBuzzControlView _add_time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _add_time_count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LoveBuzzControlView _quit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LoveBuzzControlView _like;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public vm50 controlListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String buzzType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public Runnable quitRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.MediaBuzzCallControlView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8598a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31092a;

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
            f31092a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48417p0(layoutInflaterM171370a, this);
        this.buzzType = "videoBuzz";
        this.quitRunnable = new Runnable() { // from class: l.vpx
            @Override // java.lang.Runnable
            public final void run() {
                MediaBuzzCallControlView.m48407l0(this.f185310a);
            }
        };
        m48411r();
        m48412r0();
    }

    private final Act act() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m48403h0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long startTime = (eqxVarM134264B0.getStartTime() + ((long) (eqxVarM134264B0.getFrozenDuration() * 1000))) - pzi0.m174454o();
        if (startTime <= 0) {
            nbw.INSTANCE.m162206B(true, mediaBuzzCallControlView.buzzType);
            d8w.INSTANCE.m114972T(mediaBuzzCallControlView.act(), new Function0() { // from class: l.bqx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaBuzzCallControlView.m48413s0(this.f77958a);
                }
            }, mediaBuzzCallControlView.buzzType);
            return;
        }
        nbw.INSTANCE.m162206B(false, mediaBuzzCallControlView.buzzType);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM148007c = k3d0.m148007c(R$string.f20903E0);
        strM148007c.getClass();
        o1j0.m165651y(String.format(strM148007c, Arrays.copyOf(new Object[]{Long.valueOf(C15274a.m88487c(startTime / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: j0 */
    public static void m48405j0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        nbw.INSTANCE.m162226U(mediaBuzzCallControlView.buzzType);
        haw.INSTANCE.m134320a().m134275M0(mediaBuzzCallControlView.act(), mediaBuzzCallControlView.buzzType, new Function0() { // from class: l.cqx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m48416v0(this.f83247a);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m48407l0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        if (k8w.INSTANCE.m148752a(mediaBuzzCallControlView.act()) && NullChecker.m82486a(mediaBuzzCallControlView.get_quit())) {
            mediaBuzzCallControlView.get_quit().m48374d(ebc0.f92854M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m48410o0(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        nbw.INSTANCE.m162239i(mediaBuzzCallControlView.buzzType);
        haw.INSTANCE.m134320a().m134281W0(mediaBuzzCallControlView.act(), new Function0() { // from class: l.zpx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m48414t0();
            }
        }, new Function0() { // from class: l.aqx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m48415u0();
            }
        }, mediaBuzzCallControlView.buzzType);
    }

    /* JADX INFO: renamed from: r */
    private final void m48411r() {
        m48421z0();
        m48419w0(this.buzzType);
        m48420y0();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m48412r0() {
        bnl0.m105509E0(get_quit(), new View.OnClickListener() { // from class: l.wpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m48403h0(this.f190357a, view);
            }
        });
        bnl0.m105509E0(get_add_time(), new View.OnClickListener() { // from class: l.xpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m48410o0(this.f195752a, view);
            }
        });
        bnl0.m105509E0(get_like(), new View.OnClickListener() { // from class: l.ypx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m48405j0(this.f201140a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m48413s0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        vm50 vm50Var = mediaBuzzCallControlView.controlListener;
        if (vm50Var != null) {
            vm50Var.mo151618b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m48414t0() {
        o1j0.m165649w(R$string.f20958e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m48415u0() {
        o1j0.m165649w(R$string.f20955d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m48416v0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        vm50 vm50Var = mediaBuzzCallControlView.controlListener;
        if (vm50Var != null) {
            vm50Var.mo151617a();
        }
        return Unit.INSTANCE;
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
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m88391r("_quit");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final View m48417p0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM117584b = dqx.m117584b(this, inflater, parent);
        viewM117584b.getClass();
        return viewM117584b;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m48418q0() {
        get_quit().removeCallbacks(this.quitRunnable);
        k8w.INSTANCE.m148755d(get_add_time(), get_add_time_count(), get_like(), get_quit());
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

    public final void set_quit(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._quit = loveBuzzControlView;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m48419w0(@NotNull String type) {
        type.getClass();
        this.buzzType = type;
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getStartTime() <= 0) {
            return;
        }
        long startTime = (eqxVarM134264B0.getStartTime() + ((long) (eqxVarM134264B0.getFrozenDuration() * 1000))) - pzi0.m174454o();
        if (startTime <= 0) {
            get_quit().m48374d(ebc0.f92854M);
        } else {
            get_quit().m48374d(ebc0.f92853L);
            get_quit().postDelayed(this.quitRunnable, startTime);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m48420y0() {
        int i = C8598a.f31092a[haw.INSTANCE.m134320a().m134264B0().getMatched().ordinal()];
        if (i == 1) {
            get_like().m48374d(ebc0.f92857P);
            get_add_time().m48374d(ebc0.f92843B);
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
    /* JADX INFO: renamed from: z0 */
    public final void m48421z0() {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            get_add_time().m48374d(ebc0.f92843B);
            bnl0.m105524M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (eqxVarM134264B0.getProlongCount() <= 0) {
                get_add_time().m48374d(ebc0.f92852K);
                bnl0.m105524M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m48374d(ebc0.f92844C);
            bnl0.m105524M(get_add_time_count(), true);
            get_add_time_count().setText("x " + eqxVarM134264B0.getProlongCount());
            get_add_time().setEnabled(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaBuzzCallControlView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
