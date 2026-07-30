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
import p149l.kwv;
import p149l.u460;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.j */
/* JADX INFO: loaded from: classes7.dex */
public class C3853j extends AbstractC3849f {

    /* JADX INFO: renamed from: j */
    private MediaFormat f13438j;

    /* JADX INFO: renamed from: b */
    private final String f13430b = "MediaDemuxerWrapper";

    /* JADX INFO: renamed from: c */
    private MediaExtractor f13431c = null;

    /* JADX INFO: renamed from: e */
    private int f13433e = 1048576;

    /* JADX INFO: renamed from: f */
    private int f13434f = -1;

    /* JADX INFO: renamed from: g */
    private int f13435g = -1;

    /* JADX INFO: renamed from: h */
    private Object f13436h = new Object();

    /* JADX INFO: renamed from: i */
    private final String f13437i = Build.MANUFACTURER;

    /* JADX INFO: renamed from: d */
    private List<MediaFormat> f13432d = new ArrayList();

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: a */
    public int mo18755a() {
        return this.f13433e;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: b */
    public List<MediaFormat> mo18756b() {
        return this.f13432d;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: c */
    public boolean mo18757c(String str) {
        synchronized (this.f13436h) {
            try {
                if (this.f13431c == null) {
                    try {
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        this.f13431c = mediaExtractor;
                        mediaExtractor.setDataSource(str);
                        int trackCount = this.f13431c.getTrackCount();
                        for (int i = 0; i < trackCount; i++) {
                            MediaFormat trackFormat = this.f13431c.getTrackFormat(i);
                            this.f13432d.add(trackFormat);
                            if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                this.f13434f = i;
                            } else if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                this.f13435g = i;
                            }
                        }
                        kwv.m147653c("MediaDemuxerWrapper", "durations is " + this.f13431c.getCachedDuration() + "  ");
                    } catch (Exception e) {
                        kwv.m147653c("MediaDemuxerWrapper", e.getMessage());
                        AbstractC3849f.a aVar = this.f13316a;
                        if (aVar != null) {
                            aVar.mo18699a(zzf0.m221017a(e) + " file:" + str);
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

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: d */
    public int mo18758d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13436h) {
            try {
                if (bufferInfo == null || byteBuffer == null) {
                    return -1;
                }
                byteBuffer.position(0);
                int sampleData = this.f13431c.readSampleData(byteBuffer, 0);
                if (sampleData > 0) {
                    byteBuffer.position(0);
                    int sampleTrackIndex = this.f13431c.getSampleTrackIndex();
                    long sampleTime = this.f13431c.getSampleTime();
                    if (sampleTrackIndex != -1) {
                        this.f13431c.getTrackFormat(sampleTrackIndex);
                    }
                    bufferInfo.set(0, sampleData, sampleTime, this.f13431c.getSampleFlags());
                    this.f13431c.advance();
                }
                return sampleData;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: e */
    public void mo18759e() {
        synchronized (this.f13436h) {
            try {
                MediaExtractor mediaExtractor = this.f13431c;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    this.f13431c = null;
                }
                this.f13432d.clear();
                this.f13434f = -1;
                this.f13435g = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: f */
    public void mo18760f(long j) {
        synchronized (this.f13436h) {
            try {
                MediaExtractor mediaExtractor = this.f13431c;
                if (mediaExtractor != null) {
                    mediaExtractor.seekTo(j, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3849f
    /* JADX INFO: renamed from: g */
    public boolean mo18761g(MediaFormat mediaFormat) {
        int integer;
        synchronized (this.f13436h) {
            try {
                if (this.f13431c == null) {
                    kwv.m147653c("MediaDemuxerWrapper", "Mp4Demuxer not init !!");
                    return false;
                }
                this.f13438j = mediaFormat;
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                int trackCount = this.f13431c.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = this.f13431c.getTrackFormat(i);
                    if (string.compareTo(trackFormat.getString(IMediaFormat.KEY_MIME)) == 0) {
                        this.f13431c.selectTrack(i);
                        if (trackFormat.containsKey("max-input-size") && this.f13433e < (integer = trackFormat.getInteger("max-input-size"))) {
                            this.f13433e = integer + 200;
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
    public u460 m18865i(u460 u460Var) {
        synchronized (this.f13436h) {
            if (u460Var == null) {
                try {
                    u460Var = new u460(this.f13433e);
                } catch (Throwable th) {
                    throw th;
                }
            }
            u460 u460Var2 = u460Var;
            ByteBuffer byteBufferM191672a = u460Var2.m191672a();
            byteBufferM191672a.position(0);
            int sampleData = this.f13431c.readSampleData(byteBufferM191672a, 0);
            if (sampleData <= 0) {
                return null;
            }
            byteBufferM191672a.position(0);
            int sampleTrackIndex = this.f13431c.getSampleTrackIndex();
            long sampleTime = this.f13431c.getSampleTime();
            if (sampleTrackIndex == this.f13434f) {
                u460Var2.m191675d(sampleData, 0, this.f13431c.getSampleFlags(), sampleTime, 0);
            } else if (sampleTrackIndex == this.f13435g) {
                if (!this.f13437i.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI) || byteBufferM191672a.capacity() - byteBufferM191672a.limit() <= 8) {
                    u460Var2.m191675d(sampleData, 0, this.f13431c.getSampleFlags(), sampleTime, 1);
                } else {
                    u460Var2.m191675d(sampleData + 8, 0, this.f13431c.getSampleFlags(), sampleTime, 1);
                }
            }
            this.f13431c.advance();
            return u460Var2;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m18866j(String str) {
        mo18759e();
        if (str == null) {
            return true;
        }
        if (!mo18757c(str)) {
            return false;
        }
        Iterator<MediaFormat> it = this.f13432d.iterator();
        while (it.hasNext()) {
            if (!mo18761g(it.next())) {
                return false;
            }
        }
        return true;
    }
}
