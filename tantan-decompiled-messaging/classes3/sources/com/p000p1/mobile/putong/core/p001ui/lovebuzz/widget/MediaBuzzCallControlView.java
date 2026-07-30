package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.manager.LoveBuzzConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.a;
import l.f6w;
import l.ghx;
import l.hhx;
import l.hvc0;
import l.j8w;
import l.lsi0;
import l.m6w;
import l.mqi0;
import l.o7r;
import l.oe50;
import l.p9w;
import l.xdl0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VText;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u0018\u0010B\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "r0", "Lcom/p1/mobile/android/app/Act;", "act", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", IjkMediaMeta.IJKM_KEY_TYPE, "w0", "(Ljava/lang/String;)V", "z0", "y0", "Ll/oe50;", "listener", "setControlVBListener", "(Ll/oe50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "q0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "d", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_quit", "set_quit", "_quit", "g", "get_like", "set_like", "_like", XHTMLElement.XPATH_PREFIX, "Ll/oe50;", "controlListener", "i", "Ljava/lang/String;", "buzzType", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public oe50 controlListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String buzzType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public Runnable quitRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.MediaBuzzCallControlView$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0018a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135a;

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
            f135a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m264p0(layoutInflaterA, this);
        this.buzzType = "videoBuzz";
        this.quitRunnable = new Runnable() { // from class: l.ygx
            @Override // java.lang.Runnable
            public final void run() {
                MediaBuzzCallControlView.m254l0(this.f9069a);
            }
        };
        m258r();
        m259r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Act act() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m250h0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long j = (hhxVarB0.j() + ((long) (hhxVarB0.d() * 1000))) - mqi0.o();
        if (j <= 0) {
            p9w.INSTANCE.B(true, mediaBuzzCallControlView.buzzType);
            f6w.INSTANCE.T(mediaBuzzCallControlView.act(), new Function0() { // from class: l.ehx
                public final Object invoke() {
                    return MediaBuzzCallControlView.m260s0(this.f3277a);
                }
            }, mediaBuzzCallControlView.buzzType);
            return;
        }
        p9w.INSTANCE.B(false, mediaBuzzCallControlView.buzzType);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strC = hvc0.c(R.string.E0);
        strC.getClass();
        lsi0.y(String.format(strC, Arrays.copyOf(new Object[]{Long.valueOf(a.c(j / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: j0 */
    public static void m252j0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        p9w.INSTANCE.U(mediaBuzzCallControlView.buzzType);
        j8w.Companion.a().M0(mediaBuzzCallControlView.act(), mediaBuzzCallControlView.buzzType, new Function0() { // from class: l.fhx
            public final Object invoke() {
                return MediaBuzzCallControlView.m263v0(this.f3624a);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m254l0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        if (m6w.INSTANCE.a(mediaBuzzCallControlView.act()) && NullChecker.a(mediaBuzzCallControlView.get_quit())) {
            mediaBuzzCallControlView.get_quit().m220d(y2c0.M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m257o0(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        p9w.INSTANCE.i(mediaBuzzCallControlView.buzzType);
        j8w.Companion.a().W0(mediaBuzzCallControlView.act(), new Function0() { // from class: l.chx
            public final Object invoke() {
                return MediaBuzzCallControlView.m261t0();
            }
        }, new Function0() { // from class: l.dhx
            public final Object invoke() {
                return MediaBuzzCallControlView.m262u0();
            }
        }, mediaBuzzCallControlView.buzzType);
    }

    /* JADX INFO: renamed from: r */
    private final void m258r() {
        m268z0();
        m266w0(this.buzzType);
        m267y0();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m259r0() {
        xdl0.E0(get_quit(), new View.OnClickListener() { // from class: l.zgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m250h0(this.f9360a, view);
            }
        });
        xdl0.E0(get_add_time(), new View.OnClickListener() { // from class: l.ahx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m257o0(this.f2211a, view);
            }
        });
        xdl0.E0(get_like(), new View.OnClickListener() { // from class: l.bhx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m252j0(this.f2396a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m260s0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        oe50 oe50Var = mediaBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m261t0() {
        lsi0.w(R.string.e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m262u0() {
        lsi0.w(R.string.d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m263v0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        oe50 oe50Var = mediaBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.a();
        }
        return Unit.INSTANCE;
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
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.r("_quit");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final View m264p0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = ghx.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m265q0() {
        get_quit().removeCallbacks(this.quitRunnable);
        m6w.INSTANCE.d(new View[]{get_add_time(), get_add_time_count(), get_like(), get_quit()});
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

    public final void set_quit(@NotNull LoveBuzzControlView loveBuzzControlView) {
        loveBuzzControlView.getClass();
        this._quit = loveBuzzControlView;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m266w0(@NotNull String type) {
        type.getClass();
        this.buzzType = type;
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.j() <= 0) {
            return;
        }
        long j = (hhxVarB0.j() + ((long) (hhxVarB0.d() * 1000))) - mqi0.o();
        if (j <= 0) {
            get_quit().m220d(y2c0.M);
        } else {
            get_quit().m220d(y2c0.L);
            get_quit().postDelayed(this.quitRunnable, j);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m267y0() {
        int i = C0018a.f135a[j8w.Companion.a().B0().f().ordinal()];
        if (i == 1) {
            get_like().m220d(y2c0.P);
            get_add_time().m220d(y2c0.B);
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
    /* JADX INFO: renamed from: z0 */
    public final void m268z0() {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED) {
            get_add_time().m220d(y2c0.B);
            xdl0.M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (hhxVarB0.i() <= 0) {
                get_add_time().m220d(y2c0.K);
                xdl0.M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m220d(y2c0.C);
            xdl0.M(get_add_time_count(), true);
            get_add_time_count().setText("x " + hhxVarB0.i());
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
