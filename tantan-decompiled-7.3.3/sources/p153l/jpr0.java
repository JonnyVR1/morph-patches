package p153l;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class jpr0 {

    /* JADX INFO: renamed from: a */
    public static final Random f122131a = new Random();

    /* JADX INFO: renamed from: a */
    public static String m146518a() {
        byte[] bArr = new byte[16];
        f122131a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
