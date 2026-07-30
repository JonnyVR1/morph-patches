package com.p051p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.vlo;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsDividingLineItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsDividingLineItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsDividingLineItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsDividingLineItemView;)V", "_root", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetVisitorsDividingLineItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMeetVisitorsDividingLineItemView _root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsDividingLineItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m40512a(View view) {
        vlo.m201653a(this, view);
    }

    @NotNull
    public final IntlMeetVisitorsDividingLineItemView get_root() {
        IntlMeetVisitorsDividingLineItemView intlMeetVisitorsDividingLineItemView = this._root;
        if (intlMeetVisitorsDividingLineItemView != null) {
            return intlMeetVisitorsDividingLineItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40512a(this);
    }

    public final void set_root(@NotNull IntlMeetVisitorsDividingLineItemView intlMeetVisitorsDividingLineItemView) {
        intlMeetVisitorsDividingLineItemView.getClass();
        this._root = intlMeetVisitorsDividingLineItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsDividingLineItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsDividingLineItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
