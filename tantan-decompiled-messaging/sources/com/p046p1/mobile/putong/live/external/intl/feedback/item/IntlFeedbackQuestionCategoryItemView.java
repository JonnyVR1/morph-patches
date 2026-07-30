package com.p046p1.mobile.putong.live.external.intl.feedback.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;
import p149l.men;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/item/IntlFeedbackQuestionCategoryItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", "Lv/VText;", "a", "Lv/VText;", "get_question_category", "()Lv/VText;", "set_question_category", "(Lv/VText;)V", "_question_category", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlFeedbackQuestionCategoryItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _question_category;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlFeedbackQuestionCategoryItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final VText get_question_category() {
        VText vText = this._question_category;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_question_category");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69953p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m69953p(View view) {
        men.m154273a(this, view);
    }

    public final void set_question_category(@NotNull VText vText) {
        vText.getClass();
        this._question_category = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlFeedbackQuestionCategoryItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlFeedbackQuestionCategoryItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
