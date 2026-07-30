package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class yvk {

    /* JADX INFO: renamed from: a */
    public int f200279a = 1;

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public yvk m216224a(@Nullable Object obj) {
        this.f200279a = (this.f200279a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public int m216225b() {
        return this.f200279a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final yvk m216226c(boolean z) {
        this.f200279a = (this.f200279a * 31) + (z ? 1 : 0);
        return this;
    }
}
