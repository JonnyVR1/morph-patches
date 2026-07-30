package tv.danmaku.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.immomo.baseutil.HeadSetReceiver;
import com.immomo.medialog.LogLevel;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import l.dix;
import l.eix;
import l.ejx;
import l.eyx;
import l.fjx;
import l.gmx;
import l.hb20;
import l.hjx;
import l.imx;
import l.lll;
import l.mek0;
import l.mvj0;
import l.s7y;
import l.st0;
import l.su10;
import l.tgf0;
import l.xgf0;
import l.ymx;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import tech.sud.gip.core.BuildConfig;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.option.AvFormatOption;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class IjkMediaPlayer extends SimpleMediaPlayer {
    public static final int AV_CH_FRONT_LEFT = 1;
    public static final int AV_CH_FRONT_RIGHT = 2;
    public static final int AV_CH_LAYOUT_MONO = 4;
    public static final int AV_CH_LAYOUT_STEREO = 3;
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_ACCE_RATE = 10014;
    public static final int FFP_PROP_FLOAT_AUDIO_PTS_VALUE = 10016;
    public static final int FFP_PROP_FLOAT_CONNECT_TIME = 10006;
    public static final int FFP_PROP_FLOAT_DECE_RATE = 10013;
    public static final int FFP_PROP_FLOAT_FIRST_AFTAME = 10008;
    public static final int FFP_PROP_FLOAT_FIRST_APACKET = 10009;
    public static final int FFP_PROP_FLOAT_FIRST_ARENDER = 10012;
    public static final int FFP_PROP_FLOAT_FIRST_IFTAME = 10007;
    public static final int FFP_PROP_FLOAT_FIRST_VPACKET = 10010;
    public static final int FFP_PROP_FLOAT_FIRST_VRENDER = 10011;
    public static final int FFP_PROP_FLOAT_MIN_VIDEO_JUMP_DURATION = 10017;
    public static final int FFP_PROP_FLOAT_SAMPLE_RATE = 10015;
    public static final int FFP_PROP_GET_BUFFER_CURRENT = 20057;
    public static final int FFP_PROP_GET_BUFFER_FIRST = 20056;
    public static final int FFP_PROP_GET_BUFFER_INTERVAL = 20065;
    public static final int FFP_PROP_GET_BUFFER_LAST = 20059;
    public static final int FFP_PROP_GET_BUFFER_NEXT = 20058;
    public static final int FFP_PROP_GET_DELAY_TIME = 20064;
    public static final int FFP_PROP_GET_HARDDECODE = 20066;
    public static final int FFP_PROP_GET_LATENCY_BASE_MARK = 20061;
    public static final int FFP_PROP_GET_LATENCY_DROP_MARK = 20063;
    public static final int FFP_PROP_GET_LATENCY_ENABLE = 20060;
    public static final int FFP_PROP_GET_LATENCY_SPEEDUP_MARK = 20062;
    public static final int FFP_PROP_INT64_ACCE_CACHE_DURATION = 20020;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER_BYTES = 20014;
    public static final int FFP_PROP_INT64_AUDIO_EFFECT_3D = 20050;
    public static final int FFP_PROP_INT64_AUDIO_EFFECT_BOOST_3D = 20052;
    public static final int FFP_PROP_INT64_AUDIO_EFFECT_BOOST_HIFI = 20053;
    public static final int FFP_PROP_INT64_AUDIO_EFFECT_HIFI = 20051;
    public static final int FFP_PROP_INT64_AUDIO_ONLY = 20028;
    public static final int FFP_PROP_INT64_AUDIO_READ_BYTES = 20011;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_BYTES = 20013;
    public static final int FFP_PROP_INT64_AUDIO_TRACK_INDEX = 20032;
    public static final int FFP_PROP_INT64_BUFFERING_MAX_TIME_MS = 20033;
    public static final int FFP_PROP_INT64_CREAT_TIME = 20017;
    public static final int FFP_PROP_INT64_DECE_CACHE_DURATION = 20019;
    public static final int FFP_PROP_INT64_DECODER_OPEN_COST = 20038;
    public static final int FFP_PROP_INT64_DECORD_RECORD_PTS = 20054;
    public static final int FFP_PROP_INT64_ENABLE_LATENCY_SECONDS = 20071;
    public static final int FFP_PROP_INT64_FASTDNS_ENABLE = 20030;
    public static final int FFP_PROP_INT64_FASTDNS_EXPIRETIME = 20031;
    public static final int FFP_PROP_INT64_FIRST_VIDEO_HASMOMOSEI = 20034;
    public static final int FFP_PROP_INT64_GET_VIDEOCODEC_TYPE = 20042;
    public static final int FFP_PROP_INT64_IFRAME_DEALY = 20025;
    public static final int FFP_PROP_INT64_MAX_BUFFERLING_BYTES = 20027;
    public static final int FFP_PROP_INT64_NEW_CHECK_SEI = 20055;
    public static final int FFP_PROP_INT64_NEW_SIZE_CHANGE = 20070;
    public static final int FFP_PROP_INT64_PER_AUDIO_PACK_DUR = 20041;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_SERVERSYSTEM_TIME = 20018;
    public static final int FFP_PROP_INT64_SPLIT_AUDIO_CHANNELS = 20022;
    public static final int FFP_PROP_INT64_SPLIT_AUDIO_CHANNEL_FRQ = 20024;
    public static final int FFP_PROP_INT64_SPLIT_AUDIO_CHANNEL_LAYOUT = 20023;
    public static final int FFP_PROP_INT64_SPLIT_AUDIO_FMT = 20021;
    public static final int FFP_PROP_INT64_STREAM_COUNT = 20004;
    public static final int FFP_PROP_INT64_TIME_OUT_US = 20026;
    public static final int FFP_PROP_INT64_VIDEODONTHASMOMOSEICNT = 20035;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int FFP_PROP_INT64_VIDEO_NEW_ENABLE_LATENCY = 20040;
    public static final int FFP_PROP_INT64_VIDEO_ONLY = 20029;
    public static final int FFP_PROP_INT64_VIDEO_READ_BYTES = 20012;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_THRESHOLD = 20039;
    public static final int FFP_PROP_STRING_GETCDNIP = 20036;
    public static final int FFP_PROP_STRING_GETCLIENTIP = 20037;
    private static final int MEDIA_AUDIOCALLBACK = 201;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_BUFFERLING_END = 702;
    private static final int MEDIA_BUFFERLING_START = 701;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_MEIDACODEC_SIZE_CHANGE = 806;
    protected static final int MEDIA_NEW_LATENCY = 10003;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_DAR = 10002;
    private static final int MEDIA_SET_VIDEO_MEDIACODE = 6;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_VIDEOCALLBACK = 202;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_AVDELAY = 10004;
    public static final int PROP_FLOAT_AVDIFF = 10005;
    public static final int PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int PROP_INT64_VIDEO_DECODE_FRAMES = 20015;
    public static final int PROP_INT64_VIDEO_OUTPUT_FRAMES = 20016;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    public static final String SDL_OPENGL = "fcc-_es2";
    private static final String TAG = "IjkMediaPlayer";
    public final int LOG_BUF_SIZE;
    public final int LOG_PULL_SIZE;
    private PlayerAdjustFilter adjustFilter;
    private long costOfsetSurfaceMs;
    private int detectStatus;
    private boolean enable3D;
    private boolean enableHiFi;
    private int enableLogBufferAndPullSize;
    private int fast_dns_expire_time;
    private int filterOn;
    private boolean headSetOn;
    private su10 httpMediaLogsUpload;
    private GetSpeedByteTimer logtimer;
    private float mAudioPtsValue;
    private int mBufferCurrent;
    private int mBufferFirst;
    private int mBufferInterval;
    private int mBufferLast;
    private int mBufferLogCount;
    private int mBufferLogHz;
    private int mBufferNext;
    private LimitedQueue<Long> mBufferPerSec;
    private String mCdnip;
    private WeakReference<Context> mContextRef;
    private float mContrast;
    private int mCount;
    private mvj0 mCurrentUrlInfo;
    private String mDataSource;
    private boolean mDeblueEnabled;
    private float mDeblurRadius;
    private float mDeblurThreshold;
    private float mDeblurWeight;
    private int mDecorderRecordPts;
    public volatile long mDelayTime;
    private EventHandler mEventHandler;
    private String mFFConcatContent;
    private fakeSurface mFakeSurface;
    private volatile boolean mHardDecoderFlagFromMediaConfig;
    private boolean mHasPrepared;
    private boolean mHwCodec;
    public long mIFrameTime;
    private int mInterval;
    private boolean mIsQuicProxy;
    private volatile JsonDateCallback mJsonDateCallback;
    private long mLastBufferSize;
    private long mLastPullSize;
    private int mLatencyBaseMark;
    private int mLatencyDropMark;
    private int mLatencyEnable;
    private float mLatencySpeedRate;
    private int mLatencySpeedupMark;

    @AccessedByNative
    private int mListenerContext;
    private volatile boolean mManuaRefresh;
    private volatile boolean mMediaCodecSetDone;
    private MediaDateCallback mMediaDateCallback;
    private HandlerThread mMediaDateHT;
    private MediaDateHandler mMediaDateHandler;
    private float mMinVideoJumpDuration;

    @AccessedByNative
    private long mNativeMediaPlayer;

    @AccessedByNative
    private int mNativeSurfaceTexture;
    public long mNetDiffTime;
    private int mNewEnableLatency;
    private int mNewSizeChange;
    private int mNewcheckSei;
    private OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private int mPullSizeLogCount;
    private int mPullSizeLogHz;
    private LimitedQueue<Long> mPullSizePerSec;
    private String mQuicServerIp;
    private float mSaturation;
    private int mScreenHeight;
    private boolean mScreenOnWhilePlaying;
    private int mScreenWidth;
    private String mServerIpAddr;
    private boolean mStayAwake;
    private Object mSurface;
    private SurfaceHolder mSurfaceHolder;
    private Object mSynSurface;
    private String mTag;
    private volatile boolean mUseAndroidMediaCodec;
    private int mUseOpengl;
    private boolean mUseProxy;
    private int mVideoDarDen;
    private int mVideoDarNum;
    private int mVideoHeight;
    private int mVideoRenderTHold;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;
    private eix mediaCfgParams;
    private gmx mediaLogPullV2;
    private ymx mediaLogsValOfPull;
    private long metaTimeMs;
    private boolean pullStartAlreadySend;
    private String showId;
    private tgf0 simpleInfoFromUpStream;
    private String sourceStr;
    private static IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: tv.danmaku.ijk.media.player.IjkMediaPlayer.1
        @Override // tv.danmaku.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            System.loadLibrary(str);
        }
    };
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;

    public class AVSampleFormat {
        public static final int AV_SAMPLE_FMT_DBL = 4;
        public static final int AV_SAMPLE_FMT_DBLP = 9;
        public static final int AV_SAMPLE_FMT_FLT = 3;
        public static final int AV_SAMPLE_FMT_FLTP = 8;
        public static final int AV_SAMPLE_FMT_NB = 10;
        public static final int AV_SAMPLE_FMT_NONE = -1;
        public static final int AV_SAMPLE_FMT_S16 = 1;
        public static final int AV_SAMPLE_FMT_S16P = 6;
        public static final int AV_SAMPLE_FMT_S32 = 2;
        public static final int AV_SAMPLE_FMT_S32P = 7;
        public static final int AV_SAMPLE_FMT_U8 = 0;
        public static final int AV_SAMPLE_FMT_U8P = 5;

        public AVSampleFormat() {
        }
    }

    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener
        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
            String[] supportedTypes;
            IjkMediaCodecInfo ijkMediaCodecInfo;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            hjx.d(IjkMediaPlayer.TAG, String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i), Integer.valueOf(i2)));
            ArrayList<IjkMediaCodecInfo> arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(str) && (ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str)) != null) {
                            arrayList.add(ijkMediaCodecInfo);
                            ijkMediaCodecInfo.dumpProfileLevels(str);
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
                hjx.d(IjkMediaPlayer.TAG, String.format(Locale.US, "unaccetable codec: %s", ijkMediaCodecInfo2.mCodecInfo.getName()));
                return null;
            }
            hjx.d(IjkMediaPlayer.TAG, String.format(Locale.US, "selected codec: %s rank=%d", ijkMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(ijkMediaCodecInfo2.mRank)));
            return ijkMediaCodecInfo2.mCodecInfo.getName();
        }
    }

    public static class EventHandler extends Handler {
        private WeakReference<IjkMediaPlayer> mWeakPlayer;

        public EventHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(ijkMediaPlayer);
        }

        private void notifyOnVideoSizeChanged(int i, int i2) {
            IjkMediaPlayer ijkMediaPlayer = this.mWeakPlayer.get();
            if (ijkMediaPlayer == null || ijkMediaPlayer.mNativeMediaPlayer == 0) {
                hjx.d(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events: notifyOnVideoSizeChanged  [" + this + "]");
                return;
            }
            if (ijkMediaPlayer.mVideoHeight != i2 || ijkMediaPlayer.mVideoWidth != i) {
                ijkMediaPlayer.mediaLogs2("notifyOnVideoSizeChanged", ijkMediaPlayer.hashCode() + " sizeChange, " + (ijkMediaPlayer.mHwCodec ? 1 : 0) + ", " + i + "x" + i2);
            }
            ijkMediaPlayer.mVideoWidth = i;
            ijkMediaPlayer.mVideoHeight = i2;
            hjx.a(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] FFP_MSG_VIDEO_SIZE_CHANGED   w/h " + ijkMediaPlayer.mVideoWidth + " x " + ijkMediaPlayer.mVideoHeight);
            ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
            if (ijkMediaPlayer.mFakeSurface != null) {
                ijkMediaPlayer.mFakeSurface.updateRec(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight);
            }
            hjx.a("jzheng", "FFP_MSG_VIDEO_SIZE_CHANGED a " + ((((short) ijkMediaPlayer.mVideoWidth) << 16) | ((short) ijkMediaPlayer.mVideoHeight)) + " w/h " + ijkMediaPlayer.mVideoWidth + " x " + ijkMediaPlayer.mVideoHeight);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkMediaPlayer ijkMediaPlayer = this.mWeakPlayer.get();
            if (ijkMediaPlayer != null) {
                if (ijkMediaPlayer.mNativeMediaPlayer != 0) {
                    int i = message.what;
                    if (i != 99) {
                        if (i == 100) {
                            hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_ERROR (" + message.arg1 + "," + message.arg2 + ")");
                            StringBuilder sb = new StringBuilder();
                            sb.append(ijkMediaPlayer.hashCode());
                            sb.append(" MEDIA_ERROR, ");
                            sb.append(message.arg2);
                            ijkMediaPlayer.mediaLogs2("handleMessage", sb.toString());
                            ijkMediaPlayer.mediaLogsValOfPull.o = (long) message.arg2;
                            ijkMediaPlayer.pullStopV2();
                            if (ijkMediaPlayer.notifyOnError(message.arg1, message.arg2)) {
                                ijkMediaPlayer.setOnErrorListener(null);
                                ijkMediaPlayer.stop();
                                return;
                            }
                            return;
                        }
                        if (i == 200) {
                            int i2 = message.arg1;
                            if (i2 == 3) {
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_VIDEO_RENDERING_START");
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " Video Render Start");
                                ijkMediaPlayer.pullStartV2();
                            } else if (i2 == 701) {
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_BUFFERING_START ");
                                ijkMediaPlayer.mDelayTime = 0L;
                                ijkMediaPlayer.bufferStartV2();
                            } else if (i2 == 702) {
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_BUFFERING_START ");
                                ijkMediaPlayer.bufferStopV2();
                            } else {
                                if (i2 == 909) {
                                    ijkMediaPlayer.mediaLogs2("audioOpen", "audioTrackOpenError");
                                    return;
                                }
                                if (i2 == 910) {
                                    ijkMediaPlayer.mediaLogs2("audioPtsError", "[pts error scale is " + message.arg2 + "]");
                                    return;
                                }
                                if (i2 == 1000) {
                                    ijkMediaPlayer.pullWatchV2();
                                    return;
                                }
                                if (i2 == 1001) {
                                    ijkMediaPlayer.pullBufferCheck();
                                    return;
                                }
                                switch (i2) {
                                    case IMediaPlayer.MEDIA_INFO_VA_DIFF /* 905 */:
                                        Log.e(IjkMediaPlayer.TAG, "handleMessage: VA_Diff" + message.arg2);
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_V_DELAY /* 906 */:
                                        Log.e(IjkMediaPlayer.TAG, "handleMessage: V_DELAY" + message.arg2);
                                        break;
                                    case IMediaPlayer.MEDIA_INDEO_V_DECODE_ERROR /* 907 */:
                                        Log.e(IjkMediaPlayer.TAG, "handleMessage: V_DECORD_ERROR" + message.arg2);
                                        ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " video decord error");
                                        break;
                                }
                            }
                            ijkMediaPlayer.notifyOnInfo(message.arg1, message.arg2);
                            return;
                        }
                        if (i == IjkMediaPlayer.MEDIA_MEIDACODEC_SIZE_CHANGE) {
                            Log.e(IjkMediaPlayer.TAG, "lqdebug mediacodec size " + message.arg1 + " x " + message.arg2);
                            ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " media codec size change: " + message.arg1 + "x" + message.arg2);
                            if (message.arg2 > ijkMediaPlayer.mVideoHeight) {
                                float f = 1.0f - ((message.arg2 - ijkMediaPlayer.mVideoHeight) / ijkMediaPlayer.mVideoHeight);
                                ijkMediaPlayer.setCutPosition(0.0f, 0.0f, 1.0f, f);
                                ijkMediaPlayer.mediaLogs2(ijkMediaPlayer.hashCode() + " setCutPosition:0.0,0.0,1.0," + f);
                                return;
                            }
                            return;
                        }
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_PREPARED");
                                ijkMediaPlayer.notifyOnPrepared();
                                ijkMediaPlayer.mediaLogsValOfPull.d = ijkMediaPlayer.getServerIpAddr();
                                ijkMediaPlayer.pullDetectV2();
                                ijkMediaPlayer.startLogTime();
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " prepared");
                                break;
                            case 2:
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_PLAYBACK_COMPLETE");
                                ijkMediaPlayer.notifyOnCompletion();
                                ijkMediaPlayer.stayAwake(false);
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " play complete");
                                break;
                            case 3:
                                long j = message.arg1;
                                if (j < 0) {
                                    j = 0;
                                }
                                long duration = ijkMediaPlayer.getDuration();
                                long j2 = duration > 0 ? (j * 100) / duration : 0L;
                                ijkMediaPlayer.notifyOnBufferingUpdate((int) (j2 < 100 ? j2 : 100L));
                                break;
                            case 4:
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SEEK_COMPLETE");
                                ijkMediaPlayer.notifyOnSeekComplete();
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " seek complete");
                                break;
                            case 5:
                                ijkMediaPlayer.mediaLogsValOfPull.M = message.arg1;
                                ijkMediaPlayer.mediaLogsValOfPull.N = message.arg2;
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SET_VIDEO_SIZE " + message.arg1 + " x " + message.arg2);
                                notifyOnVideoSizeChanged(message.arg1, message.arg2);
                                break;
                            case 6:
                                int i3 = message.arg1;
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " MEDIA_SET_VIDEO_MEDIACODE, " + message.arg1);
                                hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SET_VIDEO_MEDIACODE MediaCodec Error " + message.arg1);
                                ijkMediaPlayer.notifyOnVideoMediacodecChanged(i3);
                                break;
                            default:
                                switch (i) {
                                    case 10001:
                                        ijkMediaPlayer.mVideoSarNum = message.arg1;
                                        ijkMediaPlayer.mVideoSarDen = message.arg2;
                                        ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                                        break;
                                    case 10002:
                                        ijkMediaPlayer.mVideoDarNum = message.arg1;
                                        ijkMediaPlayer.mVideoDarDen = message.arg2;
                                        break;
                                    case 10003:
                                        ijkMediaPlayer.mediaLogsValOfPull.c0 = (message.arg1 >> 16) & 65535;
                                        ijkMediaPlayer.mediaLogsValOfPull.v = message.arg1 & 65535;
                                        ijkMediaPlayer.mediaLogsValOfPull.b0 = (message.arg2 >> 16) & 65535;
                                        ijkMediaPlayer.mediaLogsValOfPull.u = message.arg2 & 65535;
                                        ijkMediaPlayer.pullBufferDropV2();
                                        break;
                                    default:
                                        hjx.d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] Unknown message type:" + message.what);
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    return;
                }
            }
            hjx.d(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events: handleMessage  [" + this + "]");
        }
    }

    public class GetSpeedByteTimer extends Handler {
        public GetSpeedByteTimer(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    if (IjkMediaPlayer.this.mBufferPerSec == null) {
                        IjkMediaPlayer ijkMediaPlayer = IjkMediaPlayer.this;
                        IjkMediaPlayer ijkMediaPlayer2 = IjkMediaPlayer.this;
                        ijkMediaPlayer.mBufferPerSec = ijkMediaPlayer2.new LimitedQueue(ijkMediaPlayer2.mBufferLogCount);
                    }
                    long j_getReadByte = IjkMediaPlayer.this._getReadByte();
                    long j = j_getReadByte - IjkMediaPlayer.this.mLastBufferSize;
                    if (IjkMediaPlayer.this.mBufferPerSec != null && IjkMediaPlayer.this.mBufferLogHz != 0) {
                        IjkMediaPlayer.this.mBufferPerSec.add(Long.valueOf(((j * ((long) (1000 / IjkMediaPlayer.this.mBufferLogHz))) * 8) / 1000));
                    }
                    IjkMediaPlayer.this.mLastBufferSize = j_getReadByte;
                } catch (Exception unused) {
                }
                sendMessageDelayed(obtainMessage(1), IjkMediaPlayer.this.mBufferLogHz);
                return;
            }
            if (i != 2) {
                return;
            }
            try {
                long j_getReadByte2 = IjkMediaPlayer.this._getReadByte();
                long j2 = j_getReadByte2 - IjkMediaPlayer.this.mLastPullSize;
                if (IjkMediaPlayer.this.mPullSizePerSec == null) {
                    IjkMediaPlayer ijkMediaPlayer3 = IjkMediaPlayer.this;
                    IjkMediaPlayer ijkMediaPlayer4 = IjkMediaPlayer.this;
                    ijkMediaPlayer3.mPullSizePerSec = ijkMediaPlayer4.new LimitedQueue(ijkMediaPlayer4.mPullSizeLogCount);
                }
                if (IjkMediaPlayer.this.mPullSizePerSec != null && IjkMediaPlayer.this.mPullSizeLogHz != 0 && IjkMediaPlayer.this.mPullSizePerSec.size() < IjkMediaPlayer.this.mPullSizeLogCount) {
                    IjkMediaPlayer.this.mPullSizePerSec.add(Long.valueOf(((j2 * ((long) (1000 / IjkMediaPlayer.this.mPullSizeLogHz))) * 8) / 1000));
                }
                IjkMediaPlayer.this.mLastPullSize = j_getReadByte2;
            } catch (Exception unused2) {
            }
            sendMessageDelayed(obtainMessage(2), IjkMediaPlayer.this.mBufferLogHz);
        }
    }

    public interface JsonDateCallback {
        void JsonDateCallback(byte[] bArr, int i, IjkMediaPlayer ijkMediaPlayer);
    }

    public class LimitedQueue<E> extends LinkedList<E> {
        private static final long serialVersionUID = 1;
        private int limit;

        public LimitedQueue(int i) {
            this.limit = i;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e) {
            super.add(e);
            while (size() > this.limit) {
                super.remove();
            }
            return true;
        }
    }

    public interface MediaDateCallback {
        void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer);
    }

    public class MediaDateHandler extends Handler {
        private IjkMediaPlayer mijkMediaPlayer;
        MediaDateCallback pCb;

        public MediaDateHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
            super(looper);
            this.mijkMediaPlayer = ijkMediaPlayer;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 201) {
                MediaDateCallback mediaDateCallback = IjkMediaPlayer.this.mMediaDateCallback;
                this.pCb = mediaDateCallback;
                if (mediaDateCallback != null) {
                    mediaDateCallback.onMediaDateCallback((byte[]) message.obj, 0, message.arg2, this.mijkMediaPlayer);
                    return;
                }
                return;
            }
            if (i != 202) {
                hjx.b(IjkMediaPlayer.TAG, "Unknown message type " + message.what);
            } else {
                MediaDateCallback mediaDateCallback2 = IjkMediaPlayer.this.mMediaDateCallback;
                this.pCb = mediaDateCallback2;
                if (mediaDateCallback2 != null) {
                    mediaDateCallback2.onMediaDateCallback((byte[]) message.obj, 1, message.arg2, this.mijkMediaPlayer);
                }
            }
        }
    }

    public interface OnControlMessageListener {
        int onControlResolveSegmentCount();

        int onControlResolveSegmentDuration(int i);

        String onControlResolveSegmentOfflineMrl(int i);

        String onControlResolveSegmentUrl(int i);
    }

    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2);
    }

    public IjkMediaPlayer(Context context, IjkLibLoader ijkLibLoader, eix eixVar) {
        this.mNetDiffTime = 0L;
        this.mIFrameTime = 0L;
        this.mDelayTime = 0L;
        this.mSynSurface = new Object();
        this.mInterval = -1;
        this.mCount = -1;
        this.simpleInfoFromUpStream = null;
        this.mediaLogPullV2 = new gmx();
        this.mediaLogsValOfPull = new ymx();
        this.mWakeLock = null;
        this.mFakeSurface = null;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mScreenWidth = -1;
        this.mScreenHeight = -1;
        this.mManuaRefresh = false;
        this.mUseProxy = false;
        this.detectStatus = 0;
        this.mHasPrepared = false;
        this.mQuicServerIp = null;
        this.mIsQuicProxy = false;
        this.mCdnip = "";
        this.mTag = "";
        this.costOfsetSurfaceMs = 0L;
        this.metaTimeMs = 0L;
        this.LOG_BUF_SIZE = 1;
        this.LOG_PULL_SIZE = 2;
        this.mLastPullSize = 0L;
        this.mPullSizeLogCount = 10;
        this.mPullSizeLogHz = HttpStatus.INTERNAL_SERVER_ERROR_500;
        this.mLastBufferSize = 0L;
        this.mBufferLogCount = 10;
        this.mBufferLogHz = HttpStatus.INTERNAL_SERVER_ERROR_500;
        this.enableLogBufferAndPullSize = 0;
        this.mVideoRenderTHold = 0;
        this.mNewEnableLatency = 0;
        this.mAudioPtsValue = 1.5f;
        this.mMinVideoJumpDuration = 0.5f;
        this.mUseOpengl = 0;
        this.adjustFilter = null;
        this.filterOn = 0;
        this.mSaturation = 1.0f;
        this.mDeblurWeight = 0.45f;
        this.mDeblurRadius = 1.0f;
        this.mDeblurThreshold = 0.012f;
        this.mContrast = 0.0f;
        this.mDecorderRecordPts = -1;
        this.mDeblueEnabled = false;
        this.showId = "";
        this.sourceStr = "";
        this.httpMediaLogsUpload = null;
        this.mNewcheckSei = 0;
        this.mNewSizeChange = 0;
        this.pullStartAlreadySend = false;
        this.fast_dns_expire_time = HttpStatus.MULTIPLE_CHOICES_300;
        this.mLatencyEnable = 0;
        this.mLatencyBaseMark = 4000;
        this.mLatencySpeedupMark = 7999;
        this.mLatencyDropMark = 8000;
        this.mLatencySpeedRate = 1.1f;
        this.mBufferFirst = 0;
        this.mBufferCurrent = 0;
        this.mBufferNext = 0;
        this.mBufferLast = 0;
        this.mBufferInterval = 0;
        this.mHardDecoderFlagFromMediaConfig = false;
        this.mUseAndroidMediaCodec = false;
        this.mMediaCodecSetDone = false;
        this.enableHiFi = false;
        this.enable3D = false;
        this.headSetOn = false;
        dix.d().k(context, eixVar);
        this.mediaCfgParams = eixVar;
        if (eixVar != null) {
            this.mediaLogsValOfPull.X = eixVar.g();
        }
        this.mediaLogsValOfPull.a0 = String.valueOf(hashCode());
        initPlayer(ijkLibLoader);
    }

    private void MediaCfgInit() {
        eix eixVar = this.mediaCfgParams;
        if (eixVar == null || TextUtils.isEmpty(eixVar.b())) {
            eyx.c().g(new Object[]{"ijkmediaplayer mediaCfg == null, user default appid"});
            dix.d dVarH = dix.d().h("mlive");
            if (this.httpMediaLogsUpload == null) {
                this.httpMediaLogsUpload = new su10("mdefault", "1a738fb015fe0a8476c4e05a314156d2", dVarH != null ? dVarH.c : "", "", "", "", dix.d().g("mdefault"), "", this.mediaLogsValOfPull.a0, this.showId);
            }
            gmx gmxVar = this.mediaLogPullV2;
            if (gmxVar != null) {
                gmxVar.w(this.httpMediaLogsUpload);
                return;
            }
            return;
        }
        dix.d dVarH2 = dix.d().h(this.mediaCfgParams.b());
        if (dVarH2 != null) {
            ejx ejxVar = dVarH2.e;
            if (ejxVar != null) {
                this.mediaLogPullV2.x(ejxVar.n);
                this.mediaLogPullV2.A(dVarH2.e.m);
                this.mediaLogPullV2.v(dVarH2.e.j);
                ejx ejxVar2 = dVarH2.e;
                this.mUseOpengl = ejxVar2.Q0;
                int i = ejxVar2.S0;
                this.mNewcheckSei = i;
                this.mNewSizeChange = ejxVar2.T0;
                _setPropertyLong(FFP_PROP_INT64_NEW_CHECK_SEI, i);
                _setPropertyLong(FFP_PROP_INT64_NEW_SIZE_CHANGE, this.mNewSizeChange);
            }
            if (this.mediaCfgParams.c() != 0) {
                this.mediaLogsValOfPull.O = this.mediaCfgParams.c();
            }
            if (this.httpMediaLogsUpload == null) {
                this.httpMediaLogsUpload = new su10(this.mediaCfgParams.b(), dVarH2.b, dVarH2.c, this.mediaCfgParams.h(), String.valueOf(this.mediaCfgParams.f()), String.valueOf(this.mediaCfgParams.c()), dix.d().g(this.mediaCfgParams.b()), this.mediaCfgParams.j(), this.mediaLogsValOfPull.a0, this.showId);
            }
            this.httpMediaLogsUpload.e(this.mTag);
            gmx gmxVar2 = this.mediaLogPullV2;
            if (gmxVar2 != null) {
                gmxVar2.w(this.httpMediaLogsUpload);
            }
            if (TextUtils.isEmpty(this.mediaCfgParams.h()) || this.mediaCfgParams.c() == 0) {
                eyx.c().g(new Object[]{"mediaCfgParams" + this.mediaCfgParams.toString()});
                eyx.c().g(new Object[]{"threadInfo:" + mek0.e()});
            }
        }
    }

    private final native void _addAudioCallbackBuffer(byte[] bArr, int i);

    private native void _clearCutPosition();

    private native void _configBufferCache(int i);

    private native void _configMaxDropBase(int i);

    private native String _getAudioCodecInfo();

    private native int _getAudioTrackNum();

    private static native String _getColorFormatName(int i);

    private native Bundle _getMediaMeta();

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

    private native String _getPropertyString(int i);

    private native float _getRate();

    /* JADX INFO: Access modifiers changed from: private */
    public native long _getReadByte();

    private native String _getServerIpAddr();

    private native String _getVideoCodecInfo();

    private native void _mlSetLowerLatency(int i, int i2, int i3, int i4, float f);

    private native void _openAudioTracks(boolean z);

    private native void _pause() throws IllegalStateException;

    private native void _release();

    private native void _reset();

    private native void _resetInternal();

    private native void _setAudioTrackIndex(int i);

    private native void _setBufferParams(int i, int i2, int i3, int i4, int i5);

    private native void _setCutPosition(float f, float f2, float f3, float f4);

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    private native void _setDynamicBuffer(boolean z);

    private native void _setMediaDateCallbackFlags(int i);

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setPlayback(boolean z);

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

    private native void _setQuicProxy(boolean z);

    private native void _setRate(float f);

    private native void _setSpeedControl(int i, int i2, float f, int i3, float f2);

    private native void _setVideoSurface(Surface surface, Surface surface2);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    /* JADX INFO: Access modifiers changed from: private */
    public void bufferStartV2() {
        if (this.mediaLogPullV2.g()) {
            this.mediaLogsValOfPull.u = getVideoCachedDuration();
            this.mediaLogsValOfPull.v = getAudioCachedDuration();
            tgf0 tgf0Var = this.simpleInfoFromUpStream;
            if (tgf0Var != null) {
                int iB = tgf0Var.b();
                this.mediaLogsValOfPull.q = iB != -1 ? iB : 2L;
            }
            try {
                if (this.mBufferPerSec != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<Long> it = this.mBufferPerSec.iterator();
                    while (it.hasNext()) {
                        sb.append(String.valueOf(it.next()));
                        sb.append(":");
                    }
                    this.mediaLogsValOfPull.Z = sb.substring(0, sb.length() - 1);
                } else {
                    this.mediaLogsValOfPull.Z = "";
                }
            } catch (Exception unused) {
            }
            this.mediaLogsValOfPull.f0 = getVideoCodecType();
            this.mediaLogPullV2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bufferStopV2() {
        if (this.mediaLogPullV2.g()) {
            this.mediaLogsValOfPull.u = getVideoCachedDuration();
            this.mediaLogsValOfPull.v = getAudioCachedDuration();
            tgf0 tgf0Var = this.simpleInfoFromUpStream;
            if (tgf0Var != null) {
                int iB = tgf0Var.b();
                this.mediaLogsValOfPull.q = iB != -1 ? iB : 2L;
            }
            this.mediaLogsValOfPull.f0 = getVideoCodecType();
            this.mediaLogPullV2.b();
        }
    }

    private void configDataProcess(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("enableVBR")) {
                jSONObject.getInt("enableVBR");
            }
            if (jSONObject.has("playerBufferMax")) {
                setMaxTimeOfBuffer(jSONObject.getInt("playerBufferMax"));
            }
        } catch (Exception unused) {
        }
    }

    private String getCdnIp(String str) {
        String strSubstring = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                int iIndexOf = TextUtils.indexOf(str, "//") + 2;
                int iIndexOf2 = TextUtils.indexOf(str, "/", iIndexOf);
                if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                    strSubstring = str.substring(iIndexOf, iIndexOf2);
                    if (strSubstring.startsWith("[")) {
                        int iIndexOf3 = strSubstring.indexOf("]");
                        if (iIndexOf3 > 0) {
                            strSubstring = strSubstring.substring(1, iIndexOf3);
                        }
                    } else if (strSubstring.contains(":")) {
                        strSubstring = strSubstring.substring(0, strSubstring.indexOf(":"));
                    }
                    if (strSubstring.contains("127.0.0.1") || strSubstring.equals("::1") || strSubstring.equals("0:0:0:0:0:0:0:1")) {
                        int i = iIndexOf2 + 1;
                        int iIndexOf4 = TextUtils.indexOf(str, "/", i);
                        if (i >= 0 && iIndexOf4 >= 0) {
                            strSubstring = str.substring(i, iIndexOf4);
                            if (strSubstring.startsWith("[")) {
                                int iIndexOf5 = strSubstring.indexOf("]");
                                if (iIndexOf5 > 0) {
                                    return strSubstring.substring(1, iIndexOf5);
                                }
                            } else if (strSubstring.contains(":") && !strSubstring.contains("::") && strSubstring.lastIndexOf(":") == strSubstring.indexOf(":")) {
                                return strSubstring.substring(0, strSubstring.indexOf(":"));
                            }
                        }
                    }
                }
            }
            return strSubstring;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getColorFormatName(int i) {
        return _getColorFormatName(i);
    }

    private long getFirstVideoHasMomoSEI() {
        return _getPropertyLong_(FFP_PROP_INT64_FIRST_VIDEO_HASMOMOSEI, 0L);
    }

    private long getNetAnchorTime() {
        return fjx.R().U0() ? fjx.R().X() : System.currentTimeMillis() - this.mNetDiffTime;
    }

    private String getPullDetects() {
        pullDetect[] pullDetectStatus = getPullDetectStatus();
        StringBuilder sb = new StringBuilder();
        if (pullDetectStatus != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (pullDetect pulldetect : pullDetectStatus) {
                if (pulldetect.timestamp != 0) {
                    i++;
                    i2 += pulldetect.dnsTime;
                    i3 = (int) (((long) i3) + pulldetect.tcpConnectTime);
                    i4 = (int) (((long) i4) + pulldetect.httpTime);
                    i5 = pulldetect.ffmpegErrno;
                }
            }
            sb.append(i + "," + i2 + "," + i3 + "," + i4 + "," + i5);
        } else {
            sb.append("0,0,0,0,0");
        }
        return sb.toString();
    }

    private static void initNativeOnce() {
        synchronized (IjkMediaPlayer.class) {
            try {
                if (!mIsNativeInitialized) {
                    native_init();
                    mIsNativeInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initPlayer(IjkLibLoader ijkLibLoader) {
        hjx.d(TAG, "[" + hashCode() + "]");
        loadLibrariesOnce(ijkLibLoader);
        initNativeOnce();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(this, looperMyLooper);
            this.logtimer = new GetSpeedByteTimer(looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
                this.logtimer = new GetSpeedByteTimer(mainLooper);
            } else {
                this.mEventHandler = null;
                this.logtimer = null;
            }
        }
        ymx ymxVar = this.mediaLogsValOfPull;
        this.mHwCodec = false;
        ymxVar.n = false;
        try {
            HandlerThread handlerThread = new HandlerThread("MediaDateC");
            this.mMediaDateHT = handlerThread;
            handlerThread.start();
            this.mMediaDateHandler = new MediaDateHandler(this, this.mMediaDateHT.getLooper());
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            native_setup(new WeakReference(this));
        } catch (Error e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            try {
                if (!mIsLibLoaded) {
                    if (ijkLibLoader == null) {
                        ijkLibLoader = sLocalLibLoader;
                    }
                    if (ijkLibLoader != null) {
                        ijkLibLoader.loadLibrary("cosmosffmpeg");
                        ijkLibLoader.loadLibrary("ijklivesdl");
                        ijkLibLoader.loadLibrary("ijkplayer");
                        mIsLibLoaded = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mediaLogs(String str, String str2) {
        if (this.mediaLogPullV2.g() && this.mediaLogPullV2.f() == 1) {
            this.mediaLogPullV2.j(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mediaLogs2(Object... objArr) {
        if (this.mediaLogPullV2.g() && this.mediaLogPullV2.f() == 1) {
            this.mediaLogPullV2.k(objArr);
        }
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    @CalledByNative
    private static int onControlResolveSegmentCount(Object obj) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        hjx.c(TAG, "onControlResolveSegmentCount", new Object[0]);
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return -1;
        }
        return onControlMessageListener.onControlResolveSegmentCount();
    }

    @CalledByNative
    private static int onControlResolveSegmentDuration(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        hjx.c(TAG, "onControlResolveSegmentDuration %d", new Object[]{Integer.valueOf(i)});
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return -1;
        }
        return onControlMessageListener.onControlResolveSegmentDuration(i);
    }

    @CalledByNative
    private static String onControlResolveSegmentOfflineMrl(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        hjx.c(TAG, "onControlResolveSegmentOfflineMrl %d", new Object[]{Integer.valueOf(i)});
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return null;
        }
        return onControlMessageListener.onControlResolveSegmentOfflineMrl(i);
    }

    @CalledByNative
    private static String onControlResolveSegmentUrl(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        hjx.c(TAG, "onControlResolveSegmentUrl %d", new Object[]{Integer.valueOf(i)});
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return null;
        }
        return onControlMessageListener.onControlResolveSegmentUrl(i);
    }

    @CalledByNative
    private static void onNotifyJson(Object obj, int i, int i2, Object obj2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String((byte[]) obj2));
            long j = jSONObject.has("ts") ? jSONObject.getLong("ts") : 0L;
            if (j != 0) {
                ijkMediaPlayer.mIFrameTime = j;
            }
            if (ijkMediaPlayer.mIFrameTime != 0) {
                ijkMediaPlayer.mDelayTime = ijkMediaPlayer.getNetAnchorTime() - ijkMediaPlayer.mIFrameTime;
            } else {
                ijkMediaPlayer.mDelayTime = 0L;
            }
            ijkMediaPlayer.mediaLogsValOfPull.K = ijkMediaPlayer.mDelayTime;
            ijkMediaPlayer._setPropertyLong_(FFP_PROP_INT64_IFRAME_DEALY, ijkMediaPlayer.mDelayTime);
            Log.e("lqdebug", "mediaplayer json:" + jSONObject.toString());
            hjx.a(TAG, "[" + ijkMediaPlayer.hashCode() + "] onNotifyJson sei   " + jSONObject.toString() + " delay " + ijkMediaPlayer.mDelayTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ijkMediaPlayer.sendJsonData((byte[]) obj2, 0, ijkMediaPlayer);
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return null;
        }
        if ("ffmpeg/video".equalsIgnoreCase(str)) {
            hjx.b(TAG, "onSelectCodec use ffmpeg codec: " + ijkMediaPlayer.mFakeSurface);
            ymx ymxVar = ijkMediaPlayer.mediaLogsValOfPull;
            ijkMediaPlayer.mHwCodec = false;
            ymxVar.n = false;
            return null;
        }
        ymx ymxVar2 = ijkMediaPlayer.mediaLogsValOfPull;
        ijkMediaPlayer.mHwCodec = true;
        ymxVar2.n = true;
        OnMediaCodecSelectListener onMediaCodecSelectListener = ijkMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(ijkMediaPlayer, str, i, i2);
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        if (i == 200 && i2 == 2) {
            ijkMediaPlayer.start();
        }
        EventHandler eventHandler = ijkMediaPlayer.mEventHandler;
        if (eventHandler != null) {
            if (i == 5) {
                ijkMediaPlayer.mEventHandler.sendMessageDelayed(eventHandler.obtainMessage(i, (short) ((i2 >> 16) & 65535), (short) (i2 & 65535), obj2), i3);
            } else {
                ijkMediaPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj2));
            }
        }
    }

    private static void postMediaDateFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        IjkMediaPlayer ijkMediaPlayer;
        MediaDateHandler mediaDateHandler;
        if (obj == null || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (mediaDateHandler = ijkMediaPlayer.mMediaDateHandler) == null) {
            return;
        }
        ijkMediaPlayer.mMediaDateHandler.sendMessage(mediaDateHandler.obtainMessage(i, i2, i3, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullBufferCheck() {
        this.mediaLogsValOfPull.y = getVideoOutputFrames();
        ymx ymxVar = this.mediaLogsValOfPull;
        long j = ymxVar.y;
        long j2 = j - ymxVar.I;
        ymxVar.I = j;
        if (this.pullStartAlreadySend && j2 / 5 <= 5) {
            ymxVar.J++;
        }
        hjx.a("buffercheckcount", "pullBufferCheck diff " + j2 + "/" + this.mediaLogsValOfPull.J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullBufferDropV2() {
        if (this.mediaLogPullV2.g()) {
            this.mediaLogsValOfPull.d0 = _getPropertyLong(FFP_PROP_INT64_PER_AUDIO_PACK_DUR, 0L);
            this.mediaLogPullV2.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullDetectV2() {
        if (this.mediaLogPullV2.g() && !this.mediaLogPullV2.h()) {
            pullDetect[] pullDetectStatus = getPullDetectStatus();
            StringBuilder sb = new StringBuilder();
            if (pullDetectStatus != null) {
                int i = 0;
                for (int length = pullDetectStatus.length; i < length; length = length) {
                    pullDetect pulldetect = pullDetectStatus[i];
                    long j = pulldetect.timestamp;
                    if (j != 0) {
                        sb.append(imx.w(new Object[]{Long.valueOf(j), Integer.valueOf(pulldetect.unixErrno), Integer.valueOf(pulldetect.dnsTime), Long.valueOf(pulldetect.tcpConnectTime), Long.valueOf(pulldetect.httpTime), Integer.valueOf(pulldetect.httpResponseCode), Long.valueOf(pulldetect.firstPacketTime), Float.valueOf(getFirstIFrameTimes()), pulldetect.url, pulldetect.cdnIp, Integer.valueOf(pulldetect.ffmpegErrno), Long.valueOf(this.mediaLogsValOfPull.h0)}));
                    }
                    i++;
                }
            }
            this.mediaLogsValOfPull.b = sb.toString();
            this.mediaLogPullV2.m();
        }
    }

    private void pullInitV2() {
        if (this.mediaLogPullV2.g()) {
            this.mediaLogPullV2.z(this.mediaLogsValOfPull);
            this.mediaLogPullV2.B(new gmx.b() { // from class: tv.danmaku.ijk.media.player.IjkMediaPlayer.2
                public void messageFromMediaLogV2(int i, int i2, int i3, Object obj) {
                    if (IjkMediaPlayer.this.mEventHandler != null) {
                        IjkMediaPlayer.this.mEventHandler.obtainMessage(i, i2, i3, obj).sendToTarget();
                    }
                }
            });
            this.mediaLogPullV2.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullStartV2() {
        if (this.mediaLogPullV2.g()) {
            this.mediaLogsValOfPull.e = getMetaSystemTime();
            this.mediaLogsValOfPull.f = (long) getConnetTimes();
            this.mediaLogsValOfPull.g = (long) getFirstVPacketTimes();
            this.mediaLogsValOfPull.h = (long) getFirstAPacketTimes();
            this.mediaLogsValOfPull.i = (long) getFirstIFrameTimes();
            this.mediaLogsValOfPull.j = (long) getFirstAFrameTimes();
            this.mediaLogsValOfPull.k = (long) getFirstVRenderTimes();
            this.mediaLogsValOfPull.l = (long) getFirstARenderTimes();
            this.mediaLogsValOfPull.m = getStreamCount();
            this.mediaLogsValOfPull.P = getFirstVideoHasMomoSEI();
            this.mediaLogsValOfPull.S = getPropertyString(FFP_PROP_STRING_GETCDNIP);
            this.mediaLogsValOfPull.T = getPropertyString(FFP_PROP_STRING_GETCLIENTIP);
            this.mediaLogsValOfPull.d0 = _getPropertyLong(FFP_PROP_INT64_PER_AUDIO_PACK_DUR, 0L);
            this.mediaLogsValOfPull.f0 = getVideoCodecType();
            this.mediaLogsValOfPull.g0 = this.detectStatus;
            tgf0 tgf0Var = this.simpleInfoFromUpStream;
            if (tgf0Var != null) {
                int iB = tgf0Var.b();
                this.mediaLogsValOfPull.q = iB != -1 ? iB : 2L;
            }
            tgf0 tgf0Var2 = this.simpleInfoFromUpStream;
            if (tgf0Var2 != null) {
                String strA = tgf0Var2.a();
                if (strA != null && !TextUtils.isEmpty(strA)) {
                    this.mediaLogsValOfPull.d = strA;
                }
                this.mediaLogsValOfPull.U = this.simpleInfoFromUpStream.c();
            }
            if ((StringUtil.ALL_INTERFACES.equals(this.mediaLogsValOfPull.d) || "127.0.0.1".equals(this.mediaLogsValOfPull.d)) && !TextUtils.isEmpty(this.mCdnip) && Utils.isValidIpAddress(this.mCdnip)) {
                this.mediaLogsValOfPull.d = this.mCdnip;
            }
            pullDetectV2();
            hjx.a("pullJzheng", "isFirstVideoHasMomoSEI = " + this.mediaLogsValOfPull.P);
            hjx.a("pullJzheng", "ipAddrOfCDN = " + this.mediaLogsValOfPull.S);
            hjx.a("pullJzheng", "ipAddrOfClient = " + this.mediaLogsValOfPull.T);
            this.mediaLogPullV2.o();
            this.pullStartAlreadySend = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullStopV2() {
        if (this.mediaLogPullV2.g()) {
            pullDetectV2();
            updatePullWatch();
            tgf0 tgf0Var = this.simpleInfoFromUpStream;
            if (tgf0Var != null) {
                int iB = tgf0Var.b();
                ymx ymxVar = this.mediaLogsValOfPull;
                ymxVar.q = iB != -1 ? iB : 2L;
                ymxVar.U = this.simpleInfoFromUpStream.c();
                String strA = this.simpleInfoFromUpStream.a();
                if (strA != null && !TextUtils.isEmpty(strA)) {
                    this.mediaLogsValOfPull.d = strA;
                }
            }
            if ((StringUtil.ALL_INTERFACES.equals(this.mediaLogsValOfPull.d) || "127.0.0.1".equals(this.mediaLogsValOfPull.d)) && !TextUtils.isEmpty(this.mCdnip)) {
                boolean zIsValidIpAddress = Utils.isValidIpAddress(this.mCdnip);
                ymx ymxVar2 = this.mediaLogsValOfPull;
                if (zIsValidIpAddress) {
                    ymxVar2.d = this.mCdnip;
                } else {
                    ymxVar2.d = getServerIpAddr();
                }
            }
            ymx ymxVar3 = this.mediaLogsValOfPull;
            ymxVar3.V = this.pullStartAlreadySend ? 1L : 0L;
            ymxVar3.r = getReadByte();
            if (this.pullStartAlreadySend) {
                ymx ymxVar4 = this.mediaLogsValOfPull;
                if (ymxVar4.o == 1) {
                    ymxVar4.o = 0L;
                }
            }
            if (this.mPullSizePerSec != null) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<Long> it = this.mPullSizePerSec.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(String.valueOf(it.next()));
                    stringBuffer.append(":");
                }
                this.mediaLogsValOfPull.Y = stringBuffer.substring(0, stringBuffer.length() - 1);
            } else {
                this.mediaLogsValOfPull.Y = "";
            }
            this.mediaLogsValOfPull.f0 = getVideoCodecType();
            this.mediaLogsValOfPull.g0 = this.detectStatus;
            this.mediaLogPullV2.p();
            this.pullStartAlreadySend = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullWatchV2() {
        if (this.mediaLogPullV2.g()) {
            updatePullWatch();
            hjx.a("pullJzheng", "FFP_PROP_INT64_VIDEODONTHASMOMOSEICNT = " + this.mediaLogsValOfPull.Q);
            this.mediaLogPullV2.q();
        }
    }

    private void release_l() {
        hjx.d(TAG, "[" + hashCode() + "] " + this.mFakeSurface + " release_l. ");
        stayAwake(false);
        setOnErrorListener(null);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        resetListeners();
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.release();
            this.mFakeSurface = null;
        }
        this.mSurface = null;
        this.mSurfaceHolder = null;
        clearCutPosition();
        try {
            _release();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MediaDateHandler mediaDateHandler = this.mMediaDateHandler;
        if (mediaDateHandler != null) {
            mediaDateHandler.removeCallbacksAndMessages(null);
            this.mMediaDateHandler = null;
        }
        GetSpeedByteTimer getSpeedByteTimer = this.logtimer;
        if (getSpeedByteTimer != null) {
            getSpeedByteTimer.removeCallbacksAndMessages(null);
            this.logtimer = null;
        }
        try {
            HandlerThread handlerThread = this.mMediaDateHT;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mMediaDateHT.join();
                this.mMediaDateHT = null;
            }
        } catch (Error e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.mMediaDateHT = null;
        this.mMediaDateHandler = null;
    }

    private void set3D(boolean z) {
        setPropertyLong(FFP_PROP_INT64_AUDIO_EFFECT_3D, z ? 1L : 0L);
    }

    private void setBoost3D(boolean z) {
        setPropertyLong(FFP_PROP_INT64_AUDIO_EFFECT_BOOST_3D, z ? 1L : 0L);
    }

    private void setBoostHiFi(boolean z) {
        setPropertyLong(FFP_PROP_INT64_AUDIO_EFFECT_BOOST_HIFI, z ? 1L : 0L);
    }

    private void setCdnType(String str) {
        mediaLogs2("setCdnType" + str);
        eyx.c().g(new Object[]{"setCdnType", "setCdnType:" + str});
        try {
            int i = Integer.parseInt(str);
            if (i != 0) {
                eix eixVar = this.mediaCfgParams;
                if (eixVar != null) {
                    eixVar.r(i);
                }
                gmx gmxVar = this.mediaLogPullV2;
                if (gmxVar != null) {
                    gmxVar.D(i);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    private void setHifi(boolean z) {
        setPropertyLong(FFP_PROP_INT64_AUDIO_EFFECT_HIFI, z ? 1L : 0L);
    }

    private void setMediaCodecEnabled_l(boolean z) {
        hjx.d(TAG, "[" + hashCode() + "] " + z + " -->  done: " + this.mMediaCodecSetDone + " surface: " + this.mFakeSurface);
        if (this.mMediaCodecSetDone) {
            return;
        }
        this.mMediaCodecSetDone = true;
        setOption(4, "mediacodec", z ? 1L : 0L);
        if (!z) {
            this.mFakeSurface = null;
            return;
        }
        if (this.mFakeSurface == null) {
            fakeSurface fakesurface = new fakeSurface();
            this.mFakeSurface = fakesurface;
            fakesurface.setSaturation(this.mSaturation);
            this.mFakeSurface.setDeblurWeight(this.mDeblurWeight);
            this.mFakeSurface.setDeblurEnabled(this.mDeblueEnabled);
            this.mFakeSurface.setRenderMode(fakeSurface.RenderMode.RENDER_MODE_SIMPLE);
            this.mFakeSurface.activiteSurface(null);
            mediaLogs2("hwDecoder", hashCode() + "HWRender Start 硬解开");
            if (this.mFakeSurface.getLastErr() != 0) {
                mediaLogs2("setMediaCodecEnabled_l" + hashCode() + " mFakeSurface creat error: " + this.mFakeSurface.getLastErr());
                this.mFakeSurface.release();
                this.mFakeSurface = null;
                hjx.b(TAG, "mFakeSurface creat error use softdec");
            }
        }
    }

    public static Map<String, String> splitQuery(URL url) throws Exception {
        HashMap map = new HashMap();
        String query = url.getQuery();
        if (query != null) {
            for (String str : query.split("&")) {
                int iIndexOf = str.indexOf("=");
                map.put(URLDecoder.decode(str.substring(0, iIndexOf), StringUtil.__UTF8), URLDecoder.decode(str.substring(iIndexOf + 1), StringUtil.__UTF8));
            }
        }
        return map;
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

    private void updatePullWatch() {
        this.mediaLogsValOfPull.r = getReadByte();
        this.mediaLogsValOfPull.s = getVideoReadSize();
        this.mediaLogsValOfPull.t = getAudioReadSize();
        this.mediaLogsValOfPull.u = getVideoCachedDuration();
        this.mediaLogsValOfPull.v = getAudioCachedDuration();
        this.mediaLogsValOfPull.w = getVideoDecodeFrames();
        this.mediaLogsValOfPull.x = getAudioDecoderSize();
        this.mediaLogsValOfPull.y = getVideoOutputFrames();
        this.mediaLogsValOfPull.z = getAudioRenderSize();
        this.mediaLogsValOfPull.L = (long) getAudioSampleRate();
        this.mediaLogsValOfPull.Q = getPropertyLong(FFP_PROP_INT64_VIDEODONTHASMOMOSEICNT, 0L);
        this.mediaLogsValOfPull.f0 = getVideoCodecType();
        tgf0 tgf0Var = this.simpleInfoFromUpStream;
        if (tgf0Var != null) {
            int iB = tgf0Var.b();
            this.mediaLogsValOfPull.q = iB != -1 ? iB : 2L;
        }
    }

    private void updateSurfaceScreenOn() {
        try {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.setKeepScreenOn(this.mScreenOnWhilePlaying && this.mStayAwake);
            }
        } catch (Exception unused) {
        }
    }

    public native long _getCurrentPosition();

    public native long _getCurrentPts();

    public native long _getDuration();

    public native Object[] _getPullDetectStatus();

    public native boolean _isPlaying();

    public native void _prepareAsync() throws IllegalStateException;

    public native void _seekTo(long j) throws IllegalStateException;

    public native void _setVolume(float f, float f2);

    public void applyMediaConfig(ejx ejxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (ejxVar == null) {
            eyx.c().g(new Object[]{"applyMediaConfig", "mediaConfig === " + ejxVar});
            return;
        }
        this.mediaLogPullV2.x(ejxVar.n);
        this.mediaLogPullV2.A(ejxVar.m);
        this.mediaLogPullV2.v(ejxVar.j);
        this.mUseOpengl = ejxVar.Q0;
        this.enableLogBufferAndPullSize = ejxVar.J0;
        this.mBufferLogHz = ejxVar.K0;
        this.mPullSizeLogCount = ejxVar.L0;
        this.mBufferLogCount = ejxVar.M0;
        this.mVideoRenderTHold = ejxVar.N0;
        this.mNewEnableLatency = ejxVar.O0;
        this.mAudioPtsValue = ejxVar.P0;
        this.mMinVideoJumpDuration = ejxVar.R0;
        this.mDecorderRecordPts = ejxVar.U0;
        this.mNewcheckSei = ejxVar.S0;
        this.mNewSizeChange = ejxVar.T0;
        fjx.R().s1(ejxVar.G0 == 1);
        int i5 = ejxVar.H0;
        if (i5 > 0) {
            this.mediaLogPullV2.C(i5);
        }
        int i6 = ejxVar.I0;
        if (i6 > 0) {
            this.mediaLogPullV2.u(i6);
        }
        setPropertyLong(FFP_PROP_INT64_VIDEO_RENDER_THRESHOLD, ejxVar.N0);
        setPropertyLong(FFP_PROP_INT64_VIDEO_NEW_ENABLE_LATENCY, ejxVar.O0);
        _setPropertyFloat_(FFP_PROP_FLOAT_AUDIO_PTS_VALUE, ejxVar.P0);
        _setPropertyFloat_(FFP_PROP_FLOAT_MIN_VIDEO_JUMP_DURATION, ejxVar.R0);
        _setPropertyLong(FFP_PROP_INT64_DECORD_RECORD_PTS, ejxVar.U0);
        _setPropertyLong(FFP_PROP_INT64_NEW_CHECK_SEI, ejxVar.S0);
        _setPropertyLong(FFP_PROP_INT64_ENABLE_LATENCY_SECONDS, ejxVar.V0);
        _setPropertyLong(FFP_PROP_INT64_NEW_SIZE_CHANGE, ejxVar.T0);
        int i7 = ejxVar.W0;
        this.mLatencyEnable = i7;
        int i8 = ejxVar.X0;
        this.mLatencyBaseMark = i8;
        int i9 = ejxVar.Y0;
        this.mLatencySpeedupMark = i9;
        int i10 = ejxVar.Z0;
        this.mLatencyDropMark = i10;
        float f = ejxVar.a1;
        this.mLatencySpeedRate = f;
        this.mBufferFirst = ejxVar.b1;
        this.mBufferCurrent = ejxVar.c1;
        this.mBufferNext = ejxVar.d1;
        this.mBufferLast = ejxVar.e1;
        this.mBufferInterval = ejxVar.f1;
        mlSetLowerLatency(i7, i8, i9, i10, f);
        int i11 = this.mBufferFirst;
        if (i11 > 0 && (i = this.mBufferCurrent) > 0 && (i2 = this.mBufferNext) > 0 && (i3 = this.mBufferLast) > 0 && (i4 = this.mBufferInterval) > 0) {
            setBufferParams(i11, i, i2, i3, i4);
        }
        this.filterOn = ejxVar.g1;
        this.mSaturation = ejxVar.h1;
        this.mDeblurWeight = ejxVar.i1;
        this.mDeblurRadius = ejxVar.j1;
        this.mDeblurThreshold = ejxVar.k1;
        this.mContrast = ejxVar.l1;
        this.mHardDecoderFlagFromMediaConfig = ejxVar.F0 != 0;
        setMediaCodecEnabled(this.mHardDecoderFlagFromMediaConfig);
        this.mediaLogPullV2.k(new Object[]{"mediaconfig", "mDecorderRecordPts:" + ejxVar.U0 + ", NewEnableLatency:" + ejxVar.O0 + ",Latency_seconds:" + ejxVar.V0});
        gmx gmxVar = this.mediaLogPullV2;
        StringBuilder sb = new StringBuilder("mUseOpengl:");
        sb.append(this.mUseOpengl);
        gmxVar.k(new Object[]{"prepareAsync", sb.toString(), "filterOn:" + this.filterOn + ",checksei:" + ejxVar.S0 + ",sizechange:" + ejxVar.T0});
    }

    public void clearCutPosition() {
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.updateRect(0.0f, 0.0f, 1.0f, 1.0f);
        } else {
            _clearCutPosition();
        }
    }

    public void configBufferCache(int i) {
        try {
            _configBufferCache(i);
        } catch (Error | Exception unused) {
        }
    }

    public void configMaxDropBase(int i) {
        try {
            _configMaxDropBase(i);
        } catch (Error | Exception unused) {
        }
    }

    public void finalize() {
        try {
            native_finalize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float getAVdiff() {
        return _getPropertyFloat_(PROP_FLOAT_AVDIFF, 0.0f);
    }

    public long getAudioCachedBytes() {
        return _getPropertyLong_(FFP_PROP_INT64_AUDIO_CACHED_BYTES, 0L);
    }

    public long getAudioCachedDuration() {
        return getAudioCachedPackets() * 23;
    }

    public long getAudioCachedPackets() {
        return _getPropertyLong_(FFP_PROP_INT64_AUDIO_CACHED_PACKETS, 0L);
    }

    public long getAudioDecoderSize() {
        return _getPropertyLong_(FFP_PROP_INT64_AUDIO_DECODER_BYTES, 0L);
    }

    public long getAudioReadSize() {
        return _getPropertyLong_(FFP_PROP_INT64_AUDIO_READ_BYTES, 0L);
    }

    public long getAudioRenderSize() {
        return _getPropertyLong_(FFP_PROP_INT64_AUDIO_RENDER_BYTES, 0L);
    }

    public float getAudioSampleRate() {
        return _getPropertyFloat_(FFP_PROP_FLOAT_SAMPLE_RATE, 0.0f);
    }

    public long getAudioStreamIndex() {
        return _getPropertyLong_(FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 0L);
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioTrackNum() {
        try {
            return _getAudioTrackNum();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getBatteryInfo() {
        return st0.g().b();
    }

    public int getBufferCurrent() {
        return this.mBufferCurrent;
    }

    public int getBufferFirst() {
        return this.mBufferFirst;
    }

    public int getBufferInterval() {
        return this.mBufferInterval;
    }

    public int getBufferLast() {
        return this.mBufferLast;
    }

    public int getBufferNext() {
        return this.mBufferNext;
    }

    public float getConnetTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_CONNECT_TIME, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
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

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
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

    public mvj0 getCurrentUrlInfo() {
        return this.mCurrentUrlInfo;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    public long getDelayTime() {
        return this.mDelayTime;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
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

    public float getFirstAFrameTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_AFTAME, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstAPacketTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_APACKET, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstARenderTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_ARENDER, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstIFrameTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_IFTAME, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstVPacketTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_VPACKET, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstVRenderTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(FFP_PROP_FLOAT_FIRST_VRENDER, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public boolean getHardDecoderFlagFromMediaConfig() {
        return this.mHardDecoderFlagFromMediaConfig;
    }

    public int getLatencyBaseMark() {
        return this.mLatencyBaseMark;
    }

    public int getLatencyDropMark() {
        return this.mLatencyDropMark;
    }

    public int getLatencyEnable() {
        return this.mLatencyEnable;
    }

    public float getLatencySpeedRate() {
        return this.mLatencySpeedRate;
    }

    public int getLatencySpeedupMark() {
        return this.mLatencySpeedupMark;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        String str_getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(str_getVideoCodecInfo)) {
            String[] strArrSplit = str_getVideoCodecInfo.split(",");
            if (strArrSplit.length >= 2) {
                mediaInfo.mVideoDecoder = strArrSplit[0];
                mediaInfo.mVideoDecoderImpl = strArrSplit[1];
            } else if (strArrSplit.length >= 1) {
                mediaInfo.mVideoDecoder = strArrSplit[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        String str_getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(str_getAudioCodecInfo)) {
            String[] strArrSplit2 = str_getAudioCodecInfo.split(",");
            if (strArrSplit2.length >= 2) {
                mediaInfo.mAudioDecoder = strArrSplit2[0];
                mediaInfo.mAudioDecoderImpl = strArrSplit2[1];
            } else if (strArrSplit2.length >= 1) {
                mediaInfo.mAudioDecoder = strArrSplit2[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = IjkMediaMeta.parse(_getMediaMeta());
            return mediaInfo;
        } catch (Throwable th) {
            th.printStackTrace();
            return mediaInfo;
        }
    }

    public Bundle getMediaMeta() {
        return _getMediaMeta();
    }

    public long getMetaSystemTime() {
        return this.metaTimeMs;
    }

    public int getPlayerDebugInfo(int i) {
        switch (i) {
            case FFP_PROP_GET_BUFFER_FIRST /* 20056 */:
                return this.mBufferFirst;
            case FFP_PROP_GET_BUFFER_CURRENT /* 20057 */:
                return this.mBufferCurrent;
            case FFP_PROP_GET_BUFFER_NEXT /* 20058 */:
                return this.mBufferNext;
            case FFP_PROP_GET_BUFFER_LAST /* 20059 */:
                return this.mBufferLast;
            case FFP_PROP_GET_LATENCY_ENABLE /* 20060 */:
                return this.mLatencyEnable;
            case FFP_PROP_GET_LATENCY_BASE_MARK /* 20061 */:
                return this.mLatencyBaseMark;
            case FFP_PROP_GET_LATENCY_SPEEDUP_MARK /* 20062 */:
                return this.mLatencySpeedupMark;
            case FFP_PROP_GET_LATENCY_DROP_MARK /* 20063 */:
                return this.mLatencyDropMark;
            case FFP_PROP_GET_DELAY_TIME /* 20064 */:
                return (int) this.mDelayTime;
            case FFP_PROP_GET_BUFFER_INTERVAL /* 20065 */:
                return this.mBufferInterval;
            case FFP_PROP_GET_HARDDECODE /* 20066 */:
                return this.mHardDecoderFlagFromMediaConfig ? 1 : 0;
            default:
                return 0;
        }
    }

    public float getPropertyFloat(int i, float f) {
        return _getPropertyFloat(i, f);
    }

    public long getPropertyLong(int i, long j) {
        try {
            return _getPropertyLong_(i, j);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getPropertyString(int i) {
        try {
            return _getPropertyString(i);
        } catch (Exception unused) {
            eyx.c().g(new Object[]{"getPropertyString", Integer.valueOf(i)});
            return "";
        }
    }

    public pullDetect[] getPullDetectStatus() {
        try {
            return (pullDetect[]) _getPullDetectStatus();
        } catch (Error e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void getPullWatchInfo(PullWatchInfo pullWatchInfo) {
        boolean z = this.mVideoWidth > 0;
        pullWatchInfo.setUrl(getDataSource());
        pullWatchInfo.setPullDebugInfoWH(this.mVideoWidth, this.mVideoHeight);
        pullWatchInfo.setDstIp(_getServerIpAddr());
        pullWatchInfo.setPullDebugInfoParms(z ? getAudioReadSize() : 0L, z ? getVideoReadSize() : 0L, z ? getVideoOutputFrames() : 0L, z ? (int) getFirstARenderTimes() : 0, z ? (int) getFirstVRenderTimes() : 0, z ? (int) getVideoCachedDuration() : 0, z ? (int) getAudioCachedDuration() : 0, z ? (int) getDelayTime() : 0, s7y.h().b(), z ? getPullDetects() : "not prepared");
        pullWatchInfo.setVideoIsH265((int) getVideoCodecType());
        pullWatchInfo.setAudioSampleRate((int) getAudioSampleRate());
        pullWatchInfo.setPlayerType("ijkplayer");
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public float getRate() {
        try {
            return _getRate();
        } catch (Error e) {
            e.printStackTrace();
            return 1.0f;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1.0f;
        }
    }

    public long getReadByte() {
        try {
            return _getReadByte();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public boolean getRealMediaCodecType() {
        return this.mHwCodec;
    }

    public int getRenderType() {
        return this.mUseOpengl;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getServerIpAddr() {
        try {
            if (!TextUtils.isEmpty(this.mServerIpAddr)) {
                return this.mServerIpAddr;
            }
            String str_getServerIpAddr = _getServerIpAddr();
            this.mServerIpAddr = str_getServerIpAddr;
            return str_getServerIpAddr;
        } catch (Error e) {
            e.printStackTrace();
            return StringUtil.ALL_INTERFACES;
        } catch (IllegalStateException unused) {
            return StringUtil.ALL_INTERFACES;
        } catch (Exception e2) {
            e2.printStackTrace();
            return StringUtil.ALL_INTERFACES;
        }
    }

    public long getStreamCount() {
        return _getPropertyLong_(FFP_PROP_INT64_STREAM_COUNT, 0L);
    }

    public long getTsTime() {
        return this.mIFrameTime;
    }

    public long getVideoCachedBytes() {
        return _getPropertyLong_(FFP_PROP_INT64_VIDEO_CACHED_BYTES, 0L);
    }

    public long getVideoCachedDuration() {
        return getVideoCachedPackets() * 66;
    }

    public long getVideoCachedPackets() {
        return _getPropertyLong_(FFP_PROP_INT64_VIDEO_CACHED_PACKETS, 0L);
    }

    public long getVideoCodecType() {
        try {
            return _getPropertyLong(FFP_PROP_INT64_GET_VIDEOCODEC_TYPE, 0L);
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoDarDen() {
        return this.mVideoDarDen;
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoDarNum() {
        return this.mVideoDarNum;
    }

    public long getVideoDecodeFrames() {
        return _getPropertyLong_(PROP_INT64_VIDEO_DECODE_FRAMES, 0L);
    }

    public float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat_(10001, 0.0f);
    }

    public long getVideoDecoder() {
        return _getPropertyLong_(FFP_PROP_INT64_VIDEO_DECODER, 0L);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public long getVideoOutputFrames() {
        return _getPropertyLong_(PROP_INT64_VIDEO_OUTPUT_FRAMES, 0L);
    }

    public float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat_(10002, 0.0f);
    }

    public long getVideoReadSize() {
        return _getPropertyLong_(FFP_PROP_INT64_VIDEO_READ_BYTES, 0L);
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    public long getVideoStreamIndex() {
        return _getPropertyLong_(FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 0L);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public boolean hasPrepared() {
        return this.mHasPrepared;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
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

    public void livepullMegerUpload(String str, String str2) {
        this.mediaLogPullV2.i(str, str2);
    }

    public int mediaConfig(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        hjx.d(TAG, "[" + hashCode() + "] [" + str + "]");
        if (TextUtils.isEmpty(str)) {
            eyx.c().a("mediaConfig", "config", LogLevel.ERROR);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i5 = 3;
                if (jSONObject.has("pull_comm")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pull_comm");
                    if (jSONArrayOptJSONArray != null) {
                        int iOptInt = jSONArrayOptJSONArray.optInt(0, 0);
                        int iOptInt2 = jSONArrayOptJSONArray.optInt(1, 0);
                        int iOptInt3 = jSONArrayOptJSONArray.optInt(2, 10000);
                        int iOptInt4 = jSONArrayOptJSONArray.optInt(3, 20000);
                        this.mHardDecoderFlagFromMediaConfig = iOptInt != 0;
                        setMediaCodecEnabled(this.mHardDecoderFlagFromMediaConfig);
                        if (iOptInt3 > 0) {
                            this.mediaLogPullV2.C(iOptInt3);
                        }
                        if (iOptInt4 > 0) {
                            this.mediaLogPullV2.u(iOptInt4);
                        }
                        fjx.R().s1(iOptInt2 == 1);
                        this.enableLogBufferAndPullSize = jSONArrayOptJSONArray.optInt(4, 0);
                        this.mBufferLogHz = jSONArrayOptJSONArray.optInt(5, HttpStatus.INTERNAL_SERVER_ERROR_500);
                        this.mPullSizeLogCount = jSONArrayOptJSONArray.optInt(6, 10);
                        this.mBufferLogCount = jSONArrayOptJSONArray.optInt(7, 10);
                        this.mVideoRenderTHold = jSONArrayOptJSONArray.optInt(8, 0);
                        this.mNewEnableLatency = jSONArrayOptJSONArray.optInt(9, 0);
                        this.mAudioPtsValue = (float) jSONArrayOptJSONArray.optDouble(10, 1.5d);
                        this.mMinVideoJumpDuration = (float) jSONArrayOptJSONArray.optDouble(11, 0.5d);
                        this.mDecorderRecordPts = jSONArrayOptJSONArray.optInt(14, -1);
                    } else {
                        i5 = 3;
                        eyx.c().d("pull_comm", "ijkmediaplayer_mediaConfig");
                    }
                } else {
                    i5 = 3;
                }
                if (jSONObject.has("pull_delay")) {
                    String string = jSONObject.getString("pull_delay");
                    if (!TextUtils.isEmpty(string)) {
                        if (string.contains("[")) {
                            string = string.replace("[", "");
                        }
                        if (string.contains("]")) {
                            string = string.replace("]", "");
                        }
                        String[] strArrSplit = string.split(",");
                        if (strArrSplit != null) {
                            if (strArrSplit.length >= 5) {
                                this.mLatencyEnable = Integer.parseInt(strArrSplit[0]);
                                this.mLatencyBaseMark = Integer.parseInt(strArrSplit[1]);
                                this.mLatencySpeedupMark = Integer.parseInt(strArrSplit[r14]);
                                this.mLatencyDropMark = Integer.parseInt(strArrSplit[i5]);
                                this.mLatencySpeedRate = Float.parseFloat(strArrSplit[4]);
                            }
                            if (strArrSplit.length >= 10) {
                                this.mBufferFirst = Integer.parseInt(strArrSplit[5]);
                                this.mBufferCurrent = Integer.parseInt(strArrSplit[6]);
                                this.mBufferNext = Integer.parseInt(strArrSplit[7]);
                                this.mBufferLast = Integer.parseInt(strArrSplit[8]);
                                this.mBufferInterval = Integer.parseInt(strArrSplit[9]);
                            }
                        }
                    }
                } else {
                    eyx.c().d("pull_delay", "ijkmediaplayer_mediaConfig");
                }
                if (jSONObject.has("filter_config")) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("filter_config");
                    this.filterOn = jSONArrayOptJSONArray2.optInt(0, 0);
                    this.mSaturation = (float) jSONArrayOptJSONArray2.optDouble(1, 1.0d);
                    this.mDeblurWeight = (float) jSONArrayOptJSONArray2.optDouble(2, 0.0d);
                    this.mDeblurRadius = (float) jSONArrayOptJSONArray2.optDouble(i5, 1.0d);
                    this.mDeblurThreshold = (float) jSONArrayOptJSONArray2.optDouble(4, 1.0d);
                    this.mContrast = (float) jSONArrayOptJSONArray2.optDouble(5, 1.0d);
                } else {
                    eyx.c().d("filter_config", "ijkmediaplayer_mediaConfig");
                }
            } catch (Exception e) {
                eyx.c().d("" + e.toString(), "ijkmediaplayer_mediaConfig");
                eyx.c().g(new Object[]{"ijkmediaplayer parse mediaconfig:" + e.toString()});
            }
        }
        eyx.c().g(new Object[]{"ijkmediaplayer", "player hashcode:" + hashCode() + ",setMediaConfig:" + str});
        StringBuilder sb = new StringBuilder("mediaConfig:");
        sb.append(str);
        mediaLogs("ijkmediaplayer", sb.toString());
        mlSetLowerLatency(this.mLatencyEnable, this.mLatencyBaseMark, this.mLatencySpeedupMark, this.mLatencyDropMark, this.mLatencySpeedRate);
        int i6 = this.mBufferFirst;
        if (i6 > 0 && (i = this.mBufferCurrent) > 0 && (i2 = this.mBufferNext) > 0 && (i3 = this.mBufferLast) > 0 && (i4 = this.mBufferInterval) > 0) {
            setBufferParams(i6, i, i2, i3, i4);
        }
        setPropertyLong(FFP_PROP_INT64_VIDEO_RENDER_THRESHOLD, this.mVideoRenderTHold);
        setPropertyLong(FFP_PROP_INT64_VIDEO_NEW_ENABLE_LATENCY, this.mNewEnableLatency);
        _setPropertyFloat_(FFP_PROP_FLOAT_AUDIO_PTS_VALUE, this.mAudioPtsValue);
        _setPropertyFloat_(FFP_PROP_FLOAT_MIN_VIDEO_JUMP_DURATION, this.mMinVideoJumpDuration);
        _setPropertyLong(FFP_PROP_INT64_DECORD_RECORD_PTS, this.mDecorderRecordPts);
        return 0;
    }

    public void mlSetLowerLatency(int i, int i2, int i3, int i4, float f) {
        try {
            _mlSetLowerLatency(i, i2, i3, i4, f);
        } catch (Exception unused) {
        }
    }

    public native void native_setGLFilter(IjkFilter ijkFilter);

    public void openAudioTracks(boolean z) {
        try {
            _openAudioTracks(z);
        } catch (Exception unused) {
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        hjx.d(TAG, "[" + hashCode() + "]");
        stayAwake(false);
        try {
            _pause();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        try {
            StringBuilder sb = new StringBuilder("[");
            sb.append(hashCode());
            sb.append("] mediacodec:");
            sb.append(this.mUseAndroidMediaCodec);
            sb.append(" / ");
            sb.append(this.mFakeSurface);
            sb.append("/ ");
            fakeSurface fakesurface = this.mFakeSurface;
            sb.append(fakesurface == null ? null : fakesurface.getSurface());
            hjx.d(TAG, sb.toString());
            MediaCfgInit();
            setMediaCodecEnabled_l(this.mUseAndroidMediaCodec);
            if (this.mUseOpengl == 1) {
                setOption(4, "overlay-format", SDL_OPENGL);
                if (this.filterOn == 1) {
                    PlayerAdjustFilter playerAdjustFilter = new PlayerAdjustFilter();
                    this.adjustFilter = playerAdjustFilter;
                    playerAdjustFilter.setEnable(true);
                    this.adjustFilter.setSaturation(this.mSaturation);
                    this.adjustFilter.setSharpening(this.mDeblurWeight);
                    this.adjustFilter.setContrast(this.mContrast);
                    this.adjustFilter.setDeblurThreshold(this.mDeblurThreshold);
                    this.adjustFilter.setDeblurRadius((int) this.mDeblurRadius);
                    native_setGLFilter(this.adjustFilter);
                }
            }
            this.mediaLogPullV2.k(new Object[]{"prepareAsync", "mUseOpengl:" + this.mUseOpengl, "filterOn:" + this.filterOn + ",checksei:" + this.mNewcheckSei + ",newsizeChange" + this.mNewSizeChange});
            fakeSurface fakesurface2 = this.mFakeSurface;
            if (fakesurface2 != null) {
                Object obj = this.mSurface;
                if (obj != null) {
                    fakesurface2.activiteSurface(obj);
                }
                _setVideoSurface(this.mFakeSurface.getSurface(), this.mFakeSurface.getSurface());
            }
            if (TextUtils.isEmpty(this.mFFConcatContent)) {
                _prepareAsync();
            } else {
                _prepareAsync();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ymx ymxVar = this.mediaLogsValOfPull;
        ymxVar.c = this.mDataSource;
        ymxVar.h0 = System.currentTimeMillis();
        pullInitV2();
        this.mediaLogPullV2.j("setRenderType", this.mUseOpengl == 1 ? "OpengL" : "nativeWindow ");
        this.mediaLogPullV2.k(new Object[]{"mediaconfig", "mDecorderRecordPts:" + this.mDecorderRecordPts + ", NewEnableLatency:" + this.mNewEnableLatency});
        this.mediaLogPullV2.k(new Object[]{"filterParm", "filterOn:" + this.filterOn + ",Saturation:" + this.mSaturation + ", mDeblurWeight" + this.mDeblurWeight + ", mDeblurRadius:" + this.mDeblurRadius + ",mDeblurThreshold:" + this.mDeblurThreshold + ",mContrast:" + this.mContrast});
    }

    public void putMediaLogs(Map<String, String> map) {
        if (map.containsKey("showId")) {
            setShowId(map.get("showId"));
            return;
        }
        if (map.containsKey("src")) {
            setSrc(map.get("src"));
        } else if (map.containsKey("pullSrc")) {
            setPullSrc(map.get("pullSrc"));
        } else if (map.containsKey("cdnType")) {
            setCdnType(map.get("cdnType"));
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public synchronized void release() {
        try {
            hjx.d(TAG, "[" + hashCode() + "] release.");
            if (this.mFakeSurface != null) {
                mediaLogs2("HWRender", "Stop");
            }
            this.mediaLogPullV2.k(new Object[]{"ijkmediaplayer release"});
            pullStopV2();
            st0.g().q(st0.g);
            release_l();
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.mContextRef = null;
            String str = this.mDataSource;
            if (str != null && str.length() > 0) {
                mediaLogs2(BuildConfig.BUILD_TYPE, hashCode() + " release");
                gmx gmxVar = this.mediaLogPullV2;
                if (gmxVar != null) {
                    gmxVar.c();
                    this.mediaLogPullV2.s();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        hjx.d(TAG, "[" + hashCode() + "]");
        stayAwake(false);
        try {
            _reset();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    public void resetInternal() {
        hjx.d(TAG, "[" + hashCode() + "] resetInternal");
        stayAwake(false);
        try {
            _resetInternal();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mHasPrepared = false;
        this.mCurrentUrlInfo = null;
    }

    @Override // tv.danmaku.ijk.media.player.SimpleMediaPlayer
    public void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) {
        hjx.d(TAG, "[" + hashCode() + "] seekTo " + j);
        try {
            _seekTo(j);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void selectAudioTrack(int i) {
        try {
            _setPropertyLong_(FFP_PROP_INT64_AUDIO_TRACK_INDEX, i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void sendJsonData(byte[] bArr, int i, IjkMediaPlayer ijkMediaPlayer) {
        try {
            if (this.mJsonDateCallback != null) {
                this.mJsonDateCallback.JsonDateCallback(bArr, i, ijkMediaPlayer);
            }
        } catch (Exception unused) {
            hjx.a(TAG, "mJsonDateCallback error.");
        }
    }

    public void setAcceDriveCacheDuration(long j) {
        _setPropertyLong_(FFP_PROP_INT64_ACCE_CACHE_DURATION, j);
    }

    public void setAccePlayRate(float f) {
        _setPropertyFloat_(FFP_PROP_FLOAT_ACCE_RATE, f);
    }

    public void setAudio3D(boolean z) {
        this.enable3D = z;
        this.headSetOn = HeadSetReceiver.getInstance().getHeadSetState();
        mediaLogs("playerAudioEffect", "[audioEffect:" + (!z ? 0 : 1) + "]");
        boolean z2 = this.headSetOn;
        boolean z3 = this.enable3D;
        if (z2) {
            set3D(z3);
        } else {
            setBoost3D(z3);
        }
    }

    public void setAudioHiFi(boolean z) {
        this.enableHiFi = z;
        this.headSetOn = HeadSetReceiver.getInstance().getHeadSetState();
        mediaLogs("playerAudioEffect", "[audioEffect:" + (z ? 2 : 0) + "]");
        if (this.headSetOn) {
            setHifi(z);
        } else {
            setBoostHiFi(z);
        }
    }

    public void setAudioOnly(boolean z) {
        _setPropertyLong_(FFP_PROP_INT64_AUDIO_ONLY, z ? 1L : 0L);
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    public void setAudioTrackIndex(int i) {
        try {
            _setAudioTrackIndex(i);
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public void setAutoPlayOnPrepared(boolean z) {
        setOption(4, "start-on-prepared", z ? 1L : 0L);
    }

    @Deprecated
    public void setAvCodecOption(String str, String str2) {
        setOption(2, str, str2);
    }

    @Deprecated
    public void setAvFormatOption(String str, String str2) {
        setOption(1, str, str2);
    }

    @Deprecated
    public void setAvOption(AvFormatOption avFormatOption) {
        setAvFormatOption(avFormatOption.getName(), avFormatOption.getValue());
    }

    public void setBufferParams(int i, int i2, int i3, int i4, int i5) {
        try {
            _setBufferParams(i, i2, i3, i4, i5);
        } catch (Exception unused) {
        }
    }

    public void setBusinessType(int i) {
        mediaLogs2(hashCode() + "setBusinessType " + i);
        this.mediaLogsValOfPull.O = (long) i;
        eix eixVar = this.mediaCfgParams;
        if (eixVar != null) {
            eixVar.p(i);
        }
    }

    public void setCutPosition(float f, float f2, float f3, float f4) {
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.updateRect(f, f2, f3, f4);
        } else {
            _setCutPosition(f, f2, f3, f4);
        }
    }

    public void setDataSource(String str, String str2) throws IOException {
        hjx.a(TAG, "setDataSource: ipv6Url=" + str + ", ipv4Url=" + str2);
        this.mHasPrepared = false;
        mvj0 mvj0VarG = hb20.f().g(str, str2);
        if (mvj0VarG == null || TextUtils.isEmpty(mvj0VarG.d())) {
            gmx gmxVar = this.mediaLogPullV2;
            if (gmxVar != null) {
                gmxVar.j("setDataSource", "No valid URL available for playback");
                return;
            }
            return;
        }
        this.mCurrentUrlInfo = mvj0VarG;
        this.detectStatus = mvj0VarG.a();
        hjx.a(TAG, "setDataSource: using url=" + mvj0VarG.d() + ", type=" + mvj0VarG.b());
        setDataSource(mvj0VarG.d());
        hb20.f().t(mvj0VarG);
    }

    public void setDataSourceAsFFConcatContent(String str) {
        this.mFFConcatContent = str;
    }

    public void setDeblurEnabled(boolean z) {
        this.mDeblueEnabled = z;
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.setDeblurEnabled(z);
        }
    }

    public void setDeblurWeight(float f) {
        this.mDeblurWeight = f;
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.setDeblurWeight(f);
        }
    }

    public void setDeceDriveCacheDuration(long j) {
        _setPropertyLong_(FFP_PROP_INT64_DECE_CACHE_DURATION, j);
    }

    public void setDecePlayRate(float f) {
        _setPropertyFloat_(FFP_PROP_FLOAT_DECE_RATE, f);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.costOfsetSurfaceMs;
        hjx.d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " mediacodec: " + this.mUseAndroidMediaCodec + "/" + this.mFakeSurface + "/" + surfaceHolder);
        StringBuilder sb = new StringBuilder("[");
        sb.append(hashCode());
        sb.append("] getSurface: ");
        sb.append(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        sb.append("/ ");
        fakeSurface fakesurface = this.mFakeSurface;
        sb.append(fakesurface != null ? fakesurface.getLastErr() : -1);
        hjx.d(TAG, sb.toString());
        if (this.metaTimeMs == 0) {
            this.metaTimeMs = jCurrentTimeMillis;
        }
        try {
            synchronized (this.mSynSurface) {
                try {
                    this.mSurfaceHolder = surfaceHolder;
                    if (surfaceHolder != null) {
                        surface = surfaceHolder.getSurface();
                        this.mSurface = surface;
                    } else {
                        this.mSurface = null;
                        surface = null;
                    }
                    fakeSurface fakesurface2 = this.mFakeSurface;
                    if (fakesurface2 != null) {
                        int i2 = this.mVideoWidth;
                        if (i2 != 0 && (i = this.mVideoHeight) != 0) {
                            fakesurface2.updateRec(i2, i, i2, i);
                        }
                        if (surface != null) {
                            this.mFakeSurface.activiteSurface(null);
                        }
                        this.mFakeSurface.activiteSurface(surface);
                        mediaLogs2("setDisplay", "HW SurfaceHolder:" + surface);
                    } else {
                        _setVideoSurface(surface, null);
                        mediaLogs2("setDisplay", "SurfaceHolder:" + surface);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        updateSurfaceScreenOn();
    }

    public void setDynamicBuffer(boolean z) {
        try {
            _setDynamicBuffer(z);
        } catch (Error | Exception unused) {
        }
    }

    public void setFastDnsEnable(boolean z) {
        _setPropertyLong_(FFP_PROP_INT64_FASTDNS_ENABLE, z ? 1L : 0L);
    }

    public void setFastDnsExpireTime(int i) {
        this.fast_dns_expire_time = i;
        _setPropertyLong_(FFP_PROP_INT64_FASTDNS_EXPIRETIME, i);
    }

    @Deprecated
    public void setFrameDrop(int i) {
        setOption(4, "framedrop", i);
    }

    public final void setJsonDataCallback(JsonDateCallback jsonDateCallback) {
        this.mJsonDateCallback = jsonDateCallback;
    }

    public final void setLogRoomInfos(String str, String str2, int i) {
        eix eixVar = this.mediaCfgParams;
        if (eixVar != null) {
            eixVar.s(str);
            if (i != 0) {
                this.mediaCfgParams.r(i);
            }
        }
        this.mediaLogPullV2.y(str, str2, i);
    }

    public final void setLogUploadCb(int i, int i2, xgf0 xgf0Var) {
        hjx.d(TAG, "setLogUploadCb " + i + " | " + i2 + " | " + xgf0Var);
        if (i <= 0 || i2 <= 0 || xgf0Var == null) {
            return;
        }
        this.mediaLogPullV2.E(i, i2, xgf0Var);
    }

    public void setManuaRefresh(boolean z) {
        this.mManuaRefresh = z;
    }

    public void setMaxBufferlingSize(long j) {
        _setPropertyLong_(FFP_PROP_INT64_MAX_BUFFERLING_BYTES, j);
    }

    public void setMaxTimeOfBuffer(int i) {
        _setPropertyLong_(FFP_PROP_INT64_BUFFERING_MAX_TIME_MS, i);
    }

    public void setMediaCodecEnabled(boolean z) {
        hjx.d(TAG, "[" + hashCode() + "] " + z);
        this.mUseAndroidMediaCodec = z;
    }

    public final void setMediaDataCallback(MediaDateCallback mediaDateCallback) {
        this.mMediaDateCallback = mediaDateCallback;
    }

    public void setMediaDateCallbackFlags(int i) {
        try {
            _setMediaDateCallbackFlags(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int setMomoParms(int i, String str) {
        hjx.d("[" + hashCode() + "] configdata", "key " + i + "/" + str);
        if (i != 4104) {
            return 0;
        }
        configDataProcess(str);
        return 0;
    }

    public void setNetAnchorTime(long j) {
        this.mNetDiffTime = j;
    }

    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    @Deprecated
    public void setOpenSLESEnabled(boolean z) {
        setOption(4, "opengles", z ? 1L : 0L);
    }

    public void setOption(int i, String str, String str2) {
        mediaLogs2("category:" + i, "name:" + str, "value:" + str2);
        try {
            _setOption(i, str, str2);
        } catch (Error | Exception unused) {
        }
    }

    @Deprecated
    public void setOverlayFormat(int i) {
        setOption(4, "overlay-format", i);
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayback(boolean z) {
    }

    public void setPlayerFilterSizeChange(int i, int i2) {
        PlayerAdjustFilter playerAdjustFilter = this.adjustFilter;
        if (playerAdjustFilter != null) {
            playerAdjustFilter.onSizeChanged(i, i2);
        }
    }

    public void setPrepared() {
        this.mHasPrepared = true;
    }

    public void setPropertyLong(int i, long j) {
        _setPropertyLong_(i, j);
    }

    public void setPullSrc(String str) {
        this.mediaLogsValOfPull.e0 = str;
    }

    public void setQuicProxy(boolean z, String str) {
        try {
            this.mIsQuicProxy = z;
            this.mQuicServerIp = str;
            _setQuicProxy(z);
        } catch (Error | Exception unused) {
        }
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setRate(float f) {
    }

    public void setSaturation(float f) {
        this.mSaturation = f;
        fakeSurface fakesurface = this.mFakeSurface;
        if (fakesurface != null) {
            fakesurface.setSaturation(f);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    public void setShowId(String str) {
        mediaLogs2(hashCode() + "setShowid " + str);
        this.showId = str;
        su10 su10Var = this.httpMediaLogsUpload;
        if (su10Var != null) {
            su10Var.g(str);
        }
    }

    public final void setSimpleInfoFromUpStreamCb(tgf0 tgf0Var) {
        if (tgf0Var != null) {
            this.simpleInfoFromUpStream = tgf0Var;
        }
    }

    public void setSpeedControl(int i, int i2, float f, int i3, float f2) {
    }

    public void setSrc(String str) {
        mediaLogs2(hashCode() + "setSrc " + str);
        this.sourceStr = str;
        su10 su10Var = this.httpMediaLogsUpload;
        if (su10Var != null) {
            su10Var.h(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.costOfsetSurfaceMs;
        hjx.d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " mediacode:" + this.mUseAndroidMediaCodec + " / " + this.mFakeSurface + " / " + surface);
        if (this.metaTimeMs == 0) {
            this.metaTimeMs = jCurrentTimeMillis;
        }
        try {
            synchronized (this.mSynSurface) {
                try {
                    this.mSurfaceHolder = null;
                    this.mSurface = surface;
                    fakeSurface fakesurface = this.mFakeSurface;
                    if (fakesurface != null) {
                        int i2 = this.mVideoWidth;
                        if (i2 != 0 && (i = this.mVideoHeight) != 0) {
                            fakesurface.updateRec(i2, i, i2, i);
                        }
                        if (this.mSurface != null) {
                            this.mFakeSurface.activiteSurface(null);
                        }
                        this.mFakeSurface.activiteSurface(this.mSurface);
                    } else {
                        _setVideoSurface(surface, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        updateSurfaceScreenOn();
    }

    public void setSurfaceH(Surface surface) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.costOfsetSurfaceMs;
        hjx.d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " / " + surface);
        if (this.metaTimeMs == 0) {
            this.metaTimeMs = jCurrentTimeMillis;
        }
        if (this.mScreenOnWhilePlaying && surface != null) {
            hjx.d(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurface = surface;
        _setVideoSurface(surface, surface);
        updateSurfaceScreenOn();
    }

    @Deprecated
    public void setSwScaleOption(String str, String str2) {
        setOption(3, str, str2);
    }

    public void setTimeOutUS(long j) {
        _setPropertyLong_(FFP_PROP_INT64_TIME_OUT_US, j);
    }

    public void setVideoOnly(boolean z) {
        _setPropertyLong_(FFP_PROP_INT64_VIDEO_ONLY, z ? 1L : 0L);
    }

    public void setVodMode() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        try {
            _setVolume(f, f2);
        } catch (Error | Exception unused) {
        }
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    @SuppressLint({"Wakelock"})
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
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | PKIFailureInfo.duplicateCertReq, IjkMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        hjx.d(TAG, "[" + hashCode() + "]");
        stayAwake(true);
        try {
            _start();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void startLogTime() {
        GetSpeedByteTimer getSpeedByteTimer = this.logtimer;
        if (getSpeedByteTimer == null || this.enableLogBufferAndPullSize != 1) {
            return;
        }
        getSpeedByteTimer.sendEmptyMessageDelayed(1, this.mBufferLogHz);
        this.logtimer.sendEmptyMessageDelayed(2, this.mBufferLogHz);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        hjx.d(TAG, "[" + hashCode() + "]");
        if (this.mFakeSurface != null) {
            mediaLogs2("HWRender", hashCode() + "stop HWRende");
        }
        this.mediaLogPullV2.k(new Object[]{"ijkmediaplayer stop"});
        pullStopV2();
        stayAwake(false);
        try {
            _stop();
            this.mIsQuicProxy = false;
            this.mQuicServerIp = null;
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String str = this.mDataSource;
        if (str == null || str.length() <= 0) {
            return;
        }
        mediaLogs2("stop()", hashCode() + " stop");
    }

    @Override // tv.danmaku.ijk.media.player.SimpleMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void updateScreenSize(int i, int i2) {
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
    }

    public void uploadMediaLogs(String str, String str2) {
        this.mediaLogPullV2.G(str, str2);
    }

    public void setOption(int i, String str, long j) {
        mediaLogs2("category:" + i, "name:" + str, "value:" + j);
        try {
            _setOption(i, str, j);
        } catch (Error | Exception unused) {
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.mDataSource = str;
        if (TextUtils.isEmpty(str)) {
            eyx.c().a("setDataSource", "dataSource", LogLevel.FATAL);
        }
        this.mCdnip = getCdnIp(this.mDataSource);
        try {
            String str2 = splitQuery(new URL(this.mDataSource)).get("mtag");
            if (str2 != null) {
                this.mTag = str2;
            }
        } catch (Exception unused) {
        }
        this.costOfsetSurfaceMs = System.currentTimeMillis();
        hjx.d(TAG, "[" + hashCode() + "] [" + this.mCdnip + "] " + str);
        try {
            _setDataSource(this.mDataSource, null, null);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IjkMediaPlayer(Context context) {
        this(context, null);
    }

    public IjkMediaPlayer(Context context, eix eixVar) {
        this(context, sLocalLibLoader, eixVar);
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContextRef = weakReference;
        if (weakReference.get() != null) {
            st0.g().p(this.mContextRef.get(), st0.g);
        }
        try {
            if (fjx.R().V0()) {
                lll.e().o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IjkMediaPlayer() {
        this(null, sLocalLibLoader, null);
    }
}
