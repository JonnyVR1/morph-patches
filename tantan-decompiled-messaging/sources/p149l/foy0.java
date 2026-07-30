package p149l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes6.dex */
public final class foy0 implements doy0 {
    public /* synthetic */ foy0(eoy0 eoy0Var) {
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: a */
    public final boolean mo112837a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && YtVideoEncoder.MIME_TYPE.equals(str2);
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: b */
    public final boolean mo112838b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p149l.doy0
    /* JADX INFO: renamed from: e */
    public final MediaCodecInfo mo112839e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p149l.doy0
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p149l.doy0
    public final boolean zze() {
        return false;
    }
}
