package p153l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes6.dex */
public final class lxy0 implements jxy0 {
    public /* synthetic */ lxy0(kxy0 kxy0Var) {
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: a */
    public final boolean mo147452a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && YtVideoEncoder.MIME_TYPE.equals(str2);
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: b */
    public final boolean mo147453b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p153l.jxy0
    /* JADX INFO: renamed from: e */
    public final MediaCodecInfo mo147454e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p153l.jxy0
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p153l.jxy0
    public final boolean zze() {
        return false;
    }
}
