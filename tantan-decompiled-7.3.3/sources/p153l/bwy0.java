package p153l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface bwy0 {
    @RequiresApi(19)
    /* JADX INFO: renamed from: F */
    void mo106813F(Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo106814a(int i, int i2, int i3, long j, int i4);

    @RequiresApi(23)
    /* JADX INFO: renamed from: b */
    void mo106815b(Surface surface);

    /* JADX INFO: renamed from: c */
    void mo106816c(int i, int i2, tux0 tux0Var, long j, int i3);

    /* JADX INFO: renamed from: d */
    void mo106817d(int i);

    /* JADX INFO: renamed from: e */
    void mo106818e(int i, boolean z);

    /* JADX INFO: renamed from: f */
    int mo106819f(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(21)
    /* JADX INFO: renamed from: h */
    void mo106820h(int i, long j);

    int zza();

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i);

    @Nullable
    ByteBuffer zzg(int i);

    void zzi();

    void zzl();
}
