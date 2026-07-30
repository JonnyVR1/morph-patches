package com.p046p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gio;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorAdmobItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View;", "adView", "b", "(Landroid/view/View;)V", OMSTemplateModeType.view, "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlMeetVisitorAdmobItemView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorAdmobItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m39503a(View view) {
        gio.m126385a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m39504b(@NotNull View adView) {
        adView.getClass();
        if (Intrinsics.m87488d(adView.getParent(), this)) {
            return;
        }
        if (adView.getParent() instanceof ViewGroup) {
            ViewParent parent = adView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(adView);
        }
        removeAllViews();
        addView(adView);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39503a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorAdmobItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorAdmobItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
