package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveOpenStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u00011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Ll/zvq;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Ll/hde;", "Ll/yq0;", "animationBackend", "<init>", "(Ll/yq0;)V", "", "alpha", "", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "start", "()V", "stop", "", "isRunning", "()Z", "a", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", BLiveOpenStatus.draw, "(Landroid/graphics/Canvas;)V", "Ll/yq0;", "Ll/gr0;", "b", "Ll/gr0;", "animatedFrameScheduler", "Ll/lr0;", "c", "Ll/lr0;", "animationListener", "Ll/vce;", Constants.INAPP_DATA_TAG, "Ll/vce;", "drawableProperties", "l/zvq$a", "e", "Ll/zvq$a;", "invalidateRunnable", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class zvq extends Drawable implements Animatable, hde {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public yq0 animationBackend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gr0 animatedFrameScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public lr0 animationListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final vce drawableProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final RunnableC21907a invalidateRunnable;

    /* JADX INFO: renamed from: l.zvq$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/zvq$a", "Ljava/lang/Runnable;", "", "run", "()V", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class RunnableC21907a implements Runnable {
        public RunnableC21907a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zvq.this.unscheduleSelf(this);
            zvq.this.invalidateSelf();
        }
    }

    public zvq(@NotNull yq0 yq0Var) {
        yq0Var.getClass();
        this.animationBackend = yq0Var;
        this.animatedFrameScheduler = new gr0(new mfe(this.animationBackend));
        this.animationListener = new ye2();
        vce vceVar = new vce();
        vceVar.m200797a(this);
        this.drawableProperties = vceVar;
        this.invalidateRunnable = new RunnableC21907a();
    }

    @Override // p153l.hde
    /* JADX INFO: renamed from: a */
    public void mo134586a() {
        this.animationBackend.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        int iM131511a = this.animatedFrameScheduler.m131511a();
        if (iM131511a == -1) {
            iM131511a = this.animationBackend.getFrameCount() - 1;
            this.animatedFrameScheduler.m131517g(false);
            this.animationListener.mo155514b(this);
        } else if (iM131511a == 0 && this.animatedFrameScheduler.m131518h()) {
            this.animationListener.onAnimationRepeat(this);
        }
        if (this.animationBackend.mo99580i(this, canvas, iM131511a)) {
            this.animationListener.mo77568a(this, iM131511a);
            this.animatedFrameScheduler.m131516f(iM131511a);
        } else {
            this.animatedFrameScheduler.m131515e();
        }
        long jM131513c = this.animatedFrameScheduler.m131513c();
        if (jM131513c != -1) {
            scheduleSelf(this.invalidateRunnable, jM131513c);
        } else {
            this.animationListener.mo155514b(this);
            this.animatedFrameScheduler.m131517g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.animationBackend.mo143068b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.animationBackend.mo143067a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animatedFrameScheduler.getRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        bounds.getClass();
        this.animationBackend.mo143069c(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawableProperties.m200798b(alpha);
        this.animationBackend.mo143074h(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableProperties.m200799c(colorFilter);
        this.animationBackend.mo143070d(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.animationBackend.getFrameCount() <= 0) {
            return;
        }
        this.animatedFrameScheduler.m131519i();
        this.animationListener.onAnimationStart(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animatedFrameScheduler.m131520j();
        this.animationListener.mo155514b(this);
        unscheduleSelf(this.invalidateRunnable);
    }
}
