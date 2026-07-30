package p153l;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/rmd;", "Ll/e23;", "Ll/xc80;", "platformBitmapFactory", "Ll/f23;", "bitmapFrameRenderer", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Ll/xc80;Ll/f23;Landroid/graphics/Bitmap$Config;Ljava/util/concurrent/ExecutorService;)V", "Ll/c23;", "bitmapFrameCache", "Ll/yq0;", "animationBackend", "", "frameNumber", "", "a", "(Ll/c23;Ll/yq0;I)Z", "backend", "g", "(Ll/yq0;I)I", "Ll/xc80;", "b", "Ll/f23;", "c", "Landroid/graphics/Bitmap$Config;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "TAG", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "f", "Landroid/util/SparseArray;", "pendingFrameDecodeJobs", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class rmd implements e23 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xc80 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f23 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService executorService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<rmd> TAG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<Runnable> pendingFrameDecodeJobs;

    /* JADX INFO: renamed from: l.rmd$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/rmd$a;", "Ljava/lang/Runnable;", "Ll/yq0;", "animationBackend", "Ll/c23;", "bitmapFrameCache", "", "frameNumber", "frameId", "<init>", "(Ll/rmd;Ll/yq0;Ll/c23;II)V", "", "run", "()V", "frameType", "", "a", "(II)Z", "Ll/fb5;", "Landroid/graphics/Bitmap;", "bitmapReference", "b", "(ILl/fb5;I)Z", "Ll/yq0;", "Ll/c23;", "c", "I", Constants.INAPP_DATA_TAG, "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class RunnableC19872a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final yq0 animationBackend;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c23 bitmapFrameCache;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int frameNumber;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int frameId;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ rmd f163853e;

        public RunnableC19872a(@NotNull rmd rmdVar, @NotNull yq0 yq0Var, c23 c23Var, int i, int i2) {
            yq0Var.getClass();
            c23Var.getClass();
            this.f163853e = rmdVar;
            this.animationBackend = yq0Var;
            this.bitmapFrameCache = c23Var;
            this.frameNumber = i;
            this.frameId = i2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m182059a(int frameNumber, int frameType) {
            fb5<Bitmap> fb5VarMo107672f;
            int i = 2;
            try {
                if (frameType == 1) {
                    fb5VarMo107672f = this.bitmapFrameCache.mo107672f(frameNumber, this.animationBackend.mo143067a(), this.animationBackend.mo143068b());
                } else {
                    if (frameType != 2) {
                        fb5.m124874v(null);
                        return false;
                    }
                    fb5VarMo107672f = this.f163853e.platformBitmapFactory.m210133b(this.animationBackend.mo143067a(), this.animationBackend.mo143068b(), this.f163853e.bitmapConfig);
                    i = -1;
                }
                fb5<Bitmap> fb5Var = fb5VarMo107672f;
                boolean zM182060b = m182060b(frameNumber, fb5Var, frameType);
                fb5.m124874v(fb5Var);
                return (zM182060b || i == -1) ? zM182060b : m182059a(frameNumber, i);
            } catch (RuntimeException e) {
                huf.m137194v(this.f163853e.TAG, "Failed to create frame bitmap", e);
                return false;
            } finally {
                fb5.m124874v(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m182060b(int frameNumber, fb5<Bitmap> bitmapReference, int frameType) {
            if (fb5.m124864Q(bitmapReference) && bitmapReference != null) {
                f23 f23Var = this.f163853e.bitmapFrameRenderer;
                Bitmap bitmapM124875B = bitmapReference.m124875B();
                bitmapM124875B.getClass();
                if (f23Var.mo123596d(frameNumber, bitmapM124875B)) {
                    huf.m137187o(this.f163853e.TAG, "Frame %d ready.", Integer.valueOf(frameNumber));
                    synchronized (this.f163853e.pendingFrameDecodeJobs) {
                        this.bitmapFrameCache.mo107671e(frameNumber, bitmapReference, frameType);
                        Unit unit = Unit.INSTANCE;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.bitmapFrameCache.mo107669c(this.frameNumber)) {
                    huf.m137187o(this.f163853e.TAG, "Frame %d is cached already.", Integer.valueOf(this.frameNumber));
                    SparseArray sparseArray = this.f163853e.pendingFrameDecodeJobs;
                    rmd rmdVar = this.f163853e;
                    synchronized (sparseArray) {
                        rmdVar.pendingFrameDecodeJobs.remove(this.frameId);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                boolean zM182059a = m182059a(this.frameNumber, 1);
                rmd rmdVar2 = this.f163853e;
                if (zM182059a) {
                    huf.m137187o(rmdVar2.TAG, "Prepared frame %d.", Integer.valueOf(this.frameNumber));
                } else {
                    huf.m137178f(rmdVar2.TAG, "Could not prepare frame %d.", Integer.valueOf(this.frameNumber));
                }
                SparseArray sparseArray2 = this.f163853e.pendingFrameDecodeJobs;
                rmd rmdVar3 = this.f163853e;
                synchronized (sparseArray2) {
                    rmdVar3.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f163853e.pendingFrameDecodeJobs;
                rmd rmdVar4 = this.f163853e;
                synchronized (sparseArray3) {
                    rmdVar4.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    public rmd(@NotNull xc80 xc80Var, @NotNull f23 f23Var, @NotNull Bitmap.Config config, @NotNull ExecutorService executorService) {
        xc80Var.getClass();
        f23Var.getClass();
        config.getClass();
        executorService.getClass();
        this.platformBitmapFactory = xc80Var;
        this.bitmapFrameRenderer = f23Var;
        this.bitmapConfig = config;
        this.executorService = executorService;
        this.TAG = rmd.class;
        this.pendingFrameDecodeJobs = new SparseArray<>();
    }

    @Override // p153l.e23
    /* JADX INFO: renamed from: a */
    public boolean mo119040a(@NotNull c23 bitmapFrameCache, @NotNull yq0 animationBackend, int frameNumber) {
        bitmapFrameCache.getClass();
        animationBackend.getClass();
        int iM182058g = m182058g(animationBackend, frameNumber);
        synchronized (this.pendingFrameDecodeJobs) {
            if (this.pendingFrameDecodeJobs.get(iM182058g) != null) {
                huf.m137187o(this.TAG, "Already scheduled decode job for frame %d", Integer.valueOf(frameNumber));
                return true;
            }
            if (bitmapFrameCache.mo107669c(frameNumber)) {
                huf.m137187o(this.TAG, "Frame %d is cached already.", Integer.valueOf(frameNumber));
                return true;
            }
            RunnableC19872a runnableC19872a = new RunnableC19872a(this, animationBackend, bitmapFrameCache, frameNumber, iM182058g);
            this.pendingFrameDecodeJobs.put(iM182058g, runnableC19872a);
            this.executorService.execute(runnableC19872a);
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m182058g(yq0 backend, int frameNumber) {
        return (backend.hashCode() * 31) + frameNumber;
    }
}
