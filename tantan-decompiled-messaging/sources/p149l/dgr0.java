package p149l;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class dgr0 {

    /* JADX INFO: renamed from: a */
    public static final Random f86162a = new Random();

    /* JADX INFO: renamed from: a */
    public static String m111734a() {
        byte[] bArr = new byte[16];
        f86162a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
