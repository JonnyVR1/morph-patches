package p153l;

import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class c7x0 implements l7x0 {

    /* JADX INFO: renamed from: a */
    public final String f80154a;

    /* JADX INFO: renamed from: b */
    public final wfx0 f80155b;

    /* JADX INFO: renamed from: c */
    public final zzgyl f80156c;

    /* JADX INFO: renamed from: d */
    public final zzgus f80157d;

    /* JADX INFO: renamed from: e */
    public final zzgvz f80158e;

    /* JADX INFO: renamed from: f */
    public final Integer f80159f;

    public c7x0(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) {
        this.f80154a = str;
        this.f80155b = u7x0.m194894a(str);
        this.f80156c = zzgylVar;
        this.f80157d = zzgusVar;
        this.f80158e = zzgvzVar;
        this.f80159f = num;
    }

    /* JADX INFO: renamed from: a */
    public static c7x0 m108336a(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) throws GeneralSecurityException {
        if (zzgvzVar == zzgvz.RAW) {
            if (num != null) {
                phw0.m172339a("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            phw0.m172339a("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new c7x0(str, zzgylVar, zzgusVar, zzgvzVar, num);
    }

    /* JADX INFO: renamed from: b */
    public final zzgus m108337b() {
        return this.f80157d;
    }

    /* JADX INFO: renamed from: c */
    public final zzgvz m108338c() {
        return this.f80158e;
    }

    /* JADX INFO: renamed from: d */
    public final zzgyl m108339d() {
        return this.f80156c;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m108340e() {
        return this.f80159f;
    }

    /* JADX INFO: renamed from: f */
    public final String m108341f() {
        return this.f80154a;
    }

    @Override // p153l.l7x0
    public final wfx0 zzd() {
        return this.f80155b;
    }
}
