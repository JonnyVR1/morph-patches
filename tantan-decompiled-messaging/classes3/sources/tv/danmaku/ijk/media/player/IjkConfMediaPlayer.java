package tv.danmaku.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import l.g16;
import l.n8c;
import l.rdc0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IjkConfMediaPlayer {
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_DAR = 10002;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    public static final int OPT_CATEGORY_PLAYER = 4;
    private static final String TAG = "tv.danmaku.ijk.media.player.IjkConfMediaPlayer";
    private int PlayStatus;
    private int PreparedStatus;
    private long mDecodeFrameCount;
    private EventHandler mEventHandler;
    private fakeSurface mFakeSurface;
    private boolean mHwCodec;

    @AccessedByNative
    private int mListenerContext;

    @AccessedByNative
    private long mNativeMediaPlayer;

    @AccessedByNative
    private int mNativeSurfaceTexture;
    private boolean mNeedCheckIFrame;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private Object mSurface;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoHeight;
    private int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;
    private static IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: tv.danmaku.ijk.media.player.IjkConfMediaPlayer.1
        @Override // tv.danmaku.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            System.loadLibrary(str);
        }
    };
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;

    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @Override // tv.danmaku.ijk.media.player.IjkConfMediaPlayer.OnMediaCodecSelectListener
        @TargetApi(16)
        public String onMediaCodecSelect(IjkConfMediaPlayer ijkConfMediaPlayer, String str, int i, int i2) {
            String[] supportedTypes;
            IjkMediaCodecInfo ijkMediaCodecInfo;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String unused = IjkConfMediaPlayer.TAG;
            String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i), Integer.valueOf(i2));
            ArrayList<IjkMediaCodecInfo> arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                String unused2 = IjkConfMediaPlayer.TAG;
                String.format(Locale.US, "  found codec: %s", codecInfoAt.getName());
                if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (!TextUtils.isEmpty(str2)) {
                            String unused3 = IjkConfMediaPlayer.TAG;
                            Locale locale = Locale.US;
                            String.format(locale, "    mime: %s", str2);
                            if (str2.equalsIgnoreCase(str) && (ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str)) != null) {
                                arrayList.add(ijkMediaCodecInfo);
                                String unused4 = IjkConfMediaPlayer.TAG;
                                String.format(locale, "candidate codec: %s rank=%d", codecInfoAt.getName(), Integer.valueOf(ijkMediaCodecInfo.mRank));
                                ijkMediaCodecInfo.dumpProfileLevels(str);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            IjkMediaCodecInfo ijkMediaCodecInfo2 = (IjkMediaCodecInfo) arrayList.get(0);
            for (IjkMediaCodecInfo ijkMediaCodecInfo3 : arrayList) {
                if (ijkMediaCodecInfo3.mRank > ijkMediaCodecInfo2.mRank) {
                    ijkMediaCodecInfo2 = ijkMediaCodecInfo3;
                }
            }
            if (ijkMediaCodecInfo2.mRank < IjkMediaCodecInfo.RANK_LAST_CHANCE) {
                String unused5 = IjkConfMediaPlayer.TAG;
                String.format(Locale.US, "unaccetable codec: %s", ijkMediaCodecInfo2.mCodecInfo.getName());
                return null;
            }
            String unused6 = IjkConfMediaPlayer.TAG;
            String.format(Locale.US, "selected codec: %s rank=%d", ijkMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(ijkMediaCodecInfo2.mRank));
            return ijkMediaCodecInfo2.mCodecInfo.getName();
        }
    }

    public static class EventHandler extends Handler {
        private WeakReference<IjkConfMediaPlayer> mWeakPlayer;

        public EventHandler(IjkConfMediaPlayer ijkConfMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(ijkConfMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkConfMediaPlayer ijkConfMediaPlayer = this.mWeakPlayer.get();
            if (ijkConfMediaPlayer == null || ijkConfMediaPlayer.mNativeMediaPlayer == 0) {
                n8c.i(IjkConfMediaPlayer.TAG, "IjkConfMediaPlayer went away with unhandled events");
                return;
            }
            int i = message.what;
            if (i == 0 || i == 1) {
                return;
            }
            if (i == 2) {
                ijkConfMediaPlayer.stayAwake(false);
                return;
            }
            if (i == 3) {
                long j = message.arg1;
                if (j < 0) {
                    j = 0;
                }
                long duration = ijkConfMediaPlayer.getDuration();
                if (duration > 0) {
                    long j2 = (j * 100) / duration;
                    return;
                }
                return;
            }
            if (i == 4 || i == 5 || i == 99) {
                return;
            }
            if (i != 100) {
                if (i == 200 || i == 10001 || i == 10002) {
                    return;
                }
                n8c.c(IjkConfMediaPlayer.TAG, "Unknown message type " + message.what);
                return;
            }
            n8c.c(IjkConfMediaPlayer.TAG, "Error (" + message.arg1 + "," + message.arg2 + ")");
            ijkConfMediaPlayer.stayAwake(false);
        }
    }

    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IjkConfMediaPlayer ijkConfMediaPlayer, String str, int i, int i2);
    }

    public IjkConfMediaPlayer(IjkLibLoader ijkLibLoader) {
        this.mWakeLock = null;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.PlayStatus = 0;
        this.PreparedStatus = 0;
        this.mDecodeFrameCount = 0L;
        this.mNeedCheckIFrame = false;
        initPlayer(ijkLibLoader);
    }

    private native String _getAudioCodecInfo();

    private native float _getPropertyFloat(int i, float f);

    private float _getPropertyFloat_(int i, float f) {
        try {
            return _getPropertyFloat(i, f);
        } catch (Error | Exception unused) {
            return 0.0f;
        }
    }

    private native long _getPropertyLong(int i, long j);

    private long _getPropertyLong_(int i, long j) {
        try {
            return _getPropertyLong(i, j);
        } catch (Error | Exception unused) {
            return 0L;
        }
    }

    private native String _getVideoCodecInfo();

    private native void _release();

    private native void _reset();

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setPropertyFloat(int i, float f);

    private void _setPropertyFloat_(int i, float f) {
        try {
            _setPropertyFloat(i, f);
        } catch (Error | Exception unused) {
        }
    }

    private native void _setPropertyLong(int i, long j);

    private void _setPropertyLong_(int i, long j) {
        try {
            _setPropertyLong(i, j);
        } catch (Error | Exception unused) {
        }
    }

    private native void _setVideoSurface(Surface surface, Surface surface2);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    private static void initNativeOnce() {
        synchronized (IjkConfMediaPlayer.class) {
            try {
                if (!mIsNativeInitialized && mIsLibLoaded) {
                    native_init();
                    mIsNativeInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initPlayer(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        initNativeOnce();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(this, looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        this.mHwCodec = true;
        try {
            if (mIsLibLoaded) {
                native_setup(new WeakReference(this));
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.mFakeSurface == null) {
            fakeSurface fakesurface = new fakeSurface();
            this.mFakeSurface = fakesurface;
            fakesurface.activiteSurface(null);
            if (this.mFakeSurface.getLastErr() != 0) {
                this.mFakeSurface.release();
                this.mFakeSurface = null;
                n8c.a(TAG, "mFakeSurface creat error use softdec");
            }
        }
        if (this.mFakeSurface == null || !mIsLibLoaded) {
            return;
        }
        _setVideoSurface(this.mFakeSurface.getSurface(), this.mFakeSurface.getSurface());
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkConfMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                try {
                    ijkLibLoader.loadLibrary("mmcrypto");
                    ijkLibLoader.loadLibrary("mmssl");
                    ijkLibLoader.loadLibrary("cosmosffmpeg");
                    ijkLibLoader.loadLibrary("ijklivesdl");
                    ijkLibLoader.loadLibrary("ijkconfplayer");
                    mIsLibLoaded = true;
                } catch (UnsatisfiedLinkError unused) {
                    mIsLibLoaded = false;
                    try {
                        mIsLibLoaded = true;
                        rdc0.a(g16.a, "mmcrypto");
                        rdc0.a(g16.a, "mmssl");
                        rdc0.a(g16.a, "cosmosffmpeg");
                        rdc0.a(g16.a, "ijklivesdl");
                        rdc0.a(g16.a, "ijkconfplayer");
                    } catch (UnsatisfiedLinkError unused2) {
                        mIsLibLoaded = false;
                    }
                }
            }
        }
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_setup(Object obj);

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        IjkConfMediaPlayer ijkConfMediaPlayer;
        String str2 = TAG;
        n8c.c(str2, "onSelectCodec");
        if (obj == null || !(obj instanceof WeakReference) || (ijkConfMediaPlayer = (IjkConfMediaPlayer) ((WeakReference) obj).get()) == null) {
            return null;
        }
        n8c.c(str2, "onSelectCodec 1");
        if (!"ffmpeg/video".equalsIgnoreCase(str)) {
            n8c.c(str2, "onSelectCodec 2");
            OnMediaCodecSelectListener onMediaCodecSelectListener = ijkConfMediaPlayer.mOnMediaCodecSelectListener;
            if (onMediaCodecSelectListener == null) {
                onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
            }
            return onMediaCodecSelectListener.onMediaCodecSelect(ijkConfMediaPlayer, str, i, i2);
        }
        ijkConfMediaPlayer.mHwCodec = false;
        Object obj2 = ijkConfMediaPlayer.mSurface;
        if (obj2 != null && (obj2 instanceof SurfaceHolder)) {
            ijkConfMediaPlayer.setDisplay((SurfaceHolder) obj2);
        }
        return null;
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        IjkConfMediaPlayer ijkConfMediaPlayer;
        EventHandler eventHandler;
        if (obj == null || (ijkConfMediaPlayer = (IjkConfMediaPlayer) ((WeakReference) obj).get()) == null || (eventHandler = ijkConfMediaPlayer.mEventHandler) == null) {
            return;
        }
        ijkConfMediaPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj2));
    }

    private void release_l() {
        stayAwake(false);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        updateSurfaceScreenOn();
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.release();
            this.mFakeSurface = null;
        }
        this.mOnMediaCodecSelectListener = null;
        this.mSurface = null;
        this.mSurfaceHolder = null;
        try {
            if (mIsLibLoaded) {
                _release();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Wakelock"})
    public void stayAwake(boolean z) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.setKeepScreenOn(this.mScreenOnWhilePlaying && this.mStayAwake);
        }
    }

    public native long _getCurrentPosition();

    public native long _getCurrentPts();

    public native long _getDuration();

    public native boolean _isPlaying();

    public native void _prepareAsync() throws IllegalStateException;

    public native void _seekTo(long j) throws IllegalStateException;

    public final native void _writeAudioExtradata(ByteBuffer byteBuffer, long j);

    public final native void _writeAudioPacket(long j, ByteBuffer byteBuffer, long j2, int i);

    public final native void _writeVideoExtradata(ByteBuffer byteBuffer, long j, int i, int i2);

    public final native void _writeVideoPacket(long j, ByteBuffer byteBuffer, long j2, int i);

    public void checkIFrame(boolean z) {
        if (this.mNeedCheckIFrame && z) {
            this.mNeedCheckIFrame = false;
        }
    }

    public void checkIFrameStart() {
        this.mNeedCheckIFrame = true;
    }

    public void finalize() {
        native_finalize();
    }

    public long getCurrentPosition() {
        try {
            return _getCurrentPosition();
        } catch (Error e) {
            e.printStackTrace();
            return 1L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1L;
        }
    }

    public long getCurrentPts() {
        try {
            return _getCurrentPts();
        } catch (Error e) {
            e.printStackTrace();
            return 1L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1L;
        }
    }

    public long getDecodeFrameCount() {
        return this.mDecodeFrameCount;
    }

    public long getDuration() {
        try {
            return _getDuration();
        } catch (Error e) {
            e.printStackTrace();
            return 1L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1L;
        }
    }

    public long getRenderFrameCount() {
        return this.mDecodeFrameCount;
    }

    public boolean isPlaying() {
        try {
            return _isPlaying();
        } catch (Error e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void prepareAsync() throws IllegalStateException {
        try {
            if (this.PreparedStatus == 0) {
                if (mIsLibLoaded) {
                    _prepareAsync();
                }
                this.PreparedStatus = 1;
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void release() {
        release_l();
    }

    public void reset() {
        stayAwake(false);
        try {
            if (mIsLibLoaded) {
                _reset();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    public void seekTo(long j) {
        try {
            _seekTo(j);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        this.mSurfaceHolder = surfaceHolder;
        String str = TAG;
        n8c.c(str, "setDisplay" + surfaceHolder);
        try {
            if (surfaceHolder != null) {
                surface = surfaceHolder.getSurface();
                this.mSurface = surfaceHolder;
            } else {
                this.mSurface = null;
                surface = null;
            }
            fakeSurface fakesurface = this.mFakeSurface;
            if (fakesurface != null) {
                if (surfaceHolder != null) {
                    fakesurface.activiteSurface(null);
                }
                this.mFakeSurface.activiteSurface(surfaceHolder);
            } else {
                if (mIsLibLoaded) {
                    _setVideoSurface(surface, surface);
                }
                n8c.c(str, "_setVideoSurface" + surfaceHolder);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        updateSurfaceScreenOn();
    }

    @Deprecated
    public void setMediaCodecEnabled(boolean z) {
        n8c.c(TAG, "setMediaCodecEnabled" + z);
        if (mIsLibLoaded) {
            setOption(4, "mediacodec", z ? 1L : 0L);
        }
    }

    public void setOption(int i, String str, long j) {
        try {
            if (mIsLibLoaded) {
                _setOption(i, str, j);
            }
        } catch (Error | Exception unused) {
        }
    }

    public void setPropertyLong(int i, long j) {
        _setPropertyLong_(i, j);
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                n8c.i(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public void setSurfaceH(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            n8c.i(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        if (mIsLibLoaded) {
            _setVideoSurface(surface, surface);
        }
        updateSurfaceScreenOn();
    }

    public native void setVolume(float f, float f2);

    public void setWakeMode(Context context, int i) {
        boolean z;
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.mWakeLock.release();
                z = true;
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | PKIFailureInfo.duplicateCertReq, IjkConfMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    public void start() throws IllegalStateException {
        stayAwake(true);
        try {
            if (this.PlayStatus == 0) {
                if (mIsLibLoaded) {
                    _start();
                }
                this.PlayStatus = 1;
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void stop() throws IllegalStateException {
        stayAwake(false);
        this.PlayStatus = 0;
        this.PreparedStatus = 0;
        try {
            if (mIsLibLoaded) {
                _stop();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void updateScreenRec(int i, int i2) {
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.updateRec(i, i2, i, i2);
        }
    }

    public void writeVideoPacket(long j, ByteBuffer byteBuffer, long j2, int i) {
        this.mDecodeFrameCount++;
        try {
            if (this.PreparedStatus == 1 && !this.mNeedCheckIFrame && mIsLibLoaded) {
                _writeVideoPacket(j, byteBuffer, j2, i);
            }
        } catch (Error | Exception unused) {
        }
    }

    public void setOption(int i, String str, String str2) {
        try {
            if (mIsLibLoaded) {
                _setOption(i, str, str2);
            }
        } catch (Error | Exception unused) {
        }
    }

    public IjkConfMediaPlayer(Context context) {
        this(sLocalLibLoader);
    }

    public void setDisplay(Surface surface) {
        try {
            fakeSurface fakesurface = this.mFakeSurface;
            if (fakesurface != null) {
                if (surface != null) {
                    fakesurface.activiteSurface(null);
                }
                this.mFakeSurface.activiteSurface(surface);
            } else {
                if (mIsLibLoaded) {
                    _setVideoSurface(surface, surface);
                }
                n8c.c(TAG, "_setVideoSurface" + surface);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        updateSurfaceScreenOn();
    }
}
