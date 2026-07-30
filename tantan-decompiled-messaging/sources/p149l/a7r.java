package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p033nl.languageid.IdentifiedLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public interface a7r {
    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    List<IdentifiedLanguage> mo16882a(@NonNull String str, float f) throws MlKitException;

    @KeepForSdk
    void init() throws MlKitException;

    @KeepForSdk
    void release();
}
