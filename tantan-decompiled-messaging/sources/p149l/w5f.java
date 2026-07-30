package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class w5f {

    /* JADX INFO: renamed from: a */
    public final Provider f184674a;

    public w5f(@NonNull Provider provider) {
        this.f184674a = provider;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public Executor m201618a(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.f184674a.get();
    }
}
