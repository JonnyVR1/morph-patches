package p149l;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xxi {

    /* JADX INFO: renamed from: a */
    public final String f194866a;

    /* JADX INFO: renamed from: b */
    public final String f194867b;

    /* JADX INFO: renamed from: c */
    public final String f194868c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f194869d;

    /* JADX INFO: renamed from: e */
    public final int f194870e;

    /* JADX INFO: renamed from: f */
    public final String f194871f;

    public xxi(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.f194866a = (String) tf80.m188658e(str);
        this.f194867b = (String) tf80.m188658e(str2);
        this.f194868c = (String) tf80.m188658e(str3);
        this.f194869d = null;
        tf80.m188654a(i != 0);
        this.f194870e = i;
        this.f194871f = m211490a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m211490a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<List<byte[]>> m211491b() {
        return this.f194869d;
    }

    @ArrayRes
    /* JADX INFO: renamed from: c */
    public int m211492c() {
        return this.f194870e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public String m211493d() {
        return this.f194871f;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m211494e() {
        return this.f194866a;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public String m211495f() {
        return this.f194867b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m211496g() {
        return this.f194868c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f194866a + ", mProviderPackage: " + this.f194867b + ", mQuery: " + this.f194868c + ", mCertificates:");
        for (int i = 0; i < this.f194869d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f194869d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f194870e);
        return sb.toString();
    }

    public xxi(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f194866a = (String) tf80.m188658e(str);
        this.f194867b = (String) tf80.m188658e(str2);
        this.f194868c = (String) tf80.m188658e(str3);
        this.f194869d = (List) tf80.m188658e(list);
        this.f194870e = 0;
        this.f194871f = m211490a(str, str2, str3);
    }
}
