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
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.axl;
import p153l.drb;
import p153l.dyb;
import p153l.fji;
import p153l.nbr;
import p153l.q5e;
import p153l.xh3;
import p153l.xqb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u009c\u0002\u0010$\u001a\u00020\u001a2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112-\u0010\u001b\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010\u001c\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010\u001e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162/\b\u0002\u0010!\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u00162/\u0010#\u001a+\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0016H\u0002¢\u0006\u0004\b$\u0010%Jå\u0001\u0010&\u001a\u00020\u001a2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112-\u0010\u001b\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010\u001c\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010\u001e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001a0\u00162-\u0010!\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u0016H\u0016¢\u0006\u0004\b&\u0010'R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?¨\u0006A"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine;", "Ll/fji;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Ll/axl;", "logger", "Ll/q5e;", "dispatchers", "Lcom/clevertap/android/sdk/inapp/images/preload/a;", Constants.KEY_CONFIG, "", "timeoutForPreload", "", "deepLogging", "<init>", "(Lkotlin/jvm/functions/Function0;Ll/axl;Ll/q5e;Lcom/clevertap/android/sdk/inapp/images/preload/a;JZ)V", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "meta", "", "successBlock", "failureBlock", "urlMeta", "startedBlock", "", "urlDownloadStatus", "preloadFinished", "", "assetBlock", "h", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "b", "Ll/axl;", "f", "()Ll/axl;", "c", "Lcom/clevertap/android/sdk/inapp/images/preload/a;", Constants.INAPP_DATA_TAG, "()Lcom/clevertap/android/sdk/inapp/images/preload/a;", "J", "g", "()J", "Z", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlinx/coroutines/o;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "jobs", "Ll/xqb;", "Ll/xqb;", "handler", "Ll/drb;", "Ll/drb;", "scope", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FilePreloaderCoroutine implements fji {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final C1283a config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long timeoutForPreload;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean deepLogging;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentLinkedQueue<InterfaceC15593o> jobs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final xqb handler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final drb scope;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1281a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5201a;

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
            f5201a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$b */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"com/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine$b", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Ll/xqb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C1282b extends AbstractCoroutineContextElement implements xqb {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FilePreloaderCoroutine f5202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1282b(xqb.Companion companion, FilePreloaderCoroutine filePreloaderCoroutine) {
            super(companion);
            this.f5202a = filePreloaderCoroutine;
        }

        @Override // p153l.xqb
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            axl logger = this.f5202a.getLogger();
            if (logger != null) {
                logger.verbose("Cancelled image pre fetch \n " + exception.getStackTrace());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FilePreloaderCoroutine(Function0 function0, axl axlVar, q5e q5eVar, C1283a c1283a, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jM94426u;
        axl axlVar2 = (i & 2) != 0 ? null : axlVar;
        q5e dybVar = (i & 4) != 0 ? new dyb() : q5eVar;
        C1283a c1283aM6569a = (i & 8) != 0 ? C1283a.INSTANCE.m6569a() : c1283a;
        if ((i & 16) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            jM94426u = Duration.m94426u(DurationKt.m94452o(5, DurationUnit.MINUTES));
        } else {
            jM94426u = j;
        }
        this(function0, axlVar2, dybVar, c1283aM6569a, jM94426u, (i & 32) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: b */
    public static Object m6560b(FilePreloaderCoroutine filePreloaderCoroutine, Pair pair) {
        filePreloaderCoroutine.getClass();
        pair.getClass();
        String str = (String) pair.getFirst();
        int i = C1281a.f5201a[((CtCacheType) pair.getSecond()).ordinal()];
        if (i == 1) {
            return filePreloaderCoroutine.m6565e().invoke().m6554p(str);
        }
        if (i == 2) {
            return filePreloaderCoroutine.m6565e().invoke().m6553o(str);
        }
        if (i == 3) {
            return filePreloaderCoroutine.m6565e().invoke().m6552n(str);
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    private final void m6562h(List<? extends Pair<String, ? extends CtCacheType>> urlMetas, Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, Function1<? super Map<String, Boolean>, Unit> preloadFinished, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> assetBlock) {
        this.jobs.add(xh3.m210980d(this.scope, this.handler, null, new FilePreloaderCoroutine$preloadAssets$job$1(urlMetas, this, preloadFinished, startedBlock, assetBlock, successBlock, failureBlock, null), 2, null));
    }

    @Override // p153l.fji
    /* JADX INFO: renamed from: a */
    public void mo6563a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMetas, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, @NotNull Function1<? super Map<String, Boolean>, Unit> preloadFinished) {
        urlMetas.getClass();
        successBlock.getClass();
        failureBlock.getClass();
        startedBlock.getClass();
        preloadFinished.getClass();
        m6562h(urlMetas, successBlock, failureBlock, startedBlock, preloadFinished, new Function1() { // from class: l.eji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilePreloaderCoroutine.m6560b(this.f94304a, (Pair) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public C1283a getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Function0<FileResourceProvider> m6565e() {
        return this.fileResourceProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public axl getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getTimeoutForPreload() {
        return this.timeoutForPreload;
    }

    @JvmOverloads
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> function0, @Nullable axl axlVar, @NotNull q5e q5eVar, @NotNull C1283a c1283a, long j, boolean z) {
        function0.getClass();
        q5eVar.getClass();
        c1283a.getClass();
        this.fileResourceProvider = function0;
        this.logger = axlVar;
        this.config = c1283a;
        this.timeoutForPreload = j;
        this.deepLogging = z;
        this.jobs = new ConcurrentLinkedQueue<>();
        this.handler = new C1282b(xqb.INSTANCE, this);
        this.scope = C15531f.m94947a(q5eVar.mo118662a().limitedParallelism(getConfig().getParallelDownloads()));
    }
}
