package p149l;

import android.view.Choreographer;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001%\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006("}, m87232d2 = {"Ll/rjq;", "Ll/wjq;", "Ll/qjq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Ll/qjq;Landroid/view/View;)V", "", StudentVerRejectedReason.startTime, "uiDuration", "expectedDuration", "", "isJank", "Ll/q3j;", "f", "(JJJZ)Ll/q3j;", "g", "()J", "e", "(Landroid/view/View;)J", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "()Ljava/lang/ref/WeakReference;", "decorViewRef", "Landroid/view/Choreographer;", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "choreographer", "Ll/gj60$b;", "Ll/gj60$b;", "h", "()Ll/gj60$b;", "metricsStateHolder", "l/rjq$a", "Ll/rjq$a;", "onFrameListenerDelegate", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class rjq extends wjq {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<View> decorViewRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final gj60.C17089b metricsStateHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C19718a onFrameListenerDelegate;

    /* JADX INFO: renamed from: l.rjq$a */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/rjq$a", "Ll/be50;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C19718a extends be50 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ qjq f159737b;

        public C19718a(qjq qjqVar) {
            this.f159737b = qjqVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjq(@NotNull qjq qjqVar, @NotNull View view) {
        super(qjqVar);
        qjqVar.getClass();
        view.getClass();
        this.decorViewRef = new WeakReference<>(view);
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.choreographer = choreographer;
        this.metricsStateHolder = gj60.INSTANCE.m126461b(view);
        this.onFrameListenerDelegate = new C19718a(qjqVar);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final WeakReference<View> m179658d() {
        return this.decorViewRef;
    }

    /* JADX INFO: renamed from: e */
    public final long m179659e(@Nullable View view) {
        return dtd.INSTANCE.m113543b(view);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public q3j m179660f(long startTime, long uiDuration, long expectedDuration, boolean isJank) {
        List<StateInfo> listEmptyList;
        gj60 state = this.metricsStateHolder.getState();
        if (state == null || (listEmptyList = state.m126459c(startTime, startTime + uiDuration)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new q3j(startTime, uiDuration, isJank, listEmptyList);
    }

    /* JADX INFO: renamed from: g */
    public final long m179661g() throws IllegalAccessException {
        Object obj = dtd.INSTANCE.m113542a().get(this.choreographer);
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        ox50.m166495a("null cannot be cast to non-null type kotlin.Long");
        return 0L;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final gj60.C17089b getMetricsStateHolder() {
        return this.metricsStateHolder;
    }
}
