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
import p149l.dzd;
import p149l.ewa0;
import p149l.wze;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public class C0548d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2517a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f2518b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: A */
    public static void m3258A(@NonNull byte[] bArr, int i, int i2, @NonNull dzd dzdVar) {
        int iM3287m = m3287m(i, i2, dzdVar.f88473g);
        int i3 = iM3287m / 8;
        bArr[i3] = (byte) ((1 << (iM3287m % 8)) | bArr[i3]);
    }

    /* JADX INFO: renamed from: B */
    public static void m3259B(@NonNull InputStream inputStream) throws IOException {
        wze.m206259h(inputStream);
        int iM206261j = wze.m206261j(inputStream);
        if (iM206261j == 6 || iM206261j == 7) {
            return;
        }
        while (iM206261j > 0) {
            wze.m206261j(inputStream);
            for (int iM206261j2 = wze.m206261j(inputStream); iM206261j2 > 0; iM206261j2--) {
                wze.m206259h(inputStream);
            }
            iM206261j--;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3260C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull dzd[] dzdVarArr) throws IOException {
        if (Arrays.equals(bArr, ewa0.f93476a)) {
            m3273P(outputStream, dzdVarArr);
            return true;
        }
        if (Arrays.equals(bArr, ewa0.f93477b)) {
            m3272O(outputStream, dzdVarArr);
            return true;
        }
        if (Arrays.equals(bArr, ewa0.f93479d)) {
            m3270M(outputStream, dzdVarArr);
            return true;
        }
        if (Arrays.equals(bArr, ewa0.f93478c)) {
            m3271N(outputStream, dzdVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, ewa0.f93480e)) {
            return false;
        }
        m3269L(outputStream, dzdVarArr);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static void m3261D(@NonNull OutputStream outputStream, @NonNull dzd dzdVar) throws IOException {
        int[] iArr = dzdVar.f88474h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            wze.m206267p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C0550f m3262E(@NonNull dzd[] dzdVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            wze.m206267p(byteArrayOutputStream, dzdVarArr.length);
            int i = 2;
            for (dzd dzdVar : dzdVarArr) {
                wze.m206268q(byteArrayOutputStream, dzdVar.f88469c);
                wze.m206268q(byteArrayOutputStream, dzdVar.f88470d);
                wze.m206268q(byteArrayOutputStream, dzdVar.f88473g);
                String strM3284j = m3284j(dzdVar.f88467a, dzdVar.f88468b, ewa0.f93476a);
                int iM206262k = wze.m206262k(strM3284j);
                wze.m206267p(byteArrayOutputStream, iM206262k);
                i = i + 14 + iM206262k;
                wze.m206265n(byteArrayOutputStream, strM3284j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C0550f c0550f = new C0550f(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c0550f;
            }
            throw wze.m206254c("Expected size " + i + ", does not match actual size " + byteArray.length);
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
    public static void m3263F(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f2517a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: G */
    public static void m3264G(@NonNull OutputStream outputStream, @NonNull dzd dzdVar) throws IOException {
        m3268K(outputStream, dzdVar);
        m3261D(outputStream, dzdVar);
        m3266I(outputStream, dzdVar);
    }

    /* JADX INFO: renamed from: H */
    public static void m3265H(@NonNull OutputStream outputStream, @NonNull dzd dzdVar, @NonNull String str) throws IOException {
        wze.m206267p(outputStream, wze.m206262k(str));
        wze.m206267p(outputStream, dzdVar.f88471e);
        wze.m206268q(outputStream, dzdVar.f88472f);
        wze.m206268q(outputStream, dzdVar.f88469c);
        wze.m206268q(outputStream, dzdVar.f88473g);
        wze.m206265n(outputStream, str);
    }

    /* JADX INFO: renamed from: I */
    public static void m3266I(@NonNull OutputStream outputStream, @NonNull dzd dzdVar) throws IOException {
        byte[] bArr = new byte[m3285k(dzdVar.f88473g)];
        for (Map.Entry<Integer, Integer> entry : dzdVar.f88475i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                m3258A(bArr, 2, iIntValue, dzdVar);
            }
            if ((iIntValue2 & 4) != 0) {
                m3258A(bArr, 4, iIntValue, dzdVar);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: J */
    public static void m3267J(@NonNull OutputStream outputStream, int i, @NonNull dzd dzdVar) throws IOException {
        byte[] bArr = new byte[m3286l(i, dzdVar.f88473g)];
        for (Map.Entry<Integer, Integer> entry : dzdVar.f88475i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (dzdVar.f88473g * i2) + iIntValue;
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
    public static void m3268K(@NonNull OutputStream outputStream, @NonNull dzd dzdVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : dzdVar.f88475i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                wze.m206267p(outputStream, iIntValue - i);
                wze.m206267p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m3269L(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        wze.m206267p(outputStream, dzdVarArr.length);
        for (dzd dzdVar : dzdVarArr) {
            String strM3284j = m3284j(dzdVar.f88467a, dzdVar.f88468b, ewa0.f93480e);
            wze.m206267p(outputStream, wze.m206262k(strM3284j));
            wze.m206267p(outputStream, dzdVar.f88475i.size());
            wze.m206267p(outputStream, dzdVar.f88474h.length);
            wze.m206268q(outputStream, dzdVar.f88469c);
            wze.m206265n(outputStream, strM3284j);
            Iterator<Integer> it = dzdVar.f88475i.keySet().iterator();
            while (it.hasNext()) {
                wze.m206267p(outputStream, it.next().intValue());
            }
            for (int i : dzdVar.f88474h) {
                wze.m206267p(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m3270M(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        wze.m206269r(outputStream, dzdVarArr.length);
        for (dzd dzdVar : dzdVarArr) {
            int size = dzdVar.f88475i.size() * 4;
            String strM3284j = m3284j(dzdVar.f88467a, dzdVar.f88468b, ewa0.f93479d);
            wze.m206267p(outputStream, wze.m206262k(strM3284j));
            wze.m206267p(outputStream, dzdVar.f88474h.length);
            wze.m206268q(outputStream, size);
            wze.m206268q(outputStream, dzdVar.f88469c);
            wze.m206265n(outputStream, strM3284j);
            Iterator<Integer> it = dzdVar.f88475i.keySet().iterator();
            while (it.hasNext()) {
                wze.m206267p(outputStream, it.next().intValue());
                wze.m206267p(outputStream, 0);
            }
            for (int i : dzdVar.f88474h) {
                wze.m206267p(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m3271N(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        byte[] bArrM3276b = m3276b(dzdVarArr, ewa0.f93478c);
        wze.m206269r(outputStream, dzdVarArr.length);
        wze.m206264m(outputStream, bArrM3276b);
    }

    /* JADX INFO: renamed from: O */
    public static void m3272O(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        byte[] bArrM3276b = m3276b(dzdVarArr, ewa0.f93477b);
        wze.m206269r(outputStream, dzdVarArr.length);
        wze.m206264m(outputStream, bArrM3276b);
    }

    /* JADX INFO: renamed from: P */
    public static void m3273P(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        m3274Q(outputStream, dzdVarArr);
    }

    /* JADX INFO: renamed from: Q */
    public static void m3274Q(@NonNull OutputStream outputStream, @NonNull dzd[] dzdVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m3262E(dzdVarArr));
        arrayList.add(m3277c(dzdVarArr));
        arrayList.add(m3278d(dzdVarArr));
        long length2 = ((long) ewa0.f93476a.length) + ((long) f2517a.length) + 4 + ((long) (arrayList.size() * 16));
        wze.m206268q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C0550f c0550f = (C0550f) arrayList.get(i);
            wze.m206268q(outputStream, c0550f.f2530a.getValue());
            wze.m206268q(outputStream, length2);
            boolean z = c0550f.f2533d;
            byte[] bArr = c0550f.f2532c;
            if (z) {
                long length3 = bArr.length;
                byte[] bArrM206253b = wze.m206253b(bArr);
                arrayList2.add(bArrM206253b);
                wze.m206268q(outputStream, bArrM206253b.length);
                wze.m206268q(outputStream, length3);
                length = bArrM206253b.length;
            } else {
                arrayList2.add(bArr);
                wze.m206268q(outputStream, c0550f.f2532c.length);
                wze.m206268q(outputStream, 0L);
                length = c0550f.f2532c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3275a(@NonNull dzd dzdVar) {
        Iterator<Map.Entry<Integer, Integer>> it = dzdVar.f88475i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static byte[] m3276b(@NonNull dzd[] dzdVarArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int iM206262k = 0;
        for (dzd dzdVar : dzdVarArr) {
            iM206262k += wze.m206262k(m3284j(dzdVar.f88467a, dzdVar.f88468b, bArr)) + 16 + (dzdVar.f88471e * 2) + dzdVar.f88472f + m3285k(dzdVar.f88473g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM206262k);
        if (Arrays.equals(bArr, ewa0.f93478c)) {
            int length = dzdVarArr.length;
            while (i < length) {
                dzd dzdVar2 = dzdVarArr[i];
                m3265H(byteArrayOutputStream, dzdVar2, m3284j(dzdVar2.f88467a, dzdVar2.f88468b, bArr));
                m3264G(byteArrayOutputStream, dzdVar2);
                i++;
            }
        } else {
            for (dzd dzdVar3 : dzdVarArr) {
                m3265H(byteArrayOutputStream, dzdVar3, m3284j(dzdVar3.f88467a, dzdVar3.f88468b, bArr));
            }
            int length2 = dzdVarArr.length;
            while (i < length2) {
                m3264G(byteArrayOutputStream, dzdVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM206262k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw wze.m206254c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM206262k);
    }

    /* JADX INFO: renamed from: c */
    public static C0550f m3277c(@NonNull dzd[] dzdVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dzdVarArr.length; i2++) {
            try {
                dzd dzdVar = dzdVarArr[i2];
                wze.m206267p(byteArrayOutputStream, i2);
                wze.m206267p(byteArrayOutputStream, dzdVar.f88471e);
                i = i + 4 + (dzdVar.f88471e * 2);
                m3261D(byteArrayOutputStream, dzdVar);
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
            C0550f c0550f = new C0550f(FileSectionType.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c0550f;
        }
        throw wze.m206254c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    public static C0550f m3278d(@NonNull dzd[] dzdVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < dzdVarArr.length; i2++) {
            try {
                dzd dzdVar = dzdVarArr[i2];
                int iM3275a = m3275a(dzdVar);
                byte[] bArrM3279e = m3279e(iM3275a, dzdVar);
                byte[] bArrM3280f = m3280f(dzdVar);
                wze.m206267p(byteArrayOutputStream, i2);
                int length = bArrM3279e.length + 2 + bArrM3280f.length;
                wze.m206268q(byteArrayOutputStream, length);
                wze.m206267p(byteArrayOutputStream, iM3275a);
                byteArrayOutputStream.write(bArrM3279e);
                byteArrayOutputStream.write(bArrM3280f);
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
            C0550f c0550f = new C0550f(FileSectionType.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c0550f;
        }
        throw wze.m206254c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m3279e(int i, @NonNull dzd dzdVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m3267J(byteArrayOutputStream, i, dzdVar);
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
    public static byte[] m3280f(@NonNull dzd dzdVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m3268K(byteArrayOutputStream, dzdVar);
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
    public static String m3281g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static String m3282h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static dzd m3283i(@NonNull dzd[] dzdVarArr, @NonNull String str) {
        if (dzdVarArr.length <= 0) {
            return null;
        }
        String strM3282h = m3282h(str);
        for (int i = 0; i < dzdVarArr.length; i++) {
            if (dzdVarArr[i].f88468b.equals(strM3282h)) {
                return dzdVarArr[i];
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m3284j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strM118461a = ewa0.m118461a(bArr);
        if (str.length() <= 0) {
            return m3281g(str2, strM118461a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m3281g(str2, strM118461a);
        }
        if (str2.endsWith(ShareConstants.PATCH_SUFFIX)) {
            return str2;
        }
        return str + ewa0.m118461a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    public static int m3285k(int i) {
        return m3300z(i * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m3286l(int i, int i2) {
        return m3300z(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m3287m(int i, int i2, int i3) {
        if (i == 1) {
            throw wze.m206254c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw wze.m206254c("Unexpected flag: " + i);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m3288n(@NonNull InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iM206259h = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM206259h += wze.m206259h(inputStream);
            iArr[i2] = iM206259h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static int m3289o(@NonNull BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m3287m(2, i, i2)) ? 2 : 0;
        return bitSet.get(m3287m(4, i, i2)) ? i3 | 4 : i3;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m3290p(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, wze.m206255d(inputStream, bArr.length))) {
            return wze.m206255d(inputStream, ewa0.f93477b.length);
        }
        throw wze.m206254c("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    public static void m3291q(@NonNull InputStream inputStream, @NonNull dzd dzdVar) throws IOException {
        int iAvailable = inputStream.available() - dzdVar.f88472f;
        int iM206259h = 0;
        while (inputStream.available() > iAvailable) {
            iM206259h += wze.m206259h(inputStream);
            dzdVar.f88475i.put(Integer.valueOf(iM206259h), 1);
            for (int iM206259h2 = wze.m206259h(inputStream); iM206259h2 > 0; iM206259h2--) {
                m3259B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw wze.m206254c("Read too much data during profile line parse");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static dzd[] m3292r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, dzd[] dzdVarArr) throws IOException {
        if (Arrays.equals(bArr, ewa0.f93481f)) {
            if (Arrays.equals(ewa0.f93476a, bArr2)) {
                throw wze.m206254c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m3293s(inputStream, bArr, dzdVarArr);
        }
        if (Arrays.equals(bArr, ewa0.f93482g)) {
            return m3295u(inputStream, bArr2, dzdVarArr);
        }
        throw wze.m206254c("Unsupported meta version");
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static dzd[] m3293s(@NonNull InputStream inputStream, @NonNull byte[] bArr, dzd[] dzdVarArr) throws IOException {
        if (!Arrays.equals(bArr, ewa0.f93481f)) {
            throw wze.m206254c("Unsupported meta version");
        }
        int iM206261j = wze.m206261j(inputStream);
        byte[] bArrM206256e = wze.m206256e(inputStream, (int) wze.m206260i(inputStream), (int) wze.m206260i(inputStream));
        if (inputStream.read() > 0) {
            throw wze.m206254c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM206256e);
        try {
            dzd[] dzdVarArrM3294t = m3294t(byteArrayInputStream, iM206261j, dzdVarArr);
            byteArrayInputStream.close();
            return dzdVarArrM3294t;
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
    public static dzd[] m3294t(@NonNull InputStream inputStream, int i, dzd[] dzdVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new dzd[0];
        }
        if (i != dzdVarArr.length) {
            throw wze.m206254c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM206259h = wze.m206259h(inputStream);
            iArr[i2] = wze.m206259h(inputStream);
            strArr[i2] = wze.m206257f(inputStream, iM206259h);
        }
        for (int i3 = 0; i3 < i; i3++) {
            dzd dzdVar = dzdVarArr[i3];
            if (!dzdVar.f88468b.equals(strArr[i3])) {
                throw wze.m206254c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            dzdVar.f88471e = i4;
            dzdVar.f88474h = m3288n(inputStream, i4);
        }
        return dzdVarArr;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static dzd[] m3295u(@NonNull InputStream inputStream, @NonNull byte[] bArr, dzd[] dzdVarArr) throws IOException {
        int iM206259h = wze.m206259h(inputStream);
        byte[] bArrM206256e = wze.m206256e(inputStream, (int) wze.m206260i(inputStream), (int) wze.m206260i(inputStream));
        if (inputStream.read() > 0) {
            throw wze.m206254c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM206256e);
        try {
            dzd[] dzdVarArrM3296v = m3296v(byteArrayInputStream, bArr, iM206259h, dzdVarArr);
            byteArrayInputStream.close();
            return dzdVarArrM3296v;
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
    public static dzd[] m3296v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, dzd[] dzdVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new dzd[0];
        }
        if (i != dzdVarArr.length) {
            throw wze.m206254c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            wze.m206259h(inputStream);
            String strM206257f = wze.m206257f(inputStream, wze.m206259h(inputStream));
            long jM206260i = wze.m206260i(inputStream);
            int iM206259h = wze.m206259h(inputStream);
            dzd dzdVarM3283i = m3283i(dzdVarArr, strM206257f);
            if (dzdVarM3283i == null) {
                throw wze.m206254c("Missing profile key: " + strM206257f);
            }
            dzdVarM3283i.f88470d = jM206260i;
            int[] iArrM3288n = m3288n(inputStream, iM206259h);
            if (Arrays.equals(bArr, ewa0.f93480e)) {
                dzdVarM3283i.f88471e = iM206259h;
                dzdVarM3283i.f88474h = iArrM3288n;
            }
        }
        return dzdVarArr;
    }

    /* JADX INFO: renamed from: w */
    public static void m3297w(@NonNull InputStream inputStream, @NonNull dzd dzdVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(wze.m206255d(inputStream, wze.m206252a(dzdVar.f88473g * 2)));
        int i = 0;
        while (true) {
            int i2 = dzdVar.f88473g;
            if (i >= i2) {
                return;
            }
            int iM3289o = m3289o(bitSetValueOf, i, i2);
            if (iM3289o != 0) {
                Integer num = dzdVar.f88475i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                dzdVar.f88475i.put(Integer.valueOf(i), Integer.valueOf(iM3289o | num.intValue()));
            }
            i++;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static dzd[] m3298x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, ewa0.f93477b)) {
            throw wze.m206254c("Unsupported version");
        }
        int iM206261j = wze.m206261j(inputStream);
        byte[] bArrM206256e = wze.m206256e(inputStream, (int) wze.m206260i(inputStream), (int) wze.m206260i(inputStream));
        if (inputStream.read() > 0) {
            throw wze.m206254c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM206256e);
        try {
            dzd[] dzdVarArrM3299y = m3299y(byteArrayInputStream, str, iM206261j);
            byteArrayInputStream.close();
            return dzdVarArrM3299y;
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
    public static dzd[] m3299y(@NonNull InputStream inputStream, @NonNull String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new dzd[0];
        }
        dzd[] dzdVarArr = new dzd[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM206259h = wze.m206259h(inputStream);
            int iM206259h2 = wze.m206259h(inputStream);
            dzdVarArr[i2] = new dzd(str, wze.m206257f(inputStream, iM206259h), wze.m206260i(inputStream), 0L, iM206259h2, (int) wze.m206260i(inputStream), (int) wze.m206260i(inputStream), new int[iM206259h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            dzd dzdVar = dzdVarArr[i3];
            m3291q(inputStream, dzdVar);
            dzdVar.f88474h = m3288n(inputStream, dzdVar.f88471e);
            m3297w(inputStream, dzdVar);
        }
        return dzdVarArr;
    }

    /* JADX INFO: renamed from: z */
    public static int m3300z(int i) {
        return (i + 7) & (-8);
    }
}
