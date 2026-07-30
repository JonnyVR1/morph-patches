package com.tencent.liteav.videodecoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14484e implements InterfaceC14481b {

    /* JADX INFO: renamed from: r */
    private InterfaceC14485f f60807r;

    /* JADX INFO: renamed from: u */
    private WeakReference<InterfaceC14170b> f60810u;

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f60790a = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: b */
    private MediaCodec f60791b = null;

    /* JADX INFO: renamed from: c */
    private String f60792c = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: d */
    private int f60793d = 540;

    /* JADX INFO: renamed from: e */
    private int f60794e = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

    /* JADX INFO: renamed from: f */
    private long f60795f = 0;

    /* JADX INFO: renamed from: g */
    private long f60796g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f60797h = true;

    /* JADX INFO: renamed from: i */
    private boolean f60798i = false;

    /* JADX INFO: renamed from: j */
    private boolean f60799j = false;

    /* JADX INFO: renamed from: k */
    private Surface f60800k = null;

    /* JADX INFO: renamed from: l */
    private int f60801l = 0;

    /* JADX INFO: renamed from: m */
    private ArrayList<TXSNALPacket> f60802m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private ArrayList<Long> f60803n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    private long f60804o = 0;

    /* JADX INFO: renamed from: p */
    private int f60805p = 0;

    /* JADX INFO: renamed from: q */
    private JSONArray f60806q = null;

    /* JADX INFO: renamed from: s */
    private C14483d f60808s = new C14483d();

    /* JADX INFO: renamed from: t */
    private boolean f60809t = false;

    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private int m85229a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        MediaCodec mediaCodec;
        int i = -1;
        int i2 = 0;
        try {
            if (this.f60791b == null && this.f60800k != null) {
                this.f60799j = z;
                if (z) {
                    this.f60792c = "video/hevc";
                } else {
                    this.f60792c = YtVideoEncoder.MIME_TYPE;
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f60792c, this.f60793d, this.f60794e);
                if (byteBuffer != null) {
                    mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBuffer);
                }
                if (byteBuffer2 != null) {
                    mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                }
                JSONArray jSONArray = this.f60806q;
                if (jSONArray != null) {
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                            mediaFormatCreateVideoFormat.setInteger(jSONObject.optString(Constants.KEY_KEY), jSONObject.optInt("value"));
                        } catch (Exception e) {
                            TXCLog.m84156w("MediaCodecDecoder", "config custom format error " + e.toString());
                        }
                    }
                }
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.f60792c);
                this.f60791b = mediaCodecCreateDecoderByType;
                try {
                    mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, this.f60800k, (MediaCrypto) null, 0);
                    int i4 = 2;
                    try {
                        this.f60791b.setVideoScalingMode(1);
                        this.f60791b.start();
                        i4 = 4;
                        TXCLog.m84156w("MediaCodecDecoder", "decode: start decoder success, is hevc: " + this.f60799j + " w = " + this.f60793d + " h = " + this.f60794e + ", format = " + mediaFormatCreateVideoFormat.toString());
                        try {
                            this.f60801l = 0;
                            return 0;
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            i2 = i4;
                            e = e;
                            mediaCodec = this.f60791b;
                            if (mediaCodec != null) {
                                try {
                                    try {
                                        mediaCodec.release();
                                        TXCLog.m84156w("MediaCodecDecoder", "decode: , decoder release success");
                                    } catch (Exception unused) {
                                        TXCLog.m84149e("MediaCodecDecoder", "decode: , decoder release exception: " + e.toString());
                                    }
                                    this.f60791b = null;
                                } catch (Throwable th) {
                                    this.f60791b = null;
                                    throw th;
                                }
                            }
                            TXCLog.m84149e("MediaCodecDecoder", "decode: init decoder " + i2 + " step exception: " + e.toString());
                            e.printStackTrace();
                            m85238f();
                            return i;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    i2 = 1;
                }
            }
            TXCLog.m84149e("MediaCodecDecoder", "decode: init decoder error, can not init for decoder=" + this.f60791b + ",surface=" + this.f60800k);
            return -1;
        } catch (Exception e5) {
            e = e5;
            mediaCodec = this.f60791b;
            if (mediaCodec != null) {
                mediaCodec.release();
                TXCLog.m84156w("MediaCodecDecoder", "decode: , decoder release success");
                this.f60791b = null;
            }
            TXCLog.m84149e("MediaCodecDecoder", "decode: init decoder " + i2 + " step exception: " + e.toString());
            e.printStackTrace();
            m85238f();
            return i;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    private void m85234b() {
        ByteBuffer[] inputBuffers;
        int iDequeueInputBuffer;
        long j;
        if (this.f60791b == null) {
            TXCLog.m84149e("MediaCodecDecoder", "null decoder");
            return;
        }
        TXSNALPacket tXSNALPacket = this.f60802m.get(0);
        if (tXSNALPacket == null || tXSNALPacket.nalData.length == 0) {
            TXCLog.m84149e("MediaCodecDecoder", "decode: empty buffer");
            this.f60802m.remove(0);
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        if (this.f60804o == 0) {
            this.f60804o = timeTick;
        }
        try {
            inputBuffers = this.f60791b.getInputBuffers();
        } catch (Exception e) {
            TXCLog.m84149e("MediaCodecDecoder", "decode: getInputBuffers Exception!! " + e.toString());
            inputBuffers = null;
        }
        ByteBuffer[] byteBufferArr = inputBuffers;
        if (byteBufferArr == null || byteBufferArr.length == 0) {
            TXCLog.m84149e("MediaCodecDecoder", "decode: getInputBuffers failed");
            return;
        }
        int iDequeueOutputBuffer = ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
        try {
            iDequeueInputBuffer = this.f60791b.dequeueInputBuffer(10000L);
        } catch (Exception e2) {
            TXCLog.m84149e("MediaCodecDecoder", "decode: dequeueInputBuffer Exception!! " + e2.toString());
            iDequeueInputBuffer = -10000;
        }
        if (iDequeueInputBuffer >= 0) {
            byteBufferArr[iDequeueInputBuffer].put(tXSNALPacket.nalData);
            try {
                j = 0;
                try {
                    this.f60791b.queueInputBuffer(iDequeueInputBuffer, 0, tXSNALPacket.nalData.length, tXSNALPacket.pts, 0);
                    this.f60802m.remove(0);
                } catch (Exception unused) {
                    m85239g();
                }
            } catch (Exception unused2) {
                j = 0;
            }
            if (this.f60795f == j) {
                TXCLog.m84156w("MediaCodecDecoder", "decode: input buffer available, dequeueInputBuffer index: " + iDequeueInputBuffer);
            }
        } else {
            j = 0;
            TXCLog.m84156w("MediaCodecDecoder", "decode: input buffer not available, dequeueInputBuffer failed");
        }
        try {
            iDequeueOutputBuffer = this.f60791b.dequeueOutputBuffer(this.f60790a, 10000L);
        } catch (Exception e3) {
            m85239g();
            TXCLog.m84149e("MediaCodecDecoder", "decode: dequeueOutputBuffer exception!!" + e3);
        }
        if (iDequeueOutputBuffer >= 0) {
            long j2 = this.f60790a.presentationTimeUs;
            m85231a(iDequeueOutputBuffer, j2, j2, tXSNALPacket.rotation);
            this.f60801l = 0;
        } else if (iDequeueOutputBuffer == -1) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            TXCLog.m84152i("MediaCodecDecoder", "decode: no output from decoder available when timeout fail count " + this.f60801l);
            m85239g();
        } else if (iDequeueOutputBuffer == -3) {
            TXCLog.m84152i("MediaCodecDecoder", "decode: output buffers changed");
        } else if (iDequeueOutputBuffer == -2) {
            m85235c();
        } else {
            TXCLog.m84149e("MediaCodecDecoder", "decode: unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
        }
        long timeTick2 = TXCTimeUtil.getTimeTick();
        this.f60803n.add(Long.valueOf(timeTick2 - timeTick));
        if (timeTick2 > this.f60804o + 1000) {
            long jLongValue = j;
            for (Long l2 : this.f60803n) {
                if (l2.longValue() > jLongValue) {
                    jLongValue = l2.longValue();
                }
            }
            this.f60803n.clear();
            this.f60804o = timeTick2;
            this.f60805p = (int) (jLongValue * 3);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m85235c() {
        int i;
        MediaFormat outputFormat = this.f60791b.getOutputFormat();
        TXCLog.m84152i("MediaCodecDecoder", "decode output format changed: " + outputFormat);
        int iAbs = Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
        int iAbs2 = Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
        int integer = outputFormat.getInteger("width");
        int integer2 = outputFormat.getInteger("height");
        int iMin = Math.min(iAbs, integer);
        int iMin2 = Math.min(iAbs2, integer2);
        int i2 = this.f60793d;
        if (iMin == i2 && iMin2 == (i = this.f60794e)) {
            if (this.f60797h) {
                this.f60797h = false;
                InterfaceC14485f interfaceC14485f = this.f60807r;
                if (interfaceC14485f != null) {
                    interfaceC14485f.onVideoSizeChange(i2, i);
                    return;
                }
                return;
            }
            return;
        }
        this.f60793d = iMin;
        this.f60794e = iMin2;
        try {
            InterfaceC14485f interfaceC14485f2 = this.f60807r;
            if (interfaceC14485f2 != null) {
                interfaceC14485f2.onVideoSizeChange(iMin, iMin2);
            }
        } catch (Exception e) {
            TXCLog.m84150e("MediaCodecDecoder", "onVideoSizeChange failed.", e);
        }
        TXCLog.m84152i("MediaCodecDecoder", "decode: video size change to w:" + iMin + ",h:" + iMin2);
    }

    /* JADX INFO: renamed from: d */
    private void m85236d() {
        if (this.f60795f == 0) {
            TXCLog.m84156w("MediaCodecDecoder", "decode first frame sucess");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f60795f;
        if (j > 0 && jCurrentTimeMillis > j + 1000) {
            long j2 = this.f60796g;
            if (jCurrentTimeMillis > 2000 + j2 && j2 != 0) {
                TXCLog.m84149e("MediaCodecDecoder", "frame interval[" + (jCurrentTimeMillis - this.f60795f) + "] > 1000");
                this.f60796g = jCurrentTimeMillis;
            }
        }
        if (this.f60796g == 0) {
            this.f60796g = jCurrentTimeMillis;
        }
        this.f60795f = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    private boolean m85237e() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc")) {
                    TXCLog.m84149e("MediaCodecDecoder", "decode: video/hevc MediaCodecInfo: " + mediaCodecInfo.getName() + ",encoder:" + mediaCodecInfo.isEncoder());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private void m85238f() {
        if (this.f60798i) {
            return;
        }
        TXCLog.m84156w("MediaCodecDecoder", "decode: hw decode error, hevc: " + this.f60799j);
        boolean z = this.f60799j;
        WeakReference<InterfaceC14170b> weakReference = this.f60810u;
        if (z) {
            C14215f.m84219a(weakReference, -2304, "h265 Decoding failed");
        } else {
            C14215f.m84219a(weakReference, 2106, "Failed to enable hardware decoding，use software decoding.");
        }
        this.f60798i = true;
        InterfaceC14485f interfaceC14485f = this.f60807r;
        if (interfaceC14485f != null) {
            interfaceC14485f.onDecodeFailed(-1);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m85239g() {
        int i = this.f60801l;
        if (i < 40) {
            this.f60801l = i + 1;
        } else {
            m85238f();
            this.f60801l = 0;
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int GetDecodeCost() {
        return this.f60805p;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int config(Surface surface) {
        if (surface == null) {
            return -1;
        }
        this.f60800k = surface;
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void decode(TXSNALPacket tXSNALPacket) {
        m85233a(tXSNALPacket.codecId == 1);
        m85232a(tXSNALPacket);
        this.f60802m.add(tXSNALPacket);
        while (!this.f60802m.isEmpty()) {
            int size = this.f60802m.size();
            try {
                m85234b();
            } catch (Exception e) {
                TXCLog.m84149e("MediaCodecDecoder", "decode: doDecode Exception!! " + e.toString());
            }
            if (size == this.f60802m.size()) {
                return;
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void enableLimitDecCache(boolean z) {
        this.f60809t = z;
        TXCLog.m84152i("MediaCodecDecoder", "decode: enable limit dec cache: " + z);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public boolean isHevc() {
        return this.f60799j;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void setListener(InterfaceC14485f interfaceC14485f) {
        this.f60807r = interfaceC14485f;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void setNotifyListener(WeakReference<InterfaceC14170b> weakReference) {
        this.f60810u = weakReference;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2) {
        return m85229a(byteBuffer, byteBuffer2, z2);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void stop() {
        m85230a();
    }

    /* JADX INFO: renamed from: a */
    public void m85240a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f60793d = i;
        this.f60794e = i2;
        TXCLog.m84156w("MediaCodecDecoder", "decode: init with video size: " + this.f60793d + ", " + this.f60794e);
    }

    /* JADX INFO: renamed from: a */
    public void m85241a(JSONArray jSONArray) {
        this.f60806q = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private void m85230a() {
        MediaCodec mediaCodec = this.f60791b;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                    TXCLog.m84156w("MediaCodecDecoder", "decode: stop decoder sucess");
                    try {
                        try {
                            this.f60791b.release();
                            TXCLog.m84156w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Throwable th) {
                            this.f60791b = null;
                            throw th;
                        }
                    } catch (Exception e) {
                        TXCLog.m84149e("MediaCodecDecoder", "decode: release decoder exception: " + e.toString());
                    }
                } catch (Exception e2) {
                    TXCLog.m84149e("MediaCodecDecoder", "decode: stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.f60791b.release();
                            TXCLog.m84156w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Exception e3) {
                            TXCLog.m84149e("MediaCodecDecoder", "decode: release decoder exception: " + e3.toString());
                        }
                    } catch (Throwable th2) {
                        this.f60791b = null;
                        throw th2;
                    }
                }
                this.f60791b = null;
                this.f60802m.clear();
                this.f60795f = 0L;
                this.f60797h = true;
            } catch (Throwable th3) {
                try {
                    try {
                        this.f60791b.release();
                        TXCLog.m84156w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e4) {
                        TXCLog.m84149e("MediaCodecDecoder", "decode: release decoder exception: " + e4.toString());
                    }
                    throw th3;
                } finally {
                    this.f60791b = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85231a(int i, long j, long j2, int i2) {
        this.f60791b.releaseOutputBuffer(i, true);
        if ((this.f60790a.flags & 4) != 0) {
            TXCLog.m84152i("MediaCodecDecoder", "output EOS");
        }
        try {
            InterfaceC14485f interfaceC14485f = this.f60807r;
            if (interfaceC14485f != null) {
                interfaceC14485f.onDecodeFrame(null, this.f60793d, this.f60794e, j, j2, i2);
            }
        } catch (Exception e) {
            TXCLog.m84150e("MediaCodecDecoder", "onDecodeFrame failed.", e);
        }
        m85236d();
    }

    /* JADX INFO: renamed from: a */
    private void m85233a(boolean z) {
        if (this.f60799j != z) {
            this.f60799j = z;
            if (this.f60798i) {
                return;
            }
            if (z && !m85237e()) {
                m85230a();
                m85238f();
            } else {
                m85230a();
                m85229a(null, null, this.f60799j);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX INFO: renamed from: a */
    private void m85232a(TXSNALPacket tXSNALPacket) {
        byte[] bArr;
        int i;
        byte[] bArr2;
        if (this.f60809t && tXSNALPacket.nalType == 0) {
            int i2 = 0;
            while (true) {
                try {
                    bArr = tXSNALPacket.nalData;
                    if (i2 >= bArr.length) {
                        i = -1;
                        break;
                    }
                    byte b = bArr[i2];
                    if (b == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 0 && bArr[i2 + 3] == 1) {
                        i = i2 + 4;
                        if ((bArr[i] & 31) == 7) {
                            break;
                        }
                        if (b != 0) {
                        }
                        i2 += 2;
                    } else {
                        if (b != 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 0) {
                            i = i2 + 3;
                            if ((bArr[i] & 31) == 7) {
                                break;
                            }
                        }
                        i2 += 2;
                    }
                } catch (Exception e) {
                    TXCLog.m84150e("MediaCodecDecoder", "modify dec buffer error ", e);
                    return;
                }
            }
            if (i >= 0) {
                int length = bArr.length - i;
                int i3 = i;
                while (true) {
                    bArr2 = tXSNALPacket.nalData;
                    if (i3 < bArr2.length) {
                        byte b2 = bArr2[i3];
                        if ((b2 == 0 && bArr2[i3 + 1] == 0 && bArr2[i3 + 2] == 1) || (b2 == 0 && bArr2[i3 + 1] == 0 && bArr2[i3 + 2] == 0 && bArr2[i3 + 3] == 1)) {
                            length = i3 - i;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, i, bArr3, 0, length);
                byte[] bArrM85228a = this.f60808s.m85228a(bArr3);
                if (bArrM85228a != null) {
                    byte[] bArr4 = tXSNALPacket.nalData;
                    byte[] bArr5 = new byte[(bArr4.length + bArrM85228a.length) - length];
                    if (i > 0) {
                        System.arraycopy(bArr4, 0, bArr5, 0, i);
                    }
                    System.arraycopy(bArrM85228a, 0, bArr5, i, bArrM85228a.length);
                    byte[] bArr6 = tXSNALPacket.nalData;
                    System.arraycopy(bArr6, i + length, bArr5, bArrM85228a.length + i, (bArr6.length - length) - i);
                    tXSNALPacket.nalData = bArr5;
                }
            }
        }
    }
}
