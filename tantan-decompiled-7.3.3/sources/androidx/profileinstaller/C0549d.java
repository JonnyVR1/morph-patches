package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p153l.a1f;
import p153l.i4b0;
import p153l.r0e;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public class C0549d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2517a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f2518b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: A */
    public static void m3259A(@NonNull byte[] bArr, int i, int i2, @NonNull r0e r0eVar) {
        int iM3288m = m3288m(i, i2, r0eVar.f160614g);
        int i3 = iM3288m / 8;
        bArr[i3] = (byte) ((1 << (iM3288m % 8)) | bArr[i3]);
    }

    /* JADX INFO: renamed from: B */
    public static void m3260B(@NonNull InputStream inputStream) throws IOException {
        a1f.m95491h(inputStream);
        int iM95493j = a1f.m95493j(inputStream);
        if (iM95493j == 6 || iM95493j == 7) {
            return;
        }
        while (iM95493j > 0) {
            a1f.m95493j(inputStream);
            for (int iM95493j2 = a1f.m95493j(inputStream); iM95493j2 > 0; iM95493j2--) {
                a1f.m95491h(inputStream);
            }
            iM95493j--;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3261C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull r0e[] r0eVarArr) throws IOException {
        if (Arrays.equals(bArr, i4b0.f112865a)) {
            m3274P(outputStream, r0eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i4b0.f112866b)) {
            m3273O(outputStream, r0eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i4b0.f112868d)) {
            m3271M(outputStream, r0eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i4b0.f112867c)) {
            m3272N(outputStream, r0eVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i4b0.f112869e)) {
            return false;
        }
        m3270L(outputStream, r0eVarArr);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static void m3262D(@NonNull OutputStream outputStream, @NonNull r0e r0eVar) throws IOException {
        int[] iArr = r0eVar.f160615h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            a1f.m95499p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C0551f m3263E(@NonNull r0e[] r0eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a1f.m95499p(byteArrayOutputStream, r0eVarArr.length);
            int i = 2;
            for (r0e r0eVar : r0eVarArr) {
                a1f.m95500q(byteArrayOutputStream, r0eVar.f160610c);
                a1f.m95500q(byteArrayOutputStream, r0eVar.f160611d);
                a1f.m95500q(byteArrayOutputStream, r0eVar.f160614g);
                String strM3285j = m3285j(r0eVar.f160608a, r0eVar.f160609b, i4b0.f112865a);
                int iM95494k = a1f.m95494k(strM3285j);
                a1f.m95499p(byteArrayOutputStream, iM95494k);
                i = i + 14 + iM95494k;
                a1f.m95497n(byteArrayOutputStream, strM3285j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C0551f c0551f = new C0551f(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c0551f;
            }
            throw a1f.m95486c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m3264F(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f2517a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: G */
    public static void m3265G(@NonNull OutputStream outputStream, @NonNull r0e r0eVar) throws IOException {
        m3269K(outputStream, r0eVar);
        m3262D(outputStream, r0eVar);
        m3267I(outputStream, r0eVar);
    }

    /* JADX INFO: renamed from: H */
    public static void m3266H(@NonNull OutputStream outputStream, @NonNull r0e r0eVar, @NonNull String str) throws IOException {
        a1f.m95499p(outputStream, a1f.m95494k(str));
        a1f.m95499p(outputStream, r0eVar.f160612e);
        a1f.m95500q(outputStream, r0eVar.f160613f);
        a1f.m95500q(outputStream, r0eVar.f160610c);
        a1f.m95500q(outputStream, r0eVar.f160614g);
        a1f.m95497n(outputStream, str);
    }

    /* JADX INFO: renamed from: I */
    public static void m3267I(@NonNull OutputStream outputStream, @NonNull r0e r0eVar) throws IOException {
        byte[] bArr = new byte[m3286k(r0eVar.f160614g)];
        for (Map.Entry<Integer, Integer> entry : r0eVar.f160616i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                m3259A(bArr, 2, iIntValue, r0eVar);
            }
            if ((iIntValue2 & 4) != 0) {
                m3259A(bArr, 4, iIntValue, r0eVar);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: J */
    public static void m3268J(@NonNull OutputStream outputStream, int i, @NonNull r0e r0eVar) throws IOException {
        byte[] bArr = new byte[m3287l(i, r0eVar.f160614g)];
        for (Map.Entry<Integer, Integer> entry : r0eVar.f160616i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (r0eVar.f160614g * i2) + iIntValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: K */
    public static void m3269K(@NonNull OutputStream outputStream, @NonNull r0e r0eVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : r0eVar.f160616i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                a1f.m95499p(outputStream, iIntValue - i);
                a1f.m95499p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m3270L(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        a1f.m95499p(outputStream, r0eVarArr.length);
        for (r0e r0eVar : r0eVarArr) {
            String strM3285j = m3285j(r0eVar.f160608a, r0eVar.f160609b, i4b0.f112869e);
            a1f.m95499p(outputStream, a1f.m95494k(strM3285j));
            a1f.m95499p(outputStream, r0eVar.f160616i.size());
            a1f.m95499p(outputStream, r0eVar.f160615h.length);
            a1f.m95500q(outputStream, r0eVar.f160610c);
            a1f.m95497n(outputStream, strM3285j);
            Iterator<Integer> it = r0eVar.f160616i.keySet().iterator();
            while (it.hasNext()) {
                a1f.m95499p(outputStream, it.next().intValue());
            }
            for (int i : r0eVar.f160615h) {
                a1f.m95499p(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m3271M(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        a1f.m95501r(outputStream, r0eVarArr.length);
        for (r0e r0eVar : r0eVarArr) {
            int size = r0eVar.f160616i.size() * 4;
            String strM3285j = m3285j(r0eVar.f160608a, r0eVar.f160609b, i4b0.f112868d);
            a1f.m95499p(outputStream, a1f.m95494k(strM3285j));
            a1f.m95499p(outputStream, r0eVar.f160615h.length);
            a1f.m95500q(outputStream, size);
            a1f.m95500q(outputStream, r0eVar.f160610c);
            a1f.m95497n(outputStream, strM3285j);
            Iterator<Integer> it = r0eVar.f160616i.keySet().iterator();
            while (it.hasNext()) {
                a1f.m95499p(outputStream, it.next().intValue());
                a1f.m95499p(outputStream, 0);
            }
            for (int i : r0eVar.f160615h) {
                a1f.m95499p(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m3272N(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        byte[] bArrM3277b = m3277b(r0eVarArr, i4b0.f112867c);
        a1f.m95501r(outputStream, r0eVarArr.length);
        a1f.m95496m(outputStream, bArrM3277b);
    }

    /* JADX INFO: renamed from: O */
    public static void m3273O(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        byte[] bArrM3277b = m3277b(r0eVarArr, i4b0.f112866b);
        a1f.m95501r(outputStream, r0eVarArr.length);
        a1f.m95496m(outputStream, bArrM3277b);
    }

    /* JADX INFO: renamed from: P */
    public static void m3274P(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        m3275Q(outputStream, r0eVarArr);
    }

    /* JADX INFO: renamed from: Q */
    public static void m3275Q(@NonNull OutputStream outputStream, @NonNull r0e[] r0eVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m3263E(r0eVarArr));
        arrayList.add(m3278c(r0eVarArr));
        arrayList.add(m3279d(r0eVarArr));
        long length2 = ((long) i4b0.f112865a.length) + ((long) f2517a.length) + 4 + ((long) (arrayList.size() * 16));
        a1f.m95500q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C0551f c0551f = (C0551f) arrayList.get(i);
            a1f.m95500q(outputStream, c0551f.f2530a.getValue());
            a1f.m95500q(outputStream, length2);
            boolean z = c0551f.f2533d;
            byte[] bArr = c0551f.f2532c;
            if (z) {
                long length3 = bArr.length;
                byte[] bArrM95485b = a1f.m95485b(bArr);
                arrayList2.add(bArrM95485b);
                a1f.m95500q(outputStream, bArrM95485b.length);
                a1f.m95500q(outputStream, length3);
                length = bArrM95485b.length;
            } else {
                arrayList2.add(bArr);
                a1f.m95500q(outputStream, c0551f.f2532c.length);
                a1f.m95500q(outputStream, 0L);
                length = c0551f.f2532c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3276a(@NonNull r0e r0eVar) {
        Iterator<Map.Entry<Integer, Integer>> it = r0eVar.f160616i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static byte[] m3277b(@NonNull r0e[] r0eVarArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int iM95494k = 0;
        for (r0e r0eVar : r0eVarArr) {
            iM95494k += a1f.m95494k(m3285j(r0eVar.f160608a, r0eVar.f160609b, bArr)) + 16 + (r0eVar.f160612e * 2) + r0eVar.f160613f + m3286k(r0eVar.f160614g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM95494k);
        if (Arrays.equals(bArr, i4b0.f112867c)) {
            int length = r0eVarArr.length;
            while (i < length) {
                r0e r0eVar2 = r0eVarArr[i];
                m3266H(byteArrayOutputStream, r0eVar2, m3285j(r0eVar2.f160608a, r0eVar2.f160609b, bArr));
                m3265G(byteArrayOutputStream, r0eVar2);
                i++;
            }
        } else {
            for (r0e r0eVar3 : r0eVarArr) {
                m3266H(byteArrayOutputStream, r0eVar3, m3285j(r0eVar3.f160608a, r0eVar3.f160609b, bArr));
            }
            int length2 = r0eVarArr.length;
            while (i < length2) {
                m3265G(byteArrayOutputStream, r0eVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM95494k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw a1f.m95486c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM95494k);
    }

    /* JADX INFO: renamed from: c */
    public static C0551f m3278c(@NonNull r0e[] r0eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < r0eVarArr.length; i2++) {
            try {
                r0e r0eVar = r0eVarArr[i2];
                a1f.m95499p(byteArrayOutputStream, i2);
                a1f.m95499p(byteArrayOutputStream, r0eVar.f160612e);
                i = i + 4 + (r0eVar.f160612e * 2);
                m3262D(byteArrayOutputStream, r0eVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C0551f c0551f = new C0551f(FileSectionType.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c0551f;
        }
        throw a1f.m95486c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    public static C0551f m3279d(@NonNull r0e[] r0eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < r0eVarArr.length; i2++) {
            try {
                r0e r0eVar = r0eVarArr[i2];
                int iM3276a = m3276a(r0eVar);
                byte[] bArrM3280e = m3280e(iM3276a, r0eVar);
                byte[] bArrM3281f = m3281f(r0eVar);
                a1f.m95499p(byteArrayOutputStream, i2);
                int length = bArrM3280e.length + 2 + bArrM3281f.length;
                a1f.m95500q(byteArrayOutputStream, length);
                a1f.m95499p(byteArrayOutputStream, iM3276a);
                byteArrayOutputStream.write(bArrM3280e);
                byteArrayOutputStream.write(bArrM3281f);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C0551f c0551f = new C0551f(FileSectionType.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c0551f;
        }
        throw a1f.m95486c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m3280e(int i, @NonNull r0e r0eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m3268J(byteArrayOutputStream, i, r0eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m3281f(@NonNull r0e r0eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m3269K(byteArrayOutputStream, r0eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static String m3282g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static String m3283h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static r0e m3284i(@NonNull r0e[] r0eVarArr, @NonNull String str) {
        if (r0eVarArr.length <= 0) {
            return null;
        }
        String strM3283h = m3283h(str);
        for (int i = 0; i < r0eVarArr.length; i++) {
            if (r0eVarArr[i].f160609b.equals(strM3283h)) {
                return r0eVarArr[i];
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m3285j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strM138413a = i4b0.m138413a(bArr);
        if (str.length() <= 0) {
            return m3282g(str2, strM138413a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m3282g(str2, strM138413a);
        }
        if (str2.endsWith(ShareConstants.PATCH_SUFFIX)) {
            return str2;
        }
        return str + i4b0.m138413a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    public static int m3286k(int i) {
        return m3301z(i * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m3287l(int i, int i2) {
        return m3301z(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m3288m(int i, int i2, int i3) {
        if (i == 1) {
            throw a1f.m95486c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw a1f.m95486c("Unexpected flag: " + i);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m3289n(@NonNull InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iM95491h = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM95491h += a1f.m95491h(inputStream);
            iArr[i2] = iM95491h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static int m3290o(@NonNull BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m3288m(2, i, i2)) ? 2 : 0;
        return bitSet.get(m3288m(4, i, i2)) ? i3 | 4 : i3;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m3291p(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, a1f.m95487d(inputStream, bArr.length))) {
            return a1f.m95487d(inputStream, i4b0.f112866b.length);
        }
        throw a1f.m95486c("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    public static void m3292q(@NonNull InputStream inputStream, @NonNull r0e r0eVar) throws IOException {
        int iAvailable = inputStream.available() - r0eVar.f160613f;
        int iM95491h = 0;
        while (inputStream.available() > iAvailable) {
            iM95491h += a1f.m95491h(inputStream);
            r0eVar.f160616i.put(Integer.valueOf(iM95491h), 1);
            for (int iM95491h2 = a1f.m95491h(inputStream); iM95491h2 > 0; iM95491h2--) {
                m3260B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw a1f.m95486c("Read too much data during profile line parse");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static r0e[] m3293r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, r0e[] r0eVarArr) throws IOException {
        if (Arrays.equals(bArr, i4b0.f112870f)) {
            if (Arrays.equals(i4b0.f112865a, bArr2)) {
                throw a1f.m95486c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m3294s(inputStream, bArr, r0eVarArr);
        }
        if (Arrays.equals(bArr, i4b0.f112871g)) {
            return m3296u(inputStream, bArr2, r0eVarArr);
        }
        throw a1f.m95486c("Unsupported meta version");
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static r0e[] m3294s(@NonNull InputStream inputStream, @NonNull byte[] bArr, r0e[] r0eVarArr) throws IOException {
        if (!Arrays.equals(bArr, i4b0.f112870f)) {
            throw a1f.m95486c("Unsupported meta version");
        }
        int iM95493j = a1f.m95493j(inputStream);
        byte[] bArrM95488e = a1f.m95488e(inputStream, (int) a1f.m95492i(inputStream), (int) a1f.m95492i(inputStream));
        if (inputStream.read() > 0) {
            throw a1f.m95486c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM95488e);
        try {
            r0e[] r0eVarArrM3295t = m3295t(byteArrayInputStream, iM95493j, r0eVarArr);
            byteArrayInputStream.close();
            return r0eVarArrM3295t;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static r0e[] m3295t(@NonNull InputStream inputStream, int i, r0e[] r0eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new r0e[0];
        }
        if (i != r0eVarArr.length) {
            throw a1f.m95486c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM95491h = a1f.m95491h(inputStream);
            iArr[i2] = a1f.m95491h(inputStream);
            strArr[i2] = a1f.m95489f(inputStream, iM95491h);
        }
        for (int i3 = 0; i3 < i; i3++) {
            r0e r0eVar = r0eVarArr[i3];
            if (!r0eVar.f160609b.equals(strArr[i3])) {
                throw a1f.m95486c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            r0eVar.f160612e = i4;
            r0eVar.f160615h = m3289n(inputStream, i4);
        }
        return r0eVarArr;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static r0e[] m3296u(@NonNull InputStream inputStream, @NonNull byte[] bArr, r0e[] r0eVarArr) throws IOException {
        int iM95491h = a1f.m95491h(inputStream);
        byte[] bArrM95488e = a1f.m95488e(inputStream, (int) a1f.m95492i(inputStream), (int) a1f.m95492i(inputStream));
        if (inputStream.read() > 0) {
            throw a1f.m95486c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM95488e);
        try {
            r0e[] r0eVarArrM3297v = m3297v(byteArrayInputStream, bArr, iM95491h, r0eVarArr);
            byteArrayInputStream.close();
            return r0eVarArrM3297v;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static r0e[] m3297v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, r0e[] r0eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new r0e[0];
        }
        if (i != r0eVarArr.length) {
            throw a1f.m95486c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            a1f.m95491h(inputStream);
            String strM95489f = a1f.m95489f(inputStream, a1f.m95491h(inputStream));
            long jM95492i = a1f.m95492i(inputStream);
            int iM95491h = a1f.m95491h(inputStream);
            r0e r0eVarM3284i = m3284i(r0eVarArr, strM95489f);
            if (r0eVarM3284i == null) {
                throw a1f.m95486c("Missing profile key: " + strM95489f);
            }
            r0eVarM3284i.f160611d = jM95492i;
            int[] iArrM3289n = m3289n(inputStream, iM95491h);
            if (Arrays.equals(bArr, i4b0.f112869e)) {
                r0eVarM3284i.f160612e = iM95491h;
                r0eVarM3284i.f160615h = iArrM3289n;
            }
        }
        return r0eVarArr;
    }

    /* JADX INFO: renamed from: w */
    public static void m3298w(@NonNull InputStream inputStream, @NonNull r0e r0eVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(a1f.m95487d(inputStream, a1f.m95484a(r0eVar.f160614g * 2)));
        int i = 0;
        while (true) {
            int i2 = r0eVar.f160614g;
            if (i >= i2) {
                return;
            }
            int iM3290o = m3290o(bitSetValueOf, i, i2);
            if (iM3290o != 0) {
                Integer num = r0eVar.f160616i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                r0eVar.f160616i.put(Integer.valueOf(i), Integer.valueOf(iM3290o | num.intValue()));
            }
            i++;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static r0e[] m3299x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, i4b0.f112866b)) {
            throw a1f.m95486c("Unsupported version");
        }
        int iM95493j = a1f.m95493j(inputStream);
        byte[] bArrM95488e = a1f.m95488e(inputStream, (int) a1f.m95492i(inputStream), (int) a1f.m95492i(inputStream));
        if (inputStream.read() > 0) {
            throw a1f.m95486c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM95488e);
        try {
            r0e[] r0eVarArrM3300y = m3300y(byteArrayInputStream, str, iM95493j);
            byteArrayInputStream.close();
            return r0eVarArrM3300y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public static r0e[] m3300y(@NonNull InputStream inputStream, @NonNull String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new r0e[0];
        }
        r0e[] r0eVarArr = new r0e[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM95491h = a1f.m95491h(inputStream);
            int iM95491h2 = a1f.m95491h(inputStream);
            r0eVarArr[i2] = new r0e(str, a1f.m95489f(inputStream, iM95491h), a1f.m95492i(inputStream), 0L, iM95491h2, (int) a1f.m95492i(inputStream), (int) a1f.m95492i(inputStream), new int[iM95491h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            r0e r0eVar = r0eVarArr[i3];
            m3292q(inputStream, r0eVar);
            r0eVar.f160615h = m3289n(inputStream, r0eVar.f160612e);
            m3298w(inputStream, r0eVar);
        }
        return r0eVarArr;
    }

    /* JADX INFO: renamed from: z */
    public static int m3301z(int i) {
        return (i + 7) & (-8);
    }
}
