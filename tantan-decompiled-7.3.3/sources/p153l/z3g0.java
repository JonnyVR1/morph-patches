package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/z3g0;", p7f.GPS_DIRECTION_TRUE, "Ll/a4g0;", "Ll/z06;", "consumer", "Ll/cl90;", "producerListener", "Ll/yk90;", "producerContext", "", "producerName", "<init>", "(Ll/z06;Ll/cl90;Ll/yk90;Ljava/lang/String;)V", LovePlanetStage.result, "", "f", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "e", "(Ljava/lang/Exception;)V", Constants.INAPP_DATA_TAG, "()V", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Ljava/util/Map;", "exception", "h", "(Ljava/lang/Exception;)Ljava/util/Map;", "b", "Ll/z06;", "c", "Ll/cl90;", "Ll/yk90;", "Ljava/lang/String;", "g", "()Ljava/util/Map;", "extraMapOnCancellation", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class z3g0<T> extends a4g0<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final z06<T> consumer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final cl90 producerListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final yk90 producerContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String producerName;

    public z3g0(@NotNull z06<T> z06Var, @NotNull cl90 cl90Var, @NotNull yk90 yk90Var, @NotNull String str) {
        z06Var.getClass();
        cl90Var.getClass();
        yk90Var.getClass();
        str.getClass();
        this.consumer = z06Var;
        this.producerListener = cl90Var;
        this.producerContext = yk90Var;
        this.producerName = str;
        cl90Var.mo110444d(yk90Var, str);
    }

    @Override // p153l.a4g0
    /* JADX INFO: renamed from: d */
    public void mo95924d() {
        cl90 cl90Var = this.producerListener;
        yk90 yk90Var = this.producerContext;
        String str = this.producerName;
        cl90Var.mo110443a(yk90Var, str, cl90Var.mo110449k(yk90Var, str) ? m218469g() : null);
        this.consumer.mo144953a();
    }

    @Override // p153l.a4g0
    /* JADX INFO: renamed from: e */
    public void mo95925e(@NotNull Exception e) {
        e.getClass();
        cl90 cl90Var = this.producerListener;
        yk90 yk90Var = this.producerContext;
        String str = this.producerName;
        cl90Var.mo110447i(yk90Var, str, e, cl90Var.mo110449k(yk90Var, str) ? m218470h(e) : null);
        this.consumer.onFailure(e);
    }

    @Override // p153l.a4g0
    /* JADX INFO: renamed from: f */
    public void mo95926f(@Nullable T result) {
        cl90 cl90Var = this.producerListener;
        yk90 yk90Var = this.producerContext;
        String str = this.producerName;
        cl90Var.mo110446f(yk90Var, str, cl90Var.mo110449k(yk90Var, str) ? mo8547i(result) : null);
        this.consumer.mo144954b(result, 1);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Map<String, String> m218469g() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Map<String, String> m218470h(@Nullable Exception exception) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Map<String, String> mo8547i(@Nullable T result) {
        return null;
    }
}
