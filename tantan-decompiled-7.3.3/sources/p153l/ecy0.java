package p153l;

import com.google.android.gms.internal.measurement.zzln;

/* JADX INFO: loaded from: classes6.dex */
public final class ecy0 implements h9y0 {

    /* JADX INFO: renamed from: a */
    public final m9y0 f93116a;

    /* JADX INFO: renamed from: b */
    public final String f93117b;

    /* JADX INFO: renamed from: c */
    public final Object[] f93118c;

    /* JADX INFO: renamed from: d */
    public final int f93119d;

    public ecy0(m9y0 m9y0Var, String str, Object[] objArr) {
        this.f93116a = m9y0Var;
        this.f93117b = str;
        this.f93118c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f93119d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f93119d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m120412a() {
        return this.f93117b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m120413b() {
        return this.f93118c;
    }

    @Override // p153l.h9y0
    public final m9y0 zza() {
        return this.f93116a;
    }

    @Override // p153l.h9y0
    public final zzln zzb() {
        int i = this.f93119d;
        if ((i & 1) != 0) {
            return zzln.PROTO2;
        }
        return (i & 4) == 4 ? zzln.EDITIONS : zzln.PROTO3;
    }

    @Override // p153l.h9y0
    public final boolean zzc() {
        return (this.f93119d & 2) == 2;
    }
}
