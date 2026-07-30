package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.FirebaseError;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p086a.EnumC14004b;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p093b.C14088p;
import com.tencent.liteav.renderer.C14181a;
import com.tencent.liteav.renderer.InterfaceC14186f;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e;
import com.tencent.liteav.videodecoder.InterfaceC14322f;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCRenderAndDec extends C14040a implements InterfaceC14007b, C14181a.a, InterfaceC14186f, InterfaceC14322f {
    public static final String TAG = "TXCRenderAndDec";
    private Context mContext;
    private WeakReference<InterfaceC14007b> mNotifyListener;
    private WeakReference<InterfaceC13964b> mRenderAndDecDelegate;
    private InterfaceC14155o mVideoFrameListener;
    private C14111h mConfig = null;
    private boolean mEnableLimitHWDecCache = false;
    private TXCVideoDecoder mVideoDecoder = null;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private TextureViewSurfaceTextureListenerC14185e mVideoRender = null;
    private C14015h mVideoFrameFilter = null;
    private EnumC14004b mVideoFrameFormat = EnumC14004b.UNKNOWN;
    private boolean mRealTime = false;
    private boolean mIsRendering = false;
    private int mStreamType = 0;
    private long mFrameDecErrCnt = 0;
    private long mLastReqKeyFrameTS = 0;
    private boolean mFirstRender = false;
    private int mRenderMode = 0;
    private int mRenderRotation = 0;
    private long mLastRenderCalculateTS = 0;
    private long mRenderFrameCount = 0;
    private long mLastRenderFrameCount = 0;
    private InterfaceC13963a mDecListener = null;

    /* JADX INFO: renamed from: com.tencent.liteav.TXCRenderAndDec$a */
    public interface InterfaceC13963a {
        /* JADX INFO: renamed from: a */
        void mo82643a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.TXCRenderAndDec$b */
    public interface InterfaceC13964b {
        void onRequestKeyFrame(String str, int i);
    }

    public TXCRenderAndDec(Context context) {
        this.mContext = null;
        this.mContext = context;
        C14025c.m82853a().m82879a(this.mContext);
    }

    private void notifyEvent(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        C14052f.m83035a(this.mNotifyListener, i, bundle);
    }

    private void requestKeyFrame() {
        InterfaceC13964b interfaceC13964b;
        long timeTick = TXCTimeUtil.getTimeTick();
        if (timeTick > this.mLastReqKeyFrameTS + 3000) {
            this.mLastReqKeyFrameTS = timeTick;
            TXCLog.m82966e(TAG, "requestKeyFrame: " + getID());
            WeakReference<InterfaceC13964b> weakReference = this.mRenderAndDecDelegate;
            if (weakReference == null || (interfaceC13964b = weakReference.get()) == null) {
                return;
            }
            interfaceC13964b.onRequestKeyFrame(getID(), this.mStreamType);
        }
    }

    private void startDecode(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.stop();
            tXCVideoDecoder.enableHWDec(this.mConfig.f59341h);
            tXCVideoDecoder.config(this.mConfig.f59351r);
            TXCLog.m82969i(TAG, "trtc_ start decode " + surfaceTexture + ", hw: " + this.mConfig.f59341h + ", id " + getID() + "_" + this.mStreamType);
            if (surfaceTexture != null) {
                tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            } else {
                if (this.mConfig.f59341h) {
                    return;
                }
                tXCVideoDecoder.setup((Surface) null, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            }
        }
    }

    public void decVideo(TXSNALPacket tXSNALPacket) {
    }

    public void enableDecoderChange(boolean z) {
        this.mEnableDecoderChange = z;
    }

    public void enableLimitDecCache(boolean z) {
        this.mEnableLimitHWDecCache = z;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.enableLimitDecCache(z);
        }
    }

    public void enableRestartDecoder(boolean z) {
        this.mEnableRestartDecoder = z;
    }

    public long getAVNetRecvInterval() {
        return getLongValue(6014, 2);
    }

    public long getAVPlayInterval() {
        return getLongValue(6013, 2);
    }

    public C14111h getConfig() {
        return this.mConfig;
    }

    public int getStreamType() {
        return this.mStreamType;
    }

    public long getVideoCacheDuration() {
        return getIntValue(6010, 2);
    }

    public long getVideoCacheFrameCount() {
        return getIntValue(6011, 2);
    }

    public int getVideoDecCacheFrameCount() {
        return getIntValue(6012, 2);
    }

    public int getVideoGop() {
        return getIntValue(7120);
    }

    public TextureViewSurfaceTextureListenerC14185e getVideoRender() {
        return this.mVideoRender;
    }

    public boolean isRendering() {
        return this.mIsRendering;
    }

    public void muteVideo(boolean z) {
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e;
        if (z || (textureViewSurfaceTextureListenerC14185e = this.mVideoRender) == null) {
            return;
        }
        textureViewSurfaceTextureListenerC14185e.m83936n();
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onDecodeFailed(int i) {
        TXCLog.m82966e(TAG, "video decode failed " + i);
        requestKeyFrame();
        int i2 = this.mStreamType;
        long j = this.mFrameDecErrCnt + 1;
        this.mFrameDecErrCnt = j;
        setStatusValue(FirebaseError.ERROR_REQUIRES_RECENT_LOGIN, i2, Long.valueOf(j));
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        EnumC14004b enumC14004b;
        int i4 = i3;
        if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
            i4 = 360 - (i4 * 90);
        }
        InterfaceC14155o interfaceC14155o = this.mVideoFrameListener;
        if (interfaceC14155o != null && tXSVideoFrame != null && ((enumC14004b = this.mVideoFrameFormat) == EnumC14004b.I420 || enumC14004b == EnumC14004b.NV21)) {
            TXSVideoFrame tXSVideoFrameM223818clone = this.mVideoRender != null ? tXSVideoFrame.m223818clone() : tXSVideoFrame;
            tXSVideoFrameM223818clone.rotation = (this.mRenderRotation + i4) % 360;
            if (this.mVideoFrameFormat == EnumC14004b.NV21) {
                tXSVideoFrameM223818clone.loadNV21BufferFromI420Buffer();
            }
            interfaceC14155o.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrameM223818clone);
        }
        if (!this.mFirstRender) {
            this.mFirstRender = true;
            TXCEventRecorderProxy.m82980a(getID(), ErrorCode.EDIT_UPDATEEFFECT_FAILED, -1L, -1L, "", this.mStreamType);
            if (this.mVideoRender == null) {
                TXCKeyPointReportProxy.m82987a(getID(), TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 0L, this.mStreamType);
            }
            if (this.mVideoDecoder != null) {
                TXCKeyPointReportProxy.m82987a(getID(), 40029, this.mVideoDecoder.GetDecodeFirstFrameTS(), this.mStreamType);
            }
        }
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.mo83854a(tXSVideoFrame, i, i2, i4);
        } else {
            if (this.mLastRenderCalculateTS != 0) {
                this.mRenderFrameCount++;
                return;
            }
            this.mLastRenderCalculateTS = System.currentTimeMillis();
            this.mLastRenderFrameCount = 0L;
            this.mRenderFrameCount = 0L;
        }
    }

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            this.mConfig.f59341h = false;
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder != null) {
                tXCVideoDecoder.restart(false);
            }
        } else if (i == 2020) {
            TXCLog.m82966e(TAG, "decoding too many frame(>40) without output! request key frame now.");
            requestKeyFrame();
            return;
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        C14052f.m83035a(this.mNotifyListener, i, bundle);
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14186f
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.m82973w(TAG, "play decode when surface texture create hw " + this.mConfig.f59341h);
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
        }
        if (this.mConfig.f59341h) {
            startDecode(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14186f
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder;
        try {
            TXCLog.m82973w(TAG, "play:stop decode when surface texture release");
            if (this.mConfig.f59341h && (tXCVideoDecoder = this.mVideoDecoder) != null) {
                tXCVideoDecoder.stop();
            }
            C14015h c14015h = this.mVideoFrameFilter;
            if (c14015h != null) {
                c14015h.mo82806d();
                this.mVideoFrameFilter = null;
            }
            InterfaceC13963a interfaceC13963a = this.mDecListener;
            if (interfaceC13963a != null) {
                interfaceC13963a.mo82643a(surfaceTexture);
            }
        } catch (Exception e) {
            TXCLog.m82967e(TAG, "onSurfaceTextureDestroy failed.", e);
        }
    }

    @Override // com.tencent.liteav.renderer.C14181a.a
    public void onTextureProcess(int i, int i2, int i3, final int i4) {
        InterfaceC14155o interfaceC14155o = this.mVideoFrameListener;
        if (interfaceC14155o != null) {
            if (this.mVideoFrameFormat == EnumC14004b.TEXTURE_2D) {
                TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
                tXSVideoFrame.width = i2;
                tXSVideoFrame.height = i3;
                tXSVideoFrame.pts = TXCTimeUtil.getTimeTick();
                tXSVideoFrame.rotation = (i4 + this.mRenderRotation) % 360;
                tXSVideoFrame.textureId = i;
                TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
                if (textureViewSurfaceTextureListenerC14185e instanceof C14181a) {
                    tXSVideoFrame.eglContext = ((C14181a) textureViewSurfaceTextureListenerC14185e).m83858b();
                }
                interfaceC14155o.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrame);
                return;
            }
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder == null || tXCVideoDecoder.isHardwareDecode()) {
                if (this.mVideoFrameFilter == null) {
                    if (this.mVideoFrameFormat == EnumC14004b.NV21) {
                        this.mVideoFrameFilter = new C14088p(3);
                    } else {
                        this.mVideoFrameFilter = new C14088p(1);
                    }
                    this.mVideoFrameFilter.m82793a(true);
                    if (this.mVideoFrameFilter.mo82796a()) {
                        this.mVideoFrameFilter.mo82786a(i2, i3);
                        this.mVideoFrameFilter.m82791a(new C14015h.a() { // from class: com.tencent.liteav.TXCRenderAndDec.1
                            @Override // com.tencent.liteav.basic.p088c.C14015h.a
                            /* JADX INFO: renamed from: a */
                            public void mo82642a(int i5) {
                                C14015h c14015h = TXCRenderAndDec.this.mVideoFrameFilter;
                                InterfaceC14155o interfaceC14155o2 = TXCRenderAndDec.this.mVideoFrameListener;
                                if (c14015h == null || interfaceC14155o2 == null) {
                                    return;
                                }
                                TXSVideoFrame tXSVideoFrame2 = new TXSVideoFrame();
                                tXSVideoFrame2.width = c14015h.m82816n();
                                tXSVideoFrame2.height = c14015h.m82817o();
                                tXSVideoFrame2.pts = TXCTimeUtil.getTimeTick();
                                tXSVideoFrame2.rotation = (i4 + TXCRenderAndDec.this.mRenderRotation) % 360;
                                interfaceC14155o2.onRenderVideoFrame(TXCRenderAndDec.this.getID(), TXCRenderAndDec.this.mStreamType, tXSVideoFrame2);
                            }
                        });
                    } else {
                        TXCLog.m82969i(TAG, "throwVideoFrame->release mVideoFrameFilter");
                        this.mVideoFrameFilter = null;
                    }
                }
                if (this.mVideoFrameFilter != null) {
                    GLES20.glViewport(0, 0, i2, i3);
                    this.mVideoFrameFilter.mo82786a(i2, i3);
                    this.mVideoFrameFilter.mo82798b(i);
                }
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onVideoSizeChange(int i, int i2) {
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83923b(i, i2);
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Resolution changed to" + i + BaseSei.f13930X + i2);
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        bundle.putString("EVT_USERID", getID());
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        onNotifyEvent(2009, bundle);
        setStatusValue(ErrorCode.EDIT_PREVIEW_FAILED, this.mStreamType, Integer.valueOf((i << 16) | i2));
        long j = i;
        long j2 = i2;
        TXCEventRecorderProxy.m82980a(getID(), 4003, j, j2, "", this.mStreamType);
        TXCKeyPointReportProxy.m82987a(getID(), 40002, j, this.mStreamType);
        TXCKeyPointReportProxy.m82987a(getID(), 40003, j2, this.mStreamType);
    }

    public void restartDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || !tXCVideoDecoder.isHevc()) {
            return;
        }
        tXCVideoDecoder.restart(true);
    }

    public void setBlockInterval(int i) {
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83927e(i);
        }
    }

    public void setConfig(C14111h c14111h) {
        this.mConfig = c14111h;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83922b(c14111h.f59337d);
        }
    }

    public void setDecListener(InterfaceC13963a interfaceC13963a) {
        this.mDecListener = interfaceC13963a;
    }

    @Override // com.tencent.liteav.basic.module.C14040a
    public void setID(String str) {
        super.setID(str);
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setUserId(str);
        }
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        this.mNotifyListener = new WeakReference<>(interfaceC14007b);
    }

    public void setRenderAndDecDelegate(InterfaceC13964b interfaceC13964b) {
        this.mRenderAndDecDelegate = new WeakReference<>(interfaceC13964b);
    }

    public void setRenderMode(int i) {
        this.mRenderMode = i;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83924c(i);
        }
    }

    public void setRenderRotation(int i) {
        TXCLog.m82969i(TAG, "vrotation setRenderRotation " + i);
        this.mRenderRotation = i;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83926d(i);
        }
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83914a(i);
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setStreamType(this.mStreamType);
        }
    }

    public void setVideoFrameListener(InterfaceC14155o interfaceC14155o, EnumC14004b enumC14004b) {
        this.mVideoFrameListener = interfaceC14155o;
        this.mVideoFrameFormat = enumC14004b;
        TXCLog.m82969i(TAG, "setVideoFrameListener->enter listener: " + interfaceC14155o + ", format: " + enumC14004b);
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e == null || !(textureViewSurfaceTextureListenerC14185e instanceof C14181a)) {
            return;
        }
        if (interfaceC14155o == null) {
            TXCLog.m82969i(TAG, "setCustomRenderListener-> clean listener.");
            ((C14181a) this.mVideoRender).m83860b((C14181a.a) null);
        } else {
            TXCLog.m82969i(TAG, "setCustomRenderListener-> set listener.");
            ((C14181a) this.mVideoRender).m83860b((C14181a.a) this);
        }
    }

    public void setVideoRender(TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e) {
        TXCLog.m82969i(TAG, "set video render " + textureViewSurfaceTextureListenerC14185e + " id " + getID() + ", " + this.mStreamType);
        this.mVideoRender = textureViewSurfaceTextureListenerC14185e;
        if (textureViewSurfaceTextureListenerC14185e == null) {
            return;
        }
        textureViewSurfaceTextureListenerC14185e.setID(getID());
        this.mVideoRender.m83914a(this.mStreamType);
        this.mVideoRender.m83917a((InterfaceC14007b) this);
        this.mVideoRender.m83924c(this.mRenderMode);
        this.mVideoRender.m83926d(this.mRenderRotation);
        if (this.mVideoFrameListener != null) {
            TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e2 = this.mVideoRender;
            if (textureViewSurfaceTextureListenerC14185e2 instanceof C14181a) {
                ((C14181a) textureViewSurfaceTextureListenerC14185e2).m83860b((C14181a.a) this);
            }
        }
        C14111h c14111h = this.mConfig;
        if (c14111h != null) {
            this.mVideoRender.m83922b(c14111h.f59337d);
        }
    }

    public void start(boolean z) {
        TXCLog.m82969i(TAG, "start render dec " + getID() + ", " + this.mStreamType);
        this.mRealTime = z;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83919a((InterfaceC14186f) this);
            this.mVideoRender.m83928f();
            this.mVideoRender.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        startDecode();
        this.mIsRendering = true;
    }

    public void startVideo() {
        stopVideo();
        this.mRealTime = true;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83919a((InterfaceC14186f) this);
            this.mVideoRender.m83928f();
            this.mVideoRender.setID(getID());
        }
        TXCLog.m82969i(TAG, "start video dec " + getID() + ", " + this.mStreamType);
        TXCVideoDecoder tXCVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder = tXCVideoDecoder;
        tXCVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        startDecode();
        this.mIsRendering = true;
    }

    public void stop() {
        TXCLog.m82969i(TAG, "stop video render dec " + getID() + ", " + this.mStreamType);
        this.mIsRendering = false;
        this.mRealTime = false;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83935m();
            this.mVideoRender.m83921a(true);
            this.mVideoRender.m83919a((InterfaceC14186f) null);
        }
    }

    public void stopVideo() {
        this.mIsRendering = false;
        if (this.mVideoDecoder != null) {
            TXCLog.m82969i(TAG, "stop video dec " + getID() + ", " + this.mStreamType);
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83935m();
            this.mVideoRender.m83921a(false);
            this.mVideoRender.m83919a((InterfaceC14186f) null);
        }
    }

    public void updateLoadInfo() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            setStatusValue(5002, this.mStreamType, Long.valueOf(tXCVideoDecoder.isHardwareDecode() ? 1L : 0L));
        }
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14185e != null) {
            textureViewSurfaceTextureListenerC14185e.m83937o();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.mLastRenderCalculateTS;
        if (j >= 1000) {
            long j2 = this.mRenderFrameCount;
            double d = ((j2 - this.mLastRenderFrameCount) * 1000.0d) / j;
            this.mLastRenderFrameCount = j2;
            this.mLastRenderCalculateTS = jCurrentTimeMillis;
            setStatusValue(6002, this.mStreamType, Double.valueOf(d));
        }
    }

    private void startDecode() {
        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = this.mVideoRender;
        startDecode(textureViewSurfaceTextureListenerC14185e != null ? textureViewSurfaceTextureListenerC14185e.mo83850a() : null);
    }
}
