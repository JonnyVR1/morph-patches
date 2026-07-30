package p149l;

import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bzr0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static MessageDigest f78053b;

    /* JADX INFO: renamed from: a */
    public final Object f78054a = new Object();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final MessageDigest m104642a() {
        synchronized (this.f78054a) {
            MessageDigest messageDigest = f78053b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f78053b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f78053b;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo104643b(String str);
}
