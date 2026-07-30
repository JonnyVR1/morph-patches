package p153l;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.C1641a;

/* JADX INFO: loaded from: classes.dex */
public class vsi {

    /* JADX INFO: renamed from: a */
    public final w4d0<byte[]> f185608a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final C20921b f185609b;

    /* JADX INFO: renamed from: l.vsi$a */
    public class C20920a implements w4d0<byte[]> {
        public C20920a() {
        }

        @Override // p153l.w4d0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            vsi.this.m202616b(bArr);
        }
    }

    /* JADX INFO: renamed from: l.vsi$b */
    @VisibleForTesting
    public static class C20921b extends C1641a {
        public C20921b(gqy gqyVar, bj80 bj80Var, cj80 cj80Var) {
            super(gqyVar, bj80Var, cj80Var);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        /* JADX INFO: renamed from: x */
        public pg3<byte[]> mo8479x(int i) {
            return new m850(mo8471p(i), this.f6482c.f76970g, 0);
        }
    }

    public vsi(gqy gqyVar, bj80 bj80Var) {
        wn80.m207177b(Boolean.valueOf(bj80Var.f76970g > 0));
        this.f185609b = new C20921b(gqyVar, bj80Var, ht40.m137066h());
        this.f185608a = new C20920a();
    }

    /* JADX INFO: renamed from: a */
    public fb5<byte[]> m202615a(int i) {
        return fb5.m124867Z(this.f185609b.get(i), this.f185608a);
    }

    /* JADX INFO: renamed from: b */
    public void m202616b(byte[] bArr) {
        this.f185609b.release(bArr);
    }
}
