package p149l;

import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/hac0;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Ll/hac0$a;", "a", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Ll/hac0$a;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class hac0 {

    @NotNull
    public static final hac0 INSTANCE = new hac0();

    /* JADX INFO: renamed from: l.hac0$a */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/hac0$a;", "Landroid/view/View$OnTouchListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", OMSTemplateModeType.view, "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "a", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "c", Constants.INAPP_DATA_TAG, "Landroid/view/View$OnTouchListener;", "existingOnTouchListener", "e", "Z", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ViewOnTouchListenerC17253a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final EventBinding mapping;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> hostView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final View.OnTouchListener existingOnTouchListener;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public ViewOnTouchListenerC17253a(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
            eventBinding.getClass();
            view.getClass();
            view2.getClass();
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnTouchListener = ccl0.m106070h(view2);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            view.getClass();
            motionEvent.getClass();
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                qb5.m173816d(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ViewOnTouchListenerC17253a m130134a(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (lsb.m151554d(hac0.class)) {
            return null;
        }
        try {
            mapping.getClass();
            rootView.getClass();
            hostView.getClass();
            return new ViewOnTouchListenerC17253a(mapping, rootView, hostView);
        } catch (Throwable th) {
            lsb.m151552b(th, hac0.class);
            return null;
        }
    }
}
