package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class hlw0 {

    /* JADX INFO: renamed from: g */
    public static final String f110546g = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a */
    public final String f110547a;

    /* JADX INFO: renamed from: b */
    public final String f110548b;

    /* JADX INFO: renamed from: c */
    public final String f110549c;

    /* JADX INFO: renamed from: d */
    public final String f110550d;

    /* JADX INFO: renamed from: e */
    public final String f110551e;

    /* JADX INFO: renamed from: f */
    public final jlw0 f110552f;

    public hlw0(Context context, String str, String str2, String str3) {
        this.f110552f = jlw0.m146124b(context);
        this.f110547a = str;
        this.f110548b = str.concat("_3p");
        this.f110549c = str2;
        this.f110550d = str2.concat("_3p");
        this.f110551e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final long m135791a(boolean z) {
        return this.f110552f.m146125a(z ? this.f110550d : this.f110549c, -1L);
    }

    /* JADX INFO: renamed from: b */
    public final glw0 m135792b(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f110546g)) {
                    String strM135795e = m135795e(true);
                    String strM146126c = this.f110552f.m146126c("paid_3p_hash_key", null);
                    if (strM135795e != null && strM146126c != null && !strM135795e.equals(m135798h(str, str2, strM146126c))) {
                        return m135793c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new glw0();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            wtq0.m207906a(this.f110551e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        long jM135791a = m135791a(z2);
        if (jM135791a != -1) {
            if (jCurrentTimeMillis < jM135791a) {
                this.f110552f.m146127d(z2 ? this.f110550d : this.f110549c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jM135791a + j) {
                return m135793c(str, str2);
            }
        }
        String strM135795e2 = m135795e(z2);
        return (strM135795e2 != null || z) ? new glw0(strM135795e2, m135791a(z2)) : m135793c(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final glw0 m135793c(String str, String str2) throws IOException {
        if (str == null) {
            return m135794d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f110552f.m146127d("paid_3p_hash_key", string);
        return m135794d(m135798h(str, str2, string), true);
    }

    /* JADX INFO: renamed from: d */
    public final glw0 m135794d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            wtq0.m207906a(this.f110551e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        this.f110552f.m146127d(z ? this.f110550d : this.f110549c, Long.valueOf(jCurrentTimeMillis));
        this.f110552f.m146127d(z ? this.f110548b : this.f110547a, str);
        return new glw0(str, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: e */
    public final String m135795e(boolean z) {
        return this.f110552f.m146126c(z ? this.f110548b : this.f110547a, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m135796f(boolean z) throws IOException {
        this.f110552f.m146128e(z ? this.f110550d : this.f110549c);
        this.f110552f.m146128e(z ? this.f110548b : this.f110547a);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m135797g(boolean z) {
        return this.f110552f.m146130g(this.f110547a);
    }

    /* JADX INFO: renamed from: h */
    public final String m135798h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f110551e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
