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
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14321e implements InterfaceC14318b {

    /* JADX INFO: renamed from: r */
    private InterfaceC14322f f59959r;

    /* JADX INFO: renamed from: u */
    private WeakReference<InterfaceC14007b> f59962u;

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f59942a = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: b */
    private MediaCodec f59943b = null;

    /* JADX INFO: renamed from: c */
    private String f59944c = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: d */
    private int f59945d = 540;

    /* JADX INFO: renamed from: e */
    private int f59946e = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

    /* JADX INFO: renamed from: f */
    private long f59947f = 0;

    /* JADX INFO: renamed from: g */
    private long f59948g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f59949h = true;

    /* JADX INFO: renamed from: i */
    private boolean f59950i = false;

    /* JADX INFO: renamed from: j */
    private boolean f59951j = false;

    /* JADX INFO: renamed from: k */
    private Surface f59952k = null;

    /* JADX INFO: renamed from: l */
    private int f59953l = 0;

    /* JADX INFO: renamed from: m */
    private ArrayList<TXSNALPacket> f59954m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private ArrayList<Long> f59955n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    private long f59956o = 0;

    /* JADX INFO: renamed from: p */
    private int f59957p = 0;

    /* JADX INFO: renamed from: q */
    private JSONArray f59958q = null;

    /* JADX INFO: renamed from: s */
    private C14320d f59960s = new C14320d();

    /* JADX INFO: renamed from: t */
    private boolean f59961t = false;

    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private int m84046a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        MediaCodec mediaCodec;
        int i = -1;
        int i2 = 0;
        try {
            if (this.f59943b == null && this.f59952k != null) {
                this.f59951j = z;
                if (z) {
                    this.f59944c = "video/hevc";
                } else {
                    this.f59944c = YtVideoEncoder.MIME_TYPE;
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f59944c, this.f59945d, this.f59946e);
                if (byteBuffer != null) {
                    mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBuffer);
                }
                if (byteBuffer2 != null) {
                    mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                }
                JSONArray jSONArray = this.f59958q;
                if (jSONArray != null) {
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                            mediaFormatCreateVideoFormat.setInteger(jSONObject.optString(Constants.KEY_KEY), jSONObject.optInt("value"));
                        } catch (Exception e) {
                            TXCLog.m82973w("MediaCodecDecoder", "config custom format error " + e.toString());
                        }
                    }
                }
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.f59944c);
                this.f59943b = mediaCodecCreateDecoderByType;
                try {
                    mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, this.f59952k, (MediaCrypto) null, 0);
                    int i4 = 2;
                    try {
                        this.f59943b.setVideoScalingMode(1);
                        this.f59943b.start();
                        i4 = 4;
                        TXCLog.m82973w("MediaCodecDecoder", "decode: start decoder success, is hevc: " + this.f59951j + " w = " + this.f59945d + " h = " + this.f59946e + ", format = " + mediaFormatCreateVideoFormat.toString());
                        try {
                            this.f59953l = 0;
                            return 0;
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            i2 = i4;
                            e = e;
                            mediaCodec = this.f59943b;
                            if (mediaCodec != null) {
                                try {
                                    try {
                                        mediaCodec.release();
                                        TXCLog.m82973w("MediaCodecDecoder", "decode: , decoder release success");
                                    } catch (Exception unused) {
                                        TXCLog.m82966e("MediaCodecDecoder", "decode: , decoder release exception: " + e.toString());
                                    }
                                    this.f59943b = null;
                                } catch (Throwable th) {
                                    this.f59943b = null;
                                    throw th;
                                }
                            }
                            TXCLog.m82966e("MediaCodecDecoder", "decode: init decoder " + i2 + " step exception: " + e.toString());
                            e.printStackTrace();
                            m84055f();
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
            TXCLog.m82966e("MediaCodecDecoder", "decode: init decoder error, can not init for decoder=" + this.f59943b + ",surface=" + this.f59952k);
            return -1;
        } catch (Exception e5) {
            e = e5;
            mediaCodec = this.f59943b;
            if (mediaCodec != null) {
                mediaCodec.release();
                TXCLog.m82973w("MediaCodecDecoder", "decode: , decoder release success");
                this.f59943b = null;
            }
            TXCLog.m82966e("MediaCodecDecoder", "decode: init decoder " + i2 + " step exception: " + e.toString());
            e.printStackTrace();
            m84055f();
            return i;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    private void m84051b() {
        ByteBuffer[] inputBuffers;
        int iDequeueInputBuffer;
        long j;
        if (this.f59943b == null) {
            TXCLog.m82966e("MediaCodecDecoder", "null decoder");
            return;
        }
        TXSNALPacket tXSNALPacket = this.f59954m.get(0);
        if (tXSNALPacket == null || tXSNALPacket.nalData.length == 0) {
            TXCLog.m82966e("MediaCodecDecoder", "decode: empty buffer");
            this.f59954m.remove(0);
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        if (this.f59956o == 0) {
            this.f59956o = timeTick;
        }
        try {
            inputBuffers = this.f59943b.getInputBuffers();
        } catch (Exception e) {
            TXCLog.m82966e("MediaCodecDecoder", "decode: getInputBuffers Exception!! " + e.toString());
            inputBuffers = null;
        }
        ByteBuffer[] byteBufferArr = inputBuffers;
        if (byteBufferArr == null || byteBufferArr.length == 0) {
            TXCLog.m82966e("MediaCodecDecoder", "decode: getInputBuffers failed");
            return;
        }
        int iDequeueOutputBuffer = ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
        try {
            iDequeueInputBuffer = this.f59943b.dequeueInputBuffer(10000L);
        } catch (Exception e2) {
            TXCLog.m82966e("MediaCodecDecoder", "decode: dequeueInputBuffer Exception!! " + e2.toString());
            iDequeueInputBuffer = -10000;
        }
        if (iDequeueInputBuffer >= 0) {
            byteBufferArr[iDequeueInputBuffer].put(tXSNALPacket.nalData);
            try {
                j = 0;
                try {
                    this.f59943b.queueInputBuffer(iDequeueInputBuffer, 0, tXSNALPacket.nalData.length, tXSNALPacket.pts, 0);
                    this.f59954m.remove(0);
                } catch (Exception unused) {
                    m84056g();
                }
            } catch (Exception unused2) {
                j = 0;
            }
            if (this.f59947f == j) {
                TXCLog.m82973w("MediaCodecDecoder", "decode: input buffer available, dequeueInputBuffer index: " + iDequeueInputBuffer);
            }
        } else {
            j = 0;
            TXCLog.m82973w("MediaCodecDecoder", "decode: input buffer not available, dequeueInputBuffer failed");
        }
        try {
            iDequeueOutputBuffer = this.f59943b.dequeueOutputBuffer(this.f59942a, 10000L);
        } catch (Exception e3) {
            m84056g();
            TXCLog.m82966e("MediaCodecDecoder", "decode: dequeueOutputBuffer exception!!" + e3);
        }
        if (iDequeueOutputBuffer >= 0) {
            long j2 = this.f59942a.presentationTimeUs;
            m84048a(iDequeueOutputBuffer, j2, j2, tXSNALPacket.rotation);
            this.f59953l = 0;
        } else if (iDequeueOutputBuffer == -1) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            TXCLog.m82969i("MediaCodecDecoder", "decode: no output from decoder available when timeout fail count " + this.f59953l);
            m84056g();
        } else if (iDequeueOutputBuffer == -3) {
            TXCLog.m82969i("MediaCodecDecoder", "decode: output buffers changed");
        } else if (iDequeueOutputBuffer == -2) {
            m84052c();
        } else {
            TXCLog.m82966e("MediaCodecDecoder", "decode: unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
        }
        long timeTick2 = TXCTimeUtil.getTimeTick();
        this.f59955n.add(Long.valueOf(timeTick2 - timeTick));
        if (timeTick2 > this.f59956o + 1000) {
            long jLongValue = j;
            for (Long l2 : this.f59955n) {
                if (l2.longValue() > jLongValue) {
                    jLongValue = l2.longValue();
                }
            }
            this.f59955n.clear();
            this.f59956o = timeTick2;
            this.f59957p = (int) (jLongValue * 3);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84052c() {
        int i;
        MediaFormat outputFormat = this.f59943b.getOutputFormat();
        TXCLog.m82969i("MediaCodecDecoder", "decode output format changed: " + outputFormat);
        int iAbs = Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
        int iAbs2 = Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
        int integer = outputFormat.getInteger("width");
        int integer2 = outputFormat.getInteger("height");
        int iMin = Math.min(iAbs, integer);
        int iMin2 = Math.min(iAbs2, integer2);
        int i2 = this.f59945d;
        if (iMin == i2 && iMin2 == (i = this.f59946e)) {
            if (this.f59949h) {
                this.f59949h = false;
                InterfaceC14322f interfaceC14322f = this.f59959r;
                if (interfaceC14322f != null) {
                    interfaceC14322f.onVideoSizeChange(i2, i);
                    return;
                }
                return;
            }
            return;
        }
        this.f59945d = iMin;
        this.f59946e = iMin2;
        try {
            InterfaceC14322f interfaceC14322f2 = this.f59959r;
            if (interfaceC14322f2 != null) {
                interfaceC14322f2.onVideoSizeChange(iMin, iMin2);
            }
        } catch (Exception e) {
            TXCLog.m82967e("MediaCodecDecoder", "onVideoSizeChange failed.", e);
        }
        TXCLog.m82969i("MediaCodecDecoder", "decode: video size change to w:" + iMin + ",h:" + iMin2);
    }

    /* JADX INFO: renamed from: d */
    private void m84053d() {
        if (this.f59947f == 0) {
            TXCLog.m82973w("MediaCodecDecoder", "decode first frame sucess");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f59947f;
        if (j > 0 && jCurrentTimeMillis > j + 1000) {
            long j2 = this.f59948g;
            if (jCurrentTimeMillis > 2000 + j2 && j2 != 0) {
                TXCLog.m82966e("MediaCodecDecoder", "frame interval[" + (jCurrentTimeMillis - this.f59947f) + "] > 1000");
                this.f59948g = jCurrentTimeMillis;
            }
        }
        if (this.f59948g == 0) {
            this.f59948g = jCurrentTimeMillis;
        }
        this.f59947f = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    private boolean m84054e() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc")) {
                    TXCLog.m82966e("MediaCodecDecoder", "decode: video/hevc MediaCodecInfo: " + mediaCodecInfo.getName() + ",encoder:" + mediaCodecInfo.isEncoder());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private void m84055f() {
        if (this.f59950i) {
            return;
        }
        TXCLog.m82973w("MediaCodecDecoder", "decode: hw decode error, hevc: " + this.f59951j);
        boolean z = this.f59951j;
        WeakReference<InterfaceC14007b> weakReference = this.f59962u;
        if (z) {
            C14052f.m83036a(weakReference, -2304, "h265 Decoding failed");
        } else {
            C14052f.m83036a(weakReference, 2106, "Failed to enable hardware decoding，use software decoding.");
        }
        this.f59950i = true;
        InterfaceC14322f interfaceC14322f = this.f59959r;
        if (interfaceC14322f != null) {
            interfaceC14322f.onDecodeFailed(-1);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m84056g() {
        int i = this.f59953l;
        if (i < 40) {
            this.f59953l = i + 1;
        } else {
            m84055f();
            this.f59953l = 0;
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public int GetDecodeCost() {
        return this.f59957p;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public int config(Surface surface) {
        if (surface == null) {
            return -1;
        }
        this.f59952k = surface;
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public void decode(TXSNALPacket tXSNALPacket) {
        m84050a(tXSNALPacket.codecId == 1);
        m84049a(tXSNALPacket);
        this.f59954m.add(tXSNALPacket);
        while (!this.f59954m.isEmpty()) {
            int size = this.f59954m.size();
            try {
                m84051b();
            } catch (Exception e) {
                TXCLog.m82966e("MediaCodecDecoder", "decode: doDecode Exception!! " + e.toString());
            }
            if (size == this.f59954m.size()) {
                return;
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public void enableLimitDecCache(boolean z) {
        this.f59961t = z;
        TXCLog.m82969i("MediaCodecDecoder", "decode: enable limit dec cache: " + z);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public boolean isHevc() {
        return this.f59951j;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public void setListener(InterfaceC14322f interfaceC14322f) {
        this.f59959r = interfaceC14322f;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public void setNotifyListener(WeakReference<InterfaceC14007b> weakReference) {
        this.f59962u = weakReference;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2) {
        return m84046a(byteBuffer, byteBuffer2, z2);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14318b
    public void stop() {
        m84047a();
    }

    /* JADX INFO: renamed from: a */
    public void m84057a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f59945d = i;
        this.f59946e = i2;
        TXCLog.m82973w("MediaCodecDecoder", "decode: init with video size: " + this.f59945d + ", " + this.f59946e);
    }

    /* JADX INFO: renamed from: a */
    public void m84058a(JSONArray jSONArray) {
        this.f59958q = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private void m84047a() {
        MediaCodec mediaCodec = this.f59943b;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                    TXCLog.m82973w("MediaCodecDecoder", "decode: stop decoder sucess");
                    try {
                        try {
                            this.f59943b.release();
                            TXCLog.m82973w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Throwable th) {
                            this.f59943b = null;
                            throw th;
                        }
                    } catch (Exception e) {
                        TXCLog.m82966e("MediaCodecDecoder", "decode: release decoder exception: " + e.toString());
                    }
                } catch (Exception e2) {
                    TXCLog.m82966e("MediaCodecDecoder", "decode: stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.f59943b.release();
                            TXCLog.m82973w("MediaCodecDecoder", "decode: release decoder sucess");
                        } catch (Exception e3) {
                            TXCLog.m82966e("MediaCodecDecoder", "decode: release decoder exception: " + e3.toString());
                        }
                    } catch (Throwable th2) {
                        this.f59943b = null;
                        throw th2;
                    }
                }
                this.f59943b = null;
                this.f59954m.clear();
                this.f59947f = 0L;
                this.f59949h = true;
            } catch (Throwable th3) {
                try {
                    try {
                        this.f59943b.release();
                        TXCLog.m82973w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e4) {
                        TXCLog.m82966e("MediaCodecDecoder", "decode: release decoder exception: " + e4.toString());
                    }
                    throw th3;
                } finally {
                    this.f59943b = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84048a(int i, long j, long j2, int i2) {
        this.f59943b.releaseOutputBuffer(i, true);
        if ((this.f59942a.flags & 4) != 0) {
            TXCLog.m82969i("MediaCodecDecoder", "output EOS");
        }
        try {
            InterfaceC14322f interfaceC14322f = this.f59959r;
            if (interfaceC14322f != null) {
                interfaceC14322f.onDecodeFrame(null, this.f59945d, this.f59946e, j, j2, i2);
            }
        } catch (Exception e) {
            TXCLog.m82967e("MediaCodecDecoder", "onDecodeFrame failed.", e);
        }
        m84053d();
    }

    /* JADX INFO: renamed from: a */
    private void m84050a(boolean z) {
        if (this.f59951j != z) {
            this.f59951j = z;
            if (this.f59950i) {
                return;
            }
            if (z && !m84054e()) {
                m84047a();
                m84055f();
            } else {
                m84047a();
                m84046a(null, null, this.f59951j);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX INFO: renamed from: a */
    private void m84049a(TXSNALPacket tXSNALPacket) {
        byte[] bArr;
        int i;
        byte[] bArr2;
        if (this.f59961t && tXSNALPacket.nalType == 0) {
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
                    TXCLog.m82967e("MediaCodecDecoder", "modify dec buffer error ", e);
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
                byte[] bArrM84045a = this.f59960s.m84045a(bArr3);
                if (bArrM84045a != null) {
                    byte[] bArr4 = tXSNALPacket.nalData;
                    byte[] bArr5 = new byte[(bArr4.length + bArrM84045a.length) - length];
                    if (i > 0) {
                        System.arraycopy(bArr4, 0, bArr5, 0, i);
                    }
                    System.arraycopy(bArrM84045a, 0, bArr5, i, bArrM84045a.length);
                    byte[] bArr6 = tXSNALPacket.nalData;
                    System.arraycopy(bArr6, i + length, bArr5, bArrM84045a.length + i, (bArr6.length - length) - i);
                    tXSNALPacket.nalData = bArr5;
                }
            }
        }
    }
}
