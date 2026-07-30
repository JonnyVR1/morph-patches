package p153l;

import androidx.annotation.CallSuper;
import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fuu0 implements wsu0 {

    /* JADX INFO: renamed from: b */
    public mqu0 f100948b;

    /* JADX INFO: renamed from: c */
    public mqu0 f100949c;

    /* JADX INFO: renamed from: d */
    public mqu0 f100950d;

    /* JADX INFO: renamed from: e */
    public mqu0 f100951e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f100952f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f100953g;

    /* JADX INFO: renamed from: h */
    public boolean f100954h;

    public fuu0() {
        ByteBuffer byteBuffer = wsu0.f190695a;
        this.f100952f = byteBuffer;
        this.f100953g = byteBuffer;
        mqu0 mqu0Var = mqu0.f138275e;
        this.f100950d = mqu0Var;
        this.f100951e = mqu0Var;
        this.f100948b = mqu0Var;
        this.f100949c = mqu0Var;
    }

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: b */
    public final mqu0 mo127541b(mqu0 mqu0Var) throws zzds {
        this.f100950d = mqu0Var;
        this.f100951e = mo127542c(mqu0Var);
        return zzg() ? this.f100951e : mqu0.f138275e;
    }

    /* JADX INFO: renamed from: c */
    public mqu0 mo127542c(mqu0 mqu0Var) throws zzds {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m127543d(int i) {
        if (this.f100952f.capacity() < i) {
            this.f100952f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f100952f.clear();
        }
        ByteBuffer byteBuffer = this.f100952f;
        this.f100953g = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m127547h() {
        return this.f100953g.hasRemaining();
    }

    @Override // p153l.wsu0
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f100953g;
        this.f100953g = wsu0.f190695a;
        return byteBuffer;
    }

    @Override // p153l.wsu0
    public final void zzc() {
        this.f100953g = wsu0.f190695a;
        this.f100954h = false;
        this.f100948b = this.f100950d;
        this.f100949c = this.f100951e;
        mo127544e();
    }

    @Override // p153l.wsu0
    public final void zzd() {
        this.f100954h = true;
        mo127545f();
    }

    @Override // p153l.wsu0
    public final void zzf() {
        zzc();
        this.f100952f = wsu0.f190695a;
        mqu0 mqu0Var = mqu0.f138275e;
        this.f100950d = mqu0Var;
        this.f100951e = mqu0Var;
        this.f100948b = mqu0Var;
        this.f100949c = mqu0Var;
        mo127546g();
    }

    @Override // p153l.wsu0
    public boolean zzg() {
        return this.f100951e != mqu0.f138275e;
    }

    @Override // p153l.wsu0
    @CallSuper
    public boolean zzh() {
        return this.f100954h && this.f100953g == wsu0.f190695a;
    }

    /* JADX INFO: renamed from: e */
    public void mo127544e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo127545f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo127546g() {
    }
}
