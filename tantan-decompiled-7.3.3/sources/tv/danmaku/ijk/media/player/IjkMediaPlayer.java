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
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.baseutil.HeadSetReceiver;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.ugc.TXRecordCommon;
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
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.a320;
import p153l.aol;
import p153l.arx;
import p153l.b7y;
import p153l.bpf0;
import p153l.brx;
import p153l.bsx;
import p153l.csx;
import p153l.dvx;
import p153l.esx;
import p153l.fpf0;
import p153l.fvx;
import p153l.p4k0;
import p153l.p7f;
import p153l.pgy;
import p153l.qj20;
import p153l.snk0;
import p153l.vvx;
import p153l.yt0;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.option.AvFormatOption;

/* JADX INFO: loaded from: classes3.dex */
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
    private a320 httpMediaLogsUpload;
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
    private p4k0 mCurrentUrlInfo;
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
    private brx mediaCfgParams;
    private dvx mediaLogPullV2;
    private vvx mediaLogsValOfPull;
    private long metaTimeMs;
    private boolean pullStartAlreadySend;
    private String showId;
    private bpf0 simpleInfoFromUpStream;
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
            esx.m122399d(IjkMediaPlayer.TAG, String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i), Integer.valueOf(i2)));
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
                esx.m122399d(IjkMediaPlayer.TAG, String.format(Locale.US, "unaccetable codec: %s", ijkMediaCodecInfo2.mCodecInfo.getName()));
                return null;
            }
            esx.m122399d(IjkMediaPlayer.TAG, String.format(Locale.US, "selected codec: %s rank=%d", ijkMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(ijkMediaCodecInfo2.mRank)));
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
                esx.m122399d(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events: notifyOnVideoSizeChanged  [" + this + Constants.AES_SUFFIX);
                return;
            }
            if (ijkMediaPlayer.mVideoHeight != i2 || ijkMediaPlayer.mVideoWidth != i) {
                ijkMediaPlayer.mediaLogs2("notifyOnVideoSizeChanged", ijkMediaPlayer.hashCode() + " sizeChange, " + (ijkMediaPlayer.mHwCodec ? 1 : 0) + ", " + i + BaseSei.f14624X + i2);
            }
            ijkMediaPlayer.mVideoWidth = i;
            ijkMediaPlayer.mVideoHeight = i2;
            esx.m122396a(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] FFP_MSG_VIDEO_SIZE_CHANGED   w/h " + ijkMediaPlayer.mVideoWidth + " x " + ijkMediaPlayer.mVideoHeight);
            ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
            if (ijkMediaPlayer.mFakeSurface != null) {
                ijkMediaPlayer.mFakeSurface.updateRec(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight);
            }
            esx.m122396a("jzheng", "FFP_MSG_VIDEO_SIZE_CHANGED a " + ((((short) ijkMediaPlayer.mVideoWidth) << 16) | ((short) ijkMediaPlayer.mVideoHeight)) + " w/h " + ijkMediaPlayer.mVideoWidth + " x " + ijkMediaPlayer.mVideoHeight);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkMediaPlayer ijkMediaPlayer = this.mWeakPlayer.get();
            if (ijkMediaPlayer != null) {
                if (ijkMediaPlayer.mNativeMediaPlayer != 0) {
                    int i = message.what;
                    if (i != 99) {
                        if (i == 100) {
                            esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_ERROR (" + message.arg1 + Constants.SEPARATOR_COMMA + message.arg2 + ")");
                            StringBuilder sb = new StringBuilder();
                            sb.append(ijkMediaPlayer.hashCode());
                            sb.append(" MEDIA_ERROR, ");
                            sb.append(message.arg2);
                            ijkMediaPlayer.mediaLogs2("handleMessage", sb.toString());
                            ijkMediaPlayer.mediaLogsValOfPull.f186039o = (long) message.arg2;
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
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_VIDEO_RENDERING_START");
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " Video Render Start");
                                ijkMediaPlayer.pullStartV2();
                            } else if (i2 == 701) {
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_BUFFERING_START ");
                                ijkMediaPlayer.mDelayTime = 0L;
                                ijkMediaPlayer.bufferStartV2();
                            } else if (i2 == 702) {
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_INFO_BUFFERING_START ");
                                ijkMediaPlayer.bufferStopV2();
                            } else {
                                if (i2 == 909) {
                                    ijkMediaPlayer.mediaLogs2("audioOpen", "audioTrackOpenError");
                                    return;
                                }
                                if (i2 == 910) {
                                    ijkMediaPlayer.mediaLogs2("audioPtsError", "[pts error scale is " + message.arg2 + Constants.AES_SUFFIX);
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
                            ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " media codec size change: " + message.arg1 + BaseSei.f14624X + message.arg2);
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
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_PREPARED");
                                ijkMediaPlayer.notifyOnPrepared();
                                ijkMediaPlayer.mediaLogsValOfPull.f186023d = ijkMediaPlayer.getServerIpAddr();
                                ijkMediaPlayer.pullDetectV2();
                                ijkMediaPlayer.startLogTime();
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " prepared");
                                break;
                            case 2:
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_PLAYBACK_COMPLETE");
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
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SEEK_COMPLETE");
                                ijkMediaPlayer.notifyOnSeekComplete();
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " seek complete");
                                break;
                            case 5:
                                ijkMediaPlayer.mediaLogsValOfPull.f186003M = message.arg1;
                                ijkMediaPlayer.mediaLogsValOfPull.f186004N = message.arg2;
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SET_VIDEO_SIZE " + message.arg1 + " x " + message.arg2);
                                notifyOnVideoSizeChanged(message.arg1, message.arg2);
                                break;
                            case 6:
                                int i3 = message.arg1;
                                ijkMediaPlayer.mediaLogs2("handleMessage", ijkMediaPlayer.hashCode() + " MEDIA_SET_VIDEO_MEDIACODE, " + message.arg1);
                                esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] MEDIA_SET_VIDEO_MEDIACODE MediaCodec Error " + message.arg1);
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
                                        ijkMediaPlayer.mediaLogsValOfPull.f186022c0 = (message.arg1 >> 16) & p7f.COLOR_SPACE_UNCALIBRATED;
                                        ijkMediaPlayer.mediaLogsValOfPull.f186046v = message.arg1 & p7f.COLOR_SPACE_UNCALIBRATED;
                                        ijkMediaPlayer.mediaLogsValOfPull.f186020b0 = (message.arg2 >> 16) & p7f.COLOR_SPACE_UNCALIBRATED;
                                        ijkMediaPlayer.mediaLogsValOfPull.f186045u = message.arg2 & p7f.COLOR_SPACE_UNCALIBRATED;
                                        ijkMediaPlayer.pullBufferDropV2();
                                        break;
                                    default:
                                        esx.m122399d(IjkMediaPlayer.TAG, "[" + ijkMediaPlayer.hashCode() + "] Unknown message type:" + message.what);
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    return;
                }
            }
            esx.m122399d(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events: handleMessage  [" + this + Constants.AES_SUFFIX);
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
                esx.m122397b(IjkMediaPlayer.TAG, "Unknown message type " + message.what);
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

    public IjkMediaPlayer(Context context, IjkLibLoader ijkLibLoader, brx brxVar) {
        this.mNetDiffTime = 0L;
        this.mIFrameTime = 0L;
        this.mDelayTime = 0L;
        this.mSynSurface = new Object();
        this.mInterval = -1;
        this.mCount = -1;
        this.simpleInfoFromUpStream = null;
        this.mediaLogPullV2 = new dvx();
        this.mediaLogsValOfPull = new vvx();
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
        this.mPullSizeLogHz = 500;
        this.mLastBufferSize = 0L;
        this.mBufferLogCount = 10;
        this.mBufferLogHz = 500;
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
        this.fast_dns_expire_time = 300;
        this.mLatencyEnable = 0;
        this.mLatencyBaseMark = TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
        this.mLatencySpeedupMark = 7999;
        this.mLatencyDropMark = TXRecordCommon.AUDIO_SAMPLERATE_8000;
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
        arx.m99789d().m99799k(context, brxVar);
        this.mediaCfgParams = brxVar;
        if (brxVar != null) {
            this.mediaLogsValOfPull.f186014X = brxVar.m106175g();
        }
        this.mediaLogsValOfPull.f186018a0 = String.valueOf(hashCode());
        initPlayer(ijkLibLoader);
    }

    private void MediaCfgInit() {
        brx brxVar = this.mediaCfgParams;
        if (brxVar == null || TextUtils.isEmpty(brxVar.m106170b())) {
            b7y.m102882c().m102888g("ijkmediaplayer mediaCfg == null, user default appid");
            arx.C15814d c15814dM99797h = arx.m99789d().m99797h("mlive");
            if (this.httpMediaLogsUpload == null) {
                this.httpMediaLogsUpload = new a320("mdefault", "1a738fb015fe0a8476c4e05a314156d2", c15814dM99797h != null ? c15814dM99797h.f73010c : "", "", "", "", arx.m99789d().m99796g("mdefault"), "", this.mediaLogsValOfPull.f186018a0, this.showId);
            }
            dvx dvxVar = this.mediaLogPullV2;
            if (dvxVar != null) {
                dvxVar.m118343w(this.httpMediaLogsUpload);
                return;
            }
            return;
        }
        arx.C15814d c15814dM99797h2 = arx.m99789d().m99797h(this.mediaCfgParams.m106170b());
        if (c15814dM99797h2 != null) {
            bsx bsxVar = c15814dM99797h2.f73012e;
            if (bsxVar != null) {
                this.mediaLogPullV2.m118344x(bsxVar.f78287n);
                this.mediaLogPullV2.m118319A(c15814dM99797h2.f73012e.f78284m);
                this.mediaLogPullV2.m118342v(c15814dM99797h2.f73012e.f78275j);
                bsx bsxVar2 = c15814dM99797h2.f73012e;
                this.mUseOpengl = bsxVar2.f78229Q0;
                int i = bsxVar2.f78233S0;
                this.mNewcheckSei = i;
                this.mNewSizeChange = bsxVar2.f78235T0;
                _setPropertyLong(FFP_PROP_INT64_NEW_CHECK_SEI, i);
                _setPropertyLong(FFP_PROP_INT64_NEW_SIZE_CHANGE, this.mNewSizeChange);
            }
            if (this.mediaCfgParams.m106171c() != 0) {
                this.mediaLogsValOfPull.f186005O = this.mediaCfgParams.m106171c();
            }
            if (this.httpMediaLogsUpload == null) {
                this.httpMediaLogsUpload = new a320(this.mediaCfgParams.m106170b(), c15814dM99797h2.f73009b, c15814dM99797h2.f73010c, this.mediaCfgParams.m106176h(), String.valueOf(this.mediaCfgParams.m106174f()), String.valueOf(this.mediaCfgParams.m106171c()), arx.m99789d().m99796g(this.mediaCfgParams.m106170b()), this.mediaCfgParams.m106178j(), this.mediaLogsValOfPull.f186018a0, this.showId);
            }
            this.httpMediaLogsUpload.m95757e(this.mTag);
            dvx dvxVar2 = this.mediaLogPullV2;
            if (dvxVar2 != null) {
                dvxVar2.m118343w(this.httpMediaLogsUpload);
            }
            if (TextUtils.isEmpty(this.mediaCfgParams.m106176h()) || this.mediaCfgParams.m106171c() == 0) {
                b7y.m102882c().m102888g("mediaCfgParams" + this.mediaCfgParams.toString());
                b7y.m102882c().m102888g("threadInfo:" + snk0.m186957e());
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
        if (this.mediaLogPullV2.m118329g()) {
            this.mediaLogsValOfPull.f186045u = getVideoCachedDuration();
            this.mediaLogsValOfPull.f186046v = getAudioCachedDuration();
            bpf0 bpf0Var = this.simpleInfoFromUpStream;
            if (bpf0Var != null) {
                int iM105839b = bpf0Var.m105839b();
                this.mediaLogsValOfPull.f186041q = iM105839b != -1 ? iM105839b : 2L;
            }
            try {
                if (this.mBufferPerSec != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<Long> it = this.mBufferPerSec.iterator();
                    while (it.hasNext()) {
                        sb.append(String.valueOf(it.next()));
                        sb.append(":");
                    }
                    this.mediaLogsValOfPull.f186016Z = sb.substring(0, sb.length() - 1);
                } else {
                    this.mediaLogsValOfPull.f186016Z = "";
                }
            } catch (Exception unused) {
            }
            this.mediaLogsValOfPull.f186028f0 = getVideoCodecType();
            this.mediaLogPullV2.m118325a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bufferStopV2() {
        if (this.mediaLogPullV2.m118329g()) {
            this.mediaLogsValOfPull.f186045u = getVideoCachedDuration();
            this.mediaLogsValOfPull.f186046v = getAudioCachedDuration();
            bpf0 bpf0Var = this.simpleInfoFromUpStream;
            if (bpf0Var != null) {
                int iM105839b = bpf0Var.m105839b();
                this.mediaLogsValOfPull.f186041q = iM105839b != -1 ? iM105839b : 2L;
            }
            this.mediaLogsValOfPull.f186028f0 = getVideoCodecType();
            this.mediaLogPullV2.m118326b();
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
                        int iIndexOf3 = strSubstring.indexOf(Constants.AES_SUFFIX);
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
                                int iIndexOf5 = strSubstring.indexOf(Constants.AES_SUFFIX);
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
        return _getPropertyLong_(20034, 0L);
    }

    private long getNetAnchorTime() {
        return csx.m112235R().m112296U0() ? csx.m112235R().m112304X() : System.currentTimeMillis() - this.mNetDiffTime;
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
            sb.append(i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + Constants.SEPARATOR_COMMA + i5);
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
        esx.m122399d(TAG, "[" + hashCode() + Constants.AES_SUFFIX);
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
        vvx vvxVar = this.mediaLogsValOfPull;
        this.mHwCodec = false;
        vvxVar.f186038n = false;
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
        if (this.mediaLogPullV2.m118329g() && this.mediaLogPullV2.m118328f() == 1) {
            this.mediaLogPullV2.m118332j(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mediaLogs2(Object... objArr) {
        if (this.mediaLogPullV2.m118329g() && this.mediaLogPullV2.m118328f() == 1) {
            this.mediaLogPullV2.m118333k(objArr);
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
        esx.m122398c(TAG, "onControlResolveSegmentCount", new Object[0]);
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return -1;
        }
        return onControlMessageListener.onControlResolveSegmentCount();
    }

    @CalledByNative
    private static int onControlResolveSegmentDuration(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        esx.m122398c(TAG, "onControlResolveSegmentDuration %d", Integer.valueOf(i));
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return -1;
        }
        return onControlMessageListener.onControlResolveSegmentDuration(i);
    }

    @CalledByNative
    private static String onControlResolveSegmentOfflineMrl(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        esx.m122398c(TAG, "onControlResolveSegmentOfflineMrl %d", Integer.valueOf(i));
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return null;
        }
        return onControlMessageListener.onControlResolveSegmentOfflineMrl(i);
    }

    @CalledByNative
    private static String onControlResolveSegmentUrl(Object obj, int i) {
        IjkMediaPlayer ijkMediaPlayer;
        OnControlMessageListener onControlMessageListener;
        esx.m122398c(TAG, "onControlResolveSegmentUrl %d", Integer.valueOf(i));
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
            long j = jSONObject.has(com.tencent.connect.common.Constants.f58037TS) ? jSONObject.getLong(com.tencent.connect.common.Constants.f58037TS) : 0L;
            if (j != 0) {
                ijkMediaPlayer.mIFrameTime = j;
            }
            if (ijkMediaPlayer.mIFrameTime != 0) {
                ijkMediaPlayer.mDelayTime = ijkMediaPlayer.getNetAnchorTime() - ijkMediaPlayer.mIFrameTime;
            } else {
                ijkMediaPlayer.mDelayTime = 0L;
            }
            ijkMediaPlayer.mediaLogsValOfPull.f186001K = ijkMediaPlayer.mDelayTime;
            ijkMediaPlayer._setPropertyLong_(20025, ijkMediaPlayer.mDelayTime);
            Log.e("lqdebug", "mediaplayer json:" + jSONObject.toString());
            esx.m122396a(TAG, "[" + ijkMediaPlayer.hashCode() + "] onNotifyJson sei   " + jSONObject.toString() + " delay " + ijkMediaPlayer.mDelayTime);
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
            esx.m122397b(TAG, "onSelectCodec use ffmpeg codec: " + ijkMediaPlayer.mFakeSurface);
            vvx vvxVar = ijkMediaPlayer.mediaLogsValOfPull;
            ijkMediaPlayer.mHwCodec = false;
            vvxVar.f186038n = false;
            return null;
        }
        vvx vvxVar2 = ijkMediaPlayer.mediaLogsValOfPull;
        ijkMediaPlayer.mHwCodec = true;
        vvxVar2.f186038n = true;
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
                ijkMediaPlayer.mEventHandler.sendMessageDelayed(eventHandler.obtainMessage(i, (short) ((i2 >> 16) & p7f.COLOR_SPACE_UNCALIBRATED), (short) (i2 & p7f.COLOR_SPACE_UNCALIBRATED), obj2), i3);
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
        this.mediaLogsValOfPull.f186049y = getVideoOutputFrames();
        vvx vvxVar = this.mediaLogsValOfPull;
        long j = vvxVar.f186049y;
        long j2 = j - vvxVar.f185999I;
        vvxVar.f185999I = j;
        if (this.pullStartAlreadySend && j2 / 5 <= 5) {
            vvxVar.f186000J++;
        }
        esx.m122396a("buffercheckcount", "pullBufferCheck diff " + j2 + "/" + this.mediaLogsValOfPull.f186000J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullBufferDropV2() {
        if (this.mediaLogPullV2.m118329g()) {
            this.mediaLogsValOfPull.f186024d0 = _getPropertyLong(20041, 0L);
            this.mediaLogPullV2.m118334l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullDetectV2() {
        if (this.mediaLogPullV2.m118329g() && !this.mediaLogPullV2.m118330h()) {
            pullDetect[] pullDetectStatus = getPullDetectStatus();
            StringBuilder sb = new StringBuilder();
            if (pullDetectStatus != null) {
                int i = 0;
                for (int length = pullDetectStatus.length; i < length; length = length) {
                    pullDetect pulldetect = pullDetectStatus[i];
                    long j = pulldetect.timestamp;
                    if (j != 0) {
                        sb.append(fvx.m127737w(Long.valueOf(j), Integer.valueOf(pulldetect.unixErrno), Integer.valueOf(pulldetect.dnsTime), Long.valueOf(pulldetect.tcpConnectTime), Long.valueOf(pulldetect.httpTime), Integer.valueOf(pulldetect.httpResponseCode), Long.valueOf(pulldetect.firstPacketTime), Float.valueOf(getFirstIFrameTimes()), pulldetect.url, pulldetect.cdnIp, Integer.valueOf(pulldetect.ffmpegErrno), Long.valueOf(this.mediaLogsValOfPull.f186032h0)));
                    }
                    i++;
                }
            }
            this.mediaLogsValOfPull.f186019b = sb.toString();
            this.mediaLogPullV2.m118335m();
        }
    }

    private void pullInitV2() {
        if (this.mediaLogPullV2.m118329g()) {
            this.mediaLogPullV2.m118346z(this.mediaLogsValOfPull);
            this.mediaLogPullV2.m118320B(new dvx.InterfaceC16640b() { // from class: tv.danmaku.ijk.media.player.IjkMediaPlayer.2
                @Override // p153l.dvx.InterfaceC16640b
                public void messageFromMediaLogV2(int i, int i2, int i3, Object obj) {
                    if (IjkMediaPlayer.this.mEventHandler != null) {
                        IjkMediaPlayer.this.mEventHandler.obtainMessage(i, i2, i3, obj).sendToTarget();
                    }
                }
            });
            this.mediaLogPullV2.m118336n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullStartV2() {
        if (this.mediaLogPullV2.m118329g()) {
            this.mediaLogsValOfPull.f186025e = getMetaSystemTime();
            this.mediaLogsValOfPull.f186027f = (long) getConnetTimes();
            this.mediaLogsValOfPull.f186029g = (long) getFirstVPacketTimes();
            this.mediaLogsValOfPull.f186031h = (long) getFirstAPacketTimes();
            this.mediaLogsValOfPull.f186033i = (long) getFirstIFrameTimes();
            this.mediaLogsValOfPull.f186034j = (long) getFirstAFrameTimes();
            this.mediaLogsValOfPull.f186035k = (long) getFirstVRenderTimes();
            this.mediaLogsValOfPull.f186036l = (long) getFirstARenderTimes();
            this.mediaLogsValOfPull.f186037m = getStreamCount();
            this.mediaLogsValOfPull.f186006P = getFirstVideoHasMomoSEI();
            this.mediaLogsValOfPull.f186009S = getPropertyString(20036);
            this.mediaLogsValOfPull.f186010T = getPropertyString(20037);
            this.mediaLogsValOfPull.f186024d0 = _getPropertyLong(20041, 0L);
            this.mediaLogsValOfPull.f186028f0 = getVideoCodecType();
            this.mediaLogsValOfPull.f186030g0 = this.detectStatus;
            bpf0 bpf0Var = this.simpleInfoFromUpStream;
            if (bpf0Var != null) {
                int iM105839b = bpf0Var.m105839b();
                this.mediaLogsValOfPull.f186041q = iM105839b != -1 ? iM105839b : 2L;
            }
            bpf0 bpf0Var2 = this.simpleInfoFromUpStream;
            if (bpf0Var2 != null) {
                String strM105838a = bpf0Var2.m105838a();
                if (strM105838a != null && !TextUtils.isEmpty(strM105838a)) {
                    this.mediaLogsValOfPull.f186023d = strM105838a;
                }
                this.mediaLogsValOfPull.f186011U = this.simpleInfoFromUpStream.m105840c();
            }
            if ((StringUtil.ALL_INTERFACES.equals(this.mediaLogsValOfPull.f186023d) || "127.0.0.1".equals(this.mediaLogsValOfPull.f186023d)) && !TextUtils.isEmpty(this.mCdnip) && Utils.isValidIpAddress(this.mCdnip)) {
                this.mediaLogsValOfPull.f186023d = this.mCdnip;
            }
            pullDetectV2();
            esx.m122396a("pullJzheng", "isFirstVideoHasMomoSEI = " + this.mediaLogsValOfPull.f186006P);
            esx.m122396a("pullJzheng", "ipAddrOfCDN = " + this.mediaLogsValOfPull.f186009S);
            esx.m122396a("pullJzheng", "ipAddrOfClient = " + this.mediaLogsValOfPull.f186010T);
            this.mediaLogPullV2.m118337o();
            this.pullStartAlreadySend = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullStopV2() {
        if (this.mediaLogPullV2.m118329g()) {
            pullDetectV2();
            updatePullWatch();
            bpf0 bpf0Var = this.simpleInfoFromUpStream;
            if (bpf0Var != null) {
                int iM105839b = bpf0Var.m105839b();
                vvx vvxVar = this.mediaLogsValOfPull;
                vvxVar.f186041q = iM105839b != -1 ? iM105839b : 2L;
                vvxVar.f186011U = this.simpleInfoFromUpStream.m105840c();
                String strM105838a = this.simpleInfoFromUpStream.m105838a();
                if (strM105838a != null && !TextUtils.isEmpty(strM105838a)) {
                    this.mediaLogsValOfPull.f186023d = strM105838a;
                }
            }
            if ((StringUtil.ALL_INTERFACES.equals(this.mediaLogsValOfPull.f186023d) || "127.0.0.1".equals(this.mediaLogsValOfPull.f186023d)) && !TextUtils.isEmpty(this.mCdnip)) {
                boolean zIsValidIpAddress = Utils.isValidIpAddress(this.mCdnip);
                vvx vvxVar2 = this.mediaLogsValOfPull;
                if (zIsValidIpAddress) {
                    vvxVar2.f186023d = this.mCdnip;
                } else {
                    vvxVar2.f186023d = getServerIpAddr();
                }
            }
            vvx vvxVar3 = this.mediaLogsValOfPull;
            vvxVar3.f186012V = this.pullStartAlreadySend ? 1L : 0L;
            vvxVar3.f186042r = getReadByte();
            if (this.pullStartAlreadySend) {
                vvx vvxVar4 = this.mediaLogsValOfPull;
                if (vvxVar4.f186039o == 1) {
                    vvxVar4.f186039o = 0L;
                }
            }
            if (this.mPullSizePerSec != null) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<Long> it = this.mPullSizePerSec.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(String.valueOf(it.next()));
                    stringBuffer.append(":");
                }
                this.mediaLogsValOfPull.f186015Y = stringBuffer.substring(0, stringBuffer.length() - 1);
            } else {
                this.mediaLogsValOfPull.f186015Y = "";
            }
            this.mediaLogsValOfPull.f186028f0 = getVideoCodecType();
            this.mediaLogsValOfPull.f186030g0 = this.detectStatus;
            this.mediaLogPullV2.m118338p();
            this.pullStartAlreadySend = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pullWatchV2() {
        if (this.mediaLogPullV2.m118329g()) {
            updatePullWatch();
            esx.m122396a("pullJzheng", "FFP_PROP_INT64_VIDEODONTHASMOMOSEICNT = " + this.mediaLogsValOfPull.f186007Q);
            this.mediaLogPullV2.m118339q();
        }
    }

    private void release_l() {
        esx.m122399d(TAG, "[" + hashCode() + "] " + this.mFakeSurface + " release_l. ");
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
        setPropertyLong(20050, z ? 1L : 0L);
    }

    private void setBoost3D(boolean z) {
        setPropertyLong(20052, z ? 1L : 0L);
    }

    private void setBoostHiFi(boolean z) {
        setPropertyLong(20053, z ? 1L : 0L);
    }

    private void setCdnType(String str) {
        mediaLogs2("setCdnType" + str);
        b7y.m102882c().m102888g("setCdnType", "setCdnType:" + str);
        try {
            int i = Integer.parseInt(str);
            if (i != 0) {
                brx brxVar = this.mediaCfgParams;
                if (brxVar != null) {
                    brxVar.m106186r(i);
                }
                dvx dvxVar = this.mediaLogPullV2;
                if (dvxVar != null) {
                    dvxVar.m118322D(i);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    private void setHifi(boolean z) {
        setPropertyLong(20051, z ? 1L : 0L);
    }

    private void setMediaCodecEnabled_l(boolean z) {
        esx.m122399d(TAG, "[" + hashCode() + "] " + z + " -->  done: " + this.mMediaCodecSetDone + " surface: " + this.mFakeSurface);
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
                esx.m122397b(TAG, "mFakeSurface creat error use softdec");
            }
        }
    }

    public static Map<String, String> splitQuery(URL url) throws Exception {
        HashMap map = new HashMap();
        String query = url.getQuery();
        if (query != null) {
            for (String str : query.split("&")) {
                int iIndexOf = str.indexOf("=");
                map.put(URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8"), URLDecoder.decode(str.substring(iIndexOf + 1), "UTF-8"));
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
        this.mediaLogsValOfPull.f186042r = getReadByte();
        this.mediaLogsValOfPull.f186043s = getVideoReadSize();
        this.mediaLogsValOfPull.f186044t = getAudioReadSize();
        this.mediaLogsValOfPull.f186045u = getVideoCachedDuration();
        this.mediaLogsValOfPull.f186046v = getAudioCachedDuration();
        this.mediaLogsValOfPull.f186047w = getVideoDecodeFrames();
        this.mediaLogsValOfPull.f186048x = getAudioDecoderSize();
        this.mediaLogsValOfPull.f186049y = getVideoOutputFrames();
        this.mediaLogsValOfPull.f186050z = getAudioRenderSize();
        this.mediaLogsValOfPull.f186002L = (long) getAudioSampleRate();
        this.mediaLogsValOfPull.f186007Q = getPropertyLong(20035, 0L);
        this.mediaLogsValOfPull.f186028f0 = getVideoCodecType();
        bpf0 bpf0Var = this.simpleInfoFromUpStream;
        if (bpf0Var != null) {
            int iM105839b = bpf0Var.m105839b();
            this.mediaLogsValOfPull.f186041q = iM105839b != -1 ? iM105839b : 2L;
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

    public void applyMediaConfig(bsx bsxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bsxVar == null) {
            b7y.m102882c().m102888g("applyMediaConfig", "mediaConfig === " + bsxVar);
            return;
        }
        this.mediaLogPullV2.m118344x(bsxVar.f78287n);
        this.mediaLogPullV2.m118319A(bsxVar.f78284m);
        this.mediaLogPullV2.m118342v(bsxVar.f78275j);
        this.mUseOpengl = bsxVar.f78229Q0;
        this.enableLogBufferAndPullSize = bsxVar.f78215J0;
        this.mBufferLogHz = bsxVar.f78217K0;
        this.mPullSizeLogCount = bsxVar.f78219L0;
        this.mBufferLogCount = bsxVar.f78221M0;
        this.mVideoRenderTHold = bsxVar.f78223N0;
        this.mNewEnableLatency = bsxVar.f78225O0;
        this.mAudioPtsValue = bsxVar.f78227P0;
        this.mMinVideoJumpDuration = bsxVar.f78231R0;
        this.mDecorderRecordPts = bsxVar.f78237U0;
        this.mNewcheckSei = bsxVar.f78233S0;
        this.mNewSizeChange = bsxVar.f78235T0;
        csx.m112235R().m112383s1(bsxVar.f78209G0 == 1);
        int i5 = bsxVar.f78211H0;
        if (i5 > 0) {
            this.mediaLogPullV2.m118321C(i5);
        }
        int i6 = bsxVar.f78213I0;
        if (i6 > 0) {
            this.mediaLogPullV2.m118341u(i6);
        }
        setPropertyLong(20039, bsxVar.f78223N0);
        setPropertyLong(20040, bsxVar.f78225O0);
        _setPropertyFloat_(10016, bsxVar.f78227P0);
        _setPropertyFloat_(10017, bsxVar.f78231R0);
        _setPropertyLong(20054, bsxVar.f78237U0);
        _setPropertyLong(FFP_PROP_INT64_NEW_CHECK_SEI, bsxVar.f78233S0);
        _setPropertyLong(FFP_PROP_INT64_ENABLE_LATENCY_SECONDS, bsxVar.f78239V0);
        _setPropertyLong(FFP_PROP_INT64_NEW_SIZE_CHANGE, bsxVar.f78235T0);
        int i7 = bsxVar.f78241W0;
        this.mLatencyEnable = i7;
        int i8 = bsxVar.f78243X0;
        this.mLatencyBaseMark = i8;
        int i9 = bsxVar.f78245Y0;
        this.mLatencySpeedupMark = i9;
        int i10 = bsxVar.f78247Z0;
        this.mLatencyDropMark = i10;
        float f = bsxVar.f78250a1;
        this.mLatencySpeedRate = f;
        this.mBufferFirst = bsxVar.f78253b1;
        this.mBufferCurrent = bsxVar.f78256c1;
        this.mBufferNext = bsxVar.f78259d1;
        this.mBufferLast = bsxVar.f78262e1;
        this.mBufferInterval = bsxVar.f78265f1;
        mlSetLowerLatency(i7, i8, i9, i10, f);
        int i11 = this.mBufferFirst;
        if (i11 > 0 && (i = this.mBufferCurrent) > 0 && (i2 = this.mBufferNext) > 0 && (i3 = this.mBufferLast) > 0 && (i4 = this.mBufferInterval) > 0) {
            setBufferParams(i11, i, i2, i3, i4);
        }
        this.filterOn = bsxVar.f78268g1;
        this.mSaturation = bsxVar.f78271h1;
        this.mDeblurWeight = bsxVar.f78274i1;
        this.mDeblurRadius = bsxVar.f78277j1;
        this.mDeblurThreshold = bsxVar.f78280k1;
        this.mContrast = bsxVar.f78283l1;
        this.mHardDecoderFlagFromMediaConfig = bsxVar.f78207F0 != 0;
        setMediaCodecEnabled(this.mHardDecoderFlagFromMediaConfig);
        this.mediaLogPullV2.m118333k("mediaconfig", "mDecorderRecordPts:" + bsxVar.f78237U0 + ", NewEnableLatency:" + bsxVar.f78225O0 + ",Latency_seconds:" + bsxVar.f78239V0);
        dvx dvxVar = this.mediaLogPullV2;
        StringBuilder sb = new StringBuilder("mUseOpengl:");
        sb.append(this.mUseOpengl);
        dvxVar.m118333k("prepareAsync", sb.toString(), "filterOn:" + this.filterOn + ",checksei:" + bsxVar.f78233S0 + ",sizechange:" + bsxVar.f78235T0);
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
        return _getPropertyFloat_(10005, 0.0f);
    }

    public long getAudioCachedBytes() {
        return _getPropertyLong_(20008, 0L);
    }

    public long getAudioCachedDuration() {
        return getAudioCachedPackets() * 23;
    }

    public long getAudioCachedPackets() {
        return _getPropertyLong_(20010, 0L);
    }

    public long getAudioDecoderSize() {
        return _getPropertyLong_(20014, 0L);
    }

    public long getAudioReadSize() {
        return _getPropertyLong_(20011, 0L);
    }

    public long getAudioRenderSize() {
        return _getPropertyLong_(20013, 0L);
    }

    public float getAudioSampleRate() {
        return _getPropertyFloat_(10015, 0.0f);
    }

    public long getAudioStreamIndex() {
        return _getPropertyLong_(20002, 0L);
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
        return yt0.m217280g().m217282b();
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
        float f_getPropertyFloat_ = _getPropertyFloat_(10006, 0.0f);
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

    public p4k0 getCurrentUrlInfo() {
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
        float f_getPropertyFloat_ = _getPropertyFloat_(10008, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstAPacketTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(10009, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstARenderTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(10012, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstIFrameTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(10007, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstVPacketTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(10010, 0.0f);
        if (f_getPropertyFloat_ < 0.0f) {
            return 0.0f;
        }
        return f_getPropertyFloat_;
    }

    public float getFirstVRenderTimes() {
        float f_getPropertyFloat_ = _getPropertyFloat_(10011, 0.0f);
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
            String[] strArrSplit = str_getVideoCodecInfo.split(Constants.SEPARATOR_COMMA);
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
            String[] strArrSplit2 = str_getAudioCodecInfo.split(Constants.SEPARATOR_COMMA);
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
            case 20056:
                return this.mBufferFirst;
            case 20057:
                return this.mBufferCurrent;
            case 20058:
                return this.mBufferNext;
            case 20059:
                return this.mBufferLast;
            case 20060:
                return this.mLatencyEnable;
            case 20061:
                return this.mLatencyBaseMark;
            case 20062:
                return this.mLatencySpeedupMark;
            case 20063:
                return this.mLatencyDropMark;
            case 20064:
                return (int) this.mDelayTime;
            case 20065:
                return this.mBufferInterval;
            case 20066:
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
            b7y.m102882c().m102888g("getPropertyString", Integer.valueOf(i));
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
        pullWatchInfo.setPullDebugInfoParms(z ? getAudioReadSize() : 0L, z ? getVideoReadSize() : 0L, z ? getVideoOutputFrames() : 0L, z ? (int) getFirstARenderTimes() : 0, z ? (int) getFirstVRenderTimes() : 0, z ? (int) getVideoCachedDuration() : 0, z ? (int) getAudioCachedDuration() : 0, z ? (int) getDelayTime() : 0, pgy.m172290h().m172295b(), z ? getPullDetects() : "not prepared");
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
        return _getPropertyLong_(20004, 0L);
    }

    public long getTsTime() {
        return this.mIFrameTime;
    }

    public long getVideoCachedBytes() {
        return _getPropertyLong_(20007, 0L);
    }

    public long getVideoCachedDuration() {
        return getVideoCachedPackets() * 66;
    }

    public long getVideoCachedPackets() {
        return _getPropertyLong_(20009, 0L);
    }

    public long getVideoCodecType() {
        try {
            return _getPropertyLong(20042, 0L);
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
        return _getPropertyLong_(20015, 0L);
    }

    public float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat_(10001, 0.0f);
    }

    public long getVideoDecoder() {
        return _getPropertyLong_(20003, 0L);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public long getVideoOutputFrames() {
        return _getPropertyLong_(20016, 0L);
    }

    public float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat_(10002, 0.0f);
    }

    public long getVideoReadSize() {
        return _getPropertyLong_(20012, 0L);
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
        return _getPropertyLong_(20001, 0L);
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
        this.mediaLogPullV2.m118331i(str, str2);
    }

    public int mediaConfig(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        esx.m122399d(TAG, "[" + hashCode() + "] [" + str + Constants.AES_SUFFIX);
        if (TextUtils.isEmpty(str)) {
            b7y.m102882c().m102883a("mediaConfig", Constants.KEY_CONFIG, LogLevel.ERROR);
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
                        int iOptInt4 = jSONArrayOptJSONArray.optInt(3, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                        this.mHardDecoderFlagFromMediaConfig = iOptInt != 0;
                        setMediaCodecEnabled(this.mHardDecoderFlagFromMediaConfig);
                        if (iOptInt3 > 0) {
                            this.mediaLogPullV2.m118321C(iOptInt3);
                        }
                        if (iOptInt4 > 0) {
                            this.mediaLogPullV2.m118341u(iOptInt4);
                        }
                        csx.m112235R().m112383s1(iOptInt2 == 1);
                        this.enableLogBufferAndPullSize = jSONArrayOptJSONArray.optInt(4, 0);
                        this.mBufferLogHz = jSONArrayOptJSONArray.optInt(5, 500);
                        this.mPullSizeLogCount = jSONArrayOptJSONArray.optInt(6, 10);
                        this.mBufferLogCount = jSONArrayOptJSONArray.optInt(7, 10);
                        this.mVideoRenderTHold = jSONArrayOptJSONArray.optInt(8, 0);
                        this.mNewEnableLatency = jSONArrayOptJSONArray.optInt(9, 0);
                        this.mAudioPtsValue = (float) jSONArrayOptJSONArray.optDouble(10, 1.5d);
                        this.mMinVideoJumpDuration = (float) jSONArrayOptJSONArray.optDouble(11, 0.5d);
                        this.mDecorderRecordPts = jSONArrayOptJSONArray.optInt(14, -1);
                    } else {
                        i5 = 3;
                        b7y.m102882c().m102885d("pull_comm", "ijkmediaplayer_mediaConfig");
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
                        if (string.contains(Constants.AES_SUFFIX)) {
                            string = string.replace(Constants.AES_SUFFIX, "");
                        }
                        String[] strArrSplit = string.split(Constants.SEPARATOR_COMMA);
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
                    b7y.m102882c().m102885d("pull_delay", "ijkmediaplayer_mediaConfig");
                }
                if (jSONObject.has("filter_config")) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("filter_config");
                    this.filterOn = jSONArrayOptJSONArray2.optInt(0, 0);
                    this.mSaturation = (float) jSONArrayOptJSONArray2.optDouble(1, 1.0d);
                    this.mDeblurWeight = (float) jSONArrayOptJSONArray2.optDouble(2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    this.mDeblurRadius = (float) jSONArrayOptJSONArray2.optDouble(i5, 1.0d);
                    this.mDeblurThreshold = (float) jSONArrayOptJSONArray2.optDouble(4, 1.0d);
                    this.mContrast = (float) jSONArrayOptJSONArray2.optDouble(5, 1.0d);
                } else {
                    b7y.m102882c().m102885d("filter_config", "ijkmediaplayer_mediaConfig");
                }
            } catch (Exception e) {
                b7y.m102882c().m102885d("" + e.toString(), "ijkmediaplayer_mediaConfig");
                b7y.m102882c().m102888g("ijkmediaplayer parse mediaconfig:" + e.toString());
            }
        }
        b7y.m102882c().m102888g("ijkmediaplayer", "player hashcode:" + hashCode() + ",setMediaConfig:" + str);
        StringBuilder sb = new StringBuilder("mediaConfig:");
        sb.append(str);
        mediaLogs("ijkmediaplayer", sb.toString());
        mlSetLowerLatency(this.mLatencyEnable, this.mLatencyBaseMark, this.mLatencySpeedupMark, this.mLatencyDropMark, this.mLatencySpeedRate);
        int i6 = this.mBufferFirst;
        if (i6 > 0 && (i = this.mBufferCurrent) > 0 && (i2 = this.mBufferNext) > 0 && (i3 = this.mBufferLast) > 0 && (i4 = this.mBufferInterval) > 0) {
            setBufferParams(i6, i, i2, i3, i4);
        }
        setPropertyLong(20039, this.mVideoRenderTHold);
        setPropertyLong(20040, this.mNewEnableLatency);
        _setPropertyFloat_(10016, this.mAudioPtsValue);
        _setPropertyFloat_(10017, this.mMinVideoJumpDuration);
        _setPropertyLong(20054, this.mDecorderRecordPts);
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
        esx.m122399d(TAG, "[" + hashCode() + Constants.AES_SUFFIX);
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
            esx.m122399d(TAG, sb.toString());
            MediaCfgInit();
            setMediaCodecEnabled_l(this.mUseAndroidMediaCodec);
            if (this.mUseOpengl == 1) {
                setOption(4, "overlay-format", "fcc-_es2");
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
            this.mediaLogPullV2.m118333k("prepareAsync", "mUseOpengl:" + this.mUseOpengl, "filterOn:" + this.filterOn + ",checksei:" + this.mNewcheckSei + ",newsizeChange" + this.mNewSizeChange);
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
        vvx vvxVar = this.mediaLogsValOfPull;
        vvxVar.f186021c = this.mDataSource;
        vvxVar.f186032h0 = System.currentTimeMillis();
        pullInitV2();
        this.mediaLogPullV2.m118332j("setRenderType", this.mUseOpengl == 1 ? "OpengL" : "nativeWindow ");
        this.mediaLogPullV2.m118333k("mediaconfig", "mDecorderRecordPts:" + this.mDecorderRecordPts + ", NewEnableLatency:" + this.mNewEnableLatency);
        this.mediaLogPullV2.m118333k("filterParm", "filterOn:" + this.filterOn + ",Saturation:" + this.mSaturation + ", mDeblurWeight" + this.mDeblurWeight + ", mDeblurRadius:" + this.mDeblurRadius + ",mDeblurThreshold:" + this.mDeblurThreshold + ",mContrast:" + this.mContrast);
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
            esx.m122399d(TAG, "[" + hashCode() + "] release.");
            if (this.mFakeSurface != null) {
                mediaLogs2("HWRender", "Stop");
            }
            this.mediaLogPullV2.m118333k("ijkmediaplayer release");
            pullStopV2();
            yt0.m217280g().m217296q(yt0.f201476g);
            release_l();
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.mContextRef = null;
            String str = this.mDataSource;
            if (str != null && str.length() > 0) {
                mediaLogs2("release", hashCode() + " release");
                dvx dvxVar = this.mediaLogPullV2;
                if (dvxVar != null) {
                    dvxVar.m118327c();
                    this.mediaLogPullV2.m118340s();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        esx.m122399d(TAG, "[" + hashCode() + Constants.AES_SUFFIX);
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
        esx.m122399d(TAG, "[" + hashCode() + "] resetInternal");
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
        esx.m122399d(TAG, "[" + hashCode() + "] seekTo " + j);
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
            _setPropertyLong_(20032, i);
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
            esx.m122396a(TAG, "mJsonDateCallback error.");
        }
    }

    public void setAcceDriveCacheDuration(long j) {
        _setPropertyLong_(20020, j);
    }

    public void setAccePlayRate(float f) {
        _setPropertyFloat_(10014, f);
    }

    public void setAudio3D(boolean z) {
        this.enable3D = z;
        this.headSetOn = HeadSetReceiver.getInstance().getHeadSetState();
        mediaLogs("playerAudioEffect", "[audioEffect:" + (!z ? 0 : 1) + Constants.AES_SUFFIX);
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
        mediaLogs("playerAudioEffect", "[audioEffect:" + (z ? 2 : 0) + Constants.AES_SUFFIX);
        if (this.headSetOn) {
            setHifi(z);
        } else {
            setBoostHiFi(z);
        }
    }

    public void setAudioOnly(boolean z) {
        _setPropertyLong_(20028, z ? 1L : 0L);
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
        this.mediaLogsValOfPull.f186005O = (long) i;
        brx brxVar = this.mediaCfgParams;
        if (brxVar != null) {
            brxVar.m106184p(i);
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
        esx.m122396a(TAG, "setDataSource: ipv6Url=" + str + ", ipv4Url=" + str2);
        this.mHasPrepared = false;
        p4k0 p4k0VarM176820g = qj20.m176806f().m176820g(str, str2);
        if (p4k0VarM176820g == null || TextUtils.isEmpty(p4k0VarM176820g.m170573d())) {
            dvx dvxVar = this.mediaLogPullV2;
            if (dvxVar != null) {
                dvxVar.m118332j("setDataSource", "No valid URL available for playback");
                return;
            }
            return;
        }
        this.mCurrentUrlInfo = p4k0VarM176820g;
        this.detectStatus = p4k0VarM176820g.m170571a();
        esx.m122396a(TAG, "setDataSource: using url=" + p4k0VarM176820g.m170573d() + ", type=" + p4k0VarM176820g.m170572b());
        setDataSource(p4k0VarM176820g.m170573d());
        qj20.m176806f().m176823t(p4k0VarM176820g);
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
        _setPropertyLong_(20019, j);
    }

    public void setDecePlayRate(float f) {
        _setPropertyFloat_(10013, f);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.costOfsetSurfaceMs;
        esx.m122399d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " mediacodec: " + this.mUseAndroidMediaCodec + "/" + this.mFakeSurface + "/" + surfaceHolder);
        StringBuilder sb = new StringBuilder("[");
        sb.append(hashCode());
        sb.append("] getSurface: ");
        sb.append(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        sb.append("/ ");
        fakeSurface fakesurface = this.mFakeSurface;
        sb.append(fakesurface != null ? fakesurface.getLastErr() : -1);
        esx.m122399d(TAG, sb.toString());
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
        _setPropertyLong_(20030, z ? 1L : 0L);
    }

    public void setFastDnsExpireTime(int i) {
        this.fast_dns_expire_time = i;
        _setPropertyLong_(20031, i);
    }

    @Deprecated
    public void setFrameDrop(int i) {
        setOption(4, "framedrop", i);
    }

    public final void setJsonDataCallback(JsonDateCallback jsonDateCallback) {
        this.mJsonDateCallback = jsonDateCallback;
    }

    public final void setLogRoomInfos(String str, String str2, int i) {
        brx brxVar = this.mediaCfgParams;
        if (brxVar != null) {
            brxVar.m106187s(str);
            if (i != 0) {
                this.mediaCfgParams.m106186r(i);
            }
        }
        this.mediaLogPullV2.m118345y(str, str2, i);
    }

    public final void setLogUploadCb(int i, int i2, fpf0 fpf0Var) {
        esx.m122399d(TAG, "setLogUploadCb " + i + " | " + i2 + " | " + fpf0Var);
        if (i <= 0 || i2 <= 0 || fpf0Var == null) {
            return;
        }
        this.mediaLogPullV2.m118323E(i, i2, fpf0Var);
    }

    public void setManuaRefresh(boolean z) {
        this.mManuaRefresh = z;
    }

    public void setMaxBufferlingSize(long j) {
        _setPropertyLong_(20027, j);
    }

    public void setMaxTimeOfBuffer(int i) {
        _setPropertyLong_(20033, i);
    }

    public void setMediaCodecEnabled(boolean z) {
        esx.m122399d(TAG, "[" + hashCode() + "] " + z);
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
        esx.m122399d("[" + hashCode() + "] configdata", "key " + i + "/" + str);
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
        this.mediaLogsValOfPull.f186026e0 = str;
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
        a320 a320Var = this.httpMediaLogsUpload;
        if (a320Var != null) {
            a320Var.m95759g(str);
        }
    }

    public final void setSimpleInfoFromUpStreamCb(bpf0 bpf0Var) {
        if (bpf0Var != null) {
            this.simpleInfoFromUpStream = bpf0Var;
        }
    }

    public void setSpeedControl(int i, int i2, float f, int i3, float f2) {
    }

    public void setSrc(String str) {
        mediaLogs2(hashCode() + "setSrc " + str);
        this.sourceStr = str;
        a320 a320Var = this.httpMediaLogsUpload;
        if (a320Var != null) {
            a320Var.m95760h(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.BaseMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.costOfsetSurfaceMs;
        esx.m122399d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " mediacode:" + this.mUseAndroidMediaCodec + " / " + this.mFakeSurface + " / " + surface);
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
        esx.m122399d(TAG, "[" + hashCode() + "] cost " + jCurrentTimeMillis + " / " + surface);
        if (this.metaTimeMs == 0) {
            this.metaTimeMs = jCurrentTimeMillis;
        }
        if (this.mScreenOnWhilePlaying && surface != null) {
            esx.m122399d(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
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
        _setPropertyLong_(20026, j);
    }

    public void setVideoOnly(boolean z) {
        _setPropertyLong_(20029, z ? 1L : 0L);
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
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, IjkMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        esx.m122399d(TAG, "[" + hashCode() + Constants.AES_SUFFIX);
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
        esx.m122399d(TAG, "[" + hashCode() + Constants.AES_SUFFIX);
        if (this.mFakeSurface != null) {
            mediaLogs2("HWRender", hashCode() + "stop HWRende");
        }
        this.mediaLogPullV2.m118333k("ijkmediaplayer stop");
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
        this.mediaLogPullV2.m118324G(str, str2);
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
            b7y.m102882c().m102883a("setDataSource", "dataSource", LogLevel.FATAL);
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
        esx.m122399d(TAG, "[" + hashCode() + "] [" + this.mCdnip + "] " + str);
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

    public IjkMediaPlayer(Context context, brx brxVar) {
        this(context, sLocalLibLoader, brxVar);
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContextRef = weakReference;
        if (weakReference.get() != null) {
            yt0.m217280g().m217295p(this.mContextRef.get(), yt0.f201476g);
        }
        try {
            if (csx.m112235R().m112299V0()) {
                aol.m99098e().m99108o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IjkMediaPlayer() {
        this(null, sLocalLibLoader, null);
    }
}
