package com.p051p1.mobile.android.media;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.PowerManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.ecj;
import p153l.hzd;
import p153l.jj5;
import p153l.l51;

/* JADX INFO: loaded from: classes8.dex */
public class AudioPlayer extends BroadcastReceiver implements SensorEventListener, Runnable {
    private static final float STANDARD_FAR_VALUE = 5.0f;
    public static final String TAG = "AudioPlayer";
    private final AudioManager audioManager;
    private final Context context;
    private Runnable errCallBack;
    private float farValue;
    private boolean headsetOn;
    private boolean isProximity;
    private MediaPlayer mediaPlayer;
    private final Sensor proximitySensor;
    boolean proximitySensorActivated;
    private final PowerManager.WakeLock proximityWakeLock;
    private final SensorManager sensorManager;
    int speakerOn;
    private C22507a<State> state;
    private String currentUri = null;
    private int pendingSeekTo = -1;
    private boolean needToPlayNext = false;

    public enum State {
        unknown,
        preparing,
        playing,
        stopped,
        finished
    }

    public AudioPlayer(Context context) {
        this.headsetOn = false;
        this.isProximity = false;
        C22507a<State> c22507aM222758b = C22507a.m222758b();
        this.state = c22507aM222758b;
        c22507aM222758b.onNext(State.stopped);
        this.farValue = 5.0f;
        this.speakerOn = 0;
        this.proximitySensorActivated = false;
        this.context = context;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.proximitySensor = defaultSensor;
        this.proximityWakeLock = defaultSensor != null ? createProximityWakeLock(powerManager) : null;
        if (defaultSensor != null) {
            float maximumRange = defaultSensor.getMaximumRange();
            this.farValue = maximumRange;
            if (maximumRange >= 4.5f && maximumRange <= 10.0f) {
                this.farValue = 5.0f;
            }
            if (hzd.m137887c() && this.farValue > 5.0f) {
                this.farValue = 5.0f;
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        jj5.m145018l(context, this, intentFilter);
        this.headsetOn = isHeadsetOn();
        this.isProximity = false;
        changeState();
    }

    private void acquireProximityWakeLock() {
        PowerManager.WakeLock wakeLock = this.proximityWakeLock;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        this.proximityWakeLock.acquire();
    }

    @SuppressLint({"InvalidWakeLockTag"})
    private PowerManager.WakeLock createProximityWakeLock(PowerManager powerManager) {
        return powerManager.newWakeLock(32, "AudioPlayer");
    }

    private boolean isHeadsetOn() {
        return this.audioManager.isWiredHeadsetOn() || this.audioManager.isBluetoothScoOn() || this.audioManager.isBluetoothA2dpOn();
    }

    private boolean isStarted() {
        State stateM222761e = this.state.m222761e();
        return stateM222761e == State.preparing || stateM222761e == State.playing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAndSeekTo$0(int i, MediaPlayer mediaPlayer) {
        if (i > 0) {
            this.mediaPlayer.seekTo(i);
            this.pendingSeekTo = -1;
        }
        changeState();
        this.mediaPlayer.start();
        onPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAndSeekTo$1(MediaPlayer mediaPlayer) {
        if (!this.needToPlayNext) {
            setScreenOn();
        }
        resetStateOnFinishOrStop();
        onFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$playAndSeekTo$2(String str, MediaPlayer mediaPlayer, int i, int i2) {
        CrashHelper.m82479c(new NullPointerException("audio except what = " + i + " extra = " + i2 + " uri = " + str));
        if (NullChecker.m82486a(this.errCallBack)) {
            this.errCallBack.run();
        }
        ecj.m120371E();
        return false;
    }

    private void onFinished() {
        C22507a<State> c22507a = this.state;
        State state = State.finished;
        c22507a.onNext(state);
        C4474a.m21730a().m21733d(state, this.currentUri);
    }

    private void onPlaying() {
        C22507a<State> c22507a = this.state;
        State state = State.playing;
        c22507a.onNext(state);
        C4474a.m21730a().m21733d(state, this.currentUri);
    }

    private void onPreparing() {
        C22507a<State> c22507a = this.state;
        State state = State.preparing;
        c22507a.onNext(state);
        C4474a.m21730a().m21733d(state, this.currentUri);
    }

    private void onStopped() {
        C22507a<State> c22507a = this.state;
        State state = State.stopped;
        c22507a.onNext(state);
        C4474a.m21730a().m21733d(state, this.currentUri);
    }

    private void playAndSeekTo(final String str, final int i) {
        if (str == null) {
            return;
        }
        this.currentUri = str;
        this.pendingSeekTo = i;
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null) {
                this.mediaPlayer = new MediaPlayer();
            } else {
                mediaPlayer.reset();
            }
            if (!this.isProximity || isHeadsetOn()) {
                if (hzd.m137885a()) {
                    this.audioManager.setMode(0);
                }
                setAudioStreamType(3);
            } else {
                if (hzd.m137885a()) {
                    this.audioManager.setMode(3);
                    this.mediaPlayer.setVolume(1.0f, 1.0f);
                }
                setAudioStreamType(0);
            }
            this.mediaPlayer.setDataSource(str);
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.tb1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f172824a.lambda$playAndSeekTo$0(i, mediaPlayer2);
                }
            });
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.ub1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    this.f178254a.lambda$playAndSeekTo$1(mediaPlayer2);
                }
            });
            this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.vb1
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i2, int i3) {
                    return this.f183180a.lambda$playAndSeekTo$2(str, mediaPlayer2, i2, i3);
                }
            });
            if (hzd.m137886b()) {
                l51.m152890J(this);
                l51.m152888H(this.context, this, 300L);
            } else {
                this.mediaPlayer.prepareAsync();
            }
            onPreparing();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            this.state.onError(e);
        }
    }

    private void replayAtCurrentPosition() {
        int iCurrentPosition = currentPosition();
        int duration = getDuration();
        String str = this.currentUri;
        resetMediaPlayerAndUri();
        if (duration < 10000) {
            playAndSeekTo(str, 0);
        } else if (iCurrentPosition < 5000) {
            playAndSeekTo(str, 0);
        } else {
            playAndSeekTo(str, iCurrentPosition - 5000);
        }
    }

    private void resetMediaPlayerAndUri() {
        if (hzd.m137885a()) {
            this.audioManager.setMode(0);
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mediaPlayer.reset();
        }
        this.currentUri = null;
    }

    private void setAudioStreamType(int i) {
        if (this.mediaPlayer != null) {
            Context context = this.context;
            if (context instanceof Activity) {
                ((Activity) context).setVolumeControlStream(i);
            }
            this.mediaPlayer.setAudioStreamType(i);
        }
    }

    public void activateProximitySensorAndDisplayLock() {
        if (this.proximitySensorActivated) {
            return;
        }
        this.proximitySensorActivated = true;
        Sensor sensor = this.proximitySensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 3);
        }
    }

    public void changeState() {
        boolean zIsHeadsetOn = isHeadsetOn();
        if (zIsHeadsetOn || this.currentUri == null) {
            setScreenOn();
            deactivateProximitySensorAndScreenLock();
        } else {
            activateProximitySensorAndDisplayLock();
        }
        this.audioManager.setWiredHeadsetOn(zIsHeadsetOn);
        if (zIsHeadsetOn || this.isProximity) {
            setSpeakerOn(false);
        } else {
            setSpeakerOn(true);
        }
    }

    public int currentPosition() {
        int i = this.pendingSeekTo;
        if (i != -1) {
            return i;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public void deactivateProximitySensorAndScreenLock() {
        if (this.proximitySensorActivated) {
            this.proximitySensorActivated = false;
            if (this.proximitySensor != null) {
                this.sensorManager.unregisterListener(this);
            }
        }
    }

    public void destroy() {
        stop();
        setSpeakerOn(false);
        this.context.unregisterReceiver(this);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public void finish() {
        resetStateOnFinishOrStop();
        onFinished();
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return -1;
    }

    public C22421c<State> obs() {
        return this.state.distinctUntilChanged();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "android.intent.action.HEADSET_PLUG":
            case "android.bluetooth.adapter.action.STATE_CHANGED":
            case "android.bluetooth.device.action.ACL_CONNECTED":
            case "android.bluetooth.device.action.ACL_DISCONNECTED":
                boolean zIsHeadsetOn = isHeadsetOn();
                if (this.headsetOn != zIsHeadsetOn) {
                    this.headsetOn = zIsHeadsetOn;
                    changeState();
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = sensorEvent.values[0] < this.farValue;
        if (this.isProximity == z) {
            return;
        }
        this.isProximity = z;
        if (isHeadsetOn() || !isStarted()) {
            return;
        }
        if (z) {
            changeState();
            replayAtCurrentPosition();
            acquireProximityWakeLock();
        } else {
            setScreenOn();
            changeState();
            replayAtCurrentPosition();
        }
    }

    public void play(String str) {
        playAndSeekTo(str, -1);
    }

    public void resetStateOnFinishOrStop() {
        setSpeakerOn(false);
        resetMediaPlayerAndUri();
        deactivateProximitySensorAndScreenLock();
        this.isProximity = false;
        this.pendingSeekTo = -1;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.prepareAsync();
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            this.state.onError(e);
        }
    }

    public void setError(Runnable runnable) {
        this.errCallBack = runnable;
    }

    public void setNeedToPlayNext(boolean z) {
        this.needToPlayNext = z;
    }

    public void setScreenOn() {
        PowerManager.WakeLock wakeLock;
        if (this.proximitySensorActivated && (wakeLock = this.proximityWakeLock) != null && wakeLock.isHeld()) {
            this.proximityWakeLock.release();
        }
    }

    public void setSpeakerOn(boolean z) {
        int i = z ? 1 : -1;
        if (i != this.speakerOn) {
            this.audioManager.setSpeakerphoneOn(i == 1);
            this.speakerOn = i;
        }
    }

    public void stop() {
        resetStateOnFinishOrStop();
        onStopped();
    }

    public void stopIfNotInProximityMode() {
        if (this.isProximity || !isStarted()) {
            return;
        }
        stop();
    }
}
