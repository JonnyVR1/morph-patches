package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.Metadata;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.kpy, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\f\"6\u0010\n\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"6\u0010\u000e\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"4\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"6\u0010\u0016\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m88121d2 = {"Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "file", "Landroid/graphics/Bitmap;", "a", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "fileToBitmap", "", "b", "h", "fileToBytes", HttpHeaderValues.BYTES, "c", "f", "bytesToBitmap", "bitmap", Constants.INAPP_DATA_TAG, "e", "bitmapToBytes", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    private static final kotlin.jvm.functions.Function1<File, Bitmap> f128135a = new kotlin.jvm.functions.Function1() { // from class: l.gpy
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Function1.m150801c((File) obj);
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    private static final kotlin.jvm.functions.Function1<File, byte[]> f128136b = new kotlin.jvm.functions.Function1() { // from class: l.hpy
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Function1.m150799a((File) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    private static final kotlin.jvm.functions.Function1<byte[], Bitmap> f128137c = new kotlin.jvm.functions.Function1() { // from class: l.ipy
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Function1.m150802d((byte[]) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final kotlin.jvm.functions.Function1<Bitmap, byte[]> f128138d = new kotlin.jvm.functions.Function1() { // from class: l.jpy
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Function1.m150800b((Bitmap) obj);
        }
    };

    /* JADX INFO: renamed from: a */
    public static byte[] m150799a(File file) {
        if (file != null) {
            return wki.m206825e(file);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m150800b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m150801c(File file) {
        if (file == null || !yqf.m217086a(file)) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m150802d(byte[] bArr) {
        bArr.getClass();
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final kotlin.jvm.functions.Function1<Bitmap, byte[]> m150803e() {
        return f128138d;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final kotlin.jvm.functions.Function1<byte[], Bitmap> m150804f() {
        return f128137c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final kotlin.jvm.functions.Function1<File, Bitmap> m150805g() {
        return f128135a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final kotlin.jvm.functions.Function1<File, byte[]> m150806h() {
        return f128136b;
    }
}
