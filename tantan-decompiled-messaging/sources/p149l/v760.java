package p149l;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.C1093a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class v760 implements wvc0<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1093a f180312a;

    public v760(C1093a c1093a) {
        this.f180312a = c1093a;
    }

    @Override // p149l.wvc0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull px50 px50Var) throws IOException {
        return this.f180312a.m5540d(parcelFileDescriptor, i, i2, px50Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull px50 px50Var) {
        return this.f180312a.m5543o(parcelFileDescriptor);
    }
}
