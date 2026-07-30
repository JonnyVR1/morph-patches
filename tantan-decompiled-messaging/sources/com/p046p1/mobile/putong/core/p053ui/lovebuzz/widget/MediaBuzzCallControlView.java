package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import p149l.ghx;
import p149l.hhx;
import p149l.hvc0;
import p149l.j8w;
import p149l.lsi0;
import p149l.m6w;
import p149l.mqi0;
import p149l.o7r;
import p149l.oe50;
import p149l.p9w;
import p149l.xdl0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u0018\u0010B\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "r0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "type", "w0", "(Ljava/lang/String;)V", "z0", "y0", "Ll/oe50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setControlVBListener", "(Ll/oe50;)V", "child", "detachViewFromParent", "(Landroid/view/View;)V", "q0", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "get_add_time", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;", "set_add_time", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzControlView;)V", "_add_time", "Lv/VText;", "e", "Lv/VText;", "get_add_time_count", "()Lv/VText;", "set_add_time_count", "(Lv/VText;)V", "_add_time_count", "f", "get_quit", "set_quit", "_quit", "g", "get_like", "set_like", "_like", "h", "Ll/oe50;", "controlListener", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "buzzType", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "quitRunnable", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8435a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30244a;

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
            f30244a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBuzzCallControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47234p0(layoutInflaterM163037a, this);
        this.buzzType = "videoBuzz";
        this.quitRunnable = new Runnable() { // from class: l.ygx
            @Override // java.lang.Runnable
            public final void run() {
                MediaBuzzCallControlView.m47224l0(this.f198257a);
            }
        };
        m47228r();
        m47229r0();
    }

    private final Act act() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m47220h0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long startTime = (hhxVarM140417B0.getStartTime() + ((long) (hhxVarM140417B0.getFrozenDuration() * 1000))) - mqi0.m155944o();
        if (startTime <= 0) {
            p9w.INSTANCE.m167902B(true, mediaBuzzCallControlView.buzzType);
            f6w.INSTANCE.m119687T(mediaBuzzCallControlView.act(), new Function0() { // from class: l.ehx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaBuzzCallControlView.m47230s0(this.f91522a);
                }
            }, mediaBuzzCallControlView.buzzType);
            return;
        }
        p9w.INSTANCE.m167902B(false, mediaBuzzCallControlView.buzzType);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM133156c = hvc0.m133156c(R$string.f20161E0);
        strM133156c.getClass();
        lsi0.m151595y(String.format(strM133156c, Arrays.copyOf(new Object[]{Long.valueOf(C15167a.m87597c(startTime / 1000, 1L))}, 1)));
    }

    /* JADX INFO: renamed from: j0 */
    public static void m47222j0(final MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        p9w.INSTANCE.m167922U(mediaBuzzCallControlView.buzzType);
        j8w.INSTANCE.m140473a().m140428M0(mediaBuzzCallControlView.act(), mediaBuzzCallControlView.buzzType, new Function0() { // from class: l.fhx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m47233v0(this.f97583a);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m47224l0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        if (m6w.INSTANCE.m153296a(mediaBuzzCallControlView.act()) && NullChecker.m81303a(mediaBuzzCallControlView.get_quit())) {
            mediaBuzzCallControlView.get_quit().m47191d(y2c0.f195532M);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m47227o0(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        p9w.INSTANCE.m167935i(mediaBuzzCallControlView.buzzType);
        j8w.INSTANCE.m140473a().m140434W0(mediaBuzzCallControlView.act(), new Function0() { // from class: l.chx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m47231t0();
            }
        }, new Function0() { // from class: l.dhx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaBuzzCallControlView.m47232u0();
            }
        }, mediaBuzzCallControlView.buzzType);
    }

    /* JADX INFO: renamed from: r */
    private final void m47228r() {
        m47238z0();
        m47236w0(this.buzzType);
        m47237y0();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m47229r0() {
        xdl0.m208329E0(get_quit(), new View.OnClickListener() { // from class: l.zgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m47220h0(this.f203102a, view);
            }
        });
        xdl0.m208329E0(get_add_time(), new View.OnClickListener() { // from class: l.ahx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m47227o0(this.f69936a, view);
            }
        });
        xdl0.m208329E0(get_like(), new View.OnClickListener() { // from class: l.bhx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBuzzCallControlView.m47222j0(this.f75682a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m47230s0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        oe50 oe50Var = mediaBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.mo126823b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m47231t0() {
        lsi0.m151593w(R$string.f20216e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m47232u0() {
        lsi0.m151593w(R$string.f20213d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m47233v0(MediaBuzzCallControlView mediaBuzzCallControlView) {
        oe50 oe50Var = mediaBuzzCallControlView.controlListener;
        if (oe50Var != null) {
            oe50Var.mo126822a();
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
    public final LoveBuzzControlView get_quit() {
        LoveBuzzControlView loveBuzzControlView = this._quit;
        if (loveBuzzControlView != null) {
            return loveBuzzControlView;
        }
        Intrinsics.m87502r("_quit");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final View m47234p0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM126245b = ghx.m126245b(this, inflater, parent);
        viewM126245b.getClass();
        return viewM126245b;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m47235q0() {
        get_quit().removeCallbacks(this.quitRunnable);
        m6w.INSTANCE.m153299d(get_add_time(), get_add_time_count(), get_like(), get_quit());
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
    public final void m47236w0(@NotNull String type) {
        type.getClass();
        this.buzzType = type;
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getStartTime() <= 0) {
            return;
        }
        long startTime = (hhxVarM140417B0.getStartTime() + ((long) (hhxVarM140417B0.getFrozenDuration() * 1000))) - mqi0.m155944o();
        if (startTime <= 0) {
            get_quit().m47191d(y2c0.f195532M);
        } else {
            get_quit().m47191d(y2c0.f195531L);
            get_quit().postDelayed(this.quitRunnable, startTime);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m47237y0() {
        int i = C8435a.f30244a[j8w.INSTANCE.m140473a().m140417B0().getMatched().ordinal()];
        if (i == 1) {
            get_like().m47191d(y2c0.f195535P);
            get_add_time().m47191d(y2c0.f195521B);
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
    /* JADX INFO: renamed from: z0 */
    public final void m47238z0() {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            get_add_time().m47191d(y2c0.f195521B);
            xdl0.m208344M(get_add_time_count(), false);
            get_add_time().setEnabled(false);
        } else {
            if (hhxVarM140417B0.getProlongCount() <= 0) {
                get_add_time().m47191d(y2c0.f195530K);
                xdl0.m208344M(get_add_time_count(), false);
                get_add_time().setEnabled(false);
                return;
            }
            get_add_time().m47191d(y2c0.f195522C);
            xdl0.m208344M(get_add_time_count(), true);
            get_add_time_count().setText("x " + hhxVarM140417B0.getProlongCount());
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
