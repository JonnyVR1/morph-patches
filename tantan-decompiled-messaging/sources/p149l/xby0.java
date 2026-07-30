package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class xby0 extends dsu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f191973a;

    public xby0(kfy0 kfy0Var, sei0 sei0Var) {
        this.f191973a = sei0Var;
    }

    @Override // p149l.nov0
    /* JADX INFO: renamed from: v1 */
    public final void mo160427v1(Status status, @Nullable zzc zzcVar) {
        TaskUtil.setResultOrApiException(status, zzcVar != null ? new zw0(zzcVar.zzb(), zzcVar.zza()) : null, this.f191973a);
    }
}
