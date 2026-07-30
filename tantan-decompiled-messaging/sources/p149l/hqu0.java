package p149l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class hqu0 implements u5u0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f109159a = new Bundle();

    @VisibleForTesting
    public hqu0() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Bundle m132585a() {
        return new Bundle(this.f109159a);
    }

    @Override // p149l.u5u0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo132586b(String str, String str2) {
        this.f109159a.putInt(str, 3);
    }

    @Override // p149l.u5u0
    /* JADX INFO: renamed from: z */
    public final synchronized void mo132587z(String str) {
        this.f109159a.putInt(str, 2);
    }

    @Override // p149l.u5u0
    public final synchronized void zzc(String str) {
        this.f109159a.putInt(str, 1);
    }

    @Override // p149l.u5u0
    public final void zze() {
    }

    @Override // p149l.u5u0
    public final void zzf() {
    }

    @Override // p149l.u5u0
    public final void zza(String str) {
    }
}
