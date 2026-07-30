package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class aq3 implements rze<ByteBuffer> {
    @Override // p149l.rze
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo98228a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull px50 px50Var) throws Throwable {
        try {
            eq3.m117706e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
