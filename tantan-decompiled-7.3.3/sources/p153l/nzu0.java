package p153l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class nzu0 implements afu0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f144474a = new Bundle();

    @VisibleForTesting
    public nzu0() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Bundle m165397a() {
        return new Bundle(this.f144474a);
    }

    @Override // p153l.afu0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo97568b(String str, String str2) {
        this.f144474a.putInt(str, 3);
    }

    @Override // p153l.afu0
    /* JADX INFO: renamed from: z */
    public final synchronized void mo97569z(String str) {
        this.f144474a.putInt(str, 2);
    }

    @Override // p153l.afu0
    public final synchronized void zzc(String str) {
        this.f144474a.putInt(str, 1);
    }

    @Override // p153l.afu0
    public final void zze() {
    }

    @Override // p153l.afu0
    public final void zzf() {
    }

    @Override // p153l.afu0
    public final void zza(String str) {
    }
}
