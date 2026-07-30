package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m87232d2 = {"Ll/slp0;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "f", "(Ljava/io/InputStream;)Lkotlin/Pair;", "b", "(Ljava/io/InputStream;)I", "g", "h", RXScreenCaptureService.KEY_INDEX, "", "what", "", "with", "", "a", "([BLjava/lang/String;)Z", "header", "c", "([B)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "j", "e", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class slp0 {

    @NotNull
    public static final slp0 INSTANCE = new slp0();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m184833b(@NotNull InputStream stream) throws IOException {
        stream.getClass();
        slp0 slp0Var = INSTANCE;
        return (slp0Var.m184838e(stream) << 8) | slp0Var.m184838e(stream);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Pair<Integer, Integer> m184834f(@NotNull InputStream stream) {
        Pair<Integer, Integer> pairM184839g;
        stream.getClass();
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                slp0 slp0Var = INSTANCE;
                if (slp0Var.m184835a(bArr, "RIFF")) {
                    slp0Var.m184837d(stream);
                    stream.read(bArr);
                    if (slp0Var.m184835a(bArr, "WEBP")) {
                        stream.read(bArr);
                        String strM184836c = slp0Var.m184836c(bArr);
                        int iHashCode = strM184836c.hashCode();
                        if (iHashCode == 2640674) {
                            if (strM184836c.equals("VP8 ")) {
                                pairM184839g = slp0Var.m184839g(stream);
                                return pairM184839g;
                            }
                            return null;
                        }
                        if (iHashCode == 2640718) {
                            if (!strM184836c.equals("VP8L")) {
                                return null;
                            }
                            pairM184839g = slp0Var.m184840h(stream);
                            return pairM184839g;
                        }
                        if (iHashCode != 2640730 || !strM184836c.equals("VP8X")) {
                            return null;
                        }
                        pairM184839g = slp0Var.m184841i(stream);
                        try {
                            return pairM184839g;
                        } catch (IOException e) {
                            return pairM184839g;
                        }
                    }
                }
                try {
                    return null;
                } catch (IOException e2) {
                    return null;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m184835a(byte[] what, String with) {
        if (what.length != with.length()) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(what);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (((byte) with.charAt(iNextInt)) != what[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final String m184836c(byte[] header) {
        StringBuilder sb = new StringBuilder();
        for (byte b : header) {
            sb.append((char) (UShort.m87311b(b) & 65535));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m184837d(InputStream stream) throws IOException {
        int iM184838e = m184838e(stream);
        int iM184838e2 = m184838e(stream);
        return (m184838e(stream) << 24) | (m184838e(stream) << 16) | (iM184838e2 << 8) | iM184838e;
    }

    /* JADX INFO: renamed from: e */
    public final int m184838e(InputStream inputStream) throws IOException {
        return inputStream.read() & 255;
    }

    /* JADX INFO: renamed from: g */
    public final Pair<Integer, Integer> m184839g(InputStream stream) throws IOException {
        stream.skip(7L);
        int iM184838e = m184838e(stream);
        int iM184838e2 = m184838e(stream);
        int iM184838e3 = m184838e(stream);
        if (iM184838e == 157 && iM184838e2 == 1 && iM184838e3 == 42) {
            return new Pair<>(Integer.valueOf(m184833b(stream)), Integer.valueOf(m184833b(stream)));
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Pair<Integer, Integer> m184840h(InputStream stream) throws IOException {
        m184837d(stream);
        if (m184838e(stream) != 47) {
            return null;
        }
        int i = stream.read() & 255;
        int i2 = stream.read();
        return new Pair<>(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    /* JADX INFO: renamed from: i */
    public final Pair<Integer, Integer> m184841i(InputStream stream) throws IOException {
        stream.skip(8L);
        return new Pair<>(Integer.valueOf(m184842j(stream) + 1), Integer.valueOf(m184842j(stream) + 1));
    }

    /* JADX INFO: renamed from: j */
    public final int m184842j(InputStream stream) throws IOException {
        return (m184838e(stream) << 16) | (m184838e(stream) << 8) | m184838e(stream);
    }
}
