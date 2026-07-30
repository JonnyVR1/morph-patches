package p153l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class d710 extends f220 {

    /* JADX INFO: renamed from: g */
    private MediaMuxer f85443g;

    /* JADX INFO: renamed from: c */
    private final String f85439c = "Mp4MuxerWrapper";

    /* JADX INFO: renamed from: d */
    private int f85440d = -1;

    /* JADX INFO: renamed from: e */
    private int f85441e = -1;

    /* JADX INFO: renamed from: f */
    private Object f85442f = new Object();

    /* JADX INFO: renamed from: h */
    private boolean f85444h = false;

    public d710(String str, int i) throws IOException {
        this.f85443g = null;
        if (str == null || i < 1 || i > 3) {
            wg3.m206174a("Invalid file path or media track info");
            throw null;
        }
        this.f85443g = new MediaMuxer(str, 0);
        this.f96850b = i;
    }

    /* JADX INFO: renamed from: g */
    private String m114577g() {
        int i = this.f96849a;
        if (i == 1) {
            return "audio";
        }
        return i == 2 ? "video" : "audio/video";
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: a */
    public int mo114578a(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            lyv.m156389c("Mp4MuxerWrapper", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        synchronized (this.f85442f) {
            try {
                MediaMuxer mediaMuxer = this.f85443g;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.f96849a |= i;
                    lyv.m156387a("Mp4MuxerWrapper", "Add track info " + m114577g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iAddTrack;
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: b */
    public boolean mo114579b() {
        return this.f85444h;
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: c */
    public void mo114580c(int i) {
        MediaMuxer mediaMuxer = this.f85443g;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(i);
        }
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: d */
    public void mo114581d() {
        synchronized (this.f85442f) {
            try {
                if (!this.f85444h && this.f96850b == this.f96849a) {
                    MediaMuxer mediaMuxer = this.f85443g;
                    if (mediaMuxer != null) {
                        mediaMuxer.start();
                        this.f85444h = true;
                    }
                    lyv.m156389c("Mp4MuxerWrapper", "Start Media muxing !!" + m114577g());
                    return;
                }
                lyv.m156391e("Mp4MuxerWrapper", "Meida info not enough , need waitting, already have " + m114577g());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: e */
    public void mo114582e() {
        synchronized (this.f85442f) {
            MediaMuxer mediaMuxer = this.f85443g;
            if (mediaMuxer != null && this.f85444h) {
                try {
                    mediaMuxer.stop();
                    this.f85443g.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f85443g = null;
                this.f85444h = false;
            }
        }
        lyv.m156387a("Mp4MuxerWrapper", "Stop media muxing !" + this.f96850b);
    }

    @Override // p153l.f220
    /* JADX INFO: renamed from: f */
    public boolean mo114583f(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f85442f) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    lyv.m156389c("Mp4MuxerWrapper", "[writeSampleData] Invalid Parameter !! ByteBuffer or BufferInfo is null");
                    return false;
                }
                if (this.f85444h) {
                    MediaMuxer mediaMuxer = this.f85443g;
                    if (mediaMuxer != null) {
                        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    }
                    return true;
                }
                lyv.m156391e("Mp4MuxerWrapper", "Media muxer not started !!, already have media type:" + m114577g());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
