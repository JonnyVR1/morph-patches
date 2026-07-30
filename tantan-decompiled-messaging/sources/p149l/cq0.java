package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/cq0;", "Ll/gr0;", "Ll/bq0;", "animatedDrawableBackend", "<init>", "(Ll/bq0;)V", "", "getFrameCount", "()I", "frameNumber", "g", "(I)I", "getLoopCount", "f", "width", "height", "a", "Ll/bq0;", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class cq0 implements gr0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final bq0 animatedDrawableBackend;

    public cq0(@NotNull bq0 bq0Var) {
        bq0Var.getClass();
        this.animatedDrawableBackend = bq0Var;
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: f */
    public int mo108210f() {
        return this.animatedDrawableBackend.mo103307d();
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: g */
    public int mo108211g(int frameNumber) {
        return this.animatedDrawableBackend.mo103304a(frameNumber);
    }

    @Override // p149l.gr0
    public int getFrameCount() {
        return this.animatedDrawableBackend.getFrameCount();
    }

    @Override // p149l.gr0
    public int getLoopCount() {
        return this.animatedDrawableBackend.getLoopCount();
    }

    @Override // p149l.gr0
    public int height() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p149l.gr0
    public int width() {
        return this.animatedDrawableBackend.getWidth();
    }
}
