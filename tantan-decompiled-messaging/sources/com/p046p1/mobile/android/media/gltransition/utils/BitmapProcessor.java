package com.p046p1.mobile.android.media.gltransition.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.l9r;
import p149l.vek0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \"2\u00020\u0001:\u0002\u001a#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f¨\u0006$"}, m87232d2 = {"Lcom/p1/mobile/android/media/gltransition/utils/BitmapProcessor;", "", "Landroid/graphics/Bitmap;", "source", "<init>", "(Landroid/graphics/Bitmap;)V", "", "scaledWidth", "scaledHeight", "backgroundColor", "", BLiveStormDanmakuGiftResourceType.f44444l, "(III)V", "k", "()Landroid/graphics/Bitmap;", "Lcom/p1/mobile/android/media/gltransition/utils/BitmapProcessor$CropType;", "b", "()Lcom/p1/mobile/android/media/gltransition/utils/BitmapProcessor$CropType;", "Landroid/graphics/Rect;", Constants.INAPP_DATA_TAG, "()Landroid/graphics/Rect;", "e", "c", "g", "f", RXScreenCaptureService.KEY_INDEX, "a", "j", "h", "Landroid/graphics/Bitmap;", "getSource", "I", "width", "height", "Companion", "CropType", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BitmapProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Bitmap source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int scaledWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int scaledHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int backgroundColor;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m87232d2 = {"Lcom/p1/mobile/android/media/gltransition/utils/BitmapProcessor$CropType;", "", "<init>", "(Ljava/lang/String;I)V", "", Constants.KEY_KEY, "()Ljava/lang/String;", "Companion", "a", "FIT_CENTER", "FIT_START", "FIT_END", "FIT_WIDTH", "FIT_HEIGHT", "FILL_CENTER", "FILL_START", "FILL_END", "CENTER_INSIDE", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum CropType {
        FIT_CENTER,
        FIT_START,
        FIT_END,
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_CENTER,
        FILL_START,
        FILL_END,
        CENTER_INSIDE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.utils.BitmapProcessor$CropType$b */
        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final /* synthetic */ class C4339b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f15620a;

            static {
                int[] iArr = new int[CropType.values().length];
                try {
                    iArr[CropType.FIT_CENTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CropType.FIT_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CropType.FIT_END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CropType.FIT_WIDTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CropType.FIT_HEIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CropType.FILL_CENTER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CropType.FILL_START.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CropType.FILL_END.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CropType.CENTER_INSIDE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f15620a = iArr;
            }
        }

        @NotNull
        public static EnumEntries<CropType> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String key() {
            switch (C4339b.f15620a[ordinal()]) {
                case 1:
                    return "fit-center";
                case 2:
                    return "fit-start";
                case 3:
                    return "fit-end";
                case 4:
                    return "fit-width";
                case 5:
                    return "fit-height";
                case 6:
                    return "fill-center";
                case 7:
                    return "fill-start";
                case 8:
                    return "fill-end";
                case 9:
                    return "center-inside";
                default:
                    l9r.m149037a();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.utils.BitmapProcessor$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/android/media/gltransition/utils/BitmapProcessor$a;", "", "<init>", "()V", "", "filePath", "Landroid/graphics/Bitmap;", "b", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "", "exifOrientation", "a", "(I)I", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m20790a(int exifOrientation) {
            if (exifOrientation == 3) {
                return 180;
            }
            if (exifOrientation != 6) {
                return exifOrientation != 8 ? 0 : 270;
            }
            return 90;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Bitmap m20791b(@NotNull String filePath) {
            filePath.getClass();
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(filePath);
            int iM20790a = m20790a(new ExifInterface(filePath).getAttributeInt(j6f.TAG_ORIENTATION, 1));
            Matrix matrix = new Matrix();
            if (iM20790a != 0) {
                matrix.preRotate(iM20790a);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            bitmapCreateBitmap.getClass();
            return bitmapCreateBitmap;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.utils.BitmapProcessor$b */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C4341b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15621a;

        static {
            int[] iArr = new int[CropType.values().length];
            try {
                iArr[CropType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropType.FIT_WIDTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CropType.FIT_HEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CropType.FILL_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CropType.FILL_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CropType.FILL_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CropType.CENTER_INSIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f15621a = iArr;
        }
    }

    public BitmapProcessor(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        this.source = bitmap;
        int width = bitmap.getWidth();
        this.width = width;
        int height = bitmap.getHeight();
        this.height = height;
        this.scaledWidth = width;
        this.scaledHeight = height;
        this.backgroundColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m20778a() {
        int i = (int) ((this.scaledWidth - this.width) / 2.0f);
        int i2 = (int) ((this.scaledHeight - this.height) / 2.0f);
        return new Rect(i, i2, this.width + i, this.height + i2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final CropType m20779b() {
        return CropType.FIT_CENTER;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m20780c() {
        int i = (int) (this.scaledWidth / (this.width / this.height));
        int i2 = (int) ((this.scaledHeight - i) / 2.0f);
        return new Rect(0, i2, this.scaledWidth, i + i2);
    }

    /* JADX INFO: renamed from: d */
    public final Rect m20781d() {
        return new Rect(0, this.scaledHeight - ((int) (this.scaledWidth / (this.width / this.height))), this.scaledWidth, this.scaledHeight);
    }

    /* JADX INFO: renamed from: e */
    public final Rect m20782e() {
        return new Rect(0, 0, this.scaledWidth, (int) (this.scaledWidth / (this.width / this.height)));
    }

    /* JADX INFO: renamed from: f */
    public final Rect m20783f() {
        int i = this.width;
        int i2 = this.height;
        float f = i / i2;
        int i3 = this.scaledHeight;
        int i4 = this.scaledWidth;
        if (i > i2) {
            if (i <= i4) {
                int i5 = (i4 / 2) - (i / 2);
                int i6 = (i3 / 2) - (i2 / 2);
                return new Rect(i5, i6, i + i5, i2 + i6);
            }
            float f2 = i4 / f;
            float f3 = (i3 / 2) - (f2 / 2.0f);
            return new Rect(0, (int) f3, i4, (int) (f2 + f3));
        }
        if (i4 / i3 < f) {
            float f4 = i4 / f;
            float f5 = (i3 / 2) - (f4 / 2.0f);
            return new Rect(0, (int) f5, i4, (int) (f4 + f5));
        }
        float f6 = f * i3;
        float f7 = (i4 / 2) - (f6 / 2.0f);
        return new Rect((int) f7, 0, (int) (f6 + f7), i3);
    }

    /* JADX INFO: renamed from: g */
    public final Rect m20784g() {
        return new Rect(this.scaledWidth - ((int) (this.scaledHeight * (this.width / this.height))), 0, this.scaledWidth, this.scaledHeight);
    }

    /* JADX INFO: renamed from: h */
    public final Rect m20785h() {
        float f = this.width / this.height;
        int i = this.scaledHeight;
        float f2 = i * f;
        int i2 = this.scaledWidth;
        int i3 = f2 > ((float) i2) ? i2 : (int) (i * f);
        int i4 = (i2 - i3) / 2;
        return new Rect(i4, 0, i3 + i4, this.scaledHeight);
    }

    /* JADX INFO: renamed from: i */
    public final Rect m20786i() {
        return new Rect(0, 0, (int) (this.scaledHeight * (this.width / this.height)), this.scaledHeight);
    }

    /* JADX INFO: renamed from: j */
    public final Rect m20787j() {
        float f = this.width / this.height;
        int i = this.scaledWidth;
        float f2 = i / f;
        int i2 = this.scaledHeight;
        int i3 = f2 > ((float) i2) ? i2 : (int) (i / f);
        int i4 = (i2 - i3) / 2;
        return new Rect(0, i4, this.scaledWidth, i3 + i4);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Bitmap m20788k() {
        Pair pairM87240a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.scaledWidth, this.scaledHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        CropType cropTypeM20779b = m20779b();
        switch (C4341b.f15621a[cropTypeM20779b.ordinal()]) {
            case 1:
                pairM87240a = TuplesKt.m87240a(m20783f(), Boolean.FALSE);
                break;
            case 2:
                pairM87240a = TuplesKt.m87240a(m20786i(), Boolean.FALSE);
                break;
            case 3:
                pairM87240a = TuplesKt.m87240a(m20784g(), Boolean.FALSE);
                break;
            case 4:
                pairM87240a = TuplesKt.m87240a(m20787j(), Boolean.FALSE);
                break;
            case 5:
                pairM87240a = TuplesKt.m87240a(m20785h(), Boolean.FALSE);
                break;
            case 6:
                pairM87240a = TuplesKt.m87240a(m20780c(), Boolean.TRUE);
                break;
            case 7:
                pairM87240a = TuplesKt.m87240a(m20782e(), Boolean.TRUE);
                break;
            case 8:
                pairM87240a = TuplesKt.m87240a(m20781d(), Boolean.TRUE);
                break;
            case 9:
                pairM87240a = TuplesKt.m87240a(m20778a(), Boolean.FALSE);
                break;
            default:
                l9r.m149037a();
                return null;
        }
        Rect rect = (Rect) pairM87240a.component1();
        boolean zBooleanValue = ((Boolean) pairM87240a.component2()).booleanValue();
        vek0.m198203c("[proceedSync] cropType: " + cropTypeM20779b + ", dstRect: " + rect + ", fill: " + zBooleanValue + ", source: " + this.source.getWidth() + ":" + this.source.getHeight());
        if (!zBooleanValue) {
            canvas.drawColor(this.backgroundColor);
        }
        canvas.drawBitmap(this.source, (Rect) null, rect, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public final void m20789l(int scaledWidth, int scaledHeight, int backgroundColor) {
        this.scaledWidth = scaledWidth;
        this.scaledHeight = scaledHeight;
        this.backgroundColor = backgroundColor;
    }
}
