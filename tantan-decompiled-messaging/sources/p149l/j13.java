package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j13<DataType> implements wvc0<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final wvc0<DataType, Bitmap> f115733a;

    /* JADX INFO: renamed from: b */
    private final Resources f115734b;

    public j13(@NonNull Resources resources, @NonNull wvc0<DataType, Bitmap> wvc0Var) {
        this.f115734b = (Resources) qf80.m174276d(resources);
        this.f115733a = (wvc0) qf80.m174276d(wvc0Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: a */
    public boolean mo5552a(@NonNull DataType datatype, @NonNull px50 px50Var) throws IOException {
        return this.f115733a.mo5552a(datatype, px50Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: b */
    public rvc0<BitmapDrawable> mo5553b(@NonNull DataType datatype, int i, int i2, @NonNull px50 px50Var) throws IOException {
        return q7r.m173292b(this.f115734b, this.f115733a.mo5553b(datatype, i, i2, px50Var));
    }
}
