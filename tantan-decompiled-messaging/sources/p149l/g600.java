package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class g600 {

    /* JADX INFO: renamed from: b */
    public static final GmsLogger f101216b = new GmsLogger("ModelFileHelper", "");

    /* JADX INFO: renamed from: c */
    @NonNull
    @VisibleForTesting
    public static final String f101217c = String.format("com.google.mlkit.%s.models", "translate");

    /* JADX INFO: renamed from: d */
    @NonNull
    @VisibleForTesting
    public static final String f101218d = String.format("com.google.mlkit.%s.models", "custom");

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public static final String f101219e = String.format("com.google.mlkit.%s.models", "base");

    /* JADX INFO: renamed from: a */
    public final c500 f101220a;

    public g600(@NonNull c500 c500Var) {
        this.f101220a = c500Var;
    }
}
