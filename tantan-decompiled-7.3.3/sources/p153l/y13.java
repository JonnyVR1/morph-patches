package p153l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class y13<DataType> implements z3d0<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final z3d0<DataType, Bitmap> f197074a;

    /* JADX INFO: renamed from: b */
    private final Resources f197075b;

    public y13(@NonNull Resources resources, @NonNull z3d0<DataType, Bitmap> z3d0Var) {
        this.f197075b = (Resources) vn80.m201944d(resources);
        this.f197074a = (z3d0) vn80.m201944d(z3d0Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: a */
    public boolean mo5553a(@NonNull DataType datatype, @NonNull u560 u560Var) throws IOException {
        return this.f197074a.mo5553a(datatype, u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: b */
    public u3d0<BitmapDrawable> mo5554b(@NonNull DataType datatype, int i, int i2, @NonNull u560 u560Var) throws IOException {
        return s9r.m185217b(this.f197075b, this.f197074a.mo5554b(datatype, i, i2, u560Var));
    }
}
