package p153l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
public final class mxy0 implements jxy0 {

    /* JADX INFO: renamed from: a */
    public final int f139303a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public MediaCodecInfo[] f139304b;

    public mxy0(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f139303a = i;
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: a */
    public final boolean mo147452a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: b */
    public final boolean mo147453b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    /* JADX INFO: renamed from: c */
    public final void m160712c() {
        if (this.f139304b == null) {
            this.f139304b = new MediaCodecList(this.f139303a).getCodecInfos();
        }
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: e */
    public final MediaCodecInfo mo147454e(int i) {
        m160712c();
        return this.f139304b[i];
    }

    @Override // p153l.jxy0
    public final int zza() {
        m160712c();
        return this.f139304b.length;
    }

    @Override // p153l.jxy0
    public final boolean zze() {
        return true;
    }
}
