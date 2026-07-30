package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u0001(B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0016J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102¨\u00065"}, m88121d2 = {"Ll/mh3;", "", "Ll/iii;", "fileCache", "Ll/fj80;", "pooledByteBufferFactory", "Ll/ij80;", "pooledByteStreams", "Ljava/util/concurrent/Executor;", "readExecutor", "writeExecutor", "Ll/mhm;", "imageCacheStatsTracker", "<init>", "(Ll/iii;Ll/fj80;Ll/ij80;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ll/mhm;)V", "Ll/by3;", Constants.KEY_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Ll/ini0;", "Ll/n0f;", "g", "(Ll/by3;Ljava/util/concurrent/atomic/AtomicBoolean;)Ll/ini0;", "", "e", "(Ll/by3;)V", "encodedImage", RXScreenCaptureService.KEY_INDEX, "(Ll/by3;Ll/n0f;)V", "Ljava/lang/Void;", "k", "(Ll/by3;)Ll/ini0;", "h", "pinnedImage", "f", "(Ll/by3;Ll/n0f;)Ll/ini0;", "Lcom/facebook/common/memory/PooledByteBuffer;", "j", "(Ll/by3;)Lcom/facebook/common/memory/PooledByteBuffer;", BLiveStormDanmakuGiftResourceType.f45292l, "a", "Ll/iii;", "b", "Ll/fj80;", "c", "Ll/ij80;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/Executor;", "Ll/mhm;", "Ll/k1g0;", "Ll/k1g0;", "stagingArea", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mh3 {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Class<?> f136818h = mh3.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final iii fileCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final fj80 pooledByteBufferFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ij80 pooledByteStreams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor readExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Executor writeExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final mhm imageCacheStatsTracker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final k1g0 stagingArea;

    public mh3(@NotNull iii iiiVar, @NotNull fj80 fj80Var, @NotNull ij80 ij80Var, @NotNull Executor executor, @NotNull Executor executor2, @NotNull mhm mhmVar) {
        iiiVar.getClass();
        fj80Var.getClass();
        ij80Var.getClass();
        executor.getClass();
        executor2.getClass();
        mhmVar.getClass();
        this.fileCache = iiiVar;
        this.pooledByteBufferFactory = fj80Var;
        this.pooledByteStreams = ij80Var;
        this.readExecutor = executor;
        this.writeExecutor = executor2;
        this.imageCacheStatsTracker = mhmVar;
        k1g0 k1g0VarM147857b = k1g0.m147857b();
        k1g0VarM147857b.getClass();
        this.stagingArea = k1g0VarM147857b;
    }

    /* JADX INFO: renamed from: a */
    public static void m158398a(n0f n0fVar, mh3 mh3Var, OutputStream outputStream) throws IOException {
        mh3Var.getClass();
        outputStream.getClass();
        n0fVar.getClass();
        InputStream inputStreamM160962H = n0fVar.m160962H();
        if (inputStreamM160962H != null) {
            mh3Var.pooledByteStreams.m140188a(inputStreamM160962H, outputStream);
        } else {
            wtq0.m207906a("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Void m158399b(Object obj, mh3 mh3Var, by3 by3Var) {
        mh3Var.getClass();
        by3Var.getClass();
        Object objM134078e = h9j.m134078e(obj, null);
        try {
            mh3Var.stagingArea.m147861e(by3Var);
            mh3Var.fileCache.mo8177e(by3Var);
            h9j.m134079f(objM134078e);
            return null;
        } catch (Throwable th) {
            try {
                h9j.m134076c(obj, th);
                throw th;
            } catch (Throwable th2) {
                h9j.m134079f(objM134078e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m158400c(Object obj, mh3 mh3Var, by3 by3Var, n0f n0fVar) {
        mh3Var.getClass();
        by3Var.getClass();
        Object objM134078e = h9j.m134078e(obj, null);
        try {
            mh3Var.m158409l(by3Var, n0fVar);
            k1g0 k1g0Var = mh3Var.stagingArea;
            n0fVar.getClass();
            k1g0Var.m147862f(by3Var, n0fVar);
            n0f.m160959n(n0fVar);
            h9j.m134079f(objM134078e);
        } catch (Throwable th) {
            try {
                h9j.m134076c(obj, th);
                throw th;
            } catch (Throwable th2) {
                k1g0 k1g0Var2 = mh3Var.stagingArea;
                n0fVar.getClass();
                k1g0Var2.m147862f(by3Var, n0fVar);
                n0f.m160959n(n0fVar);
                h9j.m134079f(objM134078e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static n0f m158401d(Object obj, AtomicBoolean atomicBoolean, mh3 mh3Var, by3 by3Var) {
        atomicBoolean.getClass();
        mh3Var.getClass();
        by3Var.getClass();
        Object objM134078e = h9j.m134078e(obj, null);
        try {
            if (atomicBoolean.get()) {
                throw new CancellationException();
            }
            n0f n0fVarM147858a = mh3Var.stagingArea.m147858a(by3Var);
            if (n0fVarM147858a != null) {
                huf.m137187o(f136818h, "Found image for %s in staging area", by3Var.getAnimationUriString());
                mh3Var.imageCacheStatsTracker.mo122416b(by3Var);
            } else {
                huf.m137187o(f136818h, "Did not find image for %s in staging area", by3Var.getAnimationUriString());
                mh3Var.imageCacheStatsTracker.mo122420f(by3Var);
                try {
                    PooledByteBuffer pooledByteBufferM158407j = mh3Var.m158407j(by3Var);
                    if (pooledByteBufferM158407j == null) {
                        h9j.m134079f(objM134078e);
                        return null;
                    }
                    fb5 fb5VarM124865S = fb5.m124865S(pooledByteBufferM158407j);
                    fb5VarM124865S.getClass();
                    try {
                        n0f n0fVar = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
                        fb5.m124874v(fb5VarM124865S);
                        n0fVarM147858a = n0fVar;
                    } catch (Throwable th) {
                        fb5.m124874v(fb5VarM124865S);
                        throw th;
                    }
                } catch (Exception unused) {
                    h9j.m134079f(objM134078e);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                h9j.m134079f(objM134078e);
                return n0fVarM147858a;
            }
            huf.m137186n(f136818h, "Host thread was interrupted, decreasing reference count");
            n0fVarM147858a.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                h9j.m134076c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                h9j.m134079f(objM134078e);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m158402e(@NotNull by3 key) {
        key.getClass();
        this.fileCache.mo8176d(key);
    }

    /* JADX INFO: renamed from: f */
    public final ini0<n0f> m158403f(by3 key, n0f pinnedImage) {
        huf.m137187o(f136818h, "Found image for %s in staging area", key.getAnimationUriString());
        this.imageCacheStatsTracker.mo122416b(key);
        ini0<n0f> ini0VarM141136h = ini0.m141136h(pinnedImage);
        ini0VarM141136h.getClass();
        return ini0VarM141136h;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ini0<n0f> m158404g(@NotNull by3 key, @NotNull AtomicBoolean isCancelled) {
        ini0<n0f> ini0VarM158405h;
        ini0<n0f> ini0VarM158403f;
        key.getClass();
        isCancelled.getClass();
        if (!i9j.m139099d()) {
            n0f n0fVarM147858a = this.stagingArea.m147858a(key);
            return (n0fVarM147858a == null || (ini0VarM158403f = m158403f(key, n0fVarM147858a)) == null) ? m158405h(key, isCancelled) : ini0VarM158403f;
        }
        i9j.m139097a("BufferedDiskCache#get");
        try {
            n0f n0fVarM147858a2 = this.stagingArea.m147858a(key);
            if (n0fVarM147858a2 == null || (ini0VarM158405h = m158403f(key, n0fVarM147858a2)) == null) {
                ini0VarM158405h = m158405h(key, isCancelled);
            }
            return ini0VarM158405h;
        } finally {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final ini0<n0f> m158405h(final by3 key, final AtomicBoolean isCancelled) {
        try {
            final Object objM134077d = h9j.m134077d("BufferedDiskCache_getAsync");
            return ini0.m141132b(new Callable() { // from class: l.ih3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return mh3.m158401d(objM134077d, isCancelled, this, key);
                }
            }, this.readExecutor);
        } catch (Exception e) {
            huf.m137196x(f136818h, e, "Failed to schedule disk-cache read for %s", key.getAnimationUriString());
            return ini0.m141135g(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m158406i(@NotNull final by3 key, @NotNull n0f encodedImage) {
        key.getClass();
        encodedImage.getClass();
        if (!i9j.m139099d()) {
            if (!n0f.m160957d0(encodedImage)) {
                wtq0.m207906a("Check failed.");
                return;
            }
            this.stagingArea.m147860d(key, encodedImage);
            final n0f n0fVarM160958m = n0f.m160958m(encodedImage);
            try {
                final Object objM134077d = h9j.m134077d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: l.kh3
                    @Override // java.lang.Runnable
                    public final void run() {
                        mh3.m158400c(objM134077d, this, key, n0fVarM160958m);
                    }
                });
                return;
            } catch (Exception e) {
                huf.m137196x(f136818h, e, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.m147862f(key, encodedImage);
                n0f.m160959n(n0fVarM160958m);
                return;
            }
        }
        i9j.m139097a("BufferedDiskCache#put");
        try {
            if (!n0f.m160957d0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.m147860d(key, encodedImage);
            final n0f n0fVarM160958m2 = n0f.m160958m(encodedImage);
            try {
                final Object objM134077d2 = h9j.m134077d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: l.kh3
                    @Override // java.lang.Runnable
                    public final void run() {
                        mh3.m158400c(objM134077d2, this, key, n0fVarM160958m2);
                    }
                });
            } catch (Exception e2) {
                huf.m137196x(f136818h, e2, "Failed to schedule disk-cache write for %s", key.getAnimationUriString());
                this.stagingArea.m147862f(key, encodedImage);
                n0f.m160959n(n0fVarM160958m2);
            }
            Unit unit = Unit.INSTANCE;
            i9j.m139098b();
        } catch (Throwable th) {
            i9j.m139098b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final PooledByteBuffer m158407j(by3 key) throws IOException {
        try {
            Class<?> cls = f136818h;
            huf.m137187o(cls, "Disk cache read for %s", key.getAnimationUriString());
            dy2 dy2VarMo8175c = this.fileCache.mo8175c(key);
            if (dy2VarMo8175c == null) {
                huf.m137187o(cls, "Disk cache miss for %s", key.getAnimationUriString());
                this.imageCacheStatsTracker.mo122418d(key);
                return null;
            }
            huf.m137187o(cls, "Found entry in disk cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.mo122428n(key);
            InputStream inputStreamMo118582a = dy2VarMo8175c.mo118582a();
            try {
                PooledByteBuffer pooledByteBufferMo99567e = this.pooledByteBufferFactory.mo99567e(inputStreamMo118582a, (int) dy2VarMo8175c.size());
                inputStreamMo118582a.close();
                huf.m137187o(cls, "Successful read from disk cache for %s", key.getAnimationUriString());
                return pooledByteBufferMo99567e;
            } catch (Throwable th) {
                inputStreamMo118582a.close();
                throw th;
            }
        } catch (IOException e) {
            huf.m137196x(f136818h, e, "Exception reading from cache for %s", key.getAnimationUriString());
            this.imageCacheStatsTracker.mo122426l(key);
            throw e;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ini0<Void> m158408k(@NotNull final by3 key) {
        key.getClass();
        this.stagingArea.m147861e(key);
        try {
            final Object objM134077d = h9j.m134077d("BufferedDiskCache_remove");
            return ini0.m141132b(new Callable() { // from class: l.jh3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return mh3.m158399b(objM134077d, this, key);
                }
            }, this.writeExecutor);
        } catch (Exception e) {
            huf.m137196x(f136818h, e, "Failed to schedule disk-cache remove for %s", key.getAnimationUriString());
            return ini0.m141135g(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m158409l(by3 key, final n0f encodedImage) {
        Class<?> cls = f136818h;
        huf.m137187o(cls, "About to write to disk-cache for key %s", key.getAnimationUriString());
        try {
            this.fileCache.mo8173a(key, new rkq0() { // from class: l.lh3
                @Override // p153l.rkq0
                /* JADX INFO: renamed from: a */
                public final void mo154201a(OutputStream outputStream) throws IOException {
                    mh3.m158398a(encodedImage, this, outputStream);
                }
            });
            this.imageCacheStatsTracker.mo122422h(key);
            huf.m137187o(cls, "Successful disk-cache write for key %s", key.getAnimationUriString());
        } catch (IOException e) {
            huf.m137196x(f136818h, e, "Failed to write to disk-cache for key %s", key.getAnimationUriString());
        }
    }
}
