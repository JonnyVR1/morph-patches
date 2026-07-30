package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOpenStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u00011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Ll/ytq;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Ll/dce;", "Ll/uq0;", "animationBackend", "<init>", "(Ll/uq0;)V", "", "alpha", "", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "start", "()V", "stop", "", "isRunning", "()Z", "a", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", BLiveOpenStatus.draw, "(Landroid/graphics/Canvas;)V", "Ll/uq0;", "Ll/cr0;", "b", "Ll/cr0;", "animatedFrameScheduler", "Ll/hr0;", "c", "Ll/hr0;", "animationListener", "Ll/rbe;", Constants.INAPP_DATA_TAG, "Ll/rbe;", "drawableProperties", "l/ytq$a", "e", "Ll/ytq$a;", "invalidateRunnable", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ytq extends Drawable implements Animatable, dce {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public uq0 animationBackend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final cr0 animatedFrameScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public hr0 animationListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final rbe drawableProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final RunnableC21511a invalidateRunnable;

    /* JADX INFO: renamed from: l.ytq$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/ytq$a", "Ljava/lang/Runnable;", "", "run", "()V", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class RunnableC21511a implements Runnable {
        public RunnableC21511a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ytq.this.unscheduleSelf(this);
            ytq.this.invalidateSelf();
        }
    }

    public ytq(@NotNull uq0 uq0Var) {
        uq0Var.getClass();
        this.animationBackend = uq0Var;
        this.animatedFrameScheduler = new cr0(new iee(this.animationBackend));
        this.animationListener = new qe2();
        rbe rbeVar = new rbe();
        rbeVar.m178595a(this);
        this.drawableProperties = rbeVar;
        this.invalidateRunnable = new RunnableC21511a();
    }

    @Override // p149l.dce
    /* JADX INFO: renamed from: a */
    public void mo98207a() {
        this.animationBackend.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        int iM108310a = this.animatedFrameScheduler.m108310a();
        if (iM108310a == -1) {
            iM108310a = this.animationBackend.getFrameCount() - 1;
            this.animatedFrameScheduler.m108316g(false);
            this.animationListener.mo132610b(this);
        } else if (iM108310a == 0 && this.animatedFrameScheduler.m108317h()) {
            this.animationListener.onAnimationRepeat(this);
        }
        if (this.animationBackend.mo191275i(this, canvas, iM108310a)) {
            this.animationListener.mo76385a(this, iM108310a);
            this.animatedFrameScheduler.m108315f(iM108310a);
        } else {
            this.animatedFrameScheduler.m108314e();
        }
        long jM108312c = this.animatedFrameScheduler.m108312c();
        if (jM108312c != -1) {
            scheduleSelf(this.invalidateRunnable, jM108312c);
        } else {
            this.animationListener.mo132610b(this);
            this.animatedFrameScheduler.m108316g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.animationBackend.mo191270b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.animationBackend.mo191269a();
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
        this.animationBackend.mo191271c(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawableProperties.m178596b(alpha);
        this.animationBackend.mo191274h(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableProperties.m178597c(colorFilter);
        this.animationBackend.mo191272d(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.animationBackend.getFrameCount() <= 0) {
            return;
        }
        this.animatedFrameScheduler.m108318i();
        this.animationListener.onAnimationStart(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animatedFrameScheduler.m108319j();
        this.animationListener.mo132610b(this);
        unscheduleSelf(this.invalidateRunnable);
    }
}
