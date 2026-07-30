package p149l;

import com.google.android.gms.internal.mlkit_language_id_common.zzal;

/* JADX INFO: loaded from: classes6.dex */
public final class zar0 implements qhr0 {

    /* JADX INFO: renamed from: a */
    public final int f202393a;

    /* JADX INFO: renamed from: b */
    public final zzal f202394b;

    public zar0(int i, zzal zzalVar) {
        this.f202393a = i;
        this.f202394b = zzalVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return qhr0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhr0)) {
            return false;
        }
        qhr0 qhr0Var = (qhr0) obj;
        return this.f202393a == qhr0Var.zza() && this.f202394b.equals(qhr0Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f202393a ^ 14552422) + (this.f202394b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f202393a + "intEncoding=" + this.f202394b + ')';
    }

    @Override // p149l.qhr0
    public final int zza() {
        return this.f202393a;
    }

    @Override // p149l.qhr0
    public final zzal zzb() {
        return this.f202394b;
    }
}
