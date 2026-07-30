package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u0001(B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0016J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102¨\u00065"}, m87232d2 = {"Ll/yg3;", "", "Ll/mfi;", "fileCache", "Ll/za80;", "pooledByteBufferFactory", "Ll/cb80;", "pooledByteStreams", "Ljava/util/concurrent/Executor;", "readExecutor", "writeExecutor", "Ll/wem;", "imageCacheStatsTracker", "<init>", "(Ll/mfi;Ll/za80;Ll/cb80;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ll/wem;)V", "Ll/cx3;", Constants.KEY_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Ll/iei0;", "Ll/jze;", "g", "(Ll/cx3;Ljava/util/concurrent/atomic/AtomicBoolean;)Ll/iei0;", "", "e", "(Ll/cx3;)V", "encodedImage", RXScreenCaptureService.KEY_INDEX, "(Ll/cx3;Ll/jze;)V", "Ljava/lang/Void;", "k", "(Ll/cx3;)Ll/iei0;", "h", "pinnedImage", "f", "(Ll/cx3;Ll/jze;)Ll/iei0;", "Lcom/facebook/common/memory/PooledByteBuffer;", "j", "(Ll/cx3;)Lcom/facebook/common/memory/PooledByteBuffer;", BLiveStormDanmakuGiftResourceType.f44444l, "a", "Ll/mfi;", "b", "Ll/za80;", "c", "Ll/cb80;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/Executor;", "Ll/wem;", "Ll/btf0;", "Ll/btf0;", "stagingArea", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yg3 {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Class<?> f198116h = yg3.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final mfi fileCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final za80 pooledByteBufferFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final cb80 pooledByteStreams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor readExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Executor writeExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final wem imageCacheStatsTracker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final btf0 stagingArea;

    public yg3(@NotNull mfi mfiVar, @NotNull za80 za80Var, @NotNull cb80 cb80Var, @NotNull Executor executor, @NotNull Executor executor2, @NotNull wem wemVar) {
        mfiVar.getClass();
        za80Var.getClass();
        cb80Var.getClass();
        executor.getClass();
        executor2.getClass();
        wemVar.getClass();
        this.fileCache = mfiVar;
        this.pooledByteBufferFactory = za80Var;
        this.pooledByteStreams = cb80Var;
        this.readExecutor = executor;
        this.writeExecutor = executor2;
        this.imageCacheStatsTracker = wemVar;
        btf0 btf0VarM103828b = btf0.m103828b();
        btf0VarM103828b.getClass();
        this.stagingArea = btf0VarM103828b;
    }

    /* JADX INFO: renamed from: a */
    public static void m214600a(jze jzeVar, yg3 yg3Var, OutputStream outputStream) throws IOException {
        yg3Var.getClass();
        outputStream.getClass();
        jzeVar.getClass();
        InputStream inputStreamM143899H = jzeVar.m143899H();
        if (inputStreamM143899H != null) {
            yg3Var.pooledByteStreams.m105972a(inputStreamM143899H, outputStream);
        } else {
            qkq0.m175383a("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Void m214601b(Object obj, yg3 yg3Var, cx3 cx3Var) {
        yg3Var.getClass();
        cx3Var.getClass();
        Object objM158045e = n6j.m158045e(obj, null);
        try {
            yg3Var.stagingArea.m103832e(cx3Var);
            yg3Var.fileCache.mo8123e(cx3Var);
            n6j.m158046f(objM158045e);
            return null;
        } catch (Throwable th) {
            try {
                n6j.m158043c(obj, th);
                throw th;
            } catch (Throwable th2) {
                n6j.m158046f(objM158045e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m214602c(Object obj, yg3 yg3Var, cx3 cx3Var, jze jzeVar) {
        yg3Var.getClass();
        cx3Var.getClass();
        Object objM158045e = n6j.m158045e(obj, null);
        try {
            yg3Var.m214611l(cx3Var, jzeVar);
            btf0 btf0Var = yg3Var.stagingArea;
            jzeVar.getClass();
            btf0Var.m103833f(cx3Var, jzeVar);
            jze.m143896n(jzeVar);
            n6j.m158046f(objM158045e);
        } catch (Throwable th) {
            try {
                n6j.m158043c(obj, th);
                throw th;
            } catch (Throwable th2) {
                btf0 btf0Var2 = yg3Var.stagingArea;
                jzeVar.getClass();
                btf0Var2.m103833f(cx3Var, jzeVar);
                jze.m143896n(jzeVar);
                n6j.m158046f(objM158045e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static jze m214603d(Object obj, AtomicBoolean atomicBoolean, yg3 yg3Var, cx3 cx3Var) {
        atomicBoolean.getClass();
        yg3Var.getClass();
        cx3Var.getClass();
        Object objM158045e = n6j.m158045e(obj, null);
        try {
            if (atomicBoolean.get()) {
                throw new CancellationException();
            }
            jze jzeVarM103829a = yg3Var.stagingArea.m103829a(cx3Var);
            if (jzeVarM103829a != null) {
                tsf.m190549o(f198116h, "Found image for %s in staging area", cx3Var.getAnimationUriString());
                yg3Var.imageCacheStatsTracker.mo175133b(cx3Var);
            } else {
                tsf.m190549o(f198116h, "Did not find image for %s in staging area", cx3Var.getAnimationUriString());
                yg3Var.imageCacheStatsTracker.mo175137f(cx3Var);
                try {
                    PooledByteBuffer pooledByteBufferM214609j = yg3Var.m214609j(cx3Var);
                    if (pooledByteBufferM214609j == null) {
                        n6j.m158046f(objM158045e);
                        return null;
                    }
                    fa5 fa5VarM120145S = fa5.m120145S(pooledByteBufferM214609j);
                    fa5VarM120145S.getClass();
                    try {
                        jze jzeVar = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
                        fa5.m120154v(fa5VarM120145S);
                        jzeVarM103829a = jzeVar;
                    } catch (Throwable th) {
                        fa5.m120154v(fa5VarM120145S);
                        throw th;
                    }
                } catch (Exception unused) {
                    n6j.m158046f(objM158045e);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                n6j.m158046f(objM158045e);
                return jzeVarM103829a;
            }
            tsf.m190548n(f198116h, "Host thread was interrupted, decreasing reference count");
            jzeVarM103829a.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                n6j.m158043c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                n6j.m158046f(objM158045e);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m214604e(@NotNull cx3 key) {
        key.getClass();
        this.fileCache.mo8122d(key);
    }

    /* JADX INFO: renamed from: f */
    public final iei0<jze> m214605f(cx3 key, jze pinnedImage) {
        tsf.m190549o(f198116h, "Found image for %s in staging area", key.getAnimationUriString());
        this.imageCacheStatsTracker.mo175133b(key);
        iei0<jze> iei0VarM135694h = iei0.m135694h(pinnedImage);
        iei0VarM135694h.getClass();
        return iei0VarM135694h;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final iei0<jze> m214606g(@NotNull cx3 key, @NotNull AtomicBoolean isCancelled) {
        iei0<jze> iei0VarM214607h;
        iei0<jze> iei0VarM214605f;
        key.getClass();
        isCancelled.getClass();
        if (!o6j.m162852d()) {
            jze jzeVarM103829a = this.stagingArea.m103829a(key);
            return (jzeVarM103829a == null || (iei0VarM214605f = m214605f(key, jzeVarM103829a)) == null) ? m214607h(key, isCancelled) : iei0VarM214605f;
        }
        o6j.m162850a("BufferedDiskCache#get");
        try {
            jze jzeVarM103829a2 = this.stagingArea.m103829a(key);
            if (jzeVarM103829a2 == null || (iei0VarM214607h = m214605f(key, jzeVarM103829a2)) == null) {
                iei0VarM214607h = m214607h(key, isCancelled);
            }
            return iei0VarM214607h;
        } finally {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final iei0<jze> m214607h(final cx3 key, final AtomicBoolean isCancelled) {
        try {
            final Object objM158044d = n6j.m158044d("BufferedDiskCache_getAsync");
            return iei0.m135690b(new Callable() { // from class: l.ug3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return yg3.m214603d(objM158044d, isCancelled, this, key);
                }
            }, this.readExecutor);
        } catch (Exception e) {
            tsf.m190558x(f198116h, e, "Failed to schedule disk-cache read for %s", key.getAnimationUriString());
            return iei0.m135693g(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m214608i(@NotNull final cx3 key, @NotNull jze encodedImage) {
        key.getClass();
        encodedImage.getClass();
        if (!o6j.m162852d()) {
            if (!jze.m143894c0(encodedImage)) {
                qkq0.m175383a("Check failed.");
                return;
            }
            this.stagingArea.m103831d(key, encodedImage);
            final jze jzeVarM143895m = jze.m143895m(encodedImage);
            try {
                final Object objM158044d = n6j.m158044d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: l.wg3
                    @Override // java.lang.Runnable
                    public final void run() {
                        yg3.m214602c(objM158044d, this, key, jzeVarM143895m);
                    }
                });
                return;
            } catch (Exception e) {
                tsf.m190558x(f198116h, e, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.m103833f(key, encodedImage);
                jze.m143896n(jzeVarM143895m);
                return;
            }
        }
        o6j.m162850a("BufferedDiskCache#put");
        try {
            if (!jze.m143894c0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.m103831d(key, encodedImage);
            final jze jzeVarM143895m2 = jze.m143895m(encodedImage);
            try {
                final Object objM158044d2 = n6j.m158044d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: l.wg3
                    @Override // java.lang.Runnable
                    public final void run() {
                        yg3.m214602c(objM158044d2, this, key, jzeVarM143895m2);
                    }
                });
            } catch (Exception e2) {
                tsf.m190558x(f198116h, e2, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.m103833f(key, encodedImage);
                jze.m143896n(jzeVarM143895m2);
            }
            Unit unit = Unit.INSTANCE;
            o6j.m162851b();
        } catch (Throwable th) {
            o6j.m162851b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final PooledByteBuffer m214609j(cx3 key) throws IOException {
        try {
            Class<?> cls = f198116h;
            tsf.m190549o(cls, "Disk cache read for %s", key.getAnimationUriString());
            ox2 ox2VarMo8121c = this.fileCache.mo8121c(key);
            if (ox2VarMo8121c == null) {
                tsf.m190549o(cls, "Disk cache miss for %s", key.getAnimationUriString());
                this.imageCacheStatsTracker.mo175135d(key);
                return null;
            }
            tsf.m190549o(cls, "Found entry in disk cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.mo175145n(key);
            InputStream inputStreamMo149700a = ox2VarMo8121c.mo149700a();
            try {
                PooledByteBuffer pooledByteBufferMo111849e = this.pooledByteBufferFactory.mo111849e(inputStreamMo149700a, (int) ox2VarMo8121c.size());
                inputStreamMo149700a.close();
                tsf.m190549o(cls, "Successful read from disk cache for %s", key.getAnimationUriString());
                return pooledByteBufferMo111849e;
            } catch (Throwable th) {
                inputStreamMo149700a.close();
                throw th;
            }
        } catch (IOException e) {
            tsf.m190558x(f198116h, e, "Exception reading from cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.mo175143l(key);
            throw e;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final iei0<Void> m214610k(@NotNull final cx3 key) {
        key.getClass();
        this.stagingArea.m103832e(key);
        try {
            final Object objM158044d = n6j.m158044d("BufferedDiskCache_remove");
            return iei0.m135690b(new Callable() { // from class: l.vg3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return yg3.m214601b(objM158044d, this, key);
                }
            }, this.writeExecutor);
        } catch (Exception e) {
            tsf.m190558x(f198116h, e, "Failed to schedule disk-cache remove for %s", key.getAnimationUriString());
            return iei0.m135693g(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m214611l(cx3 key, final jze encodedImage) {
        Class<?> cls = f198116h;
        tsf.m190549o(cls, "About to write to disk-cache for key %s", key.getAnimationUriString());
        try {
            this.fileCache.mo8119a(key, new mbq0() { // from class: l.xg3
                @Override // p149l.mbq0
                /* JADX INFO: renamed from: a */
                public final void mo153972a(OutputStream outputStream) throws IOException {
                    yg3.m214600a(encodedImage, this, outputStream);
                }
            });
            this.imageCacheStatsTracker.mo175139h(key);
            tsf.m190549o(cls, "Successful disk-cache write for key %s", key.getAnimationUriString());
        } catch (IOException e) {
            tsf.m190558x(f198116h, e, "Failed to write to disk-cache for key %s", key.getAnimationUriString());
        }
    }
}
