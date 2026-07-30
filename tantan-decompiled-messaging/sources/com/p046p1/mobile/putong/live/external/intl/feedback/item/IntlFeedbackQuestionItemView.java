package com.p046p1.mobile.putong.live.external.intl.feedback.item;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p046p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.h3c0;
import p149l.oen;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u00061"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionItemView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;", "question", "Lkotlin/Function1;", "", "function", "R", "(Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData$GroupsDTO$FaqListDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", OMSTemplateModeType.view, "Q", "(Landroid/view/View;)V", "c", "Lv/VLinear;", "get_question", "()Lv/VLinear;", "set_question", "(Lv/VLinear;)V", "_question", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_question_title", "()Lv/VText;", "set_question_title", "(Lv/VText;)V", "_question_title", "Lv/VImage;", "e", "Lv/VImage;", "get_question_icon", "()Lv/VImage;", "set_question_icon", "(Lv/VImage;)V", "_question_icon", "f", "get_answer", "set_answer", "_answer", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlFeedbackQuestionItemView extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _question;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _question_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _question_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _answer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlFeedbackQuestionItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public static void m69954P(IntlFeedbackPageData.GroupsDTO.FaqListDTO faqListDTO, IntlFeedbackQuestionItemView intlFeedbackQuestionItemView, Function1 function1, View view) {
        if (faqListDTO.isUnFold()) {
            intlFeedbackQuestionItemView.get_answer().setVisibility(8);
            faqListDTO.setUnFold(false);
            intlFeedbackQuestionItemView.get_question_icon().setImageResource(h3c0.f105600C);
        } else {
            intlFeedbackQuestionItemView.get_answer().setVisibility(0);
            faqListDTO.setUnFold(true);
            intlFeedbackQuestionItemView.get_question_icon().setImageResource(h3c0.f105606E);
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(faqListDTO.isUnFold()));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m69955Q(View view) {
        oen.m163977a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m69956R(@NotNull final IntlFeedbackPageData.GroupsDTO.FaqListDTO question, @Nullable final Function1<? super Boolean, Unit> function) {
        question.getClass();
        get_question_title().setText(question.getQuestion());
        get_question_title().setTypeface(Typeface.DEFAULT_BOLD);
        get_answer().setText(question.getAnswer());
        get_answer().setVisibility(question.isUnFold() ? 0 : 8);
        get_question_icon().setImageResource(question.isUnFold() ? h3c0.f105606E : h3c0.f105600C);
        xdl0.m208329E0(get_question(), new View.OnClickListener() { // from class: l.nen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlFeedbackQuestionItemView.m69954P(question, this, function, view);
            }
        });
    }

    @NotNull
    public final VText get_answer() {
        VText vText = this._answer;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_answer");
        return null;
    }

    @NotNull
    public final VLinear get_question() {
        VLinear vLinear = this._question;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_question");
        return null;
    }

    @NotNull
    public final VImage get_question_icon() {
        VImage vImage = this._question_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_question_icon");
        return null;
    }

    @NotNull
    public final VText get_question_title() {
        VText vText = this._question_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_question_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69955Q(this);
    }

    public final void set_answer(@NotNull VText vText) {
        vText.getClass();
        this._answer = vText;
    }

    public final void set_question(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._question = vLinear;
    }

    public final void set_question_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._question_icon = vImage;
    }

    public final void set_question_title(@NotNull VText vText) {
        vText.getClass();
        this._question_title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlFeedbackQuestionItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlFeedbackQuestionItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
