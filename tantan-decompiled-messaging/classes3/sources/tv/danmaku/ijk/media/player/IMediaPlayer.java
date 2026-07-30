package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INDEO_V_DECODE_ERROR = 907;
    public static final int MEDIA_INFO_AUDIO_OPEN_ERROR = 909;
    public static final int MEDIA_INFO_AUDIO_PTS_ERROR = 910;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_CHANGE_MAX_BUFFER_CACHE = 908;
    public static final int MEDIA_INFO_FAST_PALY_END = 902;
    public static final int MEDIA_INFO_FAST_PALY_START = 901;
    public static final int MEDIA_INFO_INITBUFFERING_END = 705;
    public static final int MEDIA_INFO_INITBUFFERING_START = 704;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_ML_DROP_START = 903;
    public static final int MEDIA_INFO_ML_DROP_STOP = 904;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_PULLBUFFER = 1001;
    public static final int MEDIA_INFO_PULLWATCH = 1000;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_VA_DIFF = 905;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int MEDIA_INFO_V_DELAY = 906;

    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i);
    }

    public interface OnCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    public interface OnErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    public interface OnInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    public interface OnVideoMediacodecChangedListener {
        void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i);
    }

    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4);
    }

    public interface RenderTimestampListener {
        void onRenderTimestampChanged(long j);
    }

    int getAudioTrackNum();

    long getCurrentPosition();

    long getCurrentPts();

    String getDataSource();

    long getDuration();

    MediaInfo getMediaInfo();

    float getRate();

    String getServerIpAddr();

    int getVideoDarDen();

    int getVideoDarNum();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(long j) throws IllegalStateException;

    void selectAudioTrack(int i);

    void setAudioStreamType(int i);

    void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDisplay(SurfaceHolder surfaceHolder);

    void setKeepInBackground(boolean z);

    void setLogEnabled(boolean z);

    void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(OnCompletionListener onCompletionListener);

    void setOnErrorListener(OnErrorListener onErrorListener);

    void setOnInfoListener(OnInfoListener onInfoListener);

    void setOnPreparedListener(OnPreparedListener onPreparedListener);

    void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    void setOnVideoMediacodecChangedListener(OnVideoMediacodecChangedListener onVideoMediacodecChangedListener);

    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setPlayback(boolean z);

    void setRate(float f);

    void setScreenOnWhilePlaying(boolean z);

    @TargetApi(14)
    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    @Deprecated
    void setWakeMode(Context context, int i);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;

    void updateScreenSize(int i, int i2);
}
