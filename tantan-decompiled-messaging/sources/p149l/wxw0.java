package p149l;

import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class wxw0 implements fyw0 {

    /* JADX INFO: renamed from: a */
    public final String f188524a;

    /* JADX INFO: renamed from: b */
    public final q6x0 f188525b;

    /* JADX INFO: renamed from: c */
    public final zzgyl f188526c;

    /* JADX INFO: renamed from: d */
    public final zzgus f188527d;

    /* JADX INFO: renamed from: e */
    public final zzgvz f188528e;

    /* JADX INFO: renamed from: f */
    public final Integer f188529f;

    public wxw0(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) {
        this.f188524a = str;
        this.f188525b = oyw0.m166725a(str);
        this.f188526c = zzgylVar;
        this.f188527d = zzgusVar;
        this.f188528e = zzgvzVar;
        this.f188529f = num;
    }

    /* JADX INFO: renamed from: a */
    public static wxw0 m206041a(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) throws GeneralSecurityException {
        if (zzgvzVar == zzgvz.RAW) {
            if (num != null) {
                j8w0.m140474a("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            j8w0.m140474a("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new wxw0(str, zzgylVar, zzgusVar, zzgvzVar, num);
    }

    /* JADX INFO: renamed from: b */
    public final zzgus m206042b() {
        return this.f188527d;
    }

    /* JADX INFO: renamed from: c */
    public final zzgvz m206043c() {
        return this.f188528e;
    }

    /* JADX INFO: renamed from: d */
    public final zzgyl m206044d() {
        return this.f188526c;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m206045e() {
        return this.f188529f;
    }

    /* JADX INFO: renamed from: f */
    public final String m206046f() {
        return this.f188524a;
    }

    @Override // p149l.fyw0
    public final q6x0 zzd() {
        return this.f188525b;
    }
}
