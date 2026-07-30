package com.p000p1.mobile.putong.core.p001ui.intloperation.quiz;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.intloperation.quiz.IntlQuizAnswerItem;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData;
import com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p1.mobile.putong.core.ui.intloperation.common.SelectorView;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.nvc0;
import l.qib0;
import l.ym2;
import l.z7p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000eJ\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010<¨\u0006>"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/quiz/IntlQuizAnswerItem;", "Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "n", "()V", "m", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onFinishInflate", "onDetachedFromWindow", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionItemData;", "option", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;", "optionUiData", "l", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionItemData;Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;)V", "", "isSelect", "g", "(Z)V", OMSTemplateModeType.view, "j", "(Landroid/view/View;)V", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "get_answer_normal_img", "()Lv/VDraweeView;", "set_answer_normal_img", "(Lv/VDraweeView;)V", "_answer_normal_img", RXScreenCaptureService.KEY_INDEX, "get_answer_selected_img", "set_answer_selected_img", "_answer_selected_img", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_answer_content", "()Landroid/widget/TextView;", "set_answer_content", "(Landroid/widget/TextView;)V", "_answer_content", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;", "itemData", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlQuizAnswerItem extends SelectorView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _answer_normal_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _answer_selected_img;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _answer_content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public IntlMarketQuestionOptionUIData itemData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlQuizAnswerItem(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static void m0i(IntlQuizAnswerItem intlQuizAnswerItem, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VDraweeView vDraweeView = intlQuizAnswerItem.get_answer_selected_img();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vDraweeView.setAlpha(((Float) animatedValue).floatValue());
        VDraweeView vDraweeView2 = intlQuizAnswerItem.get_answer_normal_img();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vDraweeView2.setAlpha(1.0f - ((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: m */
    private final void m1m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(50L);
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.y7p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    IntlQuizAnswerItem.m0i(this.f15292a, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m2n() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator == null || valueAnimator == null) {
            return;
        }
        valueAnimator.reverse();
    }

    /* JADX INFO: renamed from: g */
    public void m3g(boolean isSelect) {
        if (isSelect) {
            m1m();
        } else {
            m2n();
        }
        try {
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = this.itemData;
            if (intlMarketQuestionOptionUIData != null) {
                get_answer_content().setTextColor(Color.parseColor(isSelect ? intlMarketQuestionOptionUIData.focus_font_color : intlMarketQuestionOptionUIData.font_color));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @NotNull
    public final TextView get_answer_content() {
        TextView textView = this._answer_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_answer_content");
        return null;
    }

    @NotNull
    public final VDraweeView get_answer_normal_img() {
        VDraweeView vDraweeView = this._answer_normal_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_answer_normal_img");
        return null;
    }

    @NotNull
    public final VDraweeView get_answer_selected_img() {
        VDraweeView vDraweeView = this._answer_selected_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_answer_selected_img");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m4j(View view) {
        z7p.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m5k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = z7p.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: l */
    public final void m6l(@NotNull IntlMarketQuestionOptionItemData option, @NotNull IntlMarketQuestionOptionUIData optionUiData) {
        option.getClass();
        optionUiData.getClass();
        this.itemData = optionUiData;
        qib0.G.O0(get_answer_selected_img(), optionUiData.focus_bg_url, true, false, (nvc0) null, (ym2) null);
        qib0.G.O0(get_answer_normal_img(), optionUiData.bg_url, true, false, (nvc0) null, (ym2) null);
        get_answer_selected_img().setAlpha(0.0f);
        get_answer_content().setText(option.desc);
        try {
            get_answer_content().setTextColor(Color.parseColor(optionUiData.font_color));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4j(this);
    }

    public final void set_answer_content(@NotNull TextView textView) {
        textView.getClass();
        this._answer_content = textView;
    }

    public final void set_answer_normal_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._answer_normal_img = vDraweeView;
    }

    public final void set_answer_selected_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._answer_selected_img = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlQuizAnswerItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlQuizAnswerItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
