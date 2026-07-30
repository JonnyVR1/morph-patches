package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class agu0 {

    /* JADX INFO: renamed from: a */
    public final zzgaa f69520a;

    /* JADX INFO: renamed from: b */
    public final List f69521b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f69522c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public ghu0 f69523d;

    /* JADX INFO: renamed from: e */
    public ghu0 f69524e;

    /* JADX INFO: renamed from: f */
    public boolean f69525f;

    public agu0(zzgaa zzgaaVar) {
        this.f69520a = zzgaaVar;
        ghu0 ghu0Var = ghu0.f102815e;
        this.f69523d = ghu0Var;
        this.f69524e = ghu0Var;
        this.f69525f = false;
    }

    /* JADX INFO: renamed from: a */
    public final ghu0 m96333a(ghu0 ghu0Var) throws zzds {
        if (ghu0Var.equals(ghu0.f102815e)) {
            throw new zzds("Unhandled input format:", ghu0Var);
        }
        for (int i = 0; i < this.f69520a.size(); i++) {
            qju0 qju0Var = (qju0) this.f69520a.get(i);
            ghu0 ghu0VarMo132015b = qju0Var.mo132015b(ghu0Var);
            if (qju0Var.zzg()) {
                f5v0.m119535f(!ghu0VarMo132015b.equals(ghu0.f102815e));
                ghu0Var = ghu0VarMo132015b;
            }
        }
        this.f69524e = ghu0Var;
        return ghu0Var;
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m96334b() {
        if (!m96340h()) {
            return qju0.f154991a;
        }
        ByteBuffer byteBuffer = this.f69522c[m96341i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m96342j(qju0.f154991a);
        return this.f69522c[m96341i()];
    }

    /* JADX INFO: renamed from: c */
    public final void m96335c() {
        this.f69521b.clear();
        this.f69523d = this.f69524e;
        this.f69525f = false;
        for (int i = 0; i < this.f69520a.size(); i++) {
            qju0 qju0Var = (qju0) this.f69520a.get(i);
            qju0Var.zzc();
            if (qju0Var.zzg()) {
                this.f69521b.add(qju0Var);
            }
        }
        this.f69522c = new ByteBuffer[this.f69521b.size()];
        for (int i2 = 0; i2 <= m96341i(); i2++) {
            this.f69522c[i2] = ((qju0) this.f69521b.get(i2)).zzb();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96336d() {
        if (!m96340h() || this.f69525f) {
            return;
        }
        this.f69525f = true;
        ((qju0) this.f69521b.get(0)).zzd();
    }

    /* JADX INFO: renamed from: e */
    public final void m96337e(ByteBuffer byteBuffer) {
        if (!m96340h() || this.f69525f) {
            return;
        }
        m96342j(byteBuffer);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agu0)) {
            return false;
        }
        agu0 agu0Var = (agu0) obj;
        if (this.f69520a.size() != agu0Var.f69520a.size()) {
            return false;
        }
        for (int i = 0; i < this.f69520a.size(); i++) {
            if (this.f69520a.get(i) != agu0Var.f69520a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m96338f() {
        for (int i = 0; i < this.f69520a.size(); i++) {
            qju0 qju0Var = (qju0) this.f69520a.get(i);
            qju0Var.zzc();
            qju0Var.zzf();
        }
        this.f69522c = new ByteBuffer[0];
        ghu0 ghu0Var = ghu0.f102815e;
        this.f69523d = ghu0Var;
        this.f69524e = ghu0Var;
        this.f69525f = false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m96339g() {
        return this.f69525f && ((qju0) this.f69521b.get(m96341i())).zzh() && !this.f69522c[m96341i()].hasRemaining();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m96340h() {
        return !this.f69521b.isEmpty();
    }

    public final int hashCode() {
        return this.f69520a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m96341i() {
        return this.f69522c.length - 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m96342j(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (i <= m96341i()) {
                int i2 = i + 1;
                if (!this.f69522c[i].hasRemaining()) {
                    qju0 qju0Var = (qju0) this.f69521b.get(i);
                    if (!qju0Var.zzh()) {
                        if (i > 0) {
                            byteBuffer2 = this.f69522c[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : qju0.f154991a;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        qju0Var.mo132014a(byteBuffer2);
                        this.f69522c[i] = qju0Var.zzb();
                        long jRemaining2 = jRemaining - ((long) byteBuffer2.remaining());
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.f69522c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.f69522c[i].hasRemaining() && i < m96341i()) {
                        ((qju0) this.f69521b.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }
}
