package p153l;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.C1110a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class bg60 implements z3d0<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1110a f76570a;

    public bg60(C1110a c1110a) {
        this.f76570a = c1110a;
    }

    /* JADX INFO: renamed from: e */
    private boolean m104113e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // p153l.z3d0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull u560 u560Var) throws IOException {
        return this.f76570a.m5583d(parcelFileDescriptor, i, i2, u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull u560 u560Var) {
        return m104113e(parcelFileDescriptor) && this.f76570a.m5586o(parcelFileDescriptor);
    }
}
