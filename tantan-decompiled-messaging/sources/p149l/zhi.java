package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.ByteStreamsKt;
import kotlin.p118io.CloseableKt;
import kotlin.p118io.TextStreamsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a>\u0010\u001f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m87232d2 = {"Ljava/io/File;", "", "e", "(Ljava/io/File;)[B", "Ljava/nio/charset/Charset;", "charset", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "", "k", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/io/OutputStream;", "m", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", Constants.INAPP_DATA_TAG, "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "b", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "line", "action", "c", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)V", "", "f", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/io/FilesKt")
@SourceDebugExtension
public class zhi extends xhi {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ByteBuffer m218799b(int i, @NotNull CharsetEncoder charsetEncoder) {
        charsetEncoder.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    public static final void m218800c(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super String, Unit> function1) {
        file.getClass();
        charset.getClass();
        function1.getClass();
        TextStreamsKt.m87422d(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), function1);
    }

    /* JADX INFO: renamed from: d */
    public static final CharsetEncoder m218801d(@NotNull Charset charset) {
        charset.getClass();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static byte[] m218802e(@NotNull File file) {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyInto = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyInto, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    xof xofVar = new xof(8193);
                    xofVar.write(i5);
                    ByteStreamsKt.m87402b(fileInputStream, xofVar, 0, 2, null);
                    int size = xofVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    bArrCopyInto = ArraysKt.copyInto(xofVar.m210417k(), Arrays.copyOf(bArrCopyInto, size), i, 0, xofVar.size());
                }
            }
            CloseableKt.m87404a(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m218803f(@NotNull File file, @NotNull Charset charset) {
        file.getClass();
        charset.getClass();
        final ArrayList arrayList = new ArrayList();
        m218800c(file, charset, new Function1() { // from class: l.yhi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zhi.m218805h(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m218804g(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return m218803f(file, charset);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m218805h(ArrayList arrayList, String str) {
        str.getClass();
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m218806i(@NotNull File file, @NotNull Charset charset) {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM87425g = TextStreamsKt.m87425g(inputStreamReader);
            CloseableKt.m87404a(inputStreamReader, null);
            return strM87425g;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m218807j(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return m218806i(file, charset);
    }

    /* JADX INFO: renamed from: k */
    public static final void m218808k(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m218810m(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m218809l(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        m218808k(file, str, charset);
    }

    /* JADX INFO: renamed from: m */
    public static final void m218810m(@NotNull OutputStream outputStream, @NotNull String str, @NotNull Charset charset) throws IOException {
        outputStream.getClass();
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderM218801d = m218801d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderM218801d.getClass();
        ByteBuffer byteBufferM218799b = m218799b(8192, charsetEncoderM218801d);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderM218801d.encode(charBufferAllocate, byteBufferM218799b, i3 == str.length()).isUnderflow()) {
                qkq0.m175383a("Check failed.");
                return;
            }
            outputStream.write(byteBufferM218799b.array(), 0, byteBufferM218799b.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferM218799b.clear();
            i = i3;
        }
    }
}
