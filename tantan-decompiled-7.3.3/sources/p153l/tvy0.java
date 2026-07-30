package p153l;

import androidx.annotation.IntRange;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class tvy0 extends evx0 {

    /* JADX INFO: renamed from: i */
    public long f176325i;

    /* JADX INFO: renamed from: j */
    public int f176326j;

    /* JADX INFO: renamed from: k */
    public int f176327k;

    public tvy0() {
        super(2, 0);
        this.f176327k = 32;
    }

    @Override // p153l.evx0, p153l.fux0
    /* JADX INFO: renamed from: b */
    public final void mo122858b() {
        super.mo122858b();
        this.f176326j = 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m192840m() {
        return this.f176326j;
    }

    /* JADX INFO: renamed from: n */
    public final long m192841n() {
        return this.f176325i;
    }

    /* JADX INFO: renamed from: o */
    public final void m192842o(@IntRange(from = 1) int i) {
        this.f176327k = i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m192843p(evx0 evx0Var) {
        ByteBuffer byteBuffer;
        lev0.m153956d(!evx0Var.m127552d(1073741824));
        lev0.m153956d(!evx0Var.m127552d(SQLiteDatabase.CREATE_IF_NECESSARY));
        lev0.m153956d(!evx0Var.m127552d(4));
        if (m192844q()) {
            if (this.f176326j >= this.f176327k) {
                return false;
            }
            ByteBuffer byteBuffer2 = evx0Var.f96057d;
            if (byteBuffer2 != null && (byteBuffer = this.f96057d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.f176326j;
        this.f176326j = i + 1;
        if (i == 0) {
            this.f96059f = evx0Var.f96059f;
            if (evx0Var.m127552d(1)) {
                m127551c(1);
            }
        }
        ByteBuffer byteBuffer3 = evx0Var.f96057d;
        if (byteBuffer3 != null) {
            m122859i(byteBuffer3.remaining());
            this.f96057d.put(byteBuffer3);
        }
        this.f176325i = evx0Var.f96059f;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m192844q() {
        return this.f176326j > 0;
    }
}
