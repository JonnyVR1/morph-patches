package p149l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Options;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010!R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00061"}, m87232d2 = {"Ll/t23;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/graphics/Bitmap;)I", "Ljava/io/InputStream;", "inputStream", "Landroid/util/Pair;", "c", "(Ljava/io/InputStream;)Landroid/util/Pair;", "Ll/xgm;", Constants.INAPP_DATA_TAG, "(Ljava/io/InputStream;)Ll/xgm;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "g", "(Landroid/graphics/Bitmap$Config;)I", "width", "height", "h", "(IILandroid/graphics/Bitmap$Config;)I", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", Options.TYPE, "e", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "byteBuffer", "", "k", "(Ljava/nio/ByteBuffer;)V", "j", "Ll/lb80;", "a", "Lkotlin/Lazy;", "f", "()Ll/lb80;", "DECODE_BUFFERS", "", "Z", "useDecodeBufferHelper", "fixDecodeDrmImageCrash", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class t23 {

    @NotNull
    public static final t23 INSTANCE = new t23();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy DECODE_BUFFERS = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.r23
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t23.m186955a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean useDecodeBufferHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean fixDecodeDrmImageCrash;

    /* JADX INFO: renamed from: l.t23$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C20098a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f167438a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f167438a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static lb80 m186955a() {
        return new lb80(12);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Pair<Integer, Integer> m186956c(@Nullable InputStream inputStream) {
        Pair<Integer, Integer> pair = null;
        if (inputStream == null) {
            qkq0.m175383a("Required value was null.");
            return null;
        }
        t23 t23Var = INSTANCE;
        ByteBuffer byteBufferM186964j = t23Var.m186964j();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferM186964j.array();
            t23Var.m186962e(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            INSTANCE.m186965k(byteBufferM186964j);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final xgm m186957d(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            qkq0.m175383a("Required value was null.");
            return null;
        }
        t23 t23Var = INSTANCE;
        ByteBuffer byteBufferM186964j = t23Var.m186964j();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferM186964j.array();
            t23Var.m186962e(inputStream, null, options);
            return new xgm(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            INSTANCE.m186965k(byteBufferM186964j);
        }
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public static final int m186958g(@Nullable Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : C20098a.f167438a[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                qq3.m175877a("The provided Bitmap.Config is not supported");
                return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m186959h(int width, int height, @Nullable Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            jck0.m140980a("width must be > 0, width is: ", width);
            return 0;
        }
        if (height <= 0) {
            jck0.m140980a("height must be > 0, height is: ", height);
            return 0;
        }
        int iM186958g = m186958g(bitmapConfig);
        int i = width * height * iM186958g;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i + ", width: " + width + ", height: " + height + ", pixelSize: " + iM186958g).toString());
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: i */
    public static final int m186960i(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m186961b() {
        return useDecodeBufferHelper ? lgd.INSTANCE.acquire() : m186963f().acquire();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Bitmap m186962e(@Nullable InputStream inputStream, @Nullable Rect outPadding, @Nullable BitmapFactory.Options options) {
        if (!fixDecodeDrmImageCrash) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final lb80<ByteBuffer> m186963f() {
        return (lb80) DECODE_BUFFERS.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m186964j() {
        ByteBuffer byteBufferM186961b = m186961b();
        if (byteBufferM186961b != null) {
            return byteBufferM186961b;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(lgd.m149774c());
        byteBufferAllocate.getClass();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: k */
    public final void m186965k(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        m186963f().release(byteBuffer);
    }
}
