package p149l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ty00 extends xt10 {

    /* JADX INFO: renamed from: g */
    private MediaMuxer f172554g;

    /* JADX INFO: renamed from: c */
    private final String f172550c = "Mp4MuxerWrapper";

    /* JADX INFO: renamed from: d */
    private int f172551d = -1;

    /* JADX INFO: renamed from: e */
    private int f172552e = -1;

    /* JADX INFO: renamed from: f */
    private Object f172553f = new Object();

    /* JADX INFO: renamed from: h */
    private boolean f172555h = false;

    public ty00(String str, int i) throws IOException {
        this.f172554g = null;
        if (str == null || i < 1 || i > 3) {
            ig3.m135964a("Invalid file path or media track info");
            throw null;
        }
        this.f172554g = new MediaMuxer(str, 0);
        this.f194346b = i;
    }

    /* JADX INFO: renamed from: g */
    private String m190994g() {
        int i = this.f194345a;
        if (i == 1) {
            return "audio";
        }
        return i == 2 ? "video" : "audio/video";
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: a */
    public int mo190995a(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            kwv.m147653c("Mp4MuxerWrapper", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        synchronized (this.f172553f) {
            try {
                MediaMuxer mediaMuxer = this.f172554g;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.f194345a |= i;
                    kwv.m147651a("Mp4MuxerWrapper", "Add track info " + m190994g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iAddTrack;
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: b */
    public boolean mo190996b() {
        return this.f172555h;
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: c */
    public void mo190997c(int i) {
        MediaMuxer mediaMuxer = this.f172554g;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(i);
        }
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: d */
    public void mo190998d() {
        synchronized (this.f172553f) {
            try {
                if (!this.f172555h && this.f194346b == this.f194345a) {
                    MediaMuxer mediaMuxer = this.f172554g;
                    if (mediaMuxer != null) {
                        mediaMuxer.start();
                        this.f172555h = true;
                    }
                    kwv.m147653c("Mp4MuxerWrapper", "Start Media muxing !!" + m190994g());
                    return;
                }
                kwv.m147655e("Mp4MuxerWrapper", "Meida info not enough , need waitting, already have " + m190994g());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: e */
    public void mo190999e() {
        synchronized (this.f172553f) {
            MediaMuxer mediaMuxer = this.f172554g;
            if (mediaMuxer != null && this.f172555h) {
                try {
                    mediaMuxer.stop();
                    this.f172554g.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f172554g = null;
                this.f172555h = false;
            }
        }
        kwv.m147651a("Mp4MuxerWrapper", "Stop media muxing !" + this.f194346b);
    }

    @Override // p149l.xt10
    /* JADX INFO: renamed from: f */
    public boolean mo191000f(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f172553f) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    kwv.m147653c("Mp4MuxerWrapper", "[writeSampleData] Invalid Parameter !! ByteBuffer or BufferInfo is null");
                    return false;
                }
                if (this.f172555h) {
                    MediaMuxer mediaMuxer = this.f172554g;
                    if (mediaMuxer != null) {
                        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    }
                    return true;
                }
                kwv.m147655e("Mp4MuxerWrapper", "Media muxer not started !!, already have media type:" + m190994g());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
