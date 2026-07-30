package com.p069ss.bytertc.engine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.ma1;

/* JADX INFO: loaded from: classes13.dex */
public class AudioFocusManager {
    private boolean isAudioFocusLoss = false;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallback = new Application.ActivityLifecycleCallbacks() { // from class: com.ss.bytertc.engine.AudioFocusManager.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            AudioManager audioManager = AudioFocusManager.this.getAudioManager();
            if (!AudioFocusManager.this.isAudioFocusLoss || audioManager == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT < 26 ? audioManager.requestAudioFocus(AudioFocusManager.this.onAudioFocusChangeListener, 3, 1) : audioManager.requestAudioFocus(ma1.m153628a(1).setOnAudioFocusChangeListener(AudioFocusManager.this.onAudioFocusChangeListener).build())) == 1) {
                AudioFocusManager.this.mCallback.startMicrophone();
                AudioFocusManager.this.mCallback.startSpeakerphone();
            }
            AudioFocusManager.this.isAudioFocusLoss = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    };
    private AudioManager mAudioManager;
    private Callback mCallback;
    private Context mContext;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    public interface Callback {
        void higherVolume();

        void lowerVolume();

        void startMicrophone();

        void startSpeakerphone();

        void stopMicrophone();

        void stopSpeakerphone();
    }

    public AudioFocusManager(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(context) { // from class: com.ss.bytertc.engine.AudioFocusManager.1
            AudioManager audioManager;
            final /* synthetic */ Context val$context;

            {
                this.val$context = context;
                this.audioManager = (AudioManager) context.getSystemService("audio");
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                if (i == -2) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    return;
                }
                if (i == 1) {
                    AudioFocusManager.this.mCallback.higherVolume();
                    AudioFocusManager.this.mCallback.startSpeakerphone();
                    AudioFocusManager.this.mCallback.startMicrophone();
                } else if (i == -1) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    AudioFocusManager.this.releaseAudioFocus(true);
                } else if (i == -3) {
                    AudioFocusManager.this.mCallback.lowerVolume();
                }
            }
        };
        Context context2 = this.mContext;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio");
        }
        return this.mAudioManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioFocus(boolean z) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
            } else {
                audioManager.abandonAudioFocusRequest(ma1.m153628a(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = z;
        }
    }

    public void release() {
        Context context = this.mContext;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
        releaseAudioFocus();
    }

    public void requestAudioFocus() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                audioManager.requestAudioFocus(this.onAudioFocusChangeListener, 3, 1);
            } else {
                audioManager.requestAudioFocus(ma1.m153628a(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = false;
        }
    }

    public void releaseAudioFocus() {
        releaseAudioFocus(false);
    }
}
