package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class dnj implements c4d0<bnj> {
    @Override // p153l.c4d0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo101610b(@NonNull u560 u560Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p153l.v0f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo99642a(@NonNull u3d0<bnj> u3d0Var, @NonNull File file, @NonNull u560 u560Var) throws Throwable {
        try {
            er3.m122099f(u3d0Var.get().m105406c(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
