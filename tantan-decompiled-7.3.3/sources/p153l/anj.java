package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface anj {

    /* JADX INFO: renamed from: l.anj$a */
    public interface InterfaceC15750a {
        @NonNull
        /* JADX INFO: renamed from: a */
        byte[] mo98989a(int i);

        @NonNull
        /* JADX INFO: renamed from: b */
        Bitmap mo98990b(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        /* JADX INFO: renamed from: c */
        int[] mo98991c(int i);

        /* JADX INFO: renamed from: d */
        void mo98992d(@NonNull Bitmap bitmap);

        /* JADX INFO: renamed from: e */
        void mo98993e(@NonNull byte[] bArr);

        /* JADX INFO: renamed from: f */
        void mo98994f(@NonNull int[] iArr);
    }

    /* JADX INFO: renamed from: a */
    void mo98984a(@NonNull Bitmap.Config config);

    void advance();

    /* JADX INFO: renamed from: b */
    void mo98985b();

    /* JADX INFO: renamed from: c */
    int mo98986c();

    void clear();

    /* JADX INFO: renamed from: d */
    int mo98987d();

    /* JADX INFO: renamed from: e */
    int mo98988e();

    @NonNull
    ByteBuffer getData();

    int getFrameCount();

    @Nullable
    Bitmap getNextFrame();
}
