package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.ad60;
import p153l.g8g0;
import p153l.lyv;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.j */
/* JADX INFO: loaded from: classes7.dex */
public class C3996j extends AbstractC3992f {

    /* JADX INFO: renamed from: j */
    private MediaFormat f14132j;

    /* JADX INFO: renamed from: b */
    private final String f14124b = "MediaDemuxerWrapper";

    /* JADX INFO: renamed from: c */
    private MediaExtractor f14125c = null;

    /* JADX INFO: renamed from: e */
    private int f14127e = 1048576;

    /* JADX INFO: renamed from: f */
    private int f14128f = -1;

    /* JADX INFO: renamed from: g */
    private int f14129g = -1;

    /* JADX INFO: renamed from: h */
    private Object f14130h = new Object();

    /* JADX INFO: renamed from: i */
    private final String f14131i = Build.MANUFACTURER;

    /* JADX INFO: renamed from: d */
    private List<MediaFormat> f14126d = new ArrayList();

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: a */
    public int mo19735a() {
        return this.f14127e;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: b */
    public List<MediaFormat> mo19736b() {
        return this.f14126d;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: c */
    public boolean mo19737c(String str) {
        synchronized (this.f14130h) {
            try {
                if (this.f14125c == null) {
                    try {
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        this.f14125c = mediaExtractor;
                        mediaExtractor.setDataSource(str);
                        int trackCount = this.f14125c.getTrackCount();
                        for (int i = 0; i < trackCount; i++) {
                            MediaFormat trackFormat = this.f14125c.getTrackFormat(i);
                            this.f14126d.add(trackFormat);
                            if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                this.f14128f = i;
                            } else if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                this.f14129g = i;
                            }
                        }
                        lyv.m156389c("MediaDemuxerWrapper", "durations is " + this.f14125c.getCachedDuration() + "  ");
                    } catch (Exception e) {
                        lyv.m156389c("MediaDemuxerWrapper", e.getMessage());
                        AbstractC3992f.a aVar = this.f14010a;
                        if (aVar != null) {
                            aVar.mo19679a(g8g0.m129406a(e) + " file:" + str);
                        }
                        return false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: d */
    public int mo19738d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14130h) {
            try {
                if (bufferInfo == null || byteBuffer == null) {
                    return -1;
                }
                byteBuffer.position(0);
                int sampleData = this.f14125c.readSampleData(byteBuffer, 0);
                if (sampleData > 0) {
                    byteBuffer.position(0);
                    int sampleTrackIndex = this.f14125c.getSampleTrackIndex();
                    long sampleTime = this.f14125c.getSampleTime();
                    if (sampleTrackIndex != -1) {
                        this.f14125c.getTrackFormat(sampleTrackIndex);
                    }
                    bufferInfo.set(0, sampleData, sampleTime, this.f14125c.getSampleFlags());
                    this.f14125c.advance();
                }
                return sampleData;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: e */
    public void mo19739e() {
        synchronized (this.f14130h) {
            try {
                MediaExtractor mediaExtractor = this.f14125c;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    this.f14125c = null;
                }
                this.f14126d.clear();
                this.f14128f = -1;
                this.f14129g = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: f */
    public void mo19740f(long j) {
        synchronized (this.f14130h) {
            try {
                MediaExtractor mediaExtractor = this.f14125c;
                if (mediaExtractor != null) {
                    mediaExtractor.seekTo(j, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3992f
    /* JADX INFO: renamed from: g */
    public boolean mo19741g(MediaFormat mediaFormat) {
        int integer;
        synchronized (this.f14130h) {
            try {
                if (this.f14125c == null) {
                    lyv.m156389c("MediaDemuxerWrapper", "Mp4Demuxer not init !!");
                    return false;
                }
                this.f14132j = mediaFormat;
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                int trackCount = this.f14125c.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = this.f14125c.getTrackFormat(i);
                    if (string.compareTo(trackFormat.getString(IMediaFormat.KEY_MIME)) == 0) {
                        this.f14125c.selectTrack(i);
                        if (trackFormat.containsKey("max-input-size") && this.f14127e < (integer = trackFormat.getInteger("max-input-size"))) {
                            this.f14127e = integer + 200;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public ad60 m19845i(ad60 ad60Var) {
        synchronized (this.f14130h) {
            if (ad60Var == null) {
                try {
                    ad60Var = new ad60(this.f14127e);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ad60 ad60Var2 = ad60Var;
            ByteBuffer byteBufferM97015a = ad60Var2.m97015a();
            byteBufferM97015a.position(0);
            int sampleData = this.f14125c.readSampleData(byteBufferM97015a, 0);
            if (sampleData <= 0) {
                return null;
            }
            byteBufferM97015a.position(0);
            int sampleTrackIndex = this.f14125c.getSampleTrackIndex();
            long sampleTime = this.f14125c.getSampleTime();
            if (sampleTrackIndex == this.f14128f) {
                ad60Var2.m97018d(sampleData, 0, this.f14125c.getSampleFlags(), sampleTime, 0);
            } else if (sampleTrackIndex == this.f14129g) {
                if (!this.f14131i.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || byteBufferM97015a.capacity() - byteBufferM97015a.limit() <= 8) {
                    ad60Var2.m97018d(sampleData, 0, this.f14125c.getSampleFlags(), sampleTime, 1);
                } else {
                    ad60Var2.m97018d(sampleData + 8, 0, this.f14125c.getSampleFlags(), sampleTime, 1);
                }
            }
            this.f14125c.advance();
            return ad60Var2;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m19846j(String str) {
        mo19739e();
        if (str == null) {
            return true;
        }
        if (!mo19737c(str)) {
            return false;
        }
        Iterator<MediaFormat> it = this.f14126d.iterator();
        while (it.hasNext()) {
            if (!mo19741g(it.next())) {
                return false;
            }
        }
        return true;
    }
}
