package io.agora.rtc2.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.voiceengine.WebRtcAudioUtils;
import io.agora.utils2.internal.Logging;
import java.util.Random;
import p153l.ta1;

/* JADX INFO: loaded from: classes2.dex */
public class AudioFocusManager {
    private static final String TAG = "AudioFocusManager";
    private AudioFocusChangeListenerImpl mAudioFocusChangeListenerImpl;
    private AudioManager mAudioManager;
    private AudioFocusRequest mFocusRequest;
    private Handler mHandler;

    @VisibleForTesting
    public class AudioFocusChangeListenerImpl implements AudioManager.OnAudioFocusChangeListener {
        public AudioFocusChangeListenerImpl() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Logging.m88105d(AudioFocusManager.TAG, "onAudioFocusChange and focusChange: " + i);
            if (i == -3 || i == -2 || i == -1) {
                AudioFocusManager.this.requestAudioFocus();
            }
        }
    }

    @CalledByNative
    public AudioFocusManager(Context context) {
        Logging.m88105d(TAG, " ctor()");
        this.mAudioFocusChangeListenerImpl = new AudioFocusChangeListenerImpl();
        HandlerThread handlerThread = new HandlerThread("AudioFocusManager-" + new Random().nextInt());
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        if (context != null) {
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
        }
    }

    @TargetApi(26)
    private boolean abandonAudioFocusOnOreoOrHigher() {
        AudioFocusRequest audioFocusRequest = this.mFocusRequest;
        return (audioFocusRequest != null ? this.mAudioManager.abandonAudioFocusRequest(audioFocusRequest) : 1) == 1;
    }

    @TargetApi(26)
    private boolean requestAudioFocusOnOreoOrHigher() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        if (this.mFocusRequest == null) {
            this.mFocusRequest = ta1.m189769a(3).setAudioAttributes(audioAttributesBuild).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.mAudioFocusChangeListenerImpl, this.mHandler).build();
        }
        return this.mAudioManager.requestAudioFocus(this.mFocusRequest) == 1;
    }

    @CalledByNative
    public synchronized boolean abandonAudioFocus() {
        String str = TAG;
        Logging.m88105d(str, "abandonAudioFocus()");
        if (this.mAudioManager == null) {
            Logging.m88113w(str, "abandonAudioFocus failed as audioManager is null");
            return false;
        }
        boolean zAbandonAudioFocusOnOreoOrHigher = WebRtcAudioUtils.runningOnOreoOrHigher() ? abandonAudioFocusOnOreoOrHigher() : abandonAudioFocusOnLowerThanOreo();
        Logging.m88105d(str, "abandonAudioFocus successful: " + zAbandonAudioFocusOnOreoOrHigher);
        return zAbandonAudioFocusOnOreoOrHigher;
    }

    @VisibleForTesting
    public boolean abandonAudioFocusOnLowerThanOreo() {
        return this.mAudioManager.abandonAudioFocus(this.mAudioFocusChangeListenerImpl) == 1;
    }

    @CalledByNative
    public void dispose() {
        Logging.m88105d(TAG, "dispose()");
        abandonAudioFocus();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.getLooper().quit();
            this.mHandler = null;
        }
        this.mAudioManager = null;
        this.mAudioFocusChangeListenerImpl = null;
    }

    @VisibleForTesting
    public AudioFocusChangeListenerImpl getAudioFocusChangeListenerImpl() {
        return this.mAudioFocusChangeListenerImpl;
    }

    @CalledByNative
    public synchronized boolean requestAudioFocus() {
        String str = TAG;
        Logging.m88105d(str, "requestAudioFocus()");
        if (this.mAudioManager == null) {
            Logging.m88113w(str, "requestAudioFocus failed as audioManager is null");
            return false;
        }
        boolean zRequestAudioFocusOnOreoOrHigher = WebRtcAudioUtils.runningOnOreoOrHigher() ? requestAudioFocusOnOreoOrHigher() : requestAudioFocusOnLowerThanOreo();
        Logging.m88105d(str, "requestAudioFocus successful: " + zRequestAudioFocusOnOreoOrHigher);
        return zRequestAudioFocusOnOreoOrHigher;
    }

    @VisibleForTesting
    public boolean requestAudioFocusOnLowerThanOreo() {
        return this.mAudioManager.requestAudioFocus(this.mAudioFocusChangeListenerImpl, 3, 3) == 1;
    }
}
