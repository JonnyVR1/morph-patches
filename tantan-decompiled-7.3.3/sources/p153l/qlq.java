package p153l;

import android.view.Choreographer;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001%\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006("}, m88121d2 = {"Ll/qlq;", "Ll/vlq;", "Ll/plq;", "jankStats", "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Ll/plq;Landroid/view/View;)V", "", StudentVerRejectedReason.startTime, "uiDuration", "expectedDuration", "", "isJank", "Ll/l6j;", "f", "(JJJZ)Ll/l6j;", "g", "()J", "e", "(Landroid/view/View;)J", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", Constants.INAPP_DATA_TAG, "()Ljava/lang/ref/WeakReference;", "decorViewRef", "Landroid/view/Choreographer;", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "choreographer", "Ll/lr60$b;", "Ll/lr60$b;", "h", "()Ll/lr60$b;", "metricsStateHolder", "l/qlq$a", "Ll/qlq$a;", "onFrameListenerDelegate", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class qlq extends vlq {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<View> decorViewRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final lr60.C18445b metricsStateHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C19595a onFrameListenerDelegate;

    /* JADX INFO: renamed from: l.qlq$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/qlq$a", "Ll/im50;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C19595a extends im50 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ plq f158265b;

        public C19595a(plq plqVar) {
            this.f158265b = plqVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlq(@NotNull plq plqVar, @NotNull View view) {
        super(plqVar);
        plqVar.getClass();
        view.getClass();
        this.decorViewRef = new WeakReference<>(view);
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.choreographer = choreographer;
        this.metricsStateHolder = lr60.INSTANCE.m155586b(view);
        this.onFrameListenerDelegate = new C19595a(plqVar);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final WeakReference<View> m177007d() {
        return this.decorViewRef;
    }

    /* JADX INFO: renamed from: e */
    public final long m177008e(@Nullable View view) {
        return rud.INSTANCE.m183190b(view);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public l6j m177009f(long startTime, long uiDuration, long expectedDuration, boolean isJank) {
        List<StateInfo> listEmptyList;
        lr60 state = this.metricsStateHolder.getState();
        if (state == null || (listEmptyList = state.m155584c(startTime, startTime + uiDuration)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new l6j(startTime, uiDuration, isJank, listEmptyList);
    }

    /* JADX INFO: renamed from: g */
    public final long m177010g() throws IllegalAccessException {
        Object obj = rud.INSTANCE.m183189a().get(this.choreographer);
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        C0799b.m4641a("null cannot be cast to non-null type kotlin.Long");
        return 0L;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final lr60.C18445b getMetricsStateHolder() {
        return this.metricsStateHolder;
    }
}
