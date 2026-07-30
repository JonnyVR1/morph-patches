package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class oyk {

    /* JADX INFO: renamed from: a */
    public int f149808a = 1;

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public oyk m169872a(@Nullable Object obj) {
        this.f149808a = (this.f149808a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public int m169873b() {
        return this.f149808a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final oyk m169874c(boolean z) {
        this.f149808a = (this.f149808a * 31) + (z ? 1 : 0);
        return this;
    }
}
