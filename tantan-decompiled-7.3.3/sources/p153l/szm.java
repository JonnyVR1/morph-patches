package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m88121d2 = {"Ll/szm;", "Ll/cl90;", "Ll/dl90;", "producerListener", "producerListener2", "<init>", "(Ll/dl90;Ll/cl90;)V", "Ll/yk90;", "context", "", "producerName", "", Constants.INAPP_DATA_TAG, "(Ll/yk90;Ljava/lang/String;)V", "eventName", "j", "(Ll/yk90;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "f", "(Ll/yk90;Ljava/lang/String;Ljava/util/Map;)V", "", Constants.KEY_T, RXScreenCaptureService.KEY_INDEX, "(Ll/yk90;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "a", "", "successful", "e", "(Ll/yk90;Ljava/lang/String;Z)V", "k", "(Ll/yk90;Ljava/lang/String;)Z", "Ll/dl90;", "getProducerListener", "()Ll/dl90;", "b", "Ll/cl90;", "getProducerListener2", "()Ll/cl90;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class szm implements cl90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final dl90 producerListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final cl90 producerListener2;

    public szm(@Nullable dl90 dl90Var, @Nullable cl90 cl90Var) {
        this.producerListener = dl90Var;
        this.producerListener2 = cl90Var;
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: a */
    public void mo110443a(@NotNull yk90 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116744h(context.getId(), producerName, extraMap);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110443a(context, producerName, extraMap);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: d */
    public void mo110444d(@NotNull yk90 context, @Nullable String producerName) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116739a(context.getId(), producerName);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110444d(context, producerName);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: e */
    public void mo110445e(@NotNull yk90 context, @Nullable String producerName, boolean successful) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116745i(context.getId(), producerName, successful);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110445e(context, producerName, successful);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: f */
    public void mo110446f(@NotNull yk90 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116743g(context.getId(), producerName, extraMap);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110446f(context, producerName, extraMap);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: i */
    public void mo110447i(@NotNull yk90 context, @Nullable String producerName, @Nullable Throwable t, @Nullable Map<String, String> extraMap) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116740c(context.getId(), producerName, t, extraMap);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110447i(context, producerName, t, extraMap);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: j */
    public void mo110448j(@NotNull yk90 context, @Nullable String producerName, @Nullable String eventName) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        if (dl90Var != null) {
            dl90Var.mo116741d(context.getId(), producerName, eventName);
        }
        cl90 cl90Var = this.producerListener2;
        if (cl90Var != null) {
            cl90Var.mo110448j(context, producerName, eventName);
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: k */
    public boolean mo110449k(@NotNull yk90 context, @Nullable String producerName) {
        context.getClass();
        dl90 dl90Var = this.producerListener;
        Boolean boolValueOf = dl90Var != null ? Boolean.valueOf(dl90Var.mo116742f(context.getId())) : null;
        if (!Intrinsics.m88377d(boolValueOf, Boolean.TRUE)) {
            cl90 cl90Var = this.producerListener2;
            boolValueOf = cl90Var != null ? Boolean.valueOf(cl90Var.mo110449k(context, producerName)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
