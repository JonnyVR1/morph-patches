package p149l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002\u0011\u0015B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0011\u0010 \"\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006'"}, m87232d2 = {"Ll/qjq;", "", "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "Ll/qjq$b;", "frameListener", "", "onlyMonitorJankFame", "<init>", "(Landroid/view/Window;Ll/qjq$b;Z)V", "Ll/q3j;", "frameData", "", "c", "(Ll/q3j;)V", Constants.INAPP_DATA_TAG, "Ll/gj60$b;", "a", "Ll/gj60$b;", "metricsStateHolder", "Ll/wjq;", "b", "Ll/wjq;", "implementation", "value", "Z", "isTrackingEnabled", "()Z", "e", "(Z)V", "", "F", "()F", "setJankHeuristicMultiplier", "(F)V", "jankHeuristicMultiplier", "Ll/qjq$b;", "f", "Companion", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class qjq {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final gj60.C17089b metricsStateHolder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final wjq implementation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float jankHeuristicMultiplier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC19525b frameListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean onlyMonitorJankFame;

    /* JADX INFO: renamed from: l.qjq$b */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"Ll/qjq$b;", "", "Ll/q3j;", "frameData", "", "a", "(Ll/q3j;)V", "b", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public interface InterfaceC19525b {
        /* JADX INFO: renamed from: a */
        void mo18573a(@NotNull q3j frameData);

        /* JADX INFO: renamed from: b */
        void mo18574b(@NotNull q3j frameData);
    }

    private qjq(Window window, InterfaceC19525b interfaceC19525b, boolean z) {
        this.frameListener = interfaceC19525b;
        this.onlyMonitorJankFame = z;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            qkq0.m175383a("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        this.metricsStateHolder = gj60.INSTANCE.m126460a(viewPeekDecorView);
        int i = Build.VERSION.SDK_INT;
        wjq vjqVar = i >= 31 ? new vjq(this, viewPeekDecorView, window) : i >= 26 ? new ujq(this, viewPeekDecorView, window) : new tjq(this, viewPeekDecorView, window);
        this.implementation = vjqVar;
        vjqVar.mo189398c(true);
        this.isTrackingEnabled = true;
        this.jankHeuristicMultiplier = 2.0f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getJankHeuristicMultiplier() {
        return this.jankHeuristicMultiplier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getOnlyMonitorJankFame() {
        return this.onlyMonitorJankFame;
    }

    /* JADX INFO: renamed from: c */
    public final void m175029c(@NotNull q3j frameData) {
        frameData.getClass();
        this.frameListener.mo18573a(frameData);
    }

    /* JADX INFO: renamed from: d */
    public final void m175030d(@NotNull q3j frameData) {
        frameData.getClass();
        this.frameListener.mo18574b(frameData);
    }

    /* JADX INFO: renamed from: e */
    public final void m175031e(boolean z) {
        this.implementation.mo189398c(z);
        this.isTrackingEnabled = z;
    }

    /* JADX INFO: renamed from: l.qjq$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/qjq$a;", "", "<init>", "()V", "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "Ll/qjq$b;", "frameListener", "", "isOnlyMonitorJankFrame", "Ll/qjq;", "a", "(Landroid/view/Window;Ll/qjq$b;Z)Ll/qjq;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final qjq m175032a(@NotNull Window window, @NotNull InterfaceC19525b frameListener, boolean isOnlyMonitorJankFrame) {
            window.getClass();
            frameListener.getClass();
            return new qjq(window, frameListener, isOnlyMonitorJankFrame, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ qjq(Window window, InterfaceC19525b interfaceC19525b, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, interfaceC19525b, z);
    }
}
