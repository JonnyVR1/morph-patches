package p153l;

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

/* JADX INFO: loaded from: classes11.dex */
public class dyh0 implements IMediaPlayer {

    /* JADX INFO: renamed from: a */
    public final IMediaPlayer f91235a = new IjkMediaPlayer();

    /* JADX INFO: renamed from: l.dyh0$a */
    public class C16660a implements IMediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnPreparedListener f91236a;

        public C16660a(IMediaPlayer.OnPreparedListener onPreparedListener) {
            this.f91236a = onPreparedListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f91236a.onPrepared(dyh0.this);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$b */
    public class C16661b implements IMediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnCompletionListener f91238a;

        public C16661b(IMediaPlayer.OnCompletionListener onCompletionListener) {
            this.f91238a = onCompletionListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f91238a.onCompletion(dyh0.this);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$c */
    public class C16662c implements IMediaPlayer.OnBufferingUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnBufferingUpdateListener f91240a;

        public C16662c(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
            this.f91240a = onBufferingUpdateListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            this.f91240a.onBufferingUpdate(dyh0.this, i);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$d */
    public class C16663d implements IMediaPlayer.OnSeekCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnSeekCompleteListener f91242a;

        public C16663d(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
            this.f91242a = onSeekCompleteListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f91242a.onSeekComplete(dyh0.this);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$e */
    public class C16664e implements IMediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnVideoSizeChangedListener f91244a;

        public C16664e(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
            this.f91244a = onVideoSizeChangedListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            this.f91244a.onVideoSizeChanged(dyh0.this, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$f */
    public class C16665f implements IMediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnErrorListener f91246a;

        public C16665f(IMediaPlayer.OnErrorListener onErrorListener) {
            this.f91246a = onErrorListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            return this.f91246a.onError(dyh0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$g */
    public class C16666g implements IMediaPlayer.OnInfoListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnInfoListener f91248a;

        public C16666g(IMediaPlayer.OnInfoListener onInfoListener) {
            this.f91248a = onInfoListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            return this.f91248a.onInfo(dyh0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.dyh0$h */
    public class C16667h implements IMediaPlayer.OnTimedTextListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMediaPlayer.OnTimedTextListener f91250a;

        public C16667h(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
            this.f91250a = onTimedTextListener;
        }

        @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            this.f91250a.onTimedText(dyh0.this, ijkTimedText);
        }
    }

    public dyh0() {
        m118697c();
    }

    /* JADX INFO: renamed from: a */
    public void m118695a() {
        this.f91235a.setOption(4, "enable-dynbuf", 1L);
    }

    /* JADX INFO: renamed from: b */
    public IMediaPlayer m118696b() {
        return this.f91235a;
    }

    /* JADX INFO: renamed from: c */
    public final void m118697c() {
        this.f91235a.setOption(4, "framedrop", 1L);
        this.f91235a.setOption(4, "min-frames", 50L);
        this.f91235a.setOption(1, "probesize", 1024L);
        this.f91235a.setOption(1, "max-buffer-size", 40960L);
        this.f91235a.setOption(1, "analyzeduration", 1000L);
        this.f91235a.setOption(4, "enable-accurate-seek-seek", 1L);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.f91235a.getAudioSessionId();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return this.f91235a.getCurrentPosition();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.f91235a.getDataSource();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return this.f91235a.getDuration();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        return this.f91235a.getMediaInfo();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return this.f91235a.getTrackInfo();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.f91235a.getVideoHeight();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.f91235a.getVideoSarDen();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.f91235a.getVideoSarNum();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.f91235a.getVideoWidth();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.f91235a.isLooping();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return false;
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return this.f91235a.isPlaying();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.f91235a.pause();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        this.f91235a.prepareAsync();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void release() {
        this.f91235a.release();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void reset() {
        this.f91235a.reset();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        this.f91235a.seekTo(j);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
        this.f91235a.setAudioStreamType(i);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f91235a.setDataSource(context, uri);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.f91235a.setDisplay(surfaceHolder);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z) {
        this.f91235a.setKeepInBackground(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.f91235a.setLooping(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onBufferingUpdateListener != null) {
            iMediaPlayer.setOnBufferingUpdateListener(new C16662c(onBufferingUpdateListener));
        } else {
            iMediaPlayer.setOnBufferingUpdateListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onCompletionListener != null) {
            iMediaPlayer.setOnCompletionListener(new C16661b(onCompletionListener));
        } else {
            iMediaPlayer.setOnCompletionListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onErrorListener != null) {
            iMediaPlayer.setOnErrorListener(new C16665f(onErrorListener));
        } else {
            iMediaPlayer.setOnErrorListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onInfoListener != null) {
            iMediaPlayer.setOnInfoListener(new C16666g(onInfoListener));
        } else {
            iMediaPlayer.setOnInfoListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onPreparedListener != null) {
            iMediaPlayer.setOnPreparedListener(new C16660a(onPreparedListener));
        } else {
            iMediaPlayer.setOnPreparedListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onSeekCompleteListener != null) {
            iMediaPlayer.setOnSeekCompleteListener(new C16663d(onSeekCompleteListener));
        } else {
            iMediaPlayer.setOnSeekCompleteListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onTimedTextListener != null) {
            iMediaPlayer.setOnTimedTextListener(new C16667h(onTimedTextListener));
        } else {
            iMediaPlayer.setOnTimedTextListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        IMediaPlayer iMediaPlayer = this.f91235a;
        if (onVideoSizeChangedListener != null) {
            iMediaPlayer.setOnVideoSizeChangedListener(new C16664e(onVideoSizeChangedListener));
        } else {
            iMediaPlayer.setOnVideoSizeChangedListener(null);
        }
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOption(int i, String str, String str2) {
        this.f91235a.setOption(i, str, str2);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        this.f91235a.setScreenOnWhilePlaying(z);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.f91235a.setSurface(surface);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        this.f91235a.setVolume(f, f2);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i) {
        this.f91235a.setWakeMode(context, i);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.f91235a.start();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.f91235a.stop();
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f91235a.setDataSource(context, uri, map);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setOption(int i, String str, long j) {
        this.f91235a.setOption(i, str, j);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        this.f91235a.setDataSource(fileDescriptor);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f91235a.setDataSource(str);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.f91235a.setDataSource(iMediaDataSource);
    }

    @Override // com.tantanapp.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z) {
    }
}
