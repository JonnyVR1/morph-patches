package p149l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class k6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f121514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f121515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f121516c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f121517d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzo f121518e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f121519f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ b3y0 f121520g;

    public k6y0(b3y0 b3y0Var, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z) {
        this.f121514a = atomicReference;
        this.f121515b = str;
        this.f121516c = str2;
        this.f121517d = str3;
        this.f121518e = zzoVar;
        this.f121519f = z;
        this.f121520g = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f121514a) {
            try {
                try {
                    cjw0 cjw0Var = this.f121520g.f73268d;
                    if (cjw0Var == null) {
                        this.f121520g.zzj().m211412A().m123939d("(legacy) Failed to get user properties; not connected to service", xww0.m211405p(this.f121515b), this.f121516c, this.f121517d);
                        this.f121514a.set(Collections.EMPTY_LIST);
                        this.f121514a.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f121515b)) {
                            Preconditions.checkNotNull(this.f121518e);
                            this.f121514a.set(cjw0Var.mo107264M7(this.f121516c, this.f121517d, this.f121519f, this.f121518e));
                        } else {
                            this.f121514a.set(cjw0Var.mo107259I0(this.f121515b, this.f121516c, this.f121517d, this.f121519f));
                        }
                        this.f121520g.m100127g0();
                        this.f121514a.notify();
                    }
                } catch (RemoteException e) {
                    this.f121520g.zzj().m211412A().m123939d("(legacy) Failed to get user properties; remote exception", xww0.m211405p(this.f121515b), this.f121516c, e);
                    this.f121514a.set(Collections.EMPTY_LIST);
                    this.f121514a.notify();
                }
            } catch (Throwable th) {
                this.f121514a.notify();
                throw th;
            }
        }
    }
}
