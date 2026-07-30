package com.clevertap.android.sdk.inapp.images.preload;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.c4e;
import p149l.igi;
import p149l.jh3;
import p149l.jpb;
import p149l.l9r;
import p149l.nul;
import p149l.ppb;
import p149l.pwb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u009c\u0002\u0010$\u001a\u00020\u001a2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112-\u0010\u001b\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010\u001c\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010\u001e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010!\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u00162/\u0010#\u001a+\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0016H\u0002¢\u0006\u0004\b$\u0010%Jå\u0001\u0010&\u001a\u00020\u001a2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112-\u0010\u001b\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010\u001c\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010\u001e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010!\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u0016H\u0016¢\u0006\u0004\b&\u0010'R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?¨\u0006A"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine;", "Ll/igi;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Ll/nul;", "logger", "Ll/c4e;", "dispatchers", "Lcom/clevertap/android/sdk/inapp/images/preload/a;", Constants.KEY_CONFIG, "", "timeoutForPreload", "", "deepLogging", "<init>", "(Lkotlin/jvm/functions/Function0;Ll/nul;Ll/c4e;Lcom/clevertap/android/sdk/inapp/images/preload/a;JZ)V", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "meta", "", "successBlock", "failureBlock", "urlMeta", "startedBlock", "", "urlDownloadStatus", "preloadFinished", "", "assetBlock", "h", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "b", "Ll/nul;", "f", "()Ll/nul;", "c", "Lcom/clevertap/android/sdk/inapp/images/preload/a;", Constants.INAPP_DATA_TAG, "()Lcom/clevertap/android/sdk/inapp/images/preload/a;", "J", "g", "()J", "Z", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlinx/coroutines/o;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "jobs", "Ll/jpb;", "Ll/jpb;", "handler", "Ll/ppb;", "Ll/ppb;", "scope", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FilePreloaderCoroutine implements igi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final C1260a config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timeoutForPreload;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean deepLogging;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentLinkedQueue<InterfaceC15486o> jobs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final jpb handler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ppb scope;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1258a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5164a;

        static {
            int[] iArr = new int[CtCacheType.values().length];
            try {
                iArr[CtCacheType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtCacheType.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtCacheType.FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5164a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$b */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"com/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine$b", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Ll/jpb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C1259b extends AbstractCoroutineContextElement implements jpb {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FilePreloaderCoroutine f5165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1259b(jpb.Companion companion, FilePreloaderCoroutine filePreloaderCoroutine) {
            super(companion);
            this.f5165a = filePreloaderCoroutine;
        }

        @Override // p149l.jpb
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            nul logger = this.f5165a.getLogger();
            if (logger != null) {
                logger.verbose("Cancelled image pre fetch \n " + exception.getStackTrace());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FilePreloaderCoroutine(Function0 function0, nul nulVar, c4e c4eVar, C1260a c1260a, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jM93535u;
        nul nulVar2 = (i & 2) != 0 ? null : nulVar;
        c4e pwbVar = (i & 4) != 0 ? new pwb() : c4eVar;
        C1260a c1260aM6515a = (i & 8) != 0 ? C1260a.INSTANCE.m6515a() : c1260a;
        if ((i & 16) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            jM93535u = Duration.m93535u(DurationKt.m93561o(5, DurationUnit.MINUTES));
        } else {
            jM93535u = j;
        }
        this(function0, nulVar2, pwbVar, c1260aM6515a, jM93535u, (i & 32) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: b */
    public static Object m6506b(FilePreloaderCoroutine filePreloaderCoroutine, Pair pair) {
        filePreloaderCoroutine.getClass();
        pair.getClass();
        String str = (String) pair.getFirst();
        int i = C1258a.f5164a[((CtCacheType) pair.getSecond()).ordinal()];
        if (i == 1) {
            return filePreloaderCoroutine.m6511e().invoke().m6500p(str);
        }
        if (i == 2) {
            return filePreloaderCoroutine.m6511e().invoke().m6499o(str);
        }
        if (i == 3) {
            return filePreloaderCoroutine.m6511e().invoke().m6498n(str);
        }
        l9r.m149037a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    private final void m6508h(List<? extends Pair<String, ? extends CtCacheType>> urlMetas, Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, Function1<? super Map<String, Boolean>, Unit> preloadFinished, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> assetBlock) {
        this.jobs.add(jh3.m141367d(this.scope, this.handler, null, new FilePreloaderCoroutine$preloadAssets$job$1(urlMetas, this, preloadFinished, startedBlock, assetBlock, successBlock, failureBlock, null), 2, null));
    }

    @Override // p149l.igi
    /* JADX INFO: renamed from: a */
    public void mo6509a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMetas, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, @NotNull Function1<? super Map<String, Boolean>, Unit> preloadFinished) {
        urlMetas.getClass();
        successBlock.getClass();
        failureBlock.getClass();
        startedBlock.getClass();
        preloadFinished.getClass();
        m6508h(urlMetas, successBlock, failureBlock, startedBlock, preloadFinished, new Function1() { // from class: l.hgi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilePreloaderCoroutine.m6506b(this.f107602a, (Pair) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public C1260a getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Function0<FileResourceProvider> m6511e() {
        return this.fileResourceProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public nul getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getTimeoutForPreload() {
        return this.timeoutForPreload;
    }

    @JvmOverloads
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> function0, @Nullable nul nulVar, @NotNull c4e c4eVar, @NotNull C1260a c1260a, long j, boolean z) {
        function0.getClass();
        c4eVar.getClass();
        c1260a.getClass();
        this.fileResourceProvider = function0;
        this.logger = nulVar;
        this.config = c1260a;
        this.timeoutForPreload = j;
        this.deepLogging = z;
        this.jobs = new ConcurrentLinkedQueue<>();
        this.handler = new C1259b(jpb.INSTANCE, this);
        this.scope = C15424f.m94055a(c4eVar.mo105214a().limitedParallelism(getConfig().getParallelDownloads()));
    }
}
