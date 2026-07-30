package p149l;

import androidx.annotation.CallSuper;
import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zku0 implements qju0 {

    /* JADX INFO: renamed from: b */
    public ghu0 f203569b;

    /* JADX INFO: renamed from: c */
    public ghu0 f203570c;

    /* JADX INFO: renamed from: d */
    public ghu0 f203571d;

    /* JADX INFO: renamed from: e */
    public ghu0 f203572e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f203573f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f203574g;

    /* JADX INFO: renamed from: h */
    public boolean f203575h;

    public zku0() {
        ByteBuffer byteBuffer = qju0.f154991a;
        this.f203573f = byteBuffer;
        this.f203574g = byteBuffer;
        ghu0 ghu0Var = ghu0.f102815e;
        this.f203571d = ghu0Var;
        this.f203572e = ghu0Var;
        this.f203569b = ghu0Var;
        this.f203570c = ghu0Var;
    }

    @Override // p149l.qju0
    /* JADX INFO: renamed from: b */
    public final ghu0 mo132015b(ghu0 ghu0Var) throws zzds {
        this.f203571d = ghu0Var;
        this.f203572e = mo150391c(ghu0Var);
        return zzg() ? this.f203572e : ghu0.f102815e;
    }

    /* JADX INFO: renamed from: c */
    public ghu0 mo150391c(ghu0 ghu0Var) throws zzds {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m219206d(int i) {
        if (this.f203573f.capacity() < i) {
            this.f203573f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f203573f.clear();
        }
        ByteBuffer byteBuffer = this.f203573f;
        this.f203574g = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m219207h() {
        return this.f203574g.hasRemaining();
    }

    @Override // p149l.qju0
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f203574g;
        this.f203574g = qju0.f154991a;
        return byteBuffer;
    }

    @Override // p149l.qju0
    public final void zzc() {
        this.f203574g = qju0.f154991a;
        this.f203575h = false;
        this.f203569b = this.f203571d;
        this.f203570c = this.f203572e;
        mo150392e();
    }

    @Override // p149l.qju0
    public final void zzd() {
        this.f203575h = true;
        mo150393f();
    }

    @Override // p149l.qju0
    public final void zzf() {
        zzc();
        this.f203573f = qju0.f154991a;
        ghu0 ghu0Var = ghu0.f102815e;
        this.f203571d = ghu0Var;
        this.f203572e = ghu0Var;
        this.f203569b = ghu0Var;
        this.f203570c = ghu0Var;
        mo150394g();
    }

    @Override // p149l.qju0
    public boolean zzg() {
        return this.f203572e != ghu0.f102815e;
    }

    @Override // p149l.qju0
    @CallSuper
    public boolean zzh() {
        return this.f203575h && this.f203574g == qju0.f154991a;
    }

    /* JADX INFO: renamed from: e */
    public void mo150392e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo150393f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo150394g() {
    }
}
