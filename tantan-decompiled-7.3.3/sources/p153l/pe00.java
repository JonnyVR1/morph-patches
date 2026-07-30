package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class pe00 {

    /* JADX INFO: renamed from: b */
    public static final GmsLogger f151853b = new GmsLogger("ModelFileHelper", "");

    /* JADX INFO: renamed from: c */
    @NonNull
    @VisibleForTesting
    public static final String f151854c = String.format("com.google.mlkit.%s.models", "translate");

    /* JADX INFO: renamed from: d */
    @NonNull
    @VisibleForTesting
    public static final String f151855d = String.format("com.google.mlkit.%s.models", "custom");

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public static final String f151856e = String.format("com.google.mlkit.%s.models", "base");

    /* JADX INFO: renamed from: a */
    public final rd00 f151857a;

    public pe00(@NonNull rd00 rd00Var) {
        this.f151857a = rd00Var;
    }
}
