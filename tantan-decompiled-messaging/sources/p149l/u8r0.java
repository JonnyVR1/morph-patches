package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class u8r0 implements BaseImplementation.ResultHolder {

    /* JADX INFO: renamed from: a */
    public final sei0 f175156a;

    public u8r0(sei0 sei0Var) {
        Preconditions.checkNotNull(sei0Var);
        this.f175156a = sei0Var;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(@Nullable Status status) {
        if (status == null) {
            return;
        }
        this.f175156a.m183658b(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.f175156a);
    }
}
