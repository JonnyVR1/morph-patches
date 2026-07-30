package com.immomo.mediacore.audio;

import com.immomo.mediabase.AudioResampleUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import p153l.l26;
import p153l.t9c;
import p153l.wfm;
import p153l.ylc0;

/* JADX INFO: loaded from: classes7.dex */
public class VadDetector {
    private static final String LOG_TAG = "VadDetector";
    private static volatile boolean mIsLibLoaded = false;
    private static wfm sLocalLibLoader = new wfm() { // from class: com.immomo.mediacore.audio.VadDetector.1
        @Override // p153l.wfm
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            ylc0.m216566a(l26.f129743a, str);
        }
    };
    private long mNativeVad = 0;
    private int remainLen = 0;
    private int detectDuration = 10;
    public final int DETECT_LEN = (10 * 48) * 2;
    public byte[] remainBuf = null;
    private boolean isVad = true;
    private AudioResampleUtils resampleUtils = null;
    private ByteBuffer remainBuffer = null;
    private int vadProcessCount = 0;
    private int preVadProcessCount = 0;
    private int vadMuteCount = 0;
    private int preVadMuteCount = 0;
    private int activecount = 0;
    private int hasMuteLevel = 0;
    private int denoiseLevel = 1;

    public VadDetector() {
        loadLibrariesOnce(null);
        if (mIsLibLoaded) {
            native_setup(new WeakReference(this));
        }
    }

    private native void initVad(int i);

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

    private native void native_setup(Object obj);

    private native void release();

    private native int vadProcess(ByteBuffer byteBuffer, int i);

    private native int vadProcesstmp(byte[] bArr, int i);

    public boolean adjustSabinLevel(int i) {
        if (mIsLibLoaded && i != -1) {
            int i2 = this.vadProcessCount + 1;
            this.vadProcessCount = i2;
            if (i == 0) {
                this.vadMuteCount++;
            }
            if (i2 > 0 && i2 % 500 == 0) {
                int i3 = this.vadMuteCount;
                float f = ((i3 - this.preVadMuteCount) * 1.0f) / (i2 - this.preVadProcessCount);
                this.preVadMuteCount = i3;
                this.preVadProcessCount = i2;
                if (f > 0.5f) {
                    this.hasMuteLevel++;
                    this.activecount = 0;
                } else {
                    int i4 = this.activecount + 1;
                    this.activecount = i4;
                    if (i4 >= 2) {
                        this.hasMuteLevel = 0;
                    } else {
                        int i5 = this.hasMuteLevel;
                        if (i5 > 0) {
                            this.hasMuteLevel = i5 - 1;
                        }
                    }
                }
                int i6 = this.hasMuteLevel;
                if (i6 > 0) {
                    if (i6 >= 2 && i6 <= 4) {
                        this.denoiseLevel = 2;
                    }
                    if (i6 > 4) {
                        this.denoiseLevel = 3;
                    }
                } else {
                    this.denoiseLevel = 1;
                }
                return true;
            }
        }
        return false;
    }

    public int getDenoiseLevel() {
        return this.denoiseLevel;
    }

    public void initVadDector(int i) {
        if (mIsLibLoaded) {
            initVad(i);
        }
    }

    public void releaseVad() {
        if (mIsLibLoaded) {
            release();
        }
    }

    public int vadDetect(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int iVadProcess = -1;
        if (!mIsLibLoaded || i < (i4 = this.DETECT_LEN)) {
            return -1;
        }
        if (this.remainBuffer == null) {
            this.remainBuffer = ByteBuffer.allocate(i4 * 2);
        }
        if (i2 == 2) {
            int length = bArr.length / 2;
            byte[] bArr2 = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                if (i5 % 2 == 0) {
                    System.arraycopy(bArr, i5 * 2, bArr2, i5, 2);
                }
            }
            bArr = bArr2;
        }
        if (i3 != 48000) {
            if (this.resampleUtils == null) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.resampleUtils = audioResampleUtils;
                audioResampleUtils.initResampleInfo(i3, 1, 16, 48000, 1, 16);
            }
            ByteBuffer byteBufferResamplePcmData = this.resampleUtils.resamplePcmData(bArr, bArr.length / 2);
            byte[] bArr3 = new byte[byteBufferResamplePcmData.limit()];
            byteBufferResamplePcmData.get(bArr3, 0, byteBufferResamplePcmData.limit());
            bArr = bArr3;
        }
        try {
            if (this.remainBuffer.capacity() < bArr.length) {
                return -1;
            }
            if (this.remainBuffer.remaining() < bArr.length) {
                this.remainBuffer.clear();
            }
            this.remainBuffer.put(bArr);
            this.remainBuffer.flip();
            this.remainBuffer.get(bArr, 0, this.DETECT_LEN);
            iVadProcess = vadProcess(ByteBuffer.wrap(bArr), this.DETECT_LEN / 2);
            this.remainBuffer.compact();
            return iVadProcess;
        } catch (IndexOutOfBoundsException unused) {
            return iVadProcess;
        }
    }
}
