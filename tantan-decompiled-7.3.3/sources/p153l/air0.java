package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class air0 implements BaseImplementation.ResultHolder {

    /* JADX INFO: renamed from: a */
    public final sni0 f71572a;

    public air0(sni0 sni0Var) {
        Preconditions.checkNotNull(sni0Var);
        this.f71572a = sni0Var;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(@Nullable Status status) {
        if (status == null) {
            return;
        }
        this.f71572a.m186940b(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.f71572a);
    }
}
