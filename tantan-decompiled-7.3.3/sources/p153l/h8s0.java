package p153l;

import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h8s0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static MessageDigest f108262b;

    /* JADX INFO: renamed from: a */
    public final Object f108263a = new Object();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final MessageDigest m133953a() {
        synchronized (this.f108263a) {
            MessageDigest messageDigest = f108262b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f108262b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f108262b;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo133954b(String str);
}
