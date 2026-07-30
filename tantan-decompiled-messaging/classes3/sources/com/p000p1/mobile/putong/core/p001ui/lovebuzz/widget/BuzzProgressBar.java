package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.cp3;
import l.m6w;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.mkp;
import p028v.VText;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00108R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", IjkMediaMeta.IJKM_KEY_TYPE, "headStr", "", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "g", "()V", "Landroid/animation/AnimatorListenerAdapter;", "animatorAdapter", "setAnimatorListenerAdapter", "(Landroid/animation/AnimatorListenerAdapter;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setProgressDrawable", "(Landroid/graphics/drawable/Drawable;)V", "lastTime", "", "mediaBuzz", "c", "(Ljava/lang/String;IZ)V", "Landroid/widget/ProgressBar;", "a", "Landroid/widget/ProgressBar;", "get_buzz_progress", "()Landroid/widget/ProgressBar;", "set_buzz_progress", "(Landroid/widget/ProgressBar;)V", "_buzz_progress", "Lv/VText;", "Lv/VText;", "get_progress_content", "()Lv/VText;", "set_progress_content", "(Lv/VText;)V", "_progress_content", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "progressAnimator", "d", "Landroid/animation/AnimatorListenerAdapter;", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class BuzzProgressBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ProgressBar _buzz_progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _progress_content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator progressAnimator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public AnimatorListenerAdapter animatorAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        layoutInflaterFrom.getClass();
        m191b(layoutInflaterFrom, this);
        get_buzz_progress().setOutlineProvider(new mkp(t100.k));
        get_buzz_progress().setClipToOutline(true);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m189d(BuzzProgressBar buzzProgressBar, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        buzzProgressBar.m192c(str, i, z);
    }

    /* JADX INFO: renamed from: f */
    public static final void m190f(BuzzProgressBar buzzProgressBar, boolean z, String str, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        buzzProgressBar.get_buzz_progress().setProgress(iIntValue);
        if (z) {
            m189d(buzzProgressBar, str, iIntValue, false, 4, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m191b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = cp3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public final void m192c(String headStr, int lastTime, boolean mediaBuzz) {
        if (!mediaBuzz) {
            get_progress_content().setText(headStr);
            return;
        }
        get_progress_content().setText(headStr + " (" + (lastTime / 1000) + "s)");
    }

    /* JADX INFO: renamed from: e */
    public final void m193e(@NotNull String type, @Nullable final String headStr) {
        type.getClass();
        boolean zD = Intrinsics.d(type, "textBuzz");
        final boolean z = !zD;
        int iH = !zD ? (m6w.INSTANCE.h(type) * 1000) + IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR : 10900;
        get_buzz_progress().setMax(iH);
        m194g();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iH, 0);
        this.progressAnimator = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bp3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BuzzProgressBar.m190f(this.f2417a, z, headStr, valueAnimator);
                }
            });
            AnimatorListenerAdapter animatorListenerAdapter = this.animatorAdapter;
            if (animatorListenerAdapter != null) {
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
            }
            valueAnimatorOfInt.setDuration(iH);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.start();
        }
        m192c(headStr, iH, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m194g() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
        }
    }

    @NotNull
    public final ProgressBar get_buzz_progress() {
        ProgressBar progressBar = this._buzz_progress;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.r("_buzz_progress");
        return null;
    }

    @NotNull
    public final VText get_progress_content() {
        VText vText = this._progress_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_progress_content");
        return null;
    }

    public final void setAnimatorListenerAdapter(@NotNull AnimatorListenerAdapter animatorAdapter) {
        animatorAdapter.getClass();
        this.animatorAdapter = animatorAdapter;
    }

    public final void setProgressDrawable(@NotNull Drawable drawable) {
        drawable.getClass();
        get_buzz_progress().setProgressDrawable(drawable);
    }

    public final void set_buzz_progress(@NotNull ProgressBar progressBar) {
        progressBar.getClass();
        this._buzz_progress = progressBar;
    }

    public final void set_progress_content(@NotNull VText vText) {
        vText.getClass();
        this._progress_content = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzProgressBar(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
