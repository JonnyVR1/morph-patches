package p149l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
public final class goy0 implements doy0 {

    /* JADX INFO: renamed from: a */
    public final int f103745a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public MediaCodecInfo[] f103746b;

    public goy0(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f103745a = i;
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: a */
    public final boolean mo112837a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: b */
    public final boolean mo112838b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    /* JADX INFO: renamed from: c */
    public final void m127311c() {
        if (this.f103746b == null) {
            this.f103746b = new MediaCodecList(this.f103745a).getCodecInfos();
        }
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: e */
    public final MediaCodecInfo mo112839e(int i) {
        m127311c();
        return this.f103746b[i];
    }

    @Override // p149l.doy0
    public final int zza() {
        m127311c();
        return this.f103746b.length;
    }

    @Override // p149l.doy0
    public final boolean zze() {
        return true;
    }
}
