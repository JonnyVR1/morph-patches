package com.immomo.mediacore.audio;

import android.util.Log;
import com.immomo.audioeffect.AudioEffect;
import com.momo.sabine.sabineSdk;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.C18372la;
import p153l.csx;
import p153l.l26;
import p153l.oxd0;
import p153l.t9c;
import p153l.wfm;
import p153l.ylc0;

/* JADX INFO: loaded from: classes7.dex */
public class AudioProcess implements AudioNcDynamic.AudioNcDynamicCallBack {
    private static final String LOG_TAG = "AudioProcess";
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;
    private static volatile boolean mIsSabineLibLoaded = false;
    private static wfm sLocalLibLoader = new wfm() { // from class: com.immomo.mediacore.audio.AudioProcess.1
        @Override // p153l.wfm
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            ylc0.m216566a(l26.f129743a, str);
        }
    };
    private boolean mOpenSabineEf;
    private sabineSdk mSabineSdk;
    private final int MIX_PROCESS = 1;
    private final int FINISH_ID = -12345;
    private LinkedBlockingQueue<oxd0> mAudioFrames = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<oxd0> mSurroundFrames = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<oxd0> mOutPutFrames = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<oxd0> mSurroundFrames_Extra = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<oxd0> mSurroundFrames_Extra2 = new LinkedBlockingQueue<>();
    private int mProcessMethod = 0;
    private AudioProcessRunnable mAudioProcessRunnable = new AudioProcessRunnable();
    private Thread mAudioProcessThread = null;
    private float mMasterAudioLecel = 1.0f;
    private float mSlaveAudioLecel = 1.0f;
    private float mMasterGain = 1.0f;
    private float mSlaveGain = 0.7f;
    double mUnifiedGain = Math.sqrt(2.0d) / 2.0d;
    public long mNativeAudioProcess = 0;
    private Ctrl_Params_Eq mParams_Eq = new Ctrl_Params_Eq();
    private Ctrl_Params_Eq mParams_Aef = new Ctrl_Params_Eq();
    private Ctrl_Params_Tune mParams_Tune = new Ctrl_Params_Tune();
    private boolean mEnableEQ = false;
    private boolean mEnableTune = false;
    private boolean mEnableAef = false;
    private boolean mIgnoreSabine = true;
    private final int DENOISE_MODE = 1;
    private final int REVERB_MODE = 2;
    private final int EQ_MODE = 3;
    private final int REVERB_VALUE = 1;
    private final int REVERB_DEPTH = 2;
    private final int REVERB_GAIN = 3;
    private final int REVERB_ECHO = 4;
    private final boolean mUseAudioProcess = true;
    private boolean mHavaRelease = true;
    private Object mSync = new Object();
    private int mFs = 44100;
    private int mChannal = 2;
    private int mLenMs = 1024;
    private boolean mSabineSplitSwitch = true;
    private boolean mEnableElcTune = false;
    private AudioEffect mElcEffect = null;
    private boolean mMuteFilterEnable = false;
    private boolean mUseSoxEffect = false;
    private float preDenoise = 0.1f;
    private int preInIdx = 2;
    private boolean useSabin = false;
    private volatile boolean mProcessing = false;
    private final int MALE_PITCH = -4;
    private final int FEMALE_PITCH = 6;
    private final int WAWA_PITCH = 9;
    private final int MINIONS = 7;
    private final int GIFT_ROBOOT = -4;

    public class AudioProcessRunnable implements Runnable {
        private AudioProcessRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (AudioProcess.this.mProcessing) {
                t9c.m189745c(AudioProcess.LOG_TAG, "mAudioFrames.take()");
                try {
                    oxd0 oxd0Var = (oxd0) AudioProcess.this.mAudioFrames.take();
                    long jM169688d = (oxd0Var == null || oxd0Var.f149638a == null) ? -12345L : oxd0Var.m169688d();
                    if (oxd0Var != null && oxd0Var.f149638a == null) {
                        AudioProcess.this.mProcessing = false;
                        return;
                    }
                    oxd0 mixedSurroundData = AudioProcess.this.getMixedSurroundData();
                    if (mixedSurroundData != null && mixedSurroundData.f149638a == null) {
                        AudioProcess.this.mProcessing = false;
                        return;
                    }
                    long jM169688d2 = mixedSurroundData.m169688d();
                    if (jM169688d == -12345 || jM169688d2 == -12345) {
                        t9c.m189745c(AudioProcess.LOG_TAG, "AudioProcessRunnable exit FINISH_ID");
                        AudioProcess.this.mProcessing = false;
                        return;
                    }
                    t9c.m189745c(AudioProcess.LOG_TAG, "outPutFrame = ByteBuffer.allocate");
                    ByteBuffer byteBufferNormalize_mix = AudioProcess.this.normalize_mix(oxd0Var.m169687c(), mixedSurroundData.m169687c(), oxd0Var.f149642e);
                    oxd0Var.m169690f();
                    mixedSurroundData.m169690f();
                    oxd0 oxd0Var2 = new oxd0(byteBufferNormalize_mix, jM169688d, 0);
                    try {
                        t9c.m189745c(AudioProcess.LOG_TAG, "AudioProcessRunnable offer begin");
                        AudioProcess.this.mOutPutFrames.offer(oxd0Var2);
                        t9c.m189745c(AudioProcess.LOG_TAG, "AudioProcessRunnable offer end");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException unused) {
                }
            }
            t9c.m189745c(AudioProcess.LOG_TAG, "AudioProcessRunnable exit");
        }

        public oxd0 take() {
            try {
                if (AudioProcess.this.mProcessing) {
                    return (oxd0) AudioProcess.this.mOutPutFrames.take();
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public AudioProcess() {
        this.mOpenSabineEf = false;
        this.mSabineSdk = null;
        C18372la.m153466b(null);
        initNativeOnce();
        processsound_native_setup(new WeakReference(this));
        this.mOpenSabineEf = false;
        if (this.mSabineSplitSwitch) {
            if (this.mSabineSdk == null) {
                this.mSabineSdk = new sabineSdk();
            }
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                mIsSabineLibLoaded = sabinesdk.getSabineLoadedStaus();
                if (!mIsSabineLibLoaded) {
                    this.mSabineSdk = null;
                }
            }
        } else {
            mIsSabineLibLoaded = mIsLibLoaded;
        }
        SabineEffectReset();
    }

    private short[] byteToShortArray(byte[] bArr, int i) {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            sArr[i2] = (short) (((bArr[i3 + 1] & 255) << 8) | (bArr[i3] & 255));
        }
        return sArr;
    }

    private static void initNativeOnce() {
        synchronized (AudioProcess.class) {
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

    private static void loadLibrariesOnce(wfm wfmVar) {
        synchronized (AudioProcess.class) {
            if (mIsLibLoaded) {
                t9c.m189745c(LOG_TAG, "load so already");
                return;
            }
            if (wfmVar == null) {
                wfmVar = sLocalLibLoader;
            }
            try {
                t9c.m189745c(LOG_TAG, "load so start");
                wfmVar.loadLibrary("ijkaudioprocess");
                mIsLibLoaded = true;
                t9c.m189745c(LOG_TAG, "load so success");
            } catch (Error unused) {
                mIsLibLoaded = false;
                t9c.m189745c(LOG_TAG, "load so failed");
            } catch (Exception unused2) {
                mIsLibLoaded = false;
                t9c.m189745c(LOG_TAG, "load so failed");
            }
        }
    }

    private static final native void native_init();

    private native void native_release();

    private final native void native_setup(Object obj) throws IllegalStateException;

    private void openSabineEfHandle() {
        if (this.mOpenSabineEf) {
            return;
        }
        try {
            if (mIsSabineLibLoaded) {
                processsound_opensabineef_H(this.mFs, this.mChannal, this.mLenMs);
            }
            this.mOpenSabineEf = true;
        } catch (Exception unused) {
        }
    }

    private native void processsound_aef(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2);

    private void processsound_aef_H(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2) {
        synchronized (this.mSync) {
            if (mIsLibLoaded && !this.mHavaRelease) {
                try {
                    processsound_aef(byteBuffer, i, obj, byteBuffer2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private native void processsound_ans(ByteBuffer byteBuffer, int i, Object obj);

    private void processsound_ans_H(ByteBuffer byteBuffer, int i, Object obj) {
        synchronized (this.mSync) {
            if (mIsLibLoaded && !this.mHavaRelease) {
                try {
                    processsound_ans(byteBuffer, i, obj);
                } catch (Exception unused) {
                }
            }
        }
    }

    private native void processsound_eq(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2);

    private void processsound_eq_H(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2) {
        synchronized (this.mSync) {
            if (!this.mHavaRelease) {
                try {
                    processsound_eq(byteBuffer, i, obj, byteBuffer2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private native void processsound_mix(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2);

    private void processsound_mix_H(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2) {
        synchronized (this.mSync) {
            if (mIsLibLoaded && !this.mHavaRelease) {
                try {
                    processsound_mix(byteBuffer, i, byteBuffer2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private final void processsound_native_release() {
        sabineSdk sabinesdk;
        synchronized (this.mSync) {
            try {
                if (mIsLibLoaded) {
                    try {
                        if (this.mSabineSplitSwitch && mIsSabineLibLoaded && (sabinesdk = this.mSabineSdk) != null) {
                            sabinesdk.sabineClose();
                        }
                        native_release();
                        this.mHavaRelease = true;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void processsound_native_setup(Object obj) {
        synchronized (this.mSync) {
            if (mIsLibLoaded) {
                try {
                    native_setup(obj);
                    this.mHavaRelease = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    private native void processsound_opensabineef(int i, int i2, int i3);

    private void processsound_opensabineef_H(int i, int i2, int i3) {
        synchronized (this.mSync) {
            try {
                if (!this.mHavaRelease) {
                    try {
                        t9c.m189745c(LOG_TAG, "open:samplerate=" + i + ";chanal=" + i2 + ";framLenMs=" + i3 + ";mSabineSdk=" + this.mSabineSdk);
                        if (this.mSabineSplitSwitch) {
                            sabineSdk sabinesdk = this.mSabineSdk;
                            if (sabinesdk != null) {
                                sabinesdk.sabineOpen(i, i2, i3);
                            }
                        } else {
                            processsound_opensabineef(i, i2, i3);
                        }
                        this.mSabineSdk.SabineEffectReset_ex();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void processsound_sabineef(ByteBuffer byteBuffer, int i, Object obj);

    private void processsound_sabineef_H(ByteBuffer byteBuffer, int i, Object obj) {
        synchronized (this.mSync) {
            try {
                if (mIsSabineLibLoaded && !this.mHavaRelease) {
                    try {
                        if (this.mSabineSplitSwitch) {
                            sabineSdk sabinesdk = this.mSabineSdk;
                            if (sabinesdk != null) {
                                sabinesdk.sabineEff(byteBuffer, i, obj);
                            }
                        } else {
                            processsound_sabineef(byteBuffer, i, obj);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void processsound_sabineeffectreset();

    private void processsound_sabineeffectreset_H() {
        synchronized (this.mSync) {
            try {
                if (mIsSabineLibLoaded && !this.mHavaRelease) {
                    try {
                        t9c.m189745c(LOG_TAG, "reset;mSabineSdk=" + this.mSabineSdk);
                        if (this.mSabineSplitSwitch) {
                            sabineSdk sabinesdk = this.mSabineSdk;
                            if (sabinesdk != null) {
                                sabinesdk.sabineReset();
                            }
                        } else {
                            processsound_sabineeffectreset();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void processsound_sabineeffectset(int i, int i2, float f);

    private void processsound_sabineeffectset_H(int i, int i2, float f) {
        synchronized (this.mSync) {
            try {
                if (mIsSabineLibLoaded && !this.mHavaRelease) {
                    try {
                        t9c.m189745c(LOG_TAG, "set:nMode=" + i + ";inIdx=" + i2 + ";inValue=" + f + ";mSabineSdk=" + this.mSabineSdk);
                        if (this.mSabineSplitSwitch) {
                            sabineSdk sabinesdk = this.mSabineSdk;
                            if (sabinesdk != null) {
                                sabinesdk.sabineSet(i, i2, f);
                            }
                        } else {
                            processsound_sabineeffectset(i, i2, f);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void processsound_tune(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2);

    private void processsound_tune_H(ByteBuffer byteBuffer, int i, Object obj, ByteBuffer byteBuffer2) {
        synchronized (this.mSync) {
            if (!this.mHavaRelease) {
                try {
                    processsound_tune(byteBuffer, i, obj, byteBuffer2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void sabineMcEQ() {
        SabineEffectSet_peq_fliter(0, 31.25f, 16);
        SabineEffectSet_peq_Shelving(1, 62.5f, 8.0f);
        SabineEffectSet_peq_peak(2, 125.0f, 2.0f, 8.0f);
        SabineEffectSet_peq_peak(3, 250.0f, 2.0f, 8.0f);
        SabineEffectSet_peq_peak(4, 500.0f, 2.0f, 8.0f);
        SabineEffectSet_peq_peak(5, 1000.0f, 2.0f, 8.0f);
        SabineEffectSet_peq_peak(6, 2000.0f, 2.0f, -8.0f);
        SabineEffectSet_peq_peak(7, 4000.0f, 2.0f, -8.0f);
        SabineEffectSet_peq_Shelving(8, 8000.0f, -8.0f);
        SabineEffectSet_peq_fliter(9, 16000.0f, 33);
    }

    private void safeProcesssound_sabineef(byte[] bArr, int i, Object obj) {
        if (csx.m112235R().m112270L0()) {
            return;
        }
        try {
            if (this.mIgnoreSabine || !mIsSabineLibLoaded) {
                return;
            }
            processsound_sabineef_H(ByteBuffer.wrap(bArr), i, null);
        } catch (Exception unused) {
        }
    }

    private void setDefaultEf() {
        SabineEffectSet(2, 1, 0.5f);
        SabineEffectSet(2, 2, 0.5f);
        SabineEffectSet(2, 3, 0.05f);
        SabineEffectSet(2, 4, 0.0f);
    }

    private void setIntangibleEf() {
        SabineEffectSet(2, 1, 0.28f);
        SabineEffectSet(2, 2, 0.56f);
        SabineEffectSet(2, 3, 0.89f);
        SabineEffectSet(2, 4, 0.23f);
    }

    private void setMelodiousEf() {
        SabineEffectSet(2, 1, 0.71f);
        SabineEffectSet(2, 2, 0.51f);
        SabineEffectSet(2, 3, 0.7f);
        SabineEffectSet(2, 4, 0.32f);
    }

    private void setMildEf() {
        SabineEffectSet(2, 1, 0.2f);
        SabineEffectSet(2, 2, 0.5f);
        SabineEffectSet(2, 3, 0.3f);
        SabineEffectSet(2, 4, 0.0f);
    }

    private void setPopEf() {
        SabineEffectSet(2, 1, 0.5f);
        SabineEffectSet(2, 2, 0.6f);
        SabineEffectSet(2, 3, 0.3f);
        SabineEffectSet(2, 4, 0.0f);
    }

    private void setProcessMethod(int i) {
        this.mProcessMethod = i;
        t9c.m189745c(LOG_TAG, "setmProcessMethod" + this.mProcessMethod);
    }

    private byte[] shortToByteArray(short s) {
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = (byte) ((s >>> (i * 8)) & 255);
        }
        return bArr;
    }

    public void SabineEffectReset() {
        try {
            if (!this.mOpenSabineEf) {
                openSabineEfHandle();
            }
            processsound_sabineeffectreset_H();
            if (csx.m112235R().m112270L0()) {
                SabineEffectSet(1, 0, 0.0f);
            } else {
                SabineEffectSet(1, 2, this.preDenoise);
            }
            SabineEffectSet(2, 3, 0.05f);
            SabineEffectSet(2, 4, 0.0f);
            SabineEffectSet(3, 0, 6.0f);
            SabineEffectSet(3, 1, 3.0f);
            SabineEffectSet(3, 2, -1.0f);
            SabineEffectSet(3, 3, -3.0f);
            SabineEffectSet(3, 4, 0.0f);
            SabineEffectSet(3, 5, 8.0f);
            SabineEffectSet(3, 6, 6.0f);
            this.mIgnoreSabine = false;
            AudioNcDynamic.getInstance().setAudioNcDynamicCallBack(this);
        } catch (Exception unused) {
        }
    }

    public void SabineEffectReset_ex() {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectReset_ex();
            }
        } catch (Exception unused) {
        }
    }

    public void SabineEffectSet(int i, int i2, float f) {
        if (i == 3 && f == 0.0f) {
            return;
        }
        if (!this.mOpenSabineEf) {
            openSabineEfHandle();
        }
        if (!csx.m112235R().m112400y0() || i == 1) {
            try {
                processsound_sabineeffectset_H(i, i2, f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mIgnoreSabine = false;
        }
    }

    public void SabineEffectSet_ans(float f) {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectSet_ans(f);
            }
        } catch (Exception unused) {
        }
    }

    public void SabineEffectSet_peq_Shelving(int i, float f, float f2) {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectSet_peq_Shelving(i, f, f2);
            }
        } catch (Exception unused) {
        }
    }

    public void SabineEffectSet_peq_fliter(int i, float f, int i2) {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectSet_peq_fliter(i, f, i2);
            }
        } catch (Exception unused) {
        }
    }

    public void SabineEffectSet_peq_peak(int i, float f, float f2, float f3) {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectSet_peq_peak(i, f, f2, f3);
            }
        } catch (Exception unused) {
        }
    }

    public void SabineEffectSet_reverb(int i, float f) {
        if (!mIsSabineLibLoaded || this.mHavaRelease) {
            return;
        }
        try {
            sabineSdk sabinesdk = this.mSabineSdk;
            if (sabinesdk != null) {
                sabinesdk.SabineEffectSet_reverb(i, f);
            }
        } catch (Exception unused) {
        }
    }

    public void adjustAef(int i, boolean z) {
        this.mEnableAef = z;
        this.mParams_Aef.sndMode = i;
    }

    public void adjustEQ(int i, boolean z) {
        this.mEnableEQ = z;
        this.mParams_Eq.sndMode = i;
    }

    public void adjustEf(int i, int i2) {
        if (!this.mOpenSabineEf) {
            openSabineEfHandle();
        }
        if (i != 0) {
            return;
        }
        if (i2 == 0) {
            setDefaultEf();
            return;
        }
        if (i2 == 1) {
            setMildEf();
            return;
        }
        if (i2 == 2) {
            setPopEf();
        } else if (i2 == 3) {
            setIntangibleEf();
        } else {
            if (i2 != 5) {
                return;
            }
            setMelodiousEf();
        }
    }

    public void adjustTune(int i, boolean z) {
        this.mEnableTune = z;
        this.mParams_Tune.pitch = i;
    }

    public void alsa_mix_16(short s, short s2, short s3) {
    }

    public void clear() {
        try {
            this.mAudioFrames.clear();
            this.mSurroundFrames.clear();
            this.mSurroundFrames_Extra.clear();
            this.mSurroundFrames_Extra2.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearSurroundExtraFrames() {
        try {
            this.mSurroundFrames_Extra.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearSurroundExtraFrames2() {
        try {
            this.mSurroundFrames_Extra2.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearSurroundFrames() {
        try {
            this.mSurroundFrames.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enableMuteFilter(boolean z) {
        this.mMuteFilterEnable = z;
    }

    public long getAudioFrames() {
        LinkedBlockingQueue<oxd0> linkedBlockingQueue = this.mAudioFrames;
        if (linkedBlockingQueue != null) {
            return ((long) linkedBlockingQueue.size()) * 1024;
        }
        return 0L;
    }

    public float getMasterAudioLevel() {
        return this.mMasterAudioLecel;
    }

    public oxd0 getMixedSurroundData() {
        oxd0 oxd0VarTake;
        if (this.mSurroundFrames.size() > 0) {
            try {
                oxd0VarTake = this.mSurroundFrames.take();
            } catch (InterruptedException unused) {
                oxd0VarTake = null;
            }
        } else {
            oxd0VarTake = null;
        }
        oxd0 surroundExtraData = getSurroundExtraData();
        if (oxd0VarTake == null || surroundExtraData == null) {
            if (oxd0VarTake != null) {
                return oxd0VarTake;
            }
            if (surroundExtraData != null) {
                return surroundExtraData;
            }
            return null;
        }
        if (oxd0VarTake.m169689e() == surroundExtraData.m169689e()) {
            return new oxd0(normalize_mix2(oxd0VarTake.m169687c(), surroundExtraData.m169687c(), oxd0VarTake.f149642e), oxd0VarTake.m169688d(), 0);
        }
        Log.e("HUOHL_AudioProcess", "getMixedSurroundData: Surround and  SurroundExtra data size not eaqule,drop frame, surround size:" + oxd0VarTake.m169689e() + ", Extra size: " + surroundExtraData.m169689e());
        return oxd0VarTake.m169689e() > surroundExtraData.m169689e() ? oxd0VarTake : surroundExtraData;
    }

    public float getSlaveAudioLevel() {
        return this.mSlaveAudioLecel;
    }

    public oxd0 getSurroundData() {
        try {
            return getMixedSurroundData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public oxd0 getSurroundExtraData() {
        try {
            oxd0 oxd0VarTake = this.mSurroundFrames_Extra.size() > 0 ? this.mSurroundFrames_Extra.take() : null;
            oxd0 oxd0VarTake2 = this.mSurroundFrames_Extra2.size() > 0 ? this.mSurroundFrames_Extra2.take() : null;
            if (oxd0VarTake != null && oxd0VarTake2 != null) {
                return new oxd0(normalize_mix2(oxd0VarTake.m169687c(), oxd0VarTake2.m169687c(), oxd0VarTake.f149642e), oxd0VarTake.m169688d(), oxd0VarTake.f149643f);
            }
            if (oxd0VarTake != null) {
                return oxd0VarTake;
            }
            if (oxd0VarTake2 != null) {
                return oxd0VarTake2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public oxd0 getSurroundExtraData2() {
        try {
            if (this.mSurroundFrames_Extra2.size() > 0) {
                return this.mSurroundFrames_Extra2.take();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getSurroundExtraFrameSize() {
        return this.mSurroundFrames_Extra.size();
    }

    public int getSurroundExtraFrameSize2() {
        return this.mSurroundFrames_Extra2.size();
    }

    public int getSurroundFrameSize() {
        return this.mSurroundFrames.size();
    }

    public ByteBuffer normalize_mix(byte[] bArr, byte[] bArr2, int i) {
        float f;
        float f2;
        float f3;
        if (bArr == null || bArr2 == null || i == 0) {
            t9c.m189745c(LOG_TAG, "normalize_mix:frameAudio=" + bArr + "; soundAudio=" + bArr2 + ";framelen=" + i);
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.clear();
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            float f4 = ((short) (((bArr[i4] << 8) & 65280) | (bArr[i3] & 255))) * this.mMasterGain * this.mMasterAudioLecel;
            float f5 = ((short) (((bArr2[i4] << 8) & 65280) | (bArr2[i3] & 255))) * this.mSlaveGain * this.mSlaveAudioLecel;
            if (f4 >= 0.0f || f5 >= 0.0f) {
                f = f4 + f5;
                f2 = f4 * f5;
                f3 = 32767.0f;
            } else {
                f = f4 + f5;
                f2 = f4 * f5;
                f3 = -32767.0f;
            }
            short s = (short) (f - (f2 / f3));
            bArr[i4] = (byte) ((s >> 8) & 255);
            bArr[i3] = (byte) (s & 255);
        }
        byteBufferAllocate.put(bArr, 0, i);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public ByteBuffer normalize_mix2(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        if (bArr == null || bArr2 == null || i == 0) {
            t9c.m189745c(LOG_TAG, "normalize_mix:frameAudio=" + bArr + "; soundAudio=" + bArr2 + ";framelen=" + i);
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.clear();
        for (int i4 = 0; i4 < i / 2; i4++) {
            int i5 = i4 * 2;
            int i6 = i5 + 1;
            short s = (short) (((bArr[i6] << 8) & 65280) | (bArr[i5] & 255));
            short s2 = (short) (((bArr2[i6] << 8) & 65280) | (bArr2[i5] & 255));
            if (s >= 0 || s2 >= 0) {
                i2 = s + s2;
                i3 = (s * s2) / 32767;
            } else {
                i2 = s + s2;
                i3 = (s * s2) / (-32767);
            }
            short s3 = (short) (i2 - i3);
            bArr[i6] = (byte) ((s3 >> 8) & 255);
            bArr[i5] = (byte) (s3 & 255);
        }
        byteBufferAllocate.put(bArr, 0, i);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public byte[] normalize_mixGame(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null || bArr2 == null || i == 0) {
            return null;
        }
        processAudioMix(bArr, i, bArr2);
        return bArr;
    }

    @Override // com.immomo.mediacore.audio.AudioNcDynamic.AudioNcDynamicCallBack
    public void onAudioDynamic(int i) {
        if (i > 60 && this.preDenoise != 0.2f) {
            this.preDenoise = 0.2f;
            this.preInIdx = 1;
        } else if (i > 40 && i <= 60 && this.preDenoise != 0.4f) {
            this.preDenoise = 0.4f;
            this.preInIdx = 1;
        } else {
            if (i > 40 || this.preDenoise == 0.6f) {
                return;
            }
            this.preDenoise = 0.6f;
            this.preInIdx = 1;
        }
        if (csx.m112235R().m112270L0()) {
            return;
        }
        SabineEffectSet(1, this.preInIdx, this.preDenoise);
        t9c.m189743a("AudioNcDynamic", "SabineEffectSet " + this.preInIdx + " / " + this.preDenoise);
    }

    public void openSabineEf(int i, int i2, int i3) {
        this.mFs = i;
        this.mChannal = i2;
        this.mLenMs = i3;
    }

    public byte[] processAudioData(byte[] bArr, int i) {
        AudioEffect audioEffect;
        if (this.mMuteFilterEnable) {
            return new byte[i];
        }
        safeProcesssound_sabineef(bArr, i, null);
        if (this.mEnableEQ || this.mEnableTune || this.mEnableAef || this.mEnableElcTune || this.mUseSoxEffect) {
            if (this.mEnableTune) {
                Ctrl_Params_Tune ctrl_Params_Tune = this.mParams_Tune;
                ctrl_Params_Tune.nChannels = this.mChannal;
                ctrl_Params_Tune.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_tune_H(ByteBuffer.wrap(bArr), i, this.mParams_Tune, ByteBuffer.wrap(bArr));
                }
            }
            if (this.mEnableEQ) {
                Ctrl_Params_Eq ctrl_Params_Eq = this.mParams_Eq;
                ctrl_Params_Eq.nChannels = this.mChannal;
                ctrl_Params_Eq.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_eq_H(ByteBuffer.wrap(bArr), i, this.mParams_Eq, ByteBuffer.wrap(bArr));
                }
            }
            if (this.mEnableAef) {
                Ctrl_Params_Eq ctrl_Params_Eq2 = this.mParams_Aef;
                ctrl_Params_Eq2.nChannels = this.mChannal;
                ctrl_Params_Eq2.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_aef_H(ByteBuffer.wrap(bArr), i, this.mParams_Aef, ByteBuffer.wrap(bArr));
                }
            }
            if (csx.m112235R().m112400y0() && (audioEffect = this.mElcEffect) != null) {
                return audioEffect.m19359d(bArr, bArr.length);
            }
        }
        return bArr;
    }

    public void processAudioMix(byte[] bArr, int i, byte[] bArr2) {
        try {
            if (mIsLibLoaded) {
                processsound_mix_H(ByteBuffer.wrap(bArr), i, ByteBuffer.wrap(bArr2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] processAudioPitch(byte[] bArr, int i, int i2) {
        Ctrl_Params_Tune ctrl_Params_Tune = new Ctrl_Params_Tune();
        ctrl_Params_Tune.nChannels = 2;
        ctrl_Params_Tune.rate = this.mFs;
        ctrl_Params_Tune.pitch = i2;
        if (mIsLibLoaded) {
            processsound_tune_H(ByteBuffer.wrap(bArr), i, ctrl_Params_Tune, ByteBuffer.wrap(bArr));
        }
        return bArr;
    }

    public byte[] processStereoAudioData(byte[] bArr, int i) {
        AudioEffect audioEffect;
        if (this.mMuteFilterEnable) {
            return new byte[i];
        }
        safeProcesssound_sabineef(bArr, i, null);
        if (this.mEnableEQ || this.mEnableTune || this.mEnableAef || this.mEnableElcTune || this.mUseSoxEffect) {
            if (this.mEnableTune) {
                Ctrl_Params_Tune ctrl_Params_Tune = this.mParams_Tune;
                ctrl_Params_Tune.nChannels = this.mChannal;
                ctrl_Params_Tune.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_tune_H(ByteBuffer.wrap(bArr), i, this.mParams_Tune, ByteBuffer.wrap(bArr));
                }
            }
            if (this.mEnableEQ) {
                Ctrl_Params_Eq ctrl_Params_Eq = this.mParams_Eq;
                ctrl_Params_Eq.nChannels = this.mChannal;
                ctrl_Params_Eq.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_eq_H(ByteBuffer.wrap(bArr), i, this.mParams_Eq, ByteBuffer.wrap(bArr));
                }
            }
            if (this.mEnableAef) {
                Ctrl_Params_Eq ctrl_Params_Eq2 = this.mParams_Aef;
                ctrl_Params_Eq2.nChannels = this.mChannal;
                ctrl_Params_Eq2.rate = this.mFs;
                if (mIsLibLoaded) {
                    processsound_aef_H(ByteBuffer.wrap(bArr), i, this.mParams_Aef, ByteBuffer.wrap(bArr));
                }
            }
            if (csx.m112235R().m112400y0() && (audioEffect = this.mElcEffect) != null) {
                return audioEffect.m19359d(bArr, i);
            }
        }
        return bArr;
    }

    public void putAudioData(oxd0 oxd0Var) {
        try {
            this.mAudioFrames.offer(oxd0Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void putSurroundData(oxd0 oxd0Var) {
        try {
            this.mSurroundFrames.offer(oxd0Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void putSurroundExtraData(oxd0 oxd0Var) {
        try {
            if (this.mSurroundFrames_Extra.size() >= 200) {
                this.mSurroundFrames_Extra.poll();
            }
            this.mSurroundFrames_Extra.offer(oxd0Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void putSurroundExtraData2(oxd0 oxd0Var) {
        try {
            if (this.mSurroundFrames_Extra2.size() >= 200) {
                this.mSurroundFrames_Extra2.poll();
            }
            this.mSurroundFrames_Extra2.offer(oxd0Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void release() {
        processsound_native_release();
        AudioEffect audioEffect = this.mElcEffect;
        if (audioEffect != null) {
            audioEffect.m19357b();
            this.mElcEffect = null;
        }
    }

    public void setAudioEffectType(int i) {
        switch (i) {
            case 0:
                this.mEnableElcTune = false;
                this.mEnableEQ = false;
                this.mEnableTune = false;
                this.mEnableAef = false;
                this.mMuteFilterEnable = false;
                break;
            case 1:
                adjustAef(1, true);
                break;
            case 2:
                adjustAef(2, true);
                break;
            case 3:
                adjustAef(3, true);
                break;
            case 4:
                adjustAef(4, true);
                break;
            case 5:
                adjustTune(-4, true);
                break;
            case 6:
                adjustTune(6, true);
                break;
            case 7:
                adjustTune(9, true);
                break;
            case 8:
                adjustTune(0, false);
                SabineEffectReset_ex();
                setElcEffect(false);
                sabineMcEQ();
                break;
            case 10:
                adjustTune(7, true);
                break;
            case 11:
                enableMuteFilter(true);
                break;
            case 12:
                adjustTune(-4, true);
                break;
        }
    }

    public void setElcEffect(boolean z) {
        this.mEnableElcTune = z;
    }

    public void setMasterAudioLevel(float f) {
        this.mMasterAudioLecel = f;
    }

    public void setMasterGain(float f) {
        this.mMasterGain = f;
    }

    public void setSabindenoiseLevel(int i) {
        if (csx.m112235R().m112270L0()) {
            return;
        }
        SabineEffectSet(1, 1, i * 0.2f);
    }

    public void setSlaveAudioGain(float f) {
        this.mSlaveGain = f;
    }

    public void setSlaveAudioLevel(float f) {
        this.mSlaveAudioLecel = f;
    }

    public void setSoundEffect(int i) {
        if (csx.m112235R().m112400y0()) {
            if (this.mElcEffect == null) {
                AudioEffect audioEffect = new AudioEffect();
                this.mElcEffect = audioEffect;
                audioEffect.m19360e(this.mFs, this.mChannal, this.mLenMs);
            }
            this.mElcEffect.m19361g(i);
            this.mUseSoxEffect = true;
        }
    }

    public void startAudioProcessding() {
        stopAudioProcessding();
        this.mProcessing = true;
        Thread thread = new Thread(this.mAudioProcessRunnable, "live-media-AudioPro");
        this.mAudioProcessThread = thread;
        thread.start();
        t9c.m189745c(LOG_TAG, "startAudioProcessding");
    }

    public void stopAudioProcessding() {
        t9c.m189745c(LOG_TAG, "stopAudioProcessding begin");
        if (this.mAudioProcessThread != null) {
            try {
                this.mProcessing = false;
                clear();
                putAudioData(new oxd0((byte[]) null, -12345L, this.mChannal));
                putSurroundData(new oxd0((byte[]) null, -12345L, this.mChannal));
                this.mAudioProcessThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.mAudioProcessThread = null;
        }
        t9c.m189745c(LOG_TAG, "stopAudioProcessding end");
    }

    public oxd0 take() {
        t9c.m189745c(LOG_TAG, "take");
        if (this.mAudioProcessThread != null) {
            return this.mAudioProcessRunnable.take();
        }
        return null;
    }
}
