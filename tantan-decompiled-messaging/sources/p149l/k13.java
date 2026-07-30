package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class k13 implements zvc0<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final g23 f120535a;

    /* JADX INFO: renamed from: b */
    private final zvc0<Bitmap> f120536b;

    public k13(g23 g23Var, zvc0<Bitmap> zvc0Var) {
        this.f120535a = g23Var;
        this.f120536b = zvc0Var;
    }

    @Override // p149l.zvc0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo144138b(@NonNull px50 px50Var) {
        return this.f120536b.mo144138b(px50Var);
    }

    @Override // p149l.rze
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo98228a(@NonNull rvc0<BitmapDrawable> rvc0Var, @NonNull File file, @NonNull px50 px50Var) {
        return this.f120536b.mo98228a((Bitmap) new o23(rvc0Var.get().getBitmap(), this.f120535a), file, px50Var);
    }
}
