package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gpu0 {

    /* JADX INFO: renamed from: a */
    public final zzgaa f105624a;

    /* JADX INFO: renamed from: b */
    public final List f105625b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f105626c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public mqu0 f105627d;

    /* JADX INFO: renamed from: e */
    public mqu0 f105628e;

    /* JADX INFO: renamed from: f */
    public boolean f105629f;

    public gpu0(zzgaa zzgaaVar) {
        this.f105624a = zzgaaVar;
        mqu0 mqu0Var = mqu0.f138275e;
        this.f105627d = mqu0Var;
        this.f105628e = mqu0Var;
        this.f105629f = false;
    }

    /* JADX INFO: renamed from: a */
    public final mqu0 m131322a(mqu0 mqu0Var) throws zzds {
        if (mqu0Var.equals(mqu0.f138275e)) {
            throw new zzds("Unhandled input format:", mqu0Var);
        }
        for (int i = 0; i < this.f105624a.size(); i++) {
            wsu0 wsu0Var = (wsu0) this.f105624a.get(i);
            mqu0 mqu0VarMo127541b = wsu0Var.mo127541b(mqu0Var);
            if (wsu0Var.zzg()) {
                lev0.m153958f(!mqu0VarMo127541b.equals(mqu0.f138275e));
                mqu0Var = mqu0VarMo127541b;
            }
        }
        this.f105628e = mqu0Var;
        return mqu0Var;
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m131323b() {
        if (!m131329h()) {
            return wsu0.f190695a;
        }
        ByteBuffer byteBuffer = this.f105626c[m131330i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m131331j(wsu0.f190695a);
        return this.f105626c[m131330i()];
    }

    /* JADX INFO: renamed from: c */
    public final void m131324c() {
        this.f105625b.clear();
        this.f105627d = this.f105628e;
        this.f105629f = false;
        for (int i = 0; i < this.f105624a.size(); i++) {
            wsu0 wsu0Var = (wsu0) this.f105624a.get(i);
            wsu0Var.zzc();
            if (wsu0Var.zzg()) {
                this.f105625b.add(wsu0Var);
            }
        }
        this.f105626c = new ByteBuffer[this.f105625b.size()];
        for (int i2 = 0; i2 <= m131330i(); i2++) {
            this.f105626c[i2] = ((wsu0) this.f105625b.get(i2)).zzb();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m131325d() {
        if (!m131329h() || this.f105629f) {
            return;
        }
        this.f105629f = true;
        ((wsu0) this.f105625b.get(0)).zzd();
    }

    /* JADX INFO: renamed from: e */
    public final void m131326e(ByteBuffer byteBuffer) {
        if (!m131329h() || this.f105629f) {
            return;
        }
        m131331j(byteBuffer);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpu0)) {
            return false;
        }
        gpu0 gpu0Var = (gpu0) obj;
        if (this.f105624a.size() != gpu0Var.f105624a.size()) {
            return false;
        }
        for (int i = 0; i < this.f105624a.size(); i++) {
            if (this.f105624a.get(i) != gpu0Var.f105624a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m131327f() {
        for (int i = 0; i < this.f105624a.size(); i++) {
            wsu0 wsu0Var = (wsu0) this.f105624a.get(i);
            wsu0Var.zzc();
            wsu0Var.zzf();
        }
        this.f105626c = new ByteBuffer[0];
        mqu0 mqu0Var = mqu0.f138275e;
        this.f105627d = mqu0Var;
        this.f105628e = mqu0Var;
        this.f105629f = false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m131328g() {
        return this.f105629f && ((wsu0) this.f105625b.get(m131330i())).zzh() && !this.f105626c[m131330i()].hasRemaining();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m131329h() {
        return !this.f105625b.isEmpty();
    }

    public final int hashCode() {
        return this.f105624a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m131330i() {
        return this.f105626c.length - 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m131331j(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (i <= m131330i()) {
                int i2 = i + 1;
                if (!this.f105626c[i].hasRemaining()) {
                    wsu0 wsu0Var = (wsu0) this.f105625b.get(i);
                    if (!wsu0Var.zzh()) {
                        if (i > 0) {
                            byteBuffer2 = this.f105626c[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : wsu0.f190695a;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        wsu0Var.mo165047a(byteBuffer2);
                        this.f105626c[i] = wsu0Var.zzb();
                        long jRemaining2 = jRemaining - ((long) byteBuffer2.remaining());
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.f105626c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.f105626c[i].hasRemaining() && i < m131330i()) {
                        ((wsu0) this.f105625b.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }
}
