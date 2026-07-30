package com.momo.sabine;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class sabineSdk {
    private static volatile boolean mIsLibLoaded = false;
    private Object object = new Object();
    private boolean mIsOpened = false;
    public long mNativeContextData = 0;

    public sabineSdk() {
        loadLibrariesOnce();
    }

    private native void closeSabineEf();

    private static void loadLibrariesOnce() {
        synchronized (sabineSdk.class) {
            try {
                if (mIsLibLoaded) {
                    Log.e("sabine", "-----load sabineSdk repeat");
                    return;
                }
                try {
                    try {
                        Log.e("sabine", "-----load sabineSdk");
                        System.loadLibrary("sabineSdk");
                        Log.e("sabine", "-----load sabineSdk finish");
                        mIsLibLoaded = true;
                    } catch (Error unused) {
                        mIsLibLoaded = false;
                        Log.e("sabine", "-----load sabineSdk failed");
                    }
                } catch (Exception unused2) {
                    mIsLibLoaded = false;
                    Log.e("sabine", "-----load sabineSdk failed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void opensabineef(int i, int i2, int i3);

    private native void sabineef(ByteBuffer byteBuffer, int i, Object obj);

    private native void sabineeffect_ans(float f);

    private native void sabineeffect_peq_Shelving(int i, float f, float f2);

    private native void sabineeffect_peq_fliter(int i, float f, int i2);

    private native void sabineeffect_peq_peak(int i, float f, float f2, float f3);

    private native void sabineeffect_reverb(int i, float f);

    private native void sabineeffectreset();

    private native void sabineeffectreset_new();

    private native void sabineeffectset(int i, int i2, float f);

    public void SabineEffectReset_ex() {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffectreset_new();
        }
    }

    public void SabineEffectSet_ans(float f) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffect_ans(f);
        }
    }

    public void SabineEffectSet_peq_Shelving(int i, float f, float f2) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffect_peq_Shelving(i, f, f2);
        }
    }

    public void SabineEffectSet_peq_fliter(int i, float f, int i2) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffect_peq_fliter(i, f, i2);
        }
    }

    public void SabineEffectSet_peq_peak(int i, float f, float f2, float f3) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffect_peq_peak(i, f, f2, f3);
        }
    }

    public void SabineEffectSet_reverb(int i, float f) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineeffect_reverb(i, f);
        }
    }

    public boolean getSabineLoadedStaus() {
        Log.e("sabine", "-----getSabineLoadedStaus");
        return mIsLibLoaded;
    }

    public void sabineClose() {
        synchronized (this.object) {
            try {
                Log.e("sabine", "-----sabineClose:" + mIsLibLoaded + ";" + this.mIsOpened);
                if (mIsLibLoaded && this.mIsOpened) {
                    closeSabineEf();
                    this.mIsOpened = false;
                }
                Log.e("sabine", "-----sabineClose:end" + mIsLibLoaded + ";" + this.mIsOpened);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sabineEff(ByteBuffer byteBuffer, int i, Object obj) {
        if (mIsLibLoaded && this.mIsOpened) {
            sabineef(byteBuffer, i, obj);
        }
    }

    public void sabineOpen(int i, int i2, int i3) {
        synchronized (this.object) {
            try {
                Log.e("sabine", "-----sabineOpen:" + mIsLibLoaded + ";" + this.mIsOpened);
                this.mIsOpened = false;
                if (mIsLibLoaded) {
                    opensabineef(i, i2, i3);
                    this.mIsOpened = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sabineReset() {
        synchronized (this.object) {
            try {
                Log.e("sabine", "-----sabineReset:" + mIsLibLoaded + ";" + this.mIsOpened);
                if (mIsLibLoaded && this.mIsOpened) {
                    sabineeffectreset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sabineSet(int i, int i2, float f) {
        synchronized (this.object) {
            try {
                Log.e("sabine", "-----sabineSet:" + mIsLibLoaded + ";" + this.mIsOpened);
                if (mIsLibLoaded && this.mIsOpened) {
                    sabineeffectset(i, i2, f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
