package p153l;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class b7u0 extends kdu0 implements t6u0 {
    @VisibleForTesting
    public b7u0(Set set) {
        super(set);
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: Z */
    public final void mo102875Z(final zzdkv zzdkvVar) {
        m149285v0(new jdu0() { // from class: l.y6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((f7u0) obj).mo124507k(v8w0.m200327d(12, zzdkvVar.getMessage(), null));
            }
        });
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: i */
    public final void mo102876i(final zze zzeVar) {
        m149285v0(new jdu0() { // from class: l.a7u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((f7u0) obj).mo124507k(zzeVar);
            }
        });
    }

    @Override // p153l.t6u0
    public final void zzb() {
        m149285v0(new jdu0() { // from class: l.z6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((f7u0) obj).mo124507k(v8w0.m200327d(11, null, null));
            }
        });
    }
}
