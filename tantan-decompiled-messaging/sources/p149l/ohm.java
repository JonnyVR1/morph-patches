package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 u2\u00020\u0001:\u0001\\B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJc\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0,\"\u0004\b\u0000\u0010 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.Jw\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0,\"\u0004\b\u0000\u0010 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010*2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0002\b\u0003\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102JS\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u0010>JQ\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b?\u0010@J-\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010BJ+\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"0,2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bC\u0010BJ5\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"0,2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bD\u0010EJ+\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\bF\u0010BJ5\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bG\u0010EJ)\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010BJ=\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020K2\u0006\u00109\u001a\u000208¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020K2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020K2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020K2\u0006\u00109\u001a\u000208¢\u0006\u0004\bQ\u0010MJ\r\u0010R\u001a\u00020K¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020K¢\u0006\u0004\bZ\u0010SJ\r\u0010[\u001a\u00020K¢\u0006\u0004\b[\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010aR\u0014\u0010)\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010bR\u0014\u0010d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010cR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\bO\u0010e\u001a\u0004\bf\u0010gR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bA\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010kR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010aR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010nR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bD\u0010a\u001a\u0004\bp\u0010qR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b=\u0010r\u001a\u0004\bs\u0010t¨\u0006v"}, m87232d2 = {"Ll/ohm;", "", "Ll/td90;", "producerSequenceFactory", "", "Ll/guc0;", "requestListeners", "Ll/huc0;", "requestListener2s", "Ll/syg0;", "", "isPrefetchEnabledSupplier", "Ll/pgy;", "Ll/cx3;", "Ll/da5;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ll/s2e;", "diskCachesStoreSupplier", "Ll/dx3;", "cacheKeyFactory", "Ll/moi0;", "threadHandoffProducerQueue", "suppressBitmapPrefetchingSupplier", "lazyDataSource", "Ll/f84;", "callerContextVerifier", "Ll/qhm;", Constants.KEY_CONFIG, "<init>", "(Ll/td90;Ljava/util/Set;Ljava/util/Set;Ll/syg0;Ll/pgy;Ll/pgy;Ll/syg0;Ll/dx3;Ll/moi0;Ll/syg0;Ll/syg0;Ll/f84;Ll/qhm;)V", j6f.GPS_DIRECTION_TRUE, "Ll/sc90;", "Ll/fa5;", "producerSequence", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "lowestPermittedRequestLevelOnSubmit", "callerContext", "requestListener", "", "uiComponentId", "Ll/c5c;", BaseSei.f13932Z, "(Ll/sc90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Ll/guc0;Ljava/lang/String;)Ll/c5c;", "", "extras", "A", "(Ll/sc90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Ll/guc0;Ljava/lang/String;Ljava/util/Map;)Ll/c5c;", "Ljava/lang/Void;", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "B", "(Ll/sc90;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Ll/guc0;)Ll/c5c;", "Landroid/net/Uri;", "uri", "Ll/ph80;", Constants.KEY_T, "(Landroid/net/Uri;)Ll/ph80;", "m", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ll/guc0;Ljava/lang/String;)Ll/c5c;", "h", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Ll/c5c;", "k", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Ll/guc0;)Ll/c5c;", "u", ResourceDirection.f38808v, "w", BaseSei.f13930X, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Ll/guc0;)Ll/c5c;", "", "g", "(Landroid/net/Uri;)V", "e", "f", "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", Constants.INAPP_DATA_TAG, "c", "()V", "q", "(Landroid/net/Uri;)Z", "r", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Z", "p", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ll/guc0;)Ll/guc0;", BLiveStormDanmakuGiftResourceType.f44446s, BaseSei.f13931Y, "a", "Ll/td90;", "getProducerSequenceFactory", "()Ll/td90;", "b", "Ll/syg0;", "Ll/guc0;", "Ll/huc0;", "requestListener2", "Ll/pgy;", "n", "()Ll/pgy;", "Ll/dx3;", "o", "()Ll/dx3;", "Ll/moi0;", "j", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "idCounter", "isLazyDataSource", "()Ll/syg0;", "Ll/qhm;", "getConfig", "()Ll/qhm;", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ohm {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final CancellationException f144010n = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final CancellationException f144011o = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final CancellationException f144012p = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final td90 producerSequenceFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final syg0<s2e> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final guc0 requestListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final huc0 requestListener2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final pgy<cx3, da5> bitmapMemoryCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final pgy<cx3, PooledByteBuffer> encodedMemoryCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final dx3 cacheKeyFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final moi0 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AtomicLong idCounter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final syg0<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final qhm config;

    public ohm(@NotNull td90 td90Var, @NotNull Set<? extends guc0> set, @NotNull Set<? extends huc0> set2, @NotNull syg0<Boolean> syg0Var, @NotNull pgy<cx3, da5> pgyVar, @NotNull pgy<cx3, PooledByteBuffer> pgyVar2, @NotNull syg0<s2e> syg0Var2, @NotNull dx3 dx3Var, @NotNull moi0 moi0Var, @NotNull syg0<Boolean> syg0Var3, @NotNull syg0<Boolean> syg0Var4, @Nullable f84 f84Var, @NotNull qhm qhmVar) {
        td90Var.getClass();
        set.getClass();
        set2.getClass();
        syg0Var.getClass();
        pgyVar.getClass();
        pgyVar2.getClass();
        syg0Var2.getClass();
        dx3Var.getClass();
        moi0Var.getClass();
        syg0Var3.getClass();
        syg0Var4.getClass();
        qhmVar.getClass();
        this.producerSequenceFactory = td90Var;
        this.isPrefetchEnabledSupplier = syg0Var;
        this.diskCachesStoreSupplier = syg0Var2;
        this.requestListener = new d0j((Set<guc0>) set);
        this.requestListener2 = new c0j(set2);
        this.idCounter = new AtomicLong();
        this.bitmapMemoryCache = pgyVar;
        this.encodedMemoryCache = pgyVar2;
        this.cacheKeyFactory = dx3Var;
        this.threadHandoffProducerQueue = moi0Var;
        this.suppressBitmapPrefetchingSupplier = syg0Var3;
        this.isLazyDataSource = syg0Var4;
        this.config = qhmVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m164399a(Uri uri, cx3 cx3Var) {
        uri.getClass();
        cx3Var.getClass();
        return cx3Var.mo103431c(uri);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m164400b(cx3 cx3Var) {
        cx3Var.getClass();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ c5c m164401j(ohm ohmVar, ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, guc0 guc0Var, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            requestLevel = null;
        }
        if ((i & 8) != 0) {
            guc0Var = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return ohmVar.m164410i(imageRequest, obj, requestLevel, guc0Var, str);
    }

    /* JADX INFO: renamed from: A */
    public final <T> c5c<fa5<T>> m164402A(sc90<fa5<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, guc0 requestListener, String uiComponentId, Map<String, ?> extras) {
        c5c<fa5<T>> c5cVarM129392b;
        if (!o6j.m162852d()) {
            bzm bzmVar = new bzm(m164416p(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.m8574l(), lowestPermittedRequestLevelOnSubmit);
                max.getClass();
                xme0 xme0Var = new xme0(imageRequest, m164413m(), uiComponentId, bzmVar, callerContext, max, false, imageRequest.m8579q() || !fvj0.m123320o(imageRequest.m8585w()), imageRequest.m8578p(), this.config);
                xme0Var.mo155862d(extras);
                return ea5.m115409H(producerSequence, xme0Var, bzmVar);
            } catch (Exception e) {
                return h5c.m129392b(e);
            }
        }
        o6j.m162850a("ImagePipeline#submitFetchRequest");
        try {
            bzm bzmVar2 = new bzm(m164416p(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max2 = ImageRequest.RequestLevel.getMax(imageRequest.m8574l(), lowestPermittedRequestLevelOnSubmit);
                max2.getClass();
                xme0 xme0Var2 = new xme0(imageRequest, m164413m(), uiComponentId, bzmVar2, callerContext, max2, false, imageRequest.m8579q() || !fvj0.m123320o(imageRequest.m8585w()), imageRequest.m8578p(), this.config);
                xme0Var2.mo155862d(extras);
                c5cVarM129392b = ea5.m115409H(producerSequence, xme0Var2, bzmVar2);
            } catch (Exception e2) {
                c5cVarM129392b = h5c.m129392b(e2);
            }
            o6j.m162851b();
            return c5cVarM129392b;
        } catch (Throwable th) {
            o6j.m162851b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX INFO: renamed from: B */
    public final c5c<Void> m164403B(sc90<Void> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, Priority priority, guc0 requestListener) {
        boolean z;
        bzm bzmVar = new bzm(m164416p(imageRequest, requestListener), this.requestListener2);
        Uri uriM8585w = imageRequest.m8585w();
        uriM8585w.getClass();
        Uri uriMo113781a = cvj0.INSTANCE.mo113781a(uriM8585w, callerContext);
        if (uriMo113781a == null) {
            c5c<Void> c5cVarM129392b = h5c.m129392b(f144012p);
            c5cVarM129392b.getClass();
            return c5cVarM129392b;
        }
        if (!Intrinsics.m87488d(uriM8585w, uriMo113781a)) {
            imageRequest = ImageRequestBuilder.m8589b(imageRequest).m8611S(uriMo113781a).m8614a();
        }
        ImageRequest imageRequest2 = imageRequest;
        try {
            ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest2.m8574l(), lowestPermittedRequestLevelOnSubmit);
            max.getClass();
            String strM164413m = m164413m();
            rhm rhmVarMo169001n = this.config.getExperiments();
            if (rhmVarMo169001n != null) {
                z = rhmVarMo169001n.getAllowProgressiveOnPrefetch() && imageRequest2.m8579q();
            }
            return ud90.INSTANCE.m193127a(producerSequence, new xme0(imageRequest2, strM164413m, bzmVar, callerContext, max, true, z, priority, this.config), bzmVar);
        } catch (Exception e) {
            return h5c.m129392b(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m164404c() {
        ph80<cx3> ph80Var = new ph80() { // from class: l.nhm
            @Override // p149l.ph80
            public final boolean apply(Object obj) {
                return ohm.m164400b((cx3) obj);
            }
        };
        this.bitmapMemoryCache.mo101594d(ph80Var);
        this.encodedMemoryCache.mo101594d(ph80Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m164405d(@NotNull Uri uri) {
        uri.getClass();
        m164408g(uri);
        m164406e(uri);
    }

    /* JADX INFO: renamed from: e */
    public final void m164406e(@Nullable Uri uri) {
        ImageRequest imageRequestM8561a = ImageRequest.m8561a(uri);
        if (imageRequestM8561a != null) {
            m164407f(imageRequestM8561a);
        } else {
            qkq0.m175383a("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m164407f(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        cx3 cx3VarMo113968b = this.cacheKeyFactory.mo113968b(imageRequest, null);
        s2e s2eVar = this.diskCachesStoreSupplier.get();
        s2eVar.getClass();
        s2e s2eVar2 = s2eVar;
        yg3 yg3VarMo94681c = s2eVar2.mo94681c();
        cx3VarMo113968b.getClass();
        yg3VarMo94681c.m214610k(cx3VarMo113968b);
        s2eVar2.mo94680b().m214610k(cx3VarMo113968b);
        Iterator<Map.Entry<String, yg3>> it = s2eVar2.mo94682d().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m214610k(cx3VarMo113968b);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m164408g(@NotNull Uri uri) {
        uri.getClass();
        ph80<cx3> ph80VarM164420t = m164420t(uri);
        this.bitmapMemoryCache.mo101594d(ph80VarM164420t);
        this.encodedMemoryCache.mo101594d(ph80VarM164420t);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final c5c<fa5<da5>> m164409h(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m164401j(this, imageRequest, callerContext, null, null, null, 24, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final c5c<fa5<da5>> m164410i(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable guc0 requestListener, @Nullable String uiComponentId) {
        if (imageRequest == null) {
            c5c<fa5<da5>> c5cVarM129392b = h5c.m129392b(new NullPointerException());
            c5cVarM129392b.getClass();
            return c5cVarM129392b;
        }
        try {
            sc90<fa5<da5>> sc90VarM188086B = this.producerSequenceFactory.m188086B(imageRequest);
            if (lowestPermittedRequestLevelOnSubmit == null) {
                lowestPermittedRequestLevelOnSubmit = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return m164426z(sc90VarM188086B, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId);
        } catch (Exception e) {
            return h5c.m129392b(e);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final c5c<fa5<PooledByteBuffer>> m164411k(@NotNull ImageRequest imageRequest, @Nullable Object callerContext) {
        imageRequest.getClass();
        return m164412l(imageRequest, callerContext, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final c5c<fa5<PooledByteBuffer>> m164412l(@NotNull ImageRequest imageRequest, @Nullable Object callerContext, @Nullable guc0 requestListener) {
        imageRequest.getClass();
        if (imageRequest.m8585w() == null) {
            qkq0.m175383a("Required value was null.");
            return null;
        }
        try {
            sc90<fa5<PooledByteBuffer>> sc90VarM188089E = this.producerSequenceFactory.m188089E(imageRequest);
            if (imageRequest.m8581s() != null) {
                imageRequest = ImageRequestBuilder.m8589b(imageRequest).m8607O(null).m8614a();
            }
            return m164402A(sc90VarM188089E, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, requestListener, null, null);
        } catch (Exception e) {
            return h5c.m129392b(e);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m164413m() {
        return String.valueOf(this.idCounter.getAndIncrement());
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final pgy<cx3, da5> m164414n() {
        return this.bitmapMemoryCache;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final dx3 getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final guc0 m164416p(@Nullable ImageRequest imageRequest, @Nullable guc0 requestListener) {
        if (imageRequest == null) {
            qkq0.m175383a("Required value was null.");
            return null;
        }
        if (requestListener == null) {
            guc0 guc0VarM8580r = imageRequest.m8580r();
            guc0 guc0Var = this.requestListener;
            return guc0VarM8580r == null ? guc0Var : new d0j(guc0Var, imageRequest.m8580r());
        }
        guc0 guc0VarM8580r2 = imageRequest.m8580r();
        guc0 guc0Var2 = this.requestListener;
        return guc0VarM8580r2 == null ? new d0j(guc0Var2, requestListener) : new d0j(guc0Var2, requestListener, imageRequest.m8580r());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m164417q(@Nullable Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.bitmapMemoryCache.mo101593c(m164420t(uri));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m164418r(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        cx3 cx3VarMo113969c = this.cacheKeyFactory.mo113969c(imageRequest, null);
        pgy<cx3, da5> pgyVar = this.bitmapMemoryCache;
        cx3VarMo113969c.getClass();
        fa5<da5> fa5Var = pgyVar.get(cx3VarMo113969c);
        try {
            return fa5.m120144Q(fa5Var);
        } finally {
            fa5.m120154v(fa5Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m164419s() {
        this.threadHandoffProducerQueue.mo155509b();
    }

    /* JADX INFO: renamed from: t */
    public final ph80<cx3> m164420t(final Uri uri) {
        return new ph80() { // from class: l.mhm
            @Override // p149l.ph80
            public final boolean apply(Object obj) {
                return ohm.m164399a(uri, (cx3) obj);
            }
        };
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: u */
    public final c5c<Void> m164421u(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m164422v(imageRequest, callerContext, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: v */
    public final c5c<Void> m164422v(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable guc0 requestListener) {
        c5c<Void> c5cVarM129392b;
        boolean zBooleanValue = false;
        if (!o6j.m162852d()) {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                c5c<Void> c5cVarM129392b2 = h5c.m129392b(f144010n);
                c5cVarM129392b2.getClass();
                return c5cVarM129392b2;
            }
            try {
                if (this.config.getExperiments().getPrefetchShortcutEnabled() && m164418r(imageRequest)) {
                    c5c<Void> c5cVarM129393c = h5c.m129393c();
                    c5cVarM129393c.getClass();
                    return c5cVarM129393c;
                }
                if (imageRequest == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolM8564A = imageRequest.m8564A();
                if (boolM8564A == null) {
                    Boolean bool = this.suppressBitmapPrefetchingSupplier.get();
                    bool.getClass();
                    zBooleanValue = bool.booleanValue();
                } else if (!boolM8564A.booleanValue()) {
                    zBooleanValue = true;
                }
                td90 td90Var = this.producerSequenceFactory;
                return m164403B(zBooleanValue ? td90Var.m188088D(imageRequest) : td90Var.m188120z(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, Priority.MEDIUM, requestListener);
            } catch (Exception e) {
                return h5c.m129392b(e);
            }
        }
        o6j.m162850a("ImagePipeline#prefetchToBitmapCache");
        try {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                c5c<Void> c5cVarM129392b3 = h5c.m129392b(f144010n);
                c5cVarM129392b3.getClass();
                o6j.m162851b();
                return c5cVarM129392b3;
            }
            try {
                if (this.config.getExperiments().getPrefetchShortcutEnabled() && m164418r(imageRequest)) {
                    c5c<Void> c5cVarM129393c2 = h5c.m129393c();
                    c5cVarM129393c2.getClass();
                    o6j.m162851b();
                    return c5cVarM129393c2;
                }
                if (imageRequest == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolM8564A2 = imageRequest.m8564A();
                if (boolM8564A2 == null) {
                    Boolean bool2 = this.suppressBitmapPrefetchingSupplier.get();
                    bool2.getClass();
                    zBooleanValue = bool2.booleanValue();
                } else if (!boolM8564A2.booleanValue()) {
                    zBooleanValue = true;
                }
                td90 td90Var2 = this.producerSequenceFactory;
                c5cVarM129392b = m164403B(zBooleanValue ? td90Var2.m188088D(imageRequest) : td90Var2.m188120z(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, Priority.MEDIUM, requestListener);
                o6j.m162851b();
                return c5cVarM129392b;
            } catch (Exception e2) {
                c5cVarM129392b = h5c.m129392b(e2);
            }
        } catch (Throwable th) {
            o6j.m162851b();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final c5c<Void> m164423w(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m164424x(imageRequest, callerContext, Priority.MEDIUM, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: x */
    public final c5c<Void> m164424x(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @NotNull Priority priority, @Nullable guc0 requestListener) {
        priority.getClass();
        if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
            c5c<Void> c5cVarM129392b = h5c.m129392b(f144010n);
            c5cVarM129392b.getClass();
            return c5cVarM129392b;
        }
        if (imageRequest == null) {
            c5c<Void> c5cVarM129392b2 = h5c.m129392b(new NullPointerException("imageRequest is null"));
            c5cVarM129392b2.getClass();
            return c5cVarM129392b2;
        }
        try {
            return m164403B(this.producerSequenceFactory.m188088D(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, priority, requestListener);
        } catch (Exception e) {
            return h5c.m129392b(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m164425y() {
        this.threadHandoffProducerQueue.mo155511d();
    }

    /* JADX INFO: renamed from: z */
    public final <T> c5c<fa5<T>> m164426z(sc90<fa5<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, guc0 requestListener, String uiComponentId) {
        return m164402A(producerSequence, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId, null);
    }
}
