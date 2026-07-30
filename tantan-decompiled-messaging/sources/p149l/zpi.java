package p149l;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.C1618a;

/* JADX INFO: loaded from: classes.dex */
public class zpi {

    /* JADX INFO: renamed from: a */
    public final twc0<byte[]> f204252a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final C21753b f204253b;

    /* JADX INFO: renamed from: l.zpi$a */
    public class C21752a implements twc0<byte[]> {
        public C21752a() {
        }

        @Override // p149l.twc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            zpi.this.m219671b(bArr);
        }
    }

    /* JADX INFO: renamed from: l.zpi$b */
    @VisibleForTesting
    public static class C21753b extends C1618a {
        public C21753b(jhy jhyVar, va80 va80Var, wa80 wa80Var) {
            super(jhyVar, va80Var, wa80Var);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        /* JADX INFO: renamed from: x */
        public bg3<byte[]> mo8425x(int i) {
            return new xz40(mo8417p(i), this.f6445c.f180722g, 0);
        }
    }

    public zpi(jhy jhyVar, va80 va80Var) {
        rf80.m179111b(Boolean.valueOf(va80Var.f180722g > 0));
        this.f204253b = new C21753b(jhyVar, va80Var, tk40.m189423h());
        this.f204252a = new C21752a();
    }

    /* JADX INFO: renamed from: a */
    public fa5<byte[]> m219670a(int i) {
        return fa5.m120147Y(this.f204253b.get(i), this.f204252a);
    }

    /* JADX INFO: renamed from: b */
    public void m219671b(byte[] bArr) {
        this.f204253b.release(bArr);
    }
}
