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
import p149l.whq0;
import p149l.yg50;

/* JADX INFO: renamed from: com.idv.identity.face.photinus.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3545b {

    /* JADX INFO: renamed from: a */
    private static boolean f12111a = true;

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        MediaCodec f12112a;

        /* JADX INFO: renamed from: b */
        MediaMuxer f12113b;

        /* JADX INFO: renamed from: c */
        File f12114c;

        /* JADX INFO: renamed from: d */
        boolean f12115d;

        /* JADX INFO: renamed from: e */
        int f12116e;

        /* JADX INFO: renamed from: a */
        public boolean m17609a() {
            return (this.f12112a == null || this.f12113b == null || this.f12114c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m17603a(boolean z, MediaCodec.BufferInfo bufferInfo, a aVar) throws Exception {
        if (z) {
            try {
                aVar.f12112a.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = aVar.f12112a.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = aVar.f12112a.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = aVar.f12112a.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (aVar.f12115d) {
                    whq0.m203241a("format changed twice");
                    return;
                }
                aVar.f12116e = aVar.f12113b.addTrack(aVar.f12112a.getOutputFormat());
                aVar.f12113b.start();
                aVar.f12115d = true;
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new Exception("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!aVar.f12115d) {
                        whq0.m203241a("muxer hasn't started");
                        return;
                    } else {
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        try {
                            aVar.f12113b.writeSampleData(aVar.f12116e, byteBuffer, bufferInfo);
                        } catch (Exception unused2) {
                        }
                    }
                }
                aVar.f12112a.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17604b(Context context, List<ByteBuffer> list, int i, int i2, int i3, String str, VideoFormatConfig videoFormatConfig, yg50 yg50Var) {
        a aVarM17606d;
        f12111a = true;
        try {
            aVarM17606d = m17606d(context, i2, i3, str, videoFormatConfig, i);
        } catch (Exception e) {
            yg50Var.mo182301b(e.getMessage());
            aVarM17606d = null;
        }
        if (aVarM17606d == null || !aVarM17606d.m17609a()) {
            return;
        }
        try {
            Iterator<ByteBuffer> it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                m17605c(i4, VideoWriter.m17565F(it.next().array(), i2, i3, i), aVarM17606d);
                i4++;
            }
            m17605c(i4, null, aVarM17606d);
            MediaCodec mediaCodec = aVarM17606d.f12112a;
            if (mediaCodec != null) {
                mediaCodec.stop();
                aVarM17606d.f12112a.release();
                aVarM17606d.f12112a = null;
            }
            MediaMuxer mediaMuxer = aVarM17606d.f12113b;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                aVarM17606d.f12113b.release();
                aVarM17606d.f12113b = null;
                aVarM17606d.f12115d = false;
            }
            yg50Var.mo182300a(Uri.fromFile(aVarM17606d.f12114c));
        } catch (Exception e2) {
            yg50Var.mo182301b(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m17605c(int i, byte[] bArr, a aVar) throws Exception {
        ByteBuffer[] inputBuffers = aVar.f12112a.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = aVar.f12112a.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            long jM17593x = VideoWriter.m17593x(i);
            if (bArr == null) {
                aVar.f12112a.queueInputBuffer(iDequeueInputBuffer, 0, 0, jM17593x, 4);
                m17603a(true, bufferInfo, aVar);
                return;
            }
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            if (byteBuffer.position() == byteBuffer.capacity()) {
                aVar.f12112a.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jM17593x, 0);
                m17603a(false, bufferInfo, aVar);
                return;
            }
            throw new Exception("position=" + byteBuffer.position() + "   capacity=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit());
        }
    }

    /* JADX INFO: renamed from: d */
    private static a m17606d(Context context, int i, int i2, String str, VideoFormatConfig videoFormatConfig, int i3) throws Exception {
        MediaCodecInfo mediaCodecInfoM17607e = m17607e(YtVideoEncoder.MIME_TYPE);
        a aVar = new a();
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "Phontinus");
        File file = new File(uriWithAppendedPath.getPath());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(Uri.withAppendedPath(uriWithAppendedPath, str + ".mp4").getPath());
        aVar.f12114c = file2;
        if (file2.exists()) {
            aVar.f12114c.delete();
        }
        MediaFormat mediaFormatCreateVideoFormat = (i3 == 90 || i3 == 270) ? MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i2, i) : MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoFormatConfig.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoFormatConfig.getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        try {
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoM17607e.getName());
            aVar.f12112a = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            aVar.f12112a.start();
            try {
                aVar.f12113b = new MediaMuxer(aVar.f12114c.getAbsolutePath(), 0);
                return aVar;
            } catch (IOException e) {
                throw new Exception("create muxer error, msg = " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new Exception("create codec by name error, msg = " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private static MediaCodecInfo m17607e(String str) throws Exception {
        MediaCodecInfo mediaCodecInfoM17608f = m17608f(str);
        if (mediaCodecInfoM17608f != null) {
            return mediaCodecInfoM17608f;
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
        whq0.m203241a("not support mimeType");
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static MediaCodecInfo m17608f(String str) {
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
