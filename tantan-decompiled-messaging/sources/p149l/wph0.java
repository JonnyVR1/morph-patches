package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tantanapp.ijk.media.player.IjkTimedText;
import com.tantanapp.ijk.media.player.MediaInfo;
import com.tantanapp.ijk.media.player.misc.IMediaDataSource;
import com.tantanapp.ijk.media.player.misc.ITrackInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class wph0 implements IMediaPlayer {

    /* JADX INFO: renamed from: a */
    public final IMediaPlayer f187514a = new IjkMediaPlayer();

    /* JADX INFO: renamed from: l.wph0$a */
    public class C20927a implements IMediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnPreparedListener f187515a;

        public C20927a(IMediaPlayer.OnPreparedListener onPreparedListener) {
            this.f187515a = onPreparedListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f187515a.onPrepared(wph0.this);
        }
    }

    /* JADX INFO: renamed from: l.wph0$b */
    public class C20928b implements IMediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnCompletionListener f187517a;

        public C20928b(IMediaPlayer.OnCompletionListener onCompletionListener) {
            this.f187517a = onCompletionListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f187517a.onCompletion(wph0.this);
        }
    }

    /* JADX INFO: renamed from: l.wph0$c */
    public class C20929c implements IMediaPlayer.OnBufferingUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnBufferingUpdateListener f187519a;

        public C20929c(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
            this.f187519a = onBufferingUpdateListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            this.f187519a.onBufferingUpdate(wph0.this, i);
        }
    }

    /* JADX INFO: renamed from: l.wph0$d */
    public class C20930d implements IMediaPlayer.OnSeekCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnSeekCompleteListener f187521a;

        public C20930d(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
            this.f187521a = onSeekCompleteListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f187521a.onSeekComplete(wph0.this);
        }
    }

    /* JADX INFO: renamed from: l.wph0$e */
    public class C20931e implements IMediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnVideoSizeChangedListener f187523a;

        public C20931e(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
            this.f187523a = onVideoSizeChangedListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            this.f187523a.onVideoSizeChanged(wph0.this, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: l.wph0$f */
    public class C20932f implements IMediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnErrorListener f187525a;

        public C20932f(IMediaPlayer.OnErrorListener onErrorListener) {
            this.f187525a = onErrorListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            return this.f187525a.onError(wph0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.wph0$g */
    public class C20933g implements IMediaPlayer.OnInfoListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnInfoListener f187527a;

        public C20933g(IMediaPlayer.OnInfoListener onInfoListener) {
            this.f187527a = onInfoListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            return this.f187527a.onInfo(wph0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.wph0$h */
    public class C20934h implements IMediaPlayer.OnTimedTextListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnTimedTextListener f187529a;

        public C20934h(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
            this.f187529a = onTimedTextListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            this.f187529a.onTimedText(wph0.this, ijkTimedText);
        }
    }

    public wph0() {
        m204914c();
    }

    /* JADX INFO: renamed from: a */
    public void m204912a() {
        this.f187514a.setOption(4, "enable-dynbuf", 1L);
    }

    /* JADX INFO: renamed from: b */
    public IMediaPlayer m204913b() {
        return this.f187514a;
    }

    /* JADX INFO: renamed from: c */
    public final void m204914c() {
        this.f187514a.setOption(4, "framedrop", 1L);
        this.f187514a.setOption(4, "min-frames", 50L);
        this.f187514a.setOption(1, "probesize", 1024L);
        this.f187514a.setOption(1, "max-buffer-size", 40960L);
        this.f187514a.setOption(1, "analyzeduration", 1000L);
        this.f187514a.setOption(4, "enable-accurate-seek-seek", 1L);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.f187514a.getAudioSessionId();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return this.f187514a.getCurrentPosition();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.f187514a.getDataSource();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return this.f187514a.getDuration();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        return this.f187514a.getMediaInfo();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return this.f187514a.getTrackInfo();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.f187514a.getVideoHeight();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.f187514a.getVideoSarDen();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.f187514a.getVideoSarNum();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.f187514a.getVideoWidth();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.f187514a.isLooping();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return false;
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return this.f187514a.isPlaying();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.f187514a.pause();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        this.f187514a.prepareAsync();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void release() {
        this.f187514a.release();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void reset() {
        this.f187514a.reset();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        this.f187514a.seekTo(j);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
        this.f187514a.setAudioStreamType(i);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f187514a.setDataSource(context, uri);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.f187514a.setDisplay(surfaceHolder);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z) {
        this.f187514a.setKeepInBackground(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.f187514a.setLooping(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onBufferingUpdateListener != null) {
            iMediaPlayer.setOnBufferingUpdateListener(new C20929c(onBufferingUpdateListener));
        } else {
            iMediaPlayer.setOnBufferingUpdateListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onCompletionListener != null) {
            iMediaPlayer.setOnCompletionListener(new C20928b(onCompletionListener));
        } else {
            iMediaPlayer.setOnCompletionListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onErrorListener != null) {
            iMediaPlayer.setOnErrorListener(new C20932f(onErrorListener));
        } else {
            iMediaPlayer.setOnErrorListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onInfoListener != null) {
            iMediaPlayer.setOnInfoListener(new C20933g(onInfoListener));
        } else {
            iMediaPlayer.setOnInfoListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onPreparedListener != null) {
            iMediaPlayer.setOnPreparedListener(new C20927a(onPreparedListener));
        } else {
            iMediaPlayer.setOnPreparedListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onSeekCompleteListener != null) {
            iMediaPlayer.setOnSeekCompleteListener(new C20930d(onSeekCompleteListener));
        } else {
            iMediaPlayer.setOnSeekCompleteListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onTimedTextListener != null) {
            iMediaPlayer.setOnTimedTextListener(new C20934h(onTimedTextListener));
        } else {
            iMediaPlayer.setOnTimedTextListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        IMediaPlayer iMediaPlayer = this.f187514a;
        if (onVideoSizeChangedListener != null) {
            iMediaPlayer.setOnVideoSizeChangedListener(new C20931e(onVideoSizeChangedListener));
        } else {
            iMediaPlayer.setOnVideoSizeChangedListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOption(int i, String str, String str2) {
        this.f187514a.setOption(i, str, str2);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        this.f187514a.setScreenOnWhilePlaying(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.f187514a.setSurface(surface);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        this.f187514a.setVolume(f, f2);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i) {
        this.f187514a.setWakeMode(context, i);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.f187514a.start();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.f187514a.stop();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f187514a.setDataSource(context, uri, map);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOption(int i, String str, long j) {
        this.f187514a.setOption(i, str, j);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        this.f187514a.setDataSource(fileDescriptor);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f187514a.setDataSource(str);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.f187514a.setDataSource(iMediaDataSource);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z) {
    }
}
