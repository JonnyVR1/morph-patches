package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.mbc0;
import p153l.n3d0;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u00010B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b#\u0010\"J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J\u001f\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\f2\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b0\u0010*R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00103R\u0018\u00105\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/view/DialogTitleBar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/appcompat/widget/AppCompatImageView;", "getLeftView", "()Landroidx/appcompat/widget/AppCompatImageView;", "getRightView", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textRes", "", "whiteColor", "", Constants.INAPP_DATA_TAG, "(IZ)V", "", "text", "e", "(Ljava/lang/String;Z)V", "titleColor", "f", "(Ljava/lang/String;I)V", "type", "setLeftView", "(I)V", "setRightView", "visible", "setDivider", "(Z)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBackListener", "(Landroid/view/View$OnClickListener;)V", "setFAQListener", "b", OMSTemplateModeType.view, "c", "(Landroidx/appcompat/widget/AppCompatImageView;I)V", "a", "Z", "isWhiteText", "Landroid/view/View$OnClickListener;", "faqListener", "backListener", "Landroidx/appcompat/widget/AppCompatTextView;", "titleView", "Landroidx/appcompat/widget/AppCompatImageView;", "leftView", "rightView", "Landroid/view/View;", "g", "Landroid/view/View;", "divider", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DialogTitleBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isWhiteText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener faqListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener backListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public AppCompatTextView titleView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AppCompatImageView leftView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public AppCompatImageView rightView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View divider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        m69894b(context);
    }

    private final AppCompatImageView getLeftView() {
        if (this.leftView == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.leftView = appCompatImageView;
            int i = qa00.f156335v;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 19;
            layoutParams.leftMargin = qa00.f156326m;
            Unit unit = Unit.INSTANCE;
            addView(appCompatImageView, layoutParams);
        }
        AppCompatImageView appCompatImageView2 = this.leftView;
        appCompatImageView2.getClass();
        return appCompatImageView2;
    }

    private final AppCompatImageView getRightView() {
        if (this.rightView == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.rightView = appCompatImageView;
            int i = qa00.f156335v;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 21;
            layoutParams.rightMargin = qa00.f156326m;
            Unit unit = Unit.INSTANCE;
            addView(appCompatImageView, layoutParams);
        }
        AppCompatImageView appCompatImageView2 = this.rightView;
        appCompatImageView2.getClass();
        return appCompatImageView2;
    }

    /* JADX INFO: renamed from: a */
    public final void m69893a(View.OnClickListener listener) {
    }

    /* JADX INFO: renamed from: b */
    public final void m69894b(Context context) {
    }

    /* JADX INFO: renamed from: c */
    public final void m69895c(AppCompatImageView view, int type) {
        if (type == 1) {
            m69893a(this.backListener);
            view.setImageResource(mbc0.f135646F);
            bnl0.m105509E0(view, this.backListener);
            return;
        }
        if (type == 2) {
            m69893a(this.faqListener);
            view.setImageResource(mbc0.f135647G);
            bnl0.m105509E0(view, this.faqListener);
        } else if (type == 3) {
            m69893a(this.faqListener);
            view.setImageResource(mbc0.f135701r);
            bnl0.m105509E0(view, this.faqListener);
        } else {
            if (type != 4) {
                return;
            }
            m69893a(this.backListener);
            view.setImageResource(mbc0.f135698p0);
            bnl0.m105509E0(view, this.backListener);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m69896d(int textRes, boolean whiteColor) {
        m69897e(getContext().getString(textRes), whiteColor);
    }

    /* JADX INFO: renamed from: e */
    public final void m69897e(@Nullable String text, boolean whiteColor) {
        getTitleView().setText(text);
        this.isWhiteText = whiteColor;
        getTitleView().setTextColor(whiteColor ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
        boolean z = this.isWhiteText;
        View view = this.divider;
        if (z) {
            if (view != null) {
                view.setBackgroundColor(Color.parseColor("#0DFFFFFF"));
            }
        } else if (view != null) {
            view.setBackgroundColor(Color.parseColor("#f9f9f9"));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m69898f(@Nullable String text, int titleColor) {
        getTitleView().setText(text);
        getTitleView().setTextColor(n3d0.m161277a(titleColor));
    }

    @NotNull
    public final AppCompatTextView getTitleView() {
        if (this.titleView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setTextSize(1, 16.0f);
            appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
            appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.titleView = appCompatTextView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            Unit unit = Unit.INSTANCE;
            addView(appCompatTextView, layoutParams);
        }
        AppCompatTextView appCompatTextView2 = this.titleView;
        appCompatTextView2.getClass();
        return appCompatTextView2;
    }

    public final void setBackListener(@NotNull View.OnClickListener listener) {
        listener.getClass();
        this.backListener = listener;
    }

    public final void setDivider(boolean visible) {
        if (this.divider == null) {
            View view = new View(getContext());
            this.divider = view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, qa00.f156316c);
            layoutParams.gravity = 81;
            int i = qa00.f156328o;
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
            Unit unit = Unit.INSTANCE;
            addView(view, layoutParams);
        }
        bnl0.m105524M(this.divider, visible);
        boolean z = this.isWhiteText;
        View view2 = this.divider;
        if (z) {
            if (view2 != null) {
                view2.setBackgroundColor(Color.parseColor("#0DFFFFFF"));
            }
        } else if (view2 != null) {
            view2.setBackgroundColor(Color.parseColor("#f9f9f9"));
        }
    }

    public final void setFAQListener(@NotNull View.OnClickListener listener) {
        listener.getClass();
        this.faqListener = listener;
    }

    public final void setLeftView(int type) {
        m69895c(getLeftView(), type);
    }

    public final void setRightView(int type) {
        m69895c(getRightView(), type);
    }

    private DialogTitleBar(Context context) {
        super(context);
        m69894b(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        m69894b(context);
    }
}
