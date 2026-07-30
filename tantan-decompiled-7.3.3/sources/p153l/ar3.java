package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ar3 implements v0f<ByteBuffer> {
    @Override // p153l.v0f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo99642a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull u560 u560Var) throws Throwable {
        try {
            er3.m122099f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
