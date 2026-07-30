package p153l;

import android.text.TextUtils;
import android.util.Pair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public class smf0 {

    /* JADX INFO: renamed from: l.smf0$a */
    public class C20106a implements Comparator<Pair<String, String>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, String> pair, Pair<String, String> pair2) {
            return ((String) pair.first).compareTo((String) pair2.first);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m186809a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: b */
    private static int m186810b(int i, int i2) {
        return i + ((int) (Math.random() * ((double) ((i2 - i) + 1))));
    }

    /* JADX INFO: renamed from: c */
    private static String m186811c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) ((Math.abs((int) b) % 26) + 65));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m186812d() {
        byte[] bArr = new byte[m186810b(8, 16)];
        new Random().nextBytes(bArr);
        return m186811c(bArr);
    }

    /* JADX INFO: renamed from: e */
    public static String m186813e(List<Pair<String, String>> list) {
        if (ue5.m195655a(list)) {
            return "";
        }
        Collections.sort(list, new C20106a());
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            if (!TextUtils.isEmpty((CharSequence) pair.second)) {
                sb.append((String) pair.first);
                sb.append("=");
                sb.append((String) pair.second);
                sb.append("&");
            }
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        return m186814f(sb.toString()).toLowerCase();
    }

    /* JADX INFO: renamed from: f */
    private static String m186814f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m186809a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }
}
