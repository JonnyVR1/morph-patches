package p153l;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t0j {

    /* JADX INFO: renamed from: a */
    public final String f171530a;

    /* JADX INFO: renamed from: b */
    public final String f171531b;

    /* JADX INFO: renamed from: c */
    public final String f171532c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f171533d;

    /* JADX INFO: renamed from: e */
    public final int f171534e;

    /* JADX INFO: renamed from: f */
    public final String f171535f;

    public t0j(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.f171530a = (String) yn80.m216775e(str);
        this.f171531b = (String) yn80.m216775e(str2);
        this.f171532c = (String) yn80.m216775e(str3);
        this.f171533d = null;
        yn80.m216771a(i != 0);
        this.f171534e = i;
        this.f171535f = m188773a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m188773a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<List<byte[]>> m188774b() {
        return this.f171533d;
    }

    @ArrayRes
    /* JADX INFO: renamed from: c */
    public int m188775c() {
        return this.f171534e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public String m188776d() {
        return this.f171535f;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m188777e() {
        return this.f171530a;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public String m188778f() {
        return this.f171531b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m188779g() {
        return this.f171532c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f171530a + ", mProviderPackage: " + this.f171531b + ", mQuery: " + this.f171532c + ", mCertificates:");
        for (int i = 0; i < this.f171533d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f171533d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f171534e);
        return sb.toString();
    }

    public t0j(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f171530a = (String) yn80.m216775e(str);
        this.f171531b = (String) yn80.m216775e(str2);
        this.f171532c = (String) yn80.m216775e(str3);
        this.f171533d = (List) yn80.m216775e(list);
        this.f171534e = 0;
        this.f171535f = m188773a(str, str2, str3);
    }
}
