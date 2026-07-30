package p153l;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface kzq {

    /* JADX INFO: renamed from: a */
    public static final Charset f129442a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    void mo5434a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
