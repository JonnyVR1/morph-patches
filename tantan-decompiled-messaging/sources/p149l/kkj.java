package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface kkj {

    /* JADX INFO: renamed from: l.kkj$a */
    public interface InterfaceC18040a {
        @NonNull
        /* JADX INFO: renamed from: a */
        byte[] mo141878a(int i);

        @NonNull
        /* JADX INFO: renamed from: b */
        Bitmap mo141879b(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        /* JADX INFO: renamed from: c */
        int[] mo141880c(int i);

        /* JADX INFO: renamed from: d */
        void mo141881d(@NonNull Bitmap bitmap);

        /* JADX INFO: renamed from: e */
        void mo141882e(@NonNull byte[] bArr);

        /* JADX INFO: renamed from: f */
        void mo141883f(@NonNull int[] iArr);
    }

    /* JADX INFO: renamed from: a */
    void mo127937a(@NonNull Bitmap.Config config);

    void advance();

    /* JADX INFO: renamed from: b */
    void mo127938b();

    /* JADX INFO: renamed from: c */
    int mo127939c();

    void clear();

    /* JADX INFO: renamed from: d */
    int mo127940d();

    /* JADX INFO: renamed from: e */
    int mo127941e();

    @NonNull
    ByteBuffer getData();

    int getFrameCount();

    @Nullable
    Bitmap getNextFrame();
}
