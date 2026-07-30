package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p034nl.languageid.IdentifiedLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public interface b9r {
    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    List<IdentifiedLanguage> mo16937a(@NonNull String str, float f) throws MlKitException;

    @KeepForSdk
    void init() throws MlKitException;

    @KeepForSdk
    void release();
}
