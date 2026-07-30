package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public final class t1y0 implements yzx0 {

    /* JADX INFO: renamed from: a */
    public final wjx0 f167409a;

    /* JADX INFO: renamed from: b */
    public dvx0 f167410b = new dvx0();

    /* JADX INFO: renamed from: c */
    public final int f167411c;

    public t1y0(wjx0 wjx0Var, int i) {
        this.f167409a = wjx0Var;
        j3y0.m139607a();
        this.f167411c = i;
    }

    /* JADX INFO: renamed from: d */
    public static yzx0 m186931d(wjx0 wjx0Var) {
        return new t1y0(wjx0Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static yzx0 m186932e(wjx0 wjx0Var, int i) {
        return new t1y0(wjx0Var, 1);
    }

    @Override // p149l.yzx0
    /* JADX INFO: renamed from: a */
    public final yzx0 mo186933a(zzhy zzhyVar) {
        this.f167409a.m203577d(zzhyVar);
        return this;
    }

    @Override // p149l.yzx0
    /* JADX INFO: renamed from: b */
    public final byte[] mo186934b(int i, boolean z) {
        this.f167410b.m113848f(Boolean.valueOf(1 == (i ^ 1)));
        this.f167410b.m113847e(Boolean.FALSE);
        this.f167409a.m203579f(this.f167410b.m113855m());
        try {
            j3y0.m139607a();
            wjx0 wjx0Var = this.f167409a;
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(gtw0.f104355a).ignoreNullValues(true).build().encode(wjx0Var.m203580g()).getBytes("utf-8");
            }
            wkx0 wkx0VarM203580g = wjx0Var.m203580g();
            zmr0 zmr0Var = new zmr0();
            gtw0.f104355a.configure(zmr0Var);
            return zmr0Var.m219368a().m150812a(wkx0VarM203580g);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p149l.yzx0
    /* JADX INFO: renamed from: c */
    public final yzx0 mo186935c(dvx0 dvx0Var) {
        this.f167410b = dvx0Var;
        return this;
    }

    @Override // p149l.yzx0
    public final int zza() {
        return this.f167411c;
    }

    @Override // p149l.yzx0
    public final String zzd() {
        kvx0 kvx0VarM203700d = this.f167409a.m203580g().m203700d();
        return (kvx0VarM203700d == null || jzx0.m143967b(kvx0VarM203700d.m147406k())) ? "NA" : (String) Preconditions.checkNotNull(kvx0VarM203700d.m147406k());
    }
}
