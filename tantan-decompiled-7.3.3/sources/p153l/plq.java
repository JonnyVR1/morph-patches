package p153l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002\u0011\u0015B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0011\u0010 \"\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006'"}, m88121d2 = {"Ll/plq;", "", "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "Ll/plq$b;", "frameListener", "", "onlyMonitorJankFame", "<init>", "(Landroid/view/Window;Ll/plq$b;Z)V", "Ll/l6j;", "frameData", "", "c", "(Ll/l6j;)V", Constants.INAPP_DATA_TAG, "Ll/lr60$b;", "a", "Ll/lr60$b;", "metricsStateHolder", "Ll/vlq;", "b", "Ll/vlq;", "implementation", "value", "Z", "isTrackingEnabled", "()Z", "e", "(Z)V", "", "F", "()F", "setJankHeuristicMultiplier", "(F)V", "jankHeuristicMultiplier", "Ll/plq$b;", "f", "Companion", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class plq {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final lr60.C18445b metricsStateHolder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final vlq implementation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float jankHeuristicMultiplier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC19397b frameListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean onlyMonitorJankFame;

    /* JADX INFO: renamed from: l.plq$b */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"Ll/plq$b;", "", "Ll/l6j;", "frameData", "", "a", "(Ll/l6j;)V", "b", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC19397b {
        /* JADX INFO: renamed from: a */
        void mo19553a(@NotNull l6j frameData);

        /* JADX INFO: renamed from: b */
        void mo19554b(@NotNull l6j frameData);
    }

    private plq(Window window, InterfaceC19397b interfaceC19397b, boolean z) {
        this.frameListener = interfaceC19397b;
        this.onlyMonitorJankFame = z;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            wtq0.m207906a("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        this.metricsStateHolder = lr60.INSTANCE.m155585a(viewPeekDecorView);
        int i = Build.VERSION.SDK_INT;
        vlq ulqVar = i >= 31 ? new ulq(this, viewPeekDecorView, window) : i >= 26 ? new tlq(this, viewPeekDecorView, window) : new slq(this, viewPeekDecorView, window);
        this.implementation = ulqVar;
        ulqVar.mo186650c(true);
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
    public final void m172846c(@NotNull l6j frameData) {
        frameData.getClass();
        this.frameListener.mo19553a(frameData);
    }

    /* JADX INFO: renamed from: d */
    public final void m172847d(@NotNull l6j frameData) {
        frameData.getClass();
        this.frameListener.mo19554b(frameData);
    }

    /* JADX INFO: renamed from: e */
    public final void m172848e(boolean z) {
        this.implementation.mo186650c(z);
        this.isTrackingEnabled = z;
    }

    /* JADX INFO: renamed from: l.plq$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/plq$a;", "", "<init>", "()V", "Landroid/view/Window;", BLiveBottomPopupStyleTypeEnum.window, "Ll/plq$b;", "frameListener", "", "isOnlyMonitorJankFrame", "Ll/plq;", "a", "(Landroid/view/Window;Ll/plq$b;Z)Ll/plq;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final plq m172849a(@NotNull Window window, @NotNull InterfaceC19397b frameListener, boolean isOnlyMonitorJankFrame) {
            window.getClass();
            frameListener.getClass();
            return new plq(window, frameListener, isOnlyMonitorJankFrame, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ plq(Window window, InterfaceC19397b interfaceC19397b, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, interfaceC19397b, z);
    }
}
