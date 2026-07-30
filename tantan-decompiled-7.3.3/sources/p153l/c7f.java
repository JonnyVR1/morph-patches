package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class c7f {

    /* JADX INFO: renamed from: a */
    public final Provider f80111a;

    public c7f(@NonNull Provider provider) {
        this.f80111a = provider;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public Executor m108304a(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.f80111a.get();
    }
}
