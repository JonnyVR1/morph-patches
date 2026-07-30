package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class TraeMediaPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public static final int TRAE_MEDIAPLAER_DATASOURCE_FILEPATH = 2;
    public static final int TRAE_MEDIAPLAER_DATASOURCE_RSID = 0;
    public static final int TRAE_MEDIAPLAER_DATASOURCE_URI = 1;
    public static final int TRAE_MEDIAPLAER_STOP = 100;
    private Context _context;
    private OnCompletionListener mCallback;
    private MediaPlayer mMediaPlay = null;
    private int _streamType = 0;
    private boolean _hasCall = false;
    private boolean _loop = false;
    private int _durationMS = -1;
    int _loopCount = 0;
    boolean _ringMode = false;
    private Timer _watchTimer = null;
    private TimerTask _watchTimertask = null;
    private int _prevVolume = -1;

    public interface OnCompletionListener {
        void onCompletion();
    }

    public TraeMediaPlayer(Context context, OnCompletionListener onCompletionListener) {
        this._context = context;
        this.mCallback = onCompletionListener;
    }

    private void volumeDo() {
        if (this.mMediaPlay == null || !this._ringMode || this._streamType == 2) {
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) this._context.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(this._streamType);
            int streamMaxVolume = audioManager.getStreamMaxVolume(this._streamType);
            int streamVolume2 = audioManager.getStreamVolume(2);
            int streamMaxVolume2 = audioManager.getStreamMaxVolume(2);
            int i = (int) (((((double) streamVolume2) * 1.0d) / ((double) streamMaxVolume2)) * ((double) streamMaxVolume));
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "TraeMediaPlay volumeDo currV:" + streamVolume + " maxV:" + streamMaxVolume + " currRV:" + streamVolume2 + " maxRV:" + streamMaxVolume2 + " setV:" + i);
            }
            int i2 = i + 1;
            if (i2 < streamMaxVolume) {
                streamMaxVolume = i2;
            }
            audioManager.setStreamVolume(this._streamType, streamMaxVolume, 0);
            this._prevVolume = streamVolume;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "set stream volume failed." + e.getMessage());
            }
        }
    }

    private void volumeUndo() {
        if (this.mMediaPlay == null || !this._ringMode || this._streamType == 2 || this._prevVolume == -1) {
            return;
        }
        try {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "TraeMediaPlay volumeUndo _prevVolume:" + this._prevVolume);
            }
            ((AudioManager) this._context.getSystemService("audio")).setStreamVolume(this._streamType, this._prevVolume, 0);
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "set stream volume failed." + e.getMessage());
            }
        }
    }

    public int getDuration() {
        return this._durationMS;
    }

    public int getStreamType() {
        return this._streamType;
    }

    public boolean hasCall() {
        return this._hasCall;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " loopCount:" + this._loopCount + " _loop:" + this._loop);
        if (this._loop) {
            if (QLog.isColorLevel()) {
                QLog.m85771d("TRAE", 2, "loop play,continue...");
                return;
            }
            return;
        }
        try {
            if (this._loopCount <= 0) {
                volumeUndo();
                if (this.mMediaPlay.isPlaying()) {
                    this.mMediaPlay.stop();
                }
                this.mMediaPlay.reset();
                this.mMediaPlay.release();
                this.mMediaPlay = null;
                OnCompletionListener onCompletionListener = this.mCallback;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion();
                }
            } else {
                this.mMediaPlay.start();
                this._loopCount--;
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "stop play failed." + e.getMessage());
            }
        }
        AudioDeviceInterface.LogTraceExit();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " arg1:" + i + " arg2:" + i2);
        try {
            this.mMediaPlay.release();
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
            }
        }
        this.mMediaPlay = null;
        OnCompletionListener onCompletionListener = this.mCallback;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion();
        }
        AudioDeviceInterface.LogTraceExit();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0361 -> B:150:0x0383). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0363 -> B:150:0x0383). Please report as a decompilation issue!!! */
    public boolean playRing(int i, int i2, Uri uri, String str, boolean z, int i3, boolean z2, boolean z3, int i4) {
        ?? r3;
        int i5;
        ?? r4 = i2;
        if (QLog.isColorLevel()) {
            ?? sb = new StringBuilder("TraeMediaPlay | playRing datasource:");
            sb.append(i);
            sb.append(" rsid:");
            sb.append(r4);
            sb.append(" uri:");
            sb.append(uri);
            sb.append(" filepath:");
            sb.append(str);
            sb.append(" loop:");
            sb.append(z ? "Y" : "N");
            sb.append(" :loopCount");
            sb.append(i3);
            sb.append(" ringMode:");
            sb.append(z2 ? "Y" : "N");
            sb.append(" hasCall:");
            sb.append(z3);
            sb.append(" cst:");
            sb.append(i4);
            QLog.m85773e("TRAE", 2, sb.toString());
        }
        boolean z4 = false;
        if (!z && i3 <= 0) {
            if (QLog.isColorLevel()) {
                StringBuilder sb2 = new StringBuilder("TraeMediaPlay | playRing err datasource:");
                sb2.append(i);
                sb2.append(" loop:");
                sb2.append(z ? "Y" : "N");
                sb2.append(" :loopCount");
                sb2.append(i3);
                QLog.m85773e("TRAE", 2, sb2.toString());
            }
            return false;
        }
        try {
            try {
                try {
                    MediaPlayer mediaPlayer = this.mMediaPlay;
                    if (mediaPlayer != null) {
                        try {
                            try {
                                if (mediaPlayer.isPlaying()) {
                                    return false;
                                }
                                try {
                                    this.mMediaPlay.release();
                                    this.mMediaPlay = null;
                                    z4 = false;
                                } catch (Exception e) {
                                    if (QLog.isColorLevel()) {
                                        try {
                                            QLog.m85773e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    }
                                    this.mMediaPlay = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            this.mMediaPlay = null;
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            String str2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                            r4 = str2;
                            if (QLog.isColorLevel()) {
                                QLog.m85771d("TRAE", 2, "TraeMediaPlay | IOException: " + e.getLocalizedMessage() + str2 + e.getMessage());
                                r4 = str2;
                            }
                            try {
                                this.mMediaPlay.release();
                            } catch (Exception unused) {
                            }
                            this.mMediaPlay = null;
                            return false;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            String str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                            r4 = str3;
                            if (QLog.isColorLevel()) {
                                QLog.m85771d("TRAE", 2, "TraeMediaPlay | IllegalArgumentException: " + e.getLocalizedMessage() + str3 + e.getMessage());
                                r4 = str3;
                            }
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return false;
                        } catch (IllegalStateException e4) {
                            e = e4;
                            String str4 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                            r4 = str4;
                            if (QLog.isColorLevel()) {
                                QLog.m85771d("TRAE", 2, "TraeMediaPlay | IllegalStateException: " + e.getLocalizedMessage() + str4 + e.getMessage());
                                r4 = str4;
                            }
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return false;
                        } catch (SecurityException e5) {
                            e = e5;
                            r4 = r4;
                            if (QLog.isColorLevel()) {
                                StringBuilder sb3 = new StringBuilder("TraeMediaPlay | SecurityException: ");
                                sb3.append(e.getLocalizedMessage());
                                String str5 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                                sb3.append(str5);
                                sb3.append(e.getMessage());
                                QLog.m85771d("TRAE", 2, sb3.toString());
                                r4 = str5;
                            }
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return false;
                        } catch (Exception e6) {
                            e = e6;
                            r3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                            r4 = r3;
                            if (QLog.isColorLevel()) {
                                QLog.m85771d("TRAE", 2, "TraeMediaPlay | Except: " + e.getLocalizedMessage() + r3 + e.getMessage());
                                r4 = r3;
                            }
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return false;
                        }
                    }
                    z4 = false;
                    Timer timer = this._watchTimer;
                    if (timer != null) {
                        timer.cancel();
                        this._watchTimer = null;
                        this._watchTimertask = null;
                    }
                    AudioManager audioManager = (AudioManager) this._context.getSystemService("audio");
                    MediaPlayer mediaPlayer2 = new MediaPlayer();
                    this.mMediaPlay = mediaPlayer2;
                    mediaPlayer2.setOnCompletionListener(this);
                    this.mMediaPlay.setOnErrorListener(this);
                    if (i == 0) {
                        if (QLog.isColorLevel()) {
                            QLog.m85773e("TRAE", 2, "TraeMediaPlay | rsid:" + r4);
                        }
                        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this._context.getResources().openRawResourceFd(r4);
                        if (assetFileDescriptorOpenRawResourceFd == null) {
                            if (QLog.isColorLevel()) {
                                QLog.m85773e("TRAE", 2, "TraeMediaPlay | afd == null rsid:" + r4);
                            }
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return z4;
                        }
                        this.mMediaPlay.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                        assetFileDescriptorOpenRawResourceFd.close();
                    } else if (i == 1) {
                        if (QLog.isColorLevel()) {
                            QLog.m85773e("TRAE", 2, "TraeMediaPlay | uri:" + uri);
                        }
                        this.mMediaPlay.setDataSource(this._context, uri);
                    } else if (i != 2) {
                        if (QLog.isColorLevel()) {
                            QLog.m85773e("TRAE", 2, "TraeMediaPlay | err datasource:" + i);
                        }
                        this.mMediaPlay.release();
                        this.mMediaPlay = null;
                    } else {
                        if (QLog.isColorLevel()) {
                            QLog.m85773e("TRAE", 2, "TraeMediaPlay | FilePath:" + str);
                        }
                        this.mMediaPlay.setDataSource(str);
                    }
                    MediaPlayer mediaPlayer3 = this.mMediaPlay;
                    if (mediaPlayer3 == null) {
                        return z4;
                    }
                    this._ringMode = z2;
                    if (z2) {
                        this._streamType = 2;
                        i5 = 1;
                    } else {
                        this._streamType = z4 ? 1 : 0;
                        i5 = 3;
                    }
                    this._hasCall = z3;
                    if (z3) {
                        this._streamType = i4;
                    }
                    mediaPlayer3.setAudioStreamType(this._streamType);
                    this.mMediaPlay.prepare();
                    this.mMediaPlay.setLooping(z);
                    this.mMediaPlay.start();
                    this._loop = z;
                    if (z) {
                        this._loopCount = 1;
                        this._durationMS = -1;
                    } else {
                        this._loopCount = i3;
                        this._durationMS = this.mMediaPlay.getDuration() * i3;
                    }
                    this._loopCount--;
                    if (!this._hasCall) {
                        audioManager.setMode(i5);
                    }
                    if (this._durationMS > 0) {
                        this._watchTimer = new Timer();
                        TimerTask timerTask = new TimerTask() { // from class: com.tencent.rtmp.sharp.jni.TraeMediaPlayer.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                if (TraeMediaPlayer.this.mMediaPlay != null) {
                                    if (QLog.isColorLevel()) {
                                        QLog.m85773e("TRAE", 2, "TraeMediaPlay | play timeout");
                                    }
                                    if (TraeMediaPlayer.this.mCallback != null) {
                                        TraeMediaPlayer.this.mCallback.onCompletion();
                                    }
                                }
                            }
                        };
                        this._watchTimertask = timerTask;
                        this._watchTimer.schedule(timerTask, this._durationMS + 1000);
                    }
                    if (QLog.isColorLevel()) {
                        QLog.m85773e("TRAE", 2, "TraeMediaPlay | DurationMS:" + this.mMediaPlay.getDuration() + " loop:" + z);
                    }
                    return true;
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (IOException e8) {
                e = e8;
            } catch (IllegalArgumentException e9) {
                e = e9;
            } catch (IllegalStateException e10) {
                e = e10;
            } catch (SecurityException e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            r3 = r4;
        }
    }

    public void stopRing() {
        if (QLog.isColorLevel()) {
            QLog.m85771d("TRAE", 2, "TraeMediaPlay stopRing ");
        }
        MediaPlayer mediaPlayer = this.mMediaPlay;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.mMediaPlay.stop();
        }
        this.mMediaPlay.reset();
        try {
            Timer timer = this._watchTimer;
            if (timer != null) {
                timer.cancel();
                this._watchTimer = null;
                this._watchTimertask = null;
            }
            this.mMediaPlay.release();
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
            }
        }
        this.mMediaPlay = null;
        this._durationMS = -1;
    }
}
