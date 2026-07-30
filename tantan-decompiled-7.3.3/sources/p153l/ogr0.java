package p153l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class ogr0 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f147303a;

    public ogr0(gjr0 gjr0Var, sni0 sni0Var) {
        this.f147303a = sni0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f147303a);
    }
}
