package p153l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 u2\u00020\u0001:\u0001\\B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJc\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0,\"\u0004\b\u0000\u0010 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.Jw\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0,\"\u0004\b\u0000\u0010 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010*2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0002\b\u0003\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102JS\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u0010>JQ\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b?\u0010@J-\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010BJ+\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"0,2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bC\u0010BJ5\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"0,2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bD\u0010EJ+\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\bF\u0010BJ5\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bG\u0010EJ)\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010BJ=\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020K2\u0006\u00109\u001a\u000208¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020K2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020K2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020K2\u0006\u00109\u001a\u000208¢\u0006\u0004\bQ\u0010MJ\r\u0010R\u001a\u00020K¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020K¢\u0006\u0004\bZ\u0010SJ\r\u0010[\u001a\u00020K¢\u0006\u0004\b[\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010aR\u0014\u0010)\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010bR\u0014\u0010d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010cR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\bO\u0010e\u001a\u0004\bf\u0010gR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bA\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010kR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010aR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010nR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bD\u0010a\u001a\u0004\bp\u0010qR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b=\u0010r\u001a\u0004\bs\u0010t¨\u0006v"}, m88121d2 = {"Ll/rjm;", "", "Ll/xl90;", "producerSequenceFactory", "", "Ll/j2d0;", "requestListeners", "Ll/k2d0;", "requestListener2s", "Ll/a7h0;", "", "isPrefetchEnabledSupplier", "Ll/mpy;", "Ll/by3;", "Ll/db5;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/g4e;", "diskCachesStoreSupplier", "Ll/cy3;", "cacheKeyFactory", "Ll/oxi0;", "threadHandoffProducerQueue", "suppressBitmapPrefetchingSupplier", "lazyDataSource", "Ll/e94;", "callerContextVerifier", "Ll/tjm;", Constants.KEY_CONFIG, "<init>", "(Ll/xl90;Ljava/util/Set;Ljava/util/Set;Ll/a7h0;Ll/mpy;Ll/mpy;Ll/a7h0;Ll/cy3;Ll/oxi0;Ll/a7h0;Ll/a7h0;Ll/e94;Ll/tjm;)V", p7f.GPS_DIRECTION_TRUE, "Ll/wk90;", "Ll/fb5;", "producerSequence", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "lowestPermittedRequestLevelOnSubmit", "callerContext", "requestListener", "", "uiComponentId", "Ll/i6c;", BaseSei.f14626Z, "(Ll/wk90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Ll/j2d0;Ljava/lang/String;)Ll/i6c;", "", "extras", "A", "(Ll/wk90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Ll/j2d0;Ljava/lang/String;Ljava/util/Map;)Ll/i6c;", "Ljava/lang/Void;", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "B", "(Ll/wk90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Ll/j2d0;)Ll/i6c;", "Landroid/net/Uri;", "uri", "Ll/up80;", Constants.KEY_T, "(Landroid/net/Uri;)Ll/up80;", "m", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ll/j2d0;Ljava/lang/String;)Ll/i6c;", "h", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Ll/i6c;", "k", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Ll/j2d0;)Ll/i6c;", "u", ResourceDirection.f39656v, "w", BaseSei.f14624X, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Ll/j2d0;)Ll/i6c;", "", "g", "(Landroid/net/Uri;)V", "e", "f", "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", Constants.INAPP_DATA_TAG, "c", "()V", "q", "(Landroid/net/Uri;)Z", "r", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Z", "p", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ll/j2d0;)Ll/j2d0;", BLiveStormDanmakuGiftResourceType.f45294s, BaseSei.f14625Y, "a", "Ll/xl90;", "getProducerSequenceFactory", "()Ll/xl90;", "b", "Ll/a7h0;", "Ll/j2d0;", "Ll/k2d0;", "requestListener2", "Ll/mpy;", "n", "()Ll/mpy;", "Ll/cy3;", "o", "()Ll/cy3;", "Ll/oxi0;", "j", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "idCounter", "isLazyDataSource", "()Ll/a7h0;", "Ll/tjm;", "getConfig", "()Ll/tjm;", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rjm {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final CancellationException f163469n = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final CancellationException f163470o = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final CancellationException f163471p = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xl90 producerSequenceFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a7h0<g4e> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final j2d0 requestListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final k2d0 requestListener2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final mpy<by3, db5> bitmapMemoryCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final mpy<by3, PooledByteBuffer> encodedMemoryCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final cy3 cacheKeyFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final oxi0 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AtomicLong idCounter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final a7h0<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final tjm config;

    public rjm(@NotNull xl90 xl90Var, @NotNull Set<? extends j2d0> set, @NotNull Set<? extends k2d0> set2, @NotNull a7h0<Boolean> a7h0Var, @NotNull mpy<by3, db5> mpyVar, @NotNull mpy<by3, PooledByteBuffer> mpyVar2, @NotNull a7h0<g4e> a7h0Var2, @NotNull cy3 cy3Var, @NotNull oxi0 oxi0Var, @NotNull a7h0<Boolean> a7h0Var3, @NotNull a7h0<Boolean> a7h0Var4, @Nullable e94 e94Var, @NotNull tjm tjmVar) {
        xl90Var.getClass();
        set.getClass();
        set2.getClass();
        a7h0Var.getClass();
        mpyVar.getClass();
        mpyVar2.getClass();
        a7h0Var2.getClass();
        cy3Var.getClass();
        oxi0Var.getClass();
        a7h0Var3.getClass();
        a7h0Var4.getClass();
        tjmVar.getClass();
        this.producerSequenceFactory = xl90Var;
        this.isPrefetchEnabledSupplier = a7h0Var;
        this.diskCachesStoreSupplier = a7h0Var2;
        this.requestListener = new y2j((Set<j2d0>) set);
        this.requestListener2 = new x2j(set2);
        this.idCounter = new AtomicLong();
        this.bitmapMemoryCache = mpyVar;
        this.encodedMemoryCache = mpyVar2;
        this.cacheKeyFactory = cy3Var;
        this.threadHandoffProducerQueue = oxi0Var;
        this.suppressBitmapPrefetchingSupplier = a7h0Var3;
        this.isLazyDataSource = a7h0Var4;
        this.config = tjmVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m181710a(Uri uri, by3 by3Var) {
        uri.getClass();
        by3Var.getClass();
        return by3Var.mo106963c(uri);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181711b(by3 by3Var) {
        by3Var.getClass();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ i6c m181712j(rjm rjmVar, ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, j2d0 j2d0Var, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            requestLevel = null;
        }
        if ((i & 8) != 0) {
            j2d0Var = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return rjmVar.m181721i(imageRequest, obj, requestLevel, j2d0Var, str);
    }

    /* JADX INFO: renamed from: A */
    public final <T> i6c<fb5<T>> m181713A(wk90<fb5<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, j2d0 requestListener, String uiComponentId, Map<String, ?> extras) {
        i6c<fb5<T>> i6cVarM161759b;
        if (!i9j.m139099d()) {
            b1n b1nVar = new b1n(m181727p(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.m8628l(), lowestPermittedRequestLevelOnSubmit);
                max.getClass();
                eve0 eve0Var = new eve0(imageRequest, m181724m(), uiComponentId, b1nVar, callerContext, max, false, imageRequest.m8633q() || !i4k0.m138566o(imageRequest.m8639w()), imageRequest.m8632p(), this.config);
                eve0Var.mo97950d(extras);
                return eb5.m120151H(producerSequence, eve0Var, b1nVar);
            } catch (Exception e) {
                return n6c.m161759b(e);
            }
        }
        i9j.m139097a("ImagePipeline#submitFetchRequest");
        try {
            b1n b1nVar2 = new b1n(m181727p(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max2 = ImageRequest.RequestLevel.getMax(imageRequest.m8628l(), lowestPermittedRequestLevelOnSubmit);
                max2.getClass();
                eve0 eve0Var2 = new eve0(imageRequest, m181724m(), uiComponentId, b1nVar2, callerContext, max2, false, imageRequest.m8633q() || !i4k0.m138566o(imageRequest.m8639w()), imageRequest.m8632p(), this.config);
                eve0Var2.mo97950d(extras);
                i6cVarM161759b = eb5.m120151H(producerSequence, eve0Var2, b1nVar2);
            } catch (Exception e2) {
                i6cVarM161759b = n6c.m161759b(e2);
            }
            i9j.m139098b();
            return i6cVarM161759b;
        } catch (Throwable th) {
            i9j.m139098b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX INFO: renamed from: B */
    public final i6c<Void> m181714B(wk90<Void> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, Priority priority, j2d0 requestListener) {
        boolean z;
        b1n b1nVar = new b1n(m181727p(imageRequest, requestListener), this.requestListener2);
        Uri uriM8639w = imageRequest.m8639w();
        uriM8639w.getClass();
        Uri uriMo128896a = f4k0.INSTANCE.mo128896a(uriM8639w, callerContext);
        if (uriMo128896a == null) {
            i6c<Void> i6cVarM161759b = n6c.m161759b(f163471p);
            i6cVarM161759b.getClass();
            return i6cVarM161759b;
        }
        if (!Intrinsics.m88377d(uriM8639w, uriMo128896a)) {
            imageRequest = ImageRequestBuilder.m8643b(imageRequest).m8665S(uriMo128896a).m8668a();
        }
        ImageRequest imageRequest2 = imageRequest;
        try {
            ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest2.m8628l(), lowestPermittedRequestLevelOnSubmit);
            max.getClass();
            String strM181724m = m181724m();
            ujm ujmVarMo186192n = this.config.getExperiments();
            if (ujmVarMo186192n != null) {
                z = ujmVarMo186192n.getAllowProgressiveOnPrefetch() && imageRequest2.m8633q();
            }
            return yl90.INSTANCE.m216565a(producerSequence, new eve0(imageRequest2, strM181724m, b1nVar, callerContext, max, true, z, priority, this.config), b1nVar);
        } catch (Exception e) {
            return n6c.m161759b(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m181715c() {
        up80<by3> up80Var = new up80() { // from class: l.qjm
            @Override // p153l.up80
            public final boolean apply(Object obj) {
                return rjm.m181711b((by3) obj);
            }
        };
        this.bitmapMemoryCache.mo137758d(up80Var);
        this.encodedMemoryCache.mo137758d(up80Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m181716d(@NotNull Uri uri) {
        uri.getClass();
        m181719g(uri);
        m181717e(uri);
    }

    /* JADX INFO: renamed from: e */
    public final void m181717e(@Nullable Uri uri) {
        ImageRequest imageRequestM8615a = ImageRequest.m8615a(uri);
        if (imageRequestM8615a != null) {
            m181718f(imageRequestM8615a);
        } else {
            wtq0.m207906a("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m181718f(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        by3 by3VarMo113093b = this.cacheKeyFactory.mo113093b(imageRequest, null);
        g4e g4eVar = this.diskCachesStoreSupplier.get();
        g4eVar.getClass();
        g4e g4eVar2 = g4eVar;
        mh3 mh3VarMo128867c = g4eVar2.mo128867c();
        by3VarMo113093b.getClass();
        mh3VarMo128867c.m158408k(by3VarMo113093b);
        g4eVar2.mo128866b().m158408k(by3VarMo113093b);
        Iterator<Map.Entry<String, mh3>> it = g4eVar2.mo128868d().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m158408k(by3VarMo113093b);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m181719g(@NotNull Uri uri) {
        uri.getClass();
        up80<by3> up80VarM181731t = m181731t(uri);
        this.bitmapMemoryCache.mo137758d(up80VarM181731t);
        this.encodedMemoryCache.mo137758d(up80VarM181731t);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final i6c<fb5<db5>> m181720h(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m181712j(this, imageRequest, callerContext, null, null, null, 24, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final i6c<fb5<db5>> m181721i(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable j2d0 requestListener, @Nullable String uiComponentId) {
        if (imageRequest == null) {
            i6c<fb5<db5>> i6cVarM161759b = n6c.m161759b(new NullPointerException());
            i6cVarM161759b.getClass();
            return i6cVarM161759b;
        }
        try {
            wk90<fb5<db5>> wk90VarM211567B = this.producerSequenceFactory.m211567B(imageRequest);
            if (lowestPermittedRequestLevelOnSubmit == null) {
                lowestPermittedRequestLevelOnSubmit = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return m181737z(wk90VarM211567B, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId);
        } catch (Exception e) {
            return n6c.m161759b(e);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final i6c<fb5<PooledByteBuffer>> m181722k(@NotNull ImageRequest imageRequest, @Nullable Object callerContext) {
        imageRequest.getClass();
        return m181723l(imageRequest, callerContext, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final i6c<fb5<PooledByteBuffer>> m181723l(@NotNull ImageRequest imageRequest, @Nullable Object callerContext, @Nullable j2d0 requestListener) {
        imageRequest.getClass();
        if (imageRequest.m8639w() == null) {
            wtq0.m207906a("Required value was null.");
            return null;
        }
        try {
            wk90<fb5<PooledByteBuffer>> wk90VarM211570E = this.producerSequenceFactory.m211570E(imageRequest);
            if (imageRequest.m8635s() != null) {
                imageRequest = ImageRequestBuilder.m8643b(imageRequest).m8661O(null).m8668a();
            }
            return m181713A(wk90VarM211570E, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, requestListener, null, null);
        } catch (Exception e) {
            return n6c.m161759b(e);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m181724m() {
        return String.valueOf(this.idCounter.getAndIncrement());
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final mpy<by3, db5> m181725n() {
        return this.bitmapMemoryCache;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final cy3 getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final j2d0 m181727p(@Nullable ImageRequest imageRequest, @Nullable j2d0 requestListener) {
        if (imageRequest == null) {
            wtq0.m207906a("Required value was null.");
            return null;
        }
        if (requestListener == null) {
            j2d0 j2d0VarM8634r = imageRequest.m8634r();
            j2d0 j2d0Var = this.requestListener;
            return j2d0VarM8634r == null ? j2d0Var : new y2j(j2d0Var, imageRequest.m8634r());
        }
        j2d0 j2d0VarM8634r2 = imageRequest.m8634r();
        j2d0 j2d0Var2 = this.requestListener;
        return j2d0VarM8634r2 == null ? new y2j(j2d0Var2, requestListener) : new y2j(j2d0Var2, requestListener, imageRequest.m8634r());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m181728q(@Nullable Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.bitmapMemoryCache.mo137757c(m181731t(uri));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m181729r(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        by3 by3VarMo113094c = this.cacheKeyFactory.mo113094c(imageRequest, null);
        mpy<by3, db5> mpyVar = this.bitmapMemoryCache;
        by3VarMo113094c.getClass();
        fb5<db5> fb5Var = mpyVar.get(by3VarMo113094c);
        try {
            return fb5.m124864Q(fb5Var);
        } finally {
            fb5.m124874v(fb5Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m181730s() {
        this.threadHandoffProducerQueue.mo169712b();
    }

    /* JADX INFO: renamed from: t */
    public final up80<by3> m181731t(final Uri uri) {
        return new up80() { // from class: l.pjm
            @Override // p153l.up80
            public final boolean apply(Object obj) {
                return rjm.m181710a(uri, (by3) obj);
            }
        };
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: u */
    public final i6c<Void> m181732u(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m181733v(imageRequest, callerContext, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: v */
    public final i6c<Void> m181733v(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable j2d0 requestListener) {
        i6c<Void> i6cVarM161759b;
        boolean zBooleanValue = false;
        if (!i9j.m139099d()) {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                i6c<Void> i6cVarM161759b2 = n6c.m161759b(f163469n);
                i6cVarM161759b2.getClass();
                return i6cVarM161759b2;
            }
            try {
                if (this.config.getExperiments().getPrefetchShortcutEnabled() && m181729r(imageRequest)) {
                    i6c<Void> i6cVarM161760c = n6c.m161760c();
                    i6cVarM161760c.getClass();
                    return i6cVarM161760c;
                }
                if (imageRequest == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolM8618A = imageRequest.m8618A();
                if (boolM8618A == null) {
                    Boolean bool = this.suppressBitmapPrefetchingSupplier.get();
                    bool.getClass();
                    zBooleanValue = bool.booleanValue();
                } else if (!boolM8618A.booleanValue()) {
                    zBooleanValue = true;
                }
                xl90 xl90Var = this.producerSequenceFactory;
                return m181714B(zBooleanValue ? xl90Var.m211569D(imageRequest) : xl90Var.m211601z(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, Priority.MEDIUM, requestListener);
            } catch (Exception e) {
                return n6c.m161759b(e);
            }
        }
        i9j.m139097a("ImagePipeline#prefetchToBitmapCache");
        try {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                i6c<Void> i6cVarM161759b3 = n6c.m161759b(f163469n);
                i6cVarM161759b3.getClass();
                i9j.m139098b();
                return i6cVarM161759b3;
            }
            try {
                if (this.config.getExperiments().getPrefetchShortcutEnabled() && m181729r(imageRequest)) {
                    i6c<Void> i6cVarM161760c2 = n6c.m161760c();
                    i6cVarM161760c2.getClass();
                    i9j.m139098b();
                    return i6cVarM161760c2;
                }
                if (imageRequest == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolM8618A2 = imageRequest.m8618A();
                if (boolM8618A2 == null) {
                    Boolean bool2 = this.suppressBitmapPrefetchingSupplier.get();
                    bool2.getClass();
                    zBooleanValue = bool2.booleanValue();
                } else if (!boolM8618A2.booleanValue()) {
                    zBooleanValue = true;
                }
                xl90 xl90Var2 = this.producerSequenceFactory;
                i6cVarM161759b = m181714B(zBooleanValue ? xl90Var2.m211569D(imageRequest) : xl90Var2.m211601z(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, Priority.MEDIUM, requestListener);
                i9j.m139098b();
                return i6cVarM161759b;
            } catch (Exception e2) {
                i6cVarM161759b = n6c.m161759b(e2);
            }
        } catch (Throwable th) {
            i9j.m139098b();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final i6c<Void> m181734w(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m181735x(imageRequest, callerContext, Priority.MEDIUM, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: x */
    public final i6c<Void> m181735x(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @NotNull Priority priority, @Nullable j2d0 requestListener) {
        priority.getClass();
        if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
            i6c<Void> i6cVarM161759b = n6c.m161759b(f163469n);
            i6cVarM161759b.getClass();
            return i6cVarM161759b;
        }
        if (imageRequest == null) {
            i6c<Void> i6cVarM161759b2 = n6c.m161759b(new NullPointerException("imageRequest is null"));
            i6cVarM161759b2.getClass();
            return i6cVarM161759b2;
        }
        try {
            return m181714B(this.producerSequenceFactory.m211569D(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, priority, requestListener);
        } catch (Exception e) {
            return n6c.m161759b(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m181736y() {
        this.threadHandoffProducerQueue.mo169714d();
    }

    /* JADX INFO: renamed from: z */
    public final <T> i6c<fb5<T>> m181737z(wk90<fb5<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, j2d0 requestListener, String uiComponentId) {
        return m181713A(producerSequence, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId, null);
    }
}
