package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m87232d2 = {"Ll/sxm;", "Ll/yc90;", "Ll/zc90;", "producerListener", "producerListener2", "<init>", "(Ll/zc90;Ll/yc90;)V", "Ll/uc90;", "context", "", "producerName", "", Constants.INAPP_DATA_TAG, "(Ll/uc90;Ljava/lang/String;)V", "eventName", "j", "(Ll/uc90;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "f", "(Ll/uc90;Ljava/lang/String;Ljava/util/Map;)V", "", Constants.KEY_T, RXScreenCaptureService.KEY_INDEX, "(Ll/uc90;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "a", "", "successful", "e", "(Ll/uc90;Ljava/lang/String;Z)V", "k", "(Ll/uc90;Ljava/lang/String;)Z", "Ll/zc90;", "getProducerListener", "()Ll/zc90;", "b", "Ll/yc90;", "getProducerListener2", "()Ll/yc90;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class sxm implements yc90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final zc90 producerListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final yc90 producerListener2;

    public sxm(@Nullable zc90 zc90Var, @Nullable yc90 yc90Var) {
        this.producerListener = zc90Var;
        this.producerListener2 = yc90Var;
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: a */
    public void mo104753a(@NotNull uc90 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109506h(context.getId(), producerName, extraMap);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104753a(context, producerName, extraMap);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: d */
    public void mo104754d(@NotNull uc90 context, @Nullable String producerName) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109499a(context.getId(), producerName);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104754d(context, producerName);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: e */
    public void mo104755e(@NotNull uc90 context, @Nullable String producerName, boolean successful) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109507i(context.getId(), producerName, successful);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104755e(context, producerName, successful);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: f */
    public void mo104756f(@NotNull uc90 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109505g(context.getId(), producerName, extraMap);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104756f(context, producerName, extraMap);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: i */
    public void mo104757i(@NotNull uc90 context, @Nullable String producerName, @Nullable Throwable t, @Nullable Map<String, String> extraMap) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109501c(context.getId(), producerName, t, extraMap);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104757i(context, producerName, t, extraMap);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: j */
    public void mo104758j(@NotNull uc90 context, @Nullable String producerName, @Nullable String eventName) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        if (zc90Var != null) {
            zc90Var.mo109502d(context.getId(), producerName, eventName);
        }
        yc90 yc90Var = this.producerListener2;
        if (yc90Var != null) {
            yc90Var.mo104758j(context, producerName, eventName);
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: k */
    public boolean mo104759k(@NotNull uc90 context, @Nullable String producerName) {
        context.getClass();
        zc90 zc90Var = this.producerListener;
        Boolean boolValueOf = zc90Var != null ? Boolean.valueOf(zc90Var.mo109504f(context.getId())) : null;
        if (!Intrinsics.m87488d(boolValueOf, Boolean.TRUE)) {
            yc90 yc90Var = this.producerListener2;
            boolValueOf = yc90Var != null ? Boolean.valueOf(yc90Var.mo104759k(context, producerName)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
