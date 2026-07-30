package com.momo.xeengine.svgaplayer;

import android.view.View;
import com.momo.xeengine.somanager.IXEngineSOLoader;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.momo.xeengine.svgaplayer.proto.MovieEntity;
import com.momo.xeengine.svgaplayer.utils.SVGAInputStream;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAParser;", "", OMSTemplateModeType.view, "Landroid/view/View;", "(Landroid/view/View;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "viewRef", "Ljava/lang/ref/WeakReference;", "inflate", "", "byteArray", "onComplete", "", "callback", "Lcom/momo/xeengine/svgaplayer/SVGAParser$ParseCompletion;", "videoItem", "Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", "onError", "errorMsg", "", "parse", "inputStream", "Ljava/io/InputStream;", "parseFile", "filePath", "readAsBytes", "ParseCompletion", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
public final class SVGAParser {
    private final ExecutorService executorService;
    private WeakReference<View> viewRef;

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAParser$ParseCompletion;", "", "onComplete", "", "videoItem", "Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", "onError", "errorMsg", "", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
    public interface ParseCompletion {
        void onComplete(@NotNull SVGAVideoEntity videoItem);

        void onError(@NotNull String errorMsg);
    }

    public SVGAParser(@NotNull View view) {
        view.getClass();
        this.viewRef = new WeakReference<>(view);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.executorService = executorServiceNewSingleThreadExecutor;
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
        View view = this.viewRef.get();
        if (view != null) {
            view.post(new Runnable() { // from class: com.momo.xeengine.svgaplayer.SVGAParser.onComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    ParseCompletion parseCompletion = callback;
                    if (parseCompletion != null) {
                        parseCompletion.onComplete(videoItem);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(final ParseCompletion callback, final String errorMsg) {
        View view = this.viewRef.get();
        if (view != null) {
            view.post(new Runnable() { // from class: com.momo.xeengine.svgaplayer.SVGAParser.onError.1
                @Override // java.lang.Runnable
                public final void run() {
                    ParseCompletion parseCompletion = callback;
                    if (parseCompletion != null) {
                        parseCompletion.onError(errorMsg);
                    }
                }
            });
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

    public final void parseFile(@NotNull final String filePath, @NotNull final ParseCompletion callback) {
        filePath.getClass();
        callback.getClass();
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.momo.xeengine.svgaplayer.SVGAParser$parseFile$loadFunc$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws IOException {
                try {
                    SVGAInputStream sVGAInputStream = new SVGAInputStream(new File(filePath));
                    SVGAVideoEntity sVGAVideoEntity = this.this$0.parse(sVGAInputStream);
                    sVGAInputStream.close();
                    this.this$0.onComplete(callback, sVGAVideoEntity);
                } catch (FileNotFoundException unused) {
                    this.this$0.onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_LOCAL_LOAD());
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        if (XEngineSOManager.check(new IXEngineSOLoader.LoaderCallback() { // from class: com.momo.xeengine.svgaplayer.SVGAParser$parseFile$loadResult$1
            @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
            public void onFailed(@Nullable String errorMsg) {
                this.this$0.onError(callback, ErrorConstant.INSTANCE.getERROR_MMSVGA_RES_LOCAL_LOAD());
            }

            @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
            public void onProcess(int percent, double speed) {
            }

            @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
            public void onSuccess() {
                ExecutorService executorService = this.this$0.executorService;
                Function0 function1 = function0;
                Object sVGAParser$sam$java_lang_Runnable$0 = function1;
                if (function1 != null) {
                    sVGAParser$sam$java_lang_Runnable$0 = new SVGAParser$sam$java_lang_Runnable$0(function1);
                }
                executorService.submit((Runnable) sVGAParser$sam$java_lang_Runnable$0);
            }
        })) {
            this.executorService.submit(new SVGAParser$sam$java_lang_Runnable$0(function0));
        }
    }
}
