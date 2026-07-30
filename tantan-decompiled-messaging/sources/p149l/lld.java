package p149l;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/lld;", "Ll/p13;", "Ll/r480;", "platformBitmapFactory", "Ll/q13;", "bitmapFrameRenderer", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Ll/r480;Ll/q13;Landroid/graphics/Bitmap$Config;Ljava/util/concurrent/ExecutorService;)V", "Ll/n13;", "bitmapFrameCache", "Ll/uq0;", "animationBackend", "", "frameNumber", "", "a", "(Ll/n13;Ll/uq0;I)Z", "backend", "g", "(Ll/uq0;I)I", "Ll/r480;", "b", "Ll/q13;", "c", "Landroid/graphics/Bitmap$Config;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "TAG", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "f", "Landroid/util/SparseArray;", "pendingFrameDecodeJobs", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lld implements p13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r480 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final q13 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService executorService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<lld> TAG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<Runnable> pendingFrameDecodeJobs;

    /* JADX INFO: renamed from: l.lld$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/lld$a;", "Ljava/lang/Runnable;", "Ll/uq0;", "animationBackend", "Ll/n13;", "bitmapFrameCache", "", "frameNumber", "frameId", "<init>", "(Ll/lld;Ll/uq0;Ll/n13;II)V", "", "run", "()V", "frameType", "", "a", "(II)Z", "Ll/fa5;", "Landroid/graphics/Bitmap;", "bitmapReference", "b", "(ILl/fa5;I)Z", "Ll/uq0;", "Ll/n13;", "c", "I", Constants.INAPP_DATA_TAG, "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class RunnableC18255a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final uq0 animationBackend;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n13 bitmapFrameCache;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int frameNumber;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int frameId;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ lld f128699e;

        public RunnableC18255a(@NotNull lld lldVar, @NotNull uq0 uq0Var, n13 n13Var, int i, int i2) {
            uq0Var.getClass();
            n13Var.getClass();
            this.f128699e = lldVar;
            this.animationBackend = uq0Var;
            this.bitmapFrameCache = n13Var;
            this.frameNumber = i;
            this.frameId = i2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m150474a(int frameNumber, int frameType) {
            fa5<Bitmap> fa5VarMo141824f;
            int i = 2;
            try {
                if (frameType == 1) {
                    fa5VarMo141824f = this.bitmapFrameCache.mo141824f(frameNumber, this.animationBackend.mo191269a(), this.animationBackend.mo191270b());
                } else {
                    if (frameType != 2) {
                        fa5.m120154v(null);
                        return false;
                    }
                    fa5VarMo141824f = this.f128699e.platformBitmapFactory.m177781b(this.animationBackend.mo191269a(), this.animationBackend.mo191270b(), this.f128699e.bitmapConfig);
                    i = -1;
                }
                fa5<Bitmap> fa5Var = fa5VarMo141824f;
                boolean zM150475b = m150475b(frameNumber, fa5Var, frameType);
                fa5.m120154v(fa5Var);
                return (zM150475b || i == -1) ? zM150475b : m150474a(frameNumber, i);
            } catch (RuntimeException e) {
                tsf.m190556v(this.f128699e.TAG, "Failed to create frame bitmap", e);
                return false;
            } finally {
                fa5.m120154v(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m150475b(int frameNumber, fa5<Bitmap> bitmapReference, int frameType) {
            if (fa5.m120144Q(bitmapReference) && bitmapReference != null) {
                q13 q13Var = this.f128699e.bitmapFrameRenderer;
                Bitmap bitmapM120155B = bitmapReference.m120155B();
                bitmapM120155B.getClass();
                if (q13Var.mo112974d(frameNumber, bitmapM120155B)) {
                    tsf.m190549o(this.f128699e.TAG, "Frame %d ready.", Integer.valueOf(frameNumber));
                    synchronized (this.f128699e.pendingFrameDecodeJobs) {
                        this.bitmapFrameCache.mo141823e(frameNumber, bitmapReference, frameType);
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
                if (this.bitmapFrameCache.mo141821c(this.frameNumber)) {
                    tsf.m190549o(this.f128699e.TAG, "Frame %d is cached already.", Integer.valueOf(this.frameNumber));
                    SparseArray sparseArray = this.f128699e.pendingFrameDecodeJobs;
                    lld lldVar = this.f128699e;
                    synchronized (sparseArray) {
                        lldVar.pendingFrameDecodeJobs.remove(this.frameId);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                boolean zM150474a = m150474a(this.frameNumber, 1);
                lld lldVar2 = this.f128699e;
                if (zM150474a) {
                    tsf.m190549o(lldVar2.TAG, "Prepared frame %d.", Integer.valueOf(this.frameNumber));
                } else {
                    tsf.m190540f(lldVar2.TAG, "Could not prepare frame %d.", Integer.valueOf(this.frameNumber));
                }
                SparseArray sparseArray2 = this.f128699e.pendingFrameDecodeJobs;
                lld lldVar3 = this.f128699e;
                synchronized (sparseArray2) {
                    lldVar3.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f128699e.pendingFrameDecodeJobs;
                lld lldVar4 = this.f128699e;
                synchronized (sparseArray3) {
                    lldVar4.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    public lld(@NotNull r480 r480Var, @NotNull q13 q13Var, @NotNull Bitmap.Config config, @NotNull ExecutorService executorService) {
        r480Var.getClass();
        q13Var.getClass();
        config.getClass();
        executorService.getClass();
        this.platformBitmapFactory = r480Var;
        this.bitmapFrameRenderer = q13Var;
        this.bitmapConfig = config;
        this.executorService = executorService;
        this.TAG = lld.class;
        this.pendingFrameDecodeJobs = new SparseArray<>();
    }

    @Override // p149l.p13
    /* JADX INFO: renamed from: a */
    public boolean mo150472a(@NotNull n13 bitmapFrameCache, @NotNull uq0 animationBackend, int frameNumber) {
        bitmapFrameCache.getClass();
        animationBackend.getClass();
        int iM150473g = m150473g(animationBackend, frameNumber);
        synchronized (this.pendingFrameDecodeJobs) {
            if (this.pendingFrameDecodeJobs.get(iM150473g) != null) {
                tsf.m190549o(this.TAG, "Already scheduled decode job for frame %d", Integer.valueOf(frameNumber));
                return true;
            }
            if (bitmapFrameCache.mo141821c(frameNumber)) {
                tsf.m190549o(this.TAG, "Frame %d is cached already.", Integer.valueOf(frameNumber));
                return true;
            }
            RunnableC18255a runnableC18255a = new RunnableC18255a(this, animationBackend, bitmapFrameCache, frameNumber, iM150473g);
            this.pendingFrameDecodeJobs.put(iM150473g, runnableC18255a);
            this.executorService.execute(runnableC18255a);
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m150473g(uq0 backend, int frameNumber) {
        return (backend.hashCode() * 31) + frameNumber;
    }
}
