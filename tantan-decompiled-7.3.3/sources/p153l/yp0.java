package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/yp0;", "Ll/kr0;", "Ll/xp0;", "animatedDrawableBackend", "<init>", "(Ll/xp0;)V", "", "getFrameCount", "()I", "frameNumber", "g", "(I)I", "getLoopCount", "f", "width", "height", "a", "Ll/xp0;", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class yp0 implements kr0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xp0 animatedDrawableBackend;

    public yp0(@NotNull xp0 xp0Var) {
        xp0Var.getClass();
        this.animatedDrawableBackend = xp0Var;
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: f */
    public int mo143072f() {
        return this.animatedDrawableBackend.mo99393d();
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: g */
    public int mo143073g(int frameNumber) {
        return this.animatedDrawableBackend.mo99390a(frameNumber);
    }

    @Override // p153l.kr0
    public int getFrameCount() {
        return this.animatedDrawableBackend.getFrameCount();
    }

    @Override // p153l.kr0
    public int getLoopCount() {
        return this.animatedDrawableBackend.getLoopCount();
    }

    @Override // p153l.kr0
    public int height() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p153l.kr0
    public int width() {
        return this.animatedDrawableBackend.getWidth();
    }
}
