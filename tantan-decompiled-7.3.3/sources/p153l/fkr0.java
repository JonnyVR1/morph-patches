package p153l;

import com.google.android.gms.internal.mlkit_language_id_common.zzal;

/* JADX INFO: loaded from: classes6.dex */
public final class fkr0 implements wqr0 {

    /* JADX INFO: renamed from: a */
    public final int f99556a;

    /* JADX INFO: renamed from: b */
    public final zzal f99557b;

    public fkr0(int i, zzal zzalVar) {
        this.f99556a = i;
        this.f99557b = zzalVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return wqr0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqr0)) {
            return false;
        }
        wqr0 wqr0Var = (wqr0) obj;
        return this.f99556a == wqr0Var.zza() && this.f99557b.equals(wqr0Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f99556a ^ 14552422) + (this.f99557b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f99556a + "intEncoding=" + this.f99557b + ')';
    }

    @Override // p153l.wqr0
    public final int zza() {
        return this.f99556a;
    }

    @Override // p153l.wqr0
    public final zzal zzb() {
        return this.f99557b;
    }
}
