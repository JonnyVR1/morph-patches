package com.p046p1.mobile.putong.live.livingroom.voice.confession.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;", "floatTouchWindowListener", "", "setFloatTouchWindowListener", "(Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", Constants.INAPP_DATA_TAG, "F", "downY", "e", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "a", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class FloatTouchWindowConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float downY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC13013b listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.confession.widget.FloatTouchWindowConstraintLayout$b */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;", "", "", "isScrollUp", "", "a", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC13013b {
        /* JADX INFO: renamed from: a */
        void mo78060a(boolean isScrollUp);
    }

    public /* synthetic */ FloatTouchWindowConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        int action = event.getAction();
        if (action == 0) {
            this.downY = event.getRawY();
        } else if (action == 2) {
            float rawY = this.downY - event.getRawY();
            if (rawY > t100.m186890d(5.0f) || Math.abs(rawY) > t100.m186890d(5.0f)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        InterfaceC13013b interfaceC13013b;
        InterfaceC13013b interfaceC13013b2;
        event.getClass();
        int action = event.getAction();
        if (action == 1 || action == 3) {
            float rawY = this.downY - event.getRawY();
            if (rawY > t100.m186890d(5.0f) && (interfaceC13013b2 = this.listener) != null) {
                interfaceC13013b2.mo78060a(true);
                return true;
            }
            if (Math.abs(rawY) > t100.m186890d(5.0f) && (interfaceC13013b = this.listener) != null) {
                interfaceC13013b.mo78060a(false);
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setFloatTouchWindowListener(@NotNull InterfaceC13013b floatTouchWindowListener) {
        floatTouchWindowListener.getClass();
        this.listener = floatTouchWindowListener;
        setClickable(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatTouchWindowConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatTouchWindowConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatTouchWindowConstraintLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
