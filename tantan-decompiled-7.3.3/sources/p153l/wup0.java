package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m88121d2 = {"Ll/wup0;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "f", "(Ljava/io/InputStream;)Lkotlin/Pair;", "b", "(Ljava/io/InputStream;)I", "g", "h", RXScreenCaptureService.KEY_INDEX, "", "what", "", "with", "", "a", "([BLjava/lang/String;)Z", "header", "c", "([B)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "j", "e", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wup0 {

    @NotNull
    public static final wup0 INSTANCE = new wup0();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m207962b(@NotNull InputStream stream) throws IOException {
        stream.getClass();
        wup0 wup0Var = INSTANCE;
        return (wup0Var.m207967e(stream) << 8) | wup0Var.m207967e(stream);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Pair<Integer, Integer> m207963f(@NotNull InputStream stream) {
        Pair<Integer, Integer> pairM207968g;
        stream.getClass();
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                wup0 wup0Var = INSTANCE;
                if (wup0Var.m207964a(bArr, "RIFF")) {
                    wup0Var.m207966d(stream);
                    stream.read(bArr);
                    if (wup0Var.m207964a(bArr, "WEBP")) {
                        stream.read(bArr);
                        String strM207965c = wup0Var.m207965c(bArr);
                        int iHashCode = strM207965c.hashCode();
                        if (iHashCode == 2640674) {
                            if (strM207965c.equals("VP8 ")) {
                                pairM207968g = wup0Var.m207968g(stream);
                                return pairM207968g;
                            }
                            return null;
                        }
                        if (iHashCode == 2640718) {
                            if (!strM207965c.equals("VP8L")) {
                                return null;
                            }
                            pairM207968g = wup0Var.m207969h(stream);
                            return pairM207968g;
                        }
                        if (iHashCode != 2640730 || !strM207965c.equals("VP8X")) {
                            return null;
                        }
                        pairM207968g = wup0Var.m207970i(stream);
                        try {
                            return pairM207968g;
                        } catch (IOException e) {
                            return pairM207968g;
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
    public final boolean m207964a(byte[] what, String with) {
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
    public final String m207965c(byte[] header) {
        StringBuilder sb = new StringBuilder();
        for (byte b : header) {
            sb.append((char) (UShort.m88200b(b) & 65535));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m207966d(InputStream stream) throws IOException {
        int iM207967e = m207967e(stream);
        int iM207967e2 = m207967e(stream);
        return (m207967e(stream) << 24) | (m207967e(stream) << 16) | (iM207967e2 << 8) | iM207967e;
    }

    /* JADX INFO: renamed from: e */
    public final int m207967e(InputStream inputStream) throws IOException {
        return inputStream.read() & 255;
    }

    /* JADX INFO: renamed from: g */
    public final Pair<Integer, Integer> m207968g(InputStream stream) throws IOException {
        stream.skip(7L);
        int iM207967e = m207967e(stream);
        int iM207967e2 = m207967e(stream);
        int iM207967e3 = m207967e(stream);
        if (iM207967e == 157 && iM207967e2 == 1 && iM207967e3 == 42) {
            return new Pair<>(Integer.valueOf(m207962b(stream)), Integer.valueOf(m207962b(stream)));
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Pair<Integer, Integer> m207969h(InputStream stream) throws IOException {
        m207966d(stream);
        if (m207967e(stream) != 47) {
            return null;
        }
        int i = stream.read() & 255;
        int i2 = stream.read();
        return new Pair<>(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    /* JADX INFO: renamed from: i */
    public final Pair<Integer, Integer> m207970i(InputStream stream) throws IOException {
        stream.skip(8L);
        return new Pair<>(Integer.valueOf(m207971j(stream) + 1), Integer.valueOf(m207971j(stream) + 1));
    }

    /* JADX INFO: renamed from: j */
    public final int m207971j(InputStream stream) throws IOException {
        return (m207967e(stream) << 16) | (m207967e(stream) << 8) | m207967e(stream);
    }
}
