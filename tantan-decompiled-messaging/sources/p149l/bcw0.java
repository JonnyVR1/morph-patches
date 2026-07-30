package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class bcw0 {

    /* JADX INFO: renamed from: g */
    public static final String f74970g = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a */
    public final String f74971a;

    /* JADX INFO: renamed from: b */
    public final String f74972b;

    /* JADX INFO: renamed from: c */
    public final String f74973c;

    /* JADX INFO: renamed from: d */
    public final String f74974d;

    /* JADX INFO: renamed from: e */
    public final String f74975e;

    /* JADX INFO: renamed from: f */
    public final dcw0 f74976f;

    public bcw0(Context context, String str, String str2, String str3) {
        this.f74976f = dcw0.m110879b(context);
        this.f74971a = str;
        this.f74972b = str.concat("_3p");
        this.f74973c = str2;
        this.f74974d = str2.concat("_3p");
        this.f74975e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final long m101131a(boolean z) {
        return this.f74976f.m110880a(z ? this.f74974d : this.f74973c, -1L);
    }

    /* JADX INFO: renamed from: b */
    public final acw0 m101132b(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f74970g)) {
                    String strM101135e = m101135e(true);
                    String strM110881c = this.f74976f.m110881c("paid_3p_hash_key", null);
                    if (strM101135e != null && strM110881c != null && !strM101135e.equals(m101138h(str, str2, strM110881c))) {
                        return m101133c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new acw0();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            qkq0.m175383a(this.f74975e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        long jM101131a = m101131a(z2);
        if (jM101131a != -1) {
            if (jCurrentTimeMillis < jM101131a) {
                this.f74976f.m110882d(z2 ? this.f74974d : this.f74973c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jM101131a + j) {
                return m101133c(str, str2);
            }
        }
        String strM101135e2 = m101135e(z2);
        return (strM101135e2 != null || z) ? new acw0(strM101135e2, m101131a(z2)) : m101133c(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final acw0 m101133c(String str, String str2) throws IOException {
        if (str == null) {
            return m101134d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f74976f.m110882d("paid_3p_hash_key", string);
        return m101134d(m101138h(str, str2, string), true);
    }

    /* JADX INFO: renamed from: d */
    public final acw0 m101134d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            qkq0.m175383a(this.f74975e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        this.f74976f.m110882d(z ? this.f74974d : this.f74973c, Long.valueOf(jCurrentTimeMillis));
        this.f74976f.m110882d(z ? this.f74972b : this.f74971a, str);
        return new acw0(str, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: e */
    public final String m101135e(boolean z) {
        return this.f74976f.m110881c(z ? this.f74972b : this.f74971a, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m101136f(boolean z) throws IOException {
        this.f74976f.m110883e(z ? this.f74974d : this.f74973c);
        this.f74976f.m110883e(z ? this.f74972b : this.f74971a);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m101137g(boolean z) {
        return this.f74976f.m110885g(this.f74971a);
    }

    /* JADX INFO: renamed from: h */
    public final String m101138h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f74975e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
