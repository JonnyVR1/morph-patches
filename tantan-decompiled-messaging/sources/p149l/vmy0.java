package p149l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface vmy0 {
    @RequiresApi(19)
    /* JADX INFO: renamed from: F */
    void mo107722F(Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo107723a(int i, int i2, int i3, long j, int i4);

    @RequiresApi(23)
    /* JADX INFO: renamed from: b */
    void mo107724b(Surface surface);

    /* JADX INFO: renamed from: c */
    void mo107725c(int i, int i2, nlx0 nlx0Var, long j, int i3);

    /* JADX INFO: renamed from: d */
    void mo107726d(int i);

    /* JADX INFO: renamed from: e */
    void mo107727e(int i, boolean z);

    /* JADX INFO: renamed from: f */
    int mo107728f(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(21)
    /* JADX INFO: renamed from: h */
    void mo107729h(int i, long j);

    int zza();

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i);

    @Nullable
    ByteBuffer zzg(int i);

    void zzi();

    void zzl();
}
