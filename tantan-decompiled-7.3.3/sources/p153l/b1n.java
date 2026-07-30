package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/b1n;", "Ll/szm;", "Ll/k2d0;", "Ll/j2d0;", "requestListener", "requestListener2", "<init>", "(Ll/j2d0;Ll/k2d0;)V", "Ll/yk90;", "producerContext", "", "b", "(Ll/yk90;)V", "c", "", "throwable", "g", "(Ll/yk90;Ljava/lang/Throwable;)V", "h", "Ll/j2d0;", Constants.INAPP_DATA_TAG, "Ll/k2d0;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class b1n extends szm implements k2d0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final j2d0 requestListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final k2d0 requestListener2;

    public b1n(@Nullable j2d0 j2d0Var, @Nullable k2d0 k2d0Var) {
        super(j2d0Var, k2d0Var);
        this.requestListener = j2d0Var;
        this.requestListener2 = k2d0Var;
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: b */
    public void mo101485b(@NotNull yk90 producerContext) {
        producerContext.getClass();
        j2d0 j2d0Var = this.requestListener;
        if (j2d0Var != null) {
            j2d0Var.mo143212e(producerContext.mo117678t(), producerContext.mo117672k(), producerContext.getId(), producerContext.mo117666H());
        }
        k2d0 k2d0Var = this.requestListener2;
        if (k2d0Var != null) {
            k2d0Var.mo101485b(producerContext);
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: c */
    public void mo101486c(@NotNull yk90 producerContext) {
        producerContext.getClass();
        j2d0 j2d0Var = this.requestListener;
        if (j2d0Var != null) {
            j2d0Var.mo143211b(producerContext.mo117678t(), producerContext.getId(), producerContext.mo117666H());
        }
        k2d0 k2d0Var = this.requestListener2;
        if (k2d0Var != null) {
            k2d0Var.mo101486c(producerContext);
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: g */
    public void mo101487g(@NotNull yk90 producerContext, @Nullable Throwable throwable) {
        producerContext.getClass();
        j2d0 j2d0Var = this.requestListener;
        if (j2d0Var != null) {
            j2d0Var.mo143213j(producerContext.mo117678t(), producerContext.getId(), throwable, producerContext.mo117666H());
        }
        k2d0 k2d0Var = this.requestListener2;
        if (k2d0Var != null) {
            k2d0Var.mo101487g(producerContext, throwable);
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: h */
    public void mo101488h(@NotNull yk90 producerContext) {
        producerContext.getClass();
        j2d0 j2d0Var = this.requestListener;
        if (j2d0Var != null) {
            j2d0Var.mo143214k(producerContext.getId());
        }
        k2d0 k2d0Var = this.requestListener2;
        if (k2d0Var != null) {
            k2d0Var.mo101488h(producerContext);
        }
    }
}
