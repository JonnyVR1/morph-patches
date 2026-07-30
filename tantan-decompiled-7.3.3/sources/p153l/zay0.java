package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public final class zay0 implements e9y0 {

    /* JADX INFO: renamed from: a */
    public final ctx0 f203605a;

    /* JADX INFO: renamed from: b */
    public j4y0 f203606b = new j4y0();

    /* JADX INFO: renamed from: c */
    public final int f203607c;

    public zay0(ctx0 ctx0Var, int i) {
        this.f203605a = ctx0Var;
        pcy0.m171702a();
        this.f203607c = i;
    }

    /* JADX INFO: renamed from: d */
    public static e9y0 m219144d(ctx0 ctx0Var) {
        return new zay0(ctx0Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static e9y0 m219145e(ctx0 ctx0Var, int i) {
        return new zay0(ctx0Var, 1);
    }

    @Override // p153l.e9y0
    /* JADX INFO: renamed from: a */
    public final e9y0 mo119967a(zzhy zzhyVar) {
        this.f203605a.m112559d(zzhyVar);
        return this;
    }

    @Override // p153l.e9y0
    /* JADX INFO: renamed from: b */
    public final byte[] mo119968b(int i, boolean z) {
        this.f203606b.m143484f(Boolean.valueOf(1 == (i ^ 1)));
        this.f203606b.m143483e(Boolean.FALSE);
        this.f203605a.m112561f(this.f203606b.m143491m());
        try {
            pcy0.m171702a();
            ctx0 ctx0Var = this.f203605a;
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(m2x0.f134627a).ignoreNullValues(true).build().encode(ctx0Var.m112562g()).getBytes("utf-8");
            }
            cux0 cux0VarM112562g = ctx0Var.m112562g();
            fwr0 fwr0Var = new fwr0();
            m2x0.f134627a.configure(fwr0Var);
            return fwr0Var.m127843a().m183565a(cux0VarM112562g);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p153l.e9y0
    /* JADX INFO: renamed from: c */
    public final e9y0 mo119969c(j4y0 j4y0Var) {
        this.f203606b = j4y0Var;
        return this;
    }

    @Override // p153l.e9y0
    public final int zza() {
        return this.f203607c;
    }

    @Override // p153l.e9y0
    public final String zzd() {
        q4y0 q4y0VarM112729d = this.f203605a.m112562g().m112729d();
        return (q4y0VarM112729d == null || p8y0.m171288b(q4y0VarM112729d.m175275k())) ? "NA" : (String) Preconditions.checkNotNull(q4y0VarM112729d.m175275k());
    }
}
