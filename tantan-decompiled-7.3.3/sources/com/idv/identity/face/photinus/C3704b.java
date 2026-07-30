package com.idv.identity.face.photinus;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.view.Surface;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p153l.brq0;
import p153l.ep50;

/* JADX INFO: renamed from: com.idv.identity.face.photinus.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3704b {

    /* JADX INFO: renamed from: a */
    private static boolean f12852a = true;

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        MediaCodec f12853a;

        /* JADX INFO: renamed from: b */
        MediaMuxer f12854b;

        /* JADX INFO: renamed from: c */
        File f12855c;

        /* JADX INFO: renamed from: d */
        boolean f12856d;

        /* JADX INFO: renamed from: e */
        int f12857e;

        /* JADX INFO: renamed from: a */
        public boolean m18686a() {
            return (this.f12853a == null || this.f12854b == null || this.f12855c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m18680a(boolean z, MediaCodec.BufferInfo bufferInfo, a aVar) throws Exception {
        if (z) {
            try {
                aVar.f12853a.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = aVar.f12853a.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = aVar.f12853a.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = aVar.f12853a.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (aVar.f12856d) {
                    brq0.m106161a("format changed twice");
                    return;
                }
                aVar.f12857e = aVar.f12854b.addTrack(aVar.f12853a.getOutputFormat());
                aVar.f12854b.start();
                aVar.f12856d = true;
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new Exception("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!aVar.f12856d) {
                        brq0.m106161a("muxer hasn't started");
                        return;
                    } else {
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        try {
                            aVar.f12854b.writeSampleData(aVar.f12857e, byteBuffer, bufferInfo);
                        } catch (Exception unused2) {
                        }
                    }
                }
                aVar.f12853a.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18681b(Context context, List<ByteBuffer> list, int i, int i2, int i3, String str, VideoFormatConfig videoFormatConfig, ep50 ep50Var) {
        a aVarM18683d;
        f12852a = true;
        try {
            aVarM18683d = m18683d(context, i2, i3, str, videoFormatConfig, i);
        } catch (Exception e) {
            ep50Var.mo121828b(e.getMessage());
            aVarM18683d = null;
        }
        if (aVarM18683d == null || !aVarM18683d.m18686a()) {
            return;
        }
        try {
            Iterator<ByteBuffer> it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                m18682c(i4, VideoWriter.m18642F(it.next().array(), i2, i3, i), aVarM18683d);
                i4++;
            }
            m18682c(i4, null, aVarM18683d);
            MediaCodec mediaCodec = aVarM18683d.f12853a;
            if (mediaCodec != null) {
                mediaCodec.stop();
                aVarM18683d.f12853a.release();
                aVarM18683d.f12853a = null;
            }
            MediaMuxer mediaMuxer = aVarM18683d.f12854b;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                aVarM18683d.f12854b.release();
                aVarM18683d.f12854b = null;
                aVarM18683d.f12856d = false;
            }
            ep50Var.mo121827a(Uri.fromFile(aVarM18683d.f12855c));
        } catch (Exception e2) {
            ep50Var.mo121828b(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m18682c(int i, byte[] bArr, a aVar) throws Exception {
        ByteBuffer[] inputBuffers = aVar.f12853a.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = aVar.f12853a.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            long jM18670x = VideoWriter.m18670x(i);
            if (bArr == null) {
                aVar.f12853a.queueInputBuffer(iDequeueInputBuffer, 0, 0, jM18670x, 4);
                m18680a(true, bufferInfo, aVar);
                return;
            }
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            if (byteBuffer.position() == byteBuffer.capacity()) {
                aVar.f12853a.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jM18670x, 0);
                m18680a(false, bufferInfo, aVar);
                return;
            }
            throw new Exception("position=" + byteBuffer.position() + "   capacity=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit());
        }
    }

    /* JADX INFO: renamed from: d */
    private static a m18683d(Context context, int i, int i2, String str, VideoFormatConfig videoFormatConfig, int i3) throws Exception {
        MediaCodecInfo mediaCodecInfoM18684e = m18684e(YtVideoEncoder.MIME_TYPE);
        a aVar = new a();
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "Phontinus");
        File file = new File(uriWithAppendedPath.getPath());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(Uri.withAppendedPath(uriWithAppendedPath, str + ".mp4").getPath());
        aVar.f12855c = file2;
        if (file2.exists()) {
            aVar.f12855c.delete();
        }
        MediaFormat mediaFormatCreateVideoFormat = (i3 == 90 || i3 == 270) ? MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i2, i) : MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoFormatConfig.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoFormatConfig.getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        try {
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoM18684e.getName());
            aVar.f12853a = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            aVar.f12853a.start();
            try {
                aVar.f12854b = new MediaMuxer(aVar.f12855c.getAbsolutePath(), 0);
                return aVar;
            } catch (IOException e) {
                throw new Exception("create muxer error, msg = " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new Exception("create codec by name error, msg = " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private static MediaCodecInfo m18684e(String str) throws Exception {
        MediaCodecInfo mediaCodecInfoM18685f = m18685f(str);
        if (mediaCodecInfoM18685f != null) {
            return mediaCodecInfoM18685f;
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        brq0.m106161a("not support mimeType");
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static MediaCodecInfo m18685f(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (name == null) {
                    name = "";
                }
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && name.contains("google")) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }
}
