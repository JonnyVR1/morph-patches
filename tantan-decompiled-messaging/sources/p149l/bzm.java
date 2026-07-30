package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/bzm;", "Ll/sxm;", "Ll/huc0;", "Ll/guc0;", "requestListener", "requestListener2", "<init>", "(Ll/guc0;Ll/huc0;)V", "Ll/uc90;", "producerContext", "", "b", "(Ll/uc90;)V", "c", "", "throwable", "g", "(Ll/uc90;Ljava/lang/Throwable;)V", "h", "Ll/guc0;", Constants.INAPP_DATA_TAG, "Ll/huc0;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class bzm extends sxm implements huc0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final guc0 requestListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final huc0 requestListener2;

    public bzm(@Nullable guc0 guc0Var, @Nullable huc0 huc0Var) {
        super(guc0Var, huc0Var);
        this.requestListener = guc0Var;
        this.requestListener2 = huc0Var;
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: b */
    public void mo104625b(@NotNull uc90 producerContext) {
        producerContext.getClass();
        guc0 guc0Var = this.requestListener;
        if (guc0Var != null) {
            guc0Var.mo109503e(producerContext.mo155873t(), producerContext.mo155867k(), producerContext.getId(), producerContext.mo155859H());
        }
        huc0 huc0Var = this.requestListener2;
        if (huc0Var != null) {
            huc0Var.mo104625b(producerContext);
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: c */
    public void mo104626c(@NotNull uc90 producerContext) {
        producerContext.getClass();
        guc0 guc0Var = this.requestListener;
        if (guc0Var != null) {
            guc0Var.mo109500b(producerContext.mo155873t(), producerContext.getId(), producerContext.mo155859H());
        }
        huc0 huc0Var = this.requestListener2;
        if (huc0Var != null) {
            huc0Var.mo104626c(producerContext);
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: g */
    public void mo104627g(@NotNull uc90 producerContext, @Nullable Throwable throwable) {
        producerContext.getClass();
        guc0 guc0Var = this.requestListener;
        if (guc0Var != null) {
            guc0Var.mo109508j(producerContext.mo155873t(), producerContext.getId(), throwable, producerContext.mo155859H());
        }
        huc0 huc0Var = this.requestListener2;
        if (huc0Var != null) {
            huc0Var.mo104627g(producerContext, throwable);
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: h */
    public void mo104628h(@NotNull uc90 producerContext) {
        producerContext.getClass();
        guc0 guc0Var = this.requestListener;
        if (guc0Var != null) {
            guc0Var.mo109509k(producerContext.getId());
        }
        huc0 huc0Var = this.requestListener2;
        if (huc0Var != null) {
            huc0Var.mo104628h(producerContext);
        }
    }
}
