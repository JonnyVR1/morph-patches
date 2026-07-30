package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class khw0 implements Result {

    /* JADX INFO: renamed from: a */
    public final Status f123234a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Credential f123235b;

    public khw0(Status status, @Nullable Credential credential) {
        this.f123234a = status;
        this.f123235b = credential;
    }

    /* JADX INFO: renamed from: a */
    public static khw0 m146023a(Status status) {
        return new khw0(status, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f123234a;
    }
}
