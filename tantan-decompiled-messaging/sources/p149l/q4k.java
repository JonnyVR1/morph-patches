package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public class q4k implements Result {

    /* JADX INFO: renamed from: a */
    public Status f152641a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GoogleSignInAccount f152642b;

    public q4k(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f152642b = googleSignInAccount;
        this.f152641a = status;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public GoogleSignInAccount m172942a() {
        return this.f152642b;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f152641a;
    }
}
