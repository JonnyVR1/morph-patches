package com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.IntlCampingAnswerItem;
import com.p000p1.mobile.putong.core.p002ui.intloperation.common.SelectorView;
import com.p1.mobile.putong.core.data.IntlCampingQuestionOptionsData;
import com.p1.mobile.putong.core.data.IntlCampingQuestionsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.nvc0;
import l.qib0;
import l.u3n;
import l.xdl0;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\u0015R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010>¨\u0006@"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/IntlCampingAnswerItem;", "Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionOptionsData;", "option", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "item", "l", "(Lcom/p1/mobile/putong/core/data/IntlCampingQuestionOptionsData;Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;)V", "", "isSelect", "g", "(Z)V", "view", "j", "(Landroid/view/View;)V", "n", "m", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "get_answer_normal_img", "()Lv/VDraweeView;", "set_answer_normal_img", "(Lv/VDraweeView;)V", "_answer_normal_img", "i", "get_answer_selected_img", "set_answer_selected_img", "_answer_selected_img", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_answer_content", "()Landroid/widget/TextView;", "set_answer_content", "(Landroid/widget/TextView;)V", "_answer_content", "get_answer_selected_tag_icon", "set_answer_selected_tag_icon", "_answer_selected_tag_icon", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "itemData", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlCampingAnswerItem extends SelectorView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _answer_normal_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _answer_selected_img;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _answer_content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VDraweeView _answer_selected_tag_icon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public IntlCampingQuestionsData itemData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlCampingAnswerItem(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static void m8338i(IntlCampingAnswerItem intlCampingAnswerItem, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VDraweeView vDraweeView = intlCampingAnswerItem.get_answer_selected_img();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vDraweeView.setAlpha(((Float) animatedValue).floatValue());
    }

    @Override // com.p000p1.mobile.putong.core.p002ui.intloperation.common.SelectorView
    /* JADX INFO: renamed from: g */
    public void mo8339g(boolean isSelect) {
        if (isSelect) {
            m8343m();
        } else {
            m8344n();
        }
        try {
            IntlCampingQuestionsData intlCampingQuestionsData = this.itemData;
            if (intlCampingQuestionsData != null) {
                get_answer_content().setTextColor(Color.parseColor(isSelect ? intlCampingQuestionsData.opt_focus_font_color : intlCampingQuestionsData.opt_font_color));
            }
            xdl0.M0(get_answer_selected_tag_icon(), isSelect);
        } catch (Exception unused) {
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

    @NotNull
    public final VDraweeView get_answer_selected_tag_icon() {
        VDraweeView vDraweeView = this._answer_selected_tag_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_answer_selected_tag_icon");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m8340j(View view) {
        u3n.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m8341k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = u3n.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: l */
    public final void m8342l(@NotNull IntlCampingQuestionOptionsData option, @NotNull IntlCampingQuestionsData item) {
        option.getClass();
        item.getClass();
        this.itemData = item;
        qib0.G.O0(get_answer_selected_img(), item.opt_focus_bg_url, true, false, (nvc0) null, (ym2) null);
        qib0.G.O0(get_answer_normal_img(), item.opt_bg_url, true, false, (nvc0) null, (ym2) null);
        qib0.G.O0(get_answer_selected_tag_icon(), item.opt_focus_logo_url, true, false, (nvc0) null, (ym2) null);
        get_answer_selected_img().setAlpha(0.0f);
        get_answer_content().setText(option.desc);
        try {
            get_answer_content().setTextColor(Color.parseColor(item.opt_font_color));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8343m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t3n
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    IntlCampingAnswerItem.m8338i(this.f20549a, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8344n() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator == null || valueAnimator == null) {
            return;
        }
        valueAnimator.reverse();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8340j(this);
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

    public final void set_answer_selected_tag_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._answer_selected_tag_icon = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlCampingAnswerItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlCampingAnswerItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
