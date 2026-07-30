package com.immomo.svgaplayer;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.http.HttpResponseCache;
import android.os.Handler;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.immomo.svgaplayer.adapter.SVGAThreadAdapter;
import com.immomo.svgaplayer.proto.MovieEntity;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.p051p1.mobile.putong.data.Careers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0001H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020 J\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J \u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAParser;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "fileDownloader", "Lcom/immomo/svgaplayer/SVGAParser$FileDownloader;", "getFileDownloader", "()Lcom/immomo/svgaplayer/SVGAParser$FileDownloader;", "setFileDownloader", "(Lcom/immomo/svgaplayer/SVGAParser$FileDownloader;)V", "mContextRef", "Ljava/lang/ref/WeakReference;", "getTaskTag", "inflate", "", "byteArray", "onComplete", "", "callback", "Lcom/immomo/svgaplayer/SVGAParser$ParseCompletion;", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "onDestroy", "onError", "errorMsg", "parse", "inputStream", "Ljava/io/InputStream;", "closeInputStream", "", "url", "Ljava/net/URL;", "assetsName", "parseFile", "filePath", "readAsBytes", "FileDownloader", "ParseCompletion", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class SVGAParser {
    private final String TAG;
    private final Context context;

    @NotNull
    private FileDownloader fileDownloader;
    private WeakReference<Context> mContextRef;

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jb\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000f2%\u0010\u0014\u001a!\u0012\u0017\u0012\u00150\u0015j\u0002`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\n0\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAParser$FileDownloader;", "", "()V", "noCache", "", "getNoCache", "()Z", "setNoCache", "(Z)V", "resume", "", "taskTag", "url", "Ljava/net/URL;", "complete", "Lkotlin/Function1;", "Ljava/io/InputStream;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "inputStream", "failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static class FileDownloader {
        private boolean noCache;

        public final boolean getNoCache() {
            return this.noCache;
        }

        public void resume(@NotNull Object taskTag, @NotNull final URL url, @NotNull final Function1<? super InputStream, Unit> complete, @NotNull final Function1<? super Exception, Unit> failure) {
            taskTag.getClass();
            url.getClass();
            complete.getClass();
            failure.getClass();
            Runnable runnable = new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$FileDownloader$resume$runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (HttpResponseCache.getInstalled() == null && !this.this$0.getNoCache()) {
                            Log.e("SVGAParser", "SVGAParser can not handle cache before install HttpResponseCache. see https://github.com/yyued/SVGAPlayer-Android#cache");
                            Log.e("SVGAParser", "在配置 HttpResponseCache 前 SVGAParser 无法缓存. 查看 https://github.com/yyued/SVGAPlayer-Android#cache ");
                        }
                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                            uRLConnectionOpenConnection = null;
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.connect();
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int i = inputStream.read(bArr, 0, 4096);
                                        if (i == -1) {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                            try {
                                                complete.invoke(byteArrayInputStream);
                                                Unit unit = Unit.INSTANCE;
                                                CloseableKt.m88293a(byteArrayInputStream, null);
                                                CloseableKt.m88293a(byteArrayOutputStream, null);
                                                CloseableKt.m88293a(inputStream, null);
                                                return;
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    CloseableKt.m88293a(byteArrayInputStream, th);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i);
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            CloseableKt.m88293a(inputStream, th);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        CloseableKt.m88293a(byteArrayOutputStream, th4);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        failure.invoke(e);
                    }
                }
            };
            SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
            if (mSVGAThreadAdapter != null) {
                mSVGAThreadAdapter.executeTaskByTag(taskTag, runnable);
            } else {
                new Thread(runnable).start();
            }
        }

        public final void setNoCache(boolean z) {
            this.noCache = z;
        }
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAParser$ParseCompletion;", "", "onComplete", "", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "onError", "errorMsg", "", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public interface ParseCompletion {
        void onComplete(@NotNull SVGAVideoEntity videoItem);

        void onError(@NotNull String errorMsg);
    }

    public SVGAParser(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.TAG = "SVGAParser";
        this.mContextRef = new WeakReference<>(context);
        this.fileDownloader = new FileDownloader();
    }

    private final Object getTaskTag() {
        return this.TAG + hashCode();
    }

    private final byte[] inflate(byte[] byteArray) {
        try {
            Inflater inflater = new Inflater();
            inflater.setInput(byteArray, 0, byteArray.length);
            byte[] bArr = new byte[2048];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int iInflate = inflater.inflate(bArr, 0, 2048);
                    if (iInflate <= 0) {
                        inflater.end();
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        CloseableKt.m88293a(byteArrayOutputStream, null);
                        return byteArray2;
                    }
                    byteArrayOutputStream.write(bArr, 0, iInflate);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
                e.printStackTrace();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onComplete(final ParseCompletion callback, final SVGAVideoEntity videoItem) {
        if (videoItem == null) {
            onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_PARSE());
            return;
        }
        Context context = this.mContextRef.get();
        if (context != null) {
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$onComplete$$inlined$let$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    SVGAParser.ParseCompletion parseCompletion = callback;
                    if (parseCompletion != null) {
                        parseCompletion.onComplete(videoItem);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(final ParseCompletion callback, String errorMsg) {
        Context context = this.mContextRef.get();
        if (context != null) {
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$onError$$inlined$let$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    SVGAParser.ParseCompletion parseCompletion = callback;
                    if (parseCompletion != null) {
                        parseCompletion.onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_LOCAL_LOAD());
                    }
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void parse$default(SVGAParser sVGAParser, InputStream inputStream, ParseCompletion parseCompletion, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        sVGAParser.parse(inputStream, parseCompletion, z);
    }

    public static /* bridge */ /* synthetic */ void parseFile$default(SVGAParser sVGAParser, String str, ParseCompletion parseCompletion, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        sVGAParser.parseFile(str, parseCompletion, z);
    }

    private final byte[] readAsBytes(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStream.read(bArr, 0, 2048);
                    if (i <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        CloseableKt.m88293a(byteArrayOutputStream, null);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    e.printStackTrace();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(byteArrayOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final FileDownloader getFileDownloader() {
        return this.fileDownloader;
    }

    public final void onDestroy() {
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.cancelTaskByTag(getTaskTag());
        }
    }

    public final void parse(@NotNull String assetsName, @NotNull ParseCompletion callback) {
        AssetManager assets;
        InputStream inputStreamOpen;
        assetsName.getClass();
        callback.getClass();
        try {
            Context context = this.mContextRef.get();
            if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open(assetsName)) == null) {
                return;
            }
            parse(inputStreamOpen, callback, true);
        } catch (Exception unused) {
            onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_ASSETS_LOAD());
        }
    }

    public final void parseFile(@NotNull final String filePath, @NotNull final ParseCompletion callback, final boolean closeInputStream) {
        filePath.getClass();
        callback.getClass();
        Runnable runnable = new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$parseFile$runnable$1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(filePath));
                    SVGAVideoEntity sVGAVideoEntity = this.this$0.parse(fileInputStream);
                    if (closeInputStream) {
                        fileInputStream.close();
                    }
                    this.this$0.onComplete(callback, sVGAVideoEntity);
                } catch (FileNotFoundException unused) {
                    this.this$0.onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_LOCAL_LOAD());
                }
            }
        };
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.executeTaskByTag(getTaskTag(), runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    public final void setFileDownloader(@NotNull FileDownloader fileDownloader) {
        fileDownloader.getClass();
        this.fileDownloader = fileDownloader;
    }

    /* JADX INFO: renamed from: com.immomo.svgaplayer.SVGAParser$parse$2 */
    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Ljava/io/InputStream;", "invoke"}, m88122k = 3, m88123mv = {1, 1, 10})
    public static final class C41202 extends Lambda implements Function1<InputStream, Unit> {
        final /* synthetic */ ParseCompletion $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41202(ParseCompletion parseCompletion) {
            super(1);
            this.$callback = parseCompletion;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InputStream inputStream) throws IOException {
            inputStream.getClass();
            final SVGAVideoEntity sVGAVideoEntity = SVGAParser.this.parse(inputStream);
            if (sVGAVideoEntity != null) {
                sVGAVideoEntity.prepare$svgalibrary_release(new Function0<Unit>() { // from class: com.immomo.svgaplayer.SVGAParser.parse.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C41202 c41202 = C41202.this;
                        SVGAParser.this.onComplete(c41202.$callback, sVGAVideoEntity);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            } else {
                new Handler(SVGAParser.this.context.getMainLooper()).post(new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$parse$2$videoItem$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.$callback.onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_REMOTE_LOAD());
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InputStream inputStream) throws IOException {
            invoke2(inputStream);
            return Unit.INSTANCE;
        }
    }

    public final void parse(@NotNull URL url, @NotNull final ParseCompletion callback) {
        url.getClass();
        callback.getClass();
        this.fileDownloader.resume(getTaskTag(), url, new C41202(callback), new Function1<Exception, Unit>() { // from class: com.immomo.svgaplayer.SVGAParser.parse.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                exc.getClass();
                SVGAParser.this.onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_ASSETS_LOAD());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }
        });
    }

    public final void parse(@NotNull final InputStream inputStream, @NotNull final ParseCompletion callback, final boolean closeInputStream) {
        inputStream.getClass();
        callback.getClass();
        Runnable runnable = new Runnable() { // from class: com.immomo.svgaplayer.SVGAParser$parse$runnable$1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                SVGAVideoEntity sVGAVideoEntity = this.this$0.parse(inputStream);
                if (closeInputStream) {
                    inputStream.close();
                }
                this.this$0.onComplete(callback, sVGAVideoEntity);
            }
        };
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.executeTaskByTag(getTaskTag(), runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SVGAVideoEntity parse(InputStream inputStream) {
        byte[] asBytes = readAsBytes(inputStream);
        if (asBytes == null) {
            return null;
        }
        try {
            byte[] bArrInflate = inflate(asBytes);
            if (bArrInflate == null) {
                return null;
            }
            MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrInflate);
            movieEntityDecode.getClass();
            return new SVGAVideoEntity(movieEntityDecode);
        } catch (Exception e) {
            e.printStackTrace();
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }
}
