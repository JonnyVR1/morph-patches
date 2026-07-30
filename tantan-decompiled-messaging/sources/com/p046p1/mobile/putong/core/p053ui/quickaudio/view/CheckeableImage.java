package com.p046p1.mobile.putong.core.p053ui.quickaudio.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.CheckeableImage;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fR\"\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage;", "Lv/VImage;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "", "setChecked", "(Z)V", "setCheckedNoListener", "onFinishInflate", "()V", "isChecked", "()Z", "toggle", "extraSpace", "", "onCreateDrawableState", "(I)[I", "setCheckWithoutCallback", Constants.INAPP_DATA_TAG, "Z", "isCheck", "setCheck", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage$a;", "checkChangeListener", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage$a;", "getCheckChangeListener", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage$a;", "setCheckChangeListener", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage$a;)V", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class CheckeableImage extends VImage implements Checkable {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isCheck;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.CheckeableImage$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/CheckeableImage$a;", "", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC8813a {
    }

    public /* synthetic */ CheckeableImage(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h */
    public static void m54586h(CheckeableImage checkeableImage, View view) {
        checkeableImage.toggle();
    }

    @Nullable
    public final InterfaceC8813a getCheckChangeListener() {
        return null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isCheck;
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_checked});
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.b35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckeableImage.m54586h(this.f72804a, view);
            }
        });
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final void setCheckChangeListener(@Nullable InterfaceC8813a interfaceC8813a) {
    }

    public final void setCheckWithoutCallback(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
        }
    }

    public final void setCheckedNoListener(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isCheck);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckeableImage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckeableImage(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckeableImage(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
