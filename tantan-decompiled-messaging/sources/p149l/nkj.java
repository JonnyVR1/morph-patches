package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class nkj implements zvc0<lkj> {
    @Override // p149l.zvc0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo144138b(@NonNull px50 px50Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p149l.rze
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo98228a(@NonNull rvc0<lkj> rvc0Var, @NonNull File file, @NonNull px50 px50Var) throws Throwable {
        try {
            eq3.m117706e(rvc0Var.get().m150279c(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
