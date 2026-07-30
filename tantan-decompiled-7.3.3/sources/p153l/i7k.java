package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public class i7k implements Result {

    /* JADX INFO: renamed from: a */
    public Status f113263a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GoogleSignInAccount f113264b;

    public i7k(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f113264b = googleSignInAccount;
        this.f113263a = status;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public GoogleSignInAccount m138963a() {
        return this.f113264b;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f113263a;
    }
}
