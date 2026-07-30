package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class qqw0 implements Result {

    /* JADX INFO: renamed from: a */
    public final Status f159052a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Credential f159053b;

    public qqw0(Status status, @Nullable Credential credential) {
        this.f159052a = status;
        this.f159053b = credential;
    }

    /* JADX INFO: renamed from: a */
    public static qqw0 m177527a(Status status) {
        return new qqw0(status, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f159052a;
    }
}
