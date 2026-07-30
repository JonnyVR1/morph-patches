package com.hellogroup.p036mk.business.widget.enhance;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;Landroid/util/AttributeSet;I)V", "", "h", "()V", "a", "", "errorStr", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "b", "f", "(Landroid/content/Context;)V", "e", Constants.INAPP_DATA_TAG, "g", "c", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "getMkWebView", "()Lcom/hellogroup/mk/business/base/ui/MKWebView;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class MKEnhanceView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MKWebView mkWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MKEnhanceView(@NotNull Context context, @NotNull MKWebView mKWebView, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        mKWebView.getClass();
        this.mkWebView = mKWebView;
        this.TAG = "MKEnhanceView";
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18368a();

    /* JADX INFO: renamed from: b */
    public abstract void mo18369b();

    /* JADX INFO: renamed from: c */
    public abstract void mo18370c(@Nullable Context context);

    /* JADX INFO: renamed from: d */
    public abstract void mo18371d(@Nullable Context context);

    /* JADX INFO: renamed from: e */
    public abstract void mo18372e(@Nullable Context context);

    /* JADX INFO: renamed from: f */
    public abstract void mo18373f(@Nullable Context context);

    /* JADX INFO: renamed from: g */
    public abstract void mo18374g(@Nullable Context context);

    @NotNull
    public final MKWebView getMkWebView() {
        return this.mkWebView;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo18375h();

    /* JADX INFO: renamed from: i */
    public abstract void mo18376i(@Nullable String errorStr);

    public /* synthetic */ MKEnhanceView(Context context, MKWebView mKWebView, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mKWebView, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }
}
