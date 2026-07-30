package com.clevertap.android.sdk.inapp.images;

import android.content.Context;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.dgi;
import p149l.igy;
import p149l.j6f;
import p149l.nt3;
import p149l.nul;
import p149l.uom;
import p149l.wfi;
import p149l.wgy;
import p149l.wom;
import p149l.xfi;
import p149l.xgy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 V2\u00020\u0001:\u0001HBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0018J?\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0002¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J;\u0010,\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00192\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020(0\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0002¢\u0006\u0004\b,\u0010-Jq\u00102\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020(0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2 \u00101\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0/H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020!2\u0006\u00104\u001a\u00020\u001aH\u0002¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b?\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\bE\u0010>J\u0017\u0010F\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\bF\u0010>J\u0015\u0010G\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bG\u00106R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010PR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010QR*\u0010U\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010T¨\u0006W"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "", "Ljava/io/File;", "images", "gifs", "allFileTypesDir", "Ll/nul;", "logger", "Ll/xfi;", "inAppRemoteSource", "Ll/nt3;", "ctCaches", "Ll/wom;", "imageMAO", "Ll/uom;", "gifMAO", "Ll/dgi;", "fileMAO", "", "deepLogging", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/io/File;Ll/nul;Ll/xfi;Ll/nt3;Ll/wom;Ll/uom;Ll/dgi;Z)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ll/nul;)V", j6f.GPS_DIRECTION_TRUE, "", "cacheKey", "Lkotlin/Pair;", "", "data", "Ll/igy;", "mao", "", Constants.KEY_T, "(Ljava/lang/String;Lkotlin/Pair;Ll/igy;)V", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "downloadedBitmap", "k", "(Lcom/clevertap/android/sdk/network/DownloadedBitmap;)Lkotlin/Pair;", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "cacheKeyAndType", "Ll/xgy;", "transformationType", BLiveStormDanmakuGiftResourceType.f44444l, "(Lkotlin/Pair;Ll/xgy;)Ljava/lang/Object;", "urlMeta", "Lkotlin/Function1;", "cachedDataFetcherBlock", "dataToSaveBlock", "m", "(Lkotlin/Pair;Ll/igy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "message", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)V", "url", "r", "(Ljava/lang/String;)Z", "Landroid/graphics/Bitmap;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "h", "(Ljava/lang/String;)[B", "e", "g", "(Ljava/lang/String;)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/io/File;", "p", "o", "n", "j", "a", "Ll/nul;", "b", "Ll/xfi;", "c", "Ll/wom;", Constants.INAPP_DATA_TAG, "Ll/uom;", "Ll/dgi;", "Z", "", "", "Ljava/util/Map;", "mapOfMAO", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FileResourceProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    @Nullable
    private static volatile FileResourceProvider f5144h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final nul logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final xfi inAppRemoteSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final wom imageMAO;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final uom gifMAO;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final dgi fileMAO;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean deepLogging;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<CtCacheType, List<igy<?>>> mapOfMAO;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.FileResourceProvider$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "(Landroid/content/Context;Ll/nul;Lcom/clevertap/android/sdk/network/NetworkMonitor;)Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "a", "(Landroid/content/Context;Ll/nul;)Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "", "IMAGE_DIRECTORY_NAME", "Ljava/lang/String;", "GIF_DIRECTORY_NAME", "ALL_FILE_TYPES_DIRECTORY_NAME", "instance", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FileResourceProvider m6502a(@NotNull Context context, @Nullable nul logger) {
            FileResourceProvider fileResourceProvider;
            context.getClass();
            FileResourceProvider fileResourceProvider2 = FileResourceProvider.f5144h;
            if (fileResourceProvider2 != null) {
                return fileResourceProvider2;
            }
            synchronized (this) {
                fileResourceProvider = FileResourceProvider.f5144h;
                if (fileResourceProvider == null) {
                    fileResourceProvider = new FileResourceProvider(context, logger);
                    FileResourceProvider.f5144h = fileResourceProvider;
                }
            }
            return fileResourceProvider;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final FileResourceProvider m6503b(@NotNull Context context, @Nullable nul logger, @NotNull NetworkMonitor networkMonitor) {
            FileResourceProvider fileResourceProvider;
            context.getClass();
            networkMonitor.getClass();
            FileResourceProvider fileResourceProvider2 = FileResourceProvider.f5144h;
            if (fileResourceProvider2 != null) {
                return fileResourceProvider2;
            }
            synchronized (this) {
                fileResourceProvider = FileResourceProvider.f5144h;
                if (fileResourceProvider == null) {
                    File dir = context.getDir("CleverTap.Images.", 0);
                    dir.getClass();
                    File dir2 = context.getDir("CleverTap.Gif.", 0);
                    dir2.getClass();
                    File dir3 = context.getDir("CleverTap.Files.", 0);
                    dir3.getClass();
                    FileResourceProvider fileResourceProvider3 = new FileResourceProvider(dir, dir2, dir3, logger, new wfi(networkMonitor), null, null, null, null, false, 992, null);
                    FileResourceProvider.f5144h = fileResourceProvider3;
                    fileResourceProvider = fileResourceProvider3;
                }
            }
            return fileResourceProvider;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.images.FileResourceProvider$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1257b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5152a;

        static {
            int[] iArr = new int[DownloadedBitmap.Status.values().length];
            try {
                iArr[DownloadedBitmap.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5152a = iArr;
        }
    }

    public FileResourceProvider(@NotNull File file, @NotNull File file2, @NotNull File file3, @Nullable nul nulVar, @NotNull xfi xfiVar, @NotNull nt3 nt3Var, @NotNull wom womVar, @NotNull uom uomVar, @NotNull dgi dgiVar, boolean z) {
        file.getClass();
        file2.getClass();
        file3.getClass();
        xfiVar.getClass();
        nt3Var.getClass();
        womVar.getClass();
        uomVar.getClass();
        dgiVar.getClass();
        this.logger = nulVar;
        this.inAppRemoteSource = xfiVar;
        this.imageMAO = womVar;
        this.gifMAO = uomVar;
        this.fileMAO = dgiVar;
        this.deepLogging = z;
        this.mapOfMAO = MapsKt.mapOf(TuplesKt.m87240a(CtCacheType.IMAGE, CollectionsKt.listOf((Object[]) new igy[]{womVar, dgiVar, uomVar})), TuplesKt.m87240a(CtCacheType.GIF, CollectionsKt.listOf((Object[]) new igy[]{uomVar, dgiVar, womVar})), TuplesKt.m87240a(CtCacheType.FILES, CollectionsKt.listOf((Object[]) new igy[]{dgiVar, womVar, uomVar})));
    }

    /* JADX INFO: renamed from: a */
    public static Pair m6482a(DownloadedBitmap downloadedBitmap) {
        downloadedBitmap.getClass();
        if (C1257b.f5152a[downloadedBitmap.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()] != 1) {
            return null;
        }
        Bitmap bitmap = downloadedBitmap.getBitmap();
        bitmap.getClass();
        byte[] bytes = downloadedBitmap.getBytes();
        bytes.getClass();
        return new Pair(bitmap, bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Pair<byte[], byte[]> m6486k(DownloadedBitmap downloadedBitmap) {
        if (C1257b.f5152a[downloadedBitmap.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()] != 1) {
            return null;
        }
        byte[] bytes = downloadedBitmap.getBytes();
        bytes.getClass();
        return new Pair<>(bytes, downloadedBitmap.getBytes());
    }

    /* JADX INFO: renamed from: l */
    private final <T> T m6487l(Pair<String, ? extends CtCacheType> cacheKeyAndType, xgy<T> transformationType) {
        T t;
        String first = cacheKeyAndType.getFirst();
        CtCacheType second = cacheKeyAndType.getSecond();
        m6490s(second.name() + " data for key " + first + " requested");
        if (first == null) {
            m6490s(second.name() + " data for null key requested");
            return null;
        }
        List<igy<?>> list = this.mapOfMAO.get(second);
        if (list == null) {
            return null;
        }
        List<igy<?>> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = (T) ((igy) it.next()).mo111662g(first, transformationType);
        } while (t == null);
        if (t != null) {
            return t;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            T t2 = (T) ((igy) it2.next()).mo111663h(first, transformationType);
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    private final <T> T m6488m(Pair<String, ? extends CtCacheType> urlMeta, igy<T> mao, Function1<? super String, ? extends T> cachedDataFetcherBlock, Function1<? super DownloadedBitmap, ? extends Pair<? extends T, byte[]>> dataToSaveBlock) {
        T tInvoke = cachedDataFetcherBlock.invoke(urlMeta.getFirst());
        if (tInvoke != null) {
            m6490s("Returning requested " + urlMeta.getFirst() + ' ' + urlMeta.getSecond().name() + " from cache");
            return tInvoke;
        }
        DownloadedBitmap downloadedBitmapMo202984a = this.inAppRemoteSource.mo202984a(urlMeta);
        if (C1257b.f5152a[downloadedBitmapMo202984a.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()] != 1) {
            m6490s("There was a problem fetching data for " + urlMeta.getSecond().name() + ", status: " + downloadedBitmapMo202984a.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String());
            return null;
        }
        Pair<? extends T, byte[]> pairInvoke = dataToSaveBlock.invoke(downloadedBitmapMo202984a);
        pairInvoke.getClass();
        Pair<? extends T, byte[]> pair = pairInvoke;
        m6491t(urlMeta.getFirst(), pair, mao);
        m6490s("Returning requested " + urlMeta.getFirst() + ' ' + urlMeta.getSecond().name() + " with network, saved in cache");
        return pair.getFirst();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final FileResourceProvider m6489q(@NotNull Context context, @Nullable nul nulVar) {
        return INSTANCE.m6502a(context, nulVar);
    }

    /* JADX INFO: renamed from: s */
    private final void m6490s(String message) {
        nul nulVar;
        if (!this.deepLogging || (nulVar = this.logger) == null) {
            return;
        }
        nulVar.verbose("FileDownload", message);
    }

    /* JADX INFO: renamed from: t */
    private final <T> void m6491t(String cacheKey, Pair<? extends T, byte[]> data, igy<T> mao) {
        mao.mo111660e(cacheKey, new Pair<>(data.getFirst(), mao.mo111658c(cacheKey, data.getSecond())));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final byte[] m6492e(@Nullable String cacheKey) {
        return (byte[]) m6487l(new Pair<>(cacheKey, CtCacheType.FILES), xgy.C21147b.INSTANCE);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final File m6493f(@Nullable String cacheKey) {
        return (File) m6487l(new Pair<>(cacheKey, CtCacheType.FILES), xgy.C21148c.INSTANCE);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m6494g(@Nullable String cacheKey) {
        File fileM6493f = m6493f(cacheKey);
        if (fileM6493f != null) {
            return fileM6493f.getAbsolutePath();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final byte[] m6495h(@Nullable String cacheKey) {
        return (byte[]) m6487l(new Pair<>(cacheKey, CtCacheType.GIF), xgy.C21147b.INSTANCE);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Bitmap m6496i(@Nullable String cacheKey) {
        return (Bitmap) m6487l(new Pair<>(cacheKey, CtCacheType.IMAGE), xgy.C21146a.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public final void m6497j(@NotNull String cacheKey) {
        Object obj;
        cacheKey.getClass();
        List<igy<?>> list = this.mapOfMAO.get(CtCacheType.IMAGE);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                igy igyVar = (igy) it.next();
                if (igyVar instanceof wom) {
                    obj = CtCacheType.IMAGE;
                } else if (igyVar instanceof uom) {
                    obj = CtCacheType.GIF;
                } else {
                    obj = igyVar instanceof dgi ? CtCacheType.FILES : "";
                }
                if (igyVar.mo111656a(cacheKey) != null) {
                    m6490s(cacheKey + " was present in " + obj + " in-memory cache is successfully removed");
                }
                if (igyVar.mo111657b(cacheKey)) {
                    m6490s(cacheKey + " was present in " + obj + " disk-memory cache is successfully removed");
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final byte[] m6498n(@NotNull String url) {
        url.getClass();
        return (byte[]) m6488m(new Pair<>(url, CtCacheType.FILES), this.fileMAO, new FileResourceProvider$fetchFile$1(this), new FileResourceProvider$fetchFile$2(this));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final byte[] m6499o(@NotNull String url) {
        url.getClass();
        return (byte[]) m6488m(new Pair<>(url, CtCacheType.GIF), this.gifMAO, new FileResourceProvider$fetchInAppGifV1$1(this), new FileResourceProvider$fetchInAppGifV1$2(this));
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Bitmap m6500p(@NotNull String url) {
        url.getClass();
        return (Bitmap) m6488m(new Pair<>(url, CtCacheType.IMAGE), this.imageMAO, new FileResourceProvider$fetchInAppImageV1$1(this), new Function1() { // from class: l.kgi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileResourceProvider.m6482a((DownloadedBitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6501r(@NotNull String url) {
        Pair pairMo111659d;
        url.getClass();
        List<igy<?>> list = this.mapOfMAO.get(CtCacheType.FILES);
        Object obj = null;
        if (list != null) {
            List<igy<?>> list2 = list;
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    pairMo111659d = null;
                    break;
                }
                pairMo111659d = ((igy) it.next()).mo111659d(url);
            } while (pairMo111659d == null);
            if (pairMo111659d != null) {
                obj = pairMo111659d;
            } else {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    File fileMo111661f = ((igy) it2.next()).mo111661f(url);
                    if (fileMo111661f != null) {
                        obj = fileMo111661f;
                        break;
                    }
                }
            }
        }
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FileResourceProvider(File file, File file2, File file3, nul nulVar, xfi xfiVar, nt3 nt3Var, wom womVar, uom uomVar, dgi dgiVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        NetworkMonitor networkMonitor = null;
        Object[] objArr = 0;
        nulVar = (i & 8) != 0 ? null : nulVar;
        xfiVar = (i & 16) != 0 ? new wfi(networkMonitor, 1, objArr == true ? 1 : 0) : xfiVar;
        if ((i & 32) != 0) {
            nt3.Companion c18765a = nt3.INSTANCE;
            wgy.Companion c20874a = wgy.INSTANCE;
            nt3Var = c18765a.m160844a(c20874a.m203093c(file, nulVar), c20874a.m203092b(file2, nulVar), c20874a.m203091a(file3, nulVar));
        }
        this(file, file2, file3, nulVar, xfiVar, nt3Var, (i & 64) != 0 ? new wom(nt3Var, nulVar) : womVar, (i & 128) != 0 ? new uom(nt3Var, nulVar) : uomVar, (i & 256) != 0 ? new dgi(nt3Var, nulVar) : dgiVar, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileResourceProvider(@NotNull Context context, @Nullable nul nulVar) {
        context.getClass();
        File dir = context.getDir("CleverTap.Images.", 0);
        dir.getClass();
        File dir2 = context.getDir("CleverTap.Gif.", 0);
        dir2.getClass();
        File dir3 = context.getDir("CleverTap.Files.", 0);
        dir3.getClass();
        this(dir, dir2, dir3, nulVar, null, null, null, null, null, false, 1008, null);
    }
}
