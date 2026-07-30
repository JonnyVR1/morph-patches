package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.FirebaseError;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p091a.EnumC14167b;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p098b.C14251p;
import com.tencent.liteav.renderer.C14344a;
import com.tencent.liteav.renderer.InterfaceC14349f;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e;
import com.tencent.liteav.videodecoder.InterfaceC14485f;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCRenderAndDec extends C14203a implements InterfaceC14170b, C14344a.a, InterfaceC14349f, InterfaceC14485f {
    public static final String TAG = "TXCRenderAndDec";
    private Context mContext;
    private WeakReference<InterfaceC14170b> mNotifyListener;
    private WeakReference<InterfaceC14127b> mRenderAndDecDelegate;
    private InterfaceC14318o mVideoFrameListener;
    private C14274h mConfig = null;
    private boolean mEnableLimitHWDecCache = false;
    private TXCVideoDecoder mVideoDecoder = null;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private TextureViewSurfaceTextureListenerC14348e mVideoRender = null;
    private C14178h mVideoFrameFilter = null;
    private EnumC14167b mVideoFrameFormat = EnumC14167b.UNKNOWN;
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
    private InterfaceC14126a mDecListener = null;

    /* JADX INFO: renamed from: com.tencent.liteav.TXCRenderAndDec$a */
    public interface InterfaceC14126a {
        /* JADX INFO: renamed from: a */
        void mo83826a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.TXCRenderAndDec$b */
    public interface InterfaceC14127b {
        void onRequestKeyFrame(String str, int i);
    }

    public TXCRenderAndDec(Context context) {
        this.mContext = null;
        this.mContext = context;
        C14188c.m84036a().m84062a(this.mContext);
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
        C14215f.m84218a(this.mNotifyListener, i, bundle);
    }

    private void requestKeyFrame() {
        InterfaceC14127b interfaceC14127b;
        long timeTick = TXCTimeUtil.getTimeTick();
        if (timeTick > this.mLastReqKeyFrameTS + 3000) {
            this.mLastReqKeyFrameTS = timeTick;
            TXCLog.m84149e(TAG, "requestKeyFrame: " + getID());
            WeakReference<InterfaceC14127b> weakReference = this.mRenderAndDecDelegate;
            if (weakReference == null || (interfaceC14127b = weakReference.get()) == null) {
                return;
            }
            interfaceC14127b.onRequestKeyFrame(getID(), this.mStreamType);
        }
    }

    private void startDecode(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.stop();
            tXCVideoDecoder.enableHWDec(this.mConfig.f60189h);
            tXCVideoDecoder.config(this.mConfig.f60199r);
            TXCLog.m84152i(TAG, "trtc_ start decode " + surfaceTexture + ", hw: " + this.mConfig.f60189h + ", id " + getID() + "_" + this.mStreamType);
            if (surfaceTexture != null) {
                tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            } else {
                if (this.mConfig.f60189h) {
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

    public C14274h getConfig() {
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

    public TextureViewSurfaceTextureListenerC14348e getVideoRender() {
        return this.mVideoRender;
    }

    public boolean isRendering() {
        return this.mIsRendering;
    }

    public void muteVideo(boolean z) {
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e;
        if (z || (textureViewSurfaceTextureListenerC14348e = this.mVideoRender) == null) {
            return;
        }
        textureViewSurfaceTextureListenerC14348e.m85119n();
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onDecodeFailed(int i) {
        TXCLog.m84149e(TAG, "video decode failed " + i);
        requestKeyFrame();
        int i2 = this.mStreamType;
        long j = this.mFrameDecErrCnt + 1;
        this.mFrameDecErrCnt = j;
        setStatusValue(FirebaseError.ERROR_REQUIRES_RECENT_LOGIN, i2, Long.valueOf(j));
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        EnumC14167b enumC14167b;
        int i4 = i3;
        if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
            i4 = 360 - (i4 * 90);
        }
        InterfaceC14318o interfaceC14318o = this.mVideoFrameListener;
        if (interfaceC14318o != null && tXSVideoFrame != null && ((enumC14167b = this.mVideoFrameFormat) == EnumC14167b.I420 || enumC14167b == EnumC14167b.NV21)) {
            TXSVideoFrame tXSVideoFrameM225064clone = this.mVideoRender != null ? tXSVideoFrame.m225064clone() : tXSVideoFrame;
            tXSVideoFrameM225064clone.rotation = (this.mRenderRotation + i4) % 360;
            if (this.mVideoFrameFormat == EnumC14167b.NV21) {
                tXSVideoFrameM225064clone.loadNV21BufferFromI420Buffer();
            }
            interfaceC14318o.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrameM225064clone);
        }
        if (!this.mFirstRender) {
            this.mFirstRender = true;
            TXCEventRecorderProxy.m84163a(getID(), ErrorCode.EDIT_UPDATEEFFECT_FAILED, -1L, -1L, "", this.mStreamType);
            if (this.mVideoRender == null) {
                TXCKeyPointReportProxy.m84170a(getID(), TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 0L, this.mStreamType);
            }
            if (this.mVideoDecoder != null) {
                TXCKeyPointReportProxy.m84170a(getID(), 40029, this.mVideoDecoder.GetDecodeFirstFrameTS(), this.mStreamType);
            }
        }
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.mo85037a(tXSVideoFrame, i, i2, i4);
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

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            this.mConfig.f60189h = false;
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder != null) {
                tXCVideoDecoder.restart(false);
            }
        } else if (i == 2020) {
            TXCLog.m84149e(TAG, "decoding too many frame(>40) without output! request key frame now.");
            requestKeyFrame();
            return;
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        C14215f.m84218a(this.mNotifyListener, i, bundle);
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14349f
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.m84156w(TAG, "play decode when surface texture create hw " + this.mConfig.f60189h);
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
        }
        if (this.mConfig.f60189h) {
            startDecode(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14349f
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder;
        try {
            TXCLog.m84156w(TAG, "play:stop decode when surface texture release");
            if (this.mConfig.f60189h && (tXCVideoDecoder = this.mVideoDecoder) != null) {
                tXCVideoDecoder.stop();
            }
            C14178h c14178h = this.mVideoFrameFilter;
            if (c14178h != null) {
                c14178h.mo83989d();
                this.mVideoFrameFilter = null;
            }
            InterfaceC14126a interfaceC14126a = this.mDecListener;
            if (interfaceC14126a != null) {
                interfaceC14126a.mo83826a(surfaceTexture);
            }
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "onSurfaceTextureDestroy failed.", e);
        }
    }

    @Override // com.tencent.liteav.renderer.C14344a.a
    public void onTextureProcess(int i, int i2, int i3, final int i4) {
        InterfaceC14318o interfaceC14318o = this.mVideoFrameListener;
        if (interfaceC14318o != null) {
            if (this.mVideoFrameFormat == EnumC14167b.TEXTURE_2D) {
                TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
                tXSVideoFrame.width = i2;
                tXSVideoFrame.height = i3;
                tXSVideoFrame.pts = TXCTimeUtil.getTimeTick();
                tXSVideoFrame.rotation = (i4 + this.mRenderRotation) % 360;
                tXSVideoFrame.textureId = i;
                TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
                if (textureViewSurfaceTextureListenerC14348e instanceof C14344a) {
                    tXSVideoFrame.eglContext = ((C14344a) textureViewSurfaceTextureListenerC14348e).m85041b();
                }
                interfaceC14318o.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrame);
                return;
            }
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder == null || tXCVideoDecoder.isHardwareDecode()) {
                if (this.mVideoFrameFilter == null) {
                    if (this.mVideoFrameFormat == EnumC14167b.NV21) {
                        this.mVideoFrameFilter = new C14251p(3);
                    } else {
                        this.mVideoFrameFilter = new C14251p(1);
                    }
                    this.mVideoFrameFilter.m83976a(true);
                    if (this.mVideoFrameFilter.mo83979a()) {
                        this.mVideoFrameFilter.mo83969a(i2, i3);
                        this.mVideoFrameFilter.m83974a(new C14178h.a() { // from class: com.tencent.liteav.TXCRenderAndDec.1
                            @Override // com.tencent.liteav.basic.p093c.C14178h.a
                            /* JADX INFO: renamed from: a */
                            public void mo83825a(int i5) {
                                C14178h c14178h = TXCRenderAndDec.this.mVideoFrameFilter;
                                InterfaceC14318o interfaceC14318o2 = TXCRenderAndDec.this.mVideoFrameListener;
                                if (c14178h == null || interfaceC14318o2 == null) {
                                    return;
                                }
                                TXSVideoFrame tXSVideoFrame2 = new TXSVideoFrame();
                                tXSVideoFrame2.width = c14178h.m83999n();
                                tXSVideoFrame2.height = c14178h.m84000o();
                                tXSVideoFrame2.pts = TXCTimeUtil.getTimeTick();
                                tXSVideoFrame2.rotation = (i4 + TXCRenderAndDec.this.mRenderRotation) % 360;
                                interfaceC14318o2.onRenderVideoFrame(TXCRenderAndDec.this.getID(), TXCRenderAndDec.this.mStreamType, tXSVideoFrame2);
                            }
                        });
                    } else {
                        TXCLog.m84152i(TAG, "throwVideoFrame->release mVideoFrameFilter");
                        this.mVideoFrameFilter = null;
                    }
                }
                if (this.mVideoFrameFilter != null) {
                    GLES20.glViewport(0, 0, i2, i3);
                    this.mVideoFrameFilter.mo83969a(i2, i3);
                    this.mVideoFrameFilter.mo83981b(i);
                }
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onVideoSizeChange(int i, int i2) {
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85106b(i, i2);
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Resolution changed to" + i + BaseSei.f14624X + i2);
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        bundle.putString("EVT_USERID", getID());
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        onNotifyEvent(2009, bundle);
        setStatusValue(ErrorCode.EDIT_PREVIEW_FAILED, this.mStreamType, Integer.valueOf((i << 16) | i2));
        long j = i;
        long j2 = i2;
        TXCEventRecorderProxy.m84163a(getID(), 4003, j, j2, "", this.mStreamType);
        TXCKeyPointReportProxy.m84170a(getID(), 40002, j, this.mStreamType);
        TXCKeyPointReportProxy.m84170a(getID(), 40003, j2, this.mStreamType);
    }

    public void restartDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || !tXCVideoDecoder.isHevc()) {
            return;
        }
        tXCVideoDecoder.restart(true);
    }

    public void setBlockInterval(int i) {
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85110e(i);
        }
    }

    public void setConfig(C14274h c14274h) {
        this.mConfig = c14274h;
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85105b(c14274h.f60185d);
        }
    }

    public void setDecListener(InterfaceC14126a interfaceC14126a) {
        this.mDecListener = interfaceC14126a;
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.setID(getID());
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setUserId(str);
        }
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        this.mNotifyListener = new WeakReference<>(interfaceC14170b);
    }

    public void setRenderAndDecDelegate(InterfaceC14127b interfaceC14127b) {
        this.mRenderAndDecDelegate = new WeakReference<>(interfaceC14127b);
    }

    public void setRenderMode(int i) {
        this.mRenderMode = i;
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85107c(i);
        }
    }

    public void setRenderRotation(int i) {
        TXCLog.m84152i(TAG, "vrotation setRenderRotation " + i);
        this.mRenderRotation = i;
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85109d(i);
        }
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85097a(i);
        }
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setStreamType(this.mStreamType);
        }
    }

    public void setVideoFrameListener(InterfaceC14318o interfaceC14318o, EnumC14167b enumC14167b) {
        this.mVideoFrameListener = interfaceC14318o;
        this.mVideoFrameFormat = enumC14167b;
        TXCLog.m84152i(TAG, "setVideoFrameListener->enter listener: " + interfaceC14318o + ", format: " + enumC14167b);
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e == null || !(textureViewSurfaceTextureListenerC14348e instanceof C14344a)) {
            return;
        }
        if (interfaceC14318o == null) {
            TXCLog.m84152i(TAG, "setCustomRenderListener-> clean listener.");
            ((C14344a) this.mVideoRender).m85043b((C14344a.a) null);
        } else {
            TXCLog.m84152i(TAG, "setCustomRenderListener-> set listener.");
            ((C14344a) this.mVideoRender).m85043b((C14344a.a) this);
        }
    }

    public void setVideoRender(TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e) {
        TXCLog.m84152i(TAG, "set video render " + textureViewSurfaceTextureListenerC14348e + " id " + getID() + ", " + this.mStreamType);
        this.mVideoRender = textureViewSurfaceTextureListenerC14348e;
        if (textureViewSurfaceTextureListenerC14348e == null) {
            return;
        }
        textureViewSurfaceTextureListenerC14348e.setID(getID());
        this.mVideoRender.m85097a(this.mStreamType);
        this.mVideoRender.m85100a((InterfaceC14170b) this);
        this.mVideoRender.m85107c(this.mRenderMode);
        this.mVideoRender.m85109d(this.mRenderRotation);
        if (this.mVideoFrameListener != null) {
            TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e2 = this.mVideoRender;
            if (textureViewSurfaceTextureListenerC14348e2 instanceof C14344a) {
                ((C14344a) textureViewSurfaceTextureListenerC14348e2).m85043b((C14344a.a) this);
            }
        }
        C14274h c14274h = this.mConfig;
        if (c14274h != null) {
            this.mVideoRender.m85105b(c14274h.f60185d);
        }
    }

    public void start(boolean z) {
        TXCLog.m84152i(TAG, "start render dec " + getID() + ", " + this.mStreamType);
        this.mRealTime = z;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85102a((InterfaceC14349f) this);
            this.mVideoRender.m85111f();
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
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85102a((InterfaceC14349f) this);
            this.mVideoRender.m85111f();
            this.mVideoRender.setID(getID());
        }
        TXCLog.m84152i(TAG, "start video dec " + getID() + ", " + this.mStreamType);
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
        TXCLog.m84152i(TAG, "stop video render dec " + getID() + ", " + this.mStreamType);
        this.mIsRendering = false;
        this.mRealTime = false;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85118m();
            this.mVideoRender.m85104a(true);
            this.mVideoRender.m85102a((InterfaceC14349f) null);
        }
    }

    public void stopVideo() {
        this.mIsRendering = false;
        if (this.mVideoDecoder != null) {
            TXCLog.m84152i(TAG, "stop video dec " + getID() + ", " + this.mStreamType);
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85118m();
            this.mVideoRender.m85104a(false);
            this.mVideoRender.m85102a((InterfaceC14349f) null);
        }
    }

    public void updateLoadInfo() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            setStatusValue(5002, this.mStreamType, Long.valueOf(tXCVideoDecoder.isHardwareDecode() ? 1L : 0L));
        }
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        if (textureViewSurfaceTextureListenerC14348e != null) {
            textureViewSurfaceTextureListenerC14348e.m85120o();
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
        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = this.mVideoRender;
        startDecode(textureViewSurfaceTextureListenerC14348e != null ? textureViewSurfaceTextureListenerC14348e.mo85033a() : null);
    }
}
