package com.p046p1.mobile.putong.live.livingroom.voice.call.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\nR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R*\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006#"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/view/LiveFadeHorizontalScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getLeftFadingEdgeStrength", "()F", "getTopFadingEdgeStrength", "getRightFadingEdgeStrength", "getBottomFadingEdgeStrength", "", "value", "a", "Z", "getEnableLeft", "()Z", "setEnableLeft", "(Z)V", "enableLeft", "b", "getEnableTop", "setEnableTop", "enableTop", "c", "getEnableRight", "setEnableRight", "enableRight", Constants.INAPP_DATA_TAG, "getEnableBottom", "setEnableBottom", "enableBottom", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveFadeHorizontalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean enableLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean enableTop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean enableRight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean enableBottom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveFadeHorizontalScrollView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.enableBottom) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final boolean getEnableBottom() {
        return this.enableBottom;
    }

    public final boolean getEnableLeft() {
        return this.enableLeft;
    }

    public final boolean getEnableRight() {
        return this.enableRight;
    }

    public final boolean getEnableTop() {
        return this.enableTop;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.enableLeft) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (this.enableRight) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (this.enableTop) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final void setEnableBottom(boolean z) {
        setVerticalFadingEdgeEnabled(z || this.enableTop);
        this.enableBottom = z;
    }

    public final void setEnableLeft(boolean z) {
        setHorizontalFadingEdgeEnabled(z || this.enableRight);
        this.enableLeft = z;
    }

    public final void setEnableRight(boolean z) {
        setHorizontalFadingEdgeEnabled(z || this.enableLeft);
        this.enableRight = z;
    }

    public final void setEnableTop(boolean z) {
        setVerticalFadingEdgeEnabled(z || this.enableBottom);
        this.enableTop = z;
    }
}
